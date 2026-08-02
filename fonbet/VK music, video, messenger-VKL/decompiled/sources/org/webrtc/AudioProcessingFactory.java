package org.webrtc;

/* loaded from: classes9.dex */
public interface AudioProcessingFactory {
    @Deprecated
    default long createNative() {
        return 0L;
    }

    default long createNative(long j) {
        return createNative();
    }
}
