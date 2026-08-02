package org.chromium.net;

import internal.J.N;
import org.chromium.net.NetworkChangeNotifier;
import xsna.dyx;

/* loaded from: classes11.dex */
class NetworkChangeNotifierJni implements NetworkChangeNotifier.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static dyx sOverride;

    public static NetworkChangeNotifier.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new NetworkChangeNotifierJni() : (NetworkChangeNotifier.Natives) obj;
    }

    public static void setInstanceForTesting(NetworkChangeNotifier.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyConnectionCostChanged(long j, int i) {
        N.Mg0W7eRL(j, i);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyConnectionSubtypeChanged(long j, int i) {
        N.MCEqyWQ0(j, i);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyConnectionTypeChanged(long j, int i, long j2) {
        N.MbPIImnU(j, i, j2);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyOfNetworkConnect(long j, long j2, int i) {
        N.MBT1i5cd(j, j2, i);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyOfNetworkDisconnect(long j, long j2) {
        N.MDpuHJTB(j, j2);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyOfNetworkSoonToDisconnect(long j, long j2) {
        N.MiJIMrTb(j, j2);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyPurgeActiveNetworkList(long j, long[] jArr) {
        N.MpF$179U(j, jArr);
    }
}
