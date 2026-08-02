package xsna;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/* compiled from: FileDataSourceViaHeapImpl.java */
/* loaded from: classes13.dex */
public final class g8r implements xuk {
    public FileChannel b;
    public String c;

    static {
        q100.a(g8r.class);
    }

    @Override // xsna.xuk
    public final synchronized ByteBuffer K0(long j, long j2) throws IOException {
        ByteBuffer allocate;
        allocate = ByteBuffer.allocate(up2.p(j2));
        this.b.read(allocate, j);
        return (ByteBuffer) allocate.rewind();
    }

    @Override // xsna.xuk
    public final synchronized long b1(long j, long j2, WritableByteChannel writableByteChannel) throws IOException {
        return this.b.transferTo(j, j2, writableByteChannel);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.close();
    }

    @Override // xsna.xuk
    public final synchronized long position() throws IOException {
        return this.b.position();
    }

    @Override // xsna.xuk
    public final synchronized int read(ByteBuffer byteBuffer) throws IOException {
        return this.b.read(byteBuffer);
    }

    @Override // xsna.xuk
    public final synchronized long size() throws IOException {
        return this.b.size();
    }

    public final String toString() {
        return this.c;
    }

    @Override // xsna.xuk
    public final synchronized void position(long j) throws IOException {
        this.b.position(j);
    }
}
