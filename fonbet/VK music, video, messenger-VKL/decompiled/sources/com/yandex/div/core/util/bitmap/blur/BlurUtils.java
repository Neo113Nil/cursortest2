package com.yandex.div.core.util.bitmap.blur;

import android.graphics.Bitmap;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: BlurUtils.kt */
/* loaded from: classes7.dex */
public final class BlurUtils {
    public static final BlurUtils INSTANCE = new BlurUtils();

    private BlurUtils() {
    }

    public final boolean isBlurParamsValid(Bitmap bitmap, float f) {
        return !bitmap.isRecycled() && bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
