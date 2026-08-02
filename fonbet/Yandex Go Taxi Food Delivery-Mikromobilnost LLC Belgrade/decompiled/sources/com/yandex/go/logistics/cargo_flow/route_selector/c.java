package com.yandex.go.logistics.cargo_flow.route_selector;

import defpackage.bl00;
import defpackage.f4c0;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.sbv;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class c {
    public final com.yandex.go.pin.api.widget.b a;
    public final k7x0 b;

    public c(com.yandex.go.pin.api.widget.b bVar, k7x0 k7x0Var) {
        this.a = bVar;
        this.b = k7x0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(f4c0 f4c0Var, sbv sbvVar, ContinuationImpl continuationImpl) {
        CargoFlowRoutePinInteractor$setDeliveryPinImage$1 cargoFlowRoutePinInteractor$setDeliveryPinImage$1;
        int i;
        String str;
        String str2;
        bl00 bl00Var;
        if (continuationImpl instanceof CargoFlowRoutePinInteractor$setDeliveryPinImage$1) {
            cargoFlowRoutePinInteractor$setDeliveryPinImage$1 = (CargoFlowRoutePinInteractor$setDeliveryPinImage$1) continuationImpl;
            int i2 = cargoFlowRoutePinInteractor$setDeliveryPinImage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cargoFlowRoutePinInteractor$setDeliveryPinImage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cargoFlowRoutePinInteractor$setDeliveryPinImage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cargoFlowRoutePinInteractor$setDeliveryPinImage$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cargoFlowRoutePinInteractor$setDeliveryPinImage$1.L$0 = f4c0Var;
                    cargoFlowRoutePinInteractor$setDeliveryPinImage$1.L$1 = null;
                    cargoFlowRoutePinInteractor$setDeliveryPinImage$1.label = 1;
                    if (sbvVar == null || (str2 = sbvVar.a) == null || (str = ((m7x0) this.b).a(str2)) == null) {
                        str = sbvVar != null ? sbvVar.b : null;
                    }
                    obj = str == null ? null : this.a.d(str, cargoFlowRoutePinInteractor$setDeliveryPinImage$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f4c0Var = (f4c0) cargoFlowRoutePinInteractor$setDeliveryPinImage$1.L$0;
                    kotlin.b.b(obj);
                }
                bl00Var = (bl00) obj;
                zy11 zy11Var = zy11.a;
                if (bl00Var != null && f4c0Var != null) {
                    f4c0Var.z(bl00Var.a, bl00Var.b);
                }
                return zy11Var;
            }
        }
        cargoFlowRoutePinInteractor$setDeliveryPinImage$1 = new CargoFlowRoutePinInteractor$setDeliveryPinImage$1(this, continuationImpl);
        Object obj2 = cargoFlowRoutePinInteractor$setDeliveryPinImage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cargoFlowRoutePinInteractor$setDeliveryPinImage$1.label;
        if (i != 0) {
        }
        bl00Var = (bl00) obj2;
        zy11 zy11Var2 = zy11.a;
        if (bl00Var != null) {
            f4c0Var.z(bl00Var.a, bl00Var.b);
        }
        return zy11Var2;
    }
}
