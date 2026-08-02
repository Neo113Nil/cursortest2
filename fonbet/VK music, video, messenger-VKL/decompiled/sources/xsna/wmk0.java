package xsna;

/* compiled from: SpringSimulation.kt */
/* loaded from: classes11.dex */
public final class wmk0 {
    public float a;
    public double b;
    public float c;

    public final long a(long j, float f, float f2) {
        double sin;
        double cos;
        double exp;
        double exp2;
        float f3 = f - this.a;
        double d = j / 1000.0d;
        float f4 = this.c;
        double d2 = f4 * f4;
        double d3 = this.b;
        double d4 = (-f4) * d3;
        if (f4 > 1.0f) {
            double sqrt = Math.sqrt(d2 - 1) * d3;
            double d5 = d4 + sqrt;
            double d6 = d4 - sqrt;
            double d7 = f3;
            double d8 = ((d6 * d7) - f2) / (d6 - d5);
            double d9 = d7 - d8;
            double d10 = d6 * d;
            double d11 = d * d5;
            sin = (Math.exp(d11) * d8) + (Math.exp(d10) * d9);
            exp = Math.exp(d10) * d9 * d6;
            exp2 = Math.exp(d11) * d8 * d5;
        } else {
            if (f4 != 1.0f) {
                double d12 = 1;
                double sqrt2 = Math.sqrt(d12 - d2) * d3;
                double d13 = f3;
                double d14 = (((-d4) * d13) + f2) * (d12 / sqrt2);
                double d15 = sqrt2 * d;
                double d16 = d * d4;
                sin = ((Math.sin(d15) * d14) + (Math.cos(d15) * d13)) * Math.exp(d16);
                cos = (((Math.cos(d15) * sqrt2 * d14) + (Math.sin(d15) * (-sqrt2) * d13)) * Math.exp(d16)) + (d4 * sin);
                float f5 = (float) cos;
                return (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits((float) (sin + this.a)) << 32);
            }
            double d17 = f3;
            double d18 = (d3 * d17) + f2;
            double d19 = (-d3) * d;
            double d20 = (d * d18) + d17;
            sin = Math.exp(d19) * d20;
            exp = Math.exp(d19) * d20 * (-this.b);
            exp2 = Math.exp(d19) * d18;
        }
        cos = exp2 + exp;
        float f52 = (float) cos;
        return (Float.floatToRawIntBits(f52) & 4294967295L) | (Float.floatToRawIntBits((float) (sin + this.a)) << 32);
    }
}
