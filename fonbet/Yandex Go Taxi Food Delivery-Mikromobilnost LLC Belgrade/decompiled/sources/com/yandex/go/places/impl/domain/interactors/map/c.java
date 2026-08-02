package com.yandex.go.places.impl.domain.interactors.map;

import com.yandex.go.places.models.data.entities.network.CategoryFilterType;
import defpackage.ibc0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PlacesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$2$1 placesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof PlacesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$2$1) {
            placesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$2$1 = (PlacesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = placesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = placesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    Iterator it = ((List) obj).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((ibc0) obj2).g == CategoryFilterType.FAVOURITES) {
                            break;
                        }
                    }
                    ibc0 ibc0Var = (ibc0) obj2;
                    Boolean valueOf = Boolean.valueOf(ibc0Var != null ? ibc0Var.i : false);
                    placesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$2$1.L$0 = null;
                    placesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$2$1.L$1 = null;
                    placesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$2$1.L$2 = null;
                    placesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$2$1.L$3 = null;
                    placesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, placesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        placesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$2$1 = new PlacesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj32 = placesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
