package com.yandex.go.taxi.order.feedback.domain;

import com.yandex.go.taxi.order.feedback.data.FeedbackSurveyApi;
import com.yandex.go.taxi.order.feedback.data.model.FeedbackProposalParam;
import com.yandex.go.taxi.order.feedback.data.model.FeedbackProposalResponse;
import com.yandex.go.taxi.order.feedback.data.model.SurveyAnswerOption;
import com.yandex.go.taxi.order.feedback.data.model.SurveyQuestion;
import com.yandex.go.taxi.order.feedback.domain.model.FeedbackQuestionSource;
import defpackage.cmt;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.on2;
import defpackage.qrq;
import defpackage.tcc;
import defpackage.xtq;
import defpackage.zn1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a {
    public final i3y a;

    public a(on2 on2Var) {
        this.a = kotlin.a.a(new zn1(on2Var, 18));
    }

    public static xtq a(FeedbackProposalResponse feedbackProposalResponse, boolean z) {
        if (feedbackProposalResponse.a.isEmpty()) {
            return xtq.f;
        }
        SurveyQuestion surveyQuestion = (SurveyQuestion) feedbackProposalResponse.a.get(0);
        List A0 = z ? surveyQuestion.c : kotlin.collections.a.A0(surveyQuestion.c, 2);
        String str = surveyQuestion.a;
        String str2 = surveyQuestion.b;
        List<SurveyAnswerOption> list = A0;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (SurveyAnswerOption surveyAnswerOption : list) {
            arrayList.add(new qrq(surveyAnswerOption.a, surveyAnswerOption.b));
        }
        return new xtq(8, str, str2, arrayList, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, FeedbackQuestionSource feedbackQuestionSource, boolean z, ContinuationImpl continuationImpl) {
        FeedbackQuestionInteractor$obtainQualityQuestion$1 feedbackQuestionInteractor$obtainQualityQuestion$1;
        int i;
        try {
            if (continuationImpl instanceof FeedbackQuestionInteractor$obtainQualityQuestion$1) {
                feedbackQuestionInteractor$obtainQualityQuestion$1 = (FeedbackQuestionInteractor$obtainQualityQuestion$1) continuationImpl;
                int i2 = feedbackQuestionInteractor$obtainQualityQuestion$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    feedbackQuestionInteractor$obtainQualityQuestion$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = feedbackQuestionInteractor$obtainQualityQuestion$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = feedbackQuestionInteractor$obtainQualityQuestion$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<FeedbackProposalResponse> a = ((FeedbackSurveyApi) this.a.getValue()).a(feedbackQuestionSource.getPath(), new FeedbackProposalParam(str));
                        feedbackQuestionInteractor$obtainQualityQuestion$1.L$0 = null;
                        feedbackQuestionInteractor$obtainQualityQuestion$1.L$1 = null;
                        feedbackQuestionInteractor$obtainQualityQuestion$1.Z$0 = z;
                        feedbackQuestionInteractor$obtainQualityQuestion$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.a(a, null, feedbackQuestionInteractor$obtainQualityQuestion$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = feedbackQuestionInteractor$obtainQualityQuestion$1.Z$0;
                        kotlin.b.b(obj);
                    }
                    return a((FeedbackProposalResponse) obj, z);
                }
            }
            if (i != 0) {
            }
            return a((FeedbackProposalResponse) obj, z);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return xtq.f;
        }
        feedbackQuestionInteractor$obtainQualityQuestion$1 = new FeedbackQuestionInteractor$obtainQualityQuestion$1(this, continuationImpl);
        Object obj2 = feedbackQuestionInteractor$obtainQualityQuestion$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = feedbackQuestionInteractor$obtainQualityQuestion$1.label;
    }
}
