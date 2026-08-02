package org.chromium.base;

import internal.J.N;
import org.chromium.base.JniCallbackImpl;
import xsna.dyx;

/* loaded from: classes8.dex */
class JniCallbackImplJni implements JniCallbackImpl.Natives {
    private static dyx sOverride;

    public static JniCallbackImpl.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new JniCallbackImplJni() : (JniCallbackImpl.Natives) obj;
    }

    public static void setInstanceForTesting(JniCallbackImpl.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.base.JniCallbackImpl.Natives
    public void destroy(boolean z, long j) {
        N.MsfzhsO7(z, j);
    }

    @Override // org.chromium.base.JniCallbackImpl.Natives
    public void onResult(boolean z, long j, Object obj) {
        N.Mv1m4r87(z, j, obj);
    }
}
