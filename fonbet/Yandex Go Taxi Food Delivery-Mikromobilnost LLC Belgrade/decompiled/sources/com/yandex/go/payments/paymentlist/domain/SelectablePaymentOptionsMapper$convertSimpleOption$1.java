package com.yandex.go.payments.paymentlist.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.paymentlist.domain.SelectablePaymentOptionsMapper", f = "SelectablePaymentOptionsMapper.kt", l = {800, 802}, m = "convertSimpleOption", v = 2)
/* loaded from: classes8.dex */
final class SelectablePaymentOptionsMapper$convertSimpleOption$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectablePaymentOptionsMapper$convertSimpleOption$1(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(null, null, null, null, null, false, null, this);
    }
}
