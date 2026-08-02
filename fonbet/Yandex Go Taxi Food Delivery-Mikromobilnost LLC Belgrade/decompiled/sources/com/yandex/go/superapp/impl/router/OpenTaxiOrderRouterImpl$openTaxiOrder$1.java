package com.yandex.go.superapp.impl.router;

import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.impl.router.OpenTaxiOrderRouterImpl$openTaxiOrder$1", f = "OpenTaxiOrderRouterImpl.kt", l = {30}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OpenTaxiOrderRouterImpl$openTaxiOrder$1 extends SuspendLambda implements wls {
    final /* synthetic */ TaxiCardNavigationAction $navigationAction;
    final /* synthetic */ boolean $needFeed;
    final /* synthetic */ sls $onError;
    final /* synthetic */ DetailsOpenReason $openReason;
    final /* synthetic */ TaxiOrder $order;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenTaxiOrderRouterImpl$openTaxiOrder$1(a aVar, TaxiOrder taxiOrder, boolean z, DetailsOpenReason detailsOpenReason, TaxiCardNavigationAction taxiCardNavigationAction, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$order = taxiOrder;
        this.$needFeed = z;
        this.$openReason = detailsOpenReason;
        this.$navigationAction = taxiCardNavigationAction;
        this.$onError = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OpenTaxiOrderRouterImpl$openTaxiOrder$1(this.this$0, this.$order, this.$needFeed, this.$openReason, this.$navigationAction, this.$onError, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OpenTaxiOrderRouterImpl$openTaxiOrder$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OpenTaxiOrderRouterImpl$openTaxiOrder$1 openTaxiOrderRouterImpl$openTaxiOrder$1;
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.taxi.order.multi.a aVar = this.this$0.b;
            TaxiOrder taxiOrder = this.$order;
            boolean z = this.$needFeed;
            DetailsOpenReason detailsOpenReason = this.$openReason;
            TaxiCardNavigationAction taxiCardNavigationAction = this.$navigationAction;
            this.label = 1;
            openTaxiOrderRouterImpl$openTaxiOrder$1 = this;
            a = aVar.a(taxiOrder, z, detailsOpenReason, taxiCardNavigationAction, openTaxiOrderRouterImpl$openTaxiOrder$1);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
            openTaxiOrderRouterImpl$openTaxiOrder$1 = this;
        }
        sls slsVar = openTaxiOrderRouterImpl$openTaxiOrder$1.$onError;
        if (Result.a(a) != null) {
            slsVar.invoke();
        }
        return zy11.a;
    }
}
