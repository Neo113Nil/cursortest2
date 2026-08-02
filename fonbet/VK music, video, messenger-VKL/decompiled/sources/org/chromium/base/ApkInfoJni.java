package org.chromium.base;

import internal.J.N;
import org.chromium.base.ApkInfo;
import xsna.dyx;

/* loaded from: classes11.dex */
class ApkInfoJni implements ApkInfo.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static dyx sOverride;

    public static ApkInfo.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new ApkInfoJni() : (ApkInfo.Natives) obj;
    }

    public static void setInstanceForTesting(ApkInfo.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.base.ApkInfo.Natives
    public void fillFields(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, int i) {
        N.MOh5qbSu(str, str2, str3, str4, str5, str6, str7, str8, z, i);
    }
}
