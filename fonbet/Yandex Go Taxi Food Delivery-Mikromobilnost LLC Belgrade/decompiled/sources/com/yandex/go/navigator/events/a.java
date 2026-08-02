package com.yandex.go.navigator.events;

import com.yandex.mapkit.road_events.EventTag;
import com.yandex.mapkit.road_events_layer.RoadEvent;
import defpackage.kg50;
import defpackage.nsk0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.x1l0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ x1l0 b;

    public a(vpr vprVar, x1l0 x1l0Var) {
        this.a = vprVar;
        this.b = x1l0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OnRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$2$1 onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$2$1;
        int i;
        Object next;
        NavigatorTag navigatorTag;
        NavigatorTag navigatorTag2;
        if (continuation instanceof OnRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$2$1) {
            onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$2$1 = (OnRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    RoadEvent roadEvent = (RoadEvent) obj;
                    LinkedHashMap linkedHashMap = this.b.c;
                    Iterator<T> it = roadEvent.getTags().iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            kg50 kg50Var = (kg50) linkedHashMap.get((EventTag) next);
                            int priority = (kg50Var == null || (navigatorTag2 = kg50Var.a) == null) ? 0 : navigatorTag2.getPriority();
                            do {
                                Object next2 = it.next();
                                kg50 kg50Var2 = (kg50) linkedHashMap.get((EventTag) next2);
                                int priority2 = (kg50Var2 == null || (navigatorTag = kg50Var2.a) == null) ? 0 : navigatorTag.getPriority();
                                if (priority < priority2) {
                                    next = next2;
                                    priority = priority2;
                                }
                            } while (it.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    EventTag eventTag = (EventTag) next;
                    nsk0 nsk0Var = eventTag == null ? null : new nsk0(roadEvent.getId(), roadEvent.getPosition(), eventTag);
                    if (nsk0Var != null) {
                        onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(nsk0Var, onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$2$1 = new OnRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
