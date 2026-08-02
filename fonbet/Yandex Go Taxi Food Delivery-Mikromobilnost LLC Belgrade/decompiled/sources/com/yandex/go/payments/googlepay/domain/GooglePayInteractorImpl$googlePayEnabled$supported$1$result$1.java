package com.yandex.go.payments.googlepay.domain;

import com.google.android.gms.wallet.IsReadyToPayRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rma0;
import defpackage.tse;
import defpackage.wls;
import defpackage.wut;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.googlepay.domain.GooglePayInteractorImpl$googlePayEnabled$supported$1$result$1", f = "GooglePayInteractorImpl.kt", l = {152}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class GooglePayInteractorImpl$googlePayEnabled$supported$1$result$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayInteractorImpl$googlePayEnabled$supported$1$result$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GooglePayInteractorImpl$googlePayEnabled$supported$1$result$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GooglePayInteractorImpl$googlePayEnabled$supported$1$result$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        e eVar = this.this$0;
        wut wutVar = eVar.a;
        rma0 rma0Var = eVar.r;
        com.google.android.gms.wallet.b newBuilder = IsReadyToPayRequest.newBuilder();
        newBuilder.b(2);
        newBuilder.c(false);
        IsReadyToPayRequest isReadyToPayRequest = newBuilder.a;
        this.label = 1;
        wutVar.getClass();
        Object a = wut.a(rma0Var, isReadyToPayRequest, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
