package org.chromium.net.impl;

import internal.J.N;
import org.chromium.net.impl.CronetUploadDataStream;
import xsna.dyx;

/* loaded from: classes8.dex */
class CronetUploadDataStreamJni implements CronetUploadDataStream.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static dyx sOverride;

    public static CronetUploadDataStream.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new CronetUploadDataStreamJni() : (CronetUploadDataStream.Natives) obj;
    }

    public static void setInstanceForTesting(CronetUploadDataStream.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public long attachUploadDataToRequest(CronetUploadDataStream cronetUploadDataStream, long j, long j2) {
        return N.MA4X1aZa(cronetUploadDataStream, j, j2);
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public long createAdapterForTesting(CronetUploadDataStream cronetUploadDataStream) {
        return N.MnDEFloP_ForTesting(cronetUploadDataStream);
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public long createUploadDataStreamForTesting(CronetUploadDataStream cronetUploadDataStream, long j, long j2) {
        return N.MymnNC4__ForTesting(cronetUploadDataStream, j, j2);
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public void destroy(long j) {
        N.MMW1G0N1(j);
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public void onReadSucceeded(long j, int i, boolean z) {
        N.MpWH3VIr(j, i, z);
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public void onRewindSucceeded(long j) {
        N.MFpRjSMv(j);
    }
}
