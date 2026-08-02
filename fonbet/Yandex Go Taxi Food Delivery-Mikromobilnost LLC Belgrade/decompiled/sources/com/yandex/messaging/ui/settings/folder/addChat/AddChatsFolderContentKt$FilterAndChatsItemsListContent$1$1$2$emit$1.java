package com.yandex.messaging.ui.settings.folder.addChat;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.messaging.ui.settings.folder.addChat.AddChatsFolderContentKt$FilterAndChatsItemsListContent$1$1$2", f = "AddChatsFolderContent.kt", l = {361}, m = "emit")
/* loaded from: classes15.dex */
final class AddChatsFolderContentKt$FilterAndChatsItemsListContent$1$1$2$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddChatsFolderContentKt$FilterAndChatsItemsListContent$1$1$2$emit$1(e eVar, Continuation continuation) {
        super(continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
