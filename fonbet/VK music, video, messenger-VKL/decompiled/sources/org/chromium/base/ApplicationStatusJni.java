package org.chromium.base;

import internal.J.N;
import org.chromium.base.ApplicationStatus;
import xsna.dyx;

/* loaded from: classes8.dex */
class ApplicationStatusJni implements ApplicationStatus.Natives {
    private static dyx sOverride;

    public static ApplicationStatus.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new ApplicationStatusJni() : (ApplicationStatus.Natives) obj;
    }

    public static void setInstanceForTesting(ApplicationStatus.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.base.ApplicationStatus.Natives
    public void onApplicationStateChange(int i) {
        N.MiAkQ_SU(i);
    }
}
