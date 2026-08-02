package xsna;

import android.util.Log;
import java.util.Locale;

/* compiled from: AndroidLogger.java */
/* loaded from: classes13.dex */
public final class ra2 {
    public static volatile ra2 c;
    public final y000 a;
    public boolean b = false;

    public ra2() {
        y000 y000Var;
        synchronized (y000.class) {
            try {
                if (y000.a == null) {
                    y000.a = new y000();
                }
                y000Var = y000.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = y000Var;
    }

    public static ra2 d() {
        if (c == null) {
            synchronized (ra2.class) {
                try {
                    if (c == null) {
                        c = new ra2();
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final void a() {
        if (this.b) {
            this.a.getClass();
        }
    }

    public final void b(String str, Object... objArr) {
        if (this.b) {
            String.format(Locale.ENGLISH, str, objArr);
            this.a.getClass();
        }
    }

    public final void c(String str, Object... objArr) {
        if (this.b) {
            String format = String.format(Locale.ENGLISH, str, objArr);
            this.a.getClass();
            Log.e("FirebasePerformance", format);
        }
    }

    public final void e() {
        if (this.b) {
            this.a.getClass();
        }
    }

    public final void f(String str, Object... objArr) {
        if (this.b) {
            String.format(Locale.ENGLISH, str, objArr);
            this.a.getClass();
        }
    }

    public final boolean g() {
        return this.b;
    }

    public final void h() {
        if (this.b) {
            this.a.getClass();
        }
    }

    public final void i(String str, Object... objArr) {
        if (this.b) {
            String.format(Locale.ENGLISH, str, objArr);
            this.a.getClass();
        }
    }
}
