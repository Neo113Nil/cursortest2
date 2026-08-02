package org.opencv.xfeatures2d;

import org.opencv.features2d.Feature2D;

/* loaded from: classes8.dex */
public class BriefDescriptorExtractor extends Feature2D {
    private static native long create_0(int i, boolean z);

    private static native long create_1(int i);

    private static native long create_2();

    private static native void delete(long j);

    @Override // org.opencv.features2d.Feature2D, org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
