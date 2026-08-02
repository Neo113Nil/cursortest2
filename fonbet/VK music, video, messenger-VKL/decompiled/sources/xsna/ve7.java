package xsna;

import android.view.KeyEvent;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.superapp.ui.BlendingTabView;

/* compiled from: BlendingTabViewPagerChangeListener.kt */
/* loaded from: classes6.dex */
public final class ve7 extends ViewPager.m {
    public final TabLayout b;

    public ve7(TabLayout tabLayout) {
        this.b = tabLayout;
    }

    @Override // androidx.viewpager.widget.ViewPager.m, androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i, float f, int i2) {
        TabLayout tabLayout = this.b;
        int tabCount = tabLayout.getTabCount();
        int i3 = 0;
        while (i3 < tabCount) {
            TabLayout.g b = tabLayout.b(i3);
            KeyEvent.Callback callback = b != null ? b.f : null;
            BlendingTabView blendingTabView = callback instanceof BlendingTabView ? (BlendingTabView) callback : null;
            if (blendingTabView != null) {
                blendingTabView.setTextBlendRatio(i3 == i ? 1.0f - f : i3 == i + 1 ? f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            i3++;
        }
    }
}
