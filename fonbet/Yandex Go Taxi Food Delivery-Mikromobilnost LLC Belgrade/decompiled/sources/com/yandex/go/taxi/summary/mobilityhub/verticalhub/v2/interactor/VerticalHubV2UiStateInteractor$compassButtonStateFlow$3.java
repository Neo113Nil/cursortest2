package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.model.ModalState;
import defpackage.hwc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "azimuth", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/model/ModalState;", "modalState", "Lhwc;", "<anonymous>", "(FLcom/yandex/go/taxi/summary/mobilityhub/verticalhub/model/ModalState;)Lhwc;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor.VerticalHubV2UiStateInteractor$compassButtonStateFlow$3", f = "VerticalHubV2UiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalHubV2UiStateInteractor$compassButtonStateFlow$3 extends SuspendLambda implements zls {
    /* synthetic */ float F$0;
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj).floatValue();
        VerticalHubV2UiStateInteractor$compassButtonStateFlow$3 verticalHubV2UiStateInteractor$compassButtonStateFlow$3 = new VerticalHubV2UiStateInteractor$compassButtonStateFlow$3(3, (Continuation) obj3);
        verticalHubV2UiStateInteractor$compassButtonStateFlow$3.F$0 = floatValue;
        verticalHubV2UiStateInteractor$compassButtonStateFlow$3.L$0 = (ModalState) obj2;
        return verticalHubV2UiStateInteractor$compassButtonStateFlow$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f = this.F$0;
        ModalState modalState = (ModalState) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new hwc(f != 0.0f && modalState == ModalState.Anchored, f);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
