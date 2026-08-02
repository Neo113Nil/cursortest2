package com.yandex.plus.experiments.api.cache;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.experiments.api.cache.BasePlusExperimentsCache", f = "BasePlusExperimentsCache.kt", l = {16}, m = "getNotExpiredExperiments$suspendImpl")
/* loaded from: classes8.dex */
final class BasePlusExperimentsCache$getNotExpiredExperiments$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePlusExperimentsCache$getNotExpiredExperiments$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.d(this.this$0, this);
    }
}
