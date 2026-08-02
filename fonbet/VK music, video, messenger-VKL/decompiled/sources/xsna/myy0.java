package xsna;

import android.os.Handler;

/* loaded from: classes8.dex */
public final class myy0 {
    public final Handler a;
    public final Object b;
    public final zz9 c;

    public myy0(Handler handler, Object obj, zz9 zz9Var) {
        this.a = handler;
        this.b = obj;
        this.c = zz9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myy0)) {
            return false;
        }
        myy0 myy0Var = (myy0) obj;
        return this.a.equals(myy0Var.a) && this.b.equals(myy0Var.b) && this.c.equals(myy0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + vul0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ConcurrencyData(handler=" + this.a + ", lock=" + this.b + ", timeoutRunnable=" + this.c + ")";
    }
}
