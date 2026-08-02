package xsna;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes8.dex */
public final class d300 extends fbd0<Long, long[], b300> {
    public static final d300 c = new d300(u500.a);

    @Override // xsna.rd
    public final int d(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // xsna.u4g, xsna.rd
    public final void f(ssi ssiVar, int i, Object obj) {
        b300 b300Var = (b300) obj;
        long r = ssiVar.r(this.b, i);
        b300Var.b(b300Var.d() + 1);
        long[] jArr = b300Var.a;
        int i2 = b300Var.b;
        b300Var.b = i2 + 1;
        jArr[i2] = r;
    }

    @Override // xsna.rd
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        b300 b300Var = new b300();
        b300Var.a = jArr;
        b300Var.b = jArr.length;
        b300Var.b(10);
        return b300Var;
    }

    @Override // xsna.fbd0
    public final long[] j() {
        return new long[0];
    }

    @Override // xsna.fbd0
    public final void k(cti ctiVar, long[] jArr, int i) {
        long[] jArr2 = jArr;
        for (int i2 = 0; i2 < i; i2++) {
            ctiVar.q(this.b, i2, jArr2[i2]);
        }
    }
}
