package com.yandex.go.payments.cards.domainverification.domain;

import defpackage.j831;
import defpackage.jv5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp731;", "<anonymous>", "()Lp731;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.cards.domainverification.domain.DomainBoundPaymentMethodVerifier$verify$2", f = "DomainBoundPaymentMethodVerifier.kt", l = {45}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class DomainBoundPaymentMethodVerifier$verify$2 extends SuspendLambda implements tls {
    final /* synthetic */ jv5 $context;
    final /* synthetic */ j831 $param;
    final /* synthetic */ boolean $required3dsPolling;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DomainBoundPaymentMethodVerifier$verify$2(a aVar, jv5 jv5Var, j831 j831Var, boolean z, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$context = jv5Var;
        this.$param = j831Var;
        this.$required3dsPolling = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DomainBoundPaymentMethodVerifier$verify$2(this.this$0, this.$context, this.$param, this.$required3dsPolling, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((DomainBoundPaymentMethodVerifier$verify$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        jv5 jv5Var = this.$context;
        j831 j831Var = this.$param;
        boolean z = this.$required3dsPolling;
        this.label = 1;
        Object b = a.b(aVar, jv5Var, j831Var, z, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
