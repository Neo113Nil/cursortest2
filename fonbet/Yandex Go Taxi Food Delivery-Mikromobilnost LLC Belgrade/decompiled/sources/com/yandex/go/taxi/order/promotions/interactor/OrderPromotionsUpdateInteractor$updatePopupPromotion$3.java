package com.yandex.go.taxi.order.promotions.interactor;

import defpackage.cne0;
import defpackage.g4y0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wc80;
import defpackage.wls;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg4y0;", "it", "Lzy11;", "<anonymous>", "(Lg4y0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.promotions.interactor.OrderPromotionsUpdateInteractor$updatePopupPromotion$3", f = "OrderPromotionsUpdateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderPromotionsUpdateInteractor$updatePopupPromotion$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPromotionsUpdateInteractor$updatePopupPromotion$3(h hVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderPromotionsUpdateInteractor$updatePopupPromotion$3 orderPromotionsUpdateInteractor$updatePopupPromotion$3 = new OrderPromotionsUpdateInteractor$updatePopupPromotion$3(this.this$0, continuation);
        orderPromotionsUpdateInteractor$updatePopupPromotion$3.L$0 = obj;
        return orderPromotionsUpdateInteractor$updatePopupPromotion$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrderPromotionsUpdateInteractor$updatePopupPromotion$3 orderPromotionsUpdateInteractor$updatePopupPromotion$3 = (OrderPromotionsUpdateInteractor$updatePopupPromotion$3) create((g4y0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        orderPromotionsUpdateInteractor$updatePopupPromotion$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g4y0 g4y0Var = (g4y0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        h hVar = this.this$0;
        if (g4y0Var != null) {
            hVar.getClass();
            String str = g4y0Var.c().d;
            if (str == null) {
                str = g4y0Var.b();
            }
            wc80 wc80Var = hVar.c;
            String a = g4y0Var.a();
            cne0 cne0Var = wc80Var.a.a;
            cne0Var.u(String.format("shown_promo_%s_%s", Arrays.copyOf(new Object[]{a, str}, 2)), true);
            cne0Var.b();
            hVar.b.c(str);
        } else {
            hVar.getClass();
        }
        return zy11.a;
    }
}
