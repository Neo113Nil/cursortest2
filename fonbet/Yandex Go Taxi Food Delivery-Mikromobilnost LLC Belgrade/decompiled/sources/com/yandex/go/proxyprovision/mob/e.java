package com.yandex.go.proxyprovision.mob;

import com.yandex.go.proxyprovision.GeProxyProvisionExperiment;
import defpackage.h3y;
import defpackage.ny61;
import defpackage.yws;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class e {
    public final h3y a;

    public e(h3y h3yVar) {
        this.a = h3yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        GoMobPulseProxyProvider$pulseProxy$1 goMobPulseProxyProvider$pulseProxy$1;
        int i;
        if (continuationImpl instanceof GoMobPulseProxyProvider$pulseProxy$1) {
            goMobPulseProxyProvider$pulseProxy$1 = (GoMobPulseProxyProvider$pulseProxy$1) continuationImpl;
            int i2 = goMobPulseProxyProvider$pulseProxy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                goMobPulseProxyProvider$pulseProxy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = goMobPulseProxyProvider$pulseProxy$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = goMobPulseProxyProvider$pulseProxy$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    yws ywsVar = (yws) this.a.get();
                    goMobPulseProxyProvider$pulseProxy$1.label = 1;
                    obj = ywsVar.a.b(goMobPulseProxyProvider$pulseProxy$1);
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
                GeProxyProvisionExperiment geProxyProvisionExperiment = (GeProxyProvisionExperiment) obj;
                return !geProxyProvisionExperiment.b ? geProxyProvisionExperiment.d : "https://api.browser.yandexcom.net/uma_proto";
            }
        }
        goMobPulseProxyProvider$pulseProxy$1 = new GoMobPulseProxyProvider$pulseProxy$1(this, continuationImpl);
        Object obj2 = goMobPulseProxyProvider$pulseProxy$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = goMobPulseProxyProvider$pulseProxy$1.label;
        if (i != 0) {
        }
        GeProxyProvisionExperiment geProxyProvisionExperiment2 = (GeProxyProvisionExperiment) obj2;
        if (!geProxyProvisionExperiment2.b) {
        }
    }
}
