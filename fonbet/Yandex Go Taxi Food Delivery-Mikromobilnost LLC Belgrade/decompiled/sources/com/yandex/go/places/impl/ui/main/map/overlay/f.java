package com.yandex.go.places.impl.ui.main.map.overlay;

import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$PlacesMapScreenName;
import defpackage.ny61;
import defpackage.sr00;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;

    public f(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PlacesMainMapPresenter$attachView$$inlined$map$1$2$1 placesMainMapPresenter$attachView$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof PlacesMainMapPresenter$attachView$$inlined$map$1$2$1) {
            placesMainMapPresenter$attachView$$inlined$map$1$2$1 = (PlacesMainMapPresenter$attachView$$inlined$map$1$2$1) continuation;
            int i2 = placesMainMapPresenter$attachView$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesMainMapPresenter$attachView$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = placesMainMapPresenter$attachView$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesMainMapPresenter$attachView$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName = ((sr00) obj).b;
                    placesMainMapPresenter$attachView$$inlined$map$1$2$1.L$0 = null;
                    placesMainMapPresenter$attachView$$inlined$map$1$2$1.L$1 = null;
                    placesMainMapPresenter$attachView$$inlined$map$1$2$1.L$2 = null;
                    placesMainMapPresenter$attachView$$inlined$map$1$2$1.L$3 = null;
                    placesMainMapPresenter$attachView$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(placesMapConfig$PlacesMapScreenName, placesMainMapPresenter$attachView$$inlined$map$1$2$1) == coroutineSingletons) {
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
        placesMainMapPresenter$attachView$$inlined$map$1$2$1 = new PlacesMainMapPresenter$attachView$$inlined$map$1$2$1(this, continuation);
        Object obj22 = placesMainMapPresenter$attachView$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMainMapPresenter$attachView$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
