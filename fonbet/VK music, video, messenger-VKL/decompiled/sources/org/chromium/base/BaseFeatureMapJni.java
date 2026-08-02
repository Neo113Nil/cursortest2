package org.chromium.base;

import internal.J.N;
import org.chromium.base.BaseFeatureMap;
import xsna.dyx;

/* loaded from: classes8.dex */
public class BaseFeatureMapJni implements BaseFeatureMap.Natives {
    private static dyx sOverride;

    public static BaseFeatureMap.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new BaseFeatureMapJni() : (BaseFeatureMap.Natives) obj;
    }

    public static void setInstanceForTesting(BaseFeatureMap.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.base.BaseFeatureMap.Natives
    public long getNativeMap() {
        return N.MshdYEWu();
    }
}
