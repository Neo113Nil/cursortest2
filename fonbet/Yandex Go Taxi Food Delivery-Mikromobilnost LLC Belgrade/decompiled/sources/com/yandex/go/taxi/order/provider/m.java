package com.yandex.go.taxi.order.provider;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.a6e0;
import defpackage.ny61;
import defpackage.o280;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class m implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ o280 b;

    public m(vpr vprVar, o280 o280Var) {
        this.a = vprVar;
        this.b = o280Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderNotificationProvider$poolReminderFlow$$inlined$map$1$2$1 orderNotificationProvider$poolReminderFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof OrderNotificationProvider$poolReminderFlow$$inlined$map$1$2$1) {
            orderNotificationProvider$poolReminderFlow$$inlined$map$1$2$1 = (OrderNotificationProvider$poolReminderFlow$$inlined$map$1$2$1) continuation;
            int i2 = orderNotificationProvider$poolReminderFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderNotificationProvider$poolReminderFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderNotificationProvider$poolReminderFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderNotificationProvider$poolReminderFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.b.getClass();
                    a6e0 a = o280.a((TaxiOrder) obj);
                    orderNotificationProvider$poolReminderFlow$$inlined$map$1$2$1.L$0 = null;
                    orderNotificationProvider$poolReminderFlow$$inlined$map$1$2$1.L$1 = null;
                    orderNotificationProvider$poolReminderFlow$$inlined$map$1$2$1.L$2 = null;
                    orderNotificationProvider$poolReminderFlow$$inlined$map$1$2$1.L$3 = null;
                    orderNotificationProvider$poolReminderFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, orderNotificationProvider$poolReminderFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        orderNotificationProvider$poolReminderFlow$$inlined$map$1$2$1 = new OrderNotificationProvider$poolReminderFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = orderNotificationProvider$poolReminderFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderNotificationProvider$poolReminderFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
