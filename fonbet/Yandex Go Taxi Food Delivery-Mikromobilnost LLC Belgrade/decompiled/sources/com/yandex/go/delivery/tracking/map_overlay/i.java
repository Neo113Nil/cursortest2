package com.yandex.go.delivery.tracking.map_overlay;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class i implements tpr {
    public final /* synthetic */ tpr a;

    public i(r0 r0Var) {
        this.a = r0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DeliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$1 deliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$1;
        int i;
        if (continuation instanceof DeliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$1) {
            deliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$1 = (DeliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$1) continuation;
            int i2 = deliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h hVar = new h(vprVar);
                    deliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$1.L$0 = null;
                    deliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$1.L$1 = null;
                    deliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$1.L$2 = null;
                    deliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$1.label = 1;
                    if (this.a.collect(hVar, deliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$1) == coroutineSingletons) {
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
        deliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$1 = new DeliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$1(this, continuation);
        Object obj2 = deliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveriesMapPresenter$getDeliveriesFlow$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
