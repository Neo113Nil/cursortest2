package defpackage;

/* loaded from: classes11.dex */
public final class iq31 {
    public static final iq31 c;
    public float a;
    public float b;

    static {
        float f = 0.0f;
        c = new iq31(f, f);
    }

    public /* synthetic */ iq31(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public tnr a(float f) {
        double b = b(f);
        double d = unr.a;
        double d2 = d - 1.0d;
        return new tnr(f, (float) (Math.exp((d / d2) * b) * this.a * this.b), (long) (Math.exp(b / d2) * 1000.0d));
    }

    public double b(float f) {
        float[] fArr = m92.a;
        return Math.log((Math.abs(f) * 0.35f) / (this.a * this.b));
    }

    public float c(jdf jdfVar) {
        float a = jdfVar.a();
        float f = this.a;
        float b = jdfVar.b();
        float f2 = this.b;
        float a2 = ex21.a(a - f, b - f2);
        float[] fArr = jdfVar.a;
        float a3 = a2 - ex21.a(fArr[0] - f, fArr[1] - f2);
        float f3 = ex21.c;
        float d = ex21.d(a3, f3);
        if (d > f3 - 1.0E-4f) {
            return 0.0f;
        }
        return d;
    }
}
