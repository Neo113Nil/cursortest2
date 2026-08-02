package xsna;

/* compiled from: FloatDecayAnimationSpec.kt */
/* loaded from: classes11.dex */
public final class fqr implements eqr {
    public final float a = Math.max(1.0E-7f, Math.abs(0.1f));
    public final float b = Math.max(1.0E-4f, 1.0f) * (-4.2f);

    @Override // xsna.eqr
    public final long a(float f) {
        return ((long) ((((float) Math.log(this.a / Math.abs(f))) * 1000.0f) / this.b)) * 1000000;
    }

    @Override // xsna.eqr
    public final float b(float f, float f2) {
        if (Math.abs(f2) <= this.a) {
            return f;
        }
        double log = Math.log(Math.abs(r1 / f2));
        float f3 = this.b;
        return ((f2 / f3) * ((float) Math.exp((f3 * ((log / f3) * 1000)) / 1000.0f))) + (f - (f2 / f3));
    }

    @Override // xsna.eqr
    public final float c(float f, long j) {
        return f * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.b));
    }

    @Override // xsna.eqr
    public final float d(long j, float f, float f2) {
        float f3 = this.b;
        return ((f2 / f3) * ((float) Math.exp((f3 * (j / 1000000)) / 1000.0f))) + (f - (f2 / f3));
    }

    @Override // xsna.eqr
    public final float e() {
        return this.a;
    }
}
