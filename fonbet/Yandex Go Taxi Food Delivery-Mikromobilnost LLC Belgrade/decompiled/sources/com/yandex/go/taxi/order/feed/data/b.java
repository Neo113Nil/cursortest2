package com.yandex.go.taxi.order.feed.data;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.bv70;
import defpackage.cv70;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderFeedStatusRefreshDecisionInteractor$appliedOrderFlow$$inlined$map$1$2$1 orderFeedStatusRefreshDecisionInteractor$appliedOrderFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof OrderFeedStatusRefreshDecisionInteractor$appliedOrderFlow$$inlined$map$1$2$1) {
            orderFeedStatusRefreshDecisionInteractor$appliedOrderFlow$$inlined$map$1$2$1 = (OrderFeedStatusRefreshDecisionInteractor$appliedOrderFlow$$inlined$map$1$2$1) continuation;
            int i2 = orderFeedStatusRefreshDecisionInteractor$appliedOrderFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderFeedStatusRefreshDecisionInteractor$appliedOrderFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderFeedStatusRefreshDecisionInteractor$appliedOrderFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderFeedStatusRefreshDecisionInteractor$appliedOrderFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    TaxiOrder taxiOrder = (TaxiOrder) obj;
                    cv70 cv70Var = new cv70(taxiOrder, new bv70(taxiOrder.m(), taxiOrder.h.b));
                    orderFeedStatusRefreshDecisionInteractor$appliedOrderFlow$$inlined$map$1$2$1.L$0 = null;
                    orderFeedStatusRefreshDecisionInteractor$appliedOrderFlow$$inlined$map$1$2$1.L$1 = null;
                    orderFeedStatusRefreshDecisionInteractor$appliedOrderFlow$$inlined$map$1$2$1.L$2 = null;
                    orderFeedStatusRefreshDecisionInteractor$appliedOrderFlow$$inlined$map$1$2$1.L$3 = null;
                    orderFeedStatusRefreshDecisionInteractor$appliedOrderFlow$$inlined$map$1$2$1.label = 1;
                    if (vprVar.emit(cv70Var, orderFeedStatusRefreshDecisionInteractor$appliedOrderFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        orderFeedStatusRefreshDecisionInteractor$appliedOrderFlow$$inlined$map$1$2$1 = new OrderFeedStatusRefreshDecisionInteractor$appliedOrderFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = orderFeedStatusRefreshDecisionInteractor$appliedOrderFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderFeedStatusRefreshDecisionInteractor$appliedOrderFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
