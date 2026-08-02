package com.yandex.go.navigator.driving;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.yandex.go.navigator.incidents.IncidentType;
import com.yandex.mapkit.directions.driving.Event;
import com.yandex.mapkit.road_events.EventTag;
import defpackage.a621;
import defpackage.avj0;
import defpackage.blm;
import defpackage.gpv;
import defpackage.hst;
import defpackage.jst;
import defpackage.kg50;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.scc;
import defpackage.uyb0;
import defpackage.vng;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wkm;
import defpackage.wsk0;
import defpackage.z5;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class n0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ p0 b;
    public final /* synthetic */ blm c;
    public final /* synthetic */ blm w;

    public n0(vpr vprVar, p0 p0Var, blm blmVar, blm blmVar2) {
        this.a = vprVar;
        this.b = p0Var;
        this.c = blmVar;
        this.w = blmVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UpcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$2$1 upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$2$1;
        int i;
        int i2;
        DrivingModeNotification drivingModeNotification;
        Integer num;
        if (continuation instanceof UpcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$2$1) {
            upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$2$1 = (UpcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$2$1) continuation;
            int i3 = upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$2$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Event event = (Event) obj;
                    r rVar = this.b.c;
                    z5 z5Var = new z5(29, this.c, event);
                    a621 a621Var = new a621(0, this.w, event);
                    zuj0 zuj0Var = rVar.b;
                    Context context = rVar.a;
                    EventTag a = rVar.c.a(event);
                    if (a != null) {
                        rVar.d.getClass();
                        IncidentType a2 = gpv.a(a);
                        if (a2 != null) {
                            rVar.g.getClass();
                            kg50 kg50Var = (kg50) wsk0.a().get(a);
                            hst hstVar = jst.e;
                            event.getEventId();
                            a2.name();
                            hstVar.getClass();
                            Context context2 = rVar.a;
                            Drawable t = (kg50Var == null || (num = kg50Var.f) == null) ? null : vng.t(num.intValue(), context2);
                            int i4 = wkm.a[a2.ordinal()];
                            if (i4 == 1) {
                                i2 = kyh0.navigator_incidents_specify_camera;
                            } else if (i4 == 2) {
                                i2 = kyh0.navigator_incidents_specify_police;
                            } else if (i4 == 3) {
                                i2 = kyh0.navigator_incidents_specify_road_works;
                            } else {
                                if (i4 != 4) {
                                    w511.b();
                                    return null;
                                }
                                i2 = kyh0.navigator_incidents_specify_accident;
                            }
                            avj0 avj0Var = (avj0) zuj0Var;
                            drivingModeNotification = new DrivingModeNotification(context2, "1011", t, context.getString(i2), context.getString(kyh0.navigator_incidents_specify_subtitle), scc.g(r.a(rVar, new uyb0(a621Var, avj0Var.h(kyh0.common_no)), null, null, null, 238), r.a(rVar, new uyb0(z5Var, avj0Var.h(kyh0.common_yes)), null, null, null, 254)), null, 10000L, false, a2, 0, 1280, null);
                            if (drivingModeNotification != null) {
                                upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$2$1.L$0 = null;
                                upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$2$1.L$1 = null;
                                upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$2$1.L$2 = null;
                                upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$2$1.L$3 = null;
                                upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$2$1.L$4 = null;
                                upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$2$1.label = 1;
                                if (this.a.emit(drivingModeNotification, upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$2$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        }
                    }
                    drivingModeNotification = null;
                    if (drivingModeNotification != null) {
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
        upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$2$1 = new UpcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$2$1(this, continuation);
        Object obj22 = upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
