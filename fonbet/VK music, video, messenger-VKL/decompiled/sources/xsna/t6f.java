package xsna;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: ClipsTemplateEditorCropperItemFadePageTransformer.kt */
/* loaded from: classes16.dex */
public final class t6f implements ViewPager2.i {
    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void transformPage(View view, float f) {
        if ((view instanceof w6f ? (w6f) view : null) != null) {
            if (-0.999f > f || f > 0.999f) {
                w6f w6fVar = (w6f) view;
                w6fVar.setFrameInBoundColor(w6fVar.getContext().getColor(R.color.vk_black_alpha45));
                return;
            }
            w6f w6fVar2 = (w6f) view;
            w6fVar2.a();
            float min = Math.min(0.45f, Math.abs(f));
            if (Math.abs(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - min) < 0.01d) {
                min = 0.0f;
            }
            w6fVar2.setFrameInBoundColor(l8g.f(min, -16777216));
        }
    }
}
