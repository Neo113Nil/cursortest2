package xsna;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes8.dex */
public final class u8x extends fbd0<Integer, int[], t8x> {
    public static final u8x c = new u8x(n9x.a);

    @Override // xsna.rd
    public final int d(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // xsna.u4g, xsna.rd
    public final void f(ssi ssiVar, int i, Object obj) {
        t8x t8xVar = (t8x) obj;
        int s = ssiVar.s(this.b, i);
        t8xVar.b(t8xVar.d() + 1);
        int[] iArr = t8xVar.a;
        int i2 = t8xVar.b;
        t8xVar.b = i2 + 1;
        iArr[i2] = s;
    }

    @Override // xsna.rd
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        t8x t8xVar = new t8x();
        t8xVar.a = iArr;
        t8xVar.b = iArr.length;
        t8xVar.b(10);
        return t8xVar;
    }

    @Override // xsna.fbd0
    public final int[] j() {
        return new int[0];
    }

    @Override // xsna.fbd0
    public final void k(cti ctiVar, int[] iArr, int i) {
        int[] iArr2 = iArr;
        for (int i2 = 0; i2 < i; i2++) {
            ctiVar.M(i2, iArr2[i2], this.b);
        }
    }
}
