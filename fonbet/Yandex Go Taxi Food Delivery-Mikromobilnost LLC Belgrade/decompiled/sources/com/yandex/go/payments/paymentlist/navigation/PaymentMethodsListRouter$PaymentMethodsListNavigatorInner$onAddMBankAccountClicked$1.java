package com.yandex.go.payments.paymentlist.navigation;

import defpackage.gf0;
import defpackage.if0;
import defpackage.kf0;
import defpackage.m950;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.po21;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.navigation.PaymentMethodsListRouter$PaymentMethodsListNavigatorInner$onAddMBankAccountClicked$1", f = "PaymentMethodsListRouter.kt", l = {409}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodsListRouter$PaymentMethodsListNavigatorInner$onAddMBankAccountClicked$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ f this$0;
    final /* synthetic */ e this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsListRouter$PaymentMethodsListNavigatorInner$onAddMBankAccountClicked$1(f fVar, e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.this$1 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMethodsListRouter$PaymentMethodsListNavigatorInner$onAddMBankAccountClicked$1(this.this$0, this.this$1, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodsListRouter$PaymentMethodsListNavigatorInner$onAddMBankAccountClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        f fVar;
        m950 m950Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            fVar = this.this$0;
            f fVar2 = this.this$1.b;
            gf0 gf0Var = (gf0) fVar2.V.get();
            com.yandex.go.payments.mbank.navigation.b a = gf0Var.a.a(new b(fVar2));
            po21 po21Var = this.this$0.h0;
            this.L$0 = fVar;
            this.L$1 = a;
            this.label = 1;
            Object h = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).h(this);
            if (h == coroutineSingletons) {
                return coroutineSingletons;
            }
            m950Var = a;
            obj = h;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m950Var = (m950) this.L$1;
            fVar = (f) this.L$0;
            kotlin.b.b(obj);
        }
        zzs a2 = ((mo21) obj).a();
        String currency = this.this$0.k0.getCurrency();
        String openReason = this.this$1.a.a.getOpenReason();
        f fVar3 = this.this$0;
        fVar.A(m950Var, new if0(a2, currency, openReason, fVar3.E), new kf0(fVar3, 1));
        return zy11.a;
    }
}
