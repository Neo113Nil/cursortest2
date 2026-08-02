package com.yandex.plus.pay.inapp.google.common.internal.operation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.pay.inapp.google.common.internal.operation.GoogleBillingOperationExtKt", f = "GoogleBillingOperationExt.kt", l = {40}, m = "executeOrThrow")
/* loaded from: classes8.dex */
final class GoogleBillingOperationExtKt$executeOrThrow$1<I, O> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.a(null, null, this);
    }
}
