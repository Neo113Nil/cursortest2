package com.yandex.div.core.downloader;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivPatch$Mode;
import defpackage.cbl;
import defpackage.clk;
import defpackage.dbl;
import defpackage.eg90;
import defpackage.egk;
import defpackage.g3l;
import defpackage.hsk;
import defpackage.i2k;
import defpackage.j2k;
import defpackage.jl40;
import defpackage.k2k;
import defpackage.kdl;
import defpackage.m2k;
import defpackage.m3k;
import defpackage.mdl;
import defpackage.mmk;
import defpackage.ny61;
import defpackage.q2k;
import defpackage.qv10;
import defpackage.rvo;
import defpackage.scc;
import defpackage.sls;
import defpackage.t1l;
import defpackage.tcc;
import defpackage.tls;
import defpackage.u2k;
import defpackage.w2k;
import defpackage.w53;
import defpackage.wfx;
import defpackage.ycc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.EmptyList;

/* loaded from: classes11.dex */
public final class a {
    public final g3l a;
    public final eg90 b;
    public final LinkedHashSet c = new LinkedHashSet();

    public a(g3l g3lVar, eg90 eg90Var) {
        this.a = g3lVar;
        this.b = eg90Var;
    }

    public static View j(View view, m3k m3kVar, String str) {
        RecyclerView.Adapter adapter;
        q2k div;
        List list;
        k2k div2;
        DivGallery divGallery;
        List list2;
        int i = 0;
        if (view instanceof DivRecyclerView) {
            DivRecyclerView divRecyclerView = (DivRecyclerView) view;
            if (divRecyclerView.getDiv() == m3kVar) {
                RecyclerView.Adapter adapter2 = divRecyclerView.getAdapter();
                com.yandex.div.core.view2.divs.gallery.a aVar = adapter2 instanceof com.yandex.div.core.view2.divs.gallery.a ? (com.yandex.div.core.view2.divs.gallery.a) adapter2 : null;
                if (aVar != null && (div2 = divRecyclerView.getDiv()) != null && (divGallery = div2.c) != null && (list2 = divGallery.u) != null) {
                    for (Object obj : list2) {
                        int i2 = i + 1;
                        if (i < 0) {
                            scc.m();
                            throw null;
                        }
                        if (jl40.l(((m3k) obj).d().getId(), str)) {
                            aVar.notifyItemChanged(i);
                            return view;
                        }
                        i = i2;
                    }
                }
                return view;
            }
        } else if (view instanceof DivPagerView) {
            DivPagerView divPagerView = (DivPagerView) view;
            if (divPagerView.getDiv() == m3kVar) {
                View childAt = divPagerView.getViewPager().getChildAt(0);
                RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
                if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null && (div = divPagerView.getDiv()) != null && (list = div.c.t) != null) {
                    for (Object obj2 : list) {
                        int i3 = i + 1;
                        if (i < 0) {
                            scc.m();
                            throw null;
                        }
                        if (jl40.l(((m3k) obj2).d().getId(), str)) {
                            adapter.notifyItemChanged(i);
                            return view;
                        }
                        i = i3;
                    }
                }
                return view;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i4 = 0;
            while (true) {
                if (!(i4 < viewGroup.getChildCount())) {
                    break;
                }
                int i5 = i4 + 1;
                View childAt2 = viewGroup.getChildAt(i4);
                if (childAt2 == null) {
                    ny61.s();
                    break;
                }
                View j = j(childAt2, m3kVar, str);
                if (j != null) {
                    return j;
                }
                i4 = i5;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.List] */
    public static List n(m3k m3kVar, String str, ArrayList arrayList) {
        egk d;
        arrayList.add(m3kVar);
        egk d2 = m3kVar.d();
        boolean z = d2 instanceof DivContainer;
        EmptyList emptyList = EmptyList.a;
        if (z) {
            ?? r3 = ((DivContainer) d2).B;
            if (r3 != 0) {
                emptyList = r3;
            }
            return o(str, arrayList, emptyList);
        }
        if (d2 instanceof hsk) {
            ?? r32 = ((hsk) d2).y;
            if (r32 != 0) {
                emptyList = r32;
            }
            return o(str, arrayList, emptyList);
        }
        if (d2 instanceof DivGallery) {
            ?? r33 = ((DivGallery) d2).u;
            if (r33 != 0) {
                emptyList = r33;
            }
            return o(str, arrayList, emptyList);
        }
        if (d2 instanceof t1l) {
            ?? r34 = ((t1l) d2).t;
            if (r34 != 0) {
                emptyList = r34;
            }
            return o(str, arrayList, emptyList);
        }
        if (d2 instanceof mdl) {
            List list = ((mdl) d2).q;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (jl40.l(((kdl) it.next()).a.d().getId(), str)) {
                        return arrayList;
                    }
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                List n = n(((kdl) it2.next()).a, str, arrayList);
                if (!n.isEmpty()) {
                    return n;
                }
                arrayList.remove(scc.f(arrayList));
            }
            return emptyList;
        }
        if (d2 instanceof dbl) {
            List list2 = ((dbl) d2).I;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    m3k m3kVar2 = ((cbl) it3.next()).c;
                    if (jl40.l((m3kVar2 == null || (d = m3kVar2.d()) == null) ? null : d.getId(), str)) {
                        return arrayList;
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                m3k m3kVar3 = ((cbl) it4.next()).c;
                if (m3kVar3 != null) {
                    arrayList2.add(m3kVar3);
                }
            }
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                List n2 = n((m3k) it5.next(), str, arrayList);
                if (!n2.isEmpty()) {
                    return n2;
                }
                arrayList.remove(scc.f(arrayList));
            }
        }
        return emptyList;
    }

    public static List o(String str, ArrayList arrayList, List list) {
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (jl40.l(((m3k) it.next()).d().getId(), str)) {
                    return arrayList;
                }
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            List n = n((m3k) it2.next(), str, arrayList);
            if (!n.isEmpty()) {
                return n;
            }
            arrayList.remove(scc.f(arrayList));
        }
        return EmptyList.a;
    }

    public final i2k a(DivContainer divContainer, rvo rvoVar) {
        return new i2k(DivContainer.B(divContainer, null, null, i(divContainer.B, rvoVar), -134217729));
    }

    public final k2k b(DivGallery divGallery, rvo rvoVar) {
        return new k2k(DivGallery.B(divGallery, null, i(divGallery.u, rvoVar), -1048577));
    }

    public final m2k c(hsk hskVar, rvo rvoVar) {
        return new m2k(hsk.B(hskVar, null, i(hskVar.y, rvoVar), -16777217));
    }

    public final q2k d(t1l t1lVar, rvo rvoVar) {
        return new q2k(t1l.B(t1lVar, null, i(t1lVar.t, rvoVar), -524289));
    }

    public final u2k e(dbl dblVar, rvo rvoVar) {
        egk d;
        List list = dblVar.I;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                return new u2k(dbl.B(dblVar, null, null, arrayList, -1));
            }
            cbl cblVar = (cbl) it.next();
            m3k m3kVar = cblVar.c;
            if (m3kVar != null && (d = m3kVar.d()) != null) {
                str = d.getId();
            }
            if (str != null) {
                List list2 = (List) this.a.a.get(str);
                LinkedHashSet linkedHashSet = this.c;
                if (list2 != null && list2.size() == 1) {
                    arrayList.add(new cbl(cblVar.a, cblVar.b, (m3k) list2.get(0), cblVar.d, cblVar.e));
                    linkedHashSet.add(str);
                } else if (list2 == null || !list2.isEmpty()) {
                    arrayList.add(p(cblVar, rvoVar));
                } else {
                    linkedHashSet.add(str);
                }
            } else {
                arrayList.add(p(cblVar, rvoVar));
            }
        }
    }

    public final w2k f(mdl mdlVar, rvo rvoVar) {
        ArrayList arrayList = new ArrayList();
        for (kdl kdlVar : mdlVar.q) {
            List h = h(kdlVar.a, rvoVar);
            if (h.size() == 1) {
                arrayList.add(new kdl((m3k) h.get(0), kdlVar.b, kdlVar.c));
            } else {
                int i = wfx.a;
                arrayList.add(kdlVar);
            }
        }
        return new w2k(mdl.B(mdlVar, null, arrayList, -65537));
    }

    public final ArrayList g(List list, rvo rvoVar) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mmk mmkVar = (mmk) it.next();
            m3k m3kVar = mmkVar.a;
            long j = mmkVar.b;
            List h = h(m3kVar, rvoVar);
            if (h.size() <= 0) {
                this.b.a(new RuntimeException(qv10.k(j, "Patch contains empty or invalid div for state '", "'!")));
                return null;
            }
            arrayList.add(new mmk((m3k) h.get(0), j));
        }
        g3l g3lVar = this.a;
        if (g3lVar.b.a(rvoVar) != DivPatch$Mode.TRANSACTIONAL || this.c.size() == g3lVar.a.c) {
            return arrayList;
        }
        return null;
    }

    public final List h(m3k m3kVar, rvo rvoVar) {
        List list;
        w53 w53Var = this.a.a;
        String id = m3kVar.d().getId();
        if (id != null && w53Var.containsKey(id)) {
            String id2 = m3kVar.d().getId();
            if (id2 != null && (list = (List) w53Var.get(id2)) != null) {
                this.c.add(id2);
                return list;
            }
            return Collections.singletonList(m3kVar);
        }
        if (m3kVar instanceof i2k) {
            m3kVar = a(((i2k) m3kVar).c, rvoVar);
        } else if (m3kVar instanceof m2k) {
            m3kVar = c(((m2k) m3kVar).c, rvoVar);
        } else if (m3kVar instanceof k2k) {
            m3kVar = b(((k2k) m3kVar).c, rvoVar);
        } else if (m3kVar instanceof q2k) {
            m3kVar = d(((q2k) m3kVar).c, rvoVar);
        } else if (m3kVar instanceof u2k) {
            m3kVar = e(((u2k) m3kVar).c, rvoVar);
        } else if (m3kVar instanceof w2k) {
            m3kVar = f(((w2k) m3kVar).c, rvoVar);
        } else if (m3kVar instanceof j2k) {
            clk clkVar = ((j2k) m3kVar).c;
            m3kVar = new j2k(clk.B(clkVar, null, i(clkVar.q, rvoVar), -65537));
        }
        return Collections.singletonList(m3kVar);
    }

    public final ArrayList i(List list, rvo rvoVar) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ycc.r(h((m3k) it.next(), rvoVar), arrayList);
        }
        return arrayList;
    }

    public final m3k k(m3k m3kVar, List list, Iterator it, rvo rvoVar, tls tlsVar, sls slsVar) {
        if (!it.hasNext()) {
            return (m3k) slsVar.invoke();
        }
        int indexOf = list.indexOf((m3k) it.next());
        if (indexOf == -1) {
            return m3kVar;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.set(indexOf, l((m3k) arrayList.get(indexOf), it, rvoVar));
        return (m3k) tlsVar.invoke(arrayList);
    }

    public final m3k l(m3k m3kVar, Iterator it, final rvo rvoVar) {
        cbl cblVar;
        m3k m3kVar2;
        egk d = m3kVar.d();
        boolean z = d instanceof DivContainer;
        List list = EmptyList.a;
        if (z) {
            final DivContainer divContainer = (DivContainer) d;
            List list2 = divContainer.B;
            return k(m3kVar, list2 == null ? list : list2, it, rvoVar, new tls() { // from class: com.yandex.div.core.downloader.DivPatchApply$getPatchedTreeByPath$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    return new i2k(DivContainer.B((DivContainer) divContainer, null, null, (List) obj, -134217729));
                }
            }, new sls() { // from class: com.yandex.div.core.downloader.DivPatchApply$getPatchedTreeByPath$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    a aVar = a.this;
                    return new a(aVar.a, aVar.b).a((DivContainer) divContainer, rvoVar);
                }
            });
        }
        if (d instanceof hsk) {
            final hsk hskVar = (hsk) d;
            List list3 = hskVar.y;
            if (list3 != null) {
                list = list3;
            }
            return k(m3kVar, list, it, rvoVar, new tls() { // from class: com.yandex.div.core.downloader.DivPatchApply$getPatchedTreeByPath$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    return new m2k(hsk.B((hsk) hskVar, null, (List) obj, -16777217));
                }
            }, new sls() { // from class: com.yandex.div.core.downloader.DivPatchApply$getPatchedTreeByPath$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    a aVar = a.this;
                    return new a(aVar.a, aVar.b).c((hsk) hskVar, rvoVar);
                }
            });
        }
        if (d instanceof DivGallery) {
            final DivGallery divGallery = (DivGallery) d;
            List list4 = divGallery.u;
            if (list4 != null) {
                list = list4;
            }
            return k(m3kVar, list, it, rvoVar, new tls() { // from class: com.yandex.div.core.downloader.DivPatchApply$getPatchedTreeByPath$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    return new k2k(DivGallery.B((DivGallery) divGallery, null, (List) obj, -1048577));
                }
            }, new sls() { // from class: com.yandex.div.core.downloader.DivPatchApply$getPatchedTreeByPath$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    a aVar = a.this;
                    return new a(aVar.a, aVar.b).b((DivGallery) divGallery, rvoVar);
                }
            });
        }
        if (d instanceof t1l) {
            final t1l t1lVar = (t1l) d;
            List list5 = t1lVar.t;
            if (list5 != null) {
                list = list5;
            }
            return k(m3kVar, list, it, rvoVar, new tls() { // from class: com.yandex.div.core.downloader.DivPatchApply$getPatchedTreeByPath$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    return new q2k(t1l.B((t1l) t1lVar, null, (List) obj, -524289));
                }
            }, new sls() { // from class: com.yandex.div.core.downloader.DivPatchApply$getPatchedTreeByPath$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    a aVar = a.this;
                    return new a(aVar.a, aVar.b).d((t1l) t1lVar, rvoVar);
                }
            });
        }
        boolean z2 = d instanceof mdl;
        eg90 eg90Var = this.b;
        g3l g3lVar = this.a;
        if (z2) {
            if (!it.hasNext()) {
                return new a(g3lVar, eg90Var).f((mdl) d, rvoVar);
            }
            mdl mdlVar = (mdl) d;
            ArrayList arrayList = new ArrayList(mdlVar.q);
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((kdl) it2.next()).a);
            }
            int indexOf = arrayList2.indexOf(it.next());
            if (indexOf == -1) {
                return m3kVar;
            }
            kdl kdlVar = (kdl) arrayList.get(indexOf);
            arrayList.set(indexOf, new kdl(l(kdlVar.a, it, rvoVar), kdlVar.b, kdlVar.c));
            return new w2k(mdl.B(mdlVar, null, arrayList, -65537));
        }
        if (d instanceof dbl) {
            if (!it.hasNext()) {
                return new a(g3lVar, eg90Var).e((dbl) d, rvoVar);
            }
            dbl dblVar = (dbl) d;
            ArrayList arrayList3 = new ArrayList(dblVar.I);
            ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((cbl) it3.next()).c);
            }
            int indexOf2 = arrayList4.indexOf(it.next());
            if (indexOf2 != -1 && (m3kVar2 = (cblVar = (cbl) arrayList3.get(indexOf2)).c) != null) {
                arrayList3.set(indexOf2, new cbl(cblVar.a, cblVar.b, l(m3kVar2, it, rvoVar), cblVar.d, cblVar.e));
                return new u2k(dbl.B(dblVar, null, null, arrayList3, -1));
            }
        }
        return m3kVar;
    }

    public final m3k m(ViewGroup viewGroup, m3k m3kVar, String str, rvo rvoVar) {
        List n = n(m3kVar, str, new ArrayList());
        Iterator it = n.iterator();
        Object obj = null;
        if (n.isEmpty()) {
            return null;
        }
        it.next();
        ListIterator listIterator = n.listIterator(n.size());
        while (listIterator.hasPrevious()) {
            Object previous = listIterator.previous();
            m3k m3kVar2 = (m3k) previous;
            if ((m3kVar2 instanceof k2k) || (m3kVar2 instanceof q2k)) {
                obj = previous;
                break;
            }
        }
        m3k m3kVar3 = (m3k) obj;
        if (m3kVar3 != null) {
            j(viewGroup, m3kVar3, str);
        }
        return l(m3kVar, it, rvoVar);
    }

    public final cbl p(cbl cblVar, rvo rvoVar) {
        m3k m3kVar = cblVar.c;
        List h = m3kVar != null ? h(m3kVar, rvoVar) : null;
        return (h == null || h.size() != 1) ? cblVar : new cbl(cblVar.a, cblVar.b, (m3k) h.get(0), cblVar.d, cblVar.e);
    }
}
