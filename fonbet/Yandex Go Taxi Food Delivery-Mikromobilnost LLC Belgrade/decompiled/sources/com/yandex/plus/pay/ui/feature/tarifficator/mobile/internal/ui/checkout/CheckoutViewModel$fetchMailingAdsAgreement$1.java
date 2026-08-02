package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.w200;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.CheckoutViewModel$fetchMailingAdsAgreement$1", f = "CheckoutViewModel.kt", l = {303}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CheckoutViewModel$fetchMailingAdsAgreement$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutViewModel$fetchMailingAdsAgreement$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutViewModel$fetchMailingAdsAgreement$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutViewModel$fetchMailingAdsAgreement$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pz40 pz40Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            r0 r0Var = this.this$0.K;
            Boolean bool = Boolean.TRUE;
            r0Var.getClass();
            r0Var.m(null, bool);
            d dVar = this.this$0;
            r0 r0Var2 = dVar.O;
            w200 w200Var = dVar.E;
            this.L$0 = r0Var2;
            this.label = 1;
            obj = w200Var.a.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            pz40Var = r0Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pz40Var = (pz40) this.L$0;
            kotlin.b.b(obj);
        }
        ((r0) pz40Var).l(obj);
        r0 r0Var3 = this.this$0.K;
        Boolean bool2 = Boolean.FALSE;
        r0Var3.getClass();
        r0Var3.m(null, bool2);
        return zy11.a;
    }
}
