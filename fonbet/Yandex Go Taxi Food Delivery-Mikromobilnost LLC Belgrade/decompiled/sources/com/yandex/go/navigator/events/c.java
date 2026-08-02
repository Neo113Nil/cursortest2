package com.yandex.go.navigator.events;

import com.yandex.go.navigator.incidents.IncidentType;
import com.yandex.mapkit.road_events.EventTag;
import defpackage.gpv;
import defpackage.kg50;
import defpackage.nsk0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wsk0;
import defpackage.y290;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;

    public c(vpr vprVar, e eVar) {
        this.a = vprVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OnRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$2$2$1 onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$2$2$1;
        int i;
        y290 y290Var;
        if (continuation instanceof OnRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$2$2$1) {
            onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$2$2$1 = (OnRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$2$2$1) continuation;
            int i2 = onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    nsk0 nsk0Var = (nsk0) obj;
                    e eVar = this.b;
                    gpv gpvVar = eVar.c;
                    EventTag eventTag = nsk0Var.c;
                    gpvVar.getClass();
                    IncidentType a = gpv.a(eventTag);
                    if (a != null) {
                        eVar.d.getClass();
                        y290Var = new y290(nsk0Var.a, nsk0Var.b, a, (kg50) wsk0.a().get(nsk0Var.c));
                    } else {
                        y290Var = null;
                    }
                    if (y290Var != null) {
                        onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$2$2$1.L$0 = null;
                        onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$2$2$1.L$1 = null;
                        onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$2$2$1.L$2 = null;
                        onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$2$2$1.L$3 = null;
                        onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$2$2$1.L$4 = null;
                        onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$2$2$1.label = 1;
                        if (this.a.emit(y290Var, onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$2$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$2$2$1 = new OnRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$2$2$1(this, continuation);
        Object obj22 = onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
