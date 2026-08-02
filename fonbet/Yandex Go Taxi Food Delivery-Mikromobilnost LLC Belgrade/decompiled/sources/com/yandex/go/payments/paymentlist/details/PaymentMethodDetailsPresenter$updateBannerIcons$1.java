package com.yandex.go.payments.paymentlist.details;

import defpackage.k9a0;
import defpackage.l9a0;
import defpackage.lea0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q4a0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.details.PaymentMethodDetailsPresenter$updateBannerIcons$1", f = "PaymentMethodDetailsPresenter.kt", l = {58}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodDetailsPresenter$updateBannerIcons$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodDetailsPresenter$updateBannerIcons$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMethodDetailsPresenter$updateBannerIcons$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodDetailsPresenter$updateBannerIcons$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            l9a0 l9a0Var = cVar.x;
            lea0 lea0Var = cVar.A;
            this.label = 1;
            obj = ((com.yandex.go.payments.paymentlist.ui.b) l9a0Var).d(lea0Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        k9a0 k9a0Var = (k9a0) obj;
        c cVar2 = this.this$0;
        if (k9a0Var == null) {
            ((q4a0) cVar2.Dg()).Ge();
        } else {
            ((q4a0) cVar2.Dg()).Yd(k9a0Var.e, k9a0Var.g, k9a0Var.d);
        }
        return zy11.a;
    }
}
