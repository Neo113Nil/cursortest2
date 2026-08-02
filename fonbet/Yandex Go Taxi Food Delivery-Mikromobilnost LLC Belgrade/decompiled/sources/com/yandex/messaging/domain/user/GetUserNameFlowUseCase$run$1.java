package com.yandex.messaging.domain.user;

import defpackage.in21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lin21;", "userInfo", "", "currentOrgId", "Lqp21;", "<anonymous>", "(Lin21;J)Lqp21;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.user.GetUserNameFlowUseCase$run$1", f = "GetUserNameFlowUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetUserNameFlowUseCase$run$1 extends SuspendLambda implements zls {
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUserNameFlowUseCase$run$1(b bVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long longValue = ((Number) obj2).longValue();
        GetUserNameFlowUseCase$run$1 getUserNameFlowUseCase$run$1 = new GetUserNameFlowUseCase$run$1(this.this$0, (Continuation) obj3);
        getUserNameFlowUseCase$run$1.L$0 = (in21) obj;
        getUserNameFlowUseCase$run$1.J$0 = longValue;
        return getUserNameFlowUseCase$run$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        return this.this$0.d.a((in21) this.L$0, this.J$0);
    }
}
