package com.yandex.mob.domain;

import defpackage.bms;
import defpackage.go20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oq20;
import defpackage.pr20;
import defpackage.up20;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lpr20;", "proxy", "Lgo20;", "headers", "Loq20;", "query", "Lxl20;", "Lrq20;", "<anonymous>", "(Lpr20;Lgo20;Loq20;)Lxl20;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.domain.NotificationsPollingUseCase$requestNotificationsPolling$response$1", f = "NotificationsPollingUseCase.kt", l = {61, 58}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class NotificationsPollingUseCase$requestNotificationsPolling$response$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsPollingUseCase$requestNotificationsPolling$response$1(q qVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = qVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        NotificationsPollingUseCase$requestNotificationsPolling$response$1 notificationsPollingUseCase$requestNotificationsPolling$response$1 = new NotificationsPollingUseCase$requestNotificationsPolling$response$1(this.this$0, (Continuation) obj4);
        notificationsPollingUseCase$requestNotificationsPolling$response$1.L$0 = (pr20) obj;
        notificationsPollingUseCase$requestNotificationsPolling$response$1.L$1 = (go20) obj2;
        notificationsPollingUseCase$requestNotificationsPolling$response$1.L$2 = (oq20) obj3;
        return notificationsPollingUseCase$requestNotificationsPolling$response$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.yandex.mob.okhttp.b bVar;
        pr20 pr20Var = (pr20) this.L$0;
        go20 go20Var = (go20) this.L$1;
        oq20 oq20Var = (oq20) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            q qVar = this.this$0;
            com.yandex.mob.okhttp.b bVar2 = qVar.a;
            m mVar = qVar.d;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = bVar2;
            this.L$4 = pr20Var;
            this.L$5 = oq20Var;
            this.label = 1;
            obj = mVar.a(go20Var, kotlin.collections.b.f(), this);
            if (obj != coroutineSingletons) {
                bVar = bVar2;
            }
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        oq20Var = (oq20) this.L$5;
        pr20Var = (pr20) this.L$4;
        com.yandex.mob.okhttp.b bVar3 = (com.yandex.mob.okhttp.b) this.L$3;
        kotlin.b.b(obj);
        bVar = bVar3;
        pr20 pr20Var2 = pr20Var;
        oq20 oq20Var2 = oq20Var;
        up20 up20Var = new up20();
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.label = 2;
        Object b = bVar.b(pr20Var2, oq20Var2, (go20) obj, up20Var, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
