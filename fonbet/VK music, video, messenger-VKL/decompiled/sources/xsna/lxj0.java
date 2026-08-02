package xsna;

import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: Size.java */
/* loaded from: classes8.dex */
public final class lxj0 {
    public final Object clone() throws CloneNotSupportedException {
        return new lxj0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxj0)) {
            return false;
        }
        ((lxj0) obj).getClass();
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        long doubleToLongBits2 = Double.doubleToLongBits(ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        return "0x0";
    }
}
