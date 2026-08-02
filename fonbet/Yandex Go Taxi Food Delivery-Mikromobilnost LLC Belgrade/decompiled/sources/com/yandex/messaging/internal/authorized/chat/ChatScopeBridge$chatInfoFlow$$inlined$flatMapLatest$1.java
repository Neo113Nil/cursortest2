package com.yandex.messaging.internal.authorized.chat;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.authorized.ChatScopeHolder$chatInfoFlow$$inlined$disposableFlowWrapper$1;
import defpackage.cl21;
import defpackage.d9g;
import defpackage.fi9;
import defpackage.h9b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.chat.ChatScopeBridge$chatInfoFlow$$inlined$flatMapLatest$1", f = "ChatScopeBridge.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class ChatScopeBridge$chatInfoFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ ChatRequest $chatRequest$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatScopeBridge$chatInfoFlow$$inlined$flatMapLatest$1(ChatRequest chatRequest, Continuation continuation) {
        super(3, continuation);
        this.$chatRequest$inlined = chatRequest;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChatScopeBridge$chatInfoFlow$$inlined$flatMapLatest$1 chatScopeBridge$chatInfoFlow$$inlined$flatMapLatest$1 = new ChatScopeBridge$chatInfoFlow$$inlined$flatMapLatest$1(this.$chatRequest$inlined, (Continuation) obj3);
        chatScopeBridge$chatInfoFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        chatScopeBridge$chatInfoFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return chatScopeBridge$chatInfoFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            h9b b = ((d9g) ((cl21) this.L$1)).b();
            ChatRequest chatRequest = this.$chatRequest$inlined;
            b.getClass();
            fi9 i2 = kotlinx.coroutines.flow.e.i(new ChatScopeHolder$chatInfoFlow$$inlined$disposableFlowWrapper$1(null, b, chatRequest));
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(i2, vprVar, this) == coroutineSingletons) {
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
