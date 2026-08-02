package com.yandex.go.payments.paymentlist.domain;

import defpackage.g2t;
import defpackage.ny61;
import defpackage.qaa0;
import defpackage.raa0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ raa0 b;

    public g(vpr vprVar, raa0 raa0Var) {
        this.a = vprVar;
        this.b = raa0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PaymentMethodsGeoParamsInteractor$special$$inlined$map$1$2$1 paymentMethodsGeoParamsInteractor$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof PaymentMethodsGeoParamsInteractor$special$$inlined$map$1$2$1) {
            paymentMethodsGeoParamsInteractor$special$$inlined$map$1$2$1 = (PaymentMethodsGeoParamsInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = paymentMethodsGeoParamsInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsGeoParamsInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = paymentMethodsGeoParamsInteractor$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsGeoParamsInteractor$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.b.getClass();
                    qaa0 b = raa0.b((g2t) obj);
                    paymentMethodsGeoParamsInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    paymentMethodsGeoParamsInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    paymentMethodsGeoParamsInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    paymentMethodsGeoParamsInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    paymentMethodsGeoParamsInteractor$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(b, paymentMethodsGeoParamsInteractor$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        paymentMethodsGeoParamsInteractor$special$$inlined$map$1$2$1 = new PaymentMethodsGeoParamsInteractor$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = paymentMethodsGeoParamsInteractor$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsGeoParamsInteractor$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
