package com.yandex.go.places.impl.domain.interactors.map;

import defpackage.ny61;
import defpackage.sbc0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PlacesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$2$1 placesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof PlacesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$2$1) {
            placesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$2$1 = (PlacesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = placesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = placesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    sbc0 sbc0Var = new sbc0((List) obj);
                    placesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    placesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    placesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    placesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    placesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(sbc0Var, placesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        placesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$2$1 = new PlacesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = placesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapCategoryFiltersInteractor$categoryFiltersUiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
