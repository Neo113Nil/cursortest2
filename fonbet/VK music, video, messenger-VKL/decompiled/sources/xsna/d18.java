package xsna;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes8.dex */
public final class d18 extends fbd0<Boolean, boolean[], c18> {
    public static final d18 c = new d18(g18.a);

    @Override // xsna.rd
    public final int d(Object obj) {
        return ((boolean[]) obj).length;
    }

    @Override // xsna.u4g, xsna.rd
    public final void f(ssi ssiVar, int i, Object obj) {
        c18 c18Var = (c18) obj;
        boolean F = ssiVar.F(this.b, i);
        c18Var.b(c18Var.d() + 1);
        boolean[] zArr = c18Var.a;
        int i2 = c18Var.b;
        c18Var.b = i2 + 1;
        zArr[i2] = F;
    }

    @Override // xsna.rd
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        c18 c18Var = new c18();
        c18Var.a = zArr;
        c18Var.b = zArr.length;
        c18Var.b(10);
        return c18Var;
    }

    @Override // xsna.fbd0
    public final boolean[] j() {
        return new boolean[0];
    }

    @Override // xsna.fbd0
    public final void k(cti ctiVar, boolean[] zArr, int i) {
        boolean[] zArr2 = zArr;
        for (int i2 = 0; i2 < i; i2++) {
            ctiVar.l(this.b, i2, zArr2[i2]);
        }
    }
}
