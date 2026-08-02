package com.yandex.go.payments.domain;

import defpackage.dqh;
import defpackage.h0a0;
import defpackage.kna0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "gPayEnabled", "Loea0;", "<anonymous>", "(Z)Loea0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.domain.PaymentsInteractorImpl$getPaymentModels$2$paymentOptions$1", f = "PaymentsInteractorImpl.kt", l = {50}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentsInteractorImpl$getPaymentModels$2$paymentOptions$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $forceUpdate;
    final /* synthetic */ h0a0 $geoContext;
    final /* synthetic */ String $serviceFeature;
    final /* synthetic */ boolean $withTips;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ l0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentsInteractorImpl$getPaymentModels$2$paymentOptions$1(l0 l0Var, String str, boolean z, h0a0 h0a0Var, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = l0Var;
        this.$serviceFeature = str;
        this.$withTips = z;
        this.$geoContext = h0a0Var;
        this.$forceUpdate = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PaymentsInteractorImpl$getPaymentModels$2$paymentOptions$1 paymentsInteractorImpl$getPaymentModels$2$paymentOptions$1 = new PaymentsInteractorImpl$getPaymentModels$2$paymentOptions$1(this.this$0, this.$serviceFeature, this.$withTips, this.$geoContext, this.$forceUpdate, continuation);
        paymentsInteractorImpl$getPaymentModels$2$paymentOptions$1.Z$0 = ((Boolean) obj).booleanValue();
        return paymentsInteractorImpl$getPaymentModels$2$paymentOptions$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((PaymentsInteractorImpl$getPaymentModels$2$paymentOptions$1) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.go.payments.data.g gVar = (com.yandex.go.payments.data.g) this.this$0.a.a(this.$serviceFeature);
        kna0 kna0Var = new kna0(z, this.$withTips);
        dqh dqhVar = this.this$0.d;
        h0a0 h0a0Var = this.$geoContext;
        boolean z2 = this.$forceUpdate;
        this.Z$0 = z;
        this.label = 1;
        Object e = gVar.e(kna0Var, dqhVar, h0a0Var, z2, this);
        return e == coroutineSingletons ? coroutineSingletons : e;
    }
}
