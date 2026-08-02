package com.yandex.go.taxi.order.cancel.similar.view;

import defpackage.j08;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xw4;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.cancel.similar.view.CancelSimilarOrdersPresenter$observeUiState$1", f = "CancelSimilarOrdersPresenter.kt", l = {110}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class CancelSimilarOrdersPresenter$observeUiState$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ j08 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelSimilarOrdersPresenter$observeUiState$1(j08 j08Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = j08Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CancelSimilarOrdersPresenter$observeUiState$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CancelSimilarOrdersPresenter$observeUiState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            g X = e.X(this.this$0.B.a(), new CancelSimilarOrdersPresenter$observeUiState$1$invokeSuspend$$inlined$flatMapLatest$1(this.this$0, null));
            j08 j08Var = this.this$0;
            o oVar = new o(X, new CancelSimilarOrdersPresenter$observeUiState$1$invokeSuspend$$inlined$safeCollect$1(j08Var, null));
            xw4 xw4Var = new xw4(17, j08Var);
            this.L$0 = null;
            this.label = 1;
            if (oVar.collect(xw4Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
