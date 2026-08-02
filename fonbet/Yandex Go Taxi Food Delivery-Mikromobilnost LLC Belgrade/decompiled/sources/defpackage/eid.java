package defpackage;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.play_billing.g;
import com.google.android.gms.internal.play_billing.g0;
import java.util.List;

/* loaded from: classes9.dex */
public class eid {
    public boolean a;
    public Object b;

    public eid(xrw xrwVar) {
        this.b = xrwVar;
        this.a = true;
    }

    public void a() {
        this.a = true;
    }

    public void b() {
        this.a = false;
    }

    public void c() {
        this.a = false;
    }

    public void d(byte b) {
        ((xrw) this.b).writeLong(b);
    }

    public void e(char c) {
        ((xrw) this.b).i(c);
    }

    public void f(int i) {
        ((xrw) this.b).writeLong(i);
    }

    public void g(long j) {
        ((xrw) this.b).writeLong(j);
    }

    public void h(String str) {
        ((xrw) this.b).l(str);
    }

    public void i(short s) {
        ((xrw) this.b).writeLong(s);
    }

    public void j(String str) {
        ((xrw) this.b).k(str);
    }

    public void k() {
    }

    public void l() {
    }

    public void m(g0 g0Var) {
        if (this.a) {
            int i = g.a;
            Log.isLoggable("BillingLogger", 5);
        } else {
            try {
                ((z211) this.b).b(jeo.f(g0Var));
            } catch (Throwable unused) {
                int i2 = g.a;
                Log.isLoggable("BillingLogger", 5);
            }
        }
    }

    public cna1 n(long j, String str) {
        Long valueOf = Long.valueOf(j);
        Object obj = cna1.g;
        return new cna1(this, str, valueOf, 0);
    }

    public cna1 o(String str, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Object obj = cna1.g;
        return new cna1(this, str, valueOf, 1);
    }

    public cna1 p(String str, String str2) {
        Object obj = cna1.g;
        return new cna1(this, str, str2, 3);
    }

    public eid(Uri uri, boolean z, boolean z2) {
        this.b = uri;
        this.a = z;
    }

    public eid(boolean z, List list) {
        this.a = z;
        this.b = list;
    }
}
