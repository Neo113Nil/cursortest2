package xsna;

/* compiled from: WeightRange.kt */
/* loaded from: classes18.dex */
public final class ikx0 {
    public final gkx0 a;
    public final gkx0 b;

    public ikx0(gkx0 gkx0Var, gkx0 gkx0Var2) {
        this.a = gkx0Var;
        this.b = gkx0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikx0)) {
            return false;
        }
        ikx0 ikx0Var = (ikx0) obj;
        return epx.f(this.a, ikx0Var.a) && epx.f(this.b, ikx0Var.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b) + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        return "WeightRange(since=" + this.a + ", till=" + this.b + ')';
    }

    public ikx0() {
        this(gkx0.d, gkx0.e);
    }
}
