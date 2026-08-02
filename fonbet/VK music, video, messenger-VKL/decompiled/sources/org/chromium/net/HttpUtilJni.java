package org.chromium.net;

import internal.J.N;
import org.chromium.net.HttpUtil;
import xsna.dyx;

/* loaded from: classes8.dex */
class HttpUtilJni implements HttpUtil.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static dyx sOverride;

    public static HttpUtil.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new HttpUtilJni() : (HttpUtil.Natives) obj;
    }

    public static void setInstanceForTesting(HttpUtil.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.net.HttpUtil.Natives
    public boolean isAllowedHeader(String str, String str2) {
        return N.MorcXgQd(str, str2);
    }
}
