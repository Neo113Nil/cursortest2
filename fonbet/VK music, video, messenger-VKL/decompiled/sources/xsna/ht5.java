package xsna;

import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: AvgData.kt */
/* loaded from: classes12.dex */
public final class ht5 {
    public int a;
    public double b;

    public ht5() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht5)) {
            return false;
        }
        ht5 ht5Var = (ht5) obj;
        return this.a == ht5Var.a && Double.compare(this.b, ht5Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AvgData(count=");
        sb.append(this.a);
        sb.append(", total=");
        return ojp0.a(sb, this.b, ')');
    }

    public ht5(int i) {
        this.a = 0;
        this.b = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
    }
}
