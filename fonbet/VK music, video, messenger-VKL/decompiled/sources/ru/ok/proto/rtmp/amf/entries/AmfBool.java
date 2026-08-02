package ru.ok.proto.rtmp.amf.entries;

import java.nio.ByteBuffer;
import ru.ok.proto.rtmp.amf.AmfEntry;

/* loaded from: classes9.dex */
public class AmfBool implements AmfEntry {
    private boolean value;

    public AmfBool() {
    }

    @Override // ru.ok.proto.rtmp.amf.AmfEntry
    public void deserialize(ByteBuffer byteBuffer) {
        this.value = byteBuffer.get() != 0;
    }

    @Override // ru.ok.proto.rtmp.amf.AmfEntry
    public int getSize() {
        return 1;
    }

    @Override // ru.ok.proto.rtmp.amf.AmfEntry
    public byte getType() {
        return (byte) 1;
    }

    @Override // ru.ok.proto.rtmp.amf.AmfEntry
    public void serialize(ByteBuffer byteBuffer) {
        byteBuffer.put(this.value ? (byte) 1 : (byte) 0);
    }

    public String toString() {
        return Boolean.toString(this.value);
    }

    public AmfBool(boolean z) {
        this.value = z;
    }
}
