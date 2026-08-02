package com.yandex.go.places.impl.ui.main.map.filters;

import com.yandex.mapkit.geometry.BoundingBox;
import defpackage.gh00;
import defpackage.ny61;
import defpackage.uc4;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class d implements vpr {
    public final /* synthetic */ f a;

    public d(f fVar) {
        this.a = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PlacesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$1 placesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$1;
        int i;
        f fVar;
        uc4 uc4Var;
        boolean z;
        BoundingBox boundingBox;
        if (continuation instanceof PlacesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$1) {
            placesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$1 = (PlacesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$1) continuation;
            int i2 = placesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$1.label = i2 - Integer.MIN_VALUE;
                PlacesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$1 placesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$12 = placesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$1;
                Object obj2 = placesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$12.label;
                fVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    uc4 D = ru.yandex.taxi.map.utils.a.D(((gh00) fVar.M).e.f());
                    float j = ((gh00) fVar.M).j();
                    com.yandex.go.places.impl.domain.interactors.map.e eVar = fVar.K;
                    Float f = new Float(j);
                    placesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$12.L$0 = null;
                    placesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$12.L$1 = null;
                    placesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$12.L$2 = D;
                    placesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$12.Z$0 = booleanValue;
                    placesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$12.F$0 = j;
                    placesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$12.label = 1;
                    obj2 = eVar.b(D, f, booleanValue, null, null, placesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$12);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    uc4Var = D;
                    z = booleanValue;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = placesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$12.Z$0;
                    uc4Var = (uc4) placesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$12.L$2;
                    kotlin.b.b(obj2);
                }
                boundingBox = (BoundingBox) obj2;
                if (boundingBox != null && z && !boundingBox.equals(uc4Var)) {
                    fVar.V = true;
                    ((gh00) fVar.D.a).A(boundingBox, null);
                }
                return zy11.a;
            }
        }
        placesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$1 = new PlacesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$1(this, continuation);
        PlacesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$1 placesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$122 = placesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$1;
        Object obj22 = placesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$122.label;
        fVar = this.a;
        if (i != 0) {
        }
        boundingBox = (BoundingBox) obj22;
        if (boundingBox != null) {
            fVar.V = true;
            ((gh00) fVar.D.a).A(boundingBox, null);
        }
        return zy11.a;
    }
}
