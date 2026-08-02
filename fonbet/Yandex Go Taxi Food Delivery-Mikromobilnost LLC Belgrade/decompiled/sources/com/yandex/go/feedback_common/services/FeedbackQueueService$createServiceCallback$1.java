package com.yandex.go.feedback_common.services;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.feedback_common.services.FeedbackQueueService", f = "FeedbackQueueService.kt", l = {66}, m = "createServiceCallback", v = 2)
/* loaded from: classes12.dex */
public final class FeedbackQueueService$createServiceCallback$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FeedbackQueueService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackQueueService$createServiceCallback$1(FeedbackQueueService feedbackQueueService, Continuation continuation) {
        super(continuation);
        this.this$0 = feedbackQueueService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object createServiceCallback;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        createServiceCallback = this.this$0.createServiceCallback(this);
        return createServiceCallback;
    }
}
