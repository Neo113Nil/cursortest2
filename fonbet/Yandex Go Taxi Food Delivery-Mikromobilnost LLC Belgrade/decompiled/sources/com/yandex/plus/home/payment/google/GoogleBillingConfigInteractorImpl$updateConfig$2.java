package com.yandex.plus.home.payment.google;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ldtt;", "<anonymous>", "()Ldtt;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.payment.google.GoogleBillingConfigInteractorImpl$updateConfig$2", f = "GoogleBillingConfigInteractorImpl.kt", l = {21}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class GoogleBillingConfigInteractorImpl$updateConfig$2 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleBillingConfigInteractorImpl$updateConfig$2(a aVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new GoogleBillingConfigInteractorImpl$updateConfig$2(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((GoogleBillingConfigInteractorImpl$updateConfig$2) create((Continuation) obj)).invokeSuspend(zy11.a);
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
        a aVar = this.this$0;
        this.label = 1;
        Object a = a.a(aVar, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
