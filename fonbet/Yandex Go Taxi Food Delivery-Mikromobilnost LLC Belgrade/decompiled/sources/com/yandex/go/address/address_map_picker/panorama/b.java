package com.yandex.go.address.address_map_picker.panorama;

import defpackage.d6z;
import defpackage.myy;
import defpackage.ny61;
import defpackage.qb90;
import defpackage.rb90;
import defpackage.vpr;
import defpackage.xb90;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ xb90 b;

    public b(vpr vprVar, xb90 xb90Var) {
        this.a = vprVar;
        this.b = xb90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AddressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$2$1 addressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof AddressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$2$1) {
            addressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$2$1 = (AddressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$2$1) continuation;
            int i2 = addressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = addressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    qb90 qb90Var = new qb90(((myy) obj).b);
                    ru.yandex.taxi.panorama.d dVar = this.b.d;
                    rb90 rb90Var = new rb90(qb90Var, d6z.Y(dVar, dVar.d));
                    addressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$2$1.L$0 = null;
                    addressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$2$1.L$1 = null;
                    addressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$2$1.L$2 = null;
                    addressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$2$1.L$3 = null;
                    addressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(rb90Var, addressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        addressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$2$1 = new AddressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = addressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
