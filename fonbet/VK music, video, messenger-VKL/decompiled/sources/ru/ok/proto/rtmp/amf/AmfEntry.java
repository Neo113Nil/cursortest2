package ru.ok.proto.rtmp.amf;

import java.nio.ByteBuffer;
import ru.ok.proto.rtmp.ProtocolException;

/* loaded from: classes9.dex */
public interface AmfEntry {
    void deserialize(ByteBuffer byteBuffer) throws ProtocolException;

    int getSize() throws ProtocolException;

    byte getType();

    void serialize(ByteBuffer byteBuffer) throws ProtocolException;
}
