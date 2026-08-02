package com.yandex.go.navigator.domain;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class w implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ a0 b;

    public w(vpr vprVar, a0 a0Var) {
        this.a = vprVar;
        this.b = a0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        if (r7.emit(r9, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UpcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1 upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof UpcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1) {
            upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1 = (UpcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1) continuation;
            int i2 = upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.L$0 = null;
                    upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.L$1 = null;
                    upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.L$2 = null;
                    upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.L$4 = vprVar2;
                    upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.L$5 = null;
                    upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.L$6 = null;
                    upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.label = 1;
                    Object a = a0.a(this.b, (DrivingRoute) obj, upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1);
                    if (a != coroutineSingletons) {
                        obj2 = a;
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar = (vpr) upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.L$0 = null;
                upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.L$1 = null;
                upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.L$2 = null;
                upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.L$3 = null;
                upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.L$4 = null;
                upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.L$5 = null;
                upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.L$6 = null;
                upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.label = 2;
            }
        }
        upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1 = new UpcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.L$0 = null;
        upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.L$1 = null;
        upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.L$2 = null;
        upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.L$3 = null;
        upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.L$4 = null;
        upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.L$5 = null;
        upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.L$6 = null;
        upcomingStopsCounter$getUpcomingStopsCountFlow$$inlined$map$1$2$1.label = 2;
    }
}
