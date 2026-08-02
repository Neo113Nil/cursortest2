package com.yandex.mob.domain;

import defpackage.bvf0;
import defpackage.co2;
import defpackage.gw00;
import defpackage.hm20;
import defpackage.jl40;
import defpackage.lq20;
import defpackage.mq20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oq20;
import defpackage.pl20;
import defpackage.pr20;
import defpackage.qv10;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.wwg;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lpl20;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.domain.SharedParallelApiNameAvailabilityReportProcessor$process$1", f = "SharedParallelApiNameAvailabilityReportProcessor.kt", l = {HProv.ALG_SID_SHA3_256, 106, 130}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class SharedParallelApiNameAvailabilityReportProcessor$process$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<co2> $checkOrders;
    final /* synthetic */ List<pr20> $currentSelectedProxies;
    final /* synthetic */ oq20 $mobQueryParams;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    int I$5;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$15;
    Object L$16;
    Object L$17;
    Object L$18;
    Object L$19;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    int label;
    final /* synthetic */ t this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lmq20;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.mob.domain.SharedParallelApiNameAvailabilityReportProcessor$process$1$1", f = "SharedParallelApiNameAvailabilityReportProcessor.kt", l = {90}, m = "invokeSuspend")
    /* renamed from: com.yandex.mob.domain.SharedParallelApiNameAvailabilityReportProcessor$process$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ ConcurrentHashMap<String, mq20> $hostResults;
        final /* synthetic */ oq20 $mobQueryParams;
        final /* synthetic */ Map<String, List<Pair<String, lq20>>> $proxiesToCheck;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Map map, t tVar, ConcurrentHashMap concurrentHashMap, oq20 oq20Var, Continuation continuation) {
            super(2, continuation);
            this.$proxiesToCheck = map;
            this.this$0 = tVar;
            this.$hostResults = concurrentHashMap;
            this.$mobQueryParams = oq20Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$proxiesToCheck, this.this$0, this.$hostResults, this.$mobQueryParams, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            Set<String> keySet = this.$proxiesToCheck.keySet();
            t tVar = this.this$0;
            ConcurrentHashMap<String, mq20> concurrentHashMap = this.$hostResults;
            Map<String, List<Pair<String, lq20>>> map = this.$proxiesToCheck;
            oq20 oq20Var = this.$mobQueryParams;
            ArrayList arrayList = new ArrayList(tcc.n(keySet, 10));
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(tje.h(tseVar, tVar.c, null, new SharedParallelApiNameAvailabilityReportProcessor$process$1$1$1$1(concurrentHashMap, (String) it.next(), map, tVar, oq20Var, null), 2));
            }
            this.L$0 = null;
            this.label = 1;
            Object b = kotlinx.coroutines.a.b(arrayList, this);
            return b == coroutineSingletons ? coroutineSingletons : b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedParallelApiNameAvailabilityReportProcessor$process$1(List list, t tVar, oq20 oq20Var, List list2, Continuation continuation) {
        super(2, continuation);
        this.$checkOrders = list;
        this.this$0 = tVar;
        this.$mobQueryParams = oq20Var;
        this.$currentSelectedProxies = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SharedParallelApiNameAvailabilityReportProcessor$process$1 sharedParallelApiNameAvailabilityReportProcessor$process$1 = new SharedParallelApiNameAvailabilityReportProcessor$process$1(this.$checkOrders, this.this$0, this.$mobQueryParams, this.$currentSelectedProxies, continuation);
        sharedParallelApiNameAvailabilityReportProcessor$process$1.L$0 = obj;
        return sharedParallelApiNameAvailabilityReportProcessor$process$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SharedParallelApiNameAvailabilityReportProcessor$process$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x038b, code lost:
    
        r16 = r2;
        r2 = r1;
        r1 = r16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0173  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x034c -> B:37:0x0356). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0362 -> B:38:0x035f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0276 -> B:40:0x0286). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        Ref$IntRef ref$IntRef;
        vpr vprVar;
        LinkedHashSet linkedHashSet;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        EmptyList emptyList;
        vpr vprVar2;
        CoroutineSingletons coroutineSingletons;
        List<pr20> list;
        Map map;
        Iterator it;
        int i;
        ConcurrentHashMap concurrentHashMap3;
        LinkedHashSet linkedHashSet2;
        ?? r5;
        Ref$IntRef ref$IntRef2;
        vpr vprVar3;
        Map map2;
        t tVar;
        Iterator it2;
        int i2;
        EmptyList emptyList2;
        ?? r13;
        int i3;
        int i4;
        Object obj2;
        int i5;
        Object putIfAbsent;
        Object obj3;
        Object obj4;
        pr20 pr20Var;
        vpr vprVar4 = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = this.label;
        EmptyList emptyList3 = EmptyList.a;
        if (i6 == 0) {
            kotlin.b.b(obj);
            ConcurrentHashMap concurrentHashMap4 = new ConcurrentHashMap(this.$checkOrders.size());
            ConcurrentHashMap concurrentHashMap5 = new ConcurrentHashMap();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            List<co2> list2 = this.$checkOrders;
            int d = gw00.d(tcc.n(list2, 10));
            if (d < 16) {
                d = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(d);
            for (co2 co2Var : list2) {
                Pair pair = new Pair(co2Var.a, Boolean.valueOf(co2Var.b));
                linkedHashMap2.put(pair.c(), pair.f());
            }
            concurrentHashMap = concurrentHashMap4;
            concurrentHashMap2 = concurrentHashMap5;
            ref$IntRef = new Ref$IntRef();
            vprVar = vprVar4;
            linkedHashSet = linkedHashSet3;
            linkedHashMap = linkedHashMap2;
            kotlinx.coroutines.a.k(get_context());
            List<co2> list3 = this.$checkOrders;
            arrayList = new ArrayList();
            while (r8.hasNext()) {
            }
            emptyList = emptyList3;
            if (!arrayList.isEmpty()) {
            }
        } else if (i6 == 1) {
            map2 = (Map) this.L$7;
            Ref$IntRef ref$IntRef3 = (Ref$IntRef) this.L$5;
            Map map3 = (Map) this.L$4;
            ?? r52 = (Set) this.L$3;
            ConcurrentHashMap concurrentHashMap6 = (ConcurrentHashMap) this.L$2;
            concurrentHashMap3 = (ConcurrentHashMap) this.L$1;
            kotlin.b.b(obj);
            concurrentHashMap2 = concurrentHashMap6;
            linkedHashSet2 = r52;
            r5 = map3;
            ref$IntRef2 = ref$IntRef3;
            vprVar3 = vprVar4;
            emptyList = emptyList3;
            tVar = this.this$0;
            it2 = ((Iterable) obj).iterator();
            i2 = 0;
            if (it2.hasNext()) {
            }
        } else {
            if (i6 != 2) {
                if (i6 != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i7 = this.I$0;
                it = (Iterator) this.L$8;
                list = (List) this.L$7;
                map = (Map) this.L$4;
                kotlin.b.b(obj);
                vprVar2 = vprVar4;
                coroutineSingletons = coroutineSingletons2;
                i = i7;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    List list4 = (List) entry.getValue();
                    boolean l = jl40.l(map.get(str), Boolean.TRUE);
                    Iterator it3 = list4.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it3.next();
                        if (((mq20) obj3).b.a) {
                            break;
                        }
                    }
                    mq20 mq20Var = (mq20) obj3;
                    if (l || mq20Var == null) {
                        if (mq20Var != null) {
                            pr20Var = new pr20(mq20Var.a, mq20Var.b.b);
                        } else {
                            Iterator it4 = list.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    obj4 = null;
                                    break;
                                }
                                obj4 = it4.next();
                                if (jl40.l(wwg.j(((pr20) obj4).a), str)) {
                                    break;
                                }
                            }
                            pr20Var = (pr20) obj4;
                        }
                        pl20 pl20Var = new pl20(pr20Var, str, list4);
                        this.L$0 = vprVar2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = map;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.L$7 = list;
                        this.L$8 = it;
                        this.L$9 = null;
                        this.L$10 = null;
                        this.L$11 = null;
                        this.L$12 = null;
                        this.L$13 = null;
                        this.L$14 = null;
                        this.L$15 = null;
                        this.L$16 = null;
                        this.L$17 = null;
                        this.L$18 = null;
                        this.L$19 = null;
                        this.I$0 = i;
                        this.I$1 = 0;
                        this.Z$0 = l;
                        this.label = 3;
                        if (vprVar2.emit(pl20Var, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return zy11.a;
            }
            int i8 = this.I$3;
            int i9 = this.I$2;
            int i10 = this.I$1;
            int i11 = this.I$0;
            String str2 = (String) this.L$18;
            Iterator it5 = (Iterator) this.L$16;
            mq20 mq20Var2 = (mq20) this.L$13;
            Iterator it6 = (Iterator) this.L$10;
            t tVar2 = (t) this.L$9;
            Map map4 = (Map) this.L$7;
            Ref$IntRef ref$IntRef4 = (Ref$IntRef) this.L$5;
            Map map5 = (Map) this.L$4;
            ?? r1 = (Set) this.L$3;
            ConcurrentHashMap concurrentHashMap7 = (ConcurrentHashMap) this.L$2;
            ConcurrentHashMap concurrentHashMap8 = (ConcurrentHashMap) this.L$1;
            kotlin.b.b(obj);
            concurrentHashMap3 = concurrentHashMap8;
            CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
            int i12 = i8;
            vprVar3 = vprVar4;
            emptyList = emptyList3;
            it2 = it6;
            linkedHashSet2 = r1;
            int i13 = i9;
            Ref$IntRef ref$IntRef5 = ref$IntRef4;
            t tVar3 = tVar2;
            Map map6 = map4;
            linkedHashSet2.add(str2);
            Iterator it7 = it5;
            int i14 = i10;
            mq20 mq20Var3 = mq20Var2;
            Map map7 = map5;
            int i15 = i12;
            int i16 = i11;
            int i17 = i13;
            Iterator it8 = it7;
            int i18 = i14;
            int i19 = i16;
            coroutineSingletons2 = coroutineSingletons3;
            ConcurrentHashMap concurrentHashMap9 = concurrentHashMap7;
            r5 = map7;
            if (!it8.hasNext()) {
                Pair pair2 = (Pair) it8.next();
                CoroutineSingletons coroutineSingletons4 = coroutineSingletons2;
                String str3 = (String) pair2.getFirst();
                int i20 = i15;
                lq20 lq20Var = (lq20) pair2.getSecond();
                i13 = i17;
                hm20 hm20Var = mq20Var3.b;
                int i21 = i18;
                if (hm20Var.a) {
                    i3 = i19;
                    if (!jl40.l(r5.get(str3), Boolean.TRUE)) {
                        i4 = 1;
                        obj2 = concurrentHashMap3.get(str3);
                        if (obj2 == null && (putIfAbsent = concurrentHashMap3.putIfAbsent(str3, (obj2 = new ArrayList()))) != null) {
                            obj2 = putIfAbsent;
                        }
                        i5 = i4;
                        ((List) obj2).add(new mq20(lq20Var, hm20Var));
                        if (i5 == 0) {
                            pr20 pr20Var2 = new pr20(lq20Var, hm20Var.b);
                            List list5 = (List) concurrentHashMap3.get(str3);
                            if (list5 == null) {
                                list5 = emptyList;
                            }
                            pl20 pl20Var2 = new pl20(pr20Var2, str3, list5);
                            this.L$0 = vprVar3;
                            this.L$1 = concurrentHashMap3;
                            this.L$2 = concurrentHashMap9;
                            this.L$3 = linkedHashSet2;
                            this.L$4 = r5;
                            this.L$5 = ref$IntRef5;
                            this.L$6 = null;
                            this.L$7 = map6;
                            this.L$8 = null;
                            this.L$9 = tVar3;
                            this.L$10 = it2;
                            this.L$11 = null;
                            this.L$12 = null;
                            this.L$13 = mq20Var3;
                            this.L$14 = null;
                            this.L$15 = null;
                            Iterator it9 = it8;
                            this.L$16 = it9;
                            this.L$17 = null;
                            this.L$18 = str3;
                            this.L$19 = null;
                            int i22 = i3;
                            this.I$0 = i22;
                            this.I$1 = i21;
                            ConcurrentHashMap concurrentHashMap10 = concurrentHashMap9;
                            this.I$2 = i13;
                            this.I$3 = i20;
                            this.I$4 = 0;
                            this.I$5 = i5;
                            this.label = 2;
                            coroutineSingletons3 = coroutineSingletons4;
                            if (vprVar3.emit(pl20Var2, this) == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                            i11 = i22;
                            map5 = r5;
                            mq20Var2 = mq20Var3;
                            i10 = i21;
                            it5 = it9;
                            str2 = str3;
                            i12 = i20;
                            concurrentHashMap7 = concurrentHashMap10;
                            linkedHashSet2.add(str2);
                            Iterator it72 = it5;
                            int i142 = i10;
                            mq20 mq20Var32 = mq20Var2;
                            Map map72 = map5;
                            int i152 = i12;
                            int i162 = i11;
                            int i172 = i13;
                            Iterator it82 = it72;
                            int i182 = i142;
                            int i192 = i162;
                            coroutineSingletons2 = coroutineSingletons3;
                            ConcurrentHashMap concurrentHashMap92 = concurrentHashMap7;
                            r5 = map72;
                            if (!it82.hasNext()) {
                                ConcurrentHashMap concurrentHashMap11 = concurrentHashMap92;
                                CoroutineSingletons coroutineSingletons5 = coroutineSingletons2;
                                Map map8 = map6;
                                tVar = tVar3;
                                i2 = i192;
                                ref$IntRef2 = ref$IntRef5;
                                concurrentHashMap2 = concurrentHashMap11;
                                Map map9 = map8;
                                coroutineSingletons2 = coroutineSingletons5;
                                map2 = map9;
                                if (it2.hasNext()) {
                                    ref$IntRef2.element++;
                                    coroutineSingletons2 = coroutineSingletons2;
                                    vprVar = vprVar3;
                                    ref$IntRef = ref$IntRef2;
                                    linkedHashMap = r5;
                                    linkedHashSet = linkedHashSet2;
                                    concurrentHashMap = concurrentHashMap3;
                                    emptyList3 = emptyList;
                                    kotlinx.coroutines.a.k(get_context());
                                    List<co2> list32 = this.$checkOrders;
                                    arrayList = new ArrayList();
                                    for (co2 co2Var2 : list32) {
                                        if (linkedHashSet.contains(co2Var2.a)) {
                                            r13 = emptyList3;
                                            emptyList2 = r13;
                                        } else {
                                            List list6 = (List) kotlin.collections.a.S(ref$IntRef.element, co2Var2.c);
                                            if (list6 != null) {
                                                List list7 = list6;
                                                r13 = new ArrayList(tcc.n(list7, 10));
                                                Iterator it10 = list7.iterator();
                                                while (it10.hasNext()) {
                                                    r13.add(new Pair(co2Var2.a, (lq20) it10.next()));
                                                    emptyList3 = emptyList3;
                                                }
                                                emptyList2 = emptyList3;
                                            } else {
                                                emptyList2 = emptyList3;
                                                r13 = emptyList2;
                                            }
                                        }
                                        ycc.r((Iterable) r13, arrayList);
                                        emptyList3 = emptyList2;
                                    }
                                    emptyList = emptyList3;
                                    if (!arrayList.isEmpty()) {
                                        vprVar2 = vprVar;
                                        coroutineSingletons = coroutineSingletons2;
                                        List<pr20> list8 = this.$currentSelectedProxies;
                                        Iterator it11 = concurrentHashMap.entrySet().iterator();
                                        list = list8;
                                        map = linkedHashMap;
                                        it = it11;
                                        i = 0;
                                        while (it.hasNext()) {
                                        }
                                        return zy11.a;
                                    }
                                    t tVar4 = this.this$0;
                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                    Iterator it12 = arrayList.iterator();
                                    while (it12.hasNext()) {
                                        Object next = it12.next();
                                        String b = t.b(tVar4, (lq20) ((Pair) next).getSecond());
                                        Object obj5 = linkedHashMap3.get(b);
                                        if (obj5 == null) {
                                            obj5 = qv10.w(b, linkedHashMap3);
                                        }
                                        ((List) obj5).add(next);
                                    }
                                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(linkedHashMap3, this.this$0, concurrentHashMap2, this.$mobQueryParams, null);
                                    this.L$0 = vprVar;
                                    this.L$1 = concurrentHashMap;
                                    this.L$2 = concurrentHashMap2;
                                    this.L$3 = linkedHashSet;
                                    this.L$4 = linkedHashMap;
                                    this.L$5 = ref$IntRef;
                                    this.L$6 = null;
                                    this.L$7 = linkedHashMap3;
                                    this.L$8 = null;
                                    this.L$9 = null;
                                    this.L$10 = null;
                                    this.L$11 = null;
                                    this.L$12 = null;
                                    this.L$13 = null;
                                    this.L$14 = null;
                                    this.L$15 = null;
                                    this.L$16 = null;
                                    this.L$17 = null;
                                    this.L$18 = null;
                                    this.L$19 = null;
                                    this.label = 1;
                                    Object n = bvf0.n(anonymousClass1, this);
                                    if (n == coroutineSingletons2) {
                                        return coroutineSingletons2;
                                    }
                                    concurrentHashMap3 = concurrentHashMap;
                                    linkedHashSet2 = linkedHashSet;
                                    r5 = linkedHashMap;
                                    ref$IntRef2 = ref$IntRef;
                                    vprVar3 = vprVar;
                                    map2 = linkedHashMap3;
                                    tVar = this.this$0;
                                    it2 = ((Iterable) n).iterator();
                                    i2 = 0;
                                    if (it2.hasNext()) {
                                        mq20Var32 = (mq20) it2.next();
                                        if (mq20Var32 != null) {
                                            String b2 = t.b(tVar, mq20Var32.a);
                                            concurrentHashMap2.put(b2, mq20Var32);
                                            List list9 = (List) map2.get(b2);
                                            if (list9 != null) {
                                                i192 = i2;
                                                it82 = list9.iterator();
                                                i172 = 0;
                                                i182 = 0;
                                                tVar3 = tVar;
                                                map6 = map2;
                                                concurrentHashMap92 = concurrentHashMap2;
                                                ref$IntRef5 = ref$IntRef2;
                                                i152 = 0;
                                                r5 = r5;
                                                if (!it82.hasNext()) {
                                                }
                                            }
                                        }
                                        CoroutineSingletons coroutineSingletons6 = coroutineSingletons2;
                                        map8 = map2;
                                        coroutineSingletons5 = coroutineSingletons6;
                                        Map map92 = map8;
                                        coroutineSingletons2 = coroutineSingletons5;
                                        map2 = map92;
                                        if (it2.hasNext()) {
                                        }
                                    }
                                }
                            }
                        } else {
                            it72 = it82;
                            i142 = i21;
                            ConcurrentHashMap concurrentHashMap12 = concurrentHashMap92;
                            coroutineSingletons3 = coroutineSingletons4;
                            i162 = i3;
                            i152 = i20;
                            concurrentHashMap7 = concurrentHashMap12;
                            map72 = r5;
                            int i1722 = i13;
                            Iterator it822 = it72;
                            int i1822 = i142;
                            int i1922 = i162;
                            coroutineSingletons2 = coroutineSingletons3;
                            ConcurrentHashMap concurrentHashMap922 = concurrentHashMap7;
                            r5 = map72;
                            if (!it822.hasNext()) {
                            }
                        }
                    }
                } else {
                    i3 = i1922;
                }
                i4 = 0;
                obj2 = concurrentHashMap3.get(str3);
                if (obj2 == null) {
                    obj2 = putIfAbsent;
                }
                i5 = i4;
                ((List) obj2).add(new mq20(lq20Var, hm20Var));
                if (i5 == 0) {
                }
            }
        }
    }
}
