package com.yandex.go.places.impl.domain.interactors.map;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes13.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;

    public b(m0 m0Var) {
        this.a = m0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PlacesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$1 placesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof PlacesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$1) {
            placesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$1 = (PlacesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$1) continuation;
            int i2 = placesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar);
                    placesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$1.L$0 = null;
                    placesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$1.L$1 = null;
                    placesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$1.L$2 = null;
                    placesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, placesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        placesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$1 = new PlacesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = placesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
