package org.chromium.net;

import internal.J.N;
import org.chromium.net.X509Util;
import xsna.dyx;

/* loaded from: classes8.dex */
class X509UtilJni implements X509Util.Natives {
    private static dyx sOverride;

    public static X509Util.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new X509UtilJni() : (X509Util.Natives) obj;
    }

    public static void setInstanceForTesting(X509Util.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.net.X509Util.Natives
    public void notifyClientCertStoreChanged() {
        N.MJdorYDE();
    }

    @Override // org.chromium.net.X509Util.Natives
    public void notifyTrustStoreChanged() {
        N.M6C2IQIc();
    }
}
