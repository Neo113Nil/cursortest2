package com.ybsdk.feature.testpayment.internal.domain;

import defpackage.mvg;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.testpayment.internal.domain.TestPaymentInteractor", f = "TestPaymentInteractor.kt", l = {112, BuildConfig.API_LEVEL}, m = "initiateTestPayment-0E7RQCE")
/* loaded from: classes3.dex */
final class TestPaymentInteractor$initiateTestPayment$5 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestPaymentInteractor$initiateTestPayment$5(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = b.b(this.this$0, null, null, this);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : new Result(b);
    }
}
