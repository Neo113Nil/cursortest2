package xsna;

/* compiled from: SemanticsModifier.kt */
/* loaded from: classes11.dex */
public final class shc extends d730<rtj> implements dgi0 {
    public final izs<tgi0, s3q0> a;

    /* JADX WARN: Multi-variable type inference failed */
    public shc(izs<? super tgi0, s3q0> izsVar) {
        this.a = izsVar;
    }

    @Override // xsna.dgi0
    public final xfi0 d() {
        xfi0 xfi0Var = new xfi0();
        xfi0Var.d = false;
        xfi0Var.e = true;
        this.a.invoke(xfi0Var);
        return xfi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof shc) {
            return this.a == ((shc) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.d730
    public final rtj r() {
        return new rtj(this.a, false, true);
    }

    @Override // xsna.d730
    public final void s(rtj rtjVar) {
        rtjVar.r = this.a;
    }
}
