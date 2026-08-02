package com.yandex.go.payments.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.domain.PaymentsInteractorImpl$checkGpayAndMakeRequest$2", f = "PaymentsInteractorImpl.kt", l = {173, 173}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentsInteractorImpl$checkGpayAndMakeRequest$2 extends SuspendLambda implements wls {
    final /* synthetic */ wls $request;
    Object L$0;
    int label;
    final /* synthetic */ l0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentsInteractorImpl$checkGpayAndMakeRequest$2(wls wlsVar, l0 l0Var, Continuation continuation) {
        super(2, continuation);
        this.$request = wlsVar;
        this.this$0 = l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentsInteractorImpl$checkGpayAndMakeRequest$2(this.$request, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentsInteractorImpl$checkGpayAndMakeRequest$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r5 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        wls wlsVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            wlsVar = this.$request;
            com.yandex.go.payments.superapp.payment.a aVar = this.this$0.b;
            this.L$0 = wlsVar;
            this.label = 1;
            obj = aVar.b(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wlsVar = (wls) this.L$0;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.label = 2;
        Object invoke = wlsVar.invoke(obj, this);
        return invoke == coroutineSingletons ? coroutineSingletons : invoke;
    }
}
