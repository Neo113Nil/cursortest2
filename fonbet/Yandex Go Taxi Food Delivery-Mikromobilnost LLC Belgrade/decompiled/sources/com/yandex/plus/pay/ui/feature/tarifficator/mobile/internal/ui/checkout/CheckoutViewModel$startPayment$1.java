package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import com.yandex.plus.pay.internal.model.PlusPayMailingAdsAgreement;
import defpackage.a7b;
import defpackage.bob;
import defpackage.dod0;
import defpackage.hod0;
import defpackage.ind0;
import defpackage.iod0;
import defpackage.jod0;
import defpackage.kod0;
import defpackage.l7b;
import defpackage.m3v0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w200;
import defpackage.w511;
import defpackage.wls;
import defpackage.x0u0;
import defpackage.y0u0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.CheckoutViewModel$startPayment$1", f = "CheckoutViewModel.kt", l = {372, 384, 388}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CheckoutViewModel$startPayment$1 extends SuspendLambda implements wls {
    final /* synthetic */ ind0 $scenarioContext;
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutViewModel$startPayment$1(d dVar, ind0 ind0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$scenarioContext = ind0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutViewModel$startPayment$1(this.this$0, this.$scenarioContext, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutViewModel$startPayment$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        if (r12 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        if (r12 == r0) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            r0 r0Var = this.this$0.L;
            bob bobVar = new bob(null, false);
            r0Var.getClass();
            r0Var.m(null, bobVar);
            d dVar = this.this$0;
            dod0 dod0Var = dVar.A;
            ind0 ind0Var = this.$scenarioContext;
            a7b a7bVar = new a7b(12, dVar, ind0Var);
            l7b l7bVar = new l7b(11, dVar);
            this.label = 1;
            obj = ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.b) dod0Var).a(ind0Var, a7bVar, l7bVar, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    ((m3v0) this.this$0.B).e();
                    return zy11Var;
                }
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        kod0 kod0Var = (kod0) obj;
        this.this$0.L.l(null);
        this.this$0.T.b();
        if (!(kod0Var instanceof jod0)) {
            if (kod0Var instanceof iod0) {
                x0u0 x0u0Var = this.this$0.D;
                this.L$0 = null;
                this.label = 3;
                ((y0u0) x0u0Var).a();
                if (zy11Var == coroutineSingletons) {
                }
            } else if (!(kod0Var instanceof hod0)) {
                w511.b();
                return null;
            }
            return zy11Var;
        }
        d dVar2 = this.this$0;
        w200 w200Var = dVar2.E;
        PlusPayMailingAdsAgreement plusPayMailingAdsAgreement = (PlusPayMailingAdsAgreement) dVar2.O.getValue();
        this.L$0 = null;
        this.label = 2;
        Object a = w200Var.a.a(plusPayMailingAdsAgreement, this);
        if (a != coroutineSingletons) {
            a = zy11Var;
        }
        return coroutineSingletons;
    }
}
