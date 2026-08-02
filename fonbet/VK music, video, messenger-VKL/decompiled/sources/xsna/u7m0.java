package xsna;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: StoryPageTransformer.kt */
/* loaded from: classes6.dex */
public final class u7m0 implements ViewPager.k {
    @Override // androidx.viewpager.widget.ViewPager.k
    public final void transformPage(View view, float f) {
        if (f <= -1.0f) {
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f2 = 1;
            view.setAlpha(f + f2);
            float abs = ((f2 - Math.abs(f)) * 0.100000024f) + 0.9f;
            view.setScaleX(abs);
            view.setScaleY(abs);
            return;
        }
        if (f > 1.0f) {
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        float f3 = 1;
        view.setAlpha(f3 - f);
        float abs2 = ((f3 - Math.abs(f)) * 0.100000024f) + 0.9f;
        view.setScaleX(abs2);
        view.setScaleY(abs2);
    }
}
