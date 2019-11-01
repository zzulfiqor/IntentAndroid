package com.zzulfiqor.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView1, textView2, textView3;
    String nama,email,status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView1 = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.status);

        Intent i = getIntent();

        nama = i.getStringExtra("exnama");
        email = i.getStringExtra("email");
        status = i.getStringExtra("status");

        if(nama == null){
            nama = "NAMA LENGKAP";
        }

        if (email == null){
            email = "EMAIL DEFAULT";
        }

        if (status == null){
            status = "STATUS DEFAULT";
        }

        textView1.setText(nama);
        textView2.setText(email);
        textView3.setText(status);

    }
}
