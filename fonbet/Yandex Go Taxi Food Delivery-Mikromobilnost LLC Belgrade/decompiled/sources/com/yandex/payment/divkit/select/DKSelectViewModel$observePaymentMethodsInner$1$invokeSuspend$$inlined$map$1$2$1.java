package com.yandex.payment.divkit.select;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.payment.divkit.select.DKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2", f = "DKSelectViewModel.kt", l = {239, 244, 219}, m = "emit", v = 1)
/* loaded from: classes2.dex */
public final class DKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1(g gVar, Continuation continuation) {
        super(continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
