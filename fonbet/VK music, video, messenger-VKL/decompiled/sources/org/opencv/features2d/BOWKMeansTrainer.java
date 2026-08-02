package org.opencv.features2d;

/* loaded from: classes8.dex */
public class BOWKMeansTrainer extends BOWTrainer {
    private static native long BOWKMeansTrainer_0(int i, int i2, int i3, double d, int i4, int i5);

    private static native long BOWKMeansTrainer_1(int i, int i2, int i3, double d, int i4);

    private static native long BOWKMeansTrainer_2(int i, int i2, int i3, double d);

    private static native long BOWKMeansTrainer_3(int i);

    private static native long cluster_0(long j, long j2);

    private static native long cluster_1(long j);

    private static native void delete(long j);

    @Override // org.opencv.features2d.BOWTrainer
    public final void finalize() throws Throwable {
        delete(0L);
    }
}
