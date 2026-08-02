package xsna;

import com.unity3d.services.UnityAdsConstants;
import one.video.streaming.tools.TimeMachine;

/* compiled from: BandwidthEstimator.java */
/* loaded from: classes8.dex */
public final class m06 {
    public final long a;
    public final float b;
    public final float c;
    public long d;
    public long e;
    public float f;
    public long g;
    public boolean h;
    public final TimeMachine i;
    public a j;
    public long k;

    /* compiled from: BandwidthEstimator.java */
    public interface a {
        void onBandwidthEstimatorBitrateChanged(long j, long j2);
    }

    public m06(long j, TimeMachine timeMachine) {
        this.i = timeMachine;
        this.a = j;
        this.b = 0.2f;
        this.c = 0.5f;
        this.d = -1L;
        this.e = -1L;
        this.f = -1.0f;
        this.g = 0L;
        this.k = 0L;
    }

    public final void a(long j) {
        long currentTimeMillis = this.i.currentTimeMillis();
        long j2 = this.d;
        if (j2 == -1) {
            this.d = currentTimeMillis;
            this.e = currentTimeMillis;
            return;
        }
        if (currentTimeMillis - this.e > this.a || this.h) {
            this.d = currentTimeMillis;
            this.e = currentTimeMillis;
            this.g = 0L;
            return;
        }
        this.e = currentTimeMillis;
        long j3 = this.g + j;
        this.g = j3;
        long j4 = currentTimeMillis - j2;
        if (j4 > 1000) {
            float f = (j3 * 8000.0f) / j4;
            float f2 = this.f;
            float f3 = f < f2 / 3.0f ? this.c : this.b;
            if (f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f = (f * f3) + ((1.0f - f3) * f2);
            }
            this.f = f;
            this.d = currentTimeMillis;
            this.g = 0L;
            long j5 = (long) f;
            long j6 = this.k;
            if (j6 != j5) {
                a aVar = this.j;
                if (aVar == null) {
                    this.k = 0L;
                } else {
                    this.k = j5;
                    aVar.onBandwidthEstimatorBitrateChanged(j6, j5);
                }
            }
        }
    }

    public m06(TimeMachine timeMachine) {
        this.i = timeMachine;
        this.a = 5000L;
        this.b = 0.3f;
        this.c = 0.7f;
        this.d = -1L;
        this.e = -1L;
        this.f = -1.0f;
        this.g = 0L;
        this.k = 0L;
    }
}
