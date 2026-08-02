package com.yandex.messaging.domain.statuses;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.n1f;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.x6t;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.statuses.GetDisplayUserStatusUseCase$run$$inlined$flatMapLatest$1", f = "GetDisplayUserStatusUseCase.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GetDisplayUserStatusUseCase$run$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ tpr $onlineStatus$inlined;
    final /* synthetic */ x6t $params$inlined;
    final /* synthetic */ tpr $userStatus$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDisplayUserStatusUseCase$run$$inlined$flatMapLatest$1(Continuation continuation, x6t x6tVar, e eVar, tpr tprVar, tpr tprVar2) {
        super(3, continuation);
        this.$params$inlined = x6tVar;
        this.this$0 = eVar;
        this.$onlineStatus$inlined = tprVar;
        this.$userStatus$inlined = tprVar2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetDisplayUserStatusUseCase$run$$inlined$flatMapLatest$1 getDisplayUserStatusUseCase$run$$inlined$flatMapLatest$1 = new GetDisplayUserStatusUseCase$run$$inlined$flatMapLatest$1((Continuation) obj3, this.$params$inlined, this.this$0, this.$onlineStatus$inlined, this.$userStatus$inlined);
        getDisplayUserStatusUseCase$run$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        getDisplayUserStatusUseCase$run$$inlined$flatMapLatest$1.L$1 = obj2;
        return getDisplayUserStatusUseCase$run$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr n1fVar;
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
        boolean l = jl40.l((String) this.L$1, this.$params$inlined.a);
        e eVar = this.this$0;
        if (l) {
            x6t x6tVar = this.$params$inlined;
            eVar.getClass();
            x6tVar.getClass();
            n1fVar = new n1f(15, eVar.c.a(zy11Var), eVar);
        } else {
            tpr tprVar = this.$onlineStatus$inlined;
            tpr tprVar2 = this.$userStatus$inlined;
            eVar.getClass();
            n1fVar = new m0(tprVar, tprVar2, new GetDisplayUserStatusUseCase$getDisplayStatusForNonSelfUser$1(3, null));
        }
        this.label = 1;
        return kotlinx.coroutines.flow.e.u(n1fVar, vprVar, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
