package com.yandex.go.copter.city_tour.domain;

import defpackage.fnx0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;

    public e(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CityTourTariffDestinationOverrideInteractorImpl$cityTourTariffDestinationOverrideChangesFlow$$inlined$map$2$2$1 cityTourTariffDestinationOverrideInteractorImpl$cityTourTariffDestinationOverrideChangesFlow$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof CityTourTariffDestinationOverrideInteractorImpl$cityTourTariffDestinationOverrideChangesFlow$$inlined$map$2$2$1) {
            cityTourTariffDestinationOverrideInteractorImpl$cityTourTariffDestinationOverrideChangesFlow$$inlined$map$2$2$1 = (CityTourTariffDestinationOverrideInteractorImpl$cityTourTariffDestinationOverrideChangesFlow$$inlined$map$2$2$1) continuation;
            int i2 = cityTourTariffDestinationOverrideInteractorImpl$cityTourTariffDestinationOverrideChangesFlow$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cityTourTariffDestinationOverrideInteractorImpl$cityTourTariffDestinationOverrideChangesFlow$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = cityTourTariffDestinationOverrideInteractorImpl$cityTourTariffDestinationOverrideChangesFlow$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cityTourTariffDestinationOverrideInteractorImpl$cityTourTariffDestinationOverrideChangesFlow$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String str = ((fnx0) obj).c.b;
                    cityTourTariffDestinationOverrideInteractorImpl$cityTourTariffDestinationOverrideChangesFlow$$inlined$map$2$2$1.L$0 = null;
                    cityTourTariffDestinationOverrideInteractorImpl$cityTourTariffDestinationOverrideChangesFlow$$inlined$map$2$2$1.L$1 = null;
                    cityTourTariffDestinationOverrideInteractorImpl$cityTourTariffDestinationOverrideChangesFlow$$inlined$map$2$2$1.L$2 = null;
                    cityTourTariffDestinationOverrideInteractorImpl$cityTourTariffDestinationOverrideChangesFlow$$inlined$map$2$2$1.L$3 = null;
                    cityTourTariffDestinationOverrideInteractorImpl$cityTourTariffDestinationOverrideChangesFlow$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(str, cityTourTariffDestinationOverrideInteractorImpl$cityTourTariffDestinationOverrideChangesFlow$$inlined$map$2$2$1) == coroutineSingletons) {
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
        cityTourTariffDestinationOverrideInteractorImpl$cityTourTariffDestinationOverrideChangesFlow$$inlined$map$2$2$1 = new CityTourTariffDestinationOverrideInteractorImpl$cityTourTariffDestinationOverrideChangesFlow$$inlined$map$2$2$1(this, continuation);
        Object obj22 = cityTourTariffDestinationOverrideInteractorImpl$cityTourTariffDestinationOverrideChangesFlow$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cityTourTariffDestinationOverrideInteractorImpl$cityTourTariffDestinationOverrideChangesFlow$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
