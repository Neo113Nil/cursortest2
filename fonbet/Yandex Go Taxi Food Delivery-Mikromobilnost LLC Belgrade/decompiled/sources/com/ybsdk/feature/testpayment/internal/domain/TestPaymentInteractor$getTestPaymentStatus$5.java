package com.ybsdk.feature.testpayment.internal.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.testpayment.internal.domain.TestPaymentInteractor", f = "TestPaymentInteractor.kt", l = {HProv.PP_SECURITY_LEVEL, HProv.PP_ENUM_CONTAINER_EXTENSION}, m = "getTestPaymentStatus-6nUVLU0")
/* loaded from: classes3.dex */
final class TestPaymentInteractor$getTestPaymentStatus$5 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestPaymentInteractor$getTestPaymentStatus$5(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = b.a(this.this$0, null, null, 0, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
