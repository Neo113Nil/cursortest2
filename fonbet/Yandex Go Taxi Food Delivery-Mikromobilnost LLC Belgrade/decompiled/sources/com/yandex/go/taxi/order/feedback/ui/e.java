package com.yandex.go.taxi.order.feedback.ui;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.experiments.UseFeedbackProposalExperiment;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.ny61;
import defpackage.qn11;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;

    public e(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FeedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$filter$1$2$1 feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof FeedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$filter$1$2$1) {
            feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$filter$1$2$1 = (FeedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$filter$1$2$1) continuation;
            int i2 = feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    TaxiOrder taxiOrder = (TaxiOrder) obj;
                    OrderStatusInfo V = taxiOrder.V();
                    V.getClass();
                    UseFeedbackProposalExperiment.Companion.getClass();
                    qn11 a = com.yandex.go.taxi.order.models.api.experiments.i.a();
                    qn11 b = V.b(UseFeedbackProposalExperiment.class);
                    if (b != null) {
                        a = b;
                    }
                    if (((UseFeedbackProposalExperiment) a).c.contains(taxiOrder.h.b)) {
                        feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$filter$1$2$1.L$0 = null;
                        feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$filter$1$2$1.L$1 = null;
                        feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$filter$1$2$1.L$2 = null;
                        feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$filter$1$2$1.L$3 = null;
                        feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$filter$1$2$1.label = 1;
                        if (vprVar.emit(obj, feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$filter$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$filter$1$2$1 = new FeedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
