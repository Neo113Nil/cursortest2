package xsna;

import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: Point.java */
/* loaded from: classes8.dex */
public final class hlb0 {
    public final double a;
    public final double b;

    public hlb0(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final Object clone() throws CloneNotSupportedException {
        return new hlb0(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlb0)) {
            return false;
        }
        hlb0 hlb0Var = (hlb0) obj;
        return this.a == hlb0Var.a && this.b == hlb0Var.b;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.b);
        return (i * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + "}";
    }

    public hlb0() {
        this(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
    }
}
