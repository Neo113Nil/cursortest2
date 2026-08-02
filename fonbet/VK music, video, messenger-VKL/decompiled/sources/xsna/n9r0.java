package xsna;

import android.content.res.TypedArray;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: VKAvatarBorderConfigOverrideMapper.kt */
/* loaded from: classes15.dex */
public final class n9r0 {
    public static Float a(TypedArray typedArray, int i) {
        if (!typedArray.hasValue(i)) {
            return null;
        }
        hg10.d(typedArray, i);
        return Float.valueOf(typedArray.getDimension(i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    }
}
