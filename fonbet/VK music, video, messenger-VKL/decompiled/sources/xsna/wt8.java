package xsna;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes8.dex */
public final class wt8 extends fbd0<Byte, byte[], ot8> {
    public static final wt8 c = new wt8(iu8.a);

    @Override // xsna.rd
    public final int d(Object obj) {
        return ((byte[]) obj).length;
    }

    @Override // xsna.u4g, xsna.rd
    public final void f(ssi ssiVar, int i, Object obj) {
        ot8 ot8Var = (ot8) obj;
        byte k = ssiVar.k(this.b, i);
        ot8Var.b(ot8Var.d() + 1);
        byte[] bArr = ot8Var.a;
        int i2 = ot8Var.b;
        ot8Var.b = i2 + 1;
        bArr[i2] = k;
    }

    @Override // xsna.rd
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        ot8 ot8Var = new ot8();
        ot8Var.a = bArr;
        ot8Var.b = bArr.length;
        ot8Var.b(10);
        return ot8Var;
    }

    @Override // xsna.fbd0
    public final byte[] j() {
        return new byte[0];
    }

    @Override // xsna.fbd0
    public final void k(cti ctiVar, byte[] bArr, int i) {
        byte[] bArr2 = bArr;
        for (int i2 = 0; i2 < i; i2++) {
            ctiVar.p(this.b, i2, bArr2[i2]);
        }
    }
}
