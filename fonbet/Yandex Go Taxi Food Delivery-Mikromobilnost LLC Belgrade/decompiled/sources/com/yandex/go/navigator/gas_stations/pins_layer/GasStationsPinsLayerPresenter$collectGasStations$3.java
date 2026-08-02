package com.yandex.go.navigator.gas_stations.pins_layer;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tus;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/mapkit/directions/driving/DrivingRoute;", "it", "Lzy11;", "<anonymous>", "(Lcom/yandex/mapkit/directions/driving/DrivingRoute;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.gas_stations.pins_layer.GasStationsPinsLayerPresenter$collectGasStations$3", f = "GasStationsPinsLayerPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class GasStationsPinsLayerPresenter$collectGasStations$3 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GasStationsPinsLayerPresenter$collectGasStations$3(h hVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GasStationsPinsLayerPresenter$collectGasStations$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        GasStationsPinsLayerPresenter$collectGasStations$3 gasStationsPinsLayerPresenter$collectGasStations$3 = (GasStationsPinsLayerPresenter$collectGasStations$3) create((DrivingRoute) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        gasStationsPinsLayerPresenter$collectGasStations$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tus tusVar = this.this$0.B;
        tusVar.d = true;
        tusVar.b();
        this.this$0.H.l(Boolean.FALSE);
        return zy11.a;
    }
}
