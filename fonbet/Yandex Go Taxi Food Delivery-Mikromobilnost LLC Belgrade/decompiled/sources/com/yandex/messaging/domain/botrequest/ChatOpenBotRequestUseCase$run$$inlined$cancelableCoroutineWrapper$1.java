package com.yandex.messaging.domain.botrequest;

import com.squareup.moshi.JsonAdapter;
import com.yandex.messaging.core.net.entities.MessengerSupportContext;
import com.yandex.messaging.core.net.entities.proto.message.CustomPayload;
import defpackage.cb6;
import defpackage.cn2;
import defpackage.dvw;
import defpackage.i720;
import defpackage.j18;
import defpackage.m8g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r6b;
import defpackage.s020;
import defpackage.tse;
import defpackage.uo3;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.botrequest.ChatOpenBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$1", f = "ChatOpenBotRequestUseCase.kt", l = {113}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class ChatOpenBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$1 extends SuspendLambda implements wls {
    final /* synthetic */ s020 $chatComponent$inlined;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatOpenBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$1(Continuation continuation, s020 s020Var, a aVar) {
        super(2, continuation);
        this.$chatComponent$inlined = s020Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatOpenBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$1 chatOpenBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$1 = new ChatOpenBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$1(continuation, this.$chatComponent$inlined, this.this$0);
        chatOpenBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$1.L$0 = obj;
        return chatOpenBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatOpenBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        a aVar = this.this$0;
        i720 i720Var = aVar.d;
        JsonAdapter adapter = aVar.e.adapter(MessengerSupportContext.class);
        String str = aVar.b.q;
        MessengerSupportContext messengerSupportContext = str != null ? (MessengerSupportContext) adapter.fromJson(str) : null;
        CustomPayload customPayload = new CustomPayload();
        customPayload.event = "chat_open";
        customPayload.setContext(messengerSupportContext);
        customPayload.client = new CustomPayload.Client(i720Var.c, i720Var.c(), i720Var.a(), i720Var.b());
        j18Var.w(new uo3(tseVar, new cn2(c.a(customPayload, null, new r6b(j18Var, 0)), 1), 18));
        Object s = j18Var.s();
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
