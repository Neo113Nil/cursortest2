package com.yandex.go.navigator.driving;

import defpackage.ny61;
import defpackage.v3j0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class u implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ w b;

    public u(vpr vprVar, w wVar) {
        this.a = vprVar;
        this.b = wVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
    
        if (r6.emit(r8, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DrivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1 drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1;
        int i;
        vpr vprVar;
        DrivingModeNotification drivingModeNotification;
        if (continuation instanceof DrivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1) {
            drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1 = (DrivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1) continuation;
            int i2 = drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    com.yandex.go.navigator.incidents.report.a aVar = this.b.f;
                    drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1.L$0 = null;
                    drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1.L$1 = null;
                    drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1.L$2 = null;
                    vprVar = this.a;
                    drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1.L$3 = vprVar;
                    drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1.L$4 = null;
                    drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1.L$5 = null;
                    drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1.label = 1;
                    obj2 = aVar.a((v3j0) obj, drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar = (vpr) drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1.L$3;
                    kotlin.b.b(obj2);
                }
                drivingModeNotification = (DrivingModeNotification) obj2;
                if (drivingModeNotification == null) {
                    drivingModeNotification = null;
                }
                if (drivingModeNotification != null) {
                    drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1.L$0 = null;
                    drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1.L$1 = null;
                    drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1.L$2 = null;
                    drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1.L$3 = null;
                    drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1.L$4 = null;
                    drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1.L$5 = null;
                    drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1.label = 2;
                }
                return zy11.a;
            }
        }
        drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1 = new DrivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1(this, continuation);
        Object obj22 = drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1.label;
        if (i != 0) {
        }
        drivingModeNotification = (DrivingModeNotification) obj22;
        if (drivingModeNotification == null) {
        }
        if (drivingModeNotification != null) {
        }
        return zy11.a;
    }
}
