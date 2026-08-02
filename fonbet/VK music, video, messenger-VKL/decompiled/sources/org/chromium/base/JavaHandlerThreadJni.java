package org.chromium.base;

import internal.J.N;
import org.chromium.base.JavaHandlerThread;
import xsna.dyx;

/* loaded from: classes8.dex */
class JavaHandlerThreadJni implements JavaHandlerThread.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static dyx sOverride;

    public static JavaHandlerThread.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new JavaHandlerThreadJni() : (JavaHandlerThread.Natives) obj;
    }

    public static void setInstanceForTesting(JavaHandlerThread.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.base.JavaHandlerThread.Natives
    public void initializeThread(long j, long j2) {
        N.MJcct7gJ(j, j2);
    }

    @Override // org.chromium.base.JavaHandlerThread.Natives
    public void onLooperStopped(long j) {
        N.MYwg$x8E(j);
    }
}
