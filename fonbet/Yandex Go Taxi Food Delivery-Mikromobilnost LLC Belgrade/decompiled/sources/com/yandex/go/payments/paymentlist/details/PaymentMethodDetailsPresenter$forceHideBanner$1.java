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
@mvg(c = "com.yandex.go.payments.paymentlist.details.PaymentMethodDetailsPresenter$forceHideBanner$1", f = "PaymentMethodDetailsPresenter.kt", l = {48, 50}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodDetailsPresenter$forceHideBanner$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodDetailsPresenter$forceHideBanner$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMethodDetailsPresenter$forceHideBanner$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodDetailsPresenter$forceHideBanner$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (r1.a(r6, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r6 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
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
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                ((q4a0) this.this$0.Dg()).Ge();
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        k9a0 k9a0Var = (k9a0) obj;
        if (k9a0Var != null) {
            d dVar = this.this$0.z;
            String str = k9a0Var.a;
            this.L$0 = null;
            this.label = 2;
        }
        return zy11.a;
    }
}
