package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.repository.HubContentState;
import defpackage.je31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lje31;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Lje31;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor.VerticalHubV2UiStateInteractor$uiStateFlow$3", f = "VerticalHubV2UiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalHubV2UiStateInteractor$uiStateFlow$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalHubV2UiStateInteractor$uiStateFlow$3(q qVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        VerticalHubV2UiStateInteractor$uiStateFlow$3 verticalHubV2UiStateInteractor$uiStateFlow$3 = new VerticalHubV2UiStateInteractor$uiStateFlow$3(this.this$0, continuation);
        verticalHubV2UiStateInteractor$uiStateFlow$3.L$0 = obj;
        return verticalHubV2UiStateInteractor$uiStateFlow$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        VerticalHubV2UiStateInteractor$uiStateFlow$3 verticalHubV2UiStateInteractor$uiStateFlow$3 = (VerticalHubV2UiStateInteractor$uiStateFlow$3) create((je31) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        verticalHubV2UiStateInteractor$uiStateFlow$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        je31 je31Var = (je31) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.f.h.l(je31Var.f ? HubContentState.LOADING : je31Var.d != null ? HubContentState.ERROR : HubContentState.CONTENT);
        this.this$0.f.c = je31Var.e;
        return zy11.a;
    }
}
