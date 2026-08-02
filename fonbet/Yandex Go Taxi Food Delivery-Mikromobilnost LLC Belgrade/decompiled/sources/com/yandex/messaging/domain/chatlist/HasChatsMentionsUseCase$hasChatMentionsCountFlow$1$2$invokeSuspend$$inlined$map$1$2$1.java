package com.yandex.messaging.domain.chatlist;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.messaging.domain.chatlist.HasChatsMentionsUseCase$hasChatMentionsCountFlow$1$2$invokeSuspend$$inlined$map$1$2", f = "HasChatsMentionsUseCase.kt", l = {50}, m = "emit")
/* loaded from: classes15.dex */
public final class HasChatsMentionsUseCase$hasChatMentionsCountFlow$1$2$invokeSuspend$$inlined$map$1$2$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HasChatsMentionsUseCase$hasChatMentionsCountFlow$1$2$invokeSuspend$$inlined$map$1$2$1(b bVar, Continuation continuation) {
        super(continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
