package xsna;

/* compiled from: TimeMarkMicrosecondsSpan.kt */
/* loaded from: classes.dex */
public final class wto0 {
    public final vto0 a;
    public final vto0 b;

    public wto0() {
        this(0);
    }

    public final Long a() {
        return this.b.d(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wto0)) {
            return false;
        }
        wto0 wto0Var = (wto0) obj;
        return epx.f(this.a, wto0Var.a) && epx.f(this.b, wto0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TimeMarkMicrosecondsSpan(start=" + this.a + ", end=" + this.b + ')';
    }

    public wto0(vto0 vto0Var, vto0 vto0Var2) {
        this.a = vto0Var;
        this.b = vto0Var2;
    }

    public /* synthetic */ wto0(int i) {
        this(new vto0(), new vto0());
    }
}
