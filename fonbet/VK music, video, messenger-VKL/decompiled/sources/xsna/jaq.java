package xsna;

import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: ExponentialAlgorithm.kt */
/* loaded from: classes15.dex */
public final class jaq {
    public final long a;
    public final long b;

    public jaq(long j, long j2) {
        this.a = j;
        this.b = j2;
        if (j < 1) {
            throw new IllegalArgumentException("Interval is invalid. Must be greater than 1.");
        }
        if (j2 < j) {
            throw new IllegalArgumentException("maxInterval is invalid. Must be greater or equal than Interval.");
        }
        if (1.5f < 1.0d) {
            throw new IllegalArgumentException("Multiplier is invalid. Must be greater than 1.0.");
        }
        double d = 0.2f;
        if (d < ConnectivityTracker.DEFAULT_UPLINK_BITRATE || 1.0d <= d) {
            throw new IllegalArgumentException("Range is invalid. Must be greater or equal 0.0 and lower than 1.0.");
        }
    }

    public final long a(int i) {
        float min = (long) Math.min(this.a * ((float) Math.pow(1.5f, i - 1.0f)), this.b);
        return ((long) Math.max(min - (0.2f * min), 1.0f)) + ((int) (Math.random() * ((((long) Math.min(r1 + min, r9)) - r2) + 1)));
    }
}
