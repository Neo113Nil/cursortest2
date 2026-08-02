package xsna;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ContentLengthInputStream.java */
/* loaded from: classes12.dex */
public final class aij extends FilterInputStream {
    public final long b;
    public int c;

    public aij(@NonNull InputStream inputStream, long j) {
        super(inputStream);
        this.b = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() throws IOException {
        return (int) Math.max(this.b - this.c, ((FilterInputStream) this).in.available());
    }

    public final void b(int i) throws IOException {
        if (i >= 0) {
            this.c += i;
            return;
        }
        long j = this.c;
        long j2 = this.b;
        if (j2 - j <= 0) {
            return;
        }
        StringBuilder b = fp.b(j2, "Failed to read all expected data, expected: ", ", but read: ");
        b.append(this.c);
        throw new IOException(b.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() throws IOException {
        int read;
        read = super.read();
        b(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int read;
        read = super.read(bArr, i, i2);
        b(read);
        return read;
    }
}
