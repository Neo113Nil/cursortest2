package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.view2.divs.widgets.DivCustomWrapper;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.internal.core.a;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivGallery;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes11.dex */
public final class kmo extends zmz0 {
    public final View e;
    public final kmo f;

    public kmo(cxk cxkVar, int i, View view, kmo kmoVar) {
        super(cxkVar, i);
        this.e = view;
        this.f = kmoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.List] */
    public final List b(kmo kmoVar) {
        m3k activeStateDiv;
        ViewPager2 viewPager;
        View itemView;
        m3k m3kVar = this.d;
        boolean z = m3kVar instanceof x2k;
        EmptyList emptyList = EmptyList.a;
        if (!z && !(m3kVar instanceof n2k) && !(m3kVar instanceof l2k) && !(m3kVar instanceof s2k) && !(m3kVar instanceof o2k) && !(m3kVar instanceof t2k) && !(m3kVar instanceof p2k) && !(m3kVar instanceof r2k) && !(m3kVar instanceof y2k) && !(m3kVar instanceof v2k)) {
            boolean z2 = m3kVar instanceof i2k;
            cxk cxkVar = this.a;
            if (z2) {
                DivContainer divContainer = ((i2k) m3kVar).c;
                return d(a.c(divContainer.B, divContainer.z, cxkVar.b), kmoVar);
            }
            boolean z3 = m3kVar instanceof j2k;
            int i = 0;
            View view = this.e;
            if (z3) {
                clk clkVar = ((j2k) m3kVar).c;
                rvo rvoVar = cxkVar.b;
                ArrayList arrayList = new ArrayList();
                DivCustomWrapper divCustomWrapper = view instanceof DivCustomWrapper ? (DivCustomWrapper) view : null;
                View customView = divCustomWrapper != null ? divCustomWrapper.getCustomView() : null;
                ViewGroup viewGroup = customView instanceof ViewGroup ? (ViewGroup) customView : null;
                if (viewGroup != null) {
                    List list = clkVar.q;
                    if (list == null) {
                        list = emptyList;
                    }
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            scc.m();
                            throw null;
                        }
                        cxk cxkVar2 = new cxk((m3k) obj, rvoVar);
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt != null) {
                            arrayList.add(new kmo(cxkVar2, i, childAt, kmoVar == null ? this : kmoVar));
                            i = i2;
                        }
                    }
                    return arrayList;
                }
            } else {
                if (m3kVar instanceof m2k) {
                    hsk hskVar = ((m2k) m3kVar).c;
                    rvo rvoVar2 = cxkVar.b;
                    ?? r0 = hskVar.y;
                    if (r0 != 0) {
                        emptyList = r0;
                    }
                    return d(a.h(emptyList, rvoVar2), kmoVar);
                }
                if (m3kVar instanceof k2k) {
                    DivGallery divGallery = ((k2k) m3kVar).c;
                    rvo rvoVar3 = cxkVar.b;
                    ArrayList arrayList2 = new ArrayList();
                    DivRecyclerView divRecyclerView = view instanceof DivRecyclerView ? (DivRecyclerView) view : null;
                    RecyclerView.Adapter adapter = divRecyclerView != null ? divRecyclerView.getAdapter() : null;
                    com.yandex.div.core.view2.divs.gallery.a aVar = adapter instanceof com.yandex.div.core.view2.divs.gallery.a ? (com.yandex.div.core.view2.divs.gallery.a) adapter : null;
                    if (aVar != null) {
                        ArrayList g = aVar.g();
                        ArrayList arrayList3 = new ArrayList(tcc.n(g, 10));
                        Iterator it = g.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(Integer.valueOf(((cxk) it.next()).a.b()));
                        }
                        for (Object obj2 : a.b(divGallery, rvoVar3)) {
                            int i3 = i + 1;
                            if (i < 0) {
                                scc.m();
                                throw null;
                            }
                            cxk cxkVar3 = (cxk) obj2;
                            if (arrayList3.contains(Integer.valueOf(cxkVar3.a.b())) && (itemView = ((DivRecyclerView) view).getItemView(i)) != null) {
                                arrayList2.add(new kmo(cxkVar3, i, itemView, kmoVar == null ? this : kmoVar));
                            }
                            i = i3;
                        }
                        return arrayList2;
                    }
                } else if (m3kVar instanceof q2k) {
                    t1l t1lVar = ((q2k) m3kVar).c;
                    rvo rvoVar4 = cxkVar.b;
                    ArrayList arrayList4 = new ArrayList();
                    DivPagerView divPagerView = view instanceof DivPagerView ? (DivPagerView) view : null;
                    if (divPagerView != null && (viewPager = divPagerView.getViewPager()) != null) {
                        RecyclerView.Adapter adapter2 = viewPager.getAdapter();
                        com.yandex.div.core.view2.divs.pager.a aVar2 = adapter2 instanceof com.yandex.div.core.view2.divs.pager.a ? (com.yandex.div.core.view2.divs.pager.a) adapter2 : null;
                        if (aVar2 != null) {
                            u1l u1lVar = aVar2.G;
                            ArrayList arrayList5 = new ArrayList(tcc.n(u1lVar, 10));
                            Iterator it2 = u1lVar.iterator();
                            while (it2.hasNext()) {
                                arrayList5.add(Integer.valueOf(((cxk) it2.next()).a.b()));
                            }
                            for (Object obj3 : a.c(t1lVar.t, t1lVar.r, rvoVar4)) {
                                int i4 = i + 1;
                                if (i < 0) {
                                    scc.m();
                                    throw null;
                                }
                                cxk cxkVar4 = (cxk) obj3;
                                if (arrayList5.contains(Integer.valueOf(cxkVar4.a.b()))) {
                                    View pageView = ((DivPagerView) view).getPageView(arrayList5.indexOf(Integer.valueOf(cxkVar4.a.b())));
                                    if (pageView != null) {
                                        arrayList4.add(new kmo(cxkVar4, i, pageView, kmoVar == null ? this : kmoVar));
                                    }
                                }
                                i = i4;
                            }
                            return arrayList4;
                        }
                    }
                } else {
                    if (m3kVar instanceof w2k) {
                        final Class<?> cls = m3kVar.getClass();
                        throw new IllegalArgumentException(cls) { // from class: com.yandex.div.core.view2.reuse.RebindTask$UnsupportedElementException
                            private final String message;

                            {
                                this.message = cls + " is unsupported by complex rebind";
                            }

                            @Override // java.lang.Throwable
                            public final String getMessage() {
                                return this.message;
                            }
                        };
                    }
                    if (!(m3kVar instanceof u2k)) {
                        w511.b();
                        return null;
                    }
                    rvo rvoVar5 = cxkVar.b;
                    DivStateLayout divStateLayout = view instanceof DivStateLayout ? (DivStateLayout) view : null;
                    if (divStateLayout != null && (activeStateDiv = divStateLayout.getActiveStateDiv()) != null) {
                        return d(a.h(Collections.singletonList(activeStateDiv), rvoVar5), kmoVar);
                    }
                }
            }
        }
        return emptyList;
    }

    public final View c() {
        return this.e;
    }

    public final List d(List list, kmo kmoVar) {
        View childAt;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            cxk cxkVar = (cxk) obj;
            View view = this.e;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (childAt = viewGroup.getChildAt(i)) == null) {
                return EmptyList.a;
            }
            arrayList.add(new kmo(cxkVar, i, childAt, kmoVar == null ? this : kmoVar));
            i = i2;
        }
        return arrayList;
    }
}
