package yads;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.mobile.ads.R$styleable;

/* loaded from: classes10.dex */
public final class v10 {
    public static u10 a(Context context, View view, AttributeSet attributeSet, int i) {
        float f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MonetizationAdsInternalRoundImageView, i, 0);
            f = obtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalRoundImageView_monetization_internal_corner_radius, 0);
            obtainStyledAttributes.recycle();
        } else {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f2 = f;
        return new u10(view, f2, f2, f2, f2);
    }
}
