package com.yandex.messaging.domain.statuses;

import defpackage.au21;
import defpackage.iz01;
import defpackage.kgx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.statuses.UserStatusSubscriptionManager$UserStatusCall$4", f = "UserStatusSubscriptionManager.kt", l = {HProv.PP_CONTAINER_STATUS}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class UserStatusSubscriptionManager$UserStatusCall$4 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ l this$0;
    final /* synthetic */ au21 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserStatusSubscriptionManager$UserStatusCall$4(l lVar, au21 au21Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.this$1 = au21Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserStatusSubscriptionManager$UserStatusCall$4(this.this$0, this.this$1, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserStatusSubscriptionManager$UserStatusCall$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            long j = this.this$0.b;
            this.label = 1;
            if (kotlinx.coroutines.a.i(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.this$1.c.getClass();
        l lVar = this.this$0;
        kgx[] kgxVarArr = l.z;
        au21 au21Var = lVar.y;
        lVar.a(au21Var.a.a(55L, TimeUnit.SECONDS, new iz01(au21Var, lVar)));
        au21 au21Var2 = this.this$1;
        long j2 = au21Var2.l;
        au21Var2.f.getClass();
        au21Var2.l = Math.max(j2, System.currentTimeMillis() + 1000);
        return zy11.a;
    }
}
