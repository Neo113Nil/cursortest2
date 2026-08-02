package com.yandex.payment.divkit.select;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.payment.divkit.select.DKSelectViewModelRefactor$observePaymentMethods$1$1", f = "DKSelectViewModelRefactor.kt", l = {249}, m = "emit", v = 1)
/* loaded from: classes2.dex */
final class DKSelectViewModelRefactor$observePaymentMethods$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKSelectViewModelRefactor$observePaymentMethods$1$1$emit$1(l lVar, Continuation continuation) {
        super(continuation);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
