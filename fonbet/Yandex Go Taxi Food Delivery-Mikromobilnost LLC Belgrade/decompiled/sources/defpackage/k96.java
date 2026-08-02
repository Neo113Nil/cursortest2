package defpackage;

/* loaded from: classes9.dex */
public final class k96 extends d2f0 {
    public static final k96 c = new k96(z96.a);

    @Override // defpackage.a7
    public final int d(Object obj) {
        return ((boolean[]) obj).length;
    }

    @Override // defpackage.jcc, defpackage.a7
    public final void f(sjd sjdVar, int i, Object obj) {
        ((g96) obj).e(sjdVar.C(this.b, i));
    }

    @Override // defpackage.a7
    public final Object g(Object obj) {
        return new g96((boolean[]) obj);
    }

    @Override // defpackage.d2f0
    public final Object j() {
        return new boolean[0];
    }

    @Override // defpackage.d2f0
    public final void k(yjd yjdVar, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            yjdVar.n(this.b, i2, zArr[i2]);
        }
    }
}
