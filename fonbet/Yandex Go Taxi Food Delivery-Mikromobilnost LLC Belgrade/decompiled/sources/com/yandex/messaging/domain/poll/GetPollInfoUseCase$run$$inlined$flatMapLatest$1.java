package com.yandex.messaging.domain.poll;

import com.yandex.messaging.core.net.entities.proto.PollInfoRequest;
import defpackage.bvf0;
import defpackage.cl21;
import defpackage.d9g;
import defpackage.iqr;
import defpackage.jqr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.poll.GetPollInfoUseCase$run$$inlined$flatMapLatest$1", f = "GetPollInfoUseCase.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GetPollInfoUseCase$run$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ PollInfoRequest $pollInfoRequest$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPollInfoUseCase$run$$inlined$flatMapLatest$1(Continuation continuation, PollInfoRequest pollInfoRequest) {
        super(3, continuation);
        this.$pollInfoRequest$inlined = pollInfoRequest;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetPollInfoUseCase$run$$inlined$flatMapLatest$1 getPollInfoUseCase$run$$inlined$flatMapLatest$1 = new GetPollInfoUseCase$run$$inlined$flatMapLatest$1((Continuation) obj3, this.$pollInfoRequest$inlined);
        getPollInfoUseCase$run$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        getPollInfoUseCase$run$$inlined$flatMapLatest$1.L$1 = obj2;
        return getPollInfoUseCase$run$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        vpr vprVar = (vpr) this.L$0;
        c cVar = (c) ((d9g) ((cl21) this.L$1)).K0.get();
        PollInfoRequest pollInfoRequest = this.$pollInfoRequest$inlined;
        ConcurrentHashMap concurrentHashMap = cVar.C;
        Object obj2 = concurrentHashMap.get(pollInfoRequest);
        Object obj3 = obj2;
        if (obj2 == null) {
            r0 c = bvf0.c(null);
            kotlinx.coroutines.flow.e.H(cVar.B, new jqr(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new iqr(c.j(), 1)), new PollInfoRepository$createPollInfoStateFlow$lambda$3$$inlined$flatMapLatest$1(null, cVar, pollInfoRequest, c)), new PollInfoRepository$createPollInfoStateFlow$1$3(c, null), 3));
            Object putIfAbsent = concurrentHashMap.putIfAbsent(pollInfoRequest, c);
            obj3 = c;
            if (putIfAbsent != null) {
                obj3 = putIfAbsent;
            }
        }
        this.label = 1;
        kotlinx.coroutines.flow.e.w(vprVar);
        Object collect = ((tpr) obj3).collect(new h0(vprVar), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
