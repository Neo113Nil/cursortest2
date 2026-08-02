package org.opencv.ximgproc;

import org.opencv.core.Algorithm;

/* loaded from: classes8.dex */
public class SparseMatchInterpolator extends Algorithm {
    private static native void delete(long j);

    private static native void interpolate_0(long j, long j2, long j3, long j4, long j5, long j6);

    @Override // org.opencv.core.Algorithm
    public void finalize() throws Throwable {
        delete(this.a);
    }
}
