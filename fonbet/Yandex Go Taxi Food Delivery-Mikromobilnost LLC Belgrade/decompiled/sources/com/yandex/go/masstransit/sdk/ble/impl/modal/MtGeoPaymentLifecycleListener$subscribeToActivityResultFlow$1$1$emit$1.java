package com.yandex.go.masstransit.sdk.ble.impl.modal;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.masstransit.sdk.ble.impl.modal.MtGeoPaymentLifecycleListener$subscribeToActivityResultFlow$1$1", f = "MtGeoPaymentLifecycleListener.kt", l = {70}, m = "emit", v = 2)
/* loaded from: classes12.dex */
final class MtGeoPaymentLifecycleListener$subscribeToActivityResultFlow$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtGeoPaymentLifecycleListener$subscribeToActivityResultFlow$1$1$emit$1(c cVar, Continuation continuation) {
        super(continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
