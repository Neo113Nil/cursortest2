package org.chromium.base.metrics;

import internal.J.N;
import org.chromium.base.Callback;
import org.chromium.base.metrics.NativeUmaRecorder;
import xsna.dyx;

/* loaded from: classes8.dex */
public class NativeUmaRecorderJni implements NativeUmaRecorder.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static dyx sOverride;

    public static NativeUmaRecorder.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new NativeUmaRecorderJni() : (NativeUmaRecorder.Natives) obj;
    }

    public static void setInstanceForTesting(NativeUmaRecorder.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public long addActionCallbackForTesting(Callback callback) {
        return N.MEfoV$c9_ForTesting(callback);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public long createHistogramSnapshotForTesting() {
        return N.MlZcyPle_ForTesting();
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public void destroyHistogramSnapshotForTesting(long j) {
        N.MqHgOQAN_ForTesting(j);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public long[] getHistogramSamplesForTesting(String str) {
        return (long[]) N.MDr5ROsj_ForTesting(str);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public int getHistogramTotalCountForTesting(String str, long j) {
        return N.MP$RSyC4_ForTesting(str, j);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public int getHistogramValueCountForTesting(String str, int i, long j) {
        return N.M_1WxmXI_ForTesting(str, i, j);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public long recordBooleanHistogram(String str, long j, boolean z) {
        return N.MtKTTHie(str, j, z);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public long recordExponentialHistogram(String str, long j, int i, int i2, int i3, int i4) {
        return N.MILRV9Ch(str, j, i, i2, i3, i4);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public long recordLinearHistogram(String str, long j, int i, int i2, int i3, int i4) {
        return N.M$oMD214(str, j, i, i2, i3, i4);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public long recordSparseHistogram(String str, long j, int i) {
        return N.Mk1ai9mx(str, j, i);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public void recordUserAction(String str, long j) {
        N.MTDsfZGe(str, j);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public void removeActionCallbackForTesting(long j) {
        N.MUBbgum1_ForTesting(j);
    }
}
