package xsna;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes8.dex */
public final class yxp0 extends fbd0<vxp0, wxp0, xxp0> {
    public static final yxp0 c = new yxp0(zxp0.a);

    @Override // xsna.rd
    public final int d(Object obj) {
        return ((wxp0) obj).b.length;
    }

    @Override // xsna.u4g, xsna.rd
    public final void f(ssi ssiVar, int i, Object obj) {
        xxp0 xxp0Var = (xxp0) obj;
        short v = ssiVar.A(this.b, i).v();
        xxp0Var.b(xxp0Var.d() + 1);
        short[] sArr = xxp0Var.a;
        int i2 = xxp0Var.b;
        xxp0Var.b = i2 + 1;
        sArr[i2] = v;
    }

    @Override // xsna.rd
    public final Object g(Object obj) {
        short[] sArr = ((wxp0) obj).b;
        xxp0 xxp0Var = new xxp0();
        xxp0Var.a = sArr;
        xxp0Var.b = sArr.length;
        xxp0Var.b(10);
        return xxp0Var;
    }

    @Override // xsna.fbd0
    public final wxp0 j() {
        return new wxp0(new short[0]);
    }

    @Override // xsna.fbd0
    public final void k(cti ctiVar, wxp0 wxp0Var, int i) {
        short[] sArr = wxp0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ctiVar.D(this.b, i2).j(sArr[i2]);
        }
    }
}
