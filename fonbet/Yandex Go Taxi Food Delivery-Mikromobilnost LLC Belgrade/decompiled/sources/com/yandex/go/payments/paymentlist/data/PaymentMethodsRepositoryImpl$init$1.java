package com.yandex.go.payments.paymentlist.data;

import com.yandex.go.payments.paymentlist.domain.PaymentMethodsGeoParamsInteractor$getCacheableByZoneNameGeoParamsFlow$$inlined$withPreviousEmit$1;
import com.yandex.go.payments.paymentlist.domain.f;
import com.yandex.go.payments.paymentlist.domain.h;
import defpackage.f2t;
import defpackage.mdh;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.raa0;
import defpackage.sjh;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.j0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.data.PaymentMethodsRepositoryImpl$init$1", f = "PaymentMethodsRepositoryImpl.kt", l = {173}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class PaymentMethodsRepositoryImpl$init$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsRepositoryImpl$init$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMethodsRepositoryImpl$init$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodsRepositoryImpl$init$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            this.label = 1;
            raa0 raa0Var = cVar.b;
            g I = e.I(e.p(e.n(new f(new mth(new j0(null, new h(((f2t) raa0Var.a).h, raa0Var), new PaymentMethodsGeoParamsInteractor$getCacheableByZoneNameGeoParamsFlow$$inlined$withPreviousEmit$1(3, null)), 6)), new mth(cVar.c.a(), 6), cVar.t, new PaymentMethodsRepositoryImpl$listenForPaymentMethods$2(4, null)), 200L), new PaymentMethodsRepositoryImpl$listenForPaymentMethods$3(cVar, null));
            cVar.i.getClass();
            sjh sjhVar = uyj.a;
            if (e.j(e.F(I, mdh.b), this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
