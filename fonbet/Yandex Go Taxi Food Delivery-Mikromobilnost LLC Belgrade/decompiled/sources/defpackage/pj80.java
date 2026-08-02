package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.yandex.go.places.common.ui.indicator.DotsIndicatorComponent;

/* loaded from: classes13.dex */
public final class pj80 extends ViewPager2.a {
    public int a;
    public final DotsIndicatorComponent b;

    public pj80(int i, DotsIndicatorComponent dotsIndicatorComponent) {
        this.b = dotsIndicatorComponent;
        this.a = i;
        dotsIndicatorComponent.setElementsCount(i + 1);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.b.scrollFinished();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageScrolled(int i, float f, int i2) {
        if (this.a <= 0) {
            return;
        }
        DotsIndicatorComponent.setPageScroll$default(this.b, i, f, false, 4, null);
    }
}
