package ru.ok.android.api.http;

import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;

/* compiled from: MessageDigestOutputStream.kt */
/* loaded from: classes9.dex */
public final class MessageDigestOutputStream extends OutputStream {
    private final MessageDigest digest;
    private final OutputStream out;

    public MessageDigestOutputStream(OutputStream outputStream, MessageDigest messageDigest) {
        this.out = outputStream;
        this.digest = messageDigest;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.out.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.out.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.out.write(i);
        this.digest.update((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        this.digest.update(bArr, i, i2);
    }
}
