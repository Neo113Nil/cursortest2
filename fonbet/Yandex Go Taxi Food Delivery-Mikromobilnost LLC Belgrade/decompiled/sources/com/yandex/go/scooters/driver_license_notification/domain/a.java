package com.yandex.go.scooters.driver_license_notification.domain;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.xno0;
import defpackage.yno0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersDriverLicenseNotificationInteractor$listenTopBannerCommunication$$inlined$map$1$2$1 scootersDriverLicenseNotificationInteractor$listenTopBannerCommunication$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ScootersDriverLicenseNotificationInteractor$listenTopBannerCommunication$$inlined$map$1$2$1) {
            scootersDriverLicenseNotificationInteractor$listenTopBannerCommunication$$inlined$map$1$2$1 = (ScootersDriverLicenseNotificationInteractor$listenTopBannerCommunication$$inlined$map$1$2$1) continuation;
            int i2 = scootersDriverLicenseNotificationInteractor$listenTopBannerCommunication$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDriverLicenseNotificationInteractor$listenTopBannerCommunication$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersDriverLicenseNotificationInteractor$listenTopBannerCommunication$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDriverLicenseNotificationInteractor$listenTopBannerCommunication$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    yno0 yno0Var = (yno0) obj;
                    xno0 xno0Var = yno0Var != null ? yno0Var.b : null;
                    scootersDriverLicenseNotificationInteractor$listenTopBannerCommunication$$inlined$map$1$2$1.L$0 = null;
                    scootersDriverLicenseNotificationInteractor$listenTopBannerCommunication$$inlined$map$1$2$1.L$1 = null;
                    scootersDriverLicenseNotificationInteractor$listenTopBannerCommunication$$inlined$map$1$2$1.L$2 = null;
                    scootersDriverLicenseNotificationInteractor$listenTopBannerCommunication$$inlined$map$1$2$1.L$3 = null;
                    scootersDriverLicenseNotificationInteractor$listenTopBannerCommunication$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(xno0Var, scootersDriverLicenseNotificationInteractor$listenTopBannerCommunication$$inlined$map$1$2$1) == coroutineSingletons) {
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
        scootersDriverLicenseNotificationInteractor$listenTopBannerCommunication$$inlined$map$1$2$1 = new ScootersDriverLicenseNotificationInteractor$listenTopBannerCommunication$$inlined$map$1$2$1(this, continuation);
        Object obj22 = scootersDriverLicenseNotificationInteractor$listenTopBannerCommunication$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDriverLicenseNotificationInteractor$listenTopBannerCommunication$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
