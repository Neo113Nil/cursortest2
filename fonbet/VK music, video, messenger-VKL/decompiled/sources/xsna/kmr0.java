package xsna;

import java.math.BigDecimal;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: VelocityAccumulation.kt */
/* loaded from: classes16.dex */
public final class kmr0 {
    public double a;
    public double b;

    public kmr0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmr0)) {
            return false;
        }
        kmr0 kmr0Var = (kmr0) obj;
        return Double.compare(this.a, kmr0Var.a) == 0 && Double.compare(this.b, kmr0Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "VelocityAccumulation(xAccumulated=" + new BigDecimal(String.valueOf(this.a)).toPlainString() + ", yAccumulated=" + new BigDecimal(String.valueOf(this.b)).toPlainString() + ')';
    }

    public kmr0(int i) {
        this.a = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        this.b = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
    }
}
