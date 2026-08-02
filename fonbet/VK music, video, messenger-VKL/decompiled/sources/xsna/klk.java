package xsna;

import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: CurrentLocation.kt */
/* loaded from: classes4.dex */
public final class klk {
    public static final klk c = new klk(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
    public final double a;
    public final double b;

    public klk(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klk)) {
            return false;
        }
        klk klkVar = (klk) obj;
        return Double.compare(this.a, klkVar.a) == 0 && Double.compare(this.b, klkVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurrentLocation(lon=");
        sb.append(this.a);
        sb.append(", lat=");
        return ojp0.a(sb, this.b, ')');
    }
}
