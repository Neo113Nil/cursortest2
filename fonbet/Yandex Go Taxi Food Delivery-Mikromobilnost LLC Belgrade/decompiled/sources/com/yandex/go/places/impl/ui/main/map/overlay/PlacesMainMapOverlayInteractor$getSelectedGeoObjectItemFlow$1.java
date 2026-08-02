package com.yandex.go.places.impl.ui.main.map.overlay;

import com.yandex.mapkit.map.GeoObjectSelectionMetadata;
import defpackage.kju0;
import defpackage.kn00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkn00;", "mapObjectItem", "Lcom/yandex/mapkit/map/GeoObjectSelectionMetadata;", kju0.j, "Lkotlin/Pair;", "<anonymous>", "(Lkn00;Lcom/yandex/mapkit/map/GeoObjectSelectionMetadata;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.main.map.overlay.PlacesMainMapOverlayInteractor$getSelectedGeoObjectItemFlow$1", f = "PlacesMainMapOverlayInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesMainMapOverlayInteractor$getSelectedGeoObjectItemFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlacesMainMapOverlayInteractor$getSelectedGeoObjectItemFlow$1 placesMainMapOverlayInteractor$getSelectedGeoObjectItemFlow$1 = new PlacesMainMapOverlayInteractor$getSelectedGeoObjectItemFlow$1(3, (Continuation) obj3);
        placesMainMapOverlayInteractor$getSelectedGeoObjectItemFlow$1.L$0 = (kn00) obj;
        placesMainMapOverlayInteractor$getSelectedGeoObjectItemFlow$1.L$1 = (GeoObjectSelectionMetadata) obj2;
        return placesMainMapOverlayInteractor$getSelectedGeoObjectItemFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kn00 kn00Var = (kn00) this.L$0;
        GeoObjectSelectionMetadata geoObjectSelectionMetadata = (GeoObjectSelectionMetadata) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(kn00Var, geoObjectSelectionMetadata);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
