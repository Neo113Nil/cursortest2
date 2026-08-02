package xsna;

/* compiled from: OnGloballyPositionedModifier.kt */
/* loaded from: classes11.dex */
final class i680 extends d730<k680> {
    public final izs<tny, s3q0> a;

    /* JADX WARN: Multi-variable type inference failed */
    public i680(izs<? super tny, s3q0> izsVar) {
        this.a = izsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i680) {
            return this.a == ((i680) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.d730
    public final k680 r() {
        k680 k680Var = new k680();
        k680Var.p = this.a;
        return k680Var;
    }

    @Override // xsna.d730
    public final void s(k680 k680Var) {
        k680Var.p = this.a;
    }
}
