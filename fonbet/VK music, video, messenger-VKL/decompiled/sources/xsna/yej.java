package xsna;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;

/* compiled from: Container.java */
/* loaded from: classes12.dex */
public interface yej {
    List<ga8> getBoxes();

    <T extends ga8> List<T> getBoxes(Class<T> cls);

    <T extends ga8> List<T> getBoxes(Class<T> cls, boolean z);

    ByteBuffer getByteBuffer(long j, long j2) throws IOException;

    void writeContainer(WritableByteChannel writableByteChannel) throws IOException;
}
