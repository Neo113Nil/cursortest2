package xsna;

/* compiled from: SemanticsModifier.kt */
/* loaded from: classes11.dex */
public final class yc3 extends d730<rtj> implements dgi0 {
    public final boolean a;
    public final izs<tgi0, s3q0> b;

    public yc3(izs izsVar, boolean z) {
        this.a = z;
        this.b = izsVar;
    }

    @Override // xsna.dgi0
    public final xfi0 d() {
        xfi0 xfi0Var = new xfi0();
        xfi0Var.d = this.a;
        this.b.invoke(xfi0Var);
        return xfi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc3)) {
            return false;
        }
        yc3 yc3Var = (yc3) obj;
        return this.a == yc3Var.a && this.b == yc3Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    @Override // xsna.d730
    public final rtj r() {
        return new rtj(this.b, this.a, false);
    }

    @Override // xsna.d730
    public final void s(rtj rtjVar) {
        rtj rtjVar2 = rtjVar;
        rtjVar2.p = this.a;
        rtjVar2.r = this.b;
    }
}
