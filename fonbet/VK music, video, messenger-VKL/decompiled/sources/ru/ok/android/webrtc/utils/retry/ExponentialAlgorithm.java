package ru.ok.android.webrtc.utils.retry;

import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class ExponentialAlgorithm implements BackoffAlgorithm {
    public static final Companion Companion = new Companion(null);
    public static final float DEFAULT_FACTOR = 1.5f;
    public static final float DEFAULT_JITTER = 0.2f;
    public static final long DEFAULT_MAX_INTERVAL_MS = 30000;
    public static final long DEFAULT_MIN_INTERVAL_MS = 500;
    public static final float NO_RANGE = 0.0f;
    public final long a;
    public final long b;
    public final float c;
    public final float d;

    public static final class Companion {
        public Companion(zcl zclVar) {
        }
    }

    public ExponentialAlgorithm() {
        this(0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 15, null);
    }

    @Override // ru.ok.android.webrtc.utils.retry.BackoffAlgorithm
    public long interval(int i, long j) {
        long min = (long) Math.min(this.a * ((float) Math.pow(this.c, i - 1.0f)), this.b);
        float f = this.d;
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return min;
        }
        float f2 = min;
        return ((long) Math.max(f2 - (f * f2), 1.0f)) + ((int) (Math.random() * ((((long) Math.min((this.d * f2) + f2, this.b)) - r8) + 1)));
    }

    public ExponentialAlgorithm(long j, long j2, float f, float f2) {
        this.a = j;
        this.b = j2;
        this.c = f;
        this.d = f2;
        if (j < 1) {
            throw new IllegalArgumentException("Interval is invalid. Must be greater than 1.");
        }
        if (j2 < j) {
            throw new IllegalArgumentException("maxInterval is invalid. Must be greater or equal than Interval.");
        }
        if (f < 1.0d) {
            throw new IllegalArgumentException("Multiplier is invalid. Must be greater than 1.0.");
        }
        double d = f2;
        if (d < ConnectivityTracker.DEFAULT_UPLINK_BITRATE || 1.0d <= d) {
            throw new IllegalArgumentException("Range is invalid. Must be greater or equal 0.0 and lower than 1.0.");
        }
    }

    public /* synthetic */ ExponentialAlgorithm(long j, long j2, float f, float f2, int i, zcl zclVar) {
        this((i & 1) != 0 ? 500L : j, (i & 2) != 0 ? DEFAULT_MAX_INTERVAL_MS : j2, (i & 4) != 0 ? 1.5f : f, (i & 8) != 0 ? 0.2f : f2);
    }
}
