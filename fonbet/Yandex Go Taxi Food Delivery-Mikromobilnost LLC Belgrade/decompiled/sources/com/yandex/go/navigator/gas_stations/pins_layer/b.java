package com.yandex.go.navigator.gas_stations.pins_layer;

import com.yandex.mapkit.GeoObject;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class b implements vpr {
    public final /* synthetic */ h a;

    public b(h hVar) {
        this.a = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (com.yandex.go.navigator.gas_stations.pins_layer.h.Mg(r6, r7, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (com.yandex.go.navigator.gas_stations.pins_layer.h.Ng(r6, r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GasStationsPinsLayerPresenter$collectGasStations$$inlined$safeCollectIn$3$2$1 gasStationsPinsLayerPresenter$collectGasStations$$inlined$safeCollectIn$3$2$1;
        int i;
        GeoObject geoObject;
        if (continuation instanceof GasStationsPinsLayerPresenter$collectGasStations$$inlined$safeCollectIn$3$2$1) {
            gasStationsPinsLayerPresenter$collectGasStations$$inlined$safeCollectIn$3$2$1 = (GasStationsPinsLayerPresenter$collectGasStations$$inlined$safeCollectIn$3$2$1) continuation;
            int i2 = gasStationsPinsLayerPresenter$collectGasStations$$inlined$safeCollectIn$3$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gasStationsPinsLayerPresenter$collectGasStations$$inlined$safeCollectIn$3$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = gasStationsPinsLayerPresenter$collectGasStations$$inlined$safeCollectIn$3$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gasStationsPinsLayerPresenter$collectGasStations$$inlined$safeCollectIn$3$2$1.label;
                h hVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    geoObject = (GeoObject) obj;
                    gasStationsPinsLayerPresenter$collectGasStations$$inlined$safeCollectIn$3$2$1.L$0 = null;
                    gasStationsPinsLayerPresenter$collectGasStations$$inlined$safeCollectIn$3$2$1.L$1 = null;
                    gasStationsPinsLayerPresenter$collectGasStations$$inlined$safeCollectIn$3$2$1.L$2 = geoObject;
                    gasStationsPinsLayerPresenter$collectGasStations$$inlined$safeCollectIn$3$2$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    geoObject = (GeoObject) gasStationsPinsLayerPresenter$collectGasStations$$inlined$safeCollectIn$3$2$1.L$2;
                    kotlin.b.b(obj2);
                }
                gasStationsPinsLayerPresenter$collectGasStations$$inlined$safeCollectIn$3$2$1.L$0 = null;
                gasStationsPinsLayerPresenter$collectGasStations$$inlined$safeCollectIn$3$2$1.L$1 = null;
                gasStationsPinsLayerPresenter$collectGasStations$$inlined$safeCollectIn$3$2$1.L$2 = null;
                gasStationsPinsLayerPresenter$collectGasStations$$inlined$safeCollectIn$3$2$1.label = 2;
            }
        }
        gasStationsPinsLayerPresenter$collectGasStations$$inlined$safeCollectIn$3$2$1 = new GasStationsPinsLayerPresenter$collectGasStations$$inlined$safeCollectIn$3$2$1(this, continuation);
        Object obj22 = gasStationsPinsLayerPresenter$collectGasStations$$inlined$safeCollectIn$3$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gasStationsPinsLayerPresenter$collectGasStations$$inlined$safeCollectIn$3$2$1.label;
        h hVar2 = this.a;
        if (i != 0) {
        }
        gasStationsPinsLayerPresenter$collectGasStations$$inlined$safeCollectIn$3$2$1.L$0 = null;
        gasStationsPinsLayerPresenter$collectGasStations$$inlined$safeCollectIn$3$2$1.L$1 = null;
        gasStationsPinsLayerPresenter$collectGasStations$$inlined$safeCollectIn$3$2$1.L$2 = null;
        gasStationsPinsLayerPresenter$collectGasStations$$inlined$safeCollectIn$3$2$1.label = 2;
    }
}
