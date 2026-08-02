package com.yandex.go.masstransit.sdk.order.impl.activation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.masstransit.sdk.order.impl.activation.TicketActivationScanUiStateInteractor", f = "TicketActivationScanUiStateInteractor.kt", l = {53}, m = "requestPermission", v = 2)
/* loaded from: classes12.dex */
final class TicketActivationScanUiStateInteractor$requestPermission$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketActivationScanUiStateInteractor$requestPermission$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(this);
    }
}
