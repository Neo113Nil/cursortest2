package com.yandex.go.taxi.order.net.xiva;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.net.xiva.WebSocketTrackerDataSource$remoteDataFlow$$inlined$filterIsInstance$1", f = "WebSocketTrackerDataSource.kt", l = {112}, m = "collect", v = 2)
/* loaded from: classes14.dex */
public final class WebSocketTrackerDataSource$remoteDataFlow$$inlined$filterIsInstance$1$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketTrackerDataSource$remoteDataFlow$$inlined$filterIsInstance$1$1(k kVar, Continuation continuation) {
        super(continuation);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
