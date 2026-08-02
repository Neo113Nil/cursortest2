package com.yandex.go.taxi.order;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.FeedbackSender", f = "FeedbackSender.kt", l = {65}, m = "sendFeedback", v = 2)
/* loaded from: classes14.dex */
final class FeedbackSender$sendFeedback$4 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackSender$sendFeedback$4(q qVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return q.a(this.this$0, null, null, this);
    }
}
