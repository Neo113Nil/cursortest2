package com.yandex.go.multimodal_route.ui.transport_route_part;

import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu40;
import defpackage.wls;
import defpackage.wr40;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "order", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.ui.transport_route_part.MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$1", f = "MultimodalRouteTaxiTransportInfoInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ qu40 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$1(qu40 qu40Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qu40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$1 multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$1 = new MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$1(this.this$0, continuation);
        multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$1.L$0 = obj;
        return multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$1 multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$1 = (MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$1) create((TaxiOrder) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        qu40 qu40Var = this.this$0;
        if (!qu40Var.l) {
            wr40 wr40Var = qu40Var.h;
            Address address = (Address) ((Map) wr40Var.c.getValue()).get(wr40Var.a.b(taxiOrder.a, taxiOrder.b.b));
            if (address != null) {
                this.this$0.g.l(address);
                this.this$0.g.g();
                this.this$0.l = true;
            }
        }
        return zy11.a;
    }
}
