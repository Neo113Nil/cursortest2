package com.yandex.go.payments.order.domain;

import com.yandex.go.overdraft.api.domain.model.OverdraftContext;
import com.yandex.go.payments.api.model.PaymentsScreen;
import defpackage.h0a0;
import defpackage.jst;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.oba0;
import defpackage.pz80;
import defpackage.sy60;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.order.domain.OrderPaymentsListRouter$InOrderChangePaymentNavigatorImpl$openDebts$1", f = "OrderPaymentsListRouter.kt", l = {267}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrderPaymentsListRouter$InOrderChangePaymentNavigatorImpl$openDebts$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ e this$0;
    final /* synthetic */ b this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPaymentsListRouter$InOrderChangePaymentNavigatorImpl$openDebts$1(e eVar, b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.this$1 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderPaymentsListRouter$InOrderChangePaymentNavigatorImpl$openDebts$1(this.this$0, this.this$1, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderPaymentsListRouter$InOrderChangePaymentNavigatorImpl$openDebts$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OverdraftContext overdraftContext;
        OverdraftContext overdraftContext2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            switch (oba0.a[PaymentsScreen.ORDER.ordinal()]) {
                case 1:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 14:
                case 15:
                case 16:
                    overdraftContext = OverdraftContext.SUMMARY;
                    break;
                case 2:
                    overdraftContext = OverdraftContext.MAIN_SCREEN;
                    break;
                case 3:
                    overdraftContext = OverdraftContext.ACTIVE_ORDER;
                    break;
                case 4:
                    jst.e.q("Trying open debts from debts payment methods screen");
                    overdraftContext = OverdraftContext.SUMMARY;
                    break;
                case 5:
                    jst.e.q("Trying open taxi debts from scooters payment methods screen");
                    overdraftContext = OverdraftContext.SUMMARY;
                    break;
                case 11:
                    jst.e.q("Trying open taxi debts from places payment methods screen");
                    overdraftContext = OverdraftContext.SUMMARY;
                    break;
                case 12:
                    jst.e.q("Trying open taxi debts from chargers payment methods screen");
                    overdraftContext = OverdraftContext.SUMMARY;
                    break;
                case 13:
                    jst.e.q("Trying open taxi debts from superapp payment methods screen");
                    overdraftContext = OverdraftContext.SUMMARY;
                    break;
                default:
                    w511.b();
                    return null;
            }
            e eVar = this.this$0;
            o2y0 o2y0Var = this.this$1.a;
            this.L$0 = overdraftContext;
            this.label = 1;
            Object R = eVar.R(o2y0Var, this);
            if (R == coroutineSingletons) {
                return coroutineSingletons;
            }
            overdraftContext2 = overdraftContext;
            obj = R;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            overdraftContext2 = (OverdraftContext) this.L$0;
            kotlin.b.b(obj);
        }
        pz80 pz80Var = new pz80(overdraftContext2, null, (h0a0) obj);
        e eVar2 = this.this$0;
        eVar2.A((m950) eVar2.M.get(), pz80Var, sy60.Q2);
        return zy11.a;
    }
}
