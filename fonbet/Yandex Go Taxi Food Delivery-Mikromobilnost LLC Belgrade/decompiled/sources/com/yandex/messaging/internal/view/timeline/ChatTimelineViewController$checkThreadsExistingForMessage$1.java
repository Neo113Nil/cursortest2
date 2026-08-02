package com.yandex.messaging.internal.view.timeline;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.messaging.internal.view.timeline.ChatTimelineViewController", f = "ChatTimelineViewController.kt", l = {545}, m = "checkThreadsExistingForMessage")
/* loaded from: classes15.dex */
final class ChatTimelineViewController$checkThreadsExistingForMessage$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatTimelineViewController$checkThreadsExistingForMessage$1(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return i.q(this.this$0, null, this);
    }
}
