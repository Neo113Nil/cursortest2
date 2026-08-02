package org.opencv.ximgproc;

import org.opencv.core.Algorithm;

/* loaded from: classes8.dex */
public class FastLineDetector extends Algorithm {
    private static native void delete(long j);

    private static native void detect_0(long j, long j2, long j3);

    private static native void drawSegments_0(long j, long j2, long j3, boolean z);

    private static native void drawSegments_1(long j, long j2, long j3);

    @Override // org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
