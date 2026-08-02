package com.yandex.div.core.view2.divs.pager;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import defpackage.l2l;
import defpackage.qer;
import defpackage.tls;
import defpackage.zy11;

/* loaded from: classes.dex */
public final class d {
    public final DivPagerView a;
    public final a b;

    public d(DivPagerView divPagerView, int i, float f, qer qerVar, l2l l2lVar, boolean z, a aVar) {
        this.a = divPagerView;
        this.b = aVar;
        if (qerVar.a() == 0.0f) {
            return;
        }
        ViewPager2 viewPager = divPagerView.getViewPager();
        float a = i / (qerVar.a() + f);
        RecyclerView recyclerView = divPagerView.getRecyclerView();
        if (recyclerView != null) {
            recyclerView.setItemViewCacheSize(((int) Math.ceil(a)) + 2);
        }
        if (qerVar.c()) {
            viewPager.setOffscreenPageLimit(Math.max((int) Math.ceil(a - 1.0f), 1));
            return;
        }
        float b = qerVar.b();
        if (b > f) {
            viewPager.setOffscreenPageLimit(1);
            return;
        }
        if (z || (l2lVar.g >= b && l2lVar.h >= b)) {
            viewPager.setOffscreenPageLimit(-1);
            return;
        }
        final tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.divs.pager.FixedPageSizeOffScreenPagesController$setOffScreenPages$setOffScreenPages$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int intValue = ((Number) obj).intValue();
                ViewPager2 viewPager2 = d.this.a.getViewPager();
                int i2 = 1;
                if (intValue != 0 && intValue != d.this.b.G.size() - 1) {
                    i2 = -1;
                }
                viewPager2.setOffscreenPageLimit(i2);
                return zy11.a;
            }
        };
        tlsVar.invoke(Integer.valueOf(viewPager.getCurrentItem()));
        divPagerView.setChangePageCallbackForOffScreenPages$div_release(new DivPagerView.OffScreenPagesUpdateCallback() { // from class: com.yandex.div.core.view2.divs.pager.FixedPageSizeOffScreenPagesController$setOffScreenPages$1
            @Override // androidx.viewpager2.widget.ViewPager2.a
            public void onPageSelected(int position) {
                tls.this.invoke(Integer.valueOf(position));
            }
        });
    }
}
