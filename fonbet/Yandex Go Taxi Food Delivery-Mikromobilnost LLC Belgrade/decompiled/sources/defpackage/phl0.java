package defpackage;

import com.yandex.div.internal.widget.tabs.RtlViewPager;

/* loaded from: classes11.dex */
public final class phl0 implements ct31 {
    public final ct31 a;
    public final /* synthetic */ RtlViewPager b;

    public phl0(RtlViewPager rtlViewPager, ct31 ct31Var) {
        this.b = rtlViewPager;
        this.a = ct31Var;
    }

    @Override // defpackage.ct31
    public final void onPageScrollStateChanged(int i) {
        this.a.onPageScrollStateChanged(i);
    }

    @Override // defpackage.ct31
    public final void onPageScrolled(int i, float f, int i2) {
        e890 adapter;
        RtlViewPager rtlViewPager = this.b;
        adapter = super/*androidx.viewpager.widget.ViewPager*/.getAdapter();
        if (ffx.W(rtlViewPager) && adapter != null) {
            int b = adapter.b();
            int width = ((int) (rtlViewPager.getWidth() * 0.0f)) + i2;
            while (i < b && width > 0) {
                i++;
                width -= (int) (rtlViewPager.getWidth() * 1.0f);
            }
            i = (b - i) - 1;
            int i3 = -width;
            i2 = i3;
            f = i3 / (rtlViewPager.getWidth() * 1.0f);
        }
        this.a.onPageScrolled(i, f, i2);
    }

    @Override // defpackage.ct31
    public final void onPageSelected(int i) {
        e890 adapter;
        RtlViewPager rtlViewPager = this.b;
        adapter = super/*androidx.viewpager.widget.ViewPager*/.getAdapter();
        if (ffx.W(rtlViewPager) && adapter != null) {
            i = (adapter.b() - i) - 1;
        }
        this.a.onPageSelected(i);
    }
}
