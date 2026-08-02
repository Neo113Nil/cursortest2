package com.yandex.messaging.domain.poll;

import com.yandex.messaging.core.net.entities.proto.PollInfoRequest;
import defpackage.a80;
import defpackage.cn2;
import defpackage.kse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.x2e0;
import defpackage.y2e0;
import defpackage.y6f0;
import defpackage.zy11;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ly6f0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.poll.PollsApi$subscribeForPollInfos$$inlined$cancelableFlowWrapper$1", f = "PollsApi.kt", l = {HProv.ALG_SID_SHA3_256}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class PollsApi$subscribeForPollInfos$$inlined$cancelableFlowWrapper$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $pollingIntervalMillis$inlined;
    final /* synthetic */ PollInfoRequest $request$inlined;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ y2e0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollsApi$subscribeForPollInfos$$inlined$cancelableFlowWrapper$1(Continuation continuation, y2e0 y2e0Var, long j, PollInfoRequest pollInfoRequest) {
        super(2, continuation);
        this.this$0 = y2e0Var;
        this.$pollingIntervalMillis$inlined = j;
        this.$request$inlined = pollInfoRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PollsApi$subscribeForPollInfos$$inlined$cancelableFlowWrapper$1 pollsApi$subscribeForPollInfos$$inlined$cancelableFlowWrapper$1 = new PollsApi$subscribeForPollInfos$$inlined$cancelableFlowWrapper$1(continuation, this.this$0, this.$pollingIntervalMillis$inlined, this.$request$inlined);
        pollsApi$subscribeForPollInfos$$inlined$cancelableFlowWrapper$1.L$0 = obj;
        return pollsApi$subscribeForPollInfos$$inlined$cancelableFlowWrapper$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PollsApi$subscribeForPollInfos$$inlined$cancelableFlowWrapper$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y6f0 y6f0Var = (y6f0) this.L$0;
            kse.a(this.this$0.c);
            a80 a80Var = new a80(24, new cn2(this.this$0.a.a(this.$pollingIntervalMillis$inlined, TimeUnit.MILLISECONDS, new x2e0(this.$request$inlined, y6f0Var)), 1));
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, a80Var, this) == coroutineSingletons) {
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
