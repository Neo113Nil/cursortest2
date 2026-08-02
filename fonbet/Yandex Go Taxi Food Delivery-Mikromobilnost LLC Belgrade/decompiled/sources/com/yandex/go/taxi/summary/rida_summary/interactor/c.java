package com.yandex.go.taxi.summary.rida_summary.interactor;

import defpackage.avj0;
import defpackage.evu0;
import defpackage.iyh0;
import defpackage.k7k0;
import defpackage.mct0;
import defpackage.ny61;
import defpackage.o8g0;
import defpackage.vpr;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ o8g0 b;

    public c(vpr vprVar, o8g0 o8g0Var) {
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
        RidaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$2$1 ridaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof RidaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$2$1) {
            ridaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$2$1 = (RidaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = ridaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ridaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ridaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ridaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String h = ((avj0) ((zuj0) this.b.a)).h(iyh0.rida_summary_source_address_title);
                    String str = ((mct0) obj).a;
                    String obj3 = str != null ? evu0.k0(str).toString() : null;
                    if (obj3 == null) {
                        obj3 = "";
                    }
                    k7k0 k7k0Var = new k7k0(h, obj3);
                    ridaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    ridaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    ridaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    ridaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    ridaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(k7k0Var, ridaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        ridaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$2$1 = new RidaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = ridaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ridaAddressesUiStateInteractor$sourceUiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
