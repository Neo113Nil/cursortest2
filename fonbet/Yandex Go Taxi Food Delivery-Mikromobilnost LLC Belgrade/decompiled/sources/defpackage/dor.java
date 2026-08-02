package defpackage;

/* loaded from: classes9.dex */
public final class dor extends d2f0 {
    public static final dor c = new dor(nor.a);

    @Override // defpackage.a7
    public final int d(Object obj) {
        return ((float[]) obj).length;
    }

    @Override // defpackage.jcc, defpackage.a7
    public final void f(sjd sjdVar, int i, Object obj) {
        ((znr) obj).e(sjdVar.y(this.b, i));
    }

    @Override // defpackage.a7
    public final Object g(Object obj) {
        return new znr((float[]) obj);
    }

    @Override // defpackage.d2f0
    public final Object j() {
        return new float[0];
    }

    @Override // defpackage.d2f0
    public final void k(yjd yjdVar, Object obj, int i) {
        float[] fArr = (float[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            yjdVar.z(this.b, i2, fArr[i2]);
        }
    }
}
