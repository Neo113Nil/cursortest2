package xsna;

import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import one.video.player.live.DebugInfo;

/* compiled from: BandwidthEstimator.java */
/* loaded from: classes8.dex */
public final class n06 {
    public long a = -1;
    public long b = -1;
    public float c = -1.0f;
    public long d = 0;
    public final DebugInfo e;

    public n06(@NonNull DebugInfo debugInfo) {
        this.e = debugInfo;
    }

    public final void a(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.a;
        if (j2 == -1) {
            this.a = currentTimeMillis;
            this.b = currentTimeMillis;
            return;
        }
        if (currentTimeMillis - this.b > 10000) {
            this.a = currentTimeMillis;
            this.b = currentTimeMillis;
            this.d = 0L;
            return;
        }
        this.b = currentTimeMillis;
        long j3 = this.d + j;
        this.d = j3;
        long j4 = currentTimeMillis - j2;
        if (j4 > 1000) {
            float f = (j3 * 8000.0f) / j4;
            float f2 = this.c;
            float f3 = f < f2 / 3.0f ? 0.5f : 0.2f;
            if (f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f = (f * f3) + ((1.0f - f3) * f2);
            }
            this.c = f;
            this.a = currentTimeMillis;
            this.d = 0L;
            DebugInfo debugInfo = this.e;
            if (debugInfo != null) {
                debugInfo.f.set(Float.valueOf(f / 1000.0f));
                debugInfo.e.set(System.currentTimeMillis());
            }
        }
    }
}
