package com.yandex.go.superapp.discovery.map.impl.domain.interactors;

import com.yandex.go.superapp.discovery.map.api.repositories.state.SuperAppDiscoveryMapOverlayState;
import defpackage.ems;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "places", "Lcom/yandex/go/superapp/discovery/map/api/repositories/state/SuperAppDiscoveryMapOverlayState;", "transport", "chargers", "scooters", TariffOrderFlow.ORDER_FLOW_TAXI_KEY}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.domain.interactors.SuperAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$6", f = "SuperAppDiscoveryMapOwnershipInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$6 extends SuspendLambda implements ems {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ Object L$4;
    int label;

    public SuperAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$6(Continuation continuation) {
        super(6, continuation);
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        SuperAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$6 superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$6 = new SuperAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$6((Continuation) obj6);
        superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$6.L$0 = (SuperAppDiscoveryMapOverlayState) obj;
        superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$6.L$1 = (SuperAppDiscoveryMapOverlayState) obj2;
        superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$6.L$2 = (SuperAppDiscoveryMapOverlayState) obj3;
        superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$6.L$3 = (SuperAppDiscoveryMapOverlayState) obj4;
        superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$6.L$4 = (SuperAppDiscoveryMapOverlayState) obj5;
        return superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$6.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SuperAppDiscoveryMapOverlayState superAppDiscoveryMapOverlayState;
        SuperAppDiscoveryMapOverlayState superAppDiscoveryMapOverlayState2 = (SuperAppDiscoveryMapOverlayState) this.L$0;
        SuperAppDiscoveryMapOverlayState superAppDiscoveryMapOverlayState3 = (SuperAppDiscoveryMapOverlayState) this.L$1;
        SuperAppDiscoveryMapOverlayState superAppDiscoveryMapOverlayState4 = (SuperAppDiscoveryMapOverlayState) this.L$2;
        SuperAppDiscoveryMapOverlayState superAppDiscoveryMapOverlayState5 = (SuperAppDiscoveryMapOverlayState) this.L$3;
        SuperAppDiscoveryMapOverlayState superAppDiscoveryMapOverlayState6 = (SuperAppDiscoveryMapOverlayState) this.L$4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf((superAppDiscoveryMapOverlayState2 != SuperAppDiscoveryMapOverlayState.DEFAULT || superAppDiscoveryMapOverlayState3 == (superAppDiscoveryMapOverlayState = SuperAppDiscoveryMapOverlayState.SELECTED) || superAppDiscoveryMapOverlayState4 == superAppDiscoveryMapOverlayState || superAppDiscoveryMapOverlayState5 == superAppDiscoveryMapOverlayState || superAppDiscoveryMapOverlayState6 == superAppDiscoveryMapOverlayState) ? false : true);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
