package org.chromium.net;

import internal.J.N;
import org.chromium.net.NetworkActiveNotifier;
import xsna.dyx;

/* loaded from: classes8.dex */
class NetworkActiveNotifierJni implements NetworkActiveNotifier.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static dyx sOverride;

    public static NetworkActiveNotifier.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new NetworkActiveNotifierJni() : (NetworkActiveNotifier.Natives) obj;
    }

    public static void setInstanceForTesting(NetworkActiveNotifier.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.net.NetworkActiveNotifier.Natives
    public void notifyOfDefaultNetworkActive(long j) {
        N.MSZPA7qE(j);
    }
}
