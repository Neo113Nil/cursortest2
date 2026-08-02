package com.yandex.go.chargers.discounts.discount_stations.data;

import defpackage.bvf0;
import defpackage.ks9;
import defpackage.ns9;
import defpackage.ny61;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class a {
    public final com.yandex.go.chargers.discounts.discount_stations.data.mappers.a a;
    public final r0 b = bvf0.c(ks9.e);

    public a(com.yandex.go.chargers.discounts.discount_stations.data.mappers.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ns9 ns9Var, ContinuationImpl continuationImpl) {
        ChargersDiscountStationsListStateRepository$setPagingData$1 chargersDiscountStationsListStateRepository$setPagingData$1;
        int i;
        if (continuationImpl instanceof ChargersDiscountStationsListStateRepository$setPagingData$1) {
            chargersDiscountStationsListStateRepository$setPagingData$1 = (ChargersDiscountStationsListStateRepository$setPagingData$1) continuationImpl;
            int i2 = chargersDiscountStationsListStateRepository$setPagingData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersDiscountStationsListStateRepository$setPagingData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersDiscountStationsListStateRepository$setPagingData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDiscountStationsListStateRepository$setPagingData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list = ns9Var.a.b;
                    chargersDiscountStationsListStateRepository$setPagingData$1.L$0 = ns9Var;
                    chargersDiscountStationsListStateRepository$setPagingData$1.label = 1;
                    obj = this.a.a(list, chargersDiscountStationsListStateRepository$setPagingData$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ns9Var = (ns9) chargersDiscountStationsListStateRepository$setPagingData$1.L$0;
                    kotlin.b.b(obj);
                }
                ks9 ks9Var = new ks9((List) obj, ns9Var.a.b.size() >= 50, false, false);
                r0 r0Var = this.b;
                r0Var.getClass();
                r0Var.m(null, ks9Var);
                return zy11.a;
            }
        }
        chargersDiscountStationsListStateRepository$setPagingData$1 = new ChargersDiscountStationsListStateRepository$setPagingData$1(this, continuationImpl);
        Object obj2 = chargersDiscountStationsListStateRepository$setPagingData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDiscountStationsListStateRepository$setPagingData$1.label;
        if (i != 0) {
        }
        ks9 ks9Var2 = new ks9((List) obj2, ns9Var.a.b.size() >= 50, false, false);
        r0 r0Var2 = this.b;
        r0Var2.getClass();
        r0Var2.m(null, ks9Var2);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ns9 ns9Var, ContinuationImpl continuationImpl) {
        ChargersDiscountStationsListStateRepository$updatePagingData$1 chargersDiscountStationsListStateRepository$updatePagingData$1;
        int i;
        List list;
        r0 r0Var;
        Object value;
        if (continuationImpl instanceof ChargersDiscountStationsListStateRepository$updatePagingData$1) {
            chargersDiscountStationsListStateRepository$updatePagingData$1 = (ChargersDiscountStationsListStateRepository$updatePagingData$1) continuationImpl;
            int i2 = chargersDiscountStationsListStateRepository$updatePagingData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersDiscountStationsListStateRepository$updatePagingData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersDiscountStationsListStateRepository$updatePagingData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDiscountStationsListStateRepository$updatePagingData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = ns9Var.a.b;
                    chargersDiscountStationsListStateRepository$updatePagingData$1.L$0 = ns9Var;
                    chargersDiscountStationsListStateRepository$updatePagingData$1.label = 1;
                    obj = this.a.a(list2, chargersDiscountStationsListStateRepository$updatePagingData$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ns9Var = (ns9) chargersDiscountStationsListStateRepository$updatePagingData$1.L$0;
                    kotlin.b.b(obj);
                }
                list = (List) obj;
                do {
                    r0Var = this.b;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, new ks9(kotlin.collections.a.m0(list, ((ks9) value).a), ns9Var.a.b.size() < 50, false, false)));
                return zy11.a;
            }
        }
        chargersDiscountStationsListStateRepository$updatePagingData$1 = new ChargersDiscountStationsListStateRepository$updatePagingData$1(this, continuationImpl);
        Object obj2 = chargersDiscountStationsListStateRepository$updatePagingData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDiscountStationsListStateRepository$updatePagingData$1.label;
        if (i != 0) {
        }
        list = (List) obj2;
        do {
            r0Var = this.b;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new ks9(kotlin.collections.a.m0(list, ((ks9) value).a), ns9Var.a.b.size() < 50, false, false)));
        return zy11.a;
    }
}
