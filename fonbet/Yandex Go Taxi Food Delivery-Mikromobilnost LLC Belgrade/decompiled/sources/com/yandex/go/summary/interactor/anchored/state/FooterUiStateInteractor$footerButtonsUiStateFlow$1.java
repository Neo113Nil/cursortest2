package com.yandex.go.summary.interactor.anchored.state;

import defpackage.bms;
import defpackage.dj70;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.phx0;
import defpackage.q1a0;
import defpackage.qzr;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lq1a0;", "paymentInfoButtonUiState", "Ldj70;", "orderButtonUiState", "Lphx0;", "tariffOptionsButtonUiState", "Lqzr;", "<anonymous>", "(Lq1a0;Ldj70;Lphx0;)Lqzr;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.anchored.state.FooterUiStateInteractor$footerButtonsUiStateFlow$1", f = "FooterUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class FooterUiStateInteractor$footerButtonsUiStateFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        FooterUiStateInteractor$footerButtonsUiStateFlow$1 footerUiStateInteractor$footerButtonsUiStateFlow$1 = new FooterUiStateInteractor$footerButtonsUiStateFlow$1(4, (Continuation) obj4);
        footerUiStateInteractor$footerButtonsUiStateFlow$1.L$0 = (q1a0) obj;
        footerUiStateInteractor$footerButtonsUiStateFlow$1.L$1 = (dj70) obj2;
        footerUiStateInteractor$footerButtonsUiStateFlow$1.L$2 = (phx0) obj3;
        return footerUiStateInteractor$footerButtonsUiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        q1a0 q1a0Var = (q1a0) this.L$0;
        dj70 dj70Var = (dj70) this.L$1;
        phx0 phx0Var = (phx0) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new qzr(q1a0Var, dj70Var, phx0Var);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
