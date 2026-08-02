package xsna;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes11.dex */
public final class h4h0 {
    public final float a;
    public final long b;
    public final dtp0 c;

    public h4h0() {
        throw null;
    }

    public h4h0(long j, dtp0 dtp0Var) {
        this.a = 0.92f;
        this.b = j;
        this.c = dtp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4h0)) {
            return false;
        }
        h4h0 h4h0Var = (h4h0) obj;
        return Float.compare(this.a, h4h0Var.a) == 0 && lkp0.a(this.b, h4h0Var.b) && epx.f(this.c, h4h0Var.c);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.a) * 31;
        int i = lkp0.c;
        return this.c.hashCode() + bh10.a(hashCode, 31, this.b);
    }

    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + ((Object) lkp0.d(this.b)) + ", animationSpec=" + this.c + ')';
    }
}
