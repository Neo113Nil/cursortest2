package defpackage;

/* loaded from: classes10.dex */
public final class hor implements gor {
    public final float a;
    public final float b;

    public hor(int i) {
        this.a = Math.max(1.0E-7f, Math.abs(0.1f));
        this.b = Math.max(1.0E-4f, 1.0f) * (-4.2f);
    }

    @Override // defpackage.gor
    public final float c() {
        return this.a;
    }

    @Override // defpackage.gor
    public final long i(float f) {
        return ((long) ((((float) Math.log(this.a / Math.abs(f))) * 1000.0f) / this.b)) * 1000000;
    }

    @Override // defpackage.gor
    public final float j(float f, float f2) {
        if (Math.abs(f2) <= this.a) {
            return f;
        }
        double log = Math.log(Math.abs(r1 / f2));
        float f3 = this.b;
        return ((f2 / f3) * ((float) Math.exp((f3 * ((log / f3) * 1000.0d)) / 1000.0d))) + (f - (f2 / f3));
    }

    @Override // defpackage.gor
    public final float k(float f, long j) {
        return f * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.b));
    }

    @Override // defpackage.gor
    public final float l(float f, float f2, long j) {
        float f3 = this.b;
        return ((f2 / f3) * ((float) Math.exp((f3 * (j / 1000000)) / 1000.0f))) + (f - (f2 / f3));
    }

    public hor() {
        this(0);
    }
}
