package xsna;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes8.dex */
public final class xvp0 extends fbd0<uvp0, vvp0, wvp0> {
    public static final xvp0 c = new xvp0(yvp0.a);

    @Override // xsna.rd
    public final int d(Object obj) {
        return ((vvp0) obj).b.length;
    }

    @Override // xsna.u4g, xsna.rd
    public final void f(ssi ssiVar, int i, Object obj) {
        wvp0 wvp0Var = (wvp0) obj;
        byte p = ssiVar.A(this.b, i).p();
        wvp0Var.b(wvp0Var.d() + 1);
        byte[] bArr = wvp0Var.a;
        int i2 = wvp0Var.b;
        wvp0Var.b = i2 + 1;
        bArr[i2] = p;
    }

    @Override // xsna.rd
    public final Object g(Object obj) {
        byte[] bArr = ((vvp0) obj).b;
        wvp0 wvp0Var = new wvp0();
        wvp0Var.a = bArr;
        wvp0Var.b = bArr.length;
        wvp0Var.b(10);
        return wvp0Var;
    }

    @Override // xsna.fbd0
    public final vvp0 j() {
        return new vvp0(new byte[0]);
    }

    @Override // xsna.fbd0
    public final void k(cti ctiVar, vvp0 vvp0Var, int i) {
        byte[] bArr = vvp0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ctiVar.D(this.b, i2).A(bArr[i2]);
        }
    }
}
