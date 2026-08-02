package com.yandex.go.navigator.domain;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.location.Location;
import defpackage.l7z;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class k implements vpr {
    public final /* synthetic */ vpr a;

    public k(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LocationChangedListener$special$$inlined$map$1$2$1 locationChangedListener$special$$inlined$map$1$2$1;
        int i;
        Location location;
        if (continuation instanceof LocationChangedListener$special$$inlined$map$1$2$1) {
            locationChangedListener$special$$inlined$map$1$2$1 = (LocationChangedListener$special$$inlined$map$1$2$1) continuation;
            int i2 = locationChangedListener$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationChangedListener$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = locationChangedListener$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationChangedListener$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    l7z l7zVar = (l7z) obj;
                    Point position = (l7zVar == null || (location = l7zVar.a) == null) ? null : location.getPosition();
                    locationChangedListener$special$$inlined$map$1$2$1.L$0 = null;
                    locationChangedListener$special$$inlined$map$1$2$1.L$1 = null;
                    locationChangedListener$special$$inlined$map$1$2$1.L$2 = null;
                    locationChangedListener$special$$inlined$map$1$2$1.L$3 = null;
                    locationChangedListener$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(position, locationChangedListener$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        locationChangedListener$special$$inlined$map$1$2$1 = new LocationChangedListener$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = locationChangedListener$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationChangedListener$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
