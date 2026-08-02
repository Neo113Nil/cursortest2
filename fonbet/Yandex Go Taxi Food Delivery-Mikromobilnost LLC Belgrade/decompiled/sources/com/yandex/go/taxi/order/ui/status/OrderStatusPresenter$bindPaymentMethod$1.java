package com.yandex.go.taxi.order.ui.status;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.avu0;
import defpackage.d880;
import defpackage.ief;
import defpackage.lv90;
import defpackage.m880;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o8a0;
import defpackage.tse;
import defpackage.uh60;
import defpackage.v8a0;
import defpackage.wls;
import defpackage.zy11;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.ui.status.OrderStatusPresenter$bindPaymentMethod$1", f = "OrderStatusPresenter.kt", l = {207}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderStatusPresenter$bindPaymentMethod$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ m880 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderStatusPresenter$bindPaymentMethod$1(m880 m880Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = m880Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderStatusPresenter$bindPaymentMethod$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderStatusPresenter$bindPaymentMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OrderStatusPresenter$bindPaymentMethod$1 orderStatusPresenter$bindPaymentMethod$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            lv90 lv90Var = this.this$0.x.b().V().I;
            TaxiOrder b = this.this$0.x.b();
            o8a0 o8a0Var = this.this$0.G;
            PaymentMethod$Type paymentMethod$Type = lv90Var.a;
            String str = lv90Var.b;
            String str2 = b.V().v;
            BigDecimal h = str2 != null ? avu0.h(str2) : null;
            ief iefVar = b.V().K;
            String str3 = iefVar != null ? iefVar.b : null;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            orderStatusPresenter$bindPaymentMethod$1 = this;
            obj = ((ru.yandex.taxi.order.view.b) o8a0Var).d(paymentMethod$Type, str, h, str3, orderStatusPresenter$bindPaymentMethod$1);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            orderStatusPresenter$bindPaymentMethod$1 = this;
        }
        v8a0 v8a0Var = (v8a0) obj;
        zy11 zy11Var = zy11.a;
        if (v8a0Var == null) {
            return zy11Var;
        }
        ((d880) orderStatusPresenter$bindPaymentMethod$1.this$0.Dg()).E9(v8a0Var.a, v8a0Var.b);
        ((d880) orderStatusPresenter$bindPaymentMethod$1.this$0.Dg()).fd(new uh60(24, orderStatusPresenter$bindPaymentMethod$1.this$0));
        return zy11Var;
    }
}
