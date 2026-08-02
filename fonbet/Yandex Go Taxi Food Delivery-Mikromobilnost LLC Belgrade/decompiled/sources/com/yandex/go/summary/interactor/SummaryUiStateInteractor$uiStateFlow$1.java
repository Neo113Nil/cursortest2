package com.yandex.go.summary.interactor;

import defpackage.aiv0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ug00;
import defpackage.zls;
import defpackage.zqv0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lug00;", "mapContentUiState", "Laiv0;", "summaryModalBottomSheetUiState", "Lzqv0;", "<anonymous>", "(Lug00;Laiv0;)Lzqv0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.SummaryUiStateInteractor$uiStateFlow$1", f = "SummaryUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SummaryUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SummaryUiStateInteractor$uiStateFlow$1 summaryUiStateInteractor$uiStateFlow$1 = new SummaryUiStateInteractor$uiStateFlow$1(3, (Continuation) obj3);
        summaryUiStateInteractor$uiStateFlow$1.L$0 = (ug00) obj;
        summaryUiStateInteractor$uiStateFlow$1.L$1 = (aiv0) obj2;
        return summaryUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ug00 ug00Var = (ug00) this.L$0;
        aiv0 aiv0Var = (aiv0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return new zqv0(ug00Var, aiv0Var);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
