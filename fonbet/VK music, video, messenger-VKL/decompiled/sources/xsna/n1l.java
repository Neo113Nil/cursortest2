package xsna;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import java.util.Calendar;

/* compiled from: DateTimeChooser.java */
/* loaded from: classes7.dex */
public final class n1l {
    public final TextView a;
    public final TextView b;
    public final AppCompatActivity c;
    public final Calendar d = Calendar.getInstance();
    public final boolean e = true;
    public final long f = 300000;
    public final long g = 2592000000L;
    public final String h;
    public final String i;

    public n1l(TextView textView, TextView textView2, AppCompatActivity appCompatActivity, String str, String str2) {
        this.a = textView;
        this.b = textView2;
        this.c = appCompatActivity;
        this.h = str;
        this.i = str2;
        FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        textView2.setOnClickListener(new j1l(0, this, supportFragmentManager));
        textView.setOnClickListener(new k1l(0, this, supportFragmentManager));
    }

    public final void a() {
        Calendar calendar = this.d;
        this.a.setText(pvo0.j(calendar.getTimeInMillis(), false, false));
        this.b.setText(String.format("%d:%02d", Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12))));
    }
}
