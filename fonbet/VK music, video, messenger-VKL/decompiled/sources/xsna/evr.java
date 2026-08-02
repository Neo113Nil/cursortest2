package xsna;

/* compiled from: FocusChangedModifier.kt */
/* loaded from: classes11.dex */
final class evr extends d730<gvr> {
    public final izs<xwr, s3q0> a;

    /* JADX WARN: Multi-variable type inference failed */
    public evr(izs<? super xwr, s3q0> izsVar) {
        this.a = izsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof evr) {
            return this.a == ((evr) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.d730
    public final gvr r() {
        gvr gvrVar = new gvr();
        gvrVar.p = this.a;
        return gvrVar;
    }

    @Override // xsna.d730
    public final void s(gvr gvrVar) {
        gvrVar.p = this.a;
    }
}
