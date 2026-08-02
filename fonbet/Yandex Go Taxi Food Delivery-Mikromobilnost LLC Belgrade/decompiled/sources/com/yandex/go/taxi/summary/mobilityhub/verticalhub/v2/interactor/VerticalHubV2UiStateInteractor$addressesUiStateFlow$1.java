package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor;

import defpackage.gx0;
import defpackage.mct0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rzu;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgx0;", "icons", "Lmct0;", "model", "Lrzu;", "<anonymous>", "(Lgx0;Lmct0;)Lrzu;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor.VerticalHubV2UiStateInteractor$addressesUiStateFlow$1", f = "VerticalHubV2UiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalHubV2UiStateInteractor$addressesUiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        VerticalHubV2UiStateInteractor$addressesUiStateFlow$1 verticalHubV2UiStateInteractor$addressesUiStateFlow$1 = new VerticalHubV2UiStateInteractor$addressesUiStateFlow$1(3, (Continuation) obj3);
        verticalHubV2UiStateInteractor$addressesUiStateFlow$1.L$0 = (gx0) obj;
        verticalHubV2UiStateInteractor$addressesUiStateFlow$1.L$1 = (mct0) obj2;
        return verticalHubV2UiStateInteractor$addressesUiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gx0 gx0Var = (gx0) this.L$0;
        mct0 mct0Var = (mct0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new rzu(mct0Var, gx0Var);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
