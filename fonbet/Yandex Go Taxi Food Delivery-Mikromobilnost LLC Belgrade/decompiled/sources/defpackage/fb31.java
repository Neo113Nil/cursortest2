package defpackage;

import com.yandex.go.zone.dto.objects.RequirementOverrideDto;
import com.yandex.go.zone.dto.objects.VerticalTariffDto;
import com.yandex.go.zone.dto.objects.VerticalType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.tariffs.data.a;
import ru.yandex.taxi.tariffs.model.b;

/* loaded from: classes8.dex */
public final class fb31 {
    public final a a;
    public final maj0 b;
    public final hct c;

    public fb31(a aVar, maj0 maj0Var, hct hctVar) {
        this.a = aVar;
        this.b = maj0Var;
        this.c = hctVar;
    }

    public static void a(ArrayList arrayList, Integer num, cb31 cb31Var, boolean z) {
        if (num != null) {
            int size = arrayList.size();
            int intValue = num.intValue();
            if (intValue >= 0 && intValue <= size) {
                if (z) {
                    arrayList.set(num.intValue(), cb31Var);
                    return;
                } else {
                    arrayList.add(num.intValue(), cb31Var);
                    return;
                }
            }
        }
        arrayList.add(cb31Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (defpackage.jl40.l(r1.f, "multiclass") == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList b(ArrayList arrayList, boolean z) {
        mi31 mi31Var;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            eb31 eb31Var = (eb31) it.next();
            boolean z2 = eb31Var instanceof cb31;
            if (z2 && z) {
                mi31Var = ((cb31) eb31Var).a;
            } else {
                if (z2) {
                    mi31Var = ((cb31) eb31Var).a;
                }
                mi31Var = null;
            }
            if (mi31Var != null) {
                arrayList2.add(mi31Var);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0256  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList c(yal0 yal0Var, List list, ArrayList arrayList, Map map, boolean z) {
        int i;
        char c;
        za31 za31Var;
        VerticalType verticalType;
        Object obj;
        ArrayList<mi31> b;
        Object obj2;
        mi31 mi31Var;
        tha1 tha1Var;
        pex0 a;
        mi31 mi31Var2;
        boolean l;
        nu1 nu1Var;
        pex0 pex0Var;
        char c2 = '\n';
        int d = gw00.d(tcc.n(arrayList, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            pex0 pex0Var2 = (pex0) it.next();
            String str = pex0Var2.b;
            if (pex0Var2.g() && b.h(pex0Var2)) {
                String c3 = this.b.c(pex0Var2.b);
                Iterator it2 = b.b(pex0Var2).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        nu1Var = null;
                        break;
                    }
                    ?? next = it2.next();
                    if (jl40.l(((nu1) next).b, c3)) {
                        nu1Var = next;
                        break;
                    }
                }
                nu1 nu1Var2 = nu1Var;
                if (nu1Var2 != null && (pex0Var = nu1Var2.a) != null) {
                    pex0Var2 = pex0Var;
                }
            }
            linkedHashMap.put(str, pex0Var2);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            oa31 oa31Var = (oa31) it3.next();
            boolean d2 = oa31Var.d();
            String str2 = oa31Var.a;
            if (d2) {
                pex0 pex0Var3 = (pex0) linkedHashMap.get(oa31Var.b);
                za31Var = pex0Var3 != null ? new ois0(pex0Var3).n0() : null;
                c = c2;
            } else if (oa31Var.e() || (verticalType = oa31Var.c) == VerticalType.NAVIGATOR || verticalType == VerticalType.MIXED) {
                c = c2;
                za31Var = new za31(oa31Var, EmptyList.a, null);
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    linkedHashMap2.put(key, d(oa31Var, (pex0) entry.getValue()));
                }
                List<VerticalTariffDto> list2 = oa31Var.f;
                cf31 cf31Var = oa31Var.m;
                ArrayList arrayList3 = new ArrayList();
                for (VerticalTariffDto verticalTariffDto : list2) {
                    pex0 pex0Var4 = (pex0) linkedHashMap2.get(verticalTariffDto.a);
                    mi31 mi31Var3 = pex0Var4 != null ? new mi31(pex0Var4, oa31Var.a, verticalTariffDto.b, verticalTariffDto.c, verticalTariffDto.d) : null;
                    arrayList3.add(mi31Var3 != null ? new cb31(mi31Var3) : new db31(verticalTariffDto));
                }
                Iterator it4 = linkedHashMap2.values().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it4.next();
                    if (((pex0) obj).K0) {
                        break;
                    }
                }
                pex0 pex0Var5 = (pex0) obj;
                if (pex0Var5 == null || !z) {
                    b = b(arrayList3, false);
                } else {
                    if (cf31Var != null && (a = this.a.a(yal0Var, cf31Var, linkedHashMap2, pex0Var5)) != null) {
                        Iterator it5 = arrayList3.iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it5.hasNext()) {
                                i2 = -1;
                                break;
                            }
                            eb31 eb31Var = (eb31) it5.next();
                            if (eb31Var instanceof cb31) {
                                l = jl40.l(((cb31) eb31Var).a.f, "multiclass");
                            } else {
                                if (!(eb31Var instanceof db31)) {
                                    w511.b();
                                    return null;
                                }
                                l = jl40.l(((db31) eb31Var).a.a, "multiclass");
                            }
                            if (l) {
                                break;
                            }
                            i2++;
                        }
                        Integer valueOf = Integer.valueOf(i2);
                        if (i2 == -1) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            eb31 eb31Var2 = (eb31) arrayList3.get(valueOf.intValue());
                            if (eb31Var2 instanceof cb31) {
                                mi31 mi31Var4 = ((cb31) eb31Var2).a;
                                mi31Var2 = new mi31(a, oa31Var.a, mi31Var4.c(), mi31Var4.d, mi31Var4.e);
                            } else {
                                if (!(eb31Var2 instanceof db31)) {
                                    w511.b();
                                    return null;
                                }
                                VerticalTariffDto verticalTariffDto2 = ((db31) eb31Var2).a;
                                mi31Var2 = new mi31(a, oa31Var.a, verticalTariffDto2.b, verticalTariffDto2.c, verticalTariffDto2.d);
                            }
                            tha1Var = new bb31(mi31Var2, valueOf.intValue());
                        } else {
                            tha1Var = new ab31(new mi31(a, str2), cf31Var.b);
                        }
                        if (tha1Var instanceof bb31) {
                            bb31 bb31Var = (bb31) tha1Var;
                            a(arrayList3, Integer.valueOf(bb31Var.c), new cb31((mi31) bb31Var.b), true);
                        }
                        if (tha1Var instanceof ab31) {
                            ab31 ab31Var = (ab31) tha1Var;
                            a(arrayList3, ab31Var.c, new cb31((mi31) ab31Var.b), false);
                        }
                        b = b(arrayList3, true);
                    }
                    tha1Var = null;
                    if (tha1Var instanceof bb31) {
                    }
                    if (tha1Var instanceof ab31) {
                    }
                    b = b(arrayList3, true);
                }
                if (b.isEmpty()) {
                    za31Var = null;
                    c = '\n';
                } else {
                    String str3 = (String) map.get(str2);
                    Iterator it6 = b.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it6.next();
                        if (jl40.l(((mi31) obj2).a.b, str3)) {
                            break;
                        }
                    }
                    mi31 mi31Var5 = (mi31) obj2;
                    if (mi31Var5 == null) {
                        Iterator it7 = b.iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                mi31Var = 0;
                                break;
                            }
                            mi31Var = it7.next();
                            if (jl40.l(((mi31) mi31Var).a.b, oa31Var.g)) {
                                break;
                            }
                        }
                        mi31Var5 = mi31Var;
                        if (mi31Var5 == null) {
                            mi31Var5 = (mi31) kotlin.collections.a.P(b);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (mi31 mi31Var6 : b) {
                        arrayList4.add(new a3u(mi31Var6, jl40.l(mi31Var6, mi31Var5)));
                    }
                    c = '\n';
                    ArrayList arrayList5 = new ArrayList(tcc.n(arrayList4, 10));
                    Iterator it8 = arrayList4.iterator();
                    mi31 mi31Var7 = null;
                    while (it8.hasNext()) {
                        a3u a3uVar = (a3u) it8.next();
                        boolean z2 = a3uVar.b;
                        mi31 mi31Var8 = a3uVar.a;
                        if (z2) {
                            mi31Var7 = mi31Var8;
                        }
                        arrayList5.add(mi31.a(mi31Var8, null, str2, 29));
                    }
                    if (mi31Var7 == null && (mi31Var7 = (mi31) kotlin.collections.a.R(arrayList5)) == null) {
                        ny61.r("Empty");
                        return null;
                    }
                    za31Var = new za31(oa31Var, arrayList5, mi31Var7);
                }
            }
            if (za31Var != null) {
                arrayList2.add(za31Var);
            }
            c2 = c;
        }
        int i3 = 0;
        if (!z && !arrayList2.isEmpty()) {
            Iterator it9 = arrayList.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    i = -1;
                    break;
                }
                if (((pex0) it9.next()).K0) {
                    i = i3;
                    break;
                }
                i3++;
            }
            if (i >= 0) {
                ArrayList arrayList6 = new ArrayList(arrayList2);
                za31 n0 = new ois0((pex0) arrayList.get(i)).n0();
                if (i > arrayList2.size()) {
                    arrayList6.add(n0);
                    return arrayList6;
                }
                arrayList6.add(i, n0);
                return arrayList6;
            }
        }
        return arrayList2;
    }

    public final pex0 d(oa31 oa31Var, pex0 pex0Var) {
        pex0 pex0Var2;
        Object i2d0Var;
        Object tr40Var;
        Object xu1Var;
        ArrayList a = this.c.a(oa31Var.a, pex0Var.b, oa31Var.n);
        if (!a.isEmpty()) {
            ArrayList arrayList = new ArrayList(pex0Var.c);
            Iterator it = a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                RequirementOverrideDto requirementOverrideDto = (RequirementOverrideDto) it.next();
                Iterator it2 = arrayList.iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (jl40.l(((lmw0) it2.next()).getName(), requirementOverrideDto.a)) {
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                    lmw0 lmw0Var = (lmw0) arrayList.get(i);
                    lmw0 h0 = ffx.h0(lmw0Var, requirementOverrideDto, pex0Var.b);
                    if (!h0.equals(lmw0Var)) {
                        arrayList.set(i, h0);
                        z = true;
                    }
                }
            }
            if (z) {
                List<ex1> list = pex0Var.t0.a;
                ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
                for (ex1 ex1Var : list) {
                    if (ex1Var instanceof nu1) {
                        nu1 nu1Var = (nu1) ex1Var;
                        tr40Var = new nu1(pex0.a(nu1Var.a, null, arrayList, null, null, null, null, null, null, 0, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, -5, -1, 8388607), nu1Var.b, nu1Var.c, nu1Var.d, nu1Var.e, nu1Var.f, nu1Var.g);
                    } else {
                        if (ex1Var instanceof zu1) {
                            zu1 zu1Var = (zu1) ex1Var;
                            i2d0Var = new zu1(pex0.a(zu1Var.a, null, arrayList, null, null, null, null, null, null, 0, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, -5, -1, 8388607), zu1Var.b);
                        } else {
                            if (ex1Var instanceof av1) {
                                av1 av1Var = (av1) ex1Var;
                                xu1Var = new av1(pex0.a(av1Var.a, null, arrayList, null, null, null, null, null, null, 0, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, -5, -1, 8388607), av1Var.b, av1Var.c);
                            } else if (ex1Var instanceof fid0) {
                                i2d0Var = new fid0(pex0.a(((fid0) ex1Var).a, null, arrayList, null, null, null, null, null, null, 0, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, -5, -1, 8388607));
                            } else if (ex1Var instanceof pnx0) {
                                i2d0Var = new pnx0(pex0.a(((pnx0) ex1Var).a, null, arrayList, null, null, null, null, null, null, 0, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, -5, -1, 8388607));
                            } else if (ex1Var instanceof gl2) {
                                i2d0Var = new gl2(pex0.a(((gl2) ex1Var).a, null, arrayList, null, null, null, null, null, null, 0, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, -5, -1, 8388607));
                            } else if (ex1Var instanceof njc) {
                                i2d0Var = new njc(pex0.a(((njc) ex1Var).a, null, arrayList, null, null, null, null, null, null, 0, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, -5, -1, 8388607));
                            } else if (ex1Var instanceof q8f) {
                                i2d0Var = new q8f(pex0.a(((q8f) ex1Var).a, null, arrayList, null, null, null, null, null, null, 0, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, -5, -1, 8388607));
                            } else if (ex1Var instanceof v2h) {
                                i2d0Var = new v2h(pex0.a(((v2h) ex1Var).a, null, arrayList, null, null, null, null, null, null, 0, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, -5, -1, 8388607));
                            } else if (ex1Var instanceof xu1) {
                                xu1 xu1Var2 = (xu1) ex1Var;
                                xu1Var = new xu1(pex0.a(xu1Var2.a, null, arrayList, null, null, null, null, null, null, 0, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, -5, -1, 8388607), xu1Var2.b, xu1Var2.c);
                            } else if (ex1Var instanceof xx00) {
                                i2d0Var = new xx00(pex0.a(((xx00) ex1Var).a, null, arrayList, null, null, null, null, null, null, 0, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, -5, -1, 8388607));
                            } else if (ex1Var instanceof tr40) {
                                tr40 tr40Var2 = (tr40) ex1Var;
                                tr40Var = new tr40(pex0.a(tr40Var2.a, null, arrayList, null, null, null, null, null, null, 0, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, -5, -1, 8388607), tr40Var2.b, tr40Var2.c, tr40Var2.d, tr40Var2.e, tr40Var2.f, tr40Var2.g);
                            } else if (ex1Var instanceof umd0) {
                                i2d0Var = new umd0(pex0.a(((umd0) ex1Var).a, null, arrayList, null, null, null, null, null, null, 0, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, -5, -1, 8388607));
                            } else {
                                if (!(ex1Var instanceof i2d0)) {
                                    w511.b();
                                    return null;
                                }
                                i2d0Var = new i2d0(pex0.a(((i2d0) ex1Var).a, null, arrayList, null, null, null, null, null, null, 0, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, -5, -1, 8388607));
                            }
                            i2d0Var = xu1Var;
                        }
                        arrayList2.add(i2d0Var);
                    }
                    i2d0Var = tr40Var;
                    arrayList2.add(i2d0Var);
                }
                pex0 a2 = pex0.a(pex0Var, null, arrayList, null, null, null, null, null, null, 0, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, new ru.yandex.taxi.tariffs.model.a(arrayList2), null, -5, -1, 8388479);
                if (!pex0Var.g() && (pex0Var2 = pex0Var.M0) != null) {
                    pex0 d = d(oa31Var, pex0Var2);
                    if (a2.M0 == null) {
                        a2.M0 = d;
                    }
                }
                return a2;
            }
        }
        return pex0Var;
    }
}
