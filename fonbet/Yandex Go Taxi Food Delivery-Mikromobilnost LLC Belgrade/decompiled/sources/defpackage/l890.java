package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.internal.widget.indicator.PagerIndicatorView;
import com.yandex.div.internal.widget.indicator.a;

/* loaded from: classes.dex */
public final class l890 extends ViewPager2.a {
    public final /* synthetic */ PagerIndicatorView a;

    public l890(PagerIndicatorView pagerIndicatorView) {
        this.a = pagerIndicatorView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0013, code lost:
    
        if (r4 > 1.0f) goto L6;
     */
    @Override // androidx.viewpager2.widget.ViewPager2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPageScrolled(int i, float f, int i2) {
        a aVar;
        com.yandex.div.core.view2.divs.pager.a currentAdapter;
        PagerIndicatorView pagerIndicatorView = this.a;
        aVar = pagerIndicatorView.stripDrawer;
        if (aVar != null) {
            float f2 = f >= 0.0f ? 1.0f : 0.0f;
            f = f2;
            currentAdapter = pagerIndicatorView.getCurrentAdapter();
            if (currentAdapter != null) {
                i = currentAdapter.p(i);
            }
            aVar.m = i;
            aVar.n = f;
            aVar.c.h(f, i);
            aVar.a(f, i);
            pagerIndicatorView.invalidate();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageSelected(int i) {
        a aVar;
        com.yandex.div.core.view2.divs.pager.a currentAdapter;
        PagerIndicatorView pagerIndicatorView = this.a;
        aVar = pagerIndicatorView.stripDrawer;
        if (aVar != null) {
            currentAdapter = pagerIndicatorView.getCurrentAdapter();
            if (currentAdapter != null) {
                i = currentAdapter.p(i);
            }
            aVar.m = i;
            aVar.n = 0.0f;
            aVar.c.onPageSelected(i);
            aVar.a(0.0f, i);
            pagerIndicatorView.invalidate();
        }
    }
}
