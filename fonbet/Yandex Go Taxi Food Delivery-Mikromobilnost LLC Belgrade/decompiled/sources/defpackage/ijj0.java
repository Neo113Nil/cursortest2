package defpackage;

import com.yandex.go.taxi.tariffs.repository.g;
import com.yandex.go.zone.dto.objects.RequirementOverrideDto;
import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import com.yandex.go.zone.dto.objects.ZoneVertical;
import com.yandex.go.zone.model.Zone;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.sequences.b;
import ru.yandex.taxi.requirements.interactor.RequirementOptionFilterInteractor$extractTariffRequirements$$inlined$extractTariffRequirements$1;
import ru.yandex.taxi.requirements.interactor.RequirementOptionFilterInteractor$multiclassRequirements$$inlined$extractTariffRequirements$1;
import ru.yandex.taxi.requirements.models.net.c;

/* loaded from: classes9.dex */
public final class ijj0 {
    public final g a;
    public final cq40 b;
    public final hct c;

    public ijj0(g gVar, cq40 cq40Var, hct hctVar) {
        this.a = gVar;
        this.b = cq40Var;
        this.c = hctVar;
    }

    public static final b580 a(ijj0 ijj0Var, b580 b580Var, c cVar) {
        ijj0Var.getClass();
        ArrayList b = b(b580Var, cVar);
        if (b.isEmpty()) {
            return null;
        }
        int size = b.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        Iterator it = b.iterator();
        while (it.hasNext()) {
            je70 je70Var = (je70) it.next();
            rf70 rf70Var = je70Var.m;
            if (rf70Var == null) {
                unr0.z(jst.e, "Missing option value!");
            } else {
                arrayList.add(rf70Var);
                arrayList2.add(je70Var.c);
            }
        }
        return gi.f(cVar.c, cVar.a, arrayList2, arrayList.size() == 1 ? (rf70) arrayList.get(0) : new nf70(arrayList));
    }

    public static ArrayList b(b580 b580Var, c cVar) {
        List list = b580Var.e;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            je70 b = cVar.b((String) it.next());
            if (b != null) {
                arrayList.add(b);
            }
        }
        HashMap hashMap = new HashMap();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            je70 je70Var = (je70) it2.next();
            Integer num = (Integer) hashMap.get(je70Var.c);
            int intValue = (num != null ? num.intValue() : 0) + 1;
            if (intValue > je70Var.a()) {
                it2.remove();
            } else {
                hashMap.put(je70Var.c, Integer.valueOf(intValue));
            }
        }
        Iterator it3 = arrayList.iterator();
        int i = 0;
        while (it3.hasNext()) {
            i += ((je70) it3.next()).b();
        }
        for (String str : cVar.r) {
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext() && g(cVar, arrayList, i)) {
                je70 je70Var2 = (je70) it4.next();
                if (jl40.l(je70Var2.c, str)) {
                    i -= je70Var2.b();
                    it4.remove();
                }
            }
            if (!g(cVar, arrayList, i)) {
                break;
            }
        }
        while (g(cVar, arrayList, i) && !arrayList.isEmpty()) {
            i -= ((je70) arrayList.get(0)).b();
            arrayList.remove(0);
        }
        return arrayList;
    }

    public static ArrayList c(List list, jmw0 jmw0Var, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ejj0 p = jmw0Var.p((String) it.next());
            if (p != null) {
                arrayList.add(p);
            }
        }
        HashMap hashMap = new HashMap();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            ejj0 ejj0Var = (ejj0) it2.next();
            Integer num = (Integer) hashMap.get(ejj0Var.a);
            int intValue = (num != null ? num.intValue() : 0) + 1;
            if (intValue > ejj0Var.e) {
                it2.remove();
            } else {
                hashMap.put(ejj0Var.a, Integer.valueOf(intValue));
            }
        }
        Iterator it3 = arrayList.iterator();
        int i = 0;
        while (it3.hasNext()) {
            i += ((ejj0) it3.next()).d;
        }
        if (z) {
            for (String str : jmw0Var.r()) {
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext() && f(jmw0Var, arrayList, i)) {
                    ejj0 ejj0Var2 = (ejj0) it4.next();
                    if (jl40.l(ejj0Var2.a, str)) {
                        i -= ejj0Var2.d;
                        it4.remove();
                    }
                }
                if (!f(jmw0Var, arrayList, i)) {
                    break;
                }
            }
        }
        while (f(jmw0Var, arrayList, i) && !arrayList.isEmpty()) {
            i -= ((ejj0) arrayList.get(0)).d;
            arrayList.remove(0);
        }
        return arrayList;
    }

    public static ArrayList d(ijj0 ijj0Var, b580 b580Var, jmw0 jmw0Var) {
        ijj0Var.getClass();
        return c(b580Var.e, jmw0Var, true);
    }

    public static boolean f(jmw0 jmw0Var, ArrayList arrayList, int i) {
        if (jmw0Var.u()) {
            if (arrayList.isEmpty() || jmw0Var.o() <= 0 || i <= jmw0Var.o()) {
                return false;
            }
        } else if (arrayList.size() <= 1) {
            return false;
        }
        return true;
    }

    public static boolean g(c cVar, ArrayList arrayList, int i) {
        boolean z = cVar.h;
        Number number = cVar.i;
        if (z) {
            if (arrayList.isEmpty() || number.intValue() <= 0 || i <= number.intValue()) {
                return false;
            }
        } else if (arrayList.size() <= 1) {
            return false;
        }
        return true;
    }

    public final List e(Zone zone, kb5 kb5Var, List list) {
        int i;
        List m0;
        Object obj;
        Object obj2;
        String str;
        boolean z = kb5Var.e;
        String str2 = kb5Var.b;
        String str3 = kb5Var.a;
        if (!z) {
            ZoneTariffInfo r = uh6.r(zone, str2);
            return b.s(r == null ? ixn.a : new h73(2, new RequirementOptionFilterInteractor$extractTariffRequirements$$inlined$extractTariffRequirements$1(list, this, null, r)));
        }
        Set a = this.a.a(str3);
        List list2 = zone.k;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list2) {
            if (a.contains(((ZoneTariffInfo) obj3).e)) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ZoneTariffInfo zoneTariffInfo = (ZoneTariffInfo) it.next();
            Iterator it2 = zone.w.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (jl40.l(((ZoneVertical) obj2).a, str3)) {
                    break;
                }
            }
            ZoneVertical zoneVertical = (ZoneVertical) obj2;
            if (zoneVertical != null) {
                ArrayList a2 = this.c.a(zoneVertical.a, zoneTariffInfo.e, zoneVertical.m);
                if (!a2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList(zoneTariffInfo.o);
                    Iterator it3 = a2.iterator();
                    while (it3.hasNext()) {
                        RequirementOverrideDto requirementOverrideDto = (RequirementOverrideDto) it3.next();
                        Iterator it4 = arrayList3.iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                i2 = -1;
                                break;
                            }
                            if (jl40.l(((c) it4.next()).c, requirementOverrideDto.a)) {
                                break;
                            }
                            i2++;
                        }
                        if (i2 >= 0) {
                            c cVar = (c) arrayList3.get(i2);
                            Boolean bool = requirementOverrideDto.b;
                            boolean booleanValue = bool != null ? bool.booleanValue() : cVar.j;
                            Boolean bool2 = requirementOverrideDto.c;
                            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : cVar.k;
                            String str4 = requirementOverrideDto.d;
                            if (str4 == null) {
                                str4 = cVar.t;
                            }
                            String str5 = str4;
                            f1b0 f1b0Var = requirementOverrideDto.e;
                            if (f1b0Var == null) {
                                f1b0Var = cVar.u;
                            }
                            c a3 = c.a(cVar, null, null, null, booleanValue, booleanValue2, null, str5, f1b0Var, requirementOverrideDto.f, 401078783);
                            if (!a3.equals(cVar)) {
                                arrayList3.set(i2, a3);
                            }
                        }
                    }
                    str = str3;
                    zoneTariffInfo = new ZoneTariffInfo(zoneTariffInfo.a, zoneTariffInfo.b, zoneTariffInfo.c, zoneTariffInfo.d, zoneTariffInfo.e, zoneTariffInfo.f, zoneTariffInfo.g, zoneTariffInfo.h, zoneTariffInfo.i, zoneTariffInfo.j, zoneTariffInfo.k, zoneTariffInfo.l, zoneTariffInfo.m, zoneTariffInfo.n, arrayList3, zoneTariffInfo.p, zoneTariffInfo.q, zoneTariffInfo.r, zoneTariffInfo.s, zoneTariffInfo.t, zoneTariffInfo.u, zoneTariffInfo.v, zoneTariffInfo.w, zoneTariffInfo.x, zoneTariffInfo.y, zoneTariffInfo.z, zoneTariffInfo.A, zoneTariffInfo.B, zoneTariffInfo.C, zoneTariffInfo.D, zoneTariffInfo.E, zoneTariffInfo.F, zoneTariffInfo.G, zoneTariffInfo.H, zoneTariffInfo.I);
                    arrayList2.add(zoneTariffInfo);
                    str3 = str;
                }
            }
            str = str3;
            arrayList2.add(zoneTariffInfo);
            str3 = str;
        }
        this.b.b.getClass();
        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList2, 10));
        Iterator it5 = arrayList2.iterator();
        while (true) {
            i = 1;
            if (!it5.hasNext()) {
                break;
            }
            List list3 = ((ZoneTariffInfo) it5.next()).o;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : list3) {
                List list4 = ((c) obj4).B;
                if (list4.isEmpty() ? true : list4.contains(str2)) {
                    arrayList5.add(obj4);
                }
            }
            arrayList4.add(arrayList5);
        }
        boolean isEmpty = arrayList4.isEmpty();
        EmptyList emptyList = EmptyList.a;
        if (isEmpty) {
            m0 = emptyList;
        } else {
            Set N0 = a.N0(new ArrayList(tcc.n(emptyList, 10)));
            List list5 = (List) a.R(arrayList4);
            if (list5 == null) {
                list5 = emptyList;
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj5 : list5) {
                if (!N0.contains(((c) obj5).c)) {
                    arrayList6.add(obj5);
                }
            }
            int d = gw00.d(tcc.n(arrayList6, 10));
            if (d < 16) {
                d = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
            Iterator it6 = arrayList6.iterator();
            while (it6.hasNext()) {
                Object next = it6.next();
                linkedHashMap.put(((c) next).c, next);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int f = scc.f(arrayList4);
            if (1 <= f) {
                while (true) {
                    List list6 = (List) arrayList4.get(i);
                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                        String str6 = (String) entry.getKey();
                        c cVar2 = (c) entry.getValue();
                        Iterator it7 = list6.iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it7.next();
                            if (jl40.l(((c) obj).c, str6)) {
                                break;
                            }
                        }
                        c cVar3 = (c) obj;
                        if (cVar3 == null) {
                            linkedHashSet.add(str6);
                        } else {
                            c e = iqb1.e(cVar2, cVar3);
                            if (e != null) {
                                linkedHashMap2.put(str6, e);
                            } else {
                                linkedHashSet.add(str6);
                            }
                        }
                    }
                    Iterator it8 = linkedHashSet.iterator();
                    while (it8.hasNext()) {
                        linkedHashMap2.remove((String) it8.next());
                    }
                    linkedHashSet.clear();
                    if (i == f) {
                        break;
                    }
                    i++;
                }
            }
            m0 = a.m0(a.J0(linkedHashMap2.values()), emptyList);
        }
        rrq0 a4 = vrq0.a(new RequirementOptionFilterInteractor$multiclassRequirements$$inlined$extractTariffRequirements$1(list, this, null, m0));
        if (!a4.hasNext()) {
            return emptyList;
        }
        Object next2 = a4.next();
        if (!a4.hasNext()) {
            return Collections.singletonList(next2);
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.add(next2);
        while (a4.hasNext()) {
            arrayList7.add(a4.next());
        }
        return arrayList7;
    }
}
