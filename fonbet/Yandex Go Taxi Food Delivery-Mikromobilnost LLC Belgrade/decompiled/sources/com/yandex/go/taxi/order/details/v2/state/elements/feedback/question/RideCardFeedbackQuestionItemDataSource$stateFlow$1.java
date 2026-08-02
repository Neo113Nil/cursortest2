package com.yandex.go.taxi.order.details.v2.state.elements.feedback.question;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderFeedbackQuestionInfoState;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "it", "Lcom/yandex/go/taxi/order/models/api/TaxiOrder;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.feedback.question.RideCardFeedbackQuestionItemDataSource$stateFlow$1", f = "RideCardFeedbackQuestionItemDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardFeedbackQuestionItemDataSource$stateFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardFeedbackQuestionItemDataSource$stateFlow$1 rideCardFeedbackQuestionItemDataSource$stateFlow$1 = new RideCardFeedbackQuestionItemDataSource$stateFlow$1(2, continuation);
        rideCardFeedbackQuestionItemDataSource$stateFlow$1.L$0 = obj;
        return rideCardFeedbackQuestionItemDataSource$stateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardFeedbackQuestionItemDataSource$stateFlow$1) create((TaxiOrder) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TaxiOrderFeedbackQuestionInfoState taxiOrderFeedbackQuestionInfoState;
        TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        Integer num = new Integer(taxiOrder.s());
        List list = taxiOrder.l.getW().h;
        if (list != null && (taxiOrderFeedbackQuestionInfoState = (TaxiOrderFeedbackQuestionInfoState) kotlin.collections.a.R(list)) != null) {
            str = taxiOrderFeedbackQuestionInfoState.b;
        }
        return new Pair(num, str);
    }
}
