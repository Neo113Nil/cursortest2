package com.yandex.go.taxi.order.feedback.ui;

import defpackage.biz0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.order.view.FeedbackMvpView;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbiz0;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Lbiz0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.feedback.ui.FeedbackViewPresenter$onResume$1", f = "FeedbackViewPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class FeedbackViewPresenter$onResume$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackViewPresenter$onResume$1(k kVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FeedbackViewPresenter$onResume$1 feedbackViewPresenter$onResume$1 = new FeedbackViewPresenter$onResume$1(this.this$0, continuation);
        feedbackViewPresenter$onResume$1.L$0 = obj;
        return feedbackViewPresenter$onResume$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        FeedbackViewPresenter$onResume$1 feedbackViewPresenter$onResume$1 = (FeedbackViewPresenter$onResume$1) create((biz0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        feedbackViewPresenter$onResume$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        biz0 biz0Var = (biz0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ((FeedbackMvpView) this.this$0.Dg()).updateTips(biz0Var);
        return zy11.a;
    }
}
