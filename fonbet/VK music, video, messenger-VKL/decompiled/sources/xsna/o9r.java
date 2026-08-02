package xsna;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/* compiled from: FileOutputStreamSeekableMuxerOutput.java */
/* loaded from: classes12.dex */
public final class o9r implements WritableByteChannel {
    public final FileOutputStream b;
    public final FileChannel c;

    public o9r(FileOutputStream fileOutputStream) {
        this.b = fileOutputStream;
        this.c = fileOutputStream.getChannel();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.close();
    }

    public final void h(long j) throws IOException {
        this.c.position(j);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.c.isOpen();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        return this.c.write(byteBuffer);
    }
}
