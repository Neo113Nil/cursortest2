package xsna;

import androidx.viewpager.widget.ViewPager;
import com.vkontakte.android.ui.widget.PagerSlidingTabStrip;

/* compiled from: PagerSlidingTabStrip.java */
/* loaded from: classes7.dex */
public final class cc90 implements ViewPager.j {
    public final /* synthetic */ PagerSlidingTabStrip b;

    public cc90(PagerSlidingTabStrip pagerSlidingTabStrip) {
        this.b = pagerSlidingTabStrip;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i) {
        int i2 = PagerSlidingTabStrip.I;
        this.b.h(i);
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i, float f, int i2) {
    }
}
