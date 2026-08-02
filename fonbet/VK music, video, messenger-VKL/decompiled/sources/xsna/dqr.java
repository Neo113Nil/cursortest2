package xsna;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes8.dex */
public final class dqr extends fbd0<Float, float[], bqr> {
    public static final dqr c = new dqr(mqr.a);

    @Override // xsna.rd
    public final int d(Object obj) {
        return ((float[]) obj).length;
    }

    @Override // xsna.u4g, xsna.rd
    public final void f(ssi ssiVar, int i, Object obj) {
        bqr bqrVar = (bqr) obj;
        float n = ssiVar.n(this.b, i);
        bqrVar.b(bqrVar.d() + 1);
        float[] fArr = bqrVar.a;
        int i2 = bqrVar.b;
        bqrVar.b = i2 + 1;
        fArr[i2] = n;
    }

    @Override // xsna.rd
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        bqr bqrVar = new bqr();
        bqrVar.a = fArr;
        bqrVar.b = fArr.length;
        bqrVar.b(10);
        return bqrVar;
    }

    @Override // xsna.fbd0
    public final float[] j() {
        return new float[0];
    }

    @Override // xsna.fbd0
    public final void k(cti ctiVar, float[] fArr, int i) {
        float[] fArr2 = fArr;
        for (int i2 = 0; i2 < i; i2++) {
            ctiVar.w(this.b, i2, fArr2[i2]);
        }
    }
}
