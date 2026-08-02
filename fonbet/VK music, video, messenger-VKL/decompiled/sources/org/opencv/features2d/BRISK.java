package org.opencv.features2d;

/* loaded from: classes8.dex */
public class BRISK extends Feature2D {
    private static native long create_0(int i, int i2, long j, long j2, float f, float f2, long j3);

    private static native long create_1(int i, int i2, long j, long j2, float f, float f2);

    private static native long create_10(long j, long j2, float f);

    private static native long create_11(long j, long j2);

    private static native long create_2(int i, int i2, long j, long j2, float f);

    private static native long create_3(int i, int i2, long j, long j2);

    private static native long create_4(int i, int i2, float f);

    private static native long create_5(int i, int i2);

    private static native long create_6(int i);

    private static native long create_7();

    private static native long create_8(long j, long j2, float f, float f2, long j3);

    private static native long create_9(long j, long j2, float f, float f2);

    private static native void delete(long j);

    private static native String getDefaultName_0(long j);

    private static native int getOctaves_0(long j);

    private static native int getThreshold_0(long j);

    private static native void setOctaves_0(long j, int i);

    private static native void setThreshold_0(long j, int i);

    @Override // org.opencv.features2d.Feature2D, org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
