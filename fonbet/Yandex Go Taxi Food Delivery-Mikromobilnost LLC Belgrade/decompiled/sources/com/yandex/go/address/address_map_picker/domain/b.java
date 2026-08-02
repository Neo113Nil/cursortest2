package com.yandex.go.address.address_map_picker.domain;

import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;

    public b(mth mthVar) {
        this.a = mthVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        AddressMapPickerBlockedZonesInteractor$attach$$inlined$map$1$1 addressMapPickerBlockedZonesInteractor$attach$$inlined$map$1$1;
        int i;
        if (continuation instanceof AddressMapPickerBlockedZonesInteractor$attach$$inlined$map$1$1) {
            addressMapPickerBlockedZonesInteractor$attach$$inlined$map$1$1 = (AddressMapPickerBlockedZonesInteractor$attach$$inlined$map$1$1) continuation;
            int i2 = addressMapPickerBlockedZonesInteractor$attach$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressMapPickerBlockedZonesInteractor$attach$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addressMapPickerBlockedZonesInteractor$attach$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressMapPickerBlockedZonesInteractor$attach$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar);
                    addressMapPickerBlockedZonesInteractor$attach$$inlined$map$1$1.L$0 = null;
                    addressMapPickerBlockedZonesInteractor$attach$$inlined$map$1$1.L$1 = null;
                    addressMapPickerBlockedZonesInteractor$attach$$inlined$map$1$1.L$2 = null;
                    addressMapPickerBlockedZonesInteractor$attach$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, addressMapPickerBlockedZonesInteractor$attach$$inlined$map$1$1) == coroutineSingletons) {
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
        addressMapPickerBlockedZonesInteractor$attach$$inlined$map$1$1 = new AddressMapPickerBlockedZonesInteractor$attach$$inlined$map$1$1(this, continuation);
        Object obj2 = addressMapPickerBlockedZonesInteractor$attach$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressMapPickerBlockedZonesInteractor$attach$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
