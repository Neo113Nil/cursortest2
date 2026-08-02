package ru.ok.proto.rtmp;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes9.dex */
public class CountingDataInputStream extends DataInputStream {
    private long totalBytes;

    public CountingDataInputStream(InputStream inputStream) {
        super(inputStream);
        this.totalBytes = 0L;
    }

    public long getTotalBytes() {
        return this.totalBytes;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = super.read();
        this.totalBytes += read;
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long skip = super.skip(j);
        this.totalBytes += skip;
        return skip;
    }
}
