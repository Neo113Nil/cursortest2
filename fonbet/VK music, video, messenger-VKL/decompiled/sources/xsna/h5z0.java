package xsna;

import org.webrtc.EncodedImage;

/* loaded from: classes8.dex */
public interface h5z0 {
    String codec();

    int frameHeight();

    int frameWidth();

    void handleFrameDropStarted();

    String implName();

    boolean isReleased();

    void release();

    void submitFrame(EncodedImage encodedImage);
}
