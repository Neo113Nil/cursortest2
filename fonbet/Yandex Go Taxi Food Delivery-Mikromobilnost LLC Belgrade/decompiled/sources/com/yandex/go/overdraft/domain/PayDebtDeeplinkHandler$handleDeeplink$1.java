package com.yandex.go.overdraft.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.overdraft.domain.PayDebtDeeplinkHandler", f = "PayDebtDeeplinkHandler.kt", l = {25}, m = "handleDeeplink", v = 2)
/* loaded from: classes6.dex */
final class PayDebtDeeplinkHandler$handleDeeplink$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayDebtDeeplinkHandler$handleDeeplink$1(r rVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(this);
    }
}
