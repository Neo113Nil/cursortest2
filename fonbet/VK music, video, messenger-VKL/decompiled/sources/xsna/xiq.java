package xsna;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.tabs.TabLayout;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: FadeTabIndicatorInterpolator.java */
/* loaded from: classes13.dex */
public final class xiq extends com.google.android.material.tabs.a {
    @Override // com.google.android.material.tabs.a
    public final void b(TabLayout tabLayout, View view, View view2, float f, @NonNull Drawable drawable) {
        if (f >= 0.5f) {
            view = view2;
        }
        RectF a = com.google.android.material.tabs.a.a(tabLayout, view);
        float b = f < 0.5f ? rq2.b(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, f) : rq2.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 0.5f, 1.0f, f);
        drawable.setBounds((int) a.left, drawable.getBounds().top, (int) a.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (b * 255.0f));
    }
}
