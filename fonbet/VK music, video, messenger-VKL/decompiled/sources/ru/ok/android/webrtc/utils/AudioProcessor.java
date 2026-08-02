package ru.ok.android.webrtc.utils;

import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes9.dex */
public final class AudioProcessor {
    public static final float MIN_AUDIO_LEVEL_TO_TALK = 200.0f;
    public static final float[] d = new float[3];
    public final long[] a = new long[3];
    public float b;
    public float c;

    static {
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f2 = 0.0f;
        for (int i = 0; i < 3; i++) {
            float[] fArr = d;
            float exp = (float) Math.exp(i);
            fArr[i] = exp;
            f2 += exp;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            float[] fArr2 = d;
            float f3 = fArr2[i2] / f2;
            fArr2[i2] = f3;
            f += f3;
        }
        d[2] = 1.0f - f;
    }

    public void appendAudioLevel(long j) {
        float f = j;
        this.c = f;
        this.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i = 0;
        while (true) {
            long[] jArr = this.a;
            if (i >= jArr.length - 1) {
                jArr[jArr.length - 1] = j;
                this.b = (d[jArr.length - 1] * f) + this.b;
                return;
            } else {
                int i2 = i + 1;
                long j2 = jArr[i2];
                jArr[i] = j2;
                this.b = (d[i] * j2) + this.b;
                i = i2;
            }
        }
    }

    public float getAverageAudioLevel() {
        return this.b;
    }

    public float getLastAudioLevel() {
        return this.c;
    }

    public boolean isSilence() {
        return getAverageAudioLevel() <= 200.0f;
    }
}
