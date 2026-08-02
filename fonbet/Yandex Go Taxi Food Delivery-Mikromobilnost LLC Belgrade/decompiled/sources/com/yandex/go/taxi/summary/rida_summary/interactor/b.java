package com.yandex.go.taxi.summary.rida_summary.interactor;

import defpackage.ny61;
import defpackage.o8g0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ o8g0 b;

    public b(tpr tprVar, o8g0 o8g0Var) {
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
        RidaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$1 ridaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof RidaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$1) {
            ridaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$1 = (RidaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$1) continuation;
            int i2 = ridaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ridaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ridaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ridaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    ridaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$1.L$0 = null;
                    ridaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$1.L$1 = null;
                    ridaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$1.L$2 = null;
                    ridaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, ridaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        ridaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$1 = new RidaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = ridaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ridaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
