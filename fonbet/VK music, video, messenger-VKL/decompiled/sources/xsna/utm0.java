package xsna;

import androidx.viewpager.widget.ViewPager;
import com.vkontakte.android.ui.widget.SubPagerOfList;

/* compiled from: SubPagerOfList.java */
/* loaded from: classes7.dex */
public final class utm0 implements ViewPager.j {
    public final /* synthetic */ SubPagerOfList b;

    public utm0(SubPagerOfList subPagerOfList) {
        this.b = subPagerOfList;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            int i2 = SubPagerOfList.f;
            return;
        }
        if (i == 1 || i == 2) {
            int i3 = SubPagerOfList.f;
            SubPagerOfList subPagerOfList = this.b;
            subPagerOfList.getCurrentItem();
            subPagerOfList.getAdapter().getClass();
            throw null;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i, float f, int i2) {
    }
}
