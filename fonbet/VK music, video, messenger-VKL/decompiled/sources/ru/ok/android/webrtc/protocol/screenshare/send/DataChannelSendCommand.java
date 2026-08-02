package ru.ok.android.webrtc.protocol.screenshare.send;

import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public class DataChannelSendCommand {
    public final byte a;

    public DataChannelSendCommand(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.get();
        this.a = wrap.get();
        wrap.getShort();
    }

    public boolean isKeyFrameRequest() {
        return this.a == 1;
    }
}
