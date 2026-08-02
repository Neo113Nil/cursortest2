package com.yandex.mob.domain;

import com.yandex.mob.api.model.MobAvailabilityCheckStrategyName;
import com.yandex.mob.api.model.MobContourAvailabilityCheckStrategyName;
import com.yandex.mob.api.model.MobPingPolicy;
import com.yandex.mob.reporting.MobTrigger;
import defpackage.am20;
import defpackage.co2;
import defpackage.dn20;
import defpackage.do2;
import defpackage.em20;
import defpackage.evu0;
import defpackage.gw00;
import defpackage.ha4;
import defpackage.ia4;
import defpackage.jdr;
import defpackage.jl40;
import defpackage.lq20;
import defpackage.ny61;
import defpackage.pr20;
import defpackage.qt1;
import defpackage.qv10;
import defpackage.sl20;
import defpackage.tcc;
import defpackage.tm20;
import defpackage.u00;
import defpackage.un20;
import defpackage.vng;
import defpackage.w511;
import defpackage.wwg;
import defpackage.ym20;
import defpackage.zm20;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public final l a;
    public final com.yandex.mob.datastore.d b;
    public final com.yandex.mob.datastore.f c;
    public final un20 d;
    public final do2 e;
    public final do2 f;
    public final do2 g;

    public a(l lVar, com.yandex.mob.datastore.d dVar, com.yandex.mob.datastore.f fVar, un20 un20Var, u00 u00Var, jdr jdrVar, qt1 qt1Var) {
        this.a = lVar;
        this.b = dVar;
        this.c = fVar;
        this.d = un20Var;
        this.e = u00Var;
        this.f = jdrVar;
        this.g = qt1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x01ac, code lost:
    
        if (r7 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x010c, code lost:
    
        if (r11 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x03da, code lost:
    
        if (r12 == r13) goto L181;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0299 A[LOOP:0: B:24:0x0293->B:26:0x0299, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x039b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26, types: [lq20] */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.yandex.mob.domain.a] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(MobAvailabilityCheckStrategyName mobAvailabilityCheckStrategyName, MobTrigger mobTrigger, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        AvailabilityCheckPlanner$createPlan$1 availabilityCheckPlanner$createPlan$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        boolean z3;
        MobAvailabilityCheckStrategyName mobAvailabilityCheckStrategyName2;
        MobTrigger mobTrigger2;
        boolean z4;
        Object b;
        tm20 tm20Var;
        MobTrigger mobTrigger3;
        MobAvailabilityCheckStrategyName mobAvailabilityCheckStrategyName3;
        Object obj;
        Object b2;
        MobTrigger mobTrigger4;
        Map map;
        List list;
        Object obj2;
        MobAvailabilityCheckStrategyName mobAvailabilityCheckStrategyName4;
        boolean z5;
        String str;
        List list2;
        MobContourAvailabilityCheckStrategyName mobContourAvailabilityCheckStrategyName;
        ?? linkedHashMap;
        Object obj3;
        boolean z6;
        Map map2;
        boolean z7;
        Map map3;
        List list3;
        MobAvailabilityCheckStrategyName mobAvailabilityCheckStrategyName5;
        MobTrigger mobTrigger5;
        int i2;
        pr20 pr20Var;
        do2 do2Var;
        int d;
        boolean z8;
        Map f;
        Iterator it;
        ?? r10;
        boolean z9;
        boolean z10;
        lq20 lq20Var;
        if (continuationImpl instanceof AvailabilityCheckPlanner$createPlan$1) {
            availabilityCheckPlanner$createPlan$1 = (AvailabilityCheckPlanner$createPlan$1) continuationImpl;
            int i3 = availabilityCheckPlanner$createPlan$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                availabilityCheckPlanner$createPlan$1.label = i3 - Integer.MIN_VALUE;
                Object obj4 = availabilityCheckPlanner$createPlan$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = availabilityCheckPlanner$createPlan$1.label;
                Object obj5 = null;
                if (i != 0) {
                    kotlin.b.b(obj4);
                    availabilityCheckPlanner$createPlan$1.L$0 = mobAvailabilityCheckStrategyName;
                    availabilityCheckPlanner$createPlan$1.L$1 = mobTrigger;
                    z3 = z;
                    availabilityCheckPlanner$createPlan$1.Z$0 = z3;
                    availabilityCheckPlanner$createPlan$1.Z$1 = z2;
                    availabilityCheckPlanner$createPlan$1.label = 1;
                    Object d2 = this.a.d(availabilityCheckPlanner$createPlan$1);
                    if (d2 != coroutineSingletons) {
                        mobAvailabilityCheckStrategyName2 = mobAvailabilityCheckStrategyName;
                        obj4 = d2;
                        mobTrigger2 = mobTrigger;
                        z4 = z2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        z4 = availabilityCheckPlanner$createPlan$1.Z$1;
                        z3 = availabilityCheckPlanner$createPlan$1.Z$0;
                        mobAvailabilityCheckStrategyName3 = (MobAvailabilityCheckStrategyName) availabilityCheckPlanner$createPlan$1.L$3;
                        tm20 tm20Var2 = (tm20) availabilityCheckPlanner$createPlan$1.L$2;
                        mobTrigger3 = (MobTrigger) availabilityCheckPlanner$createPlan$1.L$1;
                        kotlin.b.b(obj4);
                        tm20Var = tm20Var2;
                        List list4 = (List) obj4;
                        List list5 = tm20Var.c;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Object obj6 : list5) {
                            String j = wwg.j((lq20) obj6);
                            Object obj7 = linkedHashMap2.get(j);
                            if (obj7 == null) {
                                obj7 = qv10.w(j, linkedHashMap2);
                            }
                            ((List) obj7).add(obj6);
                        }
                        availabilityCheckPlanner$createPlan$1.L$0 = null;
                        availabilityCheckPlanner$createPlan$1.L$1 = mobTrigger3;
                        availabilityCheckPlanner$createPlan$1.L$2 = tm20Var;
                        availabilityCheckPlanner$createPlan$1.L$3 = mobAvailabilityCheckStrategyName3;
                        availabilityCheckPlanner$createPlan$1.L$4 = list4;
                        availabilityCheckPlanner$createPlan$1.L$5 = linkedHashMap2;
                        availabilityCheckPlanner$createPlan$1.Z$0 = z3;
                        availabilityCheckPlanner$createPlan$1.Z$1 = z4;
                        availabilityCheckPlanner$createPlan$1.label = 3;
                        b2 = this.d.b(availabilityCheckPlanner$createPlan$1);
                        if (b2 != coroutineSingletons) {
                            mobTrigger4 = mobTrigger3;
                            map = linkedHashMap2;
                            list = list4;
                            obj2 = b2;
                            mobAvailabilityCheckStrategyName4 = mobAvailabilityCheckStrategyName3;
                            z5 = z3;
                            str = (String) obj2;
                            if (str == null) {
                            }
                            list2 = tm20Var.b.i;
                            if (list2 != null) {
                            }
                            mobContourAvailabilityCheckStrategyName = MobContourAvailabilityCheckStrategyName.CurrentAndDefault;
                            if (mobTrigger4 != MobTrigger.ResumeAfterNotComplete) {
                            }
                            Object obj8 = obj5;
                            Map map4 = tm20Var.d;
                            availabilityCheckPlanner$createPlan$1.L$0 = obj8;
                            availabilityCheckPlanner$createPlan$1.L$1 = mobTrigger4;
                            availabilityCheckPlanner$createPlan$1.L$2 = obj8;
                            availabilityCheckPlanner$createPlan$1.L$3 = mobAvailabilityCheckStrategyName4;
                            availabilityCheckPlanner$createPlan$1.L$4 = list;
                            availabilityCheckPlanner$createPlan$1.L$5 = map;
                            availabilityCheckPlanner$createPlan$1.L$6 = obj8;
                            availabilityCheckPlanner$createPlan$1.L$7 = linkedHashMap;
                            availabilityCheckPlanner$createPlan$1.Z$0 = z5;
                            availabilityCheckPlanner$createPlan$1.Z$1 = z4;
                            availabilityCheckPlanner$createPlan$1.label = 4;
                            obj4 = b(mobTrigger4, linkedHashMap, map4, availabilityCheckPlanner$createPlan$1);
                            if (obj4 != coroutineSingletons) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i == 3) {
                        z4 = availabilityCheckPlanner$createPlan$1.Z$1;
                        z5 = availabilityCheckPlanner$createPlan$1.Z$0;
                        map = (Map) availabilityCheckPlanner$createPlan$1.L$5;
                        list = (List) availabilityCheckPlanner$createPlan$1.L$4;
                        mobAvailabilityCheckStrategyName4 = (MobAvailabilityCheckStrategyName) availabilityCheckPlanner$createPlan$1.L$3;
                        tm20Var = (tm20) availabilityCheckPlanner$createPlan$1.L$2;
                        mobTrigger4 = (MobTrigger) availabilityCheckPlanner$createPlan$1.L$1;
                        kotlin.b.b(obj4);
                        ym20 ym20Var = (ym20) obj4;
                        obj2 = ym20Var != null ? ym20Var.a : null;
                        str = (String) obj2;
                        if (str == null) {
                            str = null;
                        }
                        list2 = tm20Var.b.i;
                        if (list2 != null) {
                            Iterator it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    mobContourAvailabilityCheckStrategyName = null;
                                    break;
                                }
                                dn20 dn20Var = (dn20) it2.next();
                                mobContourAvailabilityCheckStrategyName = dn20Var != null ? dn20Var.getA() : null;
                                if (mobContourAvailabilityCheckStrategyName != null) {
                                    break;
                                }
                            }
                        }
                        mobContourAvailabilityCheckStrategyName = MobContourAvailabilityCheckStrategyName.CurrentAndDefault;
                        if (mobTrigger4 != MobTrigger.ResumeAfterNotComplete) {
                            linkedHashMap = map;
                        } else {
                            linkedHashMap = new LinkedHashMap();
                            for (Map.Entry entry : map.entrySet()) {
                                lq20 lq20Var2 = (lq20) kotlin.collections.a.R((List) entry.getValue());
                                if (lq20Var2 != null) {
                                    zm20 i4 = vng.i(lq20Var2);
                                    obj3 = obj5;
                                    if (!jl40.l(i4.b, "mob")) {
                                        String str2 = i4.a;
                                        int i5 = ia4.a[mobContourAvailabilityCheckStrategyName.ordinal()];
                                        if (i5 != 1) {
                                            if (i5 != 2) {
                                                w511.b();
                                                return obj3;
                                            }
                                        } else if (!jl40.l(str2, str) && !jl40.l(str2, "default")) {
                                        }
                                    }
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                } else {
                                    obj3 = obj5;
                                }
                                obj5 = obj3;
                            }
                        }
                        Object obj82 = obj5;
                        Map map42 = tm20Var.d;
                        availabilityCheckPlanner$createPlan$1.L$0 = obj82;
                        availabilityCheckPlanner$createPlan$1.L$1 = mobTrigger4;
                        availabilityCheckPlanner$createPlan$1.L$2 = obj82;
                        availabilityCheckPlanner$createPlan$1.L$3 = mobAvailabilityCheckStrategyName4;
                        availabilityCheckPlanner$createPlan$1.L$4 = list;
                        availabilityCheckPlanner$createPlan$1.L$5 = map;
                        availabilityCheckPlanner$createPlan$1.L$6 = obj82;
                        availabilityCheckPlanner$createPlan$1.L$7 = linkedHashMap;
                        availabilityCheckPlanner$createPlan$1.Z$0 = z5;
                        availabilityCheckPlanner$createPlan$1.Z$1 = z4;
                        availabilityCheckPlanner$createPlan$1.label = 4;
                        obj4 = b(mobTrigger4, linkedHashMap, map42, availabilityCheckPlanner$createPlan$1);
                        if (obj4 != coroutineSingletons) {
                            z6 = z4;
                            map2 = linkedHashMap;
                            z7 = z5;
                            map3 = map;
                            list3 = list;
                            mobAvailabilityCheckStrategyName5 = mobAvailabilityCheckStrategyName4;
                            mobTrigger5 = mobTrigger4;
                            Map map5 = (Map) obj4;
                            i2 = ia4.b[mobAvailabilityCheckStrategyName5.ordinal()];
                            if (i2 != 1) {
                            }
                            List list6 = list3;
                            d = gw00.d(tcc.n(list6, 10));
                            if (d < 16) {
                            }
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap(d);
                            while (r11.hasNext()) {
                            }
                            ArrayList arrayList = new ArrayList(map5.size());
                            while (r1.hasNext()) {
                            }
                            if (z7) {
                            }
                            Map map6 = f;
                            ArrayList arrayList2 = new ArrayList();
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                            }
                            return new ha4(mobAvailabilityCheckStrategyName5, mobTrigger5, z7, z6, list3, map6, arrayList2, mobTrigger5 != MobTrigger.ResumeAfterNotComplete ? z8 : false);
                        }
                        return coroutineSingletons;
                    }
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z11 = availabilityCheckPlanner$createPlan$1.Z$1;
                    boolean z12 = availabilityCheckPlanner$createPlan$1.Z$0;
                    Map map7 = (Map) availabilityCheckPlanner$createPlan$1.L$7;
                    map3 = (Map) availabilityCheckPlanner$createPlan$1.L$5;
                    List list7 = (List) availabilityCheckPlanner$createPlan$1.L$4;
                    MobAvailabilityCheckStrategyName mobAvailabilityCheckStrategyName6 = (MobAvailabilityCheckStrategyName) availabilityCheckPlanner$createPlan$1.L$3;
                    MobTrigger mobTrigger6 = (MobTrigger) availabilityCheckPlanner$createPlan$1.L$1;
                    kotlin.b.b(obj4);
                    z6 = z11;
                    map2 = map7;
                    list3 = list7;
                    mobAvailabilityCheckStrategyName5 = mobAvailabilityCheckStrategyName6;
                    z7 = z12;
                    mobTrigger5 = mobTrigger6;
                    Map map52 = (Map) obj4;
                    i2 = ia4.b[mobAvailabilityCheckStrategyName5.ordinal()];
                    if (i2 != 1) {
                        pr20Var = null;
                        do2Var = this.e;
                    } else if (i2 == 2) {
                        pr20Var = null;
                        do2Var = this.f;
                    } else {
                        if (i2 != 3) {
                            w511.b();
                            return null;
                        }
                        do2Var = this.g;
                        pr20Var = null;
                    }
                    List list62 = list3;
                    d = gw00.d(tcc.n(list62, 10));
                    if (d < 16) {
                        d = 16;
                    }
                    LinkedHashMap linkedHashMap32 = new LinkedHashMap(d);
                    for (Object obj9 : list62) {
                        linkedHashMap32.put(wwg.j(((pr20) obj9).a), obj9);
                    }
                    ArrayList arrayList3 = new ArrayList(map52.size());
                    for (Map.Entry entry2 : map52.entrySet()) {
                        String str3 = (String) entry2.getKey();
                        List list8 = (List) entry2.getValue();
                        pr20 pr20Var2 = (pr20) linkedHashMap32.get(str3);
                        if (pr20Var2 == null || !list8.contains(pr20Var2.a)) {
                            pr20Var2 = pr20Var;
                        }
                        arrayList3.add(do2Var.a(pr20Var2, str3, list8));
                    }
                    if (z7) {
                        z8 = true;
                        f = kotlin.collections.b.f();
                    } else {
                        MapBuilder mapBuilder = new MapBuilder();
                        if (mobTrigger5 != MobTrigger.ResumeAfterNotComplete) {
                            Map k = kotlin.collections.b.k(map3, map2.keySet());
                            int d3 = gw00.d(tcc.n(list62, 10));
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap(d3 < 16 ? 16 : d3);
                            for (Object obj10 : list62) {
                                linkedHashMap4.put(wwg.j(((pr20) obj10).a), obj10);
                            }
                            ArrayList arrayList4 = new ArrayList();
                            for (Map.Entry entry3 : k.entrySet()) {
                                String str4 = (String) entry3.getKey();
                                List list9 = (List) entry3.getValue();
                                pr20 pr20Var3 = (pr20) linkedHashMap4.get(str4);
                                if (pr20Var3 == null || !list9.contains(pr20Var3.a)) {
                                    pr20Var3 = pr20Var;
                                }
                                Object pair = (pr20Var3 == null && (lq20Var = (lq20) kotlin.collections.a.R(list9)) != null) ? new Pair(str4, lq20Var) : pr20Var;
                                if (pair != null) {
                                    arrayList4.add(pair);
                                }
                            }
                            mapBuilder.putAll(kotlin.collections.b.s(arrayList4));
                        }
                        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            co2 co2Var = (co2) it3.next();
                            int size = tcc.o(co2Var.c).size();
                            if (z6 && size == 1) {
                                List list10 = (List) kotlin.collections.a.R(co2Var.c);
                                r10 = list10 != null ? (lq20) kotlin.collections.a.R(list10) : pr20Var;
                                if (r10 != 0) {
                                    String str5 = r10.g;
                                    if (str5 != null) {
                                        z9 = true;
                                        z10 = !evu0.J(str5);
                                    } else {
                                        z9 = true;
                                        z10 = false;
                                    }
                                }
                                if (r10 == 0) {
                                    linkedHashMap5.put(co2Var.a, r10);
                                }
                            }
                            r10 = pr20Var;
                            if (r10 == 0) {
                            }
                        }
                        z8 = true;
                        mapBuilder.putAll(linkedHashMap5);
                        f = mapBuilder.j();
                    }
                    Map map62 = f;
                    ArrayList arrayList22 = new ArrayList();
                    it = arrayList3.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (!map62.containsKey(((co2) next).a)) {
                            arrayList22.add(next);
                        }
                    }
                    return new ha4(mobAvailabilityCheckStrategyName5, mobTrigger5, z7, z6, list3, map62, arrayList22, mobTrigger5 != MobTrigger.ResumeAfterNotComplete ? z8 : false);
                }
                z4 = availabilityCheckPlanner$createPlan$1.Z$1;
                z3 = availabilityCheckPlanner$createPlan$1.Z$0;
                mobTrigger2 = (MobTrigger) availabilityCheckPlanner$createPlan$1.L$1;
                mobAvailabilityCheckStrategyName2 = (MobAvailabilityCheckStrategyName) availabilityCheckPlanner$createPlan$1.L$0;
                kotlin.b.b(obj4);
                tm20 tm20Var3 = (tm20) obj4;
                if (mobAvailabilityCheckStrategyName2 == null) {
                    List list11 = tm20Var3.b.h;
                    if (list11 != null) {
                        Iterator it4 = list11.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it4.next();
                            if (((am20) obj).a != null) {
                                break;
                            }
                        }
                        am20 am20Var = (am20) obj;
                        if (am20Var != null) {
                            mobAvailabilityCheckStrategyName2 = am20Var.a;
                        }
                    }
                    mobAvailabilityCheckStrategyName2 = MobAvailabilityCheckStrategyName.ActiveAndFirst;
                }
                availabilityCheckPlanner$createPlan$1.L$0 = null;
                availabilityCheckPlanner$createPlan$1.L$1 = mobTrigger2;
                availabilityCheckPlanner$createPlan$1.L$2 = tm20Var3;
                availabilityCheckPlanner$createPlan$1.L$3 = mobAvailabilityCheckStrategyName2;
                availabilityCheckPlanner$createPlan$1.Z$0 = z3;
                availabilityCheckPlanner$createPlan$1.Z$1 = z4;
                availabilityCheckPlanner$createPlan$1.label = 2;
                b = this.c.b(availabilityCheckPlanner$createPlan$1);
                if (b != coroutineSingletons) {
                    tm20Var = tm20Var3;
                    obj4 = b;
                    mobTrigger3 = mobTrigger2;
                    mobAvailabilityCheckStrategyName3 = mobAvailabilityCheckStrategyName2;
                    List list42 = (List) obj4;
                    List list52 = tm20Var.c;
                    LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                    while (r11.hasNext()) {
                    }
                    availabilityCheckPlanner$createPlan$1.L$0 = null;
                    availabilityCheckPlanner$createPlan$1.L$1 = mobTrigger3;
                    availabilityCheckPlanner$createPlan$1.L$2 = tm20Var;
                    availabilityCheckPlanner$createPlan$1.L$3 = mobAvailabilityCheckStrategyName3;
                    availabilityCheckPlanner$createPlan$1.L$4 = list42;
                    availabilityCheckPlanner$createPlan$1.L$5 = linkedHashMap22;
                    availabilityCheckPlanner$createPlan$1.Z$0 = z3;
                    availabilityCheckPlanner$createPlan$1.Z$1 = z4;
                    availabilityCheckPlanner$createPlan$1.label = 3;
                    b2 = this.d.b(availabilityCheckPlanner$createPlan$1);
                    if (b2 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        availabilityCheckPlanner$createPlan$1 = new AvailabilityCheckPlanner$createPlan$1(this, continuationImpl);
        Object obj42 = availabilityCheckPlanner$createPlan$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = availabilityCheckPlanner$createPlan$1.label;
        Object obj52 = null;
        if (i != 0) {
        }
        tm20 tm20Var32 = (tm20) obj42;
        if (mobAvailabilityCheckStrategyName2 == null) {
        }
        availabilityCheckPlanner$createPlan$1.L$0 = null;
        availabilityCheckPlanner$createPlan$1.L$1 = mobTrigger2;
        availabilityCheckPlanner$createPlan$1.L$2 = tm20Var32;
        availabilityCheckPlanner$createPlan$1.L$3 = mobAvailabilityCheckStrategyName2;
        availabilityCheckPlanner$createPlan$1.Z$0 = z3;
        availabilityCheckPlanner$createPlan$1.Z$1 = z4;
        availabilityCheckPlanner$createPlan$1.label = 2;
        b = this.c.b(availabilityCheckPlanner$createPlan$1);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(MobTrigger mobTrigger, Map map, Map map2, ContinuationImpl continuationImpl) {
        AvailabilityCheckPlanner$getProxyGroupsForTrigger$1 availabilityCheckPlanner$getProxyGroupsForTrigger$1;
        int i;
        String str;
        sl20 sl20Var;
        em20 em20Var;
        if (continuationImpl instanceof AvailabilityCheckPlanner$getProxyGroupsForTrigger$1) {
            availabilityCheckPlanner$getProxyGroupsForTrigger$1 = (AvailabilityCheckPlanner$getProxyGroupsForTrigger$1) continuationImpl;
            int i2 = availabilityCheckPlanner$getProxyGroupsForTrigger$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                availabilityCheckPlanner$getProxyGroupsForTrigger$1.label = i2 - Integer.MIN_VALUE;
                Object obj = availabilityCheckPlanner$getProxyGroupsForTrigger$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = availabilityCheckPlanner$getProxyGroupsForTrigger$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (mobTrigger != MobTrigger.ResumeAfterNotComplete) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            lq20 lq20Var = (lq20) kotlin.collections.a.R((List) entry.getValue());
                            if (lq20Var != null && (str = vng.i(lq20Var).b) != null) {
                                if (((map2 == null || (sl20Var = (sl20) map2.get(str)) == null) ? null : sl20Var.getA()) != MobPingPolicy.NoAuto) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        return linkedHashMap;
                    }
                    availabilityCheckPlanner$getProxyGroupsForTrigger$1.L$0 = null;
                    availabilityCheckPlanner$getProxyGroupsForTrigger$1.L$1 = map;
                    availabilityCheckPlanner$getProxyGroupsForTrigger$1.L$2 = null;
                    availabilityCheckPlanner$getProxyGroupsForTrigger$1.label = 1;
                    obj = this.b.a(availabilityCheckPlanner$getProxyGroupsForTrigger$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    map = (Map) availabilityCheckPlanner$getProxyGroupsForTrigger$1.L$1;
                    kotlin.b.b(obj);
                }
                em20Var = (em20) obj;
                if (em20Var != null) {
                    return map;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : map.entrySet()) {
                    if (em20Var.b.contains((String) entry2.getKey())) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                return linkedHashMap2;
            }
        }
        availabilityCheckPlanner$getProxyGroupsForTrigger$1 = new AvailabilityCheckPlanner$getProxyGroupsForTrigger$1(this, continuationImpl);
        Object obj2 = availabilityCheckPlanner$getProxyGroupsForTrigger$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = availabilityCheckPlanner$getProxyGroupsForTrigger$1.label;
        if (i != 0) {
        }
        em20Var = (em20) obj2;
        if (em20Var != null) {
        }
    }
}
