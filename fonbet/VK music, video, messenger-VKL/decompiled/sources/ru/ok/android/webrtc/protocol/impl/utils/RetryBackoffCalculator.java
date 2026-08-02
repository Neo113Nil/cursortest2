package ru.ok.android.webrtc.protocol.impl.utils;

import com.unity3d.services.UnityAdsConstants;
import defpackage.k0;
import java.util.Random;
import xsna.n23;

/* loaded from: classes9.dex */
public class RetryBackoffCalculator {
    public final Random a = new Random(System.currentTimeMillis());
    public long b = 0;
    public long c = 0;
    public float d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public long f = 0;

    public long calculate() {
        float max = Math.max(this.b, Math.min((long) (this.f * this.d), this.c));
        return (long) (max + ((float) (this.a.nextGaussian() * max * this.e)));
    }

    public void setLatestRetryTimeout(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(k0.a(j, "Illegal 'latestRetryTimeout' value: "));
        }
        this.f = j;
    }

    public void setMaxRetryTimeoutMs(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(k0.a(j, "Illegal 'maxRetryTimeoutMs' value: "));
        }
        this.c = j;
    }

    public void setMinRetryTimeoutMs(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(k0.a(j, "Illegal 'minRetryTimeoutMs' value: "));
        }
        this.b = j;
    }

    public void setRetryBackoffFactor(float f) {
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException(n23.a(f, "Illegal 'retryBackoffFactor' value: "));
        }
        this.d = f;
    }

    public void setRetryBackoffJitter(float f) {
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException(n23.a(f, "Illegal 'retryBackoffJitter' value: "));
        }
        this.e = f;
    }
}
