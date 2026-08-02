package com.yandex.go.taxi.summary.rida_summary.interactor;

import defpackage.m1a0;
import defpackage.ny61;
import defpackage.o8g0;
import defpackage.s7k0;
import defpackage.vpr;
import defpackage.z0a0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class k implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ o8g0 b;

    public k(vpr vprVar, o8g0 o8g0Var) {
        this.a = vprVar;
        this.b = o8g0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RidaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 ridaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof RidaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) {
            ridaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 = (RidaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = ridaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ridaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ridaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ridaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    s7k0 s7k0Var = new s7k0((m1a0) obj, (z0a0) this.b.a);
                    ridaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    ridaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    ridaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    ridaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    ridaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(s7k0Var, ridaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        ridaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 = new RidaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = ridaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ridaPaymentMethodUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
