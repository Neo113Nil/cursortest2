package xsna;

/* compiled from: DrawModifier.kt */
/* loaded from: classes11.dex */
final class mho extends d730<lho> {
    public final izs<oio, s3q0> a;

    /* JADX WARN: Multi-variable type inference failed */
    public mho(izs<? super oio, s3q0> izsVar) {
        this.a = izsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mho) {
            return this.a == ((mho) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.d730
    public final lho r() {
        lho lhoVar = new lho();
        lhoVar.p = this.a;
        return lhoVar;
    }

    @Override // xsna.d730
    public final void s(lho lhoVar) {
        lhoVar.p = this.a;
    }
}
