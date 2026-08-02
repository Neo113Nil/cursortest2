package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* compiled from: ViewPagerAdapter.java */
/* loaded from: classes7.dex */
public abstract class izt0 extends PagerAdapter {
    public abstract View b(int i, ViewPager viewPager);

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        ViewPager viewPager = (ViewPager) viewGroup;
        View b = b(i, viewPager);
        viewPager.addView(b);
        return b;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
