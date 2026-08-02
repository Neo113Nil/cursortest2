package xsna;

import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.newsfeed.impl.explore.ExploreFragment;

/* compiled from: ExploreFragment.kt */
/* loaded from: classes4.dex */
public final class daq extends ViewPager.m {
    public final /* synthetic */ ExploreFragment b;

    public daq(ExploreFragment exploreFragment) {
        this.b = exploreFragment;
    }

    @Override // androidx.viewpager.widget.ViewPager.m, androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i, float f, int i2) {
        ExploreFragment exploreFragment = this.b;
        if (exploreFragment.W == i || i2 != 0) {
            return;
        }
        exploreFragment.W = i;
        AppBarLayout appBarLayout = exploreFragment.O;
        if (appBarLayout != null) {
            appBarLayout.setExpanded(true);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.m, androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i) {
    }
}
