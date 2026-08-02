package com.yandex.go.superapp.order.multi.old.view;

import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.api.multi.TaxiOrderPresentationType;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.a3y0;
import defpackage.hc00;
import defpackage.hst;
import defpackage.ic00;
import defpackage.jst;
import defpackage.kc00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qa80;
import defpackage.tse;
import defpackage.u4y0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.order.multi.old.view.OrderStackViewPresenter$showOrderView$1", f = "OrderStackViewPresenter.kt", l = {HProv.PP_LICENSE}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderStackViewPresenter$showOrderView$1 extends SuspendLambda implements wls {
    final /* synthetic */ DetailsOpenReason $openReason;
    final /* synthetic */ u4y0 $orderState;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderStackViewPresenter$showOrderView$1(f fVar, u4y0 u4y0Var, DetailsOpenReason detailsOpenReason, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$orderState = u4y0Var;
        this.$openReason = detailsOpenReason;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderStackViewPresenter$showOrderView$1(this.this$0, this.$orderState, this.$openReason, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderStackViewPresenter$showOrderView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.taxi.order.multi.feed.domain.a aVar = this.this$0.U;
            this.label = 1;
            obj = aVar.b(this);
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
        TaxiOrderPresentationType taxiOrderPresentationType = (TaxiOrderPresentationType) obj;
        if (this.this$0.h0 == OrderScreen.ORDER_TRACKING && taxiOrderPresentationType.a()) {
            this.this$0.Qg(this.$orderState);
        } else {
            ic00 ic00Var = ((kc00) this.this$0.V).a;
            ic00Var.getClass();
            boolean z = ic00Var instanceof hc00;
            f fVar = this.this$0;
            if (z) {
                fVar.f0.getClass();
                a3y0.h(new String[]{"showOrderView"});
                hst hstVar = jst.e;
            } else {
                DetailsOpenReason detailsOpenReason = this.$openReason;
                com.yandex.go.taxi.order.view.l lVar = fVar.B;
                OrderScreen orderScreen = OrderScreen.ORDER_LIST;
                lVar.getClass();
                lVar.h(orderScreen, false, new qa80((String) null), detailsOpenReason, null);
            }
        }
        return zy11.a;
    }
}
