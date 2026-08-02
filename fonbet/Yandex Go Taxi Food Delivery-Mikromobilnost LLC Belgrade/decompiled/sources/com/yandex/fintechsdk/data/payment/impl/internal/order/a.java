package com.yandex.fintechsdk.data.payment.impl.internal.order;

import defpackage.d180;
import defpackage.g180;
import defpackage.ny61;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final d180 a;
    public final com.yandex.fintechsdk.data.payment.impl.internal.order.datasources.network.a b;

    public a(d180 d180Var, com.yandex.fintechsdk.data.payment.impl.internal.order.datasources.network.a aVar) {
        this.a = d180Var;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        OrderRepositoryImpl$getOrderMetaInfo$1 orderRepositoryImpl$getOrderMetaInfo$1;
        int i;
        g180 g180Var;
        Object b;
        if (continuationImpl instanceof OrderRepositoryImpl$getOrderMetaInfo$1) {
            orderRepositoryImpl$getOrderMetaInfo$1 = (OrderRepositoryImpl$getOrderMetaInfo$1) continuationImpl;
            int i2 = orderRepositoryImpl$getOrderMetaInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderRepositoryImpl$getOrderMetaInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderRepositoryImpl$getOrderMetaInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderRepositoryImpl$getOrderMetaInfo$1.label;
                if (i != 0) {
                    b.b(obj);
                    d180 d180Var = this.a;
                    synchronized (d180Var) {
                        g180Var = (g180) d180Var.a.get(str);
                    }
                    if (g180Var != null) {
                        return g180Var;
                    }
                    com.yandex.fintechsdk.data.payment.impl.internal.order.datasources.network.a aVar = this.b;
                    orderRepositoryImpl$getOrderMetaInfo$1.L$0 = str;
                    orderRepositoryImpl$getOrderMetaInfo$1.label = 1;
                    b = aVar.b(str, orderRepositoryImpl$getOrderMetaInfo$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) orderRepositoryImpl$getOrderMetaInfo$1.L$0;
                    b.b(obj);
                    b = ((Result) obj).getValue();
                }
                if (!(b instanceof Result.Failure)) {
                    return b;
                }
                g180 g180Var2 = (g180) b;
                d180 d180Var2 = this.a;
                synchronized (d180Var2) {
                    d180Var2.a.put(str, g180Var2);
                }
                return b;
            }
        }
        orderRepositoryImpl$getOrderMetaInfo$1 = new OrderRepositoryImpl$getOrderMetaInfo$1(this, continuationImpl);
        Object obj2 = orderRepositoryImpl$getOrderMetaInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderRepositoryImpl$getOrderMetaInfo$1.label;
        if (i != 0) {
        }
        if (!(b instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        OrderRepositoryImpl$getRedirectHostUrl$1 orderRepositoryImpl$getRedirectHostUrl$1;
        int i;
        if (continuationImpl instanceof OrderRepositoryImpl$getRedirectHostUrl$1) {
            orderRepositoryImpl$getRedirectHostUrl$1 = (OrderRepositoryImpl$getRedirectHostUrl$1) continuationImpl;
            int i2 = orderRepositoryImpl$getRedirectHostUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderRepositoryImpl$getRedirectHostUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderRepositoryImpl$getRedirectHostUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderRepositoryImpl$getRedirectHostUrl$1.label;
                if (i != 0) {
                    b.b(obj);
                    orderRepositoryImpl$getRedirectHostUrl$1.label = 1;
                    Object c = this.b.c(str, orderRepositoryImpl$getRedirectHostUrl$1);
                    return c == coroutineSingletons ? coroutineSingletons : c;
                }
                if (i == 1) {
                    b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        orderRepositoryImpl$getRedirectHostUrl$1 = new OrderRepositoryImpl$getRedirectHostUrl$1(this, continuationImpl);
        Object obj2 = orderRepositoryImpl$getRedirectHostUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderRepositoryImpl$getRedirectHostUrl$1.label;
        if (i != 0) {
        }
    }
}
