package com.yandex.go.navigator.gas_stations.pins_layer;

import defpackage.ews;
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
        GasStationsPinsLayerPresenter$observeCameraUpdates$$inlined$map$1$2$1 gasStationsPinsLayerPresenter$observeCameraUpdates$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof GasStationsPinsLayerPresenter$observeCameraUpdates$$inlined$map$1$2$1) {
            gasStationsPinsLayerPresenter$observeCameraUpdates$$inlined$map$1$2$1 = (GasStationsPinsLayerPresenter$observeCameraUpdates$$inlined$map$1$2$1) continuation;
            int i2 = gasStationsPinsLayerPresenter$observeCameraUpdates$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gasStationsPinsLayerPresenter$observeCameraUpdates$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = gasStationsPinsLayerPresenter$observeCameraUpdates$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gasStationsPinsLayerPresenter$observeCameraUpdates$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    gasStationsPinsLayerPresenter$observeCameraUpdates$$inlined$map$1$2$1.L$0 = null;
                    gasStationsPinsLayerPresenter$observeCameraUpdates$$inlined$map$1$2$1.L$1 = null;
                    gasStationsPinsLayerPresenter$observeCameraUpdates$$inlined$map$1$2$1.L$2 = null;
                    gasStationsPinsLayerPresenter$observeCameraUpdates$$inlined$map$1$2$1.L$3 = null;
                    gasStationsPinsLayerPresenter$observeCameraUpdates$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(ews.a, gasStationsPinsLayerPresenter$observeCameraUpdates$$inlined$map$1$2$1) == coroutineSingletons) {
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
        gasStationsPinsLayerPresenter$observeCameraUpdates$$inlined$map$1$2$1 = new GasStationsPinsLayerPresenter$observeCameraUpdates$$inlined$map$1$2$1(this, continuation);
        Object obj22 = gasStationsPinsLayerPresenter$observeCameraUpdates$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gasStationsPinsLayerPresenter$observeCameraUpdates$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
