package xsna;

import androidx.annotation.Nullable;

/* compiled from: NextFromHolder.java */
/* loaded from: classes3.dex */
public class s170 {

    @Nullable
    public volatile String a = "0";

    @Nullable
    public volatile String b = null;
    public da90 c = j5j.d;

    public final synchronized int a() {
        String b = b();
        if (b == null) {
            return 0;
        }
        try {
            return Integer.parseInt(b);
        } catch (Exception unused) {
            return 0;
        }
    }

    @Nullable
    public final synchronized String b() {
        return this.a;
    }

    public final synchronized void c(int i) {
        try {
            if (a() + this.c.a() >= i) {
                f(null);
            } else {
                e(a() + this.c.a());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d() {
        try {
            this.a = this.b != null ? this.b : "0";
            this.b = null;
            da90 da90Var = this.c;
            if (da90Var.a) {
                int i = da90Var.b - 1;
                da90Var.b = i;
                if (i < 0) {
                    da90Var.b = 0;
                }
            } else {
                da90Var.b++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e(int i) {
        f(String.valueOf(i));
    }

    public final synchronized void f(String str) {
        this.b = this.a;
        this.a = str;
        da90 da90Var = this.c;
        if (da90Var.a) {
            da90Var.b++;
        } else {
            int i = da90Var.b - 1;
            da90Var.b = i;
            if (i < 0) {
                da90Var.b = 0;
            }
        }
    }

    public void g() {
        this.c = new j5j(50);
    }
}
