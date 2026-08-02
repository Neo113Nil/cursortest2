package com.yandex.go.taxi.order.feedback.ui;

import com.yandex.go.taxi.order.feedback.domain.model.FeedbackQuestionSource;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.experiments.UseFeedbackProposalExperiment;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qn11;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "order", "Lxtq;", "<anonymous>", "(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;)Lxtq;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.feedback.ui.FeedbackViewPresenter$observeFeedbackQuestionUiState$statusInfoFlow$2", f = "FeedbackViewPresenter.kt", l = {275}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class FeedbackViewPresenter$observeFeedbackQuestionUiState$statusInfoFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackViewPresenter$observeFeedbackQuestionUiState$statusInfoFlow$2(k kVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FeedbackViewPresenter$observeFeedbackQuestionUiState$statusInfoFlow$2 feedbackViewPresenter$observeFeedbackQuestionUiState$statusInfoFlow$2 = new FeedbackViewPresenter$observeFeedbackQuestionUiState$statusInfoFlow$2(this.this$0, continuation);
        feedbackViewPresenter$observeFeedbackQuestionUiState$statusInfoFlow$2.L$0 = obj;
        return feedbackViewPresenter$observeFeedbackQuestionUiState$statusInfoFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FeedbackViewPresenter$observeFeedbackQuestionUiState$statusInfoFlow$2) create((TaxiOrder) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        k kVar = this.this$0;
        com.yandex.go.taxi.order.feedback.domain.a aVar = kVar.E;
        String str = kVar.A.b().a;
        FeedbackQuestionSource feedbackQuestionSource = FeedbackQuestionSource.TAXI;
        OrderStatusInfo V = taxiOrder.V();
        V.getClass();
        UseFeedbackProposalExperiment.Companion.getClass();
        qn11 a = com.yandex.go.taxi.order.models.api.experiments.i.a();
        qn11 b = V.b(UseFeedbackProposalExperiment.class);
        if (b != null) {
            a = b;
        }
        boolean z = ((UseFeedbackProposalExperiment) a).d;
        this.L$0 = null;
        this.label = 1;
        Object b2 = aVar.b(str, feedbackQuestionSource, z, this);
        return b2 == coroutineSingletons ? coroutineSingletons : b2;
    }
}
