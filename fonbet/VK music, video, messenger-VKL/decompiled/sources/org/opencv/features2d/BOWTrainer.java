package org.opencv.features2d;

/* loaded from: classes8.dex */
public class BOWTrainer {
    private static native void add_0(long j, long j2);

    private static native void clear_0(long j);

    private static native long cluster_0(long j, long j2);

    private static native long cluster_1(long j);

    private static native void delete(long j);

    private static native int descriptorsCount_0(long j);

    private static native long getDescriptors_0(long j);

    public void finalize() throws Throwable {
        delete(0L);
    }
}
