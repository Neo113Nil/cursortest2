package com.yandex.messaging.internal.displayname;

import com.yandex.messaging.ChatRequest;
import defpackage.d2b;
import defpackage.g92;
import defpackage.i4t;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyh0;
import defpackage.vqb1;
import defpackage.wls;
import defpackage.wwg0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "isSavedMessages", "Ltpr;", "Ld2b;", "<anonymous>", "(Z)Ltpr;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.displayname.ChatViewDataProvider$getChatUiData$1", f = "ChatViewDataProvider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatViewDataProvider$getChatUiData$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $avatarSize;
    final /* synthetic */ ChatRequest $chatRequest;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewDataProvider$getChatUiData$1(a aVar, ChatRequest chatRequest, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$chatRequest = chatRequest;
        this.$avatarSize = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewDataProvider$getChatUiData$1 chatViewDataProvider$getChatUiData$1 = new ChatViewDataProvider$getChatUiData$1(this.this$0, this.$chatRequest, this.$avatarSize, continuation);
        chatViewDataProvider$getChatUiData$1.Z$0 = ((Boolean) obj).booleanValue();
        return chatViewDataProvider$getChatUiData$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((ChatViewDataProvider$getChatUiData$1) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        boolean z = this.Z$0;
        a aVar = this.this$0;
        if (!z) {
            return aVar.b.a(new i4t(this.$chatRequest, this.$avatarSize));
        }
        return new g92(2, new d2b(vqb1.e(wwg0.msg_ic_saved_messages, this.this$0.a), aVar.a.getString(oyh0.messaging_saved_messages_chat), false));
    }
}
