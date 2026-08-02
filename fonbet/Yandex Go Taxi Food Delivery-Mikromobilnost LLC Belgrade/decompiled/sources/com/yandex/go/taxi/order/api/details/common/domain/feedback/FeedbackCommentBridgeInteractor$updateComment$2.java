package com.yandex.go.taxi.order.api.details.common.domain.feedback;

import com.yandex.go.taxi.order.models.api.TaxiOrderFeedback;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.api.details.common.domain.feedback.FeedbackCommentBridgeInteractor$updateComment$2", f = "FeedbackCommentBridgeInteractor.kt", l = {29}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class FeedbackCommentBridgeInteractor$updateComment$2 extends SuspendLambda implements wls {
    final /* synthetic */ o2y0 $orderHolder;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackCommentBridgeInteractor$updateComment$2(a aVar, o2y0 o2y0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$orderHolder = o2y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FeedbackCommentBridgeInteractor$updateComment$2(this.this$0, this.$orderHolder, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FeedbackCommentBridgeInteractor$updateComment$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zy11 zy11Var = zy11.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        com.yandex.go.taxi.order.details.v2.domain.feedback.sending.a aVar = this.this$0.b;
        String str = this.$orderHolder.b().a;
        TaxiOrderFeedback taxiOrderFeedback = this.$orderHolder.b().l.W;
        this.label = 1;
        aVar.b(str, taxiOrderFeedback, this);
        return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
