package org.chromium.net.impl;

import internal.J.N;
import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetUrlRequest;
import org.chromium.net.impl.VersionSafeCallbacks;
import xsna.dyx;

/* loaded from: classes8.dex */
class CronetUrlRequestJni implements CronetUrlRequest.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static dyx sOverride;

    public static CronetUrlRequest.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new CronetUrlRequestJni() : (CronetUrlRequest.Natives) obj;
    }

    public static void setInstanceForTesting(CronetUrlRequest.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public boolean addRequestHeader(long j, String str, String str2) {
        return N.MvHusd1J(j, str, str2);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public long createRequestAdapter(CronetUrlRequest cronetUrlRequest, long j, String str, int i, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, int i4, byte[] bArr, ByteBuffer byteBuffer, int i5, int i6, String str2, long j2) {
        return N.MuOIsMvf(cronetUrlRequest, j, str, i, z, z2, z3, i2, z4, i3, i4, bArr, byteBuffer, i5, i6, str2, j2);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public void destroy(long j, boolean z) {
        N.M4znfYdB(j, z);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public void followDeferredRedirect(long j) {
        N.Mhp54Oqs(j);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public void getStatus(long j, VersionSafeCallbacks.UrlRequestStatusListener urlRequestStatusListener) {
        N.MgIIMpT9(j, urlRequestStatusListener);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public boolean readData(long j, ByteBuffer byteBuffer, int i, int i2) {
        return N.MfCxA8r3(j, byteBuffer, i, i2);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public boolean setHttpMethod(long j, String str) {
        return N.M51RPBJe(j, str);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public void start(long j) {
        N.MabZ5m6r(j);
    }
}
