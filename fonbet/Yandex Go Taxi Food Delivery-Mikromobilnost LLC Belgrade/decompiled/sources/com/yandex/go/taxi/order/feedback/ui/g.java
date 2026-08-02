package com.yandex.go.taxi.order.feedback.ui;

import defpackage.ksq;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;

    public g(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FeedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$map$1$2$1 feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof FeedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$map$1$2$1) {
            feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$map$1$2$1 = (FeedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$map$1$2$1) continuation;
            int i2 = feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ksq ksqVar = (ksq) obj;
                    Pair pair = new Pair(new Integer(ksqVar.i), ksqVar.l);
                    feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$map$1$2$1.L$0 = null;
                    feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$map$1$2$1.L$1 = null;
                    feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$map$1$2$1.L$2 = null;
                    feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$map$1$2$1.L$3 = null;
                    feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pair, feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$map$1$2$1 = new FeedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$map$1$2$1(this, continuation);
        Object obj22 = feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = feedbackViewPresenter$observeFeedbackQuestionUiState$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
