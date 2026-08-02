package com.yandex.go.proxyprovision;

import defpackage.afh;
import defpackage.czo0;
import defpackage.hbp0;
import defpackage.jst;
import defpackage.ny61;
import defpackage.rby;
import defpackage.yg4;
import defpackage.yw60;
import defpackage.yws;
import io.appmetrica.analytics.AppMetrica;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a implements yw60 {
    public final yws a;
    public final afh b;
    public final yg4 c;
    public final hbp0 d = new hbp0(new czo0(14), "AppMetricaUserData", new rby("Error in AppMetricaUserData scope", 0));

    public a(yws ywsVar, afh afhVar, yg4 yg4Var) {
        this.a = ywsVar;
        this.b = afhVar;
        this.c = yg4Var;
    }

    @Override // defpackage.yw60
    public final void a(boolean z) {
        hbp0 hbp0Var = this.d;
        hbp0Var.a();
        hbp0.e(hbp0Var, null, null, new AppMetricaUserDataInteractorImpl$start$1(this, null), 3);
    }

    @Override // defpackage.yw60
    public final void b() {
        this.d.b();
        yg4 yg4Var = this.c;
        if (((Boolean) yg4Var.b.getValue(yg4Var, yg4.c[0])).booleanValue()) {
            jst.e.getClass();
            AppMetrica.setDataSendingEnabled(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        AppMetricaUserDataInteractorImpl$isMetricaDataSendingEnabled$1 appMetricaUserDataInteractorImpl$isMetricaDataSendingEnabled$1;
        int i;
        GeProxyProvisionExperiment geProxyProvisionExperiment;
        if (continuationImpl instanceof AppMetricaUserDataInteractorImpl$isMetricaDataSendingEnabled$1) {
            appMetricaUserDataInteractorImpl$isMetricaDataSendingEnabled$1 = (AppMetricaUserDataInteractorImpl$isMetricaDataSendingEnabled$1) continuationImpl;
            int i2 = appMetricaUserDataInteractorImpl$isMetricaDataSendingEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                appMetricaUserDataInteractorImpl$isMetricaDataSendingEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = appMetricaUserDataInteractorImpl$isMetricaDataSendingEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = appMetricaUserDataInteractorImpl$isMetricaDataSendingEnabled$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    appMetricaUserDataInteractorImpl$isMetricaDataSendingEnabled$1.label = 1;
                    obj = this.a.a.b(appMetricaUserDataInteractorImpl$isMetricaDataSendingEnabled$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                geProxyProvisionExperiment = (GeProxyProvisionExperiment) obj;
                if (geProxyProvisionExperiment.b) {
                    this.b.getClass();
                } else {
                    z = geProxyProvisionExperiment.h;
                }
                return Boolean.valueOf(z);
            }
        }
        appMetricaUserDataInteractorImpl$isMetricaDataSendingEnabled$1 = new AppMetricaUserDataInteractorImpl$isMetricaDataSendingEnabled$1(this, continuationImpl);
        Object obj2 = appMetricaUserDataInteractorImpl$isMetricaDataSendingEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = appMetricaUserDataInteractorImpl$isMetricaDataSendingEnabled$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        geProxyProvisionExperiment = (GeProxyProvisionExperiment) obj2;
        if (geProxyProvisionExperiment.b) {
        }
        return Boolean.valueOf(z2);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "AppMetricaUserDataInteractorImpl";
    }
}
