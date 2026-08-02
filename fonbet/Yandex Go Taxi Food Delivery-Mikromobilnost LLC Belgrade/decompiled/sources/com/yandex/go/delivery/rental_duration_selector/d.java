package com.yandex.go.delivery.rental_duration_selector;

import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class d implements tpr {
    public final /* synthetic */ mth a;
    public final /* synthetic */ e b;

    public d(mth mthVar, e eVar) {
        this.a = mthVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DeliveryRentalDurationPresenter$special$$inlined$map$2$1 deliveryRentalDurationPresenter$special$$inlined$map$2$1;
        int i;
        if (continuation instanceof DeliveryRentalDurationPresenter$special$$inlined$map$2$1) {
            deliveryRentalDurationPresenter$special$$inlined$map$2$1 = (DeliveryRentalDurationPresenter$special$$inlined$map$2$1) continuation;
            int i2 = deliveryRentalDurationPresenter$special$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryRentalDurationPresenter$special$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryRentalDurationPresenter$special$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryRentalDurationPresenter$special$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b);
                    deliveryRentalDurationPresenter$special$$inlined$map$2$1.L$0 = null;
                    deliveryRentalDurationPresenter$special$$inlined$map$2$1.L$1 = null;
                    deliveryRentalDurationPresenter$special$$inlined$map$2$1.L$2 = null;
                    deliveryRentalDurationPresenter$special$$inlined$map$2$1.label = 1;
                    if (this.a.collect(cVar, deliveryRentalDurationPresenter$special$$inlined$map$2$1) == coroutineSingletons) {
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
        deliveryRentalDurationPresenter$special$$inlined$map$2$1 = new DeliveryRentalDurationPresenter$special$$inlined$map$2$1(this, continuation);
        Object obj2 = deliveryRentalDurationPresenter$special$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryRentalDurationPresenter$special$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
