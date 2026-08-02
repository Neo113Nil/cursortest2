package org.opencv.ximgproc;

import org.opencv.core.Algorithm;

/* loaded from: classes8.dex */
public class FastGlobalSmootherFilter extends Algorithm {
    private static native void delete(long j);

    private static native void filter_0(long j, long j2, long j3);

    @Override // org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
