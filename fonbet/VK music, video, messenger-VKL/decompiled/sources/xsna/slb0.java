package xsna;

/* compiled from: PointerIcon.kt */
/* loaded from: classes11.dex */
public final class slb0 extends d730<tlb0> {
    public final mb2 a;

    public slb0(mb2 mb2Var) {
        this.a = mb2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof slb0) && epx.f(this.a, ((slb0) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    @Override // xsna.d730
    public final tlb0 r() {
        return new tlb0(this.a);
    }

    @Override // xsna.d730
    public final void s(tlb0 tlb0Var) {
        tlb0 tlb0Var2 = tlb0Var;
        ulb0 ulb0Var = tlb0Var2.q;
        mb2 mb2Var = this.a;
        if (epx.f(ulb0Var, mb2Var)) {
            return;
        }
        tlb0Var2.q = mb2Var;
        if (tlb0Var2.r) {
            tlb0Var2.k2();
        }
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.a + ", overrideDescendants=false)";
    }
}
