package com.yandex.messaging.internal.authorized.chat;

import android.os.Looper;
import com.yandex.messaging.ChatRequest;
import defpackage.d1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s020;
import defpackage.wls;
import defpackage.z83;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls020;", "component", "Lzy11;", "<anonymous>", "(Ls020;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.chat.ChatScopeBridge$chatComponentFlow$2", f = "ChatScopeBridge.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatScopeBridge$chatComponentFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ ChatRequest $chatRequest;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatScopeBridge$chatComponentFlow$2(b bVar, ChatRequest chatRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$chatRequest = chatRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatScopeBridge$chatComponentFlow$2 chatScopeBridge$chatComponentFlow$2 = new ChatScopeBridge$chatComponentFlow$2(this.this$0, this.$chatRequest, continuation);
        chatScopeBridge$chatComponentFlow$2.L$0 = obj;
        return chatScopeBridge$chatComponentFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChatScopeBridge$chatComponentFlow$2 chatScopeBridge$chatComponentFlow$2 = (ChatScopeBridge$chatComponentFlow$2) create((s020) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chatScopeBridge$chatComponentFlow$2.invokeSuspend(zy11Var);
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
        s020 s020Var = (s020) this.L$0;
        z83.g(null, this.this$0.a.get(), Looper.myLooper());
        b bVar = this.this$0;
        bVar.h.post(new d1(18, bVar, this.$chatRequest, s020Var));
        return zy11.a;
    }
}
