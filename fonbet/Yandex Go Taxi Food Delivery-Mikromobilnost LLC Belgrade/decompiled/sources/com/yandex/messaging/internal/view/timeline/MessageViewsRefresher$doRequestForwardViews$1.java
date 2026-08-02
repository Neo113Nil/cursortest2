package com.yandex.messaging.internal.view.timeline;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.messaging.internal.view.timeline.MessageViewsRefresher", f = "MessageViewsRefresher.kt", l = {46, 46}, m = "doRequestForwardViews")
/* loaded from: classes15.dex */
final class MessageViewsRefresher$doRequestForwardViews$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageViewsRefresher$doRequestForwardViews$1(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return m.a(this.this$0, null, 0L, 0L, this);
    }
}
