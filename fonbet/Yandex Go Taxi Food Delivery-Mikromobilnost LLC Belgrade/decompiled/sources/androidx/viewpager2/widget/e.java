package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class e extends ViewPager2.a {
    public final /* synthetic */ ViewPager2 a;

    public e(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.a.updateCurrentItem();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageSelected(int i) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.mCurrentItem != i) {
            viewPager2.mCurrentItem = i;
            viewPager2.mAccessibilityProvider.p();
        }
    }
}
