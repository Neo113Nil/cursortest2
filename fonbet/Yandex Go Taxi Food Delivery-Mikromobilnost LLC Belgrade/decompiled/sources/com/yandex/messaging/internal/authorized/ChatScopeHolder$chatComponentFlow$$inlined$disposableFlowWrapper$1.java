package com.yandex.messaging.internal.authorized;

import com.yandex.messaging.ChatRequest;
import defpackage.h9b;
import defpackage.hn3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tf4;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ly6f0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.ChatScopeHolder$chatComponentFlow$$inlined$disposableFlowWrapper$1", f = "ChatScopeHolder.kt", l = {HProv.ALG_SID_SHA3_256}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class ChatScopeHolder$chatComponentFlow$$inlined$disposableFlowWrapper$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChatRequest $chatRequest$inlined;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ h9b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatScopeHolder$chatComponentFlow$$inlined$disposableFlowWrapper$1(Continuation continuation, h9b h9bVar, ChatRequest chatRequest) {
        super(2, continuation);
        this.this$0 = h9bVar;
        this.$chatRequest$inlined = chatRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatScopeHolder$chatComponentFlow$$inlined$disposableFlowWrapper$1 chatScopeHolder$chatComponentFlow$$inlined$disposableFlowWrapper$1 = new ChatScopeHolder$chatComponentFlow$$inlined$disposableFlowWrapper$1(continuation, this.this$0, this.$chatRequest$inlined);
        chatScopeHolder$chatComponentFlow$$inlined$disposableFlowWrapper$1.L$0 = obj;
        return chatScopeHolder$chatComponentFlow$$inlined$disposableFlowWrapper$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatScopeHolder$chatComponentFlow$$inlined$disposableFlowWrapper$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y6f0 y6f0Var = (y6f0) this.L$0;
            hn3 hn3Var = new hn3(this.this$0.d(this.$chatRequest$inlined, new tf4(y6f0Var, 1)), 1);
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, hn3Var, this) == coroutineSingletons) {
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
