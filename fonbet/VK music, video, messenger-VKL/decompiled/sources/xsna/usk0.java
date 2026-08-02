package xsna;

import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: StatTriggersConfig.kt */
/* loaded from: classes11.dex */
public final class usk0 {
    public static final a f = new a();
    public static final usk0 g = new usk0(0);
    public final boolean a;
    public final long b;
    public final double c;
    public final long d;
    public final long e;

    /* compiled from: StatTriggersConfig.kt */
    public static final class a {
    }

    public usk0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usk0)) {
            return false;
        }
        usk0 usk0Var = (usk0) obj;
        return this.a == usk0Var.a && this.b == usk0Var.b && Double.compare(this.c, usk0Var.c) == 0 && this.d == usk0Var.d && this.e == usk0Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + bh10.a(zjh0.b(this.c, bh10.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatTriggersConfig(enabled=");
        sb.append(this.a);
        sb.append(", chunkSizeLimitBytes=");
        sb.append(this.b);
        sb.append(", batchSizeRatio=");
        sb.append(this.c);
        sb.append(", sendProductDelayMs=");
        sb.append(this.d);
        sb.append(", sendBenchmarkDelayMs=");
        return vu5.a(')', this.e, sb);
    }

    public /* synthetic */ usk0(int i) {
        this(33000L, UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, false, 45000L, ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
    }

    public usk0(long j, long j2, boolean z, long j3, double d) {
        this.a = z;
        this.b = j;
        this.c = d;
        this.d = j2;
        this.e = j3;
    }
}
