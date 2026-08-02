package com.yandex.go.taxi.order.state;

import com.yandex.go.taxi.order.api.titles.OrderTitles$Alignment;
import defpackage.b980;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/api/titles/OrderTitles$Alignment;", "alignment", "Lb980;", "titles", "<anonymous>", "(Lcom/yandex/go/taxi/order/api/titles/OrderTitles$Alignment;Lb980;)Lb980;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.state.TaxiOnTheWayViewPresenter$observeHeaderSection$1", f = "TaxiOnTheWayViewPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOnTheWayViewPresenter$observeHeaderSection$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TaxiOnTheWayViewPresenter$observeHeaderSection$1 taxiOnTheWayViewPresenter$observeHeaderSection$1 = new TaxiOnTheWayViewPresenter$observeHeaderSection$1(3, (Continuation) obj3);
        taxiOnTheWayViewPresenter$observeHeaderSection$1.L$0 = (OrderTitles$Alignment) obj;
        taxiOnTheWayViewPresenter$observeHeaderSection$1.L$1 = (b980) obj2;
        return taxiOnTheWayViewPresenter$observeHeaderSection$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OrderTitles$Alignment orderTitles$Alignment = (OrderTitles$Alignment) this.L$0;
        b980 b980Var = (b980) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new b980(b980Var.a, b980Var.b, b980Var.c, b980Var.d, b980Var.e, b980Var.f, b980Var.g, b980Var.h, orderTitles$Alignment);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
