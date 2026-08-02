package com.yandex.go.payments.paymentlist.domain;

import com.yandex.go.payments.data.p;
import defpackage.jca0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.nfh;
import defpackage.ny61;
import defpackage.ocz;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.domain.PaymentMethodsListPresenter$attachView$2", f = "PaymentMethodsListPresenter.kt", l = {549}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class PaymentMethodsListPresenter$attachView$2 extends SuspendLambda implements wls {
    final /* synthetic */ jca0 $mvpView;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsListPresenter$attachView$2(k kVar, jca0 jca0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$mvpView = jca0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMethodsListPresenter$attachView$2(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodsListPresenter$attachView$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            nfh nfhVar = this.this$0.K;
            p pVar = (p) nfhVar.c;
            tpr F = kotlinx.coroutines.flow.e.F(new b(new mth(new j0(null, kotlinx.coroutines.flow.e.p(new m0(pVar.a(), pVar.b(), new AnnounceCompositePaymentStateInteractor$getFlow$1(3, null)), 100L), new AnnounceCompositePaymentStateInteractor$getFlow$$inlined$withPreviousEmit$1(3, null)), 6), nfhVar), uyj.a);
            jca0 jca0Var = this.$mvpView;
            kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(F, new PaymentMethodsListPresenter$attachView$2$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            ocz oczVar = new ocz(22, jca0Var);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(oczVar, this) == coroutineSingletons) {
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
