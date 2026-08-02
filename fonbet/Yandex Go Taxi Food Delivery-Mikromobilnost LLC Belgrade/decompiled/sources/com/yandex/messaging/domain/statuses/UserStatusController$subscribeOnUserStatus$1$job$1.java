package com.yandex.messaging.domain.statuses;

import defpackage.it21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ut21;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lit21;", "it", "Lzy11;", "<anonymous>", "(Lit21;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.statuses.UserStatusController$subscribeOnUserStatus$1$job$1", f = "UserStatusController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class UserStatusController$subscribeOnUserStatus$1$job$1 extends SuspendLambda implements wls {
    final /* synthetic */ y6f0 $$this$channelFlow;
    final /* synthetic */ String $guid;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserStatusController$subscribeOnUserStatus$1$job$1(j jVar, String str, y6f0 y6f0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$guid = str;
        this.$$this$channelFlow = y6f0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UserStatusController$subscribeOnUserStatus$1$job$1 userStatusController$subscribeOnUserStatus$1$job$1 = new UserStatusController$subscribeOnUserStatus$1$job$1(this.this$0, this.$guid, this.$$this$channelFlow, continuation);
        userStatusController$subscribeOnUserStatus$1$job$1.L$0 = obj;
        return userStatusController$subscribeOnUserStatus$1$job$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        UserStatusController$subscribeOnUserStatus$1$job$1 userStatusController$subscribeOnUserStatus$1$job$1 = (UserStatusController$subscribeOnUserStatus$1$job$1) create((it21) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        userStatusController$subscribeOnUserStatus$1$job$1.invokeSuspend(zy11Var);
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
        it21 it21Var = (it21) this.L$0;
        ut21 ut21Var = this.this$0.d;
        Objects.toString(it21Var);
        ut21Var.getClass();
        ((x6f0) this.$$this$channelFlow).d(it21Var);
        return zy11.a;
    }
}
