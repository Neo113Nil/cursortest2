package com.yandex.div.core.view2.divs.tabs;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.state.DivPathUtils$getIds$2;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.core.view2.f;
import com.yandex.div.internal.widget.tabs.ScrollableViewPager;
import com.yandex.div.internal.widget.tabs.TabTitlesLayoutView;
import com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout;
import defpackage.aw5;
import defpackage.c05;
import defpackage.ct31;
import defpackage.ddf;
import defpackage.e05;
import defpackage.e3l;
import defpackage.e890;
import defpackage.g3l;
import defpackage.g5n;
import defpackage.g9l;
import defpackage.hgk;
import defpackage.j05;
import defpackage.k05;
import defpackage.kb;
import defpackage.kdl;
import defpackage.lml;
import defpackage.ndl;
import defpackage.nt31;
import defpackage.qc20;
import defpackage.rvo;
import defpackage.s8o;
import defpackage.sr4;
import defpackage.tcc;
import defpackage.udl;
import defpackage.uvo;
import defpackage.v4x0;
import defpackage.v8e;
import defpackage.vt31;
import defpackage.w2k;
import defpackage.w53;
import defpackage.ww31;
import defpackage.y7l;
import defpackage.z2l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.collections.EmptyList;

/* loaded from: classes11.dex */
public final class a {
    public final int A;
    public final vt31 a;
    public final View b;
    public final TabTitlesLayoutView c;
    public final ScrollableViewPager d;
    public final ViewPagerFixedSizeLayout e;
    public final nt31 f;
    public final String i;
    public final udl j;
    public final View o;
    public final boolean p;
    public aw5 q;
    public final f r;
    public final hgk s;
    public final udl t;
    public final ndl u;
    public com.yandex.div.core.state.b v;
    public final z2l w;
    public final LinkedHashMap x;
    public final LinkedHashMap y;
    public List z;
    public final w53 g = new w53();
    public final w53 h = new w53();
    public final e05 k = new e05(this);
    public boolean l = false;
    public j05 m = null;
    public boolean n = false;

    public a(vt31 vt31Var, DivTabsLayout divTabsLayout, kb kbVar, y7l y7lVar, boolean z, aw5 aw5Var, qc20 qc20Var, f fVar, hgk hgkVar, udl udlVar, ndl ndlVar, com.yandex.div.core.state.b bVar, z2l z2lVar) {
        g5n g5nVar;
        this.a = vt31Var;
        this.j = udlVar;
        int i = 1;
        sr4 sr4Var = new sr4(i, this);
        this.i = "DIV2.TAB_ITEM_VIEW";
        TabTitlesLayoutView tabTitlesLayoutView = (TabTitlesLayoutView) ww31.a(kbVar.a, divTabsLayout);
        this.c = tabTitlesLayoutView;
        tabTitlesLayoutView.setHost(sr4Var);
        tabTitlesLayoutView.setTypefaceProvider((lml) qc20Var.a);
        tabTitlesLayoutView.setViewPool(vt31Var, "DIV2.TAB_HEADER_VIEW");
        ScrollableViewPager scrollableViewPager = (ScrollableViewPager) ww31.a(kbVar.b, divTabsLayout);
        this.d = scrollableViewPager;
        int layoutDirection = scrollableViewPager.getResources().getConfiguration().getLayoutDirection();
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        scrollableViewPager.setLayoutDirection(layoutDirection);
        scrollableViewPager.setAdapter(null);
        scrollableViewPager.clearOnPageChangeListeners();
        scrollableViewPager.addOnPageChangeListener(new k05(i, this));
        ct31 customPageChangeListener = tabTitlesLayoutView.getCustomPageChangeListener();
        if (customPageChangeListener != null) {
            scrollableViewPager.addOnPageChangeListener(customPageChangeListener);
        }
        scrollableViewPager.addOnPageChangeListener(udlVar);
        scrollableViewPager.addOnPageChangeListener(ndlVar);
        scrollableViewPager.setScrollEnabled(true);
        scrollableViewPager.setEdgeScrollEnabled(false);
        scrollableViewPager.setPageTransformer(false, new ddf(27, this));
        ViewPagerFixedSizeLayout viewPagerFixedSizeLayout = (ViewPagerFixedSizeLayout) ww31.a(kbVar.c, divTabsLayout);
        this.e = viewPagerFixedSizeLayout;
        ViewGroup viewGroup = (ViewGroup) vt31Var.b("DIV2.TAB_ITEM_VIEW");
        c05 c05Var = new c05(this);
        c05 c05Var2 = new c05(this);
        switch (y7lVar.a) {
            case 14:
                g5nVar = new g5n(viewGroup, c05Var, c05Var2, 0);
                break;
            default:
                g5nVar = new g5n(viewGroup, c05Var, c05Var2, 1);
                break;
        }
        this.f = g5nVar;
        viewPagerFixedSizeLayout.setHeightCalculator(g5nVar);
        this.o = divTabsLayout;
        this.p = z;
        this.q = aw5Var;
        this.r = fVar;
        this.s = hgkVar;
        this.t = udlVar;
        this.u = ndlVar;
        this.v = bVar;
        this.w = z2lVar;
        this.x = new LinkedHashMap();
        this.y = new LinkedHashMap();
        this.z = EmptyList.a;
        this.A = -1;
    }

    public final w2k a(rvo rvoVar, w2k w2kVar, Div2View div2View) {
        g3l g3lVar = (g3l) this.w.a.get(this.q.a.getDataTag());
        if (g3lVar == null) {
            return null;
        }
        w2k w2kVar2 = (w2k) new com.yandex.div.core.downloader.a(g3lVar, new e3l(div2View, 1)).h(w2kVar, rvoVar).get(0);
        DisplayMetrics displayMetrics = this.q.a.getResources().getDisplayMetrics();
        List list = w2kVar2.c.q;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new g9l((kdl) it.next(), displayMetrics, rvoVar));
        }
        h(new v8e(20, arrayList));
        return w2kVar2;
    }

    public final ndl b() {
        return this.u;
    }

    public final com.yandex.div.core.state.b c(int i) {
        Object obj = this.z.get(i);
        LinkedHashMap linkedHashMap = this.y;
        Object obj2 = linkedHashMap.get(obj);
        if (obj2 == null) {
            obj2 = this.v.a((String) this.z.get(i));
            linkedHashMap.put(obj, obj2);
        }
        return (com.yandex.div.core.state.b) obj2;
    }

    public final udl d() {
        return this.t;
    }

    public final boolean e() {
        return this.p;
    }

    public final void f() {
        for (Map.Entry entry : this.x.entrySet()) {
            ViewGroup viewGroup = (ViewGroup) entry.getKey();
            v4x0 v4x0Var = (v4x0) entry.getValue();
            com.yandex.div.core.state.b c = c(v4x0Var.a);
            this.s.b(this.q, v4x0Var.c, v4x0Var.b, c);
            viewGroup.requestLayout();
        }
    }

    public final void g(aw5 aw5Var) {
        this.q = aw5Var;
    }

    public final void h(j05 j05Var) {
        ArrayList g;
        g = com.yandex.div.core.state.a.g(j05Var.c(), DivTabsAdapter$setData$1.w, DivPathUtils$getIds$2.w);
        this.z = g;
        rvo rvoVar = this.q.b;
        uvo n = s8o.n(this.o);
        ScrollableViewPager scrollableViewPager = this.d;
        int min = Math.min(scrollableViewPager.getCurrentItem(), j05Var.c().size() - 1);
        this.h.clear();
        this.m = j05Var;
        e890 adapter = scrollableViewPager.getAdapter();
        e05 e05Var = this.k;
        if (adapter != null) {
            this.n = true;
            try {
                e05Var.f();
            } finally {
                this.n = false;
            }
        }
        List<? extends g9l> c = j05Var.c();
        TabTitlesLayoutView tabTitlesLayoutView = this.c;
        tabTitlesLayoutView.setData(c, min, rvoVar, n);
        if (scrollableViewPager.getAdapter() == null) {
            scrollableViewPager.setAdapter(e05Var);
        } else if (!c.isEmpty() && min != -1) {
            scrollableViewPager.setCurrentItem(min);
            tabTitlesLayoutView.manuallyScroll(min);
        }
        nt31 nt31Var = this.f;
        if (nt31Var != null) {
            ((g5n) nt31Var).c.clear();
        }
        ViewPagerFixedSizeLayout viewPagerFixedSizeLayout = this.e;
        if (viewPagerFixedSizeLayout != null) {
            viewPagerFixedSizeLayout.requestLayout();
        }
        this.x.clear();
    }

    public final void i(int i) {
        if (this.A != i) {
            this.d.setCurrentItem(i, true);
        }
    }

    public final void j(com.yandex.div.core.state.b bVar) {
        this.v = bVar;
        this.y.clear();
    }
}
