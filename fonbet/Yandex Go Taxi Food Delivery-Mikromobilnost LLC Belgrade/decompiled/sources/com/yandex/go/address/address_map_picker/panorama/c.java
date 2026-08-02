package com.yandex.go.address.address_map_picker.panorama;

import defpackage.jqr;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.xb90;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class c implements tpr {
    public final /* synthetic */ jqr a;
    public final /* synthetic */ xb90 b;

    public c(jqr jqrVar, xb90 xb90Var) {
        this.a = jqrVar;
        this.b = xb90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        AddressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$1 addressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof AddressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$1) {
            addressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$1 = (AddressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$1) continuation;
            int i2 = addressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b);
                    addressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$1.L$0 = null;
                    addressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$1.L$1 = null;
                    addressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$1.L$2 = null;
                    addressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, addressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        addressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$1 = new AddressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = addressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressMapPickerPanoramaInteractor$buildButtonFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
