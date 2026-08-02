package com.yandex.go.feedback_common.services;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00060\u0001R\u00020\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lztq;", "Lcom/yandex/go/feedback_common/services/FeedbackQueueService;", "<anonymous>", "(Ltse;)Lztq;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.feedback_common.services.FeedbackQueueService$executeNext$serviceCallback$1$1", f = "FeedbackQueueService.kt", l = {40}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class FeedbackQueueService$executeNext$serviceCallback$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ FeedbackQueueService $this_run;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackQueueService$executeNext$serviceCallback$1$1(FeedbackQueueService feedbackQueueService, Continuation continuation) {
        super(2, continuation);
        this.$this_run = feedbackQueueService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FeedbackQueueService$executeNext$serviceCallback$1$1(this.$this_run, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FeedbackQueueService$executeNext$serviceCallback$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object createServiceCallback;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        FeedbackQueueService feedbackQueueService = this.$this_run;
        this.label = 1;
        createServiceCallback = feedbackQueueService.createServiceCallback(this);
        return createServiceCallback == coroutineSingletons ? coroutineSingletons : createServiceCallback;
    }
}
