package com.yandex.passport.data.network.core;

import com.yandex.passport.common.network.k0;
import com.yandex.passport.data.network.core.q;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.data.network.core.MasterTokenBackendRequest", f = "MasterTokenBackendRequest.kt", l = {65, 66}, m = "run-gIAlu-s$suspendImpl")
/* loaded from: classes15.dex */
final class MasterTokenBackendRequest$run$1<TParams extends q, TResponse, TErrorResponse extends k0, TResult> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterTokenBackendRequest$run$1(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return n.g(this.this$0, null, this);
    }
}
