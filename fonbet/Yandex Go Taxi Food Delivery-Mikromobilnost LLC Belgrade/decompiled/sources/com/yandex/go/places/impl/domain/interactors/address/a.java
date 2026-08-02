package com.yandex.go.places.impl.domain.interactors.address;

import defpackage.dt20;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ dt20 b;

    public a(vpr vprVar, dt20 dt20Var) {
        this.a = vprVar;
        this.b = dt20Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PlacesAddressInteractor$updateAddress$$inlined$filter$1$2$1 placesAddressInteractor$updateAddress$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof PlacesAddressInteractor$updateAddress$$inlined$filter$1$2$1) {
            placesAddressInteractor$updateAddress$$inlined$filter$1$2$1 = (PlacesAddressInteractor$updateAddress$$inlined$filter$1$2$1) continuation;
            int i2 = placesAddressInteractor$updateAddress$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesAddressInteractor$updateAddress$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = placesAddressInteractor$updateAddress$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesAddressInteractor$updateAddress$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    zzs zzsVar = (zzs) obj;
                    double d = zzsVar.a;
                    dt20 dt20Var = this.b;
                    Double d2 = (Double) dt20Var.w;
                    if (d2 == null || d != d2.doubleValue()) {
                        double d3 = zzsVar.b;
                        Double d4 = (Double) dt20Var.x;
                        if (d4 == null || d3 != d4.doubleValue()) {
                            placesAddressInteractor$updateAddress$$inlined$filter$1$2$1.L$0 = null;
                            placesAddressInteractor$updateAddress$$inlined$filter$1$2$1.L$1 = null;
                            placesAddressInteractor$updateAddress$$inlined$filter$1$2$1.L$2 = null;
                            placesAddressInteractor$updateAddress$$inlined$filter$1$2$1.L$3 = null;
                            placesAddressInteractor$updateAddress$$inlined$filter$1$2$1.label = 1;
                            if (this.a.emit(obj, placesAddressInteractor$updateAddress$$inlined$filter$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
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
        placesAddressInteractor$updateAddress$$inlined$filter$1$2$1 = new PlacesAddressInteractor$updateAddress$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = placesAddressInteractor$updateAddress$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesAddressInteractor$updateAddress$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
