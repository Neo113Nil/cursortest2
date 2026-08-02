package xsna;

import androidx.viewpager.widget.ViewPager;
import xsna.xn50;
import xsna.z710;

/* compiled from: MarketMultiSelectPickerView.kt */
/* loaded from: classes18.dex */
public final class d910 implements ViewPager.j {
    public final /* synthetic */ f910 b;

    public d910(f910 f910Var) {
        this.b = f910Var;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i) {
        f910 f910Var = this.b;
        xn50.a.c(f910Var.d, new z710.q(i));
        la10 b = f910Var.b();
        if (b != null) {
            b.y0();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i, float f, int i2) {
    }
}
