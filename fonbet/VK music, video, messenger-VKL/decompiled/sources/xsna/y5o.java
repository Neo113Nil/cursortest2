package xsna;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes8.dex */
public final class y5o extends fbd0<Double, double[], x5o> {
    public static final y5o c = new y5o(v6o.a);

    @Override // xsna.rd
    public final int d(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // xsna.u4g, xsna.rd
    public final void f(ssi ssiVar, int i, Object obj) {
        x5o x5oVar = (x5o) obj;
        double o = ssiVar.o(this.b, i);
        x5oVar.b(x5oVar.d() + 1);
        double[] dArr = x5oVar.a;
        int i2 = x5oVar.b;
        x5oVar.b = i2 + 1;
        dArr[i2] = o;
    }

    @Override // xsna.rd
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        x5o x5oVar = new x5o();
        x5oVar.a = dArr;
        x5oVar.b = dArr.length;
        x5oVar.b(10);
        return x5oVar;
    }

    @Override // xsna.fbd0
    public final double[] j() {
        return new double[0];
    }

    @Override // xsna.fbd0
    public final void k(cti ctiVar, double[] dArr, int i) {
        double[] dArr2 = dArr;
        for (int i2 = 0; i2 < i; i2++) {
            ctiVar.Q(this.b, i2, dArr2[i2]);
        }
    }
}
