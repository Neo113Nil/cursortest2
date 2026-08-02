package com.yandex.go.taxi.summary.rida_summary.interactor;

import defpackage.ny61;
import defpackage.o8g0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class d implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ o8g0 b;

    public d(tpr tprVar, o8g0 o8g0Var) {
        this.a = tprVar;
        this.b = o8g0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RidaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$1 ridaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof RidaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$1) {
            ridaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$1 = (RidaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$1) continuation;
            int i2 = ridaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ridaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ridaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ridaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b);
                    ridaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$1.L$0 = null;
                    ridaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$1.L$1 = null;
                    ridaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$1.L$2 = null;
                    ridaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, ridaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        ridaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$1 = new RidaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = ridaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ridaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
