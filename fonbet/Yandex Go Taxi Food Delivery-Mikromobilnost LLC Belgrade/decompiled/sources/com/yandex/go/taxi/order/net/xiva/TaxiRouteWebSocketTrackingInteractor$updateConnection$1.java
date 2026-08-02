package com.yandex.go.taxi.order.net.xiva;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.net.xiva.TaxiRouteWebSocketTrackingInteractor", f = "TaxiRouteWebSocketTrackingInteractor.kt", l = {144}, m = "updateConnection", v = 2)
/* loaded from: classes14.dex */
final class TaxiRouteWebSocketTrackingInteractor$updateConnection$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiRouteWebSocketTrackingInteractor$updateConnection$1(d dVar, Continuation continuation) {
        super(continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return d.b(this.this$0, null, false, this);
    }
}
