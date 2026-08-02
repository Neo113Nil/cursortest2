package com.yandex.go.places.impl.ui.main.map.overlay;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Pair;", "Lti80;", "Lcom/yandex/go/places/models/data/entities/network/map/e;", "<destruct>", "<anonymous>", "(Lkotlin/Pair;)Lcom/yandex/go/places/models/data/entities/network/map/e;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.main.map.overlay.PlacesMainMapOverlayInteractor$getSelectedMapObjectItemFlow$1", f = "PlacesMainMapOverlayInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesMainMapOverlayInteractor$getSelectedMapObjectItemFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlacesMainMapOverlayInteractor$getSelectedMapObjectItemFlow$1 placesMainMapOverlayInteractor$getSelectedMapObjectItemFlow$1 = new PlacesMainMapOverlayInteractor$getSelectedMapObjectItemFlow$1(2, continuation);
        placesMainMapOverlayInteractor$getSelectedMapObjectItemFlow$1.L$0 = obj;
        return placesMainMapOverlayInteractor$getSelectedMapObjectItemFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesMainMapOverlayInteractor$getSelectedMapObjectItemFlow$1) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return (com.yandex.go.places.models.data.entities.network.map.e) pair.getSecond();
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
