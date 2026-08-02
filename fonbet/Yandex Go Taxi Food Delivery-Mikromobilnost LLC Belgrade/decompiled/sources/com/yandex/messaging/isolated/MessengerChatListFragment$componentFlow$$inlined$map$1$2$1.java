package com.yandex.messaging.isolated;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.messaging.isolated.MessengerChatListFragment$componentFlow$$inlined$map$1$2", f = "MessengerChatListFragment.kt", l = {50}, m = "emit")
/* loaded from: classes15.dex */
public final class MessengerChatListFragment$componentFlow$$inlined$map$1$2$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerChatListFragment$componentFlow$$inlined$map$1$2$1(f fVar, Continuation continuation) {
        super(continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
