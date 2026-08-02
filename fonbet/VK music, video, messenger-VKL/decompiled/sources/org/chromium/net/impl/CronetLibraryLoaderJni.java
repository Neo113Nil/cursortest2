package org.chromium.net.impl;

import internal.J.N;
import org.chromium.net.impl.CronetLibraryLoader;
import xsna.dyx;

/* loaded from: classes11.dex */
class CronetLibraryLoaderJni implements CronetLibraryLoader.Natives {
    private static dyx sOverride;

    public static CronetLibraryLoader.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new CronetLibraryLoaderJni() : (CronetLibraryLoader.Natives) obj;
    }

    public static void setInstanceForTesting(CronetLibraryLoader.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.net.impl.CronetLibraryLoader.Natives
    public void cronetInitOnInitThread(int i) {
        N.MROCxiBo(i);
    }

    @Override // org.chromium.net.impl.CronetLibraryLoader.Natives
    public String getCronetVersion() {
        return (String) N.M6xubM8G();
    }

    @Override // org.chromium.net.impl.CronetLibraryLoader.Natives
    public int getTraceNetLogCaptureModeForTesting() {
        return N.MNL5_Cay_ForTesting();
    }

    @Override // org.chromium.net.impl.CronetLibraryLoader.Natives
    public void nativeInit(boolean z) {
        N.MAuYp$hS(z);
    }

    @Override // org.chromium.net.impl.CronetLibraryLoader.Natives
    public void setMinLogLevel(int i) {
        N.Mrxu2pQS(i);
    }
}
