package com.yandex.go.shortcuts.impl.notifications;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.shortcuts.impl.notifications.SendClickedProductsJob", f = "SendClickedProductsJob.kt", l = {18, 19}, m = "doWork", v = 2)
/* loaded from: classes12.dex */
final class SendClickedProductsJob$doWork$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SendClickedProductsJob this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendClickedProductsJob$doWork$1(SendClickedProductsJob sendClickedProductsJob, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = sendClickedProductsJob;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
