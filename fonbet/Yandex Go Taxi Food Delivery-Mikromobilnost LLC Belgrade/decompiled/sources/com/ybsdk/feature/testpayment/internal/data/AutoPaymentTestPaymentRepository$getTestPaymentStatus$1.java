package com.ybsdk.feature.testpayment.internal.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.testpayment.internal.data.AutoPaymentTestPaymentRepository", f = "AutoPaymentTestPaymentRepository.kt", l = {50, 54}, m = "getTestPaymentStatus-6nUVLU0")
/* loaded from: classes3.dex */
final class AutoPaymentTestPaymentRepository$getTestPaymentStatus$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoPaymentTestPaymentRepository$getTestPaymentStatus$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(null, null, 0, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
