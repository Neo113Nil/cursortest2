package com.yandex.go.navigator.driving;

import com.yandex.go.navigator.incidents.IncidentType;
import com.yandex.mapkit.directions.driving.Event;
import com.yandex.mapkit.road_events.EventTag;
import defpackage.avj0;
import defpackage.gpv;
import defpackage.kyh0;
import defpackage.m810;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class d0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ p0 b;

    public d0(vpr vprVar, p0 p0Var) {
        this.a = vprVar;
        this.b = p0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UpcomingRoadEventNotificationContentRepository$special$$inlined$map$1$2$1 upcomingRoadEventNotificationContentRepository$special$$inlined$map$1$2$1;
        int i;
        String str;
        EventTag a;
        if (continuation instanceof UpcomingRoadEventNotificationContentRepository$special$$inlined$map$1$2$1) {
            upcomingRoadEventNotificationContentRepository$special$$inlined$map$1$2$1 = (UpcomingRoadEventNotificationContentRepository$special$$inlined$map$1$2$1) continuation;
            int i2 = upcomingRoadEventNotificationContentRepository$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upcomingRoadEventNotificationContentRepository$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = upcomingRoadEventNotificationContentRepository$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upcomingRoadEventNotificationContentRepository$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = (Pair) obj;
                    Event event = (Event) pair.getFirst();
                    float floatValue = ((Number) pair.getSecond()).floatValue();
                    p0 p0Var = this.b;
                    IncidentType a2 = (event == null || (a = p0Var.g.a.a(event)) == null) ? null : gpv.a(a);
                    if (event == null || floatValue >= 500.0f || a2 != IncidentType.Camera) {
                        str = null;
                    } else {
                        double d = floatValue;
                        if (d < 995.0d) {
                            str = ((avj0) p0Var.h).i(kyh0.scooters_remaining_distance_in_metres, new Integer(m810.a(m810.a(d) / 10.0d) * 10));
                        } else if (d > 5000.0d) {
                            str = ((avj0) p0Var.h).i(kyh0.scooters_remaining_distance_in_km, new Integer((int) Math.rint(d / 1000.0d)));
                        } else {
                            double pow = Math.pow(10.0d, 1.0d);
                            float rint = (float) (Math.rint((((float) d) / 1000.0f) * pow) / pow);
                            int i3 = (int) rint;
                            str = ((avj0) p0Var.h).i(kyh0.scooters_remaining_distance_in_km, ((double) Math.abs(rint - ((float) i3))) < 0.1d ? new Integer(i3) : new Float(rint));
                        }
                    }
                    upcomingRoadEventNotificationContentRepository$special$$inlined$map$1$2$1.L$0 = null;
                    upcomingRoadEventNotificationContentRepository$special$$inlined$map$1$2$1.L$1 = null;
                    upcomingRoadEventNotificationContentRepository$special$$inlined$map$1$2$1.L$2 = null;
                    upcomingRoadEventNotificationContentRepository$special$$inlined$map$1$2$1.L$3 = null;
                    upcomingRoadEventNotificationContentRepository$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(str, upcomingRoadEventNotificationContentRepository$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        upcomingRoadEventNotificationContentRepository$special$$inlined$map$1$2$1 = new UpcomingRoadEventNotificationContentRepository$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = upcomingRoadEventNotificationContentRepository$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upcomingRoadEventNotificationContentRepository$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
