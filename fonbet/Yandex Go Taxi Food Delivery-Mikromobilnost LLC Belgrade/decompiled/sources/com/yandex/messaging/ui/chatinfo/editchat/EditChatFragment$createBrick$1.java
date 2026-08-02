package com.yandex.messaging.ui.chatinfo.editchat;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.messaging.ui.chatinfo.editchat.EditChatFragment", f = "EditChatFragment.kt", l = {17}, m = "createBrick")
/* loaded from: classes15.dex */
public final class EditChatFragment$createBrick$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EditChatFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditChatFragment$createBrick$1(EditChatFragment editChatFragment, Continuation continuation) {
        super(continuation);
        this.this$0 = editChatFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.createBrick(this);
    }
}
