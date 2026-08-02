package com.yandex.go.navigator.gas_stations.pins_layer;

import com.yandex.go.navigator.gas_stations.repositories.GasStationsFocusRectReadyRequestRepository;
import defpackage.fi6;
import defpackage.gh00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.gas_stations.pins_layer.GasStationsPinsLayerPresenter$moveCameraToSelectedGasStation$2", f = "GasStationsPinsLayerPresenter.kt", l = {203}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class GasStationsPinsLayerPresenter$moveCameraToSelectedGasStation$2 extends SuspendLambda implements wls {
    final /* synthetic */ fi6 $bboxBuilder;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GasStationsPinsLayerPresenter$moveCameraToSelectedGasStation$2(h hVar, fi6 fi6Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$bboxBuilder = fi6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GasStationsPinsLayerPresenter$moveCameraToSelectedGasStation$2(this.this$0, this.$bboxBuilder, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GasStationsPinsLayerPresenter$moveCameraToSelectedGasStation$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            GasStationsFocusRectReadyRequestRepository gasStationsFocusRectReadyRequestRepository = this.this$0.L;
            this.label = 1;
            if (gasStationsFocusRectReadyRequestRepository.m(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ((gh00) this.this$0.D).A(this.$bboxBuilder.g(), null);
        return zy11.a;
    }
}
