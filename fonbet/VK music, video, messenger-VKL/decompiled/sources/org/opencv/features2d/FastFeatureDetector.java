package org.opencv.features2d;

/* loaded from: classes8.dex */
public class FastFeatureDetector extends Feature2D {
    public static FastFeatureDetector c() {
        return new FastFeatureDetector(create_0(10, true, 2));
    }

    private static native long create_0(int i, boolean z, int i2);

    private static native long create_1(int i, boolean z);

    private static native long create_2(int i);

    private static native long create_3();

    private static native void delete(long j);

    private static native String getDefaultName_0(long j);

    private static native boolean getNonmaxSuppression_0(long j);

    private static native int getThreshold_0(long j);

    private static native int getType_0(long j);

    private static native void setNonmaxSuppression_0(long j, boolean z);

    private static native void setThreshold_0(long j, int i);

    private static native void setType_0(long j, int i);

    @Override // org.opencv.features2d.Feature2D, org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
