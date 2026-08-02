package com.yandex.go.superapp.order.multi.old.view;

import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.order.multi.old.view.OrderStackViewRouter$showTaxiOrderDetailsWithOrderHolder$1", f = "OrderStackViewRouter.kt", l = {HProv.PP_CONTAINER_STATUS}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderStackViewRouter$showTaxiOrderDetailsWithOrderHolder$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ DetailsOpenReason $openReason;
    final /* synthetic */ o2y0 $orderHolder;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderStackViewRouter$showTaxiOrderDetailsWithOrderHolder$1(g gVar, o2y0 o2y0Var, boolean z, DetailsOpenReason detailsOpenReason, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$orderHolder = o2y0Var;
        this.$expanded = z;
        this.$openReason = detailsOpenReason;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderStackViewRouter$showTaxiOrderDetailsWithOrderHolder$1(this.this$0, this.$orderHolder, this.$expanded, this.$openReason, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderStackViewRouter$showTaxiOrderDetailsWithOrderHolder$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0;
            o2y0 o2y0Var = this.$orderHolder;
            boolean z = this.$expanded;
            DetailsOpenReason detailsOpenReason = this.$openReason;
            TaxiCardNavigationAction taxiCardNavigationAction = TaxiCardNavigationAction.EMPTY;
            this.label = 1;
            if (g.a(gVar, o2y0Var, z, detailsOpenReason, taxiCardNavigationAction, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
