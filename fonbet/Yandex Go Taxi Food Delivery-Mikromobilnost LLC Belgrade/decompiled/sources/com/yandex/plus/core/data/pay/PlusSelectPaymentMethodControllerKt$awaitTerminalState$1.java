package com.yandex.plus.core.data.pay;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.core.data.pay.PlusSelectPaymentMethodControllerKt", f = "PlusSelectPaymentMethodController.kt", l = {35}, m = "awaitTerminalState")
/* loaded from: classes2.dex */
final class PlusSelectPaymentMethodControllerKt$awaitTerminalState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.a(null, null, this);
    }
}
