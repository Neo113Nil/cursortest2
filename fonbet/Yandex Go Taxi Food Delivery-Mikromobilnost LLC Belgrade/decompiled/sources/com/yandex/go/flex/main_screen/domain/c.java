package com.yandex.go.flex.main_screen.domain;

import defpackage.ksx;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ ksx b;

    public c(tpr tprVar, ksx ksxVar) {
        this.a = tprVar;
        this.b = ksxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        OrderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$1 orderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$1;
        int i;
        if (continuation instanceof OrderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$1) {
            orderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$1 = (OrderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$1) continuation;
            int i2 = orderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b);
                    orderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$1.L$0 = null;
                    orderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$1.L$1 = null;
                    orderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$1.L$2 = null;
                    orderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, orderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$1) == coroutineSingletons) {
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
        orderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$1 = new OrderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$1(this, continuation);
        Object obj2 = orderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
