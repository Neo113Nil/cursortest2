package ru.ok.tensorflow.util.measure;

import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes9.dex */
public class EMA {
    private float alpha;
    private float valEma = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    public EMA(float f) {
        this.alpha = f;
    }

    public float ema(float f) {
        float f2 = this.alpha;
        float f3 = ((1.0f - f2) * this.valEma) + (f * f2);
        this.valEma = f3;
        return f3;
    }
}
