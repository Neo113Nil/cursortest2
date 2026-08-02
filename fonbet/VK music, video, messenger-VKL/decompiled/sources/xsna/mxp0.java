package xsna;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes8.dex */
public final class mxp0 extends fbd0<jxp0, kxp0, lxp0> {
    public static final mxp0 c = new mxp0(nxp0.a);

    @Override // xsna.rd
    public final int d(Object obj) {
        return ((kxp0) obj).b.length;
    }

    @Override // xsna.u4g, xsna.rd
    public final void f(ssi ssiVar, int i, Object obj) {
        lxp0 lxp0Var = (lxp0) obj;
        int B = ssiVar.A(this.b, i).B();
        lxp0Var.b(lxp0Var.d() + 1);
        int[] iArr = lxp0Var.a;
        int i2 = lxp0Var.b;
        lxp0Var.b = i2 + 1;
        iArr[i2] = B;
    }

    @Override // xsna.rd
    public final Object g(Object obj) {
        int[] iArr = ((kxp0) obj).b;
        lxp0 lxp0Var = new lxp0();
        lxp0Var.a = iArr;
        lxp0Var.b = iArr.length;
        lxp0Var.b(10);
        return lxp0Var;
    }

    @Override // xsna.fbd0
    public final kxp0 j() {
        return new kxp0(new int[0]);
    }

    @Override // xsna.fbd0
    public final void k(cti ctiVar, kxp0 kxp0Var, int i) {
        int[] iArr = kxp0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ctiVar.D(this.b, i2).o(iArr[i2]);
        }
    }
}
