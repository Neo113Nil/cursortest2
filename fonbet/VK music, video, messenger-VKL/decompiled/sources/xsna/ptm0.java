package xsna;

/* compiled from: PointerIcon.kt */
/* loaded from: classes11.dex */
public final class ptm0 extends d730<qtm0> {
    public final mb2 a = fsk.e;
    public final vco b;

    public ptm0(vco vcoVar) {
        this.b = vcoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptm0)) {
            return false;
        }
        ptm0 ptm0Var = (ptm0) obj;
        return epx.f(this.a, ptm0Var.a) && epx.f(this.b, ptm0Var.b);
    }

    public final int hashCode() {
        int b = qoy.b(this.a.b * 31, 31, false);
        vco vcoVar = this.b;
        return b + (vcoVar != null ? vcoVar.hashCode() : 0);
    }

    @Override // xsna.d730
    public final qtm0 r() {
        return new qtm0(this.a, this.b);
    }

    @Override // xsna.d730
    public final void s(qtm0 qtm0Var) {
        qtm0 qtm0Var2 = qtm0Var;
        ulb0 ulb0Var = qtm0Var2.q;
        mb2 mb2Var = this.a;
        if (!epx.f(ulb0Var, mb2Var)) {
            qtm0Var2.q = mb2Var;
            if (qtm0Var2.r) {
                qtm0Var2.k2();
            }
        }
        qtm0Var2.p = this.b;
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + this.a + ", overrideDescendants=false, touchBoundsExpansion=" + this.b + ')';
    }
}
