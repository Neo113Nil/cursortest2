package com.yandex.messaging.domain.statuses;

import defpackage.du21;
import defpackage.gu21;
import defpackage.jl40;
import defpackage.k5e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk5e;", "onlineStatusValue", "Lgu21;", "userStatusValue", "<anonymous>", "(Lk5e;Lgu21;)Lgu21;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.statuses.GetCurrentPersonalStatusUseCase$run$2$1", f = "GetCurrentPersonalStatusUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetCurrentPersonalStatusUseCase$run$2$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetCurrentPersonalStatusUseCase$run$2$1 getCurrentPersonalStatusUseCase$run$2$1 = new GetCurrentPersonalStatusUseCase$run$2$1(3, (Continuation) obj3);
        getCurrentPersonalStatusUseCase$run$2$1.L$0 = (k5e) obj;
        getCurrentPersonalStatusUseCase$run$2$1.L$1 = (gu21) obj2;
        return getCurrentPersonalStatusUseCase$run$2$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        k5e k5eVar = (k5e) this.L$0;
        gu21 gu21Var = (gu21) this.L$1;
        if ((jl40.l(k5eVar, k5e.c) || jl40.l(k5eVar, k5e.i) || jl40.l(k5eVar, k5e.f)) || gu21Var.a != StatusAvailability.Default || (gu21Var instanceof du21)) {
            return gu21Var;
        }
        return null;
    }
}
