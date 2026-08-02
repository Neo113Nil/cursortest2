package com.yandex.div.core.view2.items;

import android.util.DisplayMetrics;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import defpackage.e890;
import defpackage.oj91;
import defpackage.v4x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* loaded from: classes11.dex */
public final class c extends oj91 {
    public final DivTabsLayout b;
    public final DisplayMetrics c;

    public c(DivTabsLayout divTabsLayout) {
        this.b = divTabsLayout;
        this.c = divTabsLayout.getResources().getDisplayMetrics();
    }

    @Override // defpackage.oj91
    public final int c() {
        return this.b.getViewPager().getCurrentItem();
    }

    @Override // defpackage.oj91
    public final List d(String str) {
        com.yandex.div.core.view2.divs.tabs.a divTabsAdapter = this.b.getDivTabsAdapter();
        if (divTabsAdapter == null) {
            return EmptyList.a;
        }
        LinkedHashMap linkedHashMap = divTabsAdapter.x;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(((v4x0) ((Map.Entry) it.next()).getValue()).b);
        }
        return d.a(arrayList, str, DivViewWithItems$Tabs$getIndicesOfItemWithId$1.w);
    }

    @Override // defpackage.oj91
    public final int e() {
        e890 adapter = this.b.getViewPager().getAdapter();
        if (adapter != null) {
            return adapter.b();
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
