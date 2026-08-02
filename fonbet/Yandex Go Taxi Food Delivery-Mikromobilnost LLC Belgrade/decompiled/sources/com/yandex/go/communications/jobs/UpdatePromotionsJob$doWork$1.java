package com.yandex.go.communications.jobs;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.communications.jobs.UpdatePromotionsJob", f = "UpdatePromotionsJob.kt", l = {15}, m = "doWork", v = 2)
/* loaded from: classes12.dex */
final class UpdatePromotionsJob$doWork$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdatePromotionsJob this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatePromotionsJob$doWork$1(UpdatePromotionsJob updatePromotionsJob, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = updatePromotionsJob;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
