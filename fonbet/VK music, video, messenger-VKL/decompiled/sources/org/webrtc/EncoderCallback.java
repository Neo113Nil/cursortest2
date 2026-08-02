package org.webrtc;

/* loaded from: classes9.dex */
public interface EncoderCallback {
    void onEncodedImage(EncodedImage encodedImage);

    void onFrameDropped(int i);
}
