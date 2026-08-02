package com.yandex.go.taxi.summary.rida_summary.interactor;

import defpackage.avj0;
import defpackage.evu0;
import defpackage.iyh0;
import defpackage.j7k0;
import defpackage.k7k0;
import defpackage.kyh0;
import defpackage.mct0;
import defpackage.ny61;
import defpackage.o8g0;
import defpackage.vpr;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ o8g0 b;

    public a(vpr vprVar, o8g0 o8g0Var) {
        this.a = vprVar;
        this.b = o8g0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RidaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$2$1 ridaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$2$1;
        int i;
        zuj0 zuj0Var = (zuj0) this.b.a;
        if (continuation instanceof RidaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$2$1) {
            ridaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$2$1 = (RidaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = ridaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ridaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ridaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ridaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    mct0 mct0Var = (mct0) obj;
                    String str = mct0Var.d;
                    String obj3 = str != null ? evu0.k0(str).toString() : null;
                    if (obj3 == null) {
                        obj3 = "";
                    }
                    String str2 = mct0Var.a;
                    Object k7k0Var = (str2 == null || evu0.J(str2) || obj3.length() != 0) ? new k7k0(((avj0) zuj0Var).h(iyh0.rida_summary_destination_address_title), obj3) : new j7k0(((avj0) zuj0Var).h(kyh0.address_destination_title));
                    ridaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    ridaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    ridaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    ridaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    ridaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(k7k0Var, ridaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        ridaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$2$1 = new RidaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = ridaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ridaAddressesUiStateInteractor$destinationUiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
