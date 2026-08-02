package org.chromium.base;

import internal.J.N;
import org.chromium.base.DeviceInfo;
import xsna.dyx;

/* loaded from: classes8.dex */
class DeviceInfoJni implements DeviceInfo.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static dyx sOverride;

    public static DeviceInfo.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new DeviceInfoJni() : (DeviceInfo.Natives) obj;
    }

    public static void setInstanceForTesting(DeviceInfo.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.base.DeviceInfo.Natives
    public void fillFields(String str, boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5) {
        N.MFWeJGQZ(str, z, z2, z3, z4, i, z5);
    }
}
