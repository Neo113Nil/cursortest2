package ru.ok.android.webrtc.hash;

import java.io.OutputStream;
import java.security.MessageDigest;

/* loaded from: classes9.dex */
public final class DigestOutputStream extends OutputStream {
    public final MessageDigest a;

    public DigestOutputStream(MessageDigest messageDigest) {
        this.a = messageDigest;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.a.update((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (bArr == null || i + i2 > bArr.length) {
            throw new IllegalArgumentException("wrong parameters for write");
        }
        if (i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException("wrong index for write");
        }
        this.a.update(bArr, i, i2);
    }
}
