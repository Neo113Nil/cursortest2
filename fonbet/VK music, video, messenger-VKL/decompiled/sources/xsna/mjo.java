package xsna;

/* compiled from: DrawModifier.kt */
/* loaded from: classes11.dex */
final class mjo extends d730<njo> {
    public final izs<ggj, s3q0> a;

    /* JADX WARN: Multi-variable type inference failed */
    public mjo(izs<? super ggj, s3q0> izsVar) {
        this.a = izsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mjo) {
            return this.a == ((mjo) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.d730
    public final njo r() {
        njo njoVar = new njo();
        njoVar.p = this.a;
        return njoVar;
    }

    @Override // xsna.d730
    public final void s(njo njoVar) {
        njoVar.p = this.a;
    }
}
