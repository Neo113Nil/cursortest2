package com.yandex.messaging.domain.botrequest;

import defpackage.ab6;
import defpackage.cb6;
import defpackage.cn2;
import defpackage.dvw;
import defpackage.goq0;
import defpackage.j18;
import defpackage.lc3;
import defpackage.m8g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r6b;
import defpackage.s020;
import defpackage.tse;
import defpackage.wls;
import defpackage.x08;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.botrequest.SendBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$default$1", f = "SendBotRequestUseCase.kt", l = {113}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class SendBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$default$1 extends SuspendLambda implements wls {
    final /* synthetic */ s020 $chatComponent$inlined;
    final /* synthetic */ goq0 $params$inlined;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$default$1(Continuation continuation, s020 s020Var, goq0 goq0Var) {
        super(2, continuation);
        this.$chatComponent$inlined = s020Var;
        this.$params$inlined = goq0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SendBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$default$1 sendBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$default$1 = new SendBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$default$1(continuation, this.$chatComponent$inlined, this.$params$inlined);
        sendBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$default$1.L$0 = obj;
        return sendBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$default$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SendBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$default$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        x08 x08Var;
        Object fromJson;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        tse tseVar = (tse) this.L$0;
        this.L$0 = tseVar;
        this.label = 1;
        j18 j18Var = new j18(1, dvw.b(this));
        j18Var.u();
        cb6 c = ((m8g) this.$chatComponent$inlined).c();
        JSONObject jSONObject = this.$params$inlined.b;
        r6b r6bVar = new r6b(j18Var, 6);
        r6b r6bVar2 = new r6b(j18Var, 7);
        try {
            fromJson = c.d.fromJson(jSONObject.toString());
        } catch (Exception e) {
            c.c.reportError("bot request invalid json", e);
            x08Var = null;
        }
        if (fromJson == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        x08Var = c.b.f(new ab6(c, fromJson, r6bVar2, r6bVar, 1));
        j18Var.w(new lc3(tseVar, x08Var != null ? new cn2(x08Var, 1) : null, 3));
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
