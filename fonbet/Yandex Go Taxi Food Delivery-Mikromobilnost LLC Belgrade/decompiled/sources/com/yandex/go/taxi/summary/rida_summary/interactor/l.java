package com.yandex.go.taxi.summary.rida_summary.interactor;

import defpackage.ny61;
import defpackage.o8g0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class l implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.n a;
    public final /* synthetic */ o8g0 b;

    public l(kotlinx.coroutines.flow.n nVar, o8g0 o8g0Var) {
        this.a = nVar;
        this.b = o8g0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RidaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$1 ridaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof RidaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$1) {
            ridaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$1 = (RidaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$1) continuation;
            int i2 = ridaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ridaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ridaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ridaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    k kVar = new k(vprVar, this.b);
                    ridaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$1.L$0 = null;
                    ridaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$1.L$1 = null;
                    ridaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$1.L$2 = null;
                    ridaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(kVar, ridaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        ridaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$1 = new RidaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = ridaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ridaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
