package com.yandex.go.masstransit.sdk.ble.impl.ble;

import defpackage.ad30;
import defpackage.bvf0;
import defpackage.gkn;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pi5;
import defpackage.pzt0;
import defpackage.q2v;
import defpackage.rcc;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.ble.impl.ble.MtBleScannerRepositoryV2$startSnapshotJob$1", f = "MtBleScannerRepositoryV2.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MtBleScannerRepositoryV2$startSnapshotJob$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtBleScannerRepositoryV2$startSnapshotJob$1(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtBleScannerRepositoryV2$startSnapshotJob$1 mtBleScannerRepositoryV2$startSnapshotJob$1 = new MtBleScannerRepositoryV2$startSnapshotJob$1(this.this$0, continuation);
        mtBleScannerRepositoryV2$startSnapshotJob$1.L$0 = obj;
        return mtBleScannerRepositoryV2$startSnapshotJob$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MtBleScannerRepositoryV2$startSnapshotJob$1 mtBleScannerRepositoryV2$startSnapshotJob$1 = (MtBleScannerRepositoryV2$startSnapshotJob$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mtBleScannerRepositoryV2$startSnapshotJob$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        Object value;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean D = bvf0.D(tseVar);
        zy11 zy11Var = zy11.a;
        if (D) {
            f fVar = this.this$0;
            long currentTimeMillis = System.currentTimeMillis();
            ConcurrentHashMap concurrentHashMap = fVar.i;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = concurrentHashMap.entrySet().iterator();
            while (true) {
                j = 1000;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                q2v q2vVar = (q2v) entry.getValue();
                long j2 = (currentTimeMillis - q2vVar.a) / 1000;
                if (q2vVar.b >= fVar.k.e && j2 <= r11.d) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            concurrentHashMap.clear();
            concurrentHashMap.putAll(linkedHashMap);
            f fVar2 = this.this$0;
            ConcurrentHashMap concurrentHashMap2 = fVar2.j;
            if (fVar2.k.g) {
                long currentTimeMillis2 = System.currentTimeMillis();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : concurrentHashMap2.entrySet()) {
                    gkn gknVar = (gkn) entry2.getValue();
                    long j3 = (currentTimeMillis2 - gknVar.a) / j;
                    if (gknVar.b >= fVar2.k.e && j3 <= r15.d) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                    j = 1000;
                }
                concurrentHashMap2.clear();
                concurrentHashMap2.putAll(linkedHashMap2);
            }
            f fVar3 = this.this$0;
            ListBuilder a = rcc.a();
            a.addAll(fVar3.i.values());
            a.addAll(fVar3.j.values());
            ListBuilder j4 = a.j();
            List list = (List) this.this$0.f.getValue();
            Set N0 = list != null ? kotlin.collections.a.N0(list) : null;
            if (N0 == null) {
                N0 = EmptySet.a;
            }
            List x0 = kotlin.collections.a.x0(j4, new ad30());
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : x0) {
                if (N0.contains(((pi5) obj2).a())) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : x0) {
                if (!N0.contains(((pi5) obj3).a())) {
                    arrayList2.add(obj3);
                }
            }
            List A0 = kotlin.collections.a.A0(kotlin.collections.a.m0(arrayList2, arrayList), this.this$0.k.b);
            ArrayList arrayList3 = new ArrayList(tcc.n(A0, 10));
            Iterator it2 = A0.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((pi5) it2.next()).a());
            }
            List list2 = (List) this.this$0.f.getValue();
            if (list2 != null && kotlin.collections.a.N0(list2).equals(kotlin.collections.a.N0(arrayList3))) {
                pzt0 pzt0Var = this.this$0.m;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                f fVar4 = this.this$0;
                fVar4.m = null;
                fVar4.c();
                return zy11Var;
            }
            r0 r0Var = this.this$0.f;
            do {
                value = r0Var.getValue();
            } while (!r0Var.k(value, arrayList3));
        }
        return zy11Var;
    }
}
