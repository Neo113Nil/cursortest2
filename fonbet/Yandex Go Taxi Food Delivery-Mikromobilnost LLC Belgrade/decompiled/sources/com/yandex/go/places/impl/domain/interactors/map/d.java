package com.yandex.go.places.impl.domain.interactors.map;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes13.dex */
public final class d implements tpr {
    public final /* synthetic */ tpr a;

    public d(m0 m0Var) {
        this.a = m0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PlacesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$1 placesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof PlacesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$1) {
            placesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$1 = (PlacesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$1) continuation;
            int i2 = placesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar);
                    placesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$1.L$0 = null;
                    placesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$1.L$1 = null;
                    placesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$1.L$2 = null;
                    placesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, placesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        placesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$1 = new PlacesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = placesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapCategoryFiltersInteractor$isFavouritesSelectedStateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
