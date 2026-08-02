package com.yandex.messaging.internal;

import defpackage.jft;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyj0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Loyj0;", "Lin21;", "Lcom/yandex/messaging/internal/net/Error;", "it", "Lzy11;", "<anonymous>", "(Loyj0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.GetUserInfoWithErrorUseCase$networkFlow$2", f = "GetUserInfoWithErrorUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetUserInfoWithErrorUseCase$networkFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $guid;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUserInfoWithErrorUseCase$networkFlow$2(a0 a0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = a0Var;
        this.$guid = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetUserInfoWithErrorUseCase$networkFlow$2 getUserInfoWithErrorUseCase$networkFlow$2 = new GetUserInfoWithErrorUseCase$networkFlow$2(this.this$0, this.$guid, continuation);
        getUserInfoWithErrorUseCase$networkFlow$2.L$0 = obj;
        return getUserInfoWithErrorUseCase$networkFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        GetUserInfoWithErrorUseCase$networkFlow$2 getUserInfoWithErrorUseCase$networkFlow$2 = (GetUserInfoWithErrorUseCase$networkFlow$2) create((oyj0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        getUserInfoWithErrorUseCase$networkFlow$2.invokeSuspend(zy11Var);
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
        oyj0 oyj0Var = (oyj0) this.L$0;
        jft jftVar = this.this$0.f;
        jftVar.a.y(this.$guid, oyj0Var);
        return zy11.a;
    }
}
