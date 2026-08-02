package xsna;

/* compiled from: FloatAnimationSpec.kt */
/* loaded from: classes11.dex */
public final class pqr implements aqr {
    public final int a;
    public final huo b;
    public final long c;
    public final long d;

    public pqr(int i, int i2, huo huoVar) {
        this.a = i;
        this.b = huoVar;
        this.c = i * 1000000;
        this.d = i2 * 1000000;
    }

    @Override // xsna.aqr
    public final float b(long j, float f, float f2, float f3) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (e(j4, f, f2, f3) - e(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // xsna.aqr
    public final long c(float f, float f2, float f3) {
        return this.d + this.c;
    }

    @Override // xsna.aqr
    public final float e(long j, float f, float f2, float f3) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        if (j2 > j3) {
            j2 = j3;
        }
        float a = this.b.a(this.a == 0 ? 1.0f : j2 / j3);
        return (f2 * a) + ((1 - a) * f);
    }
}
