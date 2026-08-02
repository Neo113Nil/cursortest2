package com.yandex.fintechsdk.data.payment.impl.internal.order.datasources.network.requesters.metainfo;

import defpackage.an11;
import defpackage.h180;
import defpackage.k180;
import defpackage.kt90;
import defpackage.lx70;
import defpackage.ny61;
import defpackage.qoi0;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a extends com.yandex.fintechsdk.core.network.api.request.a {
    public final kt90 b;

    public a(kt90 kt90Var) {
        super(0);
        this.b = kt90Var;
    }

    @Override // com.yandex.fintechsdk.core.network.api.request.a
    public final Object a(Object obj) {
        return new h180((String) obj);
    }

    @Override // com.yandex.fintechsdk.core.network.api.request.a
    public final Object d(Object obj) {
        k180 k180Var = (k180) obj;
        return new lx70(k180Var.d, k180Var.e, k180Var.a, k180Var.b, k180Var.f, k180Var.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.fintechsdk.core.network.api.request.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(h180 h180Var, ContinuationImpl continuationImpl) {
        OrderMetaInfoRequester$executeRequest$1 orderMetaInfoRequester$executeRequest$1;
        int i;
        if (continuationImpl instanceof OrderMetaInfoRequester$executeRequest$1) {
            orderMetaInfoRequester$executeRequest$1 = (OrderMetaInfoRequester$executeRequest$1) continuationImpl;
            int i2 = orderMetaInfoRequester$executeRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderMetaInfoRequester$executeRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderMetaInfoRequester$executeRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderMetaInfoRequester$executeRequest$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                an11 e = qoi0.e(k180.class);
                orderMetaInfoRequester$executeRequest$1.label = 1;
                kt90 kt90Var = this.b;
                kt90Var.getClass();
                Object d = com.yandex.fintechsdk.core.network.impl.internal.network.a.d(kt90Var, h180Var, e, orderMetaInfoRequester$executeRequest$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        orderMetaInfoRequester$executeRequest$1 = new OrderMetaInfoRequester$executeRequest$1(this, continuationImpl);
        Object obj2 = orderMetaInfoRequester$executeRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderMetaInfoRequester$executeRequest$1.label;
        if (i == 0) {
        }
    }
}
