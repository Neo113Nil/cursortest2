package com.yandex.go.navigator.map_interactions.parkings;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import defpackage.j0g;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ j0g b;

    public f(vpr vprVar, j0g j0gVar) {
        this.a = vprVar;
        this.b = j0gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CarParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$2$1 carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof CarParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$2$1) {
            carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$2$1 = (CarParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String w = this.b.w((DrivingRoute) obj);
                    carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                    carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                    carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                    carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                    carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                    carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$2$1.label = 1;
                    if (this.a.emit(w, carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$2$1 = new CarParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
