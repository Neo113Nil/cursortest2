package xsna;

/* compiled from: AnimationModifier.kt */
/* loaded from: classes11.dex */
final class nxj0 extends d730<oxj0> {
    public final phr<q9x> a;
    public final dt1 b;

    public nxj0(phr phrVar, dt1 dt1Var) {
        this.a = phrVar;
        this.b = dt1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nxj0)) {
            return false;
        }
        nxj0 nxj0Var = (nxj0) obj;
        return epx.f(nxj0Var.a, this.a) && epx.f(nxj0Var.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
    }

    @Override // xsna.d730
    public final oxj0 r() {
        return new oxj0(this.a, this.b);
    }

    @Override // xsna.d730
    public final void s(oxj0 oxj0Var) {
        oxj0 oxj0Var2 = oxj0Var;
        oxj0Var2.p = this.a;
        oxj0Var2.q = this.b;
    }
}
