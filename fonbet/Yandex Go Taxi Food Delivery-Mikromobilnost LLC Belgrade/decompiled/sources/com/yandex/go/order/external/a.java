package com.yandex.go.order.external;

import com.yandex.go.order.external.eats.ClosedOrderStorage$Order;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.fse;
import defpackage.ike;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.qhw0;
import defpackage.tcc;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v5c;
import defpackage.z5c;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes8.dex */
public final class a {
    public final z5c a;
    public final fse b;
    public final ike c;
    public final LinkedHashMap d;

    public a(z5c z5cVar, tt2 tt2Var) {
        this.a = z5cVar;
        qhw0 a = jl40.a();
        tt2Var.getClass();
        fse U = cvw.U(a, uyj.a.P(1));
        this.b = U;
        this.c = bvf0.a(U);
        this.d = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052 A[LOOP:0: B:11:0x004c->B:13:0x0052, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        ClosedOrderRepository$loadFromStorageIfNeeded$1 closedOrderRepository$loadFromStorageIfNeeded$1;
        int i;
        LinkedHashMap linkedHashMap = aVar.d;
        if (continuationImpl instanceof ClosedOrderRepository$loadFromStorageIfNeeded$1) {
            closedOrderRepository$loadFromStorageIfNeeded$1 = (ClosedOrderRepository$loadFromStorageIfNeeded$1) continuationImpl;
            int i2 = closedOrderRepository$loadFromStorageIfNeeded$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                closedOrderRepository$loadFromStorageIfNeeded$1.label = i2 - Integer.MIN_VALUE;
                Object obj = closedOrderRepository$loadFromStorageIfNeeded$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = closedOrderRepository$loadFromStorageIfNeeded$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (linkedHashMap.isEmpty()) {
                        z5c z5cVar = aVar.a;
                        closedOrderRepository$loadFromStorageIfNeeded$1.label = 1;
                        obj = z5cVar.a.a(closedOrderRepository$loadFromStorageIfNeeded$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                for (ClosedOrderStorage$Order closedOrderStorage$Order : (Iterable) obj) {
                    linkedHashMap.put(new v5c(closedOrderStorage$Order.a, closedOrderStorage$Order.b), new Long(closedOrderStorage$Order.c));
                }
                return zy11.a;
            }
        }
        closedOrderRepository$loadFromStorageIfNeeded$1 = new ClosedOrderRepository$loadFromStorageIfNeeded$1(aVar, continuationImpl);
        Object obj2 = closedOrderRepository$loadFromStorageIfNeeded$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = closedOrderRepository$loadFromStorageIfNeeded$1.label;
        if (i != 0) {
        }
        while (r5.hasNext()) {
        }
        return zy11.a;
    }

    public final Object b(SuspendLambda suspendLambda) {
        Set<Map.Entry> entrySet = this.d.entrySet();
        ArrayList arrayList = new ArrayList(tcc.n(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            arrayList.add(new ClosedOrderStorage$Order(((v5c) entry.getKey()).b(), ((v5c) entry.getKey()).a(), ((Number) entry.getValue()).longValue()));
        }
        return this.a.a.d(arrayList, suspendLambda);
    }
}
