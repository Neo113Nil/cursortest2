package com.yandex.messaging.miniapps.js.listeners;

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
@mvg(c = "com.yandex.messaging.miniapps.js.listeners.MiniAppHiddenListener$handle$1", f = "MiniAppHiddenListener.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class MiniAppHiddenListener$handle$1 extends SuspendLambda implements wls {
    final /* synthetic */ JSONObject $payload;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppHiddenListener$handle$1(b bVar, JSONObject jSONObject, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$payload = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MiniAppHiddenListener$handle$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MiniAppHiddenListener$handle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            com.yandex.messaging.domain.botrequest.e eVar = bVar.b;
            goq0 goq0Var = new goq0(bVar.a, this.$payload);
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
        if (((zy11) oyj0Var.b()) != null) {
            this.this$0.c.reportEvent("miniapp_hidden");
        }
        if (((zy11) oyj0Var.a()) != null) {
            this.this$0.c.reportError("miniapp_hidden_bot_request_error", null);
        }
        return zy11.a;
    }
}
