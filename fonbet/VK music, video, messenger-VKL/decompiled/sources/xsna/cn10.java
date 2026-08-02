package xsna;

import java.nio.ByteBuffer;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: Matrix.java */
/* loaded from: classes13.dex */
public final class cn10 {
    public static final cn10 j = new cn10(1.0d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 1.0d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 1.0d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
    public static final cn10 k = new cn10(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 1.0d, -1.0d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 1.0d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
    public static final cn10 l = new cn10(-1.0d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, -1.0d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 1.0d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
    public static final cn10 m = new cn10(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, -1.0d, 1.0d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 1.0d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final double h;
    public final double i;

    public cn10(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.a = d5;
        this.b = d6;
        this.c = d7;
        this.d = d;
        this.e = d2;
        this.f = d3;
        this.g = d4;
        this.h = d8;
        this.i = d9;
    }

    public static cn10 a(ByteBuffer byteBuffer) {
        double p = crx0.p(byteBuffer);
        double p2 = crx0.p(byteBuffer);
        double o = crx0.o(byteBuffer);
        return new cn10(p, p2, crx0.p(byteBuffer), crx0.p(byteBuffer), o, crx0.o(byteBuffer), crx0.o(byteBuffer), crx0.p(byteBuffer), crx0.p(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        aqw.r(byteBuffer, this.d);
        aqw.r(byteBuffer, this.e);
        aqw.q(byteBuffer, this.a);
        aqw.r(byteBuffer, this.f);
        aqw.r(byteBuffer, this.g);
        aqw.q(byteBuffer, this.b);
        aqw.r(byteBuffer, this.h);
        aqw.r(byteBuffer, this.i);
        aqw.q(byteBuffer, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cn10.class != obj.getClass()) {
            return false;
        }
        cn10 cn10Var = (cn10) obj;
        return Double.compare(cn10Var.d, this.d) == 0 && Double.compare(cn10Var.e, this.e) == 0 && Double.compare(cn10Var.f, this.f) == 0 && Double.compare(cn10Var.g, this.g) == 0 && Double.compare(cn10Var.h, this.h) == 0 && Double.compare(cn10Var.i, this.i) == 0 && Double.compare(cn10Var.a, this.a) == 0 && Double.compare(cn10Var.b, this.b) == 0 && Double.compare(cn10Var.c, this.c) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.b);
        int i = (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.c);
        int i2 = (i * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        int i3 = (i2 * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)));
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        int i4 = (i3 * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)));
        long doubleToLongBits6 = Double.doubleToLongBits(this.f);
        int i5 = (i4 * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)));
        long doubleToLongBits7 = Double.doubleToLongBits(this.g);
        int i6 = (i5 * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)));
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        int i7 = (i6 * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)));
        long doubleToLongBits9 = Double.doubleToLongBits(this.i);
        return (i7 * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(j)) {
            return "Rotate 0°";
        }
        if (equals(k)) {
            return "Rotate 90°";
        }
        if (equals(l)) {
            return "Rotate 180°";
        }
        if (equals(m)) {
            return "Rotate 270°";
        }
        StringBuilder sb = new StringBuilder("Matrix{u=");
        sb.append(this.a);
        sb.append(", v=");
        sb.append(this.b);
        sb.append(", w=");
        sb.append(this.c);
        sb.append(", a=");
        sb.append(this.d);
        sb.append(", b=");
        sb.append(this.e);
        sb.append(", c=");
        sb.append(this.f);
        sb.append(", d=");
        sb.append(this.g);
        sb.append(", tx=");
        sb.append(this.h);
        sb.append(", ty=");
        return ojp0.a(sb, this.i, '}');
    }
}
