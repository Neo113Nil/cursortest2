package xsna;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: MemoryDataSourceImpl.java */
/* loaded from: classes13.dex */
public final class u220 implements xuk {
    public final ByteBuffer b;

    public u220(ByteBuffer byteBuffer) {
        this.b = byteBuffer;
    }

    @Override // xsna.xuk
    public final ByteBuffer K0(long j, long j2) throws IOException {
        ByteBuffer byteBuffer = this.b;
        int position = byteBuffer.position();
        byteBuffer.position(up2.p(j));
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(up2.p(j2));
        byteBuffer.position(position);
        return slice;
    }

    @Override // xsna.xuk
    public final long b1(long j, long j2, WritableByteChannel writableByteChannel) throws IOException {
        return writableByteChannel.write((ByteBuffer) ((ByteBuffer) this.b.position(up2.p(j))).slice().limit(up2.p(j2)));
    }

    @Override // xsna.xuk
    public final long position() throws IOException {
        return this.b.position();
    }

    @Override // xsna.xuk
    public final int read(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBuffer2 = this.b;
        if (byteBuffer2.remaining() == 0 && byteBuffer.remaining() != 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        if (byteBuffer.hasArray()) {
            byteBuffer.put(byteBuffer2.array(), byteBuffer2.position(), min);
            byteBuffer2.position(byteBuffer2.position() + min);
            return min;
        }
        byte[] bArr = new byte[min];
        byteBuffer2.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    @Override // xsna.xuk
    public final long size() throws IOException {
        return this.b.capacity();
    }

    @Override // xsna.xuk
    public final void position(long j) throws IOException {
        this.b.position(up2.p(j));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
