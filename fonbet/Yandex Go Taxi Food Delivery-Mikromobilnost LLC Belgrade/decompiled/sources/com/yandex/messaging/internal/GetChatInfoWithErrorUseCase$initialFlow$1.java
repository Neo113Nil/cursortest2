package com.yandex.messaging.internal;

import com.yandex.messaging.ChatAliasRequest;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.InviteChatRequest;
import com.yandex.messaging.PrivateChatRequest;
import defpackage.j3b;
import defpackage.l3b;
import defpackage.m3b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.xen;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lj3b;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.GetChatInfoWithErrorUseCase$initialFlow$1", f = "GetChatInfoWithErrorUseCase.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetChatInfoWithErrorUseCase$initialFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChatRequest $chat;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetChatInfoWithErrorUseCase$initialFlow$1(e eVar, ChatRequest chatRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$chat = chatRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetChatInfoWithErrorUseCase$initialFlow$1 getChatInfoWithErrorUseCase$initialFlow$1 = new GetChatInfoWithErrorUseCase$initialFlow$1(this.this$0, this.$chat, continuation);
        getChatInfoWithErrorUseCase$initialFlow$1.L$0 = obj;
        return getChatInfoWithErrorUseCase$initialFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetChatInfoWithErrorUseCase$initialFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        l3b l3bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        j3b j3bVar = null;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            e eVar = this.this$0;
            ChatRequest chatRequest = this.$chat;
            m3b m3bVar = eVar.d;
            m3bVar.getClass();
            String id = chatRequest instanceof ExistingChatRequest ? ((ExistingChatRequest) chatRequest).id() : chatRequest instanceof InviteChatRequest ? (String) m3bVar.c.get(((InviteChatRequest) chatRequest).inviteHash()) : chatRequest instanceof PrivateChatRequest ? (String) m3bVar.d.get(((PrivateChatRequest) chatRequest).addressee()) : chatRequest instanceof ChatAliasRequest ? (String) m3bVar.e.get(((ChatAliasRequest) chatRequest).alias()) : chatRequest instanceof SavedMessages ? ((SavedMessages) chatRequest).uniqueRequestId() : null;
            if (id != null && (l3bVar = (l3b) m3bVar.b.get(id)) != null) {
                j3bVar = l3bVar.a;
            }
            if (j3bVar == null) {
                j3bVar = (j3b) eVar.c.B(new xen(16, chatRequest));
            }
            this.label = 1;
            if (vprVar.emit(j3bVar, this) == coroutineSingletons) {
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
