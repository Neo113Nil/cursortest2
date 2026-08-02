package xsna;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes8.dex */
public final class ofj0 extends fbd0<Short, short[], nfj0> {
    public static final ofj0 c = new ofj0(qfj0.a);

    @Override // xsna.rd
    public final int d(Object obj) {
        return ((short[]) obj).length;
    }

    @Override // xsna.u4g, xsna.rd
    public final void f(ssi ssiVar, int i, Object obj) {
        nfj0 nfj0Var = (nfj0) obj;
        short z = ssiVar.z(this.b, i);
        nfj0Var.b(nfj0Var.d() + 1);
        short[] sArr = nfj0Var.a;
        int i2 = nfj0Var.b;
        nfj0Var.b = i2 + 1;
        sArr[i2] = z;
    }

    @Override // xsna.rd
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        nfj0 nfj0Var = new nfj0();
        nfj0Var.a = sArr;
        nfj0Var.b = sArr.length;
        nfj0Var.b(10);
        return nfj0Var;
    }

    @Override // xsna.fbd0
    public final short[] j() {
        return new short[0];
    }

    @Override // xsna.fbd0
    public final void k(cti ctiVar, short[] sArr, int i) {
        short[] sArr2 = sArr;
        for (int i2 = 0; i2 < i; i2++) {
            ctiVar.G(this.b, i2, sArr2[i2]);
        }
    }
}
