package com.yandex.go.summary.interactor.anchored.state;

import defpackage.a72;
import defpackage.dms;
import defpackage.jtz0;
import defpackage.m8u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q62;
import defpackage.w0s;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lm8u0;", "statusBarUiState", "Ljtz0;", "toolbarUiState", "Lq62;", "anchoredSummaryContentUiState", "Lw0s;", "footerUiState", "La72;", "<anonymous>", "(Lm8u0;Ljtz0;Lq62;Lw0s;)La72;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.anchored.state.AnchoredSummaryUiStateInteractor$uiStateFlow$1", f = "AnchoredSummaryUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class AnchoredSummaryUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        AnchoredSummaryUiStateInteractor$uiStateFlow$1 anchoredSummaryUiStateInteractor$uiStateFlow$1 = new AnchoredSummaryUiStateInteractor$uiStateFlow$1(5, (Continuation) obj5);
        anchoredSummaryUiStateInteractor$uiStateFlow$1.L$0 = (m8u0) obj;
        anchoredSummaryUiStateInteractor$uiStateFlow$1.L$1 = (jtz0) obj2;
        anchoredSummaryUiStateInteractor$uiStateFlow$1.L$2 = (q62) obj3;
        anchoredSummaryUiStateInteractor$uiStateFlow$1.L$3 = (w0s) obj4;
        return anchoredSummaryUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        m8u0 m8u0Var = (m8u0) this.L$0;
        jtz0 jtz0Var = (jtz0) this.L$1;
        q62 q62Var = (q62) this.L$2;
        w0s w0sVar = (w0s) this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new a72(m8u0Var, jtz0Var, q62Var, w0sVar);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
