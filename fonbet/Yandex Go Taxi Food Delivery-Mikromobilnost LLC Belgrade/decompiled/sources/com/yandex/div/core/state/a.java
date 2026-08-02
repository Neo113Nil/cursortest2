package com.yandex.div.core.state;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div2.DivContainer;
import defpackage.cbl;
import defpackage.cxk;
import defpackage.dbl;
import defpackage.egk;
import defpackage.i2k;
import defpackage.j2k;
import defpackage.jl40;
import defpackage.k2k;
import defpackage.l2k;
import defpackage.m2k;
import defpackage.m3k;
import defpackage.mmk;
import defpackage.mpb;
import defpackage.n2k;
import defpackage.ny61;
import defpackage.o2k;
import defpackage.p2k;
import defpackage.q2k;
import defpackage.r2k;
import defpackage.rvo;
import defpackage.s2k;
import defpackage.scc;
import defpackage.t1l;
import defpackage.t2k;
import defpackage.tcc;
import defpackage.tls;
import defpackage.tvo;
import defpackage.u2k;
import defpackage.v2k;
import defpackage.w2k;
import defpackage.w511;
import defpackage.x2k;
import defpackage.y2k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class a {
    public static b a(b bVar, String str, cbl cblVar, String str2) {
        String str3;
        m3k m3kVar;
        egk d;
        String str4;
        if (cblVar != null && (str4 = cblVar.d) != null) {
            str2 = str4;
        }
        if (cblVar == null || (m3kVar = cblVar.c) == null || (d = m3kVar.d()) == null || (str3 = d.getId()) == null) {
            str3 = str2;
        }
        bVar.getClass();
        List list = bVar.b;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(new Pair(str, str2));
        long j = bVar.a;
        List list2 = bVar.c;
        ArrayList arrayList2 = new ArrayList(list2.size() + 1);
        arrayList2.addAll(list2);
        arrayList2.add(str3);
        return new b(j, arrayList, arrayList2, 8);
    }

    public static m3k b(m3k m3kVar, rvo rvoVar, String str) {
        if (m3kVar instanceof u2k) {
            dbl dblVar = ((u2k) m3kVar).c;
            String str2 = dblVar.p;
            if (str2 == null && (str2 = dblVar.x) == null) {
                str2 = "";
            }
            if (!str2.equals(str)) {
                m3kVar = null;
            }
            u2k u2kVar = (u2k) m3kVar;
            return u2kVar != null ? u2kVar : c(dblVar.I, str, rvoVar, DivPathUtils$findByPath$2.w);
        }
        if (m3kVar instanceof w2k) {
            return c(((w2k) m3kVar).c.q, str, rvoVar, DivPathUtils$findByPath$3.w);
        }
        if (m3kVar instanceof i2k) {
            DivContainer divContainer = ((i2k) m3kVar).c;
            return d(str, com.yandex.div.internal.core.a.c(divContainer.B, divContainer.z, rvoVar));
        }
        boolean z = m3kVar instanceof m2k;
        DivPathUtils$findRecursively$1 divPathUtils$findRecursively$1 = DivPathUtils$findRecursively$1.w;
        if (z) {
            Iterable iterable = ((m2k) m3kVar).c.y;
            if (iterable == null) {
                iterable = EmptyList.a;
            }
            return c(iterable, str, rvoVar, divPathUtils$findRecursively$1);
        }
        if (m3kVar instanceof k2k) {
            return d(str, com.yandex.div.internal.core.a.b(((k2k) m3kVar).c, rvoVar));
        }
        if (m3kVar instanceof q2k) {
            t1l t1lVar = ((q2k) m3kVar).c;
            return d(str, com.yandex.div.internal.core.a.c(t1lVar.t, t1lVar.r, rvoVar));
        }
        if (m3kVar instanceof j2k) {
            List list = ((j2k) m3kVar).c.q;
            if (list != null) {
                return c(list, str, rvoVar, divPathUtils$findRecursively$1);
            }
            return null;
        }
        if ((m3kVar instanceof x2k) || (m3kVar instanceof n2k) || (m3kVar instanceof t2k) || (m3kVar instanceof p2k) || (m3kVar instanceof l2k) || (m3kVar instanceof o2k) || (m3kVar instanceof s2k) || (m3kVar instanceof r2k) || (m3kVar instanceof y2k) || (m3kVar instanceof v2k)) {
            return null;
        }
        w511.b();
        return null;
    }

    public static m3k c(Iterable iterable, String str, rvo rvoVar, tls tlsVar) {
        m3k m3kVar;
        Iterator it = iterable.iterator();
        do {
            m3kVar = null;
            if (!it.hasNext()) {
                break;
            }
            m3k m3kVar2 = (m3k) tlsVar.invoke(it.next());
            if (m3kVar2 != null) {
                m3kVar = b(m3kVar2, rvoVar, str);
            }
        } while (m3kVar == null);
        return m3kVar;
    }

    public static m3k d(String str, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            cxk cxkVar = (cxk) it.next();
            m3k b = b(cxkVar.a, cxkVar.b, str);
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    public static DivStateLayout e(View view, b bVar) {
        DivStateLayout divStateLayout;
        b path;
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if ((view instanceof DivStateLayout) && (path = (divStateLayout = (DivStateLayout) view).getPath()) != null) {
            if (bVar.d ? jl40.l(path.d(), bVar.d()) : jl40.l(path.f().b(), bVar.f().b())) {
                return divStateLayout;
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        DivStateLayout divStateLayout2 = null;
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                return divStateLayout2;
            }
            int i2 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                ny61.s();
                return null;
            }
            DivStateLayout e = e(childAt, bVar);
            if (e != null) {
                if (String.valueOf(divStateLayout2 != null ? divStateLayout2.getPath() : null).equals(String.valueOf(e.getPath()))) {
                    StringBuilder sb = new StringBuilder("Error resolving state for '");
                    sb.append(bVar);
                    b path2 = e.getPath();
                    sb.append("'. Found multiple elements that respond to path '");
                    sb.append(path2);
                    sb.append("'!");
                    throw new StateConflictException(sb.toString(), null);
                }
                divStateLayout2 = e;
            }
            i = i2;
        }
    }

    public static ArrayList f(List list) {
        return g(list, DivPathUtils$getIds$1.w, DivPathUtils$getIds$2.w);
    }

    public static ArrayList g(List list, tls tlsVar, tls tlsVar2) {
        String id;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            String str = "";
            if (!it.hasNext()) {
                break;
            }
            egk d = ((m3k) tlsVar.invoke(it.next())).d();
            if (d instanceof dbl) {
                dbl dblVar = (dbl) d;
                String str2 = dblVar.p;
                if (str2 == null) {
                    String str3 = dblVar.x;
                    if (str3 != null) {
                        str = str3;
                    }
                } else {
                    str = str2;
                }
            } else {
                str = d.getId();
            }
            if (str != null) {
                Integer num = (Integer) linkedHashMap.get(str);
                linkedHashMap.put(str, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            }
        }
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            egk d2 = ((m3k) tlsVar.invoke(obj)).d();
            if (d2 instanceof dbl) {
                dbl dblVar2 = (dbl) d2;
                id = dblVar2.p;
                if (id == null && (id = dblVar2.x) == null) {
                    id = "";
                }
            } else {
                id = d2.getId();
            }
            if (id != null) {
                Integer num2 = (Integer) linkedHashMap.get(id);
                if ((num2 != null ? num2.intValue() : 0) > 1) {
                    id = id + '#' + i;
                }
            } else {
                tvo tvoVar = (tvo) tlsVar2.invoke(obj);
                String str4 = tvoVar != null ? tvoVar.g : null;
                id = str4 == null ? mpb.a(i) : str4;
            }
            arrayList.add(id);
            i = i2;
        }
        return arrayList;
    }

    public static ArrayList i(List list) {
        return g(list, DivPathUtils$getItemIds$1.w, DivPathUtils$getItemIds$2.w);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (e(r7, r2) == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r7 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r8.b == r9.a) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0062, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair j(View view, mmk mmkVar, b bVar, rvo rvoVar) {
        u2k u2kVar;
        DivStateLayout e = e(view, bVar);
        if (e == null) {
            b f = bVar.f();
            if (f.b.isEmpty()) {
            }
        }
        if (e == null || (u2kVar = e.getDiv()) == null) {
            m3k m3kVar = mmkVar.a;
            List list = bVar.b;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) ((Pair) it.next()).getFirst();
                    if (m3kVar != null && (m3kVar = b(m3kVar, rvoVar, str)) != null) {
                    }
                }
                u2kVar = !(m3kVar instanceof u2k) ? (u2k) m3kVar : null;
            }
            m3kVar = null;
            if (!(m3kVar instanceof u2k)) {
            }
        }
        return new Pair(e, u2kVar);
    }
}
