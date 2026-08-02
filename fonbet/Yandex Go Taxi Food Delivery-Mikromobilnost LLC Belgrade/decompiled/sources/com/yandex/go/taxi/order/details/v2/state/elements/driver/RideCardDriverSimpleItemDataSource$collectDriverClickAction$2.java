package com.yandex.go.taxi.order.details.v2.state.elements.driver;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.Driver;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o9k0;
import defpackage.rim;
import defpackage.s9k0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "order", "Libk0;", "<anonymous>", "(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;)Libk0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.driver.RideCardDriverSimpleItemDataSource$collectDriverClickAction$2", f = "RideCardDriverSimpleItemDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardDriverSimpleItemDataSource$collectDriverClickAction$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $detailsUnavailable;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardDriverSimpleItemDataSource$collectDriverClickAction$2(boolean z, Continuation continuation) {
        super(2, continuation);
        this.$detailsUnavailable = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardDriverSimpleItemDataSource$collectDriverClickAction$2 rideCardDriverSimpleItemDataSource$collectDriverClickAction$2 = new RideCardDriverSimpleItemDataSource$collectDriverClickAction$2(this.$detailsUnavailable, continuation);
        rideCardDriverSimpleItemDataSource$collectDriverClickAction$2.L$0 = obj;
        return rideCardDriverSimpleItemDataSource$collectDriverClickAction$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardDriverSimpleItemDataSource$collectDriverClickAction$2) create((TaxiOrder) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return (this.$detailsUnavailable || jl40.l(taxiOrder.V().g, Driver.v)) ? s9k0.a : new o9k0(rim.a(taxiOrder));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
