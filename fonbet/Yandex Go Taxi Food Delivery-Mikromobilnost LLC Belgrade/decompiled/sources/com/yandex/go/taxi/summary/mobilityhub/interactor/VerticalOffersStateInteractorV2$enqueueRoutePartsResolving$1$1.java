package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubOfferType;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RoutePartItemDto$MultimodalBikeRoutePart;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RoutePartItemDto$MultimodalElectroBikeRoutePart;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RoutePartItemDto$MultimodalPedestrianRoutePart;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RoutePartItemDto$MultimodalScooterRoutePart;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RoutePartItemDto$MultimodalTaxiTransportRoutePart;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RoutePartItemDto$MultimodalTransportRoutePart;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.b2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.c2;
import defpackage.atj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lkotlin/Pair;", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/c2;", "Latj0;", "<anonymous>", "(Ltse;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.VerticalOffersStateInteractorV2$enqueueRoutePartsResolving$1$1", f = "VerticalOffersStateInteractorV2.kt", l = {318}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalOffersStateInteractorV2$enqueueRoutePartsResolving$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ c2 $part;
    int label;
    final /* synthetic */ i0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalOffersStateInteractorV2$enqueueRoutePartsResolving$1$1(i0 i0Var, c2 c2Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = i0Var;
        this.$part = c2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VerticalOffersStateInteractorV2$enqueueRoutePartsResolving$1$1(this.this$0, this.$part, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VerticalOffersStateInteractorV2$enqueueRoutePartsResolving$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            i0 i0Var = this.this$0;
            c2 c2Var = this.$part;
            this.label = 1;
            n nVar = i0Var.l;
            if (c2Var instanceof RoutePartItemDto$MultimodalPedestrianRoutePart) {
                obj = nVar.d(((RoutePartItemDto$MultimodalPedestrianRoutePart) c2Var).a, HubOfferType.PEDESTRIAN, this);
            } else if (c2Var instanceof RoutePartItemDto$MultimodalScooterRoutePart) {
                obj = nVar.d(((RoutePartItemDto$MultimodalScooterRoutePart) c2Var).a, HubOfferType.SCOOTERS, this);
            } else if (c2Var instanceof RoutePartItemDto$MultimodalBikeRoutePart) {
                obj = nVar.d(((RoutePartItemDto$MultimodalBikeRoutePart) c2Var).a, HubOfferType.SCOOTERS, this);
            } else if (c2Var instanceof RoutePartItemDto$MultimodalElectroBikeRoutePart) {
                obj = nVar.d(((RoutePartItemDto$MultimodalElectroBikeRoutePart) c2Var).a, HubOfferType.SCOOTERS, this);
            } else if (c2Var instanceof RoutePartItemDto$MultimodalTransportRoutePart) {
                obj = nVar.d(((RoutePartItemDto$MultimodalTransportRoutePart) c2Var).a, HubOfferType.TRANSPORT, this);
            } else if (c2Var instanceof RoutePartItemDto$MultimodalTaxiTransportRoutePart) {
                obj = nVar.d(((RoutePartItemDto$MultimodalTaxiTransportRoutePart) c2Var).a, HubOfferType.MULTIMODAL_TAXI_TRANSPORT, this);
            } else {
                if (!(c2Var instanceof b2)) {
                    w511.b();
                    return null;
                }
                obj = null;
            }
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
        atj0 atj0Var = (atj0) obj;
        if (atj0Var != null) {
            return new Pair(this.$part, atj0Var);
        }
        return null;
    }
}
