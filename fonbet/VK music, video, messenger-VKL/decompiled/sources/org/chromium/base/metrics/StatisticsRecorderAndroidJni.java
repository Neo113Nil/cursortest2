package org.chromium.base.metrics;

import internal.J.N;
import org.chromium.base.metrics.StatisticsRecorderAndroid;
import xsna.dyx;

/* loaded from: classes8.dex */
class StatisticsRecorderAndroidJni implements StatisticsRecorderAndroid.Natives {
    private static dyx sOverride;

    public static StatisticsRecorderAndroid.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new StatisticsRecorderAndroidJni() : (StatisticsRecorderAndroid.Natives) obj;
    }

    public static void setInstanceForTesting(StatisticsRecorderAndroid.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.base.metrics.StatisticsRecorderAndroid.Natives
    public String toJson(int i) {
        return (String) N.MvO$oy3r(i);
    }
}
