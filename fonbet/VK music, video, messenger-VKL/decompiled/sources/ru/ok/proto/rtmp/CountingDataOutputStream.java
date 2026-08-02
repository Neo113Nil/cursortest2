package ru.ok.proto.rtmp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import xsna.nd7;

/* loaded from: classes9.dex */
public class CountingDataOutputStream extends DataOutputStream {
    private nd7 bitrateCounter;
    private long totalBytes;

    public CountingDataOutputStream(OutputStream outputStream) {
        super(outputStream);
        this.totalBytes = 0L;
        this.bitrateCounter = new nd7();
    }

    public long getBitrate() {
        return (long) this.bitrateCounter.d.get().doubleValue();
    }

    public long getTotalBytes() {
        return this.totalBytes;
    }

    @Override // java.io.DataOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.DataOutput
    public void write(byte[] bArr, int i, int i2) throws IOException {
        super.write(bArr, i, i2);
        long j = i2;
        this.totalBytes += j;
        this.bitrateCounter.a(System.currentTimeMillis(), j);
    }

    @Override // java.io.DataOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.DataOutput
    public void write(int i) throws IOException {
        super.write(i);
        this.totalBytes++;
    }
}
