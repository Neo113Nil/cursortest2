package org.chromium.base;

import internal.J.N;
import org.chromium.base.MemoryPressureListener;
import xsna.dyx;

/* loaded from: classes8.dex */
class MemoryPressureListenerJni implements MemoryPressureListener.Natives {
    private static dyx sOverride;

    public static MemoryPressureListener.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new MemoryPressureListenerJni() : (MemoryPressureListener.Natives) obj;
    }

    public static void setInstanceForTesting(MemoryPressureListener.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.base.MemoryPressureListener.Natives
    public boolean isTrimMemoryBackgroundCritical() {
        return N.MaQ9HvMU();
    }

    @Override // org.chromium.base.MemoryPressureListener.Natives
    public void onMemoryPressure(int i) {
        N.MZJzyjAa(i);
    }

    @Override // org.chromium.base.MemoryPressureListener.Natives
    public void onPreFreeze() {
        N.M7JarlfB();
    }
}
