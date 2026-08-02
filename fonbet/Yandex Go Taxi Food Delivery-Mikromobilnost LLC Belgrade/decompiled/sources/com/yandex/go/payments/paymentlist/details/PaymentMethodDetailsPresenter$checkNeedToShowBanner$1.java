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
@mvg(c = "com.yandex.go.payments.paymentlist.details.PaymentMethodDetailsPresenter$checkNeedToShowBanner$1", f = "PaymentMethodDetailsPresenter.kt", l = {24, 25}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodDetailsPresenter$checkNeedToShowBanner$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodDetailsPresenter$checkNeedToShowBanner$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMethodDetailsPresenter$checkNeedToShowBanner$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodDetailsPresenter$checkNeedToShowBanner$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        if (r6 == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        k9a0 k9a0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            l9a0 l9a0Var = cVar.x;
            lea0 lea0Var = cVar.A;
            this.label = 1;
            obj = ((com.yandex.go.payments.paymentlist.ui.b) l9a0Var).d(lea0Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k9a0Var = (k9a0) this.L$0;
                kotlin.b.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    ((q4a0) this.this$0.Dg()).Cf(k9a0Var);
                    ((q4a0) this.this$0.Dg()).Yd(k9a0Var.e, k9a0Var.g, k9a0Var.d);
                    return zy11Var;
                }
                ((q4a0) this.this$0.Dg()).Ge();
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        k9a0 k9a0Var2 = (k9a0) obj;
        if (k9a0Var2 != null) {
            d dVar = this.this$0.z;
            String str = k9a0Var2.a;
            this.L$0 = k9a0Var2;
            this.label = 2;
            Object e = dVar.e(str, this);
            if (e != coroutineSingletons) {
                k9a0Var = k9a0Var2;
                obj = e;
                if (!((Boolean) obj).booleanValue()) {
                }
            }
            return coroutineSingletons;
        }
        ((q4a0) this.this$0.Dg()).Ge();
        return zy11Var;
    }
}
