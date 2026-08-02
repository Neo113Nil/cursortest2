package com.yandex.go.taxi.order.jobs;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.jobs.UpdateOrderStatusJob", f = "UpdateOrderStatusJob.kt", l = {27}, m = "doWork", v = 2)
/* loaded from: classes13.dex */
final class UpdateOrderStatusJob$doWork$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdateOrderStatusJob this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateOrderStatusJob$doWork$1(UpdateOrderStatusJob updateOrderStatusJob, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = updateOrderStatusJob;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
