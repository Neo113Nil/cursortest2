package com.yandex.messaging.internal.authorized;

import defpackage.el21;
import defpackage.fl21;
import defpackage.k1k;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Lcl21;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.UserComponentHolderKt$userComponentFlow$1", f = "UserComponentHolder.kt", l = {166}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class UserComponentHolderKt$userComponentFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ el21 $this_userComponentFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserComponentHolderKt$userComponentFlow$1(el21 el21Var, Continuation continuation) {
        super(2, continuation);
        this.$this_userComponentFlow = el21Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UserComponentHolderKt$userComponentFlow$1 userComponentHolderKt$userComponentFlow$1 = new UserComponentHolderKt$userComponentFlow$1(this.$this_userComponentFlow, continuation);
        userComponentHolderKt$userComponentFlow$1.L$0 = obj;
        return userComponentHolderKt$userComponentFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserComponentHolderKt$userComponentFlow$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y6f0 y6f0Var = (y6f0) this.L$0;
            k1k k1kVar = new k1k(this.$this_userComponentFlow.f(new fl21(y6f0Var)), 1);
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, k1kVar, this) == coroutineSingletons) {
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
