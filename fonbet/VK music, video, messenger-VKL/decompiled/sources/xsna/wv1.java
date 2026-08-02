package xsna;

import java.nio.ByteBuffer;
import one.video.player.live.proto.rtmp.ProtocolException;

/* compiled from: AmfEntry.java */
/* loaded from: classes8.dex */
public interface wv1 {
    void deserialize(ByteBuffer byteBuffer) throws ProtocolException;

    int getSize() throws ProtocolException;

    byte getType();

    void serialize(ByteBuffer byteBuffer) throws ProtocolException;
}
