package ru.ok.proto.rtmp.amf.entries;

import java.nio.ByteBuffer;
import ru.ok.proto.rtmp.amf.AmfEntry;

/* loaded from: classes9.dex */
public class AmfNull implements AmfEntry {
    public static final AmfNull INSTANCE = new AmfNull();

    @Override // ru.ok.proto.rtmp.amf.AmfEntry
    public int getSize() {
        return 0;
    }

    @Override // ru.ok.proto.rtmp.amf.AmfEntry
    public byte getType() {
        return (byte) 5;
    }

    public String toString() {
        return null;
    }

    @Override // ru.ok.proto.rtmp.amf.AmfEntry
    public void deserialize(ByteBuffer byteBuffer) {
    }

    @Override // ru.ok.proto.rtmp.amf.AmfEntry
    public void serialize(ByteBuffer byteBuffer) {
    }
}
