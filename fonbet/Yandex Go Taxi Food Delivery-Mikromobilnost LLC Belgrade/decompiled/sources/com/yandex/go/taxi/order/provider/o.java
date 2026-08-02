package com.yandex.go.taxi.order.provider;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.j73;
import defpackage.ny61;
import defpackage.v280;
import defpackage.vpr;
import defpackage.xh60;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class o implements vpr {
    public final /* synthetic */ vpr a;

    public o(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderNotificationProvider$pushFlow$$inlined$map$1$2$1 orderNotificationProvider$pushFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof OrderNotificationProvider$pushFlow$$inlined$map$1$2$1) {
            orderNotificationProvider$pushFlow$$inlined$map$1$2$1 = (OrderNotificationProvider$pushFlow$$inlined$map$1$2$1) continuation;
            int i2 = orderNotificationProvider$pushFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderNotificationProvider$pushFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderNotificationProvider$pushFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderNotificationProvider$pushFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    v280 v280Var = ((TaxiOrder) obj).V().P;
                    List A = j73.A(new xh60[]{v280Var.b("prepaid_time_ends_soon"), v280Var.b("prepaid_time_ends_now")});
                    orderNotificationProvider$pushFlow$$inlined$map$1$2$1.L$0 = null;
                    orderNotificationProvider$pushFlow$$inlined$map$1$2$1.L$1 = null;
                    orderNotificationProvider$pushFlow$$inlined$map$1$2$1.L$2 = null;
                    orderNotificationProvider$pushFlow$$inlined$map$1$2$1.L$3 = null;
                    orderNotificationProvider$pushFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(A, orderNotificationProvider$pushFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        orderNotificationProvider$pushFlow$$inlined$map$1$2$1 = new OrderNotificationProvider$pushFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = orderNotificationProvider$pushFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderNotificationProvider$pushFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
