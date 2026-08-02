package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.yandex.taxi.summary.requirements.list.mapper.DomainMergeGluedException;

/* loaded from: classes10.dex */
public final class cq40 {
    public final po40 a;
    public final tp40 b;

    public cq40(po40 po40Var, tp40 tp40Var) {
        this.a = po40Var;
        this.b = tp40Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:299:0x03a5, code lost:
    
        if (r13.p != r4.p) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x03a8, code lost:
    
        r4 = true;
        r33 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x03c4, code lost:
    
        if (((defpackage.kmw0) r11).h.equals(((defpackage.kmw0) r14).h) == false) goto L159;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:198:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05fc  */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r33v10 */
    /* JADX WARN: Type inference failed for: r33v11 */
    /* JADX WARN: Type inference failed for: r33v12 */
    /* JADX WARN: Type inference failed for: r33v13 */
    /* JADX WARN: Type inference failed for: r33v14 */
    /* JADX WARN: Type inference failed for: r33v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r33v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r33v8 */
    /* JADX WARN: Type inference failed for: r33v9 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a(List list, Set set, boolean z) {
        Object obj;
        Iterable iterable;
        Collection collection;
        Object obj2;
        boolean h;
        Object obj3;
        Object obj4;
        ?? r33;
        Collection collection2;
        ArrayList arrayList;
        String e;
        String e2;
        lmw0 lmw0Var;
        this.a.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = set.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (jl40.l(((pex0) next).b, str)) {
                    obj = next;
                    break;
                }
            }
            pex0 pex0Var = (pex0) obj;
            if (pex0Var != null) {
                arrayList2.add(pex0Var);
            }
        }
        boolean isEmpty = arrayList2.isEmpty();
        List list2 = arrayList2;
        if (isEmpty) {
            list2 = list;
        }
        ArrayList a = po40.a(list2, list);
        ArrayList a2 = po40.a(list, list);
        boolean isEmpty2 = a2.isEmpty();
        EmptyList emptyList = EmptyList.a;
        if (isEmpty2) {
            return emptyList;
        }
        boolean z2 = true;
        if (z) {
            ArrayList o = tcc.o(a2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it3 = o.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                String name = ((lmw0) next2).getName();
                Object obj5 = linkedHashMap.get(name);
                if (obj5 == null) {
                    obj5 = qv10.w(name, linkedHashMap);
                }
                ((List) obj5).add(next2);
            }
            iterable = new ArrayList();
            Iterator it4 = linkedHashMap.entrySet().iterator();
            while (it4.hasNext()) {
                List list3 = (List) ((Map.Entry) it4.next()).getValue();
                List list4 = list3;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it5 = list4.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        }
                        if (((lmw0) it5.next()).f()) {
                            Iterator it6 = list4.iterator();
                            if (!it6.hasNext()) {
                                w511.x("Empty collection can't be reduced.");
                                return null;
                            }
                            Object next3 = it6.next();
                            while (it6.hasNext()) {
                                lmw0 lmw0Var2 = (lmw0) it6.next();
                                lmw0 lmw0Var3 = (lmw0) next3;
                                if (lmw0Var3 == null) {
                                    next3 = lmw0Var2;
                                } else {
                                    if (jl40.l(lmw0Var3.getName(), lmw0Var2.getName())) {
                                        if ((lmw0Var3 instanceof hmw0) && (lmw0Var2 instanceof hmw0)) {
                                            hmw0 hmw0Var = (hmw0) lmw0Var3;
                                            String str2 = hmw0Var.r;
                                            hmw0 hmw0Var2 = (hmw0) lmw0Var2;
                                            vg70 H = bvf0.H(hmw0Var.j, hmw0Var2.j);
                                            if (H != null) {
                                                next3 = hmw0.v(hmw0Var, null, H, Math.max(hmw0Var.m, hmw0Var2.m), hmw0Var.n || hmw0Var2.n, hmw0Var.o && hmw0Var2.o, null, jl40.l(str2, hmw0Var2.r) ? str2 : "", null, 4153983);
                                            }
                                        } else if ((lmw0Var3 instanceof gmw0) && (lmw0Var2 instanceof gmw0)) {
                                            gmw0 gmw0Var = (gmw0) lmw0Var3;
                                            ovd ovdVar = gmw0Var.t;
                                            String str3 = gmw0Var.r;
                                            vg70 vg70Var = gmw0Var.j;
                                            gmw0 gmw0Var2 = (gmw0) lmw0Var2;
                                            ovd ovdVar2 = gmw0Var2.t;
                                            vg70 H2 = bvf0.H(vg70Var, gmw0Var2.j);
                                            if (H2 != null) {
                                                next3 = gmw0.v(gmw0Var, null, H2, Math.max(gmw0Var.m, gmw0Var2.m), gmw0Var.n || gmw0Var2.n, gmw0Var.o && gmw0Var2.o, null, jl40.l(str3, gmw0Var2.r) ? str3 : "", ovdVar.a.size() >= ovdVar2.a.size() ? ovdVar : ovdVar2, null, 8217215);
                                            }
                                        }
                                    }
                                    next3 = null;
                                }
                            }
                            lmw0Var = (lmw0) next3;
                            if (lmw0Var == null) {
                                jst.e.k(new DomainMergeGluedException(((lmw0) a.P(list3)).getName(), list3), "MulticlassDomainRequirementsMerger");
                            }
                        }
                    }
                }
                lmw0Var = null;
                if (lmw0Var != null) {
                    iterable.add(lmw0Var);
                }
            }
        } else {
            iterable = emptyList;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList3 = new ArrayList(tcc.n(iterable2, 10));
        Iterator it7 = iterable2.iterator();
        while (it7.hasNext()) {
            arrayList3.add(((lmw0) it7.next()).getName());
        }
        Set N0 = a.N0(arrayList3);
        ?? r7 = (List) a.R(a);
        if (r7 != 0) {
            emptyList = r7;
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj6 : emptyList) {
            if (!N0.contains(((lmw0) obj6).getName())) {
                arrayList4.add(obj6);
            }
        }
        int d = gw00.d(tcc.n(arrayList4, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d);
        Iterator it8 = arrayList4.iterator();
        while (it8.hasNext()) {
            Object next4 = it8.next();
            linkedHashMap2.put(((lmw0) next4).getName(), next4);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int f = scc.f(a);
        if (1 <= f) {
            int i = 1;
            Collection collection3 = iterable;
            while (true) {
                List list5 = (List) a.get(i);
                Collection collection4 = collection3;
                for (Map.Entry entry : linkedHashMap3.entrySet()) {
                    String str4 = (String) entry.getKey();
                    lmw0 lmw0Var4 = (lmw0) entry.getValue();
                    Iterator it9 = list5.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            obj2 = obj;
                            break;
                        }
                        obj2 = it9.next();
                        if (jl40.l(((lmw0) obj2).getName(), str4)) {
                            break;
                        }
                    }
                    lmw0 lmw0Var5 = (lmw0) obj2;
                    if (lmw0Var5 == null) {
                        linkedHashSet.add(str4);
                        collection2 = collection4;
                        arrayList = a;
                        r33 = obj;
                    } else {
                        if (lmw0Var4 == lmw0Var5) {
                            r33 = obj;
                            h = z2;
                        } else {
                            if (lmw0Var4.getClass() == lmw0Var5.getClass() && jl40.l(lmw0Var4.getName(), lmw0Var5.getName()) && jl40.l(lmw0Var4.getLabel(), lmw0Var5.getLabel()) && jl40.l(lmw0Var4.getDescription(), lmw0Var5.getDescription()) && jl40.l(lmw0Var4.a(), lmw0Var5.a()) && jl40.l(lmw0Var4.l(), lmw0Var5.l())) {
                                if (!(lmw0Var4 instanceof fmw0)) {
                                    ?? r332 = obj;
                                    if (lmw0Var4 instanceof kmw0) {
                                        obj4 = r332;
                                        if (lmw0Var5 instanceof kmw0) {
                                            obj4 = r332;
                                            obj3 = r332;
                                        }
                                    } else if (lmw0Var4 instanceof hmw0) {
                                        obj4 = r332;
                                        if (lmw0Var5 instanceof hmw0) {
                                            hmw0 hmw0Var3 = (hmw0) lmw0Var4;
                                            hmw0 hmw0Var4 = (hmw0) lmw0Var5;
                                            obj4 = r332;
                                            if (hmw0Var3.l == hmw0Var4.l) {
                                                obj4 = r332;
                                                if (jl40.l(hmw0Var3.q, hmw0Var4.q)) {
                                                    obj4 = r332;
                                                    if (jl40.l(hmw0Var3.t, hmw0Var4.t)) {
                                                        obj4 = r332;
                                                        if (jl40.l(hmw0Var3.u, hmw0Var4.u)) {
                                                            obj4 = r332;
                                                            if (jl40.l(hmw0Var3.v, hmw0Var4.v)) {
                                                                obj4 = r332;
                                                                if (jl40.l(hmw0Var3.w, hmw0Var4.w)) {
                                                                    obj4 = r332;
                                                                    if (jl40.l(hmw0Var3.x, hmw0Var4.x)) {
                                                                        h = bvf0.h(hmw0Var3.j, hmw0Var4.j);
                                                                        r33 = r332;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (!(lmw0Var4 instanceof gmw0)) {
                                            w511.b();
                                            return r332;
                                        }
                                        obj4 = r332;
                                        if (lmw0Var5 instanceof gmw0) {
                                            gmw0 gmw0Var3 = (gmw0) lmw0Var4;
                                            gmw0 gmw0Var4 = (gmw0) lmw0Var5;
                                            obj4 = r332;
                                            if (gmw0Var3.l == gmw0Var4.l) {
                                                obj4 = r332;
                                                if (jl40.l(gmw0Var3.q, gmw0Var4.q)) {
                                                    obj4 = r332;
                                                    if (jl40.l(gmw0Var3.u, gmw0Var4.u)) {
                                                        obj4 = r332;
                                                        if (jl40.l(gmw0Var3.v, gmw0Var4.v)) {
                                                            obj4 = r332;
                                                            if (jl40.l(gmw0Var3.w, gmw0Var4.w)) {
                                                                obj4 = r332;
                                                                if (jl40.l(gmw0Var3.x, gmw0Var4.x)) {
                                                                    obj4 = r332;
                                                                    if (jl40.l(gmw0Var3.y, gmw0Var4.y)) {
                                                                        h = bvf0.h(gmw0Var3.j, gmw0Var4.j);
                                                                        r33 = r332;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    h = false;
                                    r33 = obj4;
                                } else if (lmw0Var5 instanceof fmw0) {
                                    fmw0 fmw0Var = (fmw0) lmw0Var4;
                                    Object obj7 = obj;
                                    fmw0 fmw0Var2 = (fmw0) lmw0Var5;
                                    obj4 = obj7;
                                    if (jl40.l(fmw0Var.i, fmw0Var2.i)) {
                                        obj4 = obj7;
                                        if (jl40.l(fmw0Var.k, fmw0Var2.k)) {
                                            obj4 = obj7;
                                            if (jl40.l(fmw0Var.l, fmw0Var2.l)) {
                                                obj4 = obj7;
                                                if (jl40.l(fmw0Var.m, fmw0Var2.m)) {
                                                    obj4 = obj7;
                                                    if (jl40.l(fmw0Var.n, fmw0Var2.n)) {
                                                        obj4 = obj7;
                                                        if (jl40.l(fmw0Var.o, fmw0Var2.o)) {
                                                            obj4 = obj7;
                                                            obj3 = obj7;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    h = false;
                                    r33 = obj4;
                                }
                            }
                            obj4 = obj;
                            h = false;
                            r33 = obj4;
                        }
                        if (h) {
                            if (!(lmw0Var4 instanceof fmw0)) {
                                collection2 = collection4;
                                if (!(lmw0Var4 instanceof kmw0)) {
                                    if (!(lmw0Var4 instanceof gmw0)) {
                                        arrayList = a;
                                        if (!(lmw0Var4 instanceof hmw0)) {
                                            w511.b();
                                            return r33;
                                        }
                                        if (lmw0Var5 instanceof hmw0) {
                                            hmw0 hmw0Var5 = (hmw0) lmw0Var4;
                                            hmw0 hmw0Var6 = (hmw0) lmw0Var5;
                                            vg70 I = bvf0.I(hmw0Var5.j, hmw0Var6.j);
                                            if (I != null) {
                                                lmw0Var4 = hmw0.v(hmw0Var5, null, I, hmw0Var5.m + hmw0Var6.m, hmw0Var5.n && hmw0Var6.n, hmw0Var5.o && hmw0Var6.o, bvf0.J(hmw0Var5.p, hmw0Var6.p, hmw0Var5.c), (!jl40.l(lmw0Var4.e(), lmw0Var5.e()) || (e = lmw0Var4.e()) == null) ? "" : e, null, 4145791);
                                            }
                                        }
                                        lmw0Var4 = r33;
                                    } else if (lmw0Var5 instanceof gmw0) {
                                        gmw0 gmw0Var5 = (gmw0) lmw0Var4;
                                        ovd ovdVar3 = gmw0Var5.t;
                                        vg70 vg70Var2 = gmw0Var5.j;
                                        gmw0 gmw0Var6 = (gmw0) lmw0Var5;
                                        ovd ovdVar4 = gmw0Var6.t;
                                        arrayList = a;
                                        vg70 I2 = bvf0.I(vg70Var2, gmw0Var6.j);
                                        if (I2 != null) {
                                            lmw0Var4 = gmw0.v(gmw0Var5, null, I2, gmw0Var5.m + gmw0Var6.m, gmw0Var5.n && gmw0Var6.n, gmw0Var5.o && gmw0Var6.o, bvf0.J(gmw0Var5.p, gmw0Var6.p, gmw0Var5.c), (!jl40.l(lmw0Var4.e(), lmw0Var5.e()) || (e2 = lmw0Var4.e()) == null) ? "" : e2, ovdVar3.a.size() <= ovdVar4.a.size() ? ovdVar3 : ovdVar4, null, 8209023);
                                        }
                                        lmw0Var4 = r33;
                                    } else {
                                        lmw0Var4 = r33;
                                    }
                                }
                                arrayList = a;
                            } else if (lmw0Var5 instanceof fmw0) {
                                fmw0 fmw0Var3 = (fmw0) lmw0Var4;
                                collection2 = collection4;
                                arrayList = a;
                                lmw0Var4 = new fmw0(fmw0Var3.a, fmw0Var3.b, fmw0Var3.c, fmw0Var3.d, fmw0Var3.e, fmw0Var3.f, fmw0Var3.g, bvf0.J(fmw0Var3.h, ((fmw0) lmw0Var5).h, fmw0Var3.a), fmw0Var3.i, fmw0Var3.j, fmw0Var3.k, fmw0Var3.l, fmw0Var3.m, fmw0Var3.n, fmw0Var3.o, fmw0Var3.p);
                            }
                            if (lmw0Var4 == null) {
                                linkedHashMap3.put(str4, lmw0Var4);
                            } else {
                                linkedHashSet.add(str4);
                            }
                        }
                        lmw0Var4 = r33;
                        collection2 = collection4;
                        arrayList = a;
                        if (lmw0Var4 == null) {
                        }
                    }
                    obj = r33;
                    collection4 = collection2;
                    a = arrayList;
                    z2 = true;
                }
                collection = collection4;
                ArrayList arrayList5 = a;
                Object obj8 = obj;
                Iterator it10 = linkedHashSet.iterator();
                while (it10.hasNext()) {
                    linkedHashMap3.remove((String) it10.next());
                }
                linkedHashSet.clear();
                if (i == f) {
                    break;
                }
                i++;
                obj = obj8;
                collection3 = collection;
                a = arrayList5;
                z2 = true;
            }
        } else {
            collection = iterable;
        }
        return a.m0(a.J0(linkedHashMap3.values()), collection);
    }
}
