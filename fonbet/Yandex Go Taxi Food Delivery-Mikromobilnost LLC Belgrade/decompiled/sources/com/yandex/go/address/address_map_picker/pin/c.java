package com.yandex.go.address.address_map_picker.pin;

import com.yandex.go.pin.api.v2.PinV2Component;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AddressMapPickerPinV2DataRepository$positionFlow$$inlined$map$1$2$1 addressMapPickerPinV2DataRepository$positionFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof AddressMapPickerPinV2DataRepository$positionFlow$$inlined$map$1$2$1) {
            addressMapPickerPinV2DataRepository$positionFlow$$inlined$map$1$2$1 = (AddressMapPickerPinV2DataRepository$positionFlow$$inlined$map$1$2$1) continuation;
            int i2 = addressMapPickerPinV2DataRepository$positionFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressMapPickerPinV2DataRepository$positionFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = addressMapPickerPinV2DataRepository$positionFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressMapPickerPinV2DataRepository$positionFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    PinV2Component.Position position = ((Boolean) obj).booleanValue() ? PinV2Component.Position.MOVE : PinV2Component.Position.DEFAULT;
                    addressMapPickerPinV2DataRepository$positionFlow$$inlined$map$1$2$1.L$0 = null;
                    addressMapPickerPinV2DataRepository$positionFlow$$inlined$map$1$2$1.L$1 = null;
                    addressMapPickerPinV2DataRepository$positionFlow$$inlined$map$1$2$1.L$2 = null;
                    addressMapPickerPinV2DataRepository$positionFlow$$inlined$map$1$2$1.L$3 = null;
                    addressMapPickerPinV2DataRepository$positionFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(position, addressMapPickerPinV2DataRepository$positionFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        addressMapPickerPinV2DataRepository$positionFlow$$inlined$map$1$2$1 = new AddressMapPickerPinV2DataRepository$positionFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = addressMapPickerPinV2DataRepository$positionFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressMapPickerPinV2DataRepository$positionFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
