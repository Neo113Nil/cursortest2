package com.yandex.go.payments.acceptance.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.video.m3.ott.data.net.impl.ConcurrencyArbiterApiImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.acceptance.domain.AcceptancePaymentController", f = "AcceptancePaymentController.kt", l = {366, 389, ConcurrencyArbiterApiImpl.RESPONSE_CODE_418}, m = "handleTerminalStatus", v = 2)
/* loaded from: classes13.dex */
final class AcceptancePaymentController$handleTerminalStatus$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcceptancePaymentController$handleTerminalStatus$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, null, null, this);
    }
}
