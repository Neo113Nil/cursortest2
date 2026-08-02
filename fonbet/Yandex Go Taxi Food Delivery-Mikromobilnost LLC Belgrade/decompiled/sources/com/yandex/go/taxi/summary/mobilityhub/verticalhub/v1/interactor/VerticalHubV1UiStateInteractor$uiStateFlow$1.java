package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.interactor;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.ActionButtonsState;
import defpackage.ems;
import defpackage.f0v;
import defpackage.h0s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rc31;
import defpackage.sc31;
import defpackage.scc;
import defpackage.szu;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lszu;", "addressesUiState", "", "Lob31;", "verticals", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/ui/ActionButtonsState;", "actionButtonsState", "Lh0s;", "shadowState", "Lsc31;", "offersState", "Lrc31;", "<anonymous>", "(Lszu;Ljava/util/List;Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/ui/ActionButtonsState;Lh0s;Lsc31;)Lrc31;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.interactor.VerticalHubV1UiStateInteractor$uiStateFlow$1", f = "VerticalHubV1UiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalHubV1UiStateInteractor$uiStateFlow$1 extends SuspendLambda implements ems {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ Object L$4;
    int label;

    public VerticalHubV1UiStateInteractor$uiStateFlow$1(Continuation continuation) {
        super(6, continuation);
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        VerticalHubV1UiStateInteractor$uiStateFlow$1 verticalHubV1UiStateInteractor$uiStateFlow$1 = new VerticalHubV1UiStateInteractor$uiStateFlow$1((Continuation) obj6);
        verticalHubV1UiStateInteractor$uiStateFlow$1.L$0 = (szu) obj;
        verticalHubV1UiStateInteractor$uiStateFlow$1.L$1 = (List) obj2;
        verticalHubV1UiStateInteractor$uiStateFlow$1.L$2 = (ActionButtonsState) obj3;
        verticalHubV1UiStateInteractor$uiStateFlow$1.L$3 = (h0s) obj4;
        verticalHubV1UiStateInteractor$uiStateFlow$1.L$4 = (sc31) obj5;
        return verticalHubV1UiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        szu szuVar = (szu) this.L$0;
        List list = (List) this.L$1;
        ActionButtonsState actionButtonsState = (ActionButtonsState) this.L$2;
        h0s h0sVar = (h0s) this.L$3;
        sc31 sc31Var = (sc31) this.L$4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new rc31(actionButtonsState, kotlin.collections.a.m0(sc31Var.a, scc.g(szuVar, new f0v(list))), h0sVar, sc31Var.b, sc31Var.c);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
