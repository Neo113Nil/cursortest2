package com.yandex.go.summary.interactor.anchored.state;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qzr;
import defpackage.uqf0;
import defpackage.w0s;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Luqf0;", "promoUiState", "Lqzr;", "footerButtonsUiState", "Lw0s;", "<anonymous>", "(Luqf0;Lqzr;)Lw0s;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.anchored.state.FooterUiStateInteractor$uiStateFlow$1", f = "FooterUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class FooterUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FooterUiStateInteractor$uiStateFlow$1 footerUiStateInteractor$uiStateFlow$1 = new FooterUiStateInteractor$uiStateFlow$1(3, (Continuation) obj3);
        footerUiStateInteractor$uiStateFlow$1.L$0 = (uqf0) obj;
        footerUiStateInteractor$uiStateFlow$1.L$1 = (qzr) obj2;
        return footerUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        uqf0 uqf0Var = (uqf0) this.L$0;
        qzr qzrVar = (qzr) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new w0s(true, uqf0Var, qzrVar);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
