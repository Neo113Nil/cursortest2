package com.yandex.div.core.animation;

import android.view.animation.Interpolator;
import com.unity3d.services.UnityAdsConstants;
import xsna.u11;
import xsna.yq;

/* compiled from: LookupTableInterpolator.kt */
/* loaded from: classes7.dex */
public abstract class LookupTableInterpolator implements Interpolator {
    private final float stepSize;
    private final float[] values;

    public LookupTableInterpolator(float[] fArr) {
        this.values = fArr;
        this.stepSize = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        float[] fArr = this.values;
        int length = (int) ((fArr.length - 1) * f);
        int length2 = fArr.length - 2;
        if (length > length2) {
            length = length2;
        }
        float f2 = this.stepSize;
        float a = yq.a(length, f2, f, f2);
        float f3 = fArr[length];
        return u11.b(fArr[length + 1], f3, a, f3);
    }
}
