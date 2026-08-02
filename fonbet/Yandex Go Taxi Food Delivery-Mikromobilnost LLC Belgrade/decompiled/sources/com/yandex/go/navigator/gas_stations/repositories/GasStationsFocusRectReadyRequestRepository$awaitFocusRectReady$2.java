package com.yandex.go.navigator.gas_stations.repositories;

import com.yandex.go.navigator.gas_stations.repositories.GasStationsFocusRectReadyRequestRepository;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/yandex/go/navigator/gas_stations/repositories/GasStationsFocusRectReadyRequestRepository$FocusRectStatus;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigator.gas_stations.repositories.GasStationsFocusRectReadyRequestRepository$awaitFocusRectReady$2", f = "GasStationsFocusRectReadyRequestRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class GasStationsFocusRectReadyRequestRepository$awaitFocusRectReady$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GasStationsFocusRectReadyRequestRepository$awaitFocusRectReady$2 gasStationsFocusRectReadyRequestRepository$awaitFocusRectReady$2 = new GasStationsFocusRectReadyRequestRepository$awaitFocusRectReady$2(2, continuation);
        gasStationsFocusRectReadyRequestRepository$awaitFocusRectReady$2.L$0 = obj;
        return gasStationsFocusRectReadyRequestRepository$awaitFocusRectReady$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GasStationsFocusRectReadyRequestRepository$awaitFocusRectReady$2) create((GasStationsFocusRectReadyRequestRepository.FocusRectStatus) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GasStationsFocusRectReadyRequestRepository.FocusRectStatus focusRectStatus = (GasStationsFocusRectReadyRequestRepository.FocusRectStatus) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(focusRectStatus == GasStationsFocusRectReadyRequestRepository.FocusRectStatus.READY);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
