package xsna;

import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: TransferParameters.kt */
/* loaded from: classes11.dex */
public final class pjp0 {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;

    public pjp0(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = d6;
        this.g = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == ConnectivityTracker.DEFAULT_UPLINK_BITRATE && (d2 == ConnectivityTracker.DEFAULT_UPLINK_BITRATE || d == ConnectivityTracker.DEFAULT_UPLINK_BITRATE)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d5 >= 1.0d && d4 == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d2 == ConnectivityTracker.DEFAULT_UPLINK_BITRATE || d == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) && d4 == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d4 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d2 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE || d < ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjp0)) {
            return false;
        }
        pjp0 pjp0Var = (pjp0) obj;
        return Double.compare(this.a, pjp0Var.a) == 0 && Double.compare(this.b, pjp0Var.b) == 0 && Double.compare(this.c, pjp0Var.c) == 0 && Double.compare(this.d, pjp0Var.d) == 0 && Double.compare(this.e, pjp0Var.e) == 0 && Double.compare(this.f, pjp0Var.f) == 0 && Double.compare(this.g, pjp0Var.g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.g) + zjh0.b(this.f, zjh0.b(this.e, zjh0.b(this.d, zjh0.b(this.c, zjh0.b(this.b, Double.hashCode(this.a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransferParameters(gamma=");
        sb.append(this.a);
        sb.append(", a=");
        sb.append(this.b);
        sb.append(", b=");
        sb.append(this.c);
        sb.append(", c=");
        sb.append(this.d);
        sb.append(", d=");
        sb.append(this.e);
        sb.append(", e=");
        sb.append(this.f);
        sb.append(", f=");
        return ojp0.a(sb, this.g, ')');
    }

    public /* synthetic */ pjp0(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
    }
}
