package com.yandex.messaging.internal.authorized.textsuggest;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.messaging.internal.authorized.textsuggest.ChatTextSuggestController", f = "ChatTextSuggestController.kt", l = {128, HProv.PP_CONTAINER_DEFAULT}, m = "sendFakeQuery")
/* loaded from: classes15.dex */
final class ChatTextSuggestController$sendFakeQuery$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatTextSuggestController$sendFakeQuery$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.b(this.this$0, null, this);
    }
}
