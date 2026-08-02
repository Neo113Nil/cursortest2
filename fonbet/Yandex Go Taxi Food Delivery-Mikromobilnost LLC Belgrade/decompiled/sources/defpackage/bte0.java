package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.taxi.tariffs.repository.g;
import com.yandex.go.zone.dto.objects.RequirementOverrideDto;
import com.yandex.go.zone.dto.objects.VerticalTariffDto;
import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import com.yandex.go.zone.dto.objects.ZoneVertical;
import com.yandex.go.zone.dto.objects.ZoneVerticalMulticlass;
import com.yandex.go.zone.model.Zone;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.requirements.interactor.RequirementOptionFilterInteractor$extractTariffRequirements$$inlined$extractTariffRequirements$1;
import ru.yandex.taxi.requirements.models.net.PersistenceTypeDto;
import ru.yandex.taxi.requirements.models.net.c;
import ru.yandex.taxi.requirements.repository.b;

/* loaded from: classes9.dex */
public final class bte0 {
    public final wiq0 a;
    public final b b;
    public final ijj0 c;
    public final nfh d;

    public bte0(wiq0 wiq0Var, b bVar, ijj0 ijj0Var, nfh nfhVar) {
        this.a = wiq0Var;
        this.b = bVar;
        this.c = ijj0Var;
        this.d = nfhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (r5 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ZoneTariffInfo zoneTariffInfo, LinkedHashMap linkedHashMap, List list, List list2, String str) {
        Object obj;
        f1b0 f1b0Var;
        String str2 = zoneTariffInfo.e;
        if (linkedHashMap.containsKey(str2)) {
            return;
        }
        List list3 = zoneTariffInfo.o;
        ArrayList arrayList = new ArrayList();
        Iterator it = list3.iterator();
        while (true) {
            b580 b580Var = null;
            if (!it.hasNext()) {
                break;
            }
            c cVar = (c) it.next();
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (jl40.l(((RequirementOverrideDto) obj).a, cVar.c)) {
                        break;
                    }
                }
            }
            RequirementOverrideDto requirementOverrideDto = (RequirementOverrideDto) obj;
            if (requirementOverrideDto == null || (f1b0Var = requirementOverrideDto.e) == null) {
                f1b0Var = cVar.u;
            }
            if (f1b0Var != null && f1b0Var.a == PersistenceTypeDto.LOCAL) {
                String str3 = cVar.c;
                String str4 = f1b0Var.b;
                if (str4 != null) {
                    if (str4.length() <= 0) {
                        str4 = null;
                    }
                }
                str4 = g8e.p(str2, Extension.DOT_CHAR, str3);
                b580 b580Var2 = (b580) this.b.d.get(str4);
                if (b580Var2 != null && jl40.l(b580Var2.a, cVar.c)) {
                    b580Var = b580Var2;
                }
            }
            if (b580Var != null) {
                arrayList.add(b580Var);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (!b4a1.b((b580) next, list, str)) {
                arrayList2.add(next);
            }
        }
        ijj0 ijj0Var = this.c;
        ijj0Var.getClass();
        h73 h73Var = new h73(2, new RequirementOptionFilterInteractor$extractTariffRequirements$$inlined$extractTariffRequirements$1(arrayList2, ijj0Var, null, zoneTariffInfo));
        List t = kotlin.sequences.b.t(h73Var);
        ycc.s(t, kotlin.sequences.b.g(new h73(2, new RequirementOptionFilterInteractor$extractTariffRequirements$$inlined$extractTariffRequirements$1(list2, ijj0Var, null, zoneTariffInfo)), new ate0(0, h73Var)));
        linkedHashMap.put(str2, t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    public final void b(Zone zone, ZoneVertical zoneVertical, List list, LinkedHashMap linkedHashMap, String str) {
        ZoneTariffInfo zoneTariffInfo;
        for (VerticalTariffDto verticalTariffDto : zoneVertical.f) {
            Iterator it = zone.k.iterator();
            while (true) {
                if (it.hasNext()) {
                    zoneTariffInfo = it.next();
                    if (jl40.l(((ZoneTariffInfo) zoneTariffInfo).e, verticalTariffDto.a)) {
                        break;
                    }
                } else {
                    zoneTariffInfo = 0;
                    break;
                }
            }
            ZoneTariffInfo zoneTariffInfo2 = zoneTariffInfo;
            if (zoneTariffInfo2 != null) {
                a(zoneTariffInfo2, linkedHashMap, zoneVertical.m, list, str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    public final LinkedHashMap c(Zone zone, List list) {
        bte0 bte0Var;
        List list2;
        Zone zone2;
        ZoneTariffInfo zoneTariffInfo;
        List<String> list3;
        Object obj;
        ZoneVertical zoneVertical;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        k kVar = (k) this.a;
        String h = kVar.h();
        fnx0 n = kVar.n();
        kb5 kb5Var = n != null ? n.e : null;
        String str = kb5Var != null ? kb5Var.b : null;
        if (jl40.l(h, "")) {
            bte0Var = this;
            list2 = list;
            zone2 = zone;
        } else {
            Iterator it = zone.w.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((ZoneVertical) obj).a, h)) {
                    break;
                }
            }
            ZoneVertical zoneVertical2 = (ZoneVertical) obj;
            bte0Var = this;
            if (zoneVertical2 != null) {
                list2 = list;
                bte0Var.b(zone, zoneVertical2, list2, linkedHashMap, str);
                zoneVertical = zoneVertical2;
                linkedHashMap = linkedHashMap;
            } else {
                zoneVertical = zoneVertical2;
                list2 = list;
            }
            for (ZoneVertical zoneVertical3 : zone.w) {
                if (zoneVertical != zoneVertical3) {
                    LinkedHashMap linkedHashMap2 = linkedHashMap;
                    bte0Var.b(zone, zoneVertical3, list2, linkedHashMap2, str);
                    linkedHashMap = linkedHashMap2;
                }
            }
            zone2 = zone;
        }
        if (linkedHashMap.isEmpty()) {
            Iterator it2 = zone2.k.iterator();
            while (it2.hasNext()) {
                List list4 = list2;
                bte0Var.a((ZoneTariffInfo) it2.next(), linkedHashMap, EmptyList.a, list4, str);
                list2 = list4;
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (ZoneVertical zoneVertical4 : zone2.w) {
            ZoneVerticalMulticlass zoneVerticalMulticlass = zoneVertical4.l;
            if (zoneVerticalMulticlass != null && (list3 = zoneVerticalMulticlass.b) != null) {
                for (String str2 : list3) {
                    if (!linkedHashMap.containsKey(str2)) {
                        linkedHashMap3.compute(str2, new gn20(new jid(3, zoneVertical4), 1));
                    }
                }
            }
        }
        for (Map.Entry entry : linkedHashMap3.entrySet()) {
            String str3 = (String) entry.getKey();
            List list5 = (List) entry.getValue();
            Iterator it3 = zone2.k.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    zoneTariffInfo = 0;
                    break;
                }
                zoneTariffInfo = it3.next();
                if (jl40.l(((ZoneTariffInfo) zoneTariffInfo).e, str3)) {
                    break;
                }
            }
            ZoneTariffInfo zoneTariffInfo2 = zoneTariffInfo;
            if (zoneTariffInfo2 != null) {
                List list6 = list2;
                bte0Var.a(zoneTariffInfo2, linkedHashMap, list5, list6, str);
                list2 = list6;
            }
        }
        nfh nfhVar = bte0Var.d;
        nfhVar.getClass();
        if (kb5Var != null && kb5Var.e && ((Boolean) ((qqo) ((i3y) nfhVar.c).getValue()).b()).booleanValue()) {
            List e = ((ijj0) nfhVar.a).e(zone2, kb5Var, list2);
            Set<String> a = ((g) nfhVar.b).a(kb5Var.a);
            List list7 = e;
            ArrayList arrayList = new ArrayList(tcc.n(list7, 10));
            Iterator it4 = list7.iterator();
            while (it4.hasNext()) {
                arrayList.add(((b580) it4.next()).a);
            }
            Set N0 = a.N0(arrayList);
            for (String str4 : a) {
                List list8 = (List) linkedHashMap.get(str4);
                if (list8 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list8) {
                        if (N0.contains(((b580) obj2).a)) {
                            arrayList2.add(obj2);
                        }
                    }
                    linkedHashMap.put(str4, arrayList2);
                }
            }
        }
        return linkedHashMap;
    }
}
