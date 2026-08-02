package one.video.streaming.oktp;

import androidx.annotation.Keep;
import java.io.IOException;
import java.nio.ByteBuffer;

@Keep
/* loaded from: classes8.dex */
public interface TransportWriter {
    long getBitrate();

    long getBytesDropped();

    long getBytesSent();

    int getGuaranteedMTU();

    int getMaxMTU();

    void setEncryptionKey(byte[] bArr);

    boolean writeDatagram(ByteBuffer byteBuffer, boolean z, boolean z2) throws IOException;
}
