package xsna;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: DataSource.java */
/* loaded from: classes13.dex */
public interface xuk extends Closeable {
    ByteBuffer K0(long j, long j2) throws IOException;

    long b1(long j, long j2, WritableByteChannel writableByteChannel) throws IOException;

    long position() throws IOException;

    void position(long j) throws IOException;

    int read(ByteBuffer byteBuffer) throws IOException;

    long size() throws IOException;
}
