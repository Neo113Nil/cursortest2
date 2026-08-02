package org.opencv.xfeatures2d;

import org.opencv.features2d.Feature2D;

/* loaded from: classes8.dex */
public class HarrisLaplaceFeatureDetector extends Feature2D {
    private static native long create_0(int i, float f, float f2, int i2, int i3);

    private static native long create_1(int i, float f, float f2, int i2);

    private static native long create_2(int i, float f, float f2);

    private static native long create_3(int i, float f);

    private static native long create_4(int i);

    private static native long create_5();

    private static native void delete(long j);

    @Override // org.opencv.features2d.Feature2D, org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
