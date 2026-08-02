package org.chromium.net.impl;

import internal.J.N;
import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetBidirectionalStream;
import xsna.dyx;

/* loaded from: classes8.dex */
class CronetBidirectionalStreamJni implements CronetBidirectionalStream.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static dyx sOverride;

    public static CronetBidirectionalStream.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new CronetBidirectionalStreamJni() : (CronetBidirectionalStream.Natives) obj;
    }

    public static void setInstanceForTesting(CronetBidirectionalStream.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public long createBidirectionalStream(CronetBidirectionalStream cronetBidirectionalStream, long j, boolean z, boolean z2, int i, boolean z3, int i2, long j2) {
        return N.MqTDYvZd(cronetBidirectionalStream, j, z, z2, i, z3, i2, j2);
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public void destroy(long j, boolean z) {
        N.MS2l1kNx(j, z);
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public boolean readData(long j, ByteBuffer byteBuffer, int i, int i2) {
        return N.Md_rPmgC(j, byteBuffer, i, i2);
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public void sendRequestHeaders(long j) {
        N.MGLIR7Sc(j);
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public int start(long j, String str, int i, String str2, String[] strArr, boolean z) {
        return N.McDUim_I(j, str, i, str2, strArr, z);
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public boolean writevData(long j, ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z) {
        return N.MwJCBTMQ(j, byteBufferArr, iArr, iArr2, z);
    }
}
