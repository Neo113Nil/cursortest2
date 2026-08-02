package com.yandex.go.delivery.tracking.map_overlay;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;

    public h(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$2$1 deliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof DeliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$2$1) {
            deliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$2$1 = (DeliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$2$1) continuation;
            int i2 = deliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Set keySet = ((Map) obj).keySet();
                    deliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$2$1.L$0 = null;
                    deliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$2$1.L$1 = null;
                    deliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$2$1.L$2 = null;
                    deliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$2$1.L$3 = null;
                    deliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(keySet, deliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$2$1) == coroutineSingletons) {
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
        deliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$2$1 = new DeliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$2$1(this, continuation);
        Object obj22 = deliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
