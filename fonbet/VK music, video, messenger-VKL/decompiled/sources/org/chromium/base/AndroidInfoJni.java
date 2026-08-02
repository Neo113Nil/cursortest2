package org.chromium.base;

import internal.J.N;
import org.chromium.base.AndroidInfo;
import xsna.dyx;

/* loaded from: classes11.dex */
class AndroidInfoJni implements AndroidInfo.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static dyx sOverride;

    public static AndroidInfo.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new AndroidInfoJni() : (AndroidInfo.Natives) obj;
    }

    public static void setInstanceForTesting(AndroidInfo.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.base.AndroidInfo.Natives
    public void fillFields(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, boolean z, String str14) {
        N.MYc8mtnY(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, i, z, str14);
    }
}
