package com.yandex.go.flex.main_screen.domain;

import defpackage.ksx;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ksx b;

    public b(vpr vprVar, ksx ksxVar) {
        this.a = vprVar;
        this.b = ksxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$2$1 orderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof OrderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$2$1) {
            orderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$2$1 = (OrderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$2$1) continuation;
            int i2 = orderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.b.getClass();
                    Set a = ksx.a((List) obj);
                    orderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$2$1.L$0 = null;
                    orderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$2$1.L$1 = null;
                    orderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$2$1.L$2 = null;
                    orderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$2$1.L$3 = null;
                    orderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, orderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        orderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$2$1 = new OrderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$2$1(this, continuation);
        Object obj22 = orderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderListChangedInteractor$observeOrderListChangedEvent$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
