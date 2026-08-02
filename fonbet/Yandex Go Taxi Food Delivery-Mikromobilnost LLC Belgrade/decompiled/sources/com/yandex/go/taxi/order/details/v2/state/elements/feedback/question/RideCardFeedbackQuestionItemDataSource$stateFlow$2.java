package com.yandex.go.taxi.order.details.v2.state.elements.feedback.question;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$FeedbackQuestion;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ppa1;
import defpackage.wls;
import defpackage.yjk0;
import defpackage.zjk0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "", "", "<destruct>", "Lzjk0;", "<anonymous>", "(Lkotlin/Pair;)Lzjk0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.feedback.question.RideCardFeedbackQuestionItemDataSource$stateFlow$2", f = "RideCardFeedbackQuestionItemDataSource.kt", l = {35}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardFeedbackQuestionItemDataSource$stateFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ RideCardItemDto$FeedbackQuestion $item;
    int I$0;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardFeedbackQuestionItemDataSource$stateFlow$2(RideCardItemDto$FeedbackQuestion rideCardItemDto$FeedbackQuestion, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$item = rideCardItemDto$FeedbackQuestion;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardFeedbackQuestionItemDataSource$stateFlow$2 rideCardFeedbackQuestionItemDataSource$stateFlow$2 = new RideCardFeedbackQuestionItemDataSource$stateFlow$2(this.$item, this.this$0, continuation);
        rideCardFeedbackQuestionItemDataSource$stateFlow$2.L$0 = obj;
        return rideCardFeedbackQuestionItemDataSource$stateFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardFeedbackQuestionItemDataSource$stateFlow$2) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            int intValue = ((Number) pair.getFirst()).intValue();
            if (!ppa1.c(intValue, this.$item.d)) {
                return new yjk0(this.$item.a);
            }
            a aVar = this.this$0;
            RideCardItemDto$FeedbackQuestion rideCardItemDto$FeedbackQuestion = this.$item;
            this.L$0 = null;
            this.I$0 = intValue;
            this.label = 1;
            obj = a.a(aVar, rideCardItemDto$FeedbackQuestion, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return (zjk0) obj;
    }
}
