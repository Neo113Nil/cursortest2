package xsna;

/* compiled from: OnPlacedModifier.kt */
/* loaded from: classes11.dex */
final class ba80 extends d730<da80> {
    public final izs<tny, s3q0> a;

    /* JADX WARN: Multi-variable type inference failed */
    public ba80(izs<? super tny, s3q0> izsVar) {
        this.a = izsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ba80) {
            return this.a == ((ba80) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.d730
    public final da80 r() {
        da80 da80Var = new da80();
        da80Var.p = this.a;
        return da80Var;
    }

    @Override // xsna.d730
    public final void s(da80 da80Var) {
        da80Var.p = this.a;
    }
}
