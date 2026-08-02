package org.opencv.ximgproc;

import org.opencv.core.Algorithm;

/* loaded from: classes8.dex */
public class AdaptiveManifoldFilter extends Algorithm {
    private static native void collectGarbage_0(long j);

    private static native long create_0();

    private static native void delete(long j);

    private static native void filter_0(long j, long j2, long j3, long j4);

    private static native void filter_1(long j, long j2, long j3);

    @Override // org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
