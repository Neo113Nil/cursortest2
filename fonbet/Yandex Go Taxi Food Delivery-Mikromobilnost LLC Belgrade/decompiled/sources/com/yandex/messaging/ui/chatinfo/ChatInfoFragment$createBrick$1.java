package com.yandex.messaging.ui.chatinfo;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.messaging.ui.chatinfo.ChatInfoFragment", f = "ChatInfoFragment.kt", l = {17}, m = "createBrick")
/* loaded from: classes15.dex */
public final class ChatInfoFragment$createBrick$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatInfoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInfoFragment$createBrick$1(ChatInfoFragment chatInfoFragment, Continuation continuation) {
        super(continuation);
        this.this$0 = chatInfoFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.createBrick(this);
    }
}
