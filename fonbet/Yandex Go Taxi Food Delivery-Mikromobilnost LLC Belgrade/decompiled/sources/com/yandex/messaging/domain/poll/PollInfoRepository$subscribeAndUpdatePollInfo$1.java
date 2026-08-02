package com.yandex.messaging.domain.poll;

import com.yandex.messaging.core.net.entities.proto.PollInfoRequest;
import com.yandex.messaging.core.net.entities.proto.PollInfoResponse;
import com.yandex.messaging.internal.entities.PollMessageData;
import defpackage.axd0;
import defpackage.jqr;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.s8x;
import defpackage.tje;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y2e0;
import defpackage.y6f0;
import defpackage.z83;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Llhs;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.poll.PollInfoRepository$subscribeAndUpdatePollInfo$1", f = "PollInfoRepository.kt", l = {MSException.ERROR_NO_MORE_ITEMS}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PollInfoRepository$subscribeAndUpdatePollInfo$1 extends SuspendLambda implements wls {
    final /* synthetic */ PollInfoRequest $pollInfoRequest;
    final /* synthetic */ boolean $shouldFallbackOnLocal;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/PollInfoResponse;", "response", "Lzy11;", "<anonymous>", "(Lcom/yandex/messaging/core/net/entities/proto/PollInfoResponse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.domain.poll.PollInfoRepository$subscribeAndUpdatePollInfo$1$1", f = "PollInfoRepository.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.domain.poll.PollInfoRepository$subscribeAndUpdatePollInfo$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ y6f0 $$this$channelFlow;
        final /* synthetic */ l8x $localPollInfoJob;
        final /* synthetic */ PollInfoRequest $pollInfoRequest;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, PollInfoRequest pollInfoRequest, l8x l8xVar, y6f0 y6f0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$pollInfoRequest = pollInfoRequest;
            this.$localPollInfoJob = l8xVar;
            this.$$this$channelFlow = y6f0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$pollInfoRequest, this.$localPollInfoJob, this.$$this$channelFlow, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((PollInfoResponse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
        
            if (com.yandex.messaging.domain.poll.c.d(r0, r4) != false) goto L8;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            PollInfoResponse pollInfoResponse = (PollInfoResponse) this.L$0;
            PollMessageData pollMessageData = (PollMessageData) this.this$0.D.get(this.$pollInfoRequest);
            if (pollMessageData != null) {
                this.this$0.getClass();
            }
            this.$localPollInfoJob.a(null);
            PollMessageData e = this.this$0.e(this.$pollInfoRequest, pollInfoResponse);
            this.this$0.D.put(this.$pollInfoRequest, e);
            ((x6f0) this.$$this$channelFlow).d(axd0.a(e));
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lcom/yandex/messaging/core/net/entities/proto/PollInfoResponse;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.domain.poll.PollInfoRepository$subscribeAndUpdatePollInfo$1$2", f = "PollInfoRepository.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.domain.poll.PollInfoRepository$subscribeAndUpdatePollInfo$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(3, (Continuation) obj3);
            anonymousClass2.L$0 = (Throwable) obj2;
            zy11 zy11Var = zy11.a;
            anonymousClass2.invokeSuspend(zy11Var);
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
            z83.k(null, (Throwable) this.L$0);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollInfoRepository$subscribeAndUpdatePollInfo$1(boolean z, c cVar, PollInfoRequest pollInfoRequest, Continuation continuation) {
        super(2, continuation);
        this.$shouldFallbackOnLocal = z;
        this.this$0 = cVar;
        this.$pollInfoRequest = pollInfoRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PollInfoRepository$subscribeAndUpdatePollInfo$1 pollInfoRepository$subscribeAndUpdatePollInfo$1 = new PollInfoRepository$subscribeAndUpdatePollInfo$1(this.$shouldFallbackOnLocal, this.this$0, this.$pollInfoRequest, continuation);
        pollInfoRepository$subscribeAndUpdatePollInfo$1.L$0 = obj;
        return pollInfoRepository$subscribeAndUpdatePollInfo$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PollInfoRepository$subscribeAndUpdatePollInfo$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pzt0 pzt0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y6f0 y6f0Var = (y6f0) this.L$0;
            if (this.$shouldFallbackOnLocal) {
                pzt0Var = tje.N(y6f0Var, null, null, new PollInfoRepository$subscribeAndUpdatePollInfo$1$localPollInfoJob$1(this.this$0, this.$pollInfoRequest, y6f0Var, null), 3);
            } else {
                s8x a = kotlinx.coroutines.a.a();
                a.j0();
                pzt0Var = a;
            }
            pzt0 pzt0Var2 = pzt0Var;
            y2e0 y2e0Var = this.this$0.b;
            PollInfoRequest pollInfoRequest = this.$pollInfoRequest;
            long j = axd0.a;
            y2e0Var.getClass();
            o oVar = new o(new jqr(kotlinx.coroutines.flow.e.i(new PollsApi$subscribeForPollInfos$$inlined$cancelableFlowWrapper$1(null, y2e0Var, j, pollInfoRequest)), new AnonymousClass1(this.this$0, this.$pollInfoRequest, pzt0Var2, y6f0Var, null), 3), new AnonymousClass2(3, null));
            PollInfoRepository$subscribeAndUpdatePollInfo$1$invokeSuspend$$inlined$collectWhile$1 pollInfoRepository$subscribeAndUpdatePollInfo$1$invokeSuspend$$inlined$collectWhile$1 = new PollInfoRepository$subscribeAndUpdatePollInfo$1$invokeSuspend$$inlined$collectWhile$1(2, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.z(oVar, pollInfoRepository$subscribeAndUpdatePollInfo$1$invokeSuspend$$inlined$collectWhile$1, this) == coroutineSingletons) {
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
