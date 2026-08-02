package ru.ok.android.api.http;

import java.security.MessageDigest;

/* compiled from: NopMessageDigest.kt */
/* loaded from: classes9.dex */
public final class NopMessageDigest extends MessageDigest {
    public static final NopMessageDigest INSTANCE = new NopMessageDigest();

    private NopMessageDigest() {
        super("NOP");
    }

    @Override // java.security.MessageDigestSpi
    public byte[] engineDigest() {
        return new byte[0];
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte b) {
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
    }

    @Override // java.security.MessageDigestSpi
    public void engineReset() {
    }
}
