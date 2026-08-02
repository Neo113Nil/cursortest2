package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class f extends ViewPager2.a {
    public final /* synthetic */ ViewPager2 a;

    public f(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageSelected(int i) {
        ViewPager2 viewPager2 = this.a;
        viewPager2.clearFocus();
        if (viewPager2.hasFocus()) {
            viewPager2.mRecyclerView.requestFocus(2);
        }
    }
}
