package org.opencv.xfeatures2d;

import org.opencv.features2d.Feature2D;

/* loaded from: classes8.dex */
public class DAISY extends Feature2D {
    private static native long create_0(float f, int i, int i2, int i3, long j, boolean z, boolean z2);

    private static native long create_1(float f, int i, int i2, int i3, long j, boolean z);

    private static native long create_2(float f, int i, int i2, int i3, long j);

    private static native long create_3(float f, int i, int i2, int i3);

    private static native long create_5(float f, int i, int i2);

    private static native long create_6(float f, int i);

    private static native long create_7(float f);

    private static native long create_8();

    private static native void delete(long j);

    @Override // org.opencv.features2d.Feature2D, org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
