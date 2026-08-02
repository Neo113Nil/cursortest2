package ru.ok.android.webrtc.opengl;

import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class CallRendererFpsControl {
    public long a;
    public long b;

    public final synchronized boolean isPaused() {
        return this.b == Long.MAX_VALUE;
    }

    public final synchronized void setFpsReduction(float f) {
        try {
            long j = this.b;
            if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.b = Long.MAX_VALUE;
            } else {
                this.b = (long) (TimeUnit.SECONDS.toNanos(1L) / f);
            }
            if (this.b != j) {
                this.a = System.nanoTime();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean shouldRenderFrame() {
        long j = this.b;
        if (j <= 0) {
            return true;
        }
        if (j == Long.MAX_VALUE) {
            return false;
        }
        long nanoTime = System.nanoTime();
        long j2 = this.a;
        if (nanoTime < j2) {
            return false;
        }
        long j3 = j2 + this.b;
        this.a = j3;
        this.a = Math.max(j3, nanoTime);
        return true;
    }
}
