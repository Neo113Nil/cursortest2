package xsna;

import androidx.viewpager2.widget.ViewPager2;
import xsna.scs;

/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes12.dex */
public final class wcs extends ViewPager2.g {
    public final /* synthetic */ scs.d d;

    public wcs(scs.d dVar) {
        this.d = dVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageScrollStateChanged(int i) {
        this.d.b(false);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageSelected(int i) {
        this.d.b(false);
    }
}
