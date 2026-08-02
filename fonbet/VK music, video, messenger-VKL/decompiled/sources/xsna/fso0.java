package xsna;

/* compiled from: Switch.kt */
/* loaded from: classes11.dex */
final class fso0 extends d730<oso0> {
    public final wax a;
    public final boolean b;
    public final phr<Float> c;

    public fso0(wax waxVar, boolean z, phr<Float> phrVar) {
        this.a = waxVar;
        this.b = z;
        this.c = phrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fso0)) {
            return false;
        }
        fso0 fso0Var = (fso0) obj;
        return epx.f(this.a, fso0Var.a) && this.b == fso0Var.b && epx.f(this.c, fso0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // xsna.d730
    public final oso0 r() {
        oso0 oso0Var = new oso0();
        oso0Var.p = this.a;
        oso0Var.q = this.b;
        oso0Var.r = this.c;
        oso0Var.v = Float.NaN;
        oso0Var.w = Float.NaN;
        return oso0Var;
    }

    @Override // xsna.d730
    public final void s(oso0 oso0Var) {
        oso0 oso0Var2 = oso0Var;
        oso0Var2.p = this.a;
        boolean z = oso0Var2.q;
        boolean z2 = this.b;
        if (z != z2) {
            itl.f(oso0Var2).Q();
        }
        oso0Var2.q = z2;
        oso0Var2.r = this.c;
        if (oso0Var2.u == null && !Float.isNaN(oso0Var2.w)) {
            oso0Var2.u = qf2.a(oso0Var2.w);
        }
        if (oso0Var2.t != null || Float.isNaN(oso0Var2.v)) {
            return;
        }
        oso0Var2.t = qf2.a(oso0Var2.v);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.a + ", checked=" + this.b + ", animationSpec=" + this.c + ')';
    }
}
