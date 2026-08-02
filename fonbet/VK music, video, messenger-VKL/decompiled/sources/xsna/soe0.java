package xsna;

import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: QuadraticInterpolation.java */
/* loaded from: classes8.dex */
public final class soe0 {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final int e;
    public final boolean f;

    public soe0(double d, double d2, double d3) {
        double d4 = ((d3 + d) * 0.5d) - d2;
        double d5 = (d3 - d) * 0.5d;
        double d6 = (-d5) / (2.0d * d4);
        this.a = d6;
        this.b = (((d4 * d6) + d5) * d6) + d2;
        this.f = d4 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        double d7 = (d5 * d5) - ((4.0d * d4) * d2);
        if (d7 >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            double sqrt = (Math.sqrt(d7) * 0.5d) / Math.abs(d4);
            double d8 = d6 - sqrt;
            this.c = d8;
            double d9 = d6 + sqrt;
            this.d = d9;
            r12 = Math.abs(d8) <= 1.0d ? 1 : 0;
            if (Math.abs(d9) <= 1.0d) {
                r12++;
            }
        } else {
            this.c = Double.NaN;
            this.d = Double.NaN;
        }
        this.e = r12;
    }
}
