package com.yandex.go.inapp_calls.navigation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.inapp_calls.navigation.InAppCallDownloadNotificationRouterImpl", f = "InAppCallDownloadNotificationRouterImpl.kt", l = {119, 120}, m = "waitUntilMainScreenReadyForShowAnything", v = 2)
/* loaded from: classes12.dex */
final class InAppCallDownloadNotificationRouterImpl$waitUntilMainScreenReadyForShowAnything$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppCallDownloadNotificationRouterImpl$waitUntilMainScreenReadyForShowAnything$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.P(this.this$0, this);
    }
}
