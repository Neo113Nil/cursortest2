package xsna;

import androidx.health.connect.client.aggregate.AggregateMetric;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.dqk;
import xsna.fpf0;
import xsna.gkk0;
import xsna.jb1;
import xsna.jni0;
import xsna.o71;
import xsna.r0l0;
import xsna.u7x;

/* compiled from: HealthConnectClientAggregationExtensions.kt */
/* loaded from: classes12.dex */
public final class kzu {
    public static final Set<dcy<? extends zef0>> a = rl3.y0(new dcy[]{fpf0.a(jg7.class), fpf0.a(dqk.class), fpf0.a(yn70.class), fpf0.a(gkk0.class), fpf0.a(r0l0.class)});

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(czu czuVar, j7f0 j7f0Var, qb1 qb1Var, ContinuationImpl continuationImpl) {
        dzu dzuVar;
        int i;
        if (continuationImpl instanceof dzu) {
            dzuVar = (dzu) continuationImpl;
            int i2 = dzuVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dzuVar.label = i2 - Integer.MIN_VALUE;
                Object obj = dzuVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dzuVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    izg0 izg0Var = new izg0(new jzu(j7f0Var, czuVar, null));
                    ezu ezuVar = new ezu(qb1Var);
                    dzuVar.L$0 = qb1Var;
                    dzuVar.label = 1;
                    if (izg0Var.collect(ezuVar, dzuVar) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qb1Var = (qb1) dzuVar.L$0;
                    kotlin.a.a(obj);
                }
                return qb1Var.getResult();
            }
        }
        dzuVar = new dzu(continuationImpl);
        Object obj2 = dzuVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dzuVar.label;
        if (i != 0) {
        }
        return qb1Var.getResult();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v34, types: [xsna.czu] */
    /* JADX WARN: Type inference failed for: r10v36, types: [xsna.czu] */
    /* JADX WARN: Type inference failed for: r10v38, types: [xsna.czu] */
    /* JADX WARN: Type inference failed for: r10v40, types: [xsna.czu] */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r12v0, types: [xsna.fzu] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x02bf -> B:14:0x02c5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(qzu qzuVar, o71 o71Var, ContinuationImpl continuationImpl) {
        hzu hzuVar;
        int i;
        Collection arrayList;
        Iterator it;
        qzu qzuVar2;
        ?? r10;
        Iterator it2;
        List list;
        if (continuationImpl instanceof hzu) {
            hzuVar = (hzu) continuationImpl;
            int i2 = hzuVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hzuVar.label = i2 - Integer.MIN_VALUE;
                Object obj = hzuVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hzuVar.label;
                if (i == 0) {
                    if (i == 1) {
                        it2 = (Iterator) hzuVar.L$2;
                        arrayList = (Collection) hzuVar.L$1;
                        r10 = (czu) hzuVar.L$0;
                        kotlin.a.a(obj);
                        list = (List) obj;
                    } else if (i == 2) {
                        it2 = (Iterator) hzuVar.L$2;
                        arrayList = (Collection) hzuVar.L$1;
                        r10 = (czu) hzuVar.L$0;
                        kotlin.a.a(obj);
                        list = (List) obj;
                    } else if (i == 3) {
                        it2 = (Iterator) hzuVar.L$2;
                        arrayList = (Collection) hzuVar.L$1;
                        r10 = (czu) hzuVar.L$0;
                        kotlin.a.a(obj);
                        list = (List) obj;
                    } else if (i == 4) {
                        it2 = (Iterator) hzuVar.L$2;
                        arrayList = (Collection) hzuVar.L$1;
                        r10 = (czu) hzuVar.L$0;
                        kotlin.a.a(obj);
                        list = (List) obj;
                    } else {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it2 = (Iterator) hzuVar.L$2;
                        arrayList = (Collection) hzuVar.L$1;
                        czu czuVar = (czu) hzuVar.L$0;
                        kotlin.a.a(obj);
                        r10 = czuVar;
                        list = (List) obj;
                    }
                    hzu hzuVar2 = hzuVar;
                    Iterator it3 = it2;
                    qzuVar2 = r10;
                    Collection collection = arrayList;
                    g5g.y(list, collection);
                    it = it3;
                    hzuVar = hzuVar2;
                    arrayList = collection;
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        dcy dcyVar = (dcy) entry.getKey();
                        final o71 o71Var2 = (o71) entry.getValue();
                        if (epx.f(dcyVar, fpf0.a(jg7.class))) {
                            hzuVar.L$0 = qzuVar2;
                            hzuVar.L$1 = arrayList;
                            hzuVar.L$2 = it;
                            hzuVar.label = 1;
                            Set<AggregateMetric<x2d0>> set = hg7.a;
                            Object a2 = a(qzuVar2, new j7f0(fpf0.a(jg7.class), o71Var2.b, o71Var2.d, 56), new udg0(fvo0.a(o71Var2.b), o71Var2.c, new gg7(o71Var2)), hzuVar);
                            if (a2 != coroutineSingletons) {
                                r10 = qzuVar2;
                                it2 = it;
                                list = (List) a2;
                                hzu hzuVar22 = hzuVar;
                                Iterator it32 = it2;
                                qzuVar2 = r10;
                                Collection collection2 = arrayList;
                                g5g.y(list, collection2);
                                it = it32;
                                hzuVar = hzuVar22;
                                arrayList = collection2;
                            }
                            return coroutineSingletons;
                        }
                        if (epx.f(dcyVar, fpf0.a(dqk.class))) {
                            j7f0 j7f0Var = new j7f0(fpf0.a(dqk.class), fvo0.b(o71Var2.b), o71Var2.d, 56);
                            udg0 udg0Var = new udg0(fvo0.a(o71Var2.b), o71Var2.c, new izs<u7x, jb1<dqk>>() { // from class: androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt$aggregateFallback$lambda$11$$inlined$aggregateSeries$1
                                {
                                    super(1);
                                }

                                @Override // xsna.izs
                                public final jb1<dqk> invoke(u7x u7xVar) {
                                    return new jni0(fpf0.a(dqk.class), o71.this.a, u7xVar);
                                }
                            });
                            hzuVar.L$0 = qzuVar2;
                            hzuVar.L$1 = arrayList;
                            hzuVar.L$2 = it;
                            hzuVar.label = 2;
                            Object a3 = a(qzuVar2, j7f0Var, udg0Var, hzuVar);
                            if (a3 != coroutineSingletons) {
                                r10 = qzuVar2;
                                it2 = it;
                                list = (List) a3;
                                hzu hzuVar222 = hzuVar;
                                Iterator it322 = it2;
                                qzuVar2 = r10;
                                Collection collection22 = arrayList;
                                g5g.y(list, collection22);
                                it = it322;
                                hzuVar = hzuVar222;
                                arrayList = collection22;
                            }
                            return coroutineSingletons;
                        }
                        if (epx.f(dcyVar, fpf0.a(yn70.class))) {
                            hzuVar.L$0 = qzuVar2;
                            hzuVar.L$1 = arrayList;
                            hzuVar.L$2 = it;
                            hzuVar.label = 3;
                            Object a4 = a(qzuVar2, new j7f0(fpf0.a(yn70.class), fvo0.b(o71Var2.b), o71Var2.d, 56), new udg0(fvo0.a(o71Var2.b), o71Var2.c, xn70.i), hzuVar);
                            if (a4 != coroutineSingletons) {
                                r10 = qzuVar2;
                                it2 = it;
                                list = (List) a4;
                                hzu hzuVar2222 = hzuVar;
                                Iterator it3222 = it2;
                                qzuVar2 = r10;
                                Collection collection222 = arrayList;
                                g5g.y(list, collection222);
                                it = it3222;
                                hzuVar = hzuVar2222;
                                arrayList = collection222;
                            }
                            return coroutineSingletons;
                        }
                        if (epx.f(dcyVar, fpf0.a(gkk0.class))) {
                            j7f0 j7f0Var2 = new j7f0(fpf0.a(gkk0.class), fvo0.b(o71Var2.b), o71Var2.d, 56);
                            udg0 udg0Var2 = new udg0(fvo0.a(o71Var2.b), o71Var2.c, new izs<u7x, jb1<gkk0>>() { // from class: androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt$aggregateFallback$lambda$11$$inlined$aggregateSeries$2
                                {
                                    super(1);
                                }

                                @Override // xsna.izs
                                public final jb1<gkk0> invoke(u7x u7xVar) {
                                    return new jni0(fpf0.a(gkk0.class), o71.this.a, u7xVar);
                                }
                            });
                            hzuVar.L$0 = qzuVar2;
                            hzuVar.L$1 = arrayList;
                            hzuVar.L$2 = it;
                            hzuVar.label = 4;
                            Object a5 = a(qzuVar2, j7f0Var2, udg0Var2, hzuVar);
                            if (a5 != coroutineSingletons) {
                                r10 = qzuVar2;
                                it2 = it;
                                list = (List) a5;
                                hzu hzuVar22222 = hzuVar;
                                Iterator it32222 = it2;
                                qzuVar2 = r10;
                                Collection collection2222 = arrayList;
                                g5g.y(list, collection2222);
                                it = it32222;
                                hzuVar = hzuVar22222;
                                arrayList = collection2222;
                            }
                        } else {
                            if (!epx.f(dcyVar, fpf0.a(r0l0.class))) {
                                throw new IllegalStateException(("Invalid record type for aggregation fallback: " + dcyVar).toString());
                            }
                            j7f0 j7f0Var3 = new j7f0(fpf0.a(r0l0.class), fvo0.b(o71Var2.b), o71Var2.d, 56);
                            udg0 udg0Var3 = new udg0(fvo0.a(o71Var2.b), o71Var2.c, new izs<u7x, jb1<r0l0>>() { // from class: androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt$aggregateFallback$lambda$11$$inlined$aggregateSeries$3
                                {
                                    super(1);
                                }

                                @Override // xsna.izs
                                public final jb1<r0l0> invoke(u7x u7xVar) {
                                    return new jni0(fpf0.a(r0l0.class), o71.this.a, u7xVar);
                                }
                            });
                            hzuVar.L$0 = qzuVar2;
                            hzuVar.L$1 = arrayList;
                            hzuVar.L$2 = it;
                            hzuVar.label = 5;
                            Object a6 = a(qzuVar2, j7f0Var3, udg0Var3, hzuVar);
                            if (a6 != coroutineSingletons) {
                                r10 = qzuVar2;
                                it2 = it;
                                obj = a6;
                                list = (List) obj;
                                hzu hzuVar222222 = hzuVar;
                                Iterator it322222 = it2;
                                qzuVar2 = r10;
                                Collection collection22222 = arrayList;
                                g5g.y(list, collection22222);
                                it = it322222;
                                hzuVar = hzuVar222222;
                                arrayList = collection22222;
                            }
                        }
                        return coroutineSingletons;
                        if (it.hasNext()) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Object obj2 : (List) arrayList) {
                                mb1 mb1Var = (mb1) obj2;
                                Instant instant = mb1Var.a.b;
                                Object obj3 = linkedHashMap.get(instant);
                                if (obj3 != null || linkedHashMap.containsKey(instant)) {
                                    mb1 mb1Var2 = (mb1) obj3;
                                    lb1 lb1Var = mb1Var2.a;
                                    Instant instant2 = mb1Var2.b;
                                    Instant instant3 = lb1Var.c;
                                    androidx.health.connect.client.aggregate.c cVar = lb1Var.a;
                                    lb1 lb1Var2 = mb1Var.a;
                                    Instant instant4 = mb1Var.b;
                                    androidx.health.connect.client.aggregate.c c = cVar.c(lb1Var2.a);
                                    if (jw5.b(instant2, instant4) <= 0) {
                                        mb1Var = mb1Var2;
                                    }
                                    obj2 = new mb1(new lb1(c, instant, instant3, mb1Var.a.d, false), (Instant) jw5.w(instant2, instant4));
                                }
                                linkedHashMap.put(instant, obj2);
                            }
                            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                            Iterator it4 = linkedHashMap.entrySet().iterator();
                            while (it4.hasNext()) {
                                arrayList2.add(((mb1) ((Map.Entry) it4.next()).getValue()).a);
                            }
                            return j5g.D0(new i69(1), arrayList2);
                        }
                    }
                } else {
                    kotlin.a.a(obj);
                    Set<dcy<? extends zef0>> set2 = a;
                    int e = on00.e(c5g.u(set2, 10));
                    if (e < 16) {
                        e = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(e);
                    for (Object obj4 : set2) {
                        ?? fzuVar = new fzu((dcy) obj4);
                        Set<AggregateMetric<?>> set3 = y71.a;
                        Set<AggregateMetric<?>> set4 = o71Var.a;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj5 : set4) {
                            if (((Boolean) fzuVar.invoke(obj5)).booleanValue()) {
                                arrayList3.add(obj5);
                            }
                        }
                        linkedHashMap2.put(obj4, new o71(j5g.S0(arrayList3), o71Var.b, o71Var.c, o71Var.d));
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        if (!((o71) entry2.getValue()).a.isEmpty()) {
                            linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    arrayList = new ArrayList();
                    it = linkedHashMap3.entrySet().iterator();
                    qzuVar2 = qzuVar;
                    if (it.hasNext()) {
                    }
                }
            }
        }
        hzuVar = new hzu(continuationImpl);
        Object obj6 = hzuVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hzuVar.label;
        if (i == 0) {
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0204 -> B:15:0x02e4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x02de -> B:14:0x02e2). Please report as a decompilation issue!!! */
    public static final java.lang.Object c(xsna.qzu r16, xsna.t71 r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.kzu.c(xsna.qzu, xsna.t71, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
