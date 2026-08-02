package com.yandex.go.taxi.order;

import com.yandex.go.feedback_common.data.model.FeedbackParam;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/feedback_common/data/model/FeedbackParam;", "it", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/feedback_common/data/model/FeedbackParam;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.FeedbackSender$sendFeedback$1", f = "FeedbackSender.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class FeedbackSender$sendFeedback$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $orderId;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackSender$sendFeedback$1(q qVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qVar;
        this.$orderId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FeedbackSender$sendFeedback$1(this.this$0, this.$orderId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        FeedbackSender$sendFeedback$1 feedbackSender$sendFeedback$1 = (FeedbackSender$sendFeedback$1) create((FeedbackParam) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        feedbackSender$sendFeedback$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        q qVar = this.this$0;
        TaxiOrder a = qVar.c.a(this.$orderId);
        if (a != null) {
            synchronized (a) {
                TaxiOrderLocalData taxiOrderLocalData = a.l;
                taxiOrderLocalData.getClass();
                a.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -16385, 16777215);
            }
        }
        return zy11.a;
    }
}
