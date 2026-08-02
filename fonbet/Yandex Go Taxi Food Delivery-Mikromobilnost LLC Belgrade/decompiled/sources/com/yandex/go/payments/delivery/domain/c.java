package com.yandex.go.payments.delivery.domain;

import defpackage.ha2;
import defpackage.mii;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class c implements tpr {
    public final /* synthetic */ ha2 a;
    public final /* synthetic */ d b;
    public final /* synthetic */ mii c;

    public c(ha2 ha2Var, d dVar, mii miiVar) {
        this.a = ha2Var;
        this.b = dVar;
        this.c = miiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DeliveryPaymentsListInteractor$paymentOptionsFlow$lambda$0$$inlined$map$1$1 deliveryPaymentsListInteractor$paymentOptionsFlow$lambda$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof DeliveryPaymentsListInteractor$paymentOptionsFlow$lambda$0$$inlined$map$1$1) {
            deliveryPaymentsListInteractor$paymentOptionsFlow$lambda$0$$inlined$map$1$1 = (DeliveryPaymentsListInteractor$paymentOptionsFlow$lambda$0$$inlined$map$1$1) continuation;
            int i2 = deliveryPaymentsListInteractor$paymentOptionsFlow$lambda$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryPaymentsListInteractor$paymentOptionsFlow$lambda$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryPaymentsListInteractor$paymentOptionsFlow$lambda$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryPaymentsListInteractor$paymentOptionsFlow$lambda$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b, this.c);
                    deliveryPaymentsListInteractor$paymentOptionsFlow$lambda$0$$inlined$map$1$1.L$0 = null;
                    deliveryPaymentsListInteractor$paymentOptionsFlow$lambda$0$$inlined$map$1$1.L$1 = null;
                    deliveryPaymentsListInteractor$paymentOptionsFlow$lambda$0$$inlined$map$1$1.L$2 = null;
                    deliveryPaymentsListInteractor$paymentOptionsFlow$lambda$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, deliveryPaymentsListInteractor$paymentOptionsFlow$lambda$0$$inlined$map$1$1) == coroutineSingletons) {
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
        deliveryPaymentsListInteractor$paymentOptionsFlow$lambda$0$$inlined$map$1$1 = new DeliveryPaymentsListInteractor$paymentOptionsFlow$lambda$0$$inlined$map$1$1(this, continuation);
        Object obj2 = deliveryPaymentsListInteractor$paymentOptionsFlow$lambda$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryPaymentsListInteractor$paymentOptionsFlow$lambda$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
