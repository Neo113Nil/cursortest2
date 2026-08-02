package org.chromium.net;

import internal.J.N;
import org.chromium.net.ProxyChangeListener;
import xsna.dyx;

/* loaded from: classes8.dex */
class ProxyChangeListenerJni implements ProxyChangeListener.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static dyx sOverride;

    public static ProxyChangeListener.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new ProxyChangeListenerJni() : (ProxyChangeListener.Natives) obj;
    }

    public static void setInstanceForTesting(ProxyChangeListener.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.net.ProxyChangeListener.Natives
    public void proxySettingsChanged(long j) {
        N.MCIk73GZ(j);
    }

    @Override // org.chromium.net.ProxyChangeListener.Natives
    public void proxySettingsChangedTo(long j, String str, int i, String str2, String[] strArr) {
        N.MyoFZt$2(j, str, i, str2, strArr);
    }
}
