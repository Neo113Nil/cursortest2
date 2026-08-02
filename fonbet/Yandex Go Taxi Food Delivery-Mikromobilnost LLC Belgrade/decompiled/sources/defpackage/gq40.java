package defpackage;

import com.yandex.go.multitariff.SelectionRules;
import com.yandex.go.net.taxi.dto.response.typed_experiments.MulticlassTariffPositionExperiment;
import com.yandex.go.preorder.source.altpins.Alternatives;
import com.yandex.go.taxi.tariffs.repository.g;
import com.yandex.go.zone.dto.objects.RequirementOverrideDto;
import com.yandex.go.zone.dto.objects.TariffCard;
import com.yandex.go.zone.dto.objects.TariffUnavailable;
import com.yandex.go.zone.dto.objects.e5;
import com.yandex.go.zone.dto.objects.f5;
import com.yandex.go.zone.dto.response.SearchScreen;
import com.yandex.go.zone.dto.response.Selector;
import com.yandex.go.zone.dto.response.ZoneMulticlassDetails;
import com.yandex.go.zone.dto.response.c;
import com.yandex.go.zone.model.Zone;
import com.yandex.go.zone.model.ZoneMulticlass;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.tariffs.model.TariffSource;

/* loaded from: classes10.dex */
public final class gq40 {
    public final jgv a;
    public final sze0 b;
    public final bco c;
    public final g d;
    public final wp40 e;
    public final cq40 f;
    public final so40 g;
    public final qp40 h;
    public final hct i;
    public final kjz j;

    public gq40(wnt wntVar, jgv jgvVar, sze0 sze0Var, bco bcoVar, g gVar, wp40 wp40Var, cq40 cq40Var, so40 so40Var, qp40 qp40Var, hct hctVar, kjz kjzVar, liy0 liy0Var) {
        this.a = jgvVar;
        this.b = sze0Var;
        this.c = bcoVar;
        this.d = gVar;
        this.e = wp40Var;
        this.f = cq40Var;
        this.g = so40Var;
        this.h = qp40Var;
        this.i = hctVar;
        this.j = kjzVar;
    }

    public static int c(Zone zone, yal0 yal0Var, int i) {
        MulticlassTariffPositionExperiment multiclassTariffPositionExperiment;
        int i2;
        if (yal0Var == null || (multiclassTariffPositionExperiment = (MulticlassTariffPositionExperiment) yal0Var.b(MulticlassTariffPositionExperiment.class)) == null) {
            multiclassTariffPositionExperiment = (MulticlassTariffPositionExperiment) zone.b(MulticlassTariffPositionExperiment.class);
        }
        return (multiclassTariffPositionExperiment == null || 1 > (i2 = multiclassTariffPositionExperiment.b) || i2 >= i) ? i : i2 - 1;
    }

    public final pex0 a(yal0 yal0Var, ArrayList arrayList, jn40 jn40Var, String str, int i, boolean z, is60 is60Var) {
        boolean z2;
        boolean z3;
        boolean z4;
        TariffSource tariffSource;
        boolean z5;
        List list;
        List list2;
        String str2;
        f5 f5Var;
        List list3;
        qze0 qze0Var;
        String str3;
        TariffSource tariffSource2;
        boolean z6;
        Object obj;
        Object obj2;
        TariffUnavailable tariffUnavailable = jn40Var.d;
        TariffSource tariffSource3 = yal0Var == null ? TariffSource.ZONE_INFO : yal0Var.t ? TariffSource.ZONE_INFO_AND_LIGHTWEIGHT_ROUTE_STATS : TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS;
        en40 en40Var = jn40Var.b;
        Set<String> set = jn40Var.f;
        ArrayList arrayList2 = new ArrayList();
        for (String str4 : set) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                Object next = it.next();
                if (jl40.l(((pex0) next).b, str4)) {
                    obj2 = next;
                    break;
                }
            }
            pex0 pex0Var = (pex0) obj2;
            if (pex0Var != null) {
                arrayList2.add(pex0Var);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = arrayList;
        }
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (((pex0) it2.next()).X) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        boolean z7 = jn40Var.i;
        wp40 wp40Var = this.e;
        if (z7) {
            wp40Var.getClass();
            z3 = wp40.a(arrayList, set);
        } else {
            z3 = false;
        }
        if (z7) {
            wp40Var.getClass();
            z4 = wp40.b(arrayList, set);
        } else {
            z4 = false;
        }
        EmptyList emptyList = EmptyList.a;
        if (z7) {
            list = this.f.a(arrayList, set, false);
            ArrayList a = this.i.a("", "multiclass", emptyList);
            if (a.isEmpty()) {
                tariffSource = tariffSource3;
                z5 = z7;
            } else {
                List<lmw0> list4 = list;
                ArrayList arrayList3 = new ArrayList(tcc.n(list4, 10));
                for (lmw0 lmw0Var : list4) {
                    Iterator it3 = a.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            tariffSource2 = tariffSource3;
                            z6 = z7;
                            obj = null;
                            break;
                        }
                        obj = it3.next();
                        tariffSource2 = tariffSource3;
                        z6 = z7;
                        if (jl40.l(((RequirementOverrideDto) obj).a, lmw0Var.getName())) {
                            break;
                        }
                        tariffSource3 = tariffSource2;
                        z7 = z6;
                    }
                    RequirementOverrideDto requirementOverrideDto = (RequirementOverrideDto) obj;
                    if (requirementOverrideDto != null) {
                        lmw0Var = ffx.h0(lmw0Var, requirementOverrideDto, "multiclass");
                    }
                    arrayList3.add(lmw0Var);
                    tariffSource3 = tariffSource2;
                    z7 = z6;
                }
                tariffSource = tariffSource3;
                z5 = z7;
                list = arrayList3;
            }
        } else {
            tariffSource = tariffSource3;
            z5 = z7;
            list = emptyList;
        }
        if (z5) {
            this.g.getClass();
            list2 = so40.a(arrayList, set);
        } else {
            list2 = emptyList;
        }
        this.h.getClass();
        List a2 = qp40.a(arrayList, set);
        oox0 oox0Var = new oox0(str == null ? "" : str, i);
        SearchScreen searchScreen = en40Var.e;
        String str5 = jn40Var.a;
        if (tariffUnavailable == null || (str2 = tariffUnavailable.b) == null) {
            str2 = "";
        }
        boolean z8 = str2.length() > 0;
        String str6 = (tariffUnavailable == null || (str3 = tariffUnavailable.b) == null) ? "" : str3;
        HashSet hashSet = new HashSet(jn40Var.g);
        TariffCard.Companion.getClass();
        TariffCard tariffCard = new TariffCard(emptyList, 12);
        f5 f5Var2 = jn40Var.j;
        if (yal0Var != null) {
            f5Var = f5Var2;
            list3 = list2;
            qze0Var = sze0.d(this.b, yal0Var, en40Var.a, en40Var.b);
        } else {
            f5Var = f5Var2;
            list3 = list2;
            qze0Var = null;
        }
        c cVar = en40Var.g;
        this.c.getClass();
        ybo a3 = bco.a(cVar);
        Selector selector = jn40Var.c;
        return new pex0(tariffSource, "multiclass", list, null, a2, list3, is60Var, a3, null, selector == null ? null : this.a.a(selector.c), null, str5, qze0Var, Integer.MAX_VALUE, null, null, null, oox0Var, false, z, z8, false, false, Boolean.TRUE, null, false, z4, z3, false, str6, tariffUnavailable != null ? tariffUnavailable.c : null, null, null, tariffUnavailable != null ? tariffUnavailable.d : null, this.j.i(tariffUnavailable), null, null, hashSet, 0, null, null, false, false, null, null, null, arrayList, jn40Var, null, z2, null, null, null, null, null, null, false, null, tariffCard, null, searchScreen, null, null, null, 0, null, null, null, null, null, null, null, f5Var, null, null, null, null, null, null, null, null, null, null, null, 0, -1822046968, -1342357543, 8387583);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r2 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        return r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        if (r0 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0033, code lost:
    
        if (r2 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2 A[LOOP:0: B:35:0x009c->B:37:0x00a2, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List b(ArrayList arrayList, Zone zone, yal0 yal0Var) {
        ZoneMulticlass zoneMulticlass;
        Boolean bool;
        boolean z;
        Iterator it;
        Alternatives alternatives;
        Alternatives.MulticlassOptionDto a = (yal0Var == null || (alternatives = yal0Var.e) == null) ? null : alternatives.a();
        qn11 qn11Var = gbl0.c;
        qn11 b = zone.b(gbl0.class);
        if (b != null) {
            qn11Var = b;
        }
        if (((gbl0) qn11Var).b) {
            if (((yal0Var == null || yal0Var.t) ? null : yal0Var) != null) {
            }
            zoneMulticlass = zone.x;
            if (zoneMulticlass != null) {
                jst.e.getClass();
                return arrayList;
            }
            SelectionRules selectionRules = zoneMulticlass.e;
            if (arrayList.size() < selectionRules.a.a) {
                jst.e.getClass();
                return arrayList;
            }
            if (a != null) {
                Alternatives.MulticlassRequirementSupportedDto multiclassRequirementSupportedDto = a.h;
                bool = multiclassRequirementSupportedDto != null ? multiclassRequirementSupportedDto.a : null;
            }
            bool = zoneMulticlass.g;
            if (bool == null) {
                z = false;
                boolean z2 = z;
                String str = zoneMulticlass.d;
                ZoneMulticlassDetails zoneMulticlassDetails = zoneMulticlass.c;
                en40 en40Var = new en40(null, null, zoneMulticlassDetails.b, dai0.k(zoneMulticlassDetails.c, selectionRules, this.d.b()), zoneMulticlassDetails.a, null, null);
                Selector selector = zoneMulticlass.f;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(((pex0) it.next()).b);
                }
                pex0 a2 = a(yal0Var, arrayList, new jn40(str, en40Var, selector, null, linkedHashSet, new LinkedHashSet(), EmptyList.a, zoneMulticlass.e, z2, e5.INSTANCE, false), null, -1, zoneMulticlass.b, is60.c);
                int c = c(zone, yal0Var, arrayList.size());
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList2.add(c, a2);
                return arrayList2;
            }
            z = bool.booleanValue();
            boolean z22 = z;
            String str2 = zoneMulticlass.d;
            ZoneMulticlassDetails zoneMulticlassDetails2 = zoneMulticlass.c;
            en40 en40Var2 = new en40(null, null, zoneMulticlassDetails2.b, dai0.k(zoneMulticlassDetails2.c, selectionRules, this.d.b()), zoneMulticlassDetails2.a, null, null);
            Selector selector2 = zoneMulticlass.f;
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            it = arrayList.iterator();
            while (it.hasNext()) {
            }
            pex0 a22 = a(yal0Var, arrayList, new jn40(str2, en40Var2, selector2, null, linkedHashSet2, new LinkedHashSet(), EmptyList.a, zoneMulticlass.e, z22, e5.INSTANCE, false), null, -1, zoneMulticlass.b, is60.c);
            int c2 = c(zone, yal0Var, arrayList.size());
            ArrayList arrayList22 = new ArrayList(arrayList);
            arrayList22.add(c2, a22);
            return arrayList22;
        }
        if (yal0Var != null) {
        }
        zoneMulticlass = zone.x;
        if (zoneMulticlass != null) {
        }
    }
}
