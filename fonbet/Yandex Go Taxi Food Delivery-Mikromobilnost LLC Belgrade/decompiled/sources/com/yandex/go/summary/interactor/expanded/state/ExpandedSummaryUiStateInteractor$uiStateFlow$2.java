package com.yandex.go.summary.interactor.expanded.state;

import defpackage.cex0;
import defpackage.gpo;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.w0s;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcex0;", "expandedSummaryContentUiState", "Lw0s;", "footerUiState", "Lgpo;", "<anonymous>", "(Lcex0;Lw0s;)Lgpo;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.ExpandedSummaryUiStateInteractor$uiStateFlow$2", f = "ExpandedSummaryUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ExpandedSummaryUiStateInteractor$uiStateFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ExpandedSummaryUiStateInteractor$uiStateFlow$2 expandedSummaryUiStateInteractor$uiStateFlow$2 = new ExpandedSummaryUiStateInteractor$uiStateFlow$2(3, (Continuation) obj3);
        expandedSummaryUiStateInteractor$uiStateFlow$2.L$0 = (cex0) obj;
        expandedSummaryUiStateInteractor$uiStateFlow$2.L$1 = (w0s) obj2;
        return expandedSummaryUiStateInteractor$uiStateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        cex0 cex0Var = (cex0) this.L$0;
        w0s w0sVar = (w0s) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new gpo(cex0Var, w0sVar);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
