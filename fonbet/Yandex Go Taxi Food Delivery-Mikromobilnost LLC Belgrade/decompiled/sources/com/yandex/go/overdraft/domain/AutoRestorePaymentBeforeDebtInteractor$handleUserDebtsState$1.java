package com.yandex.go.overdraft.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.overdraft.domain.AutoRestorePaymentBeforeDebtInteractor", f = "AutoRestorePaymentBeforeDebtInteractor.kt", l = {74}, m = "handleUserDebtsState", v = 2)
/* loaded from: classes8.dex */
final class AutoRestorePaymentBeforeDebtInteractor$handleUserDebtsState$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoRestorePaymentBeforeDebtInteractor$handleUserDebtsState$1(b bVar, Continuation continuation) {
        super(continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.i(this.this$0, null, this);
    }
}
