package com.yandex.go.call_order_fallback.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.call_order_fallback.domain.CallOrderFallbackInteractor", f = "CallOrderFallbackInteractor.kt", l = {90}, m = "payload", v = 2)
/* loaded from: classes12.dex */
final class CallOrderFallbackInteractor$payload$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallOrderFallbackInteractor$payload$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.b(this.this$0, this);
    }
}
