package xsna;

import java.util.HashMap;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: ColorTonalPalette.kt */
/* loaded from: classes6.dex */
public final class k8g {
    public final double a;
    public final HashMap b = new HashMap();
    public final double c;

    public k8g(int i, double d) {
        this.a = d;
        a4u0 a4u0Var = a4u0.k;
        int i2 = i & 255;
        double B = q6x.B((16711680 & i) >> 16);
        double B2 = q6x.B((65280 & i) >> 8);
        double B3 = q6x.B(i2);
        double d2 = (0.18051042d * B3) + (0.35762064d * B2) + (0.41233895d * B);
        double d3 = (0.0722d * B3) + (0.7152d * B2) + (0.2126d * B);
        double d4 = (B3 * 0.95034478d) + (B2 * 0.11916382d) + (B * 0.01932141d);
        double[][] dArr = sd9.b;
        double[] dArr2 = dArr[0];
        double d5 = (dArr2[2] * d4) + (dArr2[1] * d3) + (dArr2[0] * d2);
        double[] dArr3 = dArr[1];
        double d6 = (dArr3[2] * d4) + (dArr3[1] * d3) + (dArr3[0] * d2);
        double[] dArr4 = dArr[2];
        double d7 = (d4 * dArr4[2]) + (d3 * dArr4[1]) + (d2 * dArr4[0]);
        double[] dArr5 = a4u0Var.g;
        double d8 = a4u0Var.i;
        double d9 = a4u0Var.d;
        double d10 = a4u0Var.a;
        double d11 = dArr5[0] * d5;
        double d12 = dArr5[1] * d6;
        double d13 = dArr5[2] * d7;
        double d14 = a4u0Var.h;
        double pow = Math.pow((Math.abs(d11) * d14) / 100.0d, 0.42d);
        double pow2 = Math.pow((Math.abs(d12) * d14) / 100.0d, 0.42d);
        double pow3 = Math.pow((Math.abs(d13) * d14) / 100.0d, 0.42d);
        double signum = ((Math.signum(d11) * 400.0d) * pow) / (pow + 27.13d);
        double signum2 = ((Math.signum(d12) * 400.0d) * pow2) / (pow2 + 27.13d);
        double signum3 = ((Math.signum(d13) * 400.0d) * pow3) / (pow3 + 27.13d);
        double d15 = ((((-12.0d) * signum2) + (signum * 11.0d)) + signum3) / 11.0d;
        double d16 = ((signum + signum2) - (signum3 * 2.0d)) / 9.0d;
        double d17 = signum2 * 20.0d;
        double d18 = ((21.0d * signum3) + ((signum * 20.0d) + d17)) / 20.0d;
        double d19 = (((signum * 40.0d) + d17) + signum3) / 20.0d;
        double degrees = Math.toDegrees(Math.atan2(d16, d15));
        if (degrees < ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double radians = Math.toRadians(degrees);
        double pow4 = (Math.pow((d19 * a4u0Var.b) / d10, a4u0Var.j * d9) * 100.0d) / 100.0d;
        Math.sqrt(pow4);
        double d20 = d10 + 4.0d;
        double pow5 = Math.pow((Math.hypot(d15, d16) * (((((Math.cos(Math.toRadians(degrees < 20.14d ? degrees + 360.0d : degrees) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * a4u0Var.e) * a4u0Var.c)) / (d18 + 0.305d), 0.9d) * Math.pow(1.64d - Math.pow(0.29d, a4u0Var.f), 0.73d);
        double sqrt = Math.sqrt(pow4) * pow5 * d8;
        Math.sqrt((pow5 * d9) / d20);
        Math.log1p(sqrt * 0.0228d);
        Math.cos(radians);
        Math.sin(radians);
        double d21 = fdi.C(new double[]{q6x.B((i >> 16) & 255), q6x.B((i >> 8) & 255), q6x.B(i2)}, q6x.d)[1] / 100.0d;
        if (d21 > 0.008856451679035631d) {
            Math.pow(d21, 0.3333333333333333d);
        }
        this.c = degrees;
    }
}
