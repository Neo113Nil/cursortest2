package xsna;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: DepthPageTransformer.java */
/* loaded from: classes3.dex */
public final class y0m implements ViewPager.k {
    @Override // androidx.viewpager.widget.ViewPager.k
    public final void transformPage(View view, float f) {
        if (view != null) {
            int width = view.getWidth();
            if (f < -1.0f) {
                view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                view.setAlpha(1.0f);
                view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
            } else if (f <= 1.0f) {
                view.setAlpha(1.0f - f);
                view.setTranslationX(width * (-f));
                float abs = ((1.0f - Math.abs(f)) * 0.14999998f) + 0.85f;
                view.setScaleX(abs);
                view.setScaleY(abs);
            } else {
                view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                view.setBackgroundColor(-16777216);
            } else {
                view.setBackgroundColor(0);
            }
        }
    }
}
