package com.yandex.messaging.domain.poll;

import com.yandex.messaging.core.net.entities.proto.PollInfoResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "it", "", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.poll.PollInfoRepository$subscribeAndUpdatePollInfo$1$invokeSuspend$$inlined$collectWhile$1", f = "PollInfoRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class PollInfoRepository$subscribeAndUpdatePollInfo$1$invokeSuspend$$inlined$collectWhile$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PollInfoRepository$subscribeAndUpdatePollInfo$1$invokeSuspend$$inlined$collectWhile$1 pollInfoRepository$subscribeAndUpdatePollInfo$1$invokeSuspend$$inlined$collectWhile$1 = new PollInfoRepository$subscribeAndUpdatePollInfo$1$invokeSuspend$$inlined$collectWhile$1(2, continuation);
        pollInfoRepository$subscribeAndUpdatePollInfo$1$invokeSuspend$$inlined$collectWhile$1.L$0 = obj;
        return pollInfoRepository$subscribeAndUpdatePollInfo$1$invokeSuspend$$inlined$collectWhile$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PollInfoRepository$subscribeAndUpdatePollInfo$1$invokeSuspend$$inlined$collectWhile$1) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(((PollInfoResponse) this.L$0).getResults().isCompleted);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
