package com.yandex.messaging.domain.poll;

import com.yandex.messaging.core.net.entities.proto.PollInfoRequest;
import defpackage.cn2;
import defpackage.dvw;
import defpackage.j18;
import defpackage.kse;
import defpackage.lc3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w2e0;
import defpackage.wls;
import defpackage.x08;
import defpackage.y2e0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.poll.PollsApi$fetchPollInfo$$inlined$cancelableCoroutineWrapper$default$1", f = "PollsApi.kt", l = {113}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class PollsApi$fetchPollInfo$$inlined$cancelableCoroutineWrapper$default$1 extends SuspendLambda implements wls {
    final /* synthetic */ PollInfoRequest $request$inlined;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ y2e0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollsApi$fetchPollInfo$$inlined$cancelableCoroutineWrapper$default$1(Continuation continuation, y2e0 y2e0Var, PollInfoRequest pollInfoRequest) {
        super(2, continuation);
        this.this$0 = y2e0Var;
        this.$request$inlined = pollInfoRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PollsApi$fetchPollInfo$$inlined$cancelableCoroutineWrapper$default$1 pollsApi$fetchPollInfo$$inlined$cancelableCoroutineWrapper$default$1 = new PollsApi$fetchPollInfo$$inlined$cancelableCoroutineWrapper$default$1(continuation, this.this$0, this.$request$inlined);
        pollsApi$fetchPollInfo$$inlined$cancelableCoroutineWrapper$default$1.L$0 = obj;
        return pollsApi$fetchPollInfo$$inlined$cancelableCoroutineWrapper$default$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PollsApi$fetchPollInfo$$inlined$cancelableCoroutineWrapper$default$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        tse tseVar = (tse) this.L$0;
        this.L$0 = tseVar;
        this.label = 1;
        j18 j18Var = new j18(1, dvw.b(this));
        j18Var.u();
        kse.a(this.this$0.c);
        x08 f = this.this$0.b.f(new w2e0(this.$request$inlined, j18Var));
        j18Var.w(new lc3(tseVar, f != null ? new cn2(f, 1) : null, 2));
        Object s = j18Var.s();
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
