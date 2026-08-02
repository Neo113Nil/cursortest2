package com.yandex.fintechsdk.data.payment.impl.internal.order.datasources.network;

import defpackage.g180;
import defpackage.lx70;
import defpackage.ny61;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final com.yandex.fintechsdk.data.payment.impl.internal.order.datasources.network.requesters.metainfo.a a;
    public final com.yandex.fintechsdk.data.payment.impl.internal.order.datasources.network.requesters.redirecthost.a b;

    public a(com.yandex.fintechsdk.data.payment.impl.internal.order.datasources.network.requesters.metainfo.a aVar, com.yandex.fintechsdk.data.payment.impl.internal.order.datasources.network.requesters.redirecthost.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        OrderNetworkDataSource$getOrderInfo$1 orderNetworkDataSource$getOrderInfo$1;
        int i;
        if (continuationImpl instanceof OrderNetworkDataSource$getOrderInfo$1) {
            orderNetworkDataSource$getOrderInfo$1 = (OrderNetworkDataSource$getOrderInfo$1) continuationImpl;
            int i2 = orderNetworkDataSource$getOrderInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderNetworkDataSource$getOrderInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderNetworkDataSource$getOrderInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderNetworkDataSource$getOrderInfo$1.label;
                if (i != 0) {
                    b.b(obj);
                    orderNetworkDataSource$getOrderInfo$1.label = 1;
                    Object b = this.a.b(str, orderNetworkDataSource$getOrderInfo$1);
                    return b == coroutineSingletons ? coroutineSingletons : b;
                }
                if (i == 1) {
                    b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        orderNetworkDataSource$getOrderInfo$1 = new OrderNetworkDataSource$getOrderInfo$1(this, continuationImpl);
        Object obj2 = orderNetworkDataSource$getOrderInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderNetworkDataSource$getOrderInfo$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        OrderNetworkDataSource$getOrderMetaInfo$1 orderNetworkDataSource$getOrderMetaInfo$1;
        int i;
        Object a;
        if (continuationImpl instanceof OrderNetworkDataSource$getOrderMetaInfo$1) {
            orderNetworkDataSource$getOrderMetaInfo$1 = (OrderNetworkDataSource$getOrderMetaInfo$1) continuationImpl;
            int i2 = orderNetworkDataSource$getOrderMetaInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderNetworkDataSource$getOrderMetaInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderNetworkDataSource$getOrderMetaInfo$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderNetworkDataSource$getOrderMetaInfo$1.label;
                if (i != 0) {
                    b.b(obj);
                    orderNetworkDataSource$getOrderMetaInfo$1.label = 1;
                    a = a(str, orderNetworkDataSource$getOrderMetaInfo$1);
                    if (a == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    return a;
                }
                lx70 lx70Var = (lx70) a;
                return new g180(lx70Var.a, lx70Var.c, lx70Var.d, lx70Var.f);
            }
        }
        orderNetworkDataSource$getOrderMetaInfo$1 = new OrderNetworkDataSource$getOrderMetaInfo$1(this, continuationImpl);
        Object obj3 = orderNetworkDataSource$getOrderMetaInfo$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderNetworkDataSource$getOrderMetaInfo$1.label;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        OrderNetworkDataSource$getRedirectHostUrl$1 orderNetworkDataSource$getRedirectHostUrl$1;
        int i;
        if (continuationImpl instanceof OrderNetworkDataSource$getRedirectHostUrl$1) {
            orderNetworkDataSource$getRedirectHostUrl$1 = (OrderNetworkDataSource$getRedirectHostUrl$1) continuationImpl;
            int i2 = orderNetworkDataSource$getRedirectHostUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderNetworkDataSource$getRedirectHostUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderNetworkDataSource$getRedirectHostUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderNetworkDataSource$getRedirectHostUrl$1.label;
                if (i != 0) {
                    b.b(obj);
                    orderNetworkDataSource$getRedirectHostUrl$1.label = 1;
                    Object b = this.b.b(str, orderNetworkDataSource$getRedirectHostUrl$1);
                    return b == coroutineSingletons ? coroutineSingletons : b;
                }
                if (i == 1) {
                    b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        orderNetworkDataSource$getRedirectHostUrl$1 = new OrderNetworkDataSource$getRedirectHostUrl$1(this, continuationImpl);
        Object obj2 = orderNetworkDataSource$getRedirectHostUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderNetworkDataSource$getRedirectHostUrl$1.label;
        if (i != 0) {
        }
    }
}
