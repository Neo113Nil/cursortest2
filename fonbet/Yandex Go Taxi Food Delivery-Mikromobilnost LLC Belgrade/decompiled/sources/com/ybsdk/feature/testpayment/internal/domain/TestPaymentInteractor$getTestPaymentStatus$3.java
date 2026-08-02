package com.ybsdk.feature.testpayment.internal.domain;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.ybsdk.feature.testpayment.internal.presentation.TestPaymentPayload;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tq11;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltq11;", "attemptNumber", "Lkotlin/Result;", "Liyd0;", "Llhy0;", "<anonymous>", "(Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.testpayment.internal.domain.TestPaymentInteractor$getTestPaymentStatus$3", f = "TestPaymentInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TestPaymentInteractor$getTestPaymentStatus$3 extends SuspendLambda implements wls {
    final /* synthetic */ TestPaymentPayload $payload;
    final /* synthetic */ String $requestId;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestPaymentInteractor$getTestPaymentStatus$3(b bVar, TestPaymentPayload testPaymentPayload, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$payload = testPaymentPayload;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TestPaymentInteractor$getTestPaymentStatus$3 testPaymentInteractor$getTestPaymentStatus$3 = new TestPaymentInteractor$getTestPaymentStatus$3(this.this$0, this.$payload, this.$requestId, continuation);
        testPaymentInteractor$getTestPaymentStatus$3.I$0 = ((tq11) obj).a;
        return testPaymentInteractor$getTestPaymentStatus$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = ((tq11) obj).a;
        TestPaymentInteractor$getTestPaymentStatus$3 testPaymentInteractor$getTestPaymentStatus$3 = new TestPaymentInteractor$getTestPaymentStatus$3(this.this$0, this.$payload, this.$requestId, (Continuation) obj2);
        testPaymentInteractor$getTestPaymentStatus$3.I$0 = i;
        return testPaymentInteractor$getTestPaymentStatus$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = this.I$0;
            b bVar = this.this$0;
            TestPaymentPayload testPaymentPayload = this.$payload;
            String str = this.$requestId;
            this.label = 1;
            a = b.a(bVar, testPaymentPayload, str, i2, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
