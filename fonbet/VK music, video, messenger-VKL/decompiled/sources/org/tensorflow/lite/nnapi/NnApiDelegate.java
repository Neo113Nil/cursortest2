package org.tensorflow.lite.nnapi;

import org.tensorflow.lite.TensorFlowLite;
import xsna.ktl;

/* loaded from: classes8.dex */
public class NnApiDelegate implements ktl, AutoCloseable {
    public long b;

    public NnApiDelegate() {
        TensorFlowLite.a();
        this.b = createDelegate(-1, null, null, null, -1, false, false, false);
    }

    private static native long createDelegate(int i, String str, String str2, String str3, int i2, boolean z, boolean z2, boolean z3);

    private static native void deleteDelegate(long j);

    private static native int getNnapiErrno(long j);

    @Override // java.lang.AutoCloseable
    public final void close() {
        long j = this.b;
        if (j != 0) {
            deleteDelegate(j);
            this.b = 0L;
        }
    }

    @Override // xsna.ktl
    public final long m() {
        return this.b;
    }
}
