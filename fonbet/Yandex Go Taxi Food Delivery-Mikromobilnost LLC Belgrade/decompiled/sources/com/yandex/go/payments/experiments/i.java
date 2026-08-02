package com.yandex.go.payments.experiments;

import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class i {
    public final t1b0 a;

    public i(rqo rqoVar) {
        RidePaymentMethodSelectAfterBindingExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).e(RidePaymentMethodSelectAfterBindingExperiment.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PaymentMethod$Type paymentMethod$Type, ContinuationImpl continuationImpl) {
        RidePaymentMethodSelectAfterBindingExperimentRepository$isEnabledForType$1 ridePaymentMethodSelectAfterBindingExperimentRepository$isEnabledForType$1;
        int i;
        if (continuationImpl instanceof RidePaymentMethodSelectAfterBindingExperimentRepository$isEnabledForType$1) {
            ridePaymentMethodSelectAfterBindingExperimentRepository$isEnabledForType$1 = (RidePaymentMethodSelectAfterBindingExperimentRepository$isEnabledForType$1) continuationImpl;
            int i2 = ridePaymentMethodSelectAfterBindingExperimentRepository$isEnabledForType$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ridePaymentMethodSelectAfterBindingExperimentRepository$isEnabledForType$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ridePaymentMethodSelectAfterBindingExperimentRepository$isEnabledForType$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ridePaymentMethodSelectAfterBindingExperimentRepository$isEnabledForType$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ridePaymentMethodSelectAfterBindingExperimentRepository$isEnabledForType$1.L$0 = paymentMethod$Type;
                    ridePaymentMethodSelectAfterBindingExperimentRepository$isEnabledForType$1.label = 1;
                    obj = this.a.b(ridePaymentMethodSelectAfterBindingExperimentRepository$isEnabledForType$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    paymentMethod$Type = (PaymentMethod$Type) ridePaymentMethodSelectAfterBindingExperimentRepository$isEnabledForType$1.L$0;
                    kotlin.b.b(obj);
                }
                RidePaymentMethodSelectAfterBindingExperiment ridePaymentMethodSelectAfterBindingExperiment = (RidePaymentMethodSelectAfterBindingExperiment) obj;
                return Boolean.valueOf(!ridePaymentMethodSelectAfterBindingExperiment.b && ridePaymentMethodSelectAfterBindingExperiment.c.contains(paymentMethod$Type));
            }
        }
        ridePaymentMethodSelectAfterBindingExperimentRepository$isEnabledForType$1 = new RidePaymentMethodSelectAfterBindingExperimentRepository$isEnabledForType$1(this, continuationImpl);
        Object obj2 = ridePaymentMethodSelectAfterBindingExperimentRepository$isEnabledForType$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ridePaymentMethodSelectAfterBindingExperimentRepository$isEnabledForType$1.label;
        if (i != 0) {
        }
        RidePaymentMethodSelectAfterBindingExperiment ridePaymentMethodSelectAfterBindingExperiment2 = (RidePaymentMethodSelectAfterBindingExperiment) obj2;
        return Boolean.valueOf(!ridePaymentMethodSelectAfterBindingExperiment2.b && ridePaymentMethodSelectAfterBindingExperiment2.c.contains(paymentMethod$Type));
    }
}
