package ru.ok.android.webrtc.protocol.screenshare.send;

/* loaded from: classes9.dex */
public class EncodedFrame {
    public final byte[] frameData;
    public final boolean isKeyFrame;

    public EncodedFrame(byte[] bArr, boolean z) {
        this.frameData = bArr;
        this.isKeyFrame = z;
    }
}
