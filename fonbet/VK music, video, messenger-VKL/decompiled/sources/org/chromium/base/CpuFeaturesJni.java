package org.chromium.base;

import internal.J.N;
import org.chromium.base.CpuFeatures;
import xsna.dyx;

/* loaded from: classes8.dex */
class CpuFeaturesJni implements CpuFeatures.Natives {
    private static dyx sOverride;

    public static CpuFeatures.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new CpuFeaturesJni() : (CpuFeatures.Natives) obj;
    }

    public static void setInstanceForTesting(CpuFeatures.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.base.CpuFeatures.Natives
    public int getCoreCount() {
        return N.MOiBJ1qS();
    }

    @Override // org.chromium.base.CpuFeatures.Natives
    public long getCpuFeatures() {
        return N.ML0T8q1U();
    }
}
