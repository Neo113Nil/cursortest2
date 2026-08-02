package com.yandex.messaging.user;

import com.yandex.messaging.internal.authorized.online.a;
import defpackage.cl21;
import defpackage.d9g;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pvn;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.user.GetUserOnlineStatusUseCase$getUserOnlineStatusFlow$$inlined$flatMapLatest$1", f = "GetUserOnlineStatusUseCase.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GetUserOnlineStatusUseCase$getUserOnlineStatusFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ String $userId$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUserOnlineStatusUseCase$getUserOnlineStatusFlow$$inlined$flatMapLatest$1(String str, Continuation continuation) {
        super(3, continuation);
        this.$userId$inlined = str;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetUserOnlineStatusUseCase$getUserOnlineStatusFlow$$inlined$flatMapLatest$1 getUserOnlineStatusUseCase$getUserOnlineStatusFlow$$inlined$flatMapLatest$1 = new GetUserOnlineStatusUseCase$getUserOnlineStatusFlow$$inlined$flatMapLatest$1(this.$userId$inlined, (Continuation) obj3);
        getUserOnlineStatusUseCase$getUserOnlineStatusFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        getUserOnlineStatusUseCase$getUserOnlineStatusFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return getUserOnlineStatusUseCase$getUserOnlineStatusFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            cl21 cl21Var = (cl21) this.L$1;
            tpr a = jl40.l(this.$userId$inlined, ((d9g) cl21Var).a.a) ? pvn.a : ((a) ((d9g) cl21Var).u0.get()).a(this.$userId$inlined);
            this.label = 1;
            if (e.u(a, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
