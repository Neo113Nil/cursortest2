package com.yandex.go.navigator.gas_stations.pins_layer;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigator.gas_stations.pins_layer.GasStationsPinsLayerPresenter", f = "GasStationsPinsLayerPresenter.kt", l = {154, ModuleDescriptor.MODULE_VERSION}, m = "awaitCameraSetupForSearchOnArea", v = 2)
/* loaded from: classes12.dex */
final class GasStationsPinsLayerPresenter$awaitCameraSetupForSearchOnArea$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GasStationsPinsLayerPresenter$awaitCameraSetupForSearchOnArea$1(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return h.Kg(this.this$0, this);
    }
}
