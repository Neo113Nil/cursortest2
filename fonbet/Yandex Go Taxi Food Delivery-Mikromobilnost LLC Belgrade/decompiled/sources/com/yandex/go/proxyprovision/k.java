package com.yandex.go.proxyprovision;

import defpackage.h3y;
import defpackage.ny61;
import defpackage.yws;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class k {
    public final h3y a;

    public k(h3y h3yVar) {
        this.a = h3yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        MetricaRtmConfigurationImpl$isEnabled$1 metricaRtmConfigurationImpl$isEnabled$1;
        int i;
        if (continuationImpl instanceof MetricaRtmConfigurationImpl$isEnabled$1) {
            metricaRtmConfigurationImpl$isEnabled$1 = (MetricaRtmConfigurationImpl$isEnabled$1) continuationImpl;
            int i2 = metricaRtmConfigurationImpl$isEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                metricaRtmConfigurationImpl$isEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = metricaRtmConfigurationImpl$isEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = metricaRtmConfigurationImpl$isEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    yws ywsVar = (yws) this.a.get();
                    metricaRtmConfigurationImpl$isEnabled$1.label = 1;
                    obj = ywsVar.a.b(metricaRtmConfigurationImpl$isEnabled$1);
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
                return Boolean.valueOf(((GeProxyProvisionExperiment) obj).e);
            }
        }
        metricaRtmConfigurationImpl$isEnabled$1 = new MetricaRtmConfigurationImpl$isEnabled$1(this, continuationImpl);
        Object obj2 = metricaRtmConfigurationImpl$isEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = metricaRtmConfigurationImpl$isEnabled$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((GeProxyProvisionExperiment) obj2).e);
    }
}
