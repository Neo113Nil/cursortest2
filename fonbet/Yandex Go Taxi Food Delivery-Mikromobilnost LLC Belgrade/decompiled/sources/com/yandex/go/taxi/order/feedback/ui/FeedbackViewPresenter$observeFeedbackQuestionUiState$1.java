package com.yandex.go.taxi.order.feedback.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.xtq;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lxtq;", ClidProvider.STATE, "Lkotlin/Pair;", "", "", "Lcom/yandex/go/feedback_common/data/model/QuestionInfo;", "<unused var>", "<anonymous>", "(Lxtq;Lkotlin/Pair;)Lxtq;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.feedback.ui.FeedbackViewPresenter$observeFeedbackQuestionUiState$1", f = "FeedbackViewPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class FeedbackViewPresenter$observeFeedbackQuestionUiState$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackViewPresenter$observeFeedbackQuestionUiState$1(k kVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = kVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FeedbackViewPresenter$observeFeedbackQuestionUiState$1 feedbackViewPresenter$observeFeedbackQuestionUiState$1 = new FeedbackViewPresenter$observeFeedbackQuestionUiState$1(this.this$0, (Continuation) obj3);
        feedbackViewPresenter$observeFeedbackQuestionUiState$1.L$0 = (xtq) obj;
        return feedbackViewPresenter$observeFeedbackQuestionUiState$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xtq xtqVar = (xtq) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        k kVar = this.this$0;
        return kVar.I.H5(kVar.K) ? xtqVar : xtq.f;
    }
}
