package xsna;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes8.dex */
public final class rxp0 extends fbd0<oxp0, pxp0, qxp0> {
    public static final rxp0 c = new rxp0(sxp0.a);

    @Override // xsna.rd
    public final int d(Object obj) {
        return ((pxp0) obj).b.length;
    }

    @Override // xsna.u4g, xsna.rd
    public final void f(ssi ssiVar, int i, Object obj) {
        qxp0 qxp0Var = (qxp0) obj;
        long t = ssiVar.A(this.b, i).t();
        qxp0Var.b(qxp0Var.d() + 1);
        long[] jArr = qxp0Var.a;
        int i2 = qxp0Var.b;
        qxp0Var.b = i2 + 1;
        jArr[i2] = t;
    }

    @Override // xsna.rd
    public final Object g(Object obj) {
        long[] jArr = ((pxp0) obj).b;
        qxp0 qxp0Var = new qxp0();
        qxp0Var.a = jArr;
        qxp0Var.b = jArr.length;
        qxp0Var.b(10);
        return qxp0Var;
    }

    @Override // xsna.fbd0
    public final pxp0 j() {
        return new pxp0(new long[0]);
    }

    @Override // xsna.fbd0
    public final void k(cti ctiVar, pxp0 pxp0Var, int i) {
        long[] jArr = pxp0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ctiVar.D(this.b, i2).u(jArr[i2]);
        }
    }
}
