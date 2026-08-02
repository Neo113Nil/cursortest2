package xsna;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: CountingDataOutputStream.java */
/* loaded from: classes8.dex */
public final class myj extends DataOutputStream {
    public long b;

    public myj(OutputStream outputStream) {
        super(outputStream);
        this.b = 0L;
    }

    @Override // java.io.DataOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.DataOutput
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        super.write(bArr, i, i2);
        this.b += i2;
    }

    @Override // java.io.DataOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.DataOutput
    public final void write(int i) throws IOException {
        super.write(i);
        this.b++;
    }
}
