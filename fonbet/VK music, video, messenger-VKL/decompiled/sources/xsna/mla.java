package xsna;

import android.os.SystemClock;

/* compiled from: Cause.kt */
/* loaded from: classes.dex */
public final class mla {
    public final bpn0 a;
    public final int b;
    public final String c;
    public final String d;
    public final Object e;
    public final long f = SystemClock.uptimeMillis();

    public mla(bpn0 bpn0Var, int i, String str, String str2, Object obj) {
        this.a = bpn0Var;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = obj;
    }

    public final mla a() {
        Object obj = this.e;
        isx0 isx0Var = obj instanceof isx0 ? (isx0) obj : null;
        if (isx0Var != null) {
            return isx0Var.b();
        }
        return null;
    }

    public final Throwable b() {
        return (Throwable) this.a.getValue();
    }

    public final String toString() {
        mla a = a();
        String str = this.c;
        Object obj = this.e;
        if (a == null) {
            return obj + ':' + str;
        }
        return obj + ':' + str + "\n\tcaused by " + a();
    }
}
