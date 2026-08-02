package xsna;

/* compiled from: SkipContainer.kt */
/* loaded from: classes3.dex */
final class pzj0 extends d730<qzj0> {
    public final boolean a = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        pzj0 pzj0Var = obj instanceof pzj0 ? (pzj0) obj : null;
        return pzj0Var != null && this.a == pzj0Var.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    @Override // xsna.d730
    public final qzj0 r() {
        qzj0 qzj0Var = new qzj0();
        qzj0Var.p = this.a;
        return qzj0Var;
    }

    @Override // xsna.d730
    public final void s(qzj0 qzj0Var) {
        qzj0Var.p = this.a;
    }
}
