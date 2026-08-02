package com.yandex.go.address.address_map_picker.pin;

import com.yandex.go.address.address_map_picker.data.AddressMapPickerAddressStateRepository;
import com.yandex.go.pin.api.v1.Pin$State;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w11;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AddressMapPickerPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1 addressMapPickerPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1;
        int i;
        Pin$State pin$State;
        if (continuation instanceof AddressMapPickerPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1) {
            addressMapPickerPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1 = (AddressMapPickerPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = addressMapPickerPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressMapPickerPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = addressMapPickerPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressMapPickerPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    int i3 = w11.a[((AddressMapPickerAddressStateRepository.State) obj).ordinal()];
                    if (i3 == 1 || i3 == 2) {
                        pin$State = Pin$State.IDLE;
                    } else if (i3 == 3) {
                        pin$State = Pin$State.IN_PROGRESS;
                    } else {
                        if (i3 != 4) {
                            w511.b();
                            return null;
                        }
                        pin$State = Pin$State.ERROR;
                    }
                    addressMapPickerPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1.L$0 = null;
                    addressMapPickerPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1.L$1 = null;
                    addressMapPickerPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1.L$2 = null;
                    addressMapPickerPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1.L$3 = null;
                    addressMapPickerPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pin$State, addressMapPickerPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        addressMapPickerPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1 = new AddressMapPickerPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = addressMapPickerPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressMapPickerPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
