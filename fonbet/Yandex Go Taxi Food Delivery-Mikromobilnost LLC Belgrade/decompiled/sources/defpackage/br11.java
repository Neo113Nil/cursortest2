package defpackage;

/* loaded from: classes9.dex */
public final class br11 extends d2f0 {
    public static final br11 c = new br11(cr11.a);

    @Override // defpackage.a7
    public final int d(Object obj) {
        return ((zq11) obj).a.length;
    }

    @Override // defpackage.jcc, defpackage.a7
    public final void f(sjd sjdVar, int i, Object obj) {
        ((ar11) obj).e(sjdVar.e(this.b, i).j());
    }

    @Override // defpackage.a7
    public final Object g(Object obj) {
        return new ar11(((zq11) obj).a);
    }

    @Override // defpackage.d2f0
    public final Object j() {
        return new zq11(new long[0]);
    }

    @Override // defpackage.d2f0
    public final void k(yjd yjdVar, Object obj, int i) {
        long[] jArr = ((zq11) obj).a;
        for (int i2 = 0; i2 < i; i2++) {
            yjdVar.x(this.b, i2).w(jArr[i2]);
        }
    }
}
