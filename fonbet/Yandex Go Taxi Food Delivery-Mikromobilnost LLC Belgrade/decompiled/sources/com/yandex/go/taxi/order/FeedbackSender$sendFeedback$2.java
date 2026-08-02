package com.yandex.go.taxi.order;

import com.yandex.go.feedback_common.data.model.FeedbackParam;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/feedback_common/data/model/FeedbackParam;", "param", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/feedback_common/data/model/FeedbackParam;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.FeedbackSender$sendFeedback$2", f = "FeedbackSender.kt", l = {50}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class FeedbackSender$sendFeedback$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackSender$sendFeedback$2(q qVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FeedbackSender$sendFeedback$2 feedbackSender$sendFeedback$2 = new FeedbackSender$sendFeedback$2(this.this$0, continuation);
        feedbackSender$sendFeedback$2.L$0 = obj;
        return feedbackSender$sendFeedback$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FeedbackSender$sendFeedback$2) create((FeedbackParam) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FeedbackParam feedbackParam = (FeedbackParam) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            q qVar = this.this$0;
            String str = feedbackParam.d;
            this.L$0 = null;
            this.label = 1;
            if (q.a(qVar, str, feedbackParam, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
