package com.yandex.go.navigator.gas_stations.pins_layer;

import defpackage.tje;
import defpackage.uyj;
import defpackage.wls;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class GasStationsPinsLayerPresenter$collectGasStations$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Object invoke(List list, Continuation continuation) {
        h hVar = (h) this.receiver;
        hVar.E.getClass();
        return tje.k0(uyj.a, new GasStationsPinsLayerPresenter$mapGeoObjectToGasStationsPinsLayerContent$2(list, hVar, null), continuation);
    }
}
