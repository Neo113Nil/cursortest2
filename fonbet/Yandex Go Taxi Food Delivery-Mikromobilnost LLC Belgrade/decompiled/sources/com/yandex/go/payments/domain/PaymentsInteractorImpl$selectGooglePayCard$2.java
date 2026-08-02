package com.yandex.go.payments.domain;

import defpackage.lvt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zut;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.domain.PaymentsInteractorImpl$selectGooglePayCard$2", f = "PaymentsInteractorImpl.kt", l = {108, 109}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentsInteractorImpl$selectGooglePayCard$2 extends SuspendLambda implements wls {
    final /* synthetic */ zut $bindTokenParams;
    final /* synthetic */ lvt $requestParams;
    int label;
    final /* synthetic */ l0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentsInteractorImpl$selectGooglePayCard$2(l0 l0Var, lvt lvtVar, zut zutVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = l0Var;
        this.$requestParams = lvtVar;
        this.$bindTokenParams = zutVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentsInteractorImpl$selectGooglePayCard$2(this.this$0, this.$requestParams, this.$bindTokenParams, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentsInteractorImpl$selectGooglePayCard$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        if (r5.c(r1, r4) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.payments.superapp.payment.a aVar = this.this$0.b;
            lvt lvtVar = this.$requestParams;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        com.yandex.go.payments.superapp.payment.a aVar2 = this.this$0.b;
        zut zutVar = this.$bindTokenParams;
        this.label = 2;
        Object y = kotlinx.coroutines.flow.e.y(aVar2.a.k(zutVar), this);
        return y == coroutineSingletons ? coroutineSingletons : y;
    }
}
