package com.yandex.go.delivery.sdd_slots_selector.data;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ String b;

    public b(r0 r0Var, String str) {
        this.a = r0Var;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DeliveryIntervalsRepositoryImpl$selectedSlotForTariffFlow$$inlined$map$1$1 deliveryIntervalsRepositoryImpl$selectedSlotForTariffFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof DeliveryIntervalsRepositoryImpl$selectedSlotForTariffFlow$$inlined$map$1$1) {
            deliveryIntervalsRepositoryImpl$selectedSlotForTariffFlow$$inlined$map$1$1 = (DeliveryIntervalsRepositoryImpl$selectedSlotForTariffFlow$$inlined$map$1$1) continuation;
            int i2 = deliveryIntervalsRepositoryImpl$selectedSlotForTariffFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryIntervalsRepositoryImpl$selectedSlotForTariffFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryIntervalsRepositoryImpl$selectedSlotForTariffFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryIntervalsRepositoryImpl$selectedSlotForTariffFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    deliveryIntervalsRepositoryImpl$selectedSlotForTariffFlow$$inlined$map$1$1.L$0 = null;
                    deliveryIntervalsRepositoryImpl$selectedSlotForTariffFlow$$inlined$map$1$1.L$1 = null;
                    deliveryIntervalsRepositoryImpl$selectedSlotForTariffFlow$$inlined$map$1$1.L$2 = null;
                    deliveryIntervalsRepositoryImpl$selectedSlotForTariffFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, deliveryIntervalsRepositoryImpl$selectedSlotForTariffFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        deliveryIntervalsRepositoryImpl$selectedSlotForTariffFlow$$inlined$map$1$1 = new DeliveryIntervalsRepositoryImpl$selectedSlotForTariffFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = deliveryIntervalsRepositoryImpl$selectedSlotForTariffFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryIntervalsRepositoryImpl$selectedSlotForTariffFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
