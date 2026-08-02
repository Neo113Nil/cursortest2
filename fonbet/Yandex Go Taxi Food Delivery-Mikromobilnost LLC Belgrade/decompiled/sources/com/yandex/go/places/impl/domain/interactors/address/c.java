package com.yandex.go.places.impl.domain.interactors.address;

import com.yandex.go.address.models.Address;
import defpackage.d0l0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PlacesAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1 placesAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof PlacesAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1) {
            placesAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1 = (PlacesAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = placesAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = placesAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Address h = ((d0l0) obj).h();
                    zzs B = h != null ? h.B() : null;
                    if (B != null) {
                        placesAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1.L$0 = null;
                        placesAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1.L$1 = null;
                        placesAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1.L$2 = null;
                        placesAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1.L$3 = null;
                        placesAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1.L$4 = null;
                        placesAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(B, placesAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        placesAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1 = new PlacesAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = placesAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
