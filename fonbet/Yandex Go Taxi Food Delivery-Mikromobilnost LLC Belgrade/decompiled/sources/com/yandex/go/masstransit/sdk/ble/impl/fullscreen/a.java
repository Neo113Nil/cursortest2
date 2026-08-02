package com.yandex.go.masstransit.sdk.ble.impl.fullscreen;

import com.yandex.go.masstransit.sdk.ble.api.analytics.BlePermissionRequestReason;
import defpackage.b36;
import defpackage.il30;
import defpackage.jl30;
import defpackage.kl30;
import defpackage.ml30;
import defpackage.nl30;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ b36 b;

    public a(vpr vprVar, b36 b36Var) {
        this.a = vprVar;
        this.b = b36Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BleVehiclesPermissionAnalyticsObserver$bind$1$invokeSuspend$$inlined$map$1$2$1 bleVehiclesPermissionAnalyticsObserver$bind$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof BleVehiclesPermissionAnalyticsObserver$bind$1$invokeSuspend$$inlined$map$1$2$1) {
            bleVehiclesPermissionAnalyticsObserver$bind$1$invokeSuspend$$inlined$map$1$2$1 = (BleVehiclesPermissionAnalyticsObserver$bind$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = bleVehiclesPermissionAnalyticsObserver$bind$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bleVehiclesPermissionAnalyticsObserver$bind$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = bleVehiclesPermissionAnalyticsObserver$bind$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bleVehiclesPermissionAnalyticsObserver$bind$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ml30 ml30Var = ((nl30) obj).k;
                    this.b.getClass();
                    BlePermissionRequestReason blePermissionRequestReason = ml30Var instanceof kl30 ? BlePermissionRequestReason.LocationPermission : ml30Var instanceof il30 ? BlePermissionRequestReason.BluetoothPermission : ml30Var instanceof jl30 ? BlePermissionRequestReason.BluetoothDisabled : null;
                    bleVehiclesPermissionAnalyticsObserver$bind$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    bleVehiclesPermissionAnalyticsObserver$bind$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    bleVehiclesPermissionAnalyticsObserver$bind$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    bleVehiclesPermissionAnalyticsObserver$bind$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    bleVehiclesPermissionAnalyticsObserver$bind$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(blePermissionRequestReason, bleVehiclesPermissionAnalyticsObserver$bind$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        bleVehiclesPermissionAnalyticsObserver$bind$1$invokeSuspend$$inlined$map$1$2$1 = new BleVehiclesPermissionAnalyticsObserver$bind$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = bleVehiclesPermissionAnalyticsObserver$bind$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bleVehiclesPermissionAnalyticsObserver$bind$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
