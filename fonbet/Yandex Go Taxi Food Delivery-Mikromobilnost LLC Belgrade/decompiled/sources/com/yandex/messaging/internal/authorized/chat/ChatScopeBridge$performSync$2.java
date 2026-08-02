package com.yandex.messaging.internal.authorized.chat;

import com.yandex.messaging.ChatRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.chat.ChatScopeBridge$performSync$2", f = "ChatScopeBridge.kt", l = {HProv.PP_NK_SYNC, HProv.PP_NK_SYNC}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatScopeBridge$performSync$2 extends SuspendLambda implements wls {
    final /* synthetic */ wls $block;
    final /* synthetic */ ChatRequest $chatRequest;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatScopeBridge$performSync$2(wls wlsVar, b bVar, ChatRequest chatRequest, Continuation continuation) {
        super(2, continuation);
        this.$block = wlsVar;
        this.this$0 = bVar;
        this.$chatRequest = chatRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatScopeBridge$performSync$2(this.$block, this.this$0, this.$chatRequest, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatScopeBridge$performSync$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r6 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        wls wlsVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            wlsVar = this.$block;
            b bVar = this.this$0;
            ChatRequest chatRequest = this.$chatRequest;
            this.L$0 = wlsVar;
            this.label = 1;
            obj = bVar.a(chatRequest, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wlsVar = (wls) this.L$0;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.label = 2;
        Object invoke = wlsVar.invoke(obj, this);
        return invoke == coroutineSingletons ? coroutineSingletons : invoke;
    }
}
