package xsna;

import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: ViewingConditions.java */
/* loaded from: classes13.dex */
public final class a4u0 {
    public static final a4u0 k;
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double[] g;
    public final double h;
    public final double i;
    public final double j;

    static {
        double[] dArr = q6x.e;
        double G = (q6x.G(50.0d) * 63.66197723675813d) / 100.0d;
        double max = Math.max(0.1d, 50.0d);
        double[][] dArr2 = sd9.b;
        double d = dArr[0];
        double[] dArr3 = dArr2[0];
        double d2 = dArr3[0] * d;
        double d3 = dArr[1];
        double d4 = (dArr3[1] * d3) + d2;
        double d5 = dArr[2];
        double d6 = (dArr3[2] * d5) + d4;
        double[] dArr4 = dArr2[1];
        double d7 = (dArr4[2] * d5) + (dArr4[1] * d3) + (dArr4[0] * d);
        double[] dArr5 = dArr2[2];
        double d8 = (d5 * dArr5[2]) + (d3 * dArr5[1]) + (d * dArr5[0]);
        double exp = (1.0d - (Math.exp(((-G) - 42.0d) / 92.0d) * 0.2777777777777778d)) * 1.0d;
        if (exp < ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            exp = 0.0d;
        } else if (exp > 1.0d) {
            exp = 1.0d;
        }
        double[] dArr6 = {(((100.0d / d6) * exp) + 1.0d) - exp, (((100.0d / d7) * exp) + 1.0d) - exp, (((100.0d / d8) * exp) + 1.0d) - exp};
        double d9 = 5.0d * G;
        double d10 = 1.0d / (d9 + 1.0d);
        double d11 = d10 * d10 * d10 * d10;
        double d12 = 1.0d - d11;
        double cbrt = (Math.cbrt(d9) * 0.1d * d12 * d12) + (d11 * G);
        double G2 = q6x.G(max) / dArr[1];
        double sqrt = Math.sqrt(G2) + 1.48d;
        double pow = 0.725d / Math.pow(G2, 0.2d);
        double[] dArr7 = {Math.pow(((dArr6[0] * cbrt) * d6) / 100.0d, 0.42d), Math.pow(((dArr6[1] * cbrt) * d7) / 100.0d, 0.42d), Math.pow(((dArr6[2] * cbrt) * d8) / 100.0d, 0.42d)};
        double d13 = dArr7[0];
        double d14 = (d13 * 400.0d) / (d13 + 27.13d);
        double d15 = dArr7[1];
        double d16 = (d15 * 400.0d) / (d15 + 27.13d);
        double d17 = dArr7[2];
        double[] dArr8 = {d14, d16, (400.0d * d17) / (d17 + 27.13d)};
        k = new a4u0(G2, ((dArr8[2] * 0.05d) + (dArr8[0] * 2.0d) + dArr8[1]) * pow, pow, pow, 0.69d, 1.0d, dArr6, cbrt, Math.pow(cbrt, 0.25d), sqrt);
    }

    public a4u0(double d, double d2, double d3, double d4, double d5, double d6, double[] dArr, double d7, double d8, double d9) {
        this.f = d;
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.d = d5;
        this.e = d6;
        this.g = dArr;
        this.h = d7;
        this.i = d8;
        this.j = d9;
    }
}
