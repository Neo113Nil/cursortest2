package com.yandex.passport.data.network.core;

import com.yandex.passport.common.network.k0;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.data.network.core.AbstractBackendRequest", f = "AbstractBackendRequest.kt", l = {31, 33}, m = "run-gIAlu-s$suspendImpl")
/* loaded from: classes8.dex */
final class AbstractBackendRequest$run$1<TParams, TResponse, TErrorResponse extends k0, TResult> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractBackendRequest$run$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.e(this.this$0, null, this);
    }
}
