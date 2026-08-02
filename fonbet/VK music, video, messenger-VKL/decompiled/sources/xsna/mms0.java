package xsna;

import android.util.Range;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: VideoFrameReleaseEarlyTimeForecaster.java */
/* loaded from: classes12.dex */
public final class mms0 {
    public long a;
    public long b;
    public double c;
    public Range<Double> d;

    public final void a(long j, long j2) {
        double doubleValue;
        fxc0.p(j != C.TIME_UNSET);
        fxc0.p(j2 != C.TIME_UNSET);
        long j3 = this.a;
        if (j3 != C.TIME_UNSET) {
            if (this.b != C.TIME_UNSET && j != j3) {
                doubleValue = (j2 - r4) / (j - j3);
                this.c = (this.d.clamp(Double.valueOf(doubleValue)).doubleValue() * 0.20000000298023224d) + (this.c * 0.800000011920929d);
                this.a = j;
                this.b = j2;
            }
        }
        doubleValue = this.d.getUpper().doubleValue();
        this.c = (this.d.clamp(Double.valueOf(doubleValue)).doubleValue() * 0.20000000298023224d) + (this.c * 0.800000011920929d);
        this.a = j;
        this.b = j2;
    }

    public final void b() {
        this.c = this.d.getUpper().doubleValue();
        this.a = C.TIME_UNSET;
        this.b = C.TIME_UNSET;
    }

    public final void c(float f) {
        fxc0.p(f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.d = new Range<>(Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE), Double.valueOf(1.0d / f));
        b();
    }
}
