package com.yandex.go.navigator.driving;

import android.content.Context;
import defpackage.avj0;
import defpackage.dvq;
import defpackage.evq;
import defpackage.fvq;
import defpackage.gvq;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.v2h0;
import defpackage.vng;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class s implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ w b;

    public s(vpr vprVar, w wVar) {
        this.a = vprVar;
        this.b = wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DrivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$2$1 drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$2$1;
        int i;
        DrivingModeNotification drivingModeNotification;
        if (continuation instanceof DrivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$2$1) {
            drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$2$1 = (DrivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    gvq gvqVar = (gvq) obj;
                    r rVar = this.b.a;
                    rVar.getClass();
                    if (jl40.l(gvqVar, fvq.a)) {
                        Context context = rVar.a;
                        drivingModeNotification = new DrivingModeNotification(context, "1011", vng.t(v2h0.ic_check, context), ((avj0) rVar.b).h(kyh0.navigator_incidents_report_notification_possitive), null, null, null, 0L, false, null, 0, 2032, null);
                    } else if (gvqVar instanceof dvq) {
                        Context context2 = rVar.a;
                        drivingModeNotification = new DrivingModeNotification(context2, "1011", vng.t(v2h0.ic_warning, context2), ((dvq) gvqVar).b, null, null, null, 0L, false, null, 0, 2032, null);
                    } else {
                        if (!jl40.l(gvqVar, evq.a)) {
                            w511.b();
                            return null;
                        }
                        drivingModeNotification = null;
                    }
                    if (drivingModeNotification != null) {
                        drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$2$1.L$0 = null;
                        drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$2$1.L$1 = null;
                        drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$2$1.L$2 = null;
                        drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$2$1.L$3 = null;
                        drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$2$1.L$4 = null;
                        drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(drivingModeNotification, drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$2$1 = new DrivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
