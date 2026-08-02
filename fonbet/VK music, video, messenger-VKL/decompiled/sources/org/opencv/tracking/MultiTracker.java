package org.opencv.tracking;

import org.opencv.core.Algorithm;

/* loaded from: classes8.dex */
public class MultiTracker extends Algorithm {
    public MultiTracker() {
        super(MultiTracker_0());
    }

    private static native long MultiTracker_0();

    private static native boolean add_0(long j, long j2, long j3, double d, double d2, double d3, double d4);

    private static native long create_0();

    private static native void delete(long j);

    private static native long getObjects_0(long j);

    private static native boolean update_0(long j, long j2, long j3);

    @Override // org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
