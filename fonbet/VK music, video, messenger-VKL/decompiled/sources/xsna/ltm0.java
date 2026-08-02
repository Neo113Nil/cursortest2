package xsna;

/* compiled from: StylusHandwriting.kt */
/* loaded from: classes11.dex */
final class ltm0 extends d730<ntm0> {
    public final gzs<s3q0> a;

    public ltm0(gzs<s3q0> gzsVar) {
        this.a = gzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ltm0) {
            return this.a == ((ltm0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.d730
    public final ntm0 r() {
        return new ntm0(this.a);
    }

    @Override // xsna.d730
    public final void s(ntm0 ntm0Var) {
        ntm0Var.r = this.a;
    }
}
