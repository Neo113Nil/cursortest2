package xsna;

import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.core.view.disableable.DisableableViewPager;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ozt0 implements gzs {
    public final /* synthetic */ ViewPagerVh b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ wzs e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ DisableableViewPager g;
    public final /* synthetic */ boolean h;

    public /* synthetic */ ozt0(ViewPagerVh viewPagerVh, ArrayList arrayList, int i, wzs wzsVar, boolean z, DisableableViewPager disableableViewPager, boolean z2) {
        this.b = viewPagerVh;
        this.c = arrayList;
        this.d = i;
        this.e = wzsVar;
        this.f = z;
        this.g = disableableViewPager;
        this.h = z2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        sba sbaVar;
        ArrayList arrayList = this.c;
        int h = e43.h(arrayList);
        ViewPagerVh viewPagerVh = this.b;
        int i = this.d;
        if (h >= 0) {
            DisableableViewPager disableableViewPager = viewPagerVh.o;
            if (disableableViewPager == null) {
                disableableViewPager = null;
            }
            if (disableableViewPager.getCurrentItem() > h) {
                DisableableViewPager disableableViewPager2 = viewPagerVh.o;
                DisableableViewPager disableableViewPager3 = disableableViewPager2 != null ? disableableViewPager2 : null;
                if (i <= h) {
                    h = i;
                }
                disableableViewPager3.setCurrentItem(h);
            }
        }
        viewPagerVh.c(viewPagerVh.b, arrayList, this.e, viewPagerVh.e, this.f);
        Integer num = viewPagerVh.u;
        if (num != null && num.intValue() < arrayList.size() && !this.h) {
            i = num.intValue();
        }
        DisableableViewPager disableableViewPager4 = this.g;
        disableableViewPager4.setCurrentItem(i);
        int currentItem = disableableViewPager4.getCurrentItem();
        sba sbaVar2 = viewPagerVh.s;
        if (!(sbaVar2 != null ? sbaVar2.b(currentItem) : false) && (sbaVar = viewPagerVh.s) != null) {
            sbaVar.x = new obt0(1, disableableViewPager4, viewPagerVh);
        }
        return s3q0.a;
    }
}
