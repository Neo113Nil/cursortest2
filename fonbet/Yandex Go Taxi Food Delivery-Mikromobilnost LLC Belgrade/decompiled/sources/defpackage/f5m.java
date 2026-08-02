package defpackage;

/* loaded from: classes9.dex */
public final class f5m extends d2f0 {
    public static final f5m c = new f5m(e6m.a);

    @Override // defpackage.a7
    public final int d(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // defpackage.jcc, defpackage.a7
    public final void f(sjd sjdVar, int i, Object obj) {
        ((b5m) obj).e(sjdVar.E(this.b, i));
    }

    @Override // defpackage.a7
    public final Object g(Object obj) {
        return new b5m((double[]) obj);
    }

    @Override // defpackage.d2f0
    public final Object j() {
        return new double[0];
    }

    @Override // defpackage.d2f0
    public final void k(yjd yjdVar, Object obj, int i) {
        double[] dArr = (double[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            yjdVar.E(this.b, i2, dArr[i2]);
        }
    }
}
