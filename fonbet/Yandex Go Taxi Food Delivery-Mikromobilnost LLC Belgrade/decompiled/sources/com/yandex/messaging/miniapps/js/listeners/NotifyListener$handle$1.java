package com.yandex.messaging.miniapps.js.listeners;

import defpackage.dqv;
import defpackage.goq0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyj0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.miniapps.js.listeners.NotifyListener$handle$1", f = "NotifyListener.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class NotifyListener$handle$1 extends SuspendLambda implements wls {
    final /* synthetic */ JSONObject $botRequestPayload;
    final /* synthetic */ dqv $message;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotifyListener$handle$1(c cVar, JSONObject jSONObject, dqv dqvVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$botRequestPayload = jSONObject;
        this.$message = dqvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NotifyListener$handle$1(this.this$0, this.$botRequestPayload, this.$message, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NotifyListener$handle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            com.yandex.messaging.domain.botrequest.e eVar = cVar.f;
            goq0 goq0Var = new goq0(cVar.e, this.$botRequestPayload);
            this.label = 1;
            obj = eVar.a(goq0Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        oyj0 oyj0Var = (oyj0) obj;
        if (((zy11) oyj0Var.a()) != null) {
            c cVar2 = this.this$0;
            dqv dqvVar = this.$message;
            cVar2.j.c("csat_notify_error", "messageId", dqvVar.d);
            cVar2.h.a(cVar2.i.a(dqvVar.d));
        }
        if (((zy11) oyj0Var.b()) != null) {
            c cVar3 = this.this$0;
            dqv dqvVar2 = this.$message;
            cVar3.j.c("csat_notify_success", "messageId", dqvVar2.d);
            cVar3.h.a(cVar3.i.c(dqvVar2.d));
        }
        return zy11.a;
    }
}
