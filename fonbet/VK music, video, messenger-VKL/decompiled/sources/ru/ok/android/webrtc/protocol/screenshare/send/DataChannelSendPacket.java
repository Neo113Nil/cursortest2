package ru.ok.android.webrtc.protocol.screenshare.send;

import java.nio.ByteBuffer;
import ru.ok.android.webrtc.protocol.screenshare.Codec;
import ru.ok.android.webrtc.protocol.screenshare.ScreensharePacketFlags;

/* loaded from: classes9.dex */
public class DataChannelSendPacket extends ScreensharePacketFlags {
    public static final int HEADER_SIZE = 11;
    public static final int VERSION = 1;
    public final byte b = 1;
    public final int c;
    public final long d;
    public final Codec e;
    public final int f;
    public final ByteBuffer g;

    public DataChannelSendPacket(int i, long j, Codec codec, int i2, boolean z, boolean z2, boolean z3, boolean z4, ByteBuffer byteBuffer) {
        this.c = i;
        this.d = j;
        this.e = codec;
        this.f = i2;
        setStart(z);
        setEnd(z2);
        setKeyFrame(z3);
        setEos(z4);
        this.g = byteBuffer;
    }

    public ByteBuffer getPayload() {
        return this.g;
    }

    public ByteBuffer header() {
        ByteBuffer allocate = ByteBuffer.allocate(11);
        allocate.put(this.b);
        allocate.putShort((short) this.c);
        allocate.putInt((int) this.d);
        allocate.put(this.e.encodedValue);
        allocate.putShort((short) this.f);
        allocate.put(getFlagValue());
        allocate.rewind();
        return allocate;
    }

    public void write(ByteBuffer byteBuffer) {
        byteBuffer.put(this.b);
        byteBuffer.putShort((short) this.c);
        byteBuffer.putInt((int) this.d);
        byteBuffer.put(this.e.encodedValue);
        byteBuffer.putShort((short) this.f);
        byteBuffer.put(getFlagValue());
        byteBuffer.put(this.g);
        byteBuffer.limit(byteBuffer.position());
        byteBuffer.rewind();
    }

    public byte[] write() {
        byte[] bArr = new byte[this.g.remaining() + 11];
        write(ByteBuffer.wrap(bArr));
        return bArr;
    }
}
