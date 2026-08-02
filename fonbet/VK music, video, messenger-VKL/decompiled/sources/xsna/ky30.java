package xsna;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.vk.im.engine.models.SearchMode;

/* compiled from: MsgSearchVc.kt */
/* loaded from: classes2.dex */
public final class ky30 implements ViewPager.i {
    public final /* synthetic */ iy30 a;
    public final /* synthetic */ SearchMode b;

    public ky30(iy30 iy30Var, SearchMode searchMode) {
        this.a = iy30Var;
        this.b = searchMode;
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        iy30.d(this.a, this.b);
        viewPager.removeOnAdapterChangeListener(this);
    }
}
