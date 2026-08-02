package com.yandex.messaging.internal.view.chat;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.ct21;
import defpackage.io9;
import defpackage.iyj0;
import defpackage.j3b;
import defpackage.mvg;
import defpackage.myj0;
import defpackage.ny61;
import defpackage.oyj0;
import defpackage.r3z;
import defpackage.w511;
import defpackage.wls;
import defpackage.y4a0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Loyj0;", "Lj3b;", "Lcom/yandex/messaging/internal/net/Error;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "<anonymous>", "(Loyj0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.chat.ChatPinnedMessageBrick$onBrickAttach$1", f = "ChatPinnedMessageBrick.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatPinnedMessageBrick$onBrickAttach$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPinnedMessageBrick$onBrickAttach$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatPinnedMessageBrick$onBrickAttach$1 chatPinnedMessageBrick$onBrickAttach$1 = new ChatPinnedMessageBrick$onBrickAttach$1(this.this$0, continuation);
        chatPinnedMessageBrick$onBrickAttach$1.L$0 = obj;
        return chatPinnedMessageBrick$onBrickAttach$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChatPinnedMessageBrick$onBrickAttach$1 chatPinnedMessageBrick$onBrickAttach$1 = (ChatPinnedMessageBrick$onBrickAttach$1) create((oyj0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chatPinnedMessageBrick$onBrickAttach$1.invokeSuspend(zy11Var);
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
        oyj0 oyj0Var = (oyj0) this.L$0;
        c cVar = this.this$0;
        if (oyj0Var instanceof myj0) {
            cVar.L = (j3b) ((myj0) oyj0Var).a;
            cVar.r();
            y4a0 y4a0Var = cVar.K;
            if (y4a0Var != null) {
                ((r3z) y4a0Var.b).a(new io9(cVar));
            }
        } else {
            if (!(oyj0Var instanceof iyj0)) {
                w511.b();
                return null;
            }
            cVar.L = null;
            ct21 ct21Var = cVar.N;
            if (ct21Var != null) {
                ct21Var.close();
            }
            cVar.N = null;
            cVar.M = false;
            cVar.r();
        }
        return zy11.a;
    }
}
