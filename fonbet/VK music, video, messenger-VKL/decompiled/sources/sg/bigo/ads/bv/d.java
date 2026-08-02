package sg.bigo.ads.bv;

/* loaded from: classes9.dex */
final class d {
    static final d a;
    final float[] b;
    final float[] c;
    final float[] d = {0.24f, 0.52f, 0.24f};
    boolean e = true;

    static {
        d dVar = new d();
        a = dVar;
        float[] fArr = dVar.c;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
        float[] fArr2 = dVar.b;
        fArr2[0] = 0.35f;
        fArr2[1] = 1.0f;
    }

    public d() {
        float[] fArr = new float[3];
        this.b = fArr;
        float[] fArr2 = new float[3];
        this.c = fArr2;
        a(fArr);
        a(fArr2);
    }

    private static void a(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }
}
