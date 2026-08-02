package org.opencv.xfeatures2d;

import org.opencv.features2d.Feature2D;

/* loaded from: classes8.dex */
public class FREAK extends Feature2D {
    public static FREAK c() {
        return new FREAK(create_5());
    }

    private static native long create_0(boolean z, boolean z2, float f, int i, long j);

    private static native long create_1(boolean z, boolean z2, float f, int i);

    private static native long create_2(boolean z, boolean z2, float f);

    private static native long create_3(boolean z, boolean z2);

    private static native long create_4(boolean z);

    private static native long create_5();

    private static native void delete(long j);

    @Override // org.opencv.features2d.Feature2D, org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
