package com.yandex.go.payments.order.domain;

import defpackage.jqr;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class d implements tpr {
    public final /* synthetic */ jqr a;

    public d(jqr jqrVar) {
        this.a = jqrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        OrderPaymentsListRouter$onLaunch$2$invokeSuspend$$inlined$map$1$1 orderPaymentsListRouter$onLaunch$2$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof OrderPaymentsListRouter$onLaunch$2$invokeSuspend$$inlined$map$1$1) {
            orderPaymentsListRouter$onLaunch$2$invokeSuspend$$inlined$map$1$1 = (OrderPaymentsListRouter$onLaunch$2$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = orderPaymentsListRouter$onLaunch$2$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderPaymentsListRouter$onLaunch$2$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderPaymentsListRouter$onLaunch$2$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderPaymentsListRouter$onLaunch$2$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar);
                    orderPaymentsListRouter$onLaunch$2$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    orderPaymentsListRouter$onLaunch$2$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    orderPaymentsListRouter$onLaunch$2$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    orderPaymentsListRouter$onLaunch$2$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, orderPaymentsListRouter$onLaunch$2$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        orderPaymentsListRouter$onLaunch$2$invokeSuspend$$inlined$map$1$1 = new OrderPaymentsListRouter$onLaunch$2$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = orderPaymentsListRouter$onLaunch$2$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderPaymentsListRouter$onLaunch$2$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
