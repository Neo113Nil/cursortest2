package org.chromium.base;

import internal.J.N;
import org.chromium.base.PathService;
import xsna.dyx;

/* loaded from: classes8.dex */
class PathServiceJni implements PathService.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static dyx sOverride;

    public static PathService.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new PathServiceJni() : (PathService.Natives) obj;
    }

    public static void setInstanceForTesting(PathService.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.base.PathService.Natives
    public void override(int i, String str) {
        N.M6H_IiaF(i, str);
    }
}
