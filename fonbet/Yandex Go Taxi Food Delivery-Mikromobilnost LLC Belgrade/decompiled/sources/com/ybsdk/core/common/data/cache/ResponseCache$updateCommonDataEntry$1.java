package com.ybsdk.core.common.data.cache;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.core.common.data.cache.ResponseCache", f = "ResponseCache.kt", l = {186}, m = "updateCommonDataEntry-0E7RQCE")
/* loaded from: classes15.dex */
final class ResponseCache$updateCommonDataEntry$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseCache$updateCommonDataEntry$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object n = this.this$0.n(null, null, this);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : new Result(n);
    }
}
