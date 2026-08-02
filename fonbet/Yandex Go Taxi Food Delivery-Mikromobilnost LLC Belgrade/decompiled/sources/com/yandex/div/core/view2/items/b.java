package com.yandex.div.core.view2.items;

import android.util.DisplayMetrics;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import defpackage.oj91;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes11.dex */
public final class b extends oj91 {
    public final DivPagerView b;
    public final DisplayMetrics c;

    public b(DivPagerView divPagerView) {
        this.b = divPagerView;
        this.c = divPagerView.getResources().getDisplayMetrics();
    }

    @Override // defpackage.oj91
    public final int c() {
        return this.b.getViewPager().getCurrentItem();
    }

    @Override // defpackage.oj91
    public final List d(String str) {
        RecyclerView.Adapter adapter = this.b.getViewPager().getAdapter();
        com.yandex.div.core.view2.divs.pager.a aVar = adapter instanceof com.yandex.div.core.view2.divs.pager.a ? (com.yandex.div.core.view2.divs.pager.a) adapter : null;
        if (aVar == null) {
            return EmptyList.a;
        }
        ArrayList a = d.a(aVar.g(), str, DivViewWithItems$Pager$getIndicesOfItemWithId$1.w);
        ArrayList arrayList = new ArrayList(tcc.n(a, 10));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(aVar.m() + ((Number) it.next()).intValue()));
        }
        return arrayList;
    }

    @Override // defpackage.oj91
    public final int e() {
        RecyclerView.Adapter adapter = this.b.getViewPager().getAdapter();
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    @Override // defpackage.oj91
    public final DisplayMetrics f() {
        return this.c;
    }

    @Override // defpackage.oj91
    public final void j(boolean z) {
        this.b.getViewPager().setCurrentItem(e() - 1, z);
    }

    @Override // defpackage.oj91
    public final void k(int i) {
        int e = e();
        if (i < 0 || i >= e) {
            return;
        }
        this.b.getViewPager().setCurrentItem(i, true);
    }

    @Override // defpackage.oj91
    public final void l(int i) {
        int e = e();
        if (i < 0 || i >= e) {
            return;
        }
        this.b.getViewPager().setCurrentItem(i, false);
    }
}
