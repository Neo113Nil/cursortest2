package com.yandex.go.multimodal_route.ui.transport_route_part;

import com.yandex.go.multimodal_route.analytics.MultimodalRouteAnalytics$MultimodalRouteTripStatus;
import com.yandex.go.multimodal_route.network.models.TaxiTransportInfoResponseDto;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.es40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pu40;
import defpackage.qu40;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Triple;", "Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "Lcom/yandex/go/multimodal_route/network/models/TaxiTransportInfoResponseDto;", "Lcom/yandex/go/address/models/Address;", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Triple;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.ui.transport_route_part.MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$4", f = "MultimodalRouteTaxiTransportInfoInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$4 extends SuspendLambda implements wls {
    final /* synthetic */ String $routeType;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ qu40 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$4(qu40 qu40Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qu40Var;
        this.$routeType = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$4 multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$4 = new MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$4(this.this$0, this.$routeType, continuation);
        multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$4.L$0 = obj;
        return multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$4 multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$4 = (MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$4) create((Triple) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$4.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        MultimodalRouteAnalytics$MultimodalRouteTripStatus multimodalRouteAnalytics$MultimodalRouteTripStatus;
        Triple triple = (Triple) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        TaxiOrder taxiOrder = (TaxiOrder) triple.getFirst();
        TaxiTransportInfoResponseDto taxiTransportInfoResponseDto = (TaxiTransportInfoResponseDto) triple.getSecond();
        if (this.this$0.m != taxiOrder.h.getB()) {
            this.this$0.m = taxiOrder.h.getB();
            es40 es40Var = this.this$0.j;
            if (taxiTransportInfoResponseDto == null || (str = taxiTransportInfoResponseDto.a) == null) {
                str = "";
            }
            String str2 = this.$routeType;
            switch (pu40.a[taxiOrder.h.getB().ordinal()]) {
                case 1:
                    multimodalRouteAnalytics$MultimodalRouteTripStatus = MultimodalRouteAnalytics$MultimodalRouteTripStatus.Created;
                    break;
                case 2:
                    multimodalRouteAnalytics$MultimodalRouteTripStatus = MultimodalRouteAnalytics$MultimodalRouteTripStatus.Search;
                    break;
                case 3:
                    multimodalRouteAnalytics$MultimodalRouteTripStatus = MultimodalRouteAnalytics$MultimodalRouteTripStatus.Driving;
                    break;
                case 4:
                    multimodalRouteAnalytics$MultimodalRouteTripStatus = MultimodalRouteAnalytics$MultimodalRouteTripStatus.Waiting;
                    break;
                case 5:
                    multimodalRouteAnalytics$MultimodalRouteTripStatus = MultimodalRouteAnalytics$MultimodalRouteTripStatus.Transporting;
                    break;
                case 6:
                    multimodalRouteAnalytics$MultimodalRouteTripStatus = MultimodalRouteAnalytics$MultimodalRouteTripStatus.Complete;
                    break;
                default:
                    multimodalRouteAnalytics$MultimodalRouteTripStatus = MultimodalRouteAnalytics$MultimodalRouteTripStatus.Complete;
                    break;
            }
            es40Var.b(str, str2, multimodalRouteAnalytics$MultimodalRouteTripStatus);
        }
        return zy11.a;
    }
}
