package com.yandex.go.payments.paymentlist.domain;

import defpackage.ny61;
import defpackage.qaa0;
import defpackage.rsn;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;

    public e(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PaymentMethodsGeoParamsInteractor$getCacheableByZoneNameGeoParamsFlow$$inlined$mapNotNull$1$2$1 paymentMethodsGeoParamsInteractor$getCacheableByZoneNameGeoParamsFlow$$inlined$mapNotNull$1$2$1;
        int i;
        qaa0 qaa0Var;
        if (continuation instanceof PaymentMethodsGeoParamsInteractor$getCacheableByZoneNameGeoParamsFlow$$inlined$mapNotNull$1$2$1) {
            paymentMethodsGeoParamsInteractor$getCacheableByZoneNameGeoParamsFlow$$inlined$mapNotNull$1$2$1 = (PaymentMethodsGeoParamsInteractor$getCacheableByZoneNameGeoParamsFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = paymentMethodsGeoParamsInteractor$getCacheableByZoneNameGeoParamsFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsGeoParamsInteractor$getCacheableByZoneNameGeoParamsFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = paymentMethodsGeoParamsInteractor$getCacheableByZoneNameGeoParamsFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsGeoParamsInteractor$getCacheableByZoneNameGeoParamsFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    rsn rsnVar = (rsn) obj;
                    qaa0 qaa0Var2 = (qaa0) rsnVar.b;
                    if (!qaa0Var2.a && (qaa0Var = (qaa0) rsnVar.a) != null && !qaa0Var.a) {
                        qaa0Var2 = null;
                    }
                    if (qaa0Var2 != null) {
                        paymentMethodsGeoParamsInteractor$getCacheableByZoneNameGeoParamsFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        paymentMethodsGeoParamsInteractor$getCacheableByZoneNameGeoParamsFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        paymentMethodsGeoParamsInteractor$getCacheableByZoneNameGeoParamsFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        paymentMethodsGeoParamsInteractor$getCacheableByZoneNameGeoParamsFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        paymentMethodsGeoParamsInteractor$getCacheableByZoneNameGeoParamsFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        paymentMethodsGeoParamsInteractor$getCacheableByZoneNameGeoParamsFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(qaa0Var2, paymentMethodsGeoParamsInteractor$getCacheableByZoneNameGeoParamsFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        paymentMethodsGeoParamsInteractor$getCacheableByZoneNameGeoParamsFlow$$inlined$mapNotNull$1$2$1 = new PaymentMethodsGeoParamsInteractor$getCacheableByZoneNameGeoParamsFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = paymentMethodsGeoParamsInteractor$getCacheableByZoneNameGeoParamsFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsGeoParamsInteractor$getCacheableByZoneNameGeoParamsFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
