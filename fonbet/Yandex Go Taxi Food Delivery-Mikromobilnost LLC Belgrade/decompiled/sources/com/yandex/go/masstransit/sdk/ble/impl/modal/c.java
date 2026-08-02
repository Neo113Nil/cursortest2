package com.yandex.go.masstransit.sdk.ble.impl.modal;

import android.bluetooth.BluetoothAdapter;
import defpackage.ny61;
import defpackage.r16;
import defpackage.t16;
import defpackage.vpr;
import defpackage.xl10;
import defpackage.zc30;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class c implements vpr {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(r16 r16Var, Continuation continuation) {
        MtGeoPaymentLifecycleListener$subscribeToActivityResultFlow$1$1$emit$1 mtGeoPaymentLifecycleListener$subscribeToActivityResultFlow$1$1$emit$1;
        int i;
        d dVar;
        int i2;
        BluetoothAdapter bluetoothAdapter;
        if (continuation instanceof MtGeoPaymentLifecycleListener$subscribeToActivityResultFlow$1$1$emit$1) {
            mtGeoPaymentLifecycleListener$subscribeToActivityResultFlow$1$1$emit$1 = (MtGeoPaymentLifecycleListener$subscribeToActivityResultFlow$1$1$emit$1) continuation;
            int i3 = mtGeoPaymentLifecycleListener$subscribeToActivityResultFlow$1$1$emit$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mtGeoPaymentLifecycleListener$subscribeToActivityResultFlow$1$1$emit$1.label = i3 - Integer.MIN_VALUE;
                Object obj = mtGeoPaymentLifecycleListener$subscribeToActivityResultFlow$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtGeoPaymentLifecycleListener$subscribeToActivityResultFlow$1$1$emit$1.label;
                dVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    xl10 xl10Var = dVar.c;
                    mtGeoPaymentLifecycleListener$subscribeToActivityResultFlow$1$1$emit$1.L$0 = r16Var;
                    mtGeoPaymentLifecycleListener$subscribeToActivityResultFlow$1$1$emit$1.label = 1;
                    if (((ru.yandex.taxi.masstransit.geopayment.adapter.a) xl10Var.a).a(mtGeoPaymentLifecycleListener$subscribeToActivityResultFlow$1$1$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r16Var = (r16) mtGeoPaymentLifecycleListener$subscribeToActivityResultFlow$1$1$emit$1.L$0;
                    kotlin.b.b(obj);
                }
                dVar.d.getClass();
                i2 = r16Var.a;
                if (i2 != 139 || i2 == 140) {
                    zc30 zc30Var = ((t16) dVar.e.a).a;
                    bluetoothAdapter = (BluetoothAdapter) zc30Var.b.getValue();
                    if (bluetoothAdapter != null) {
                        r0 r0Var = zc30Var.c;
                        Boolean valueOf = Boolean.valueOf(bluetoothAdapter.isEnabled());
                        r0Var.getClass();
                        r0Var.m(null, valueOf);
                    }
                }
                return zy11.a;
            }
        }
        mtGeoPaymentLifecycleListener$subscribeToActivityResultFlow$1$1$emit$1 = new MtGeoPaymentLifecycleListener$subscribeToActivityResultFlow$1$1$emit$1(this, continuation);
        Object obj2 = mtGeoPaymentLifecycleListener$subscribeToActivityResultFlow$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtGeoPaymentLifecycleListener$subscribeToActivityResultFlow$1$1$emit$1.label;
        dVar = this.a;
        if (i != 0) {
        }
        dVar.d.getClass();
        i2 = r16Var.a;
        if (i2 != 139) {
        }
        zc30 zc30Var2 = ((t16) dVar.e.a).a;
        bluetoothAdapter = (BluetoothAdapter) zc30Var2.b.getValue();
        if (bluetoothAdapter != null) {
        }
        return zy11.a;
    }
}
