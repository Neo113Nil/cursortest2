package com.yandex.go.address.position_confirmation;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zyb0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ j b;

    public b(vpr vprVar, j jVar) {
        this.a = vprVar;
        this.b = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PinPositionConfirmationInteractorImpl$isZoomInAllowedRangeFlow$$inlined$map$1$2$1 pinPositionConfirmationInteractorImpl$isZoomInAllowedRangeFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof PinPositionConfirmationInteractorImpl$isZoomInAllowedRangeFlow$$inlined$map$1$2$1) {
            pinPositionConfirmationInteractorImpl$isZoomInAllowedRangeFlow$$inlined$map$1$2$1 = (PinPositionConfirmationInteractorImpl$isZoomInAllowedRangeFlow$$inlined$map$1$2$1) continuation;
            int i2 = pinPositionConfirmationInteractorImpl$isZoomInAllowedRangeFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinPositionConfirmationInteractorImpl$isZoomInAllowedRangeFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = pinPositionConfirmationInteractorImpl$isZoomInAllowedRangeFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinPositionConfirmationInteractorImpl$isZoomInAllowedRangeFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    float floatValue = ((Number) obj).floatValue();
                    zyb0 zyb0Var = this.b.l;
                    float f = zyb0Var.a;
                    boolean z = false;
                    if (floatValue <= zyb0Var.b && f <= floatValue) {
                        z = true;
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    pinPositionConfirmationInteractorImpl$isZoomInAllowedRangeFlow$$inlined$map$1$2$1.L$0 = null;
                    pinPositionConfirmationInteractorImpl$isZoomInAllowedRangeFlow$$inlined$map$1$2$1.L$1 = null;
                    pinPositionConfirmationInteractorImpl$isZoomInAllowedRangeFlow$$inlined$map$1$2$1.L$2 = null;
                    pinPositionConfirmationInteractorImpl$isZoomInAllowedRangeFlow$$inlined$map$1$2$1.L$3 = null;
                    pinPositionConfirmationInteractorImpl$isZoomInAllowedRangeFlow$$inlined$map$1$2$1.label = 1;
                    if (vprVar.emit(valueOf, pinPositionConfirmationInteractorImpl$isZoomInAllowedRangeFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        pinPositionConfirmationInteractorImpl$isZoomInAllowedRangeFlow$$inlined$map$1$2$1 = new PinPositionConfirmationInteractorImpl$isZoomInAllowedRangeFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = pinPositionConfirmationInteractorImpl$isZoomInAllowedRangeFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinPositionConfirmationInteractorImpl$isZoomInAllowedRangeFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
