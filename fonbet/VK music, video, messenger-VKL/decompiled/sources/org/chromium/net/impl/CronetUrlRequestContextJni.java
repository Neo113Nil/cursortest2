package org.chromium.net.impl;

import internal.J.N;
import org.chromium.net.impl.CronetUrlRequestContext;
import xsna.dyx;

/* loaded from: classes11.dex */
class CronetUrlRequestContextJni implements CronetUrlRequestContext.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static dyx sOverride;

    public static CronetUrlRequestContext.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new CronetUrlRequestContextJni() : (CronetUrlRequestContext.Natives) obj;
    }

    public static void setInstanceForTesting(CronetUrlRequestContext.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void addPkp(long j, String str, byte[][] bArr, boolean z, long j2) {
        N.Muq3ic6p(j, str, bArr, z, j2);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void addQuicHint(long j, String str, int i, int i2) {
        N.MyRIv1Ij(j, str, i, i2);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void configureNetworkQualityEstimatorForTesting(long j, boolean z, boolean z2, boolean z3) {
        N.M6sIJDgy_ForTesting(j, z, z2, z3);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public long createRequestContextAdapter(long j) {
        return N.M135Cu0D(j);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public long createRequestContextConfig(byte[] bArr) {
        return N.MB3ntV7V(bArr);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void destroy(long j) {
        N.MeBvNXm5(j);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void flushWritePropertiesForTesting(long j) {
        N.MMxc_BIz_ForTesting(j);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void initRequestContextOnInitThread(long j, CronetUrlRequestContext cronetUrlRequestContext) {
        N.M6Dz0nZ5(j, cronetUrlRequestContext);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public boolean isValidHeaderName(String str) {
        return N.MwaXYQQA(str);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public boolean isValidHeaderValue(String str) {
        return N.MYsbhTIY(str);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void provideRTTObservations(long j, boolean z) {
        N.MpnFLFF2(j, z);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void provideThroughputObservations(long j, boolean z) {
        N.MnPUhNKP(j, z);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void startNetLogToDisk(long j, String str, boolean z, int i) {
        N.MTULt02u(j, str, z, i);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public boolean startNetLogToFile(long j, String str, boolean z) {
        return N.MgwJQAH1(j, str, z);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void stopNetLog(long j) {
        N.MKFm_qQ7(j);
    }
}
