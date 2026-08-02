package com.yandex.messaging.domain.poll;

import defpackage.lhs;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llhs;", "it", "Lzy11;", "<anonymous>", "(Llhs;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.poll.PollInfoRepository$createPollInfoStateFlow$1$3", f = "PollInfoRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PollInfoRepository$createPollInfoStateFlow$1$3 extends SuspendLambda implements wls {
    final /* synthetic */ pz40 $this_apply;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollInfoRepository$createPollInfoStateFlow$1$3(pz40 pz40Var, Continuation continuation) {
        super(2, continuation);
        this.$this_apply = pz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PollInfoRepository$createPollInfoStateFlow$1$3 pollInfoRepository$createPollInfoStateFlow$1$3 = new PollInfoRepository$createPollInfoStateFlow$1$3(this.$this_apply, continuation);
        pollInfoRepository$createPollInfoStateFlow$1$3.L$0 = obj;
        return pollInfoRepository$createPollInfoStateFlow$1$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PollInfoRepository$createPollInfoStateFlow$1$3 pollInfoRepository$createPollInfoStateFlow$1$3 = (PollInfoRepository$createPollInfoStateFlow$1$3) create((lhs) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        pollInfoRepository$createPollInfoStateFlow$1$3.invokeSuspend(zy11Var);
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
        ((r0) this.$this_apply).l((lhs) this.L$0);
        return zy11.a;
    }
}
