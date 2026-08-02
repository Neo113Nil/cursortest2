package com.yandex.go.taxi.order.details.v2.navigation;

import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.a3y0;
import defpackage.bck0;
import defpackage.cck0;
import defpackage.hst;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcck0;", "it", "Lzy11;", "<anonymous>", "(Lcck0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.navigation.TaxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$1", f = "TaxiOrderDetailsDynamicSwitcher.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TaxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$1 taxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$1 = new TaxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$1(this.this$0, continuation);
        taxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$1.L$0 = obj;
        return taxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TaxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$1 taxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$1 = (TaxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$1) create((cck0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        taxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        cck0 cck0Var = (cck0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (cck0Var instanceof bck0) {
            this.this$0.b.a(OrderScreen.ORDER_DETAILS, (bck0) cck0Var);
        }
        this.this$0.e.getClass();
        a3y0.h(new String[]{"detailsPresenceFlow"});
        hst hstVar = jst.e;
        return zy11.a;
    }
}
