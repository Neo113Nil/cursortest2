package com.objsys.asn1j.runtime;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes11.dex */
public abstract class Asn1OutputStream extends OutputStream {
    protected OutputStream os;

    public Asn1OutputStream(OutputStream outputStream) {
        this.os = outputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.os.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.os.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.os.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.os.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.os.write(i);
    }
}
