package com.yandex.go.preorder.payments;

import com.yandex.go.payments.api.GooglePayInteractor$GooglePayTokenResult;
import defpackage.hxx;
import defpackage.kda0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pep0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/payments/api/GooglePayInteractor$GooglePayTokenResult;", "it", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/payments/api/GooglePayInteractor$GooglePayTokenResult;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preorder.payments.GooglePayTaxiOrderInteractorImpl$selectGooglePayCard$2", f = "GooglePayTaxiOrderInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class GooglePayTaxiOrderInteractorImpl$selectGooglePayCard$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayTaxiOrderInteractorImpl$selectGooglePayCard$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GooglePayTaxiOrderInteractorImpl$selectGooglePayCard$2 googlePayTaxiOrderInteractorImpl$selectGooglePayCard$2 = new GooglePayTaxiOrderInteractorImpl$selectGooglePayCard$2(this.this$0, continuation);
        googlePayTaxiOrderInteractorImpl$selectGooglePayCard$2.L$0 = obj;
        return googlePayTaxiOrderInteractorImpl$selectGooglePayCard$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        GooglePayTaxiOrderInteractorImpl$selectGooglePayCard$2 googlePayTaxiOrderInteractorImpl$selectGooglePayCard$2 = (GooglePayTaxiOrderInteractorImpl$selectGooglePayCard$2) create((GooglePayInteractor$GooglePayTokenResult) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        googlePayTaxiOrderInteractorImpl$selectGooglePayCard$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GooglePayInteractor$GooglePayTokenResult googlePayInteractor$GooglePayTokenResult = (GooglePayInteractor$GooglePayTokenResult) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (googlePayInteractor$GooglePayTokenResult == GooglePayInteractor$GooglePayTokenResult.ERROR) {
            a aVar = this.this$0;
            ((pep0) aVar.c).f((m950) aVar.b.get(), kda0.a, hxx.a);
        }
        return zy11.a;
    }
}
