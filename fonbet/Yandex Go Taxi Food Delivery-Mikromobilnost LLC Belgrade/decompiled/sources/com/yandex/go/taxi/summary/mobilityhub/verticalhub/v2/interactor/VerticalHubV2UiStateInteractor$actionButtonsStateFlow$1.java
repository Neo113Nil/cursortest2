package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.model.ModalState;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ActionButtonsState;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/ActionButtonsState;", "modalState", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/model/ModalState;", "focusRouteVisible", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor.VerticalHubV2UiStateInteractor$actionButtonsStateFlow$1", f = "VerticalHubV2UiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalHubV2UiStateInteractor$actionButtonsStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        VerticalHubV2UiStateInteractor$actionButtonsStateFlow$1 verticalHubV2UiStateInteractor$actionButtonsStateFlow$1 = new VerticalHubV2UiStateInteractor$actionButtonsStateFlow$1(3, (Continuation) obj3);
        verticalHubV2UiStateInteractor$actionButtonsStateFlow$1.L$0 = (ModalState) obj;
        verticalHubV2UiStateInteractor$actionButtonsStateFlow$1.Z$0 = booleanValue;
        return verticalHubV2UiStateInteractor$actionButtonsStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ModalState modalState = (ModalState) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ModalState modalState2 = ModalState.Anchored;
        return (modalState == modalState2 && z) ? ActionButtonsState.BACK_AND_FOCUS_ROUTE : modalState == modalState2 ? ActionButtonsState.ONLY_BACK : ActionButtonsState.HIDDEN;
    }
}
