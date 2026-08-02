package xsna;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ZoomOutPageTransformer.kt */
/* loaded from: classes6.dex */
public final class v6y0 implements ViewPager2.i {
    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void transformPage(View view, float f) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (f < -1.0f) {
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        if (f > 1.0f) {
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        float f2 = 1;
        float max = Math.max(0.85f, f2 - Math.abs(f));
        float f3 = f2 - max;
        float f4 = 2;
        float f5 = (height * f3) / f4;
        float f6 = (width * f3) / f4;
        view.setTranslationX(f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f6 - (f5 / f4) : f6 + (f5 / f4));
        view.setScaleX(max);
        view.setScaleY(max);
        view.setAlpha(((f2 - 0.5f) * ((max - 0.85f) / (f2 - 0.85f))) + 0.5f);
    }
}
