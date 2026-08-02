package org.opencv.features2d;

/* loaded from: classes8.dex */
public class FlannBasedMatcher extends DescriptorMatcher {
    public FlannBasedMatcher() {
        super(FlannBasedMatcher_0());
    }

    private static native long FlannBasedMatcher_0();

    private static native long create_0();

    private static native void delete(long j);

    @Override // org.opencv.features2d.DescriptorMatcher, org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
