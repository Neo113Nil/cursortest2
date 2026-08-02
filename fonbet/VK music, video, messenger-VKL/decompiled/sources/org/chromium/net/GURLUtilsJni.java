package org.chromium.net;

import internal.J.N;
import org.chromium.net.GURLUtils;
import xsna.dyx;

/* loaded from: classes8.dex */
public class GURLUtilsJni implements GURLUtils.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static dyx sOverride;

    public static GURLUtils.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new GURLUtilsJni() : (GURLUtils.Natives) obj;
    }

    public static void setInstanceForTesting(GURLUtils.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.net.GURLUtils.Natives
    public String getOrigin(String str) {
        return (String) N.MpCt7siL(str);
    }
}
