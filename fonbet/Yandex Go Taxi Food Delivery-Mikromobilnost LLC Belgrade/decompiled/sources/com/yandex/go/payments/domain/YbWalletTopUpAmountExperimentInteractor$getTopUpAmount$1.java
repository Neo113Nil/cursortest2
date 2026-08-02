package com.yandex.go.payments.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.domain.YbWalletTopUpAmountExperimentInteractor", f = "YbWalletTopUpAmountExperimentInteractor.kt", l = {21}, m = "getTopUpAmount", v = 2)
/* loaded from: classes13.dex */
final class YbWalletTopUpAmountExperimentInteractor$getTopUpAmount$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YbWalletTopUpAmountExperimentInteractor$getTopUpAmount$1(r0 r0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
