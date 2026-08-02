package xsna;

import java.security.InvalidKeyException;

/* compiled from: XChaCha20Poly1305.java */
/* loaded from: classes13.dex */
public final class v3y0 extends uqa {
    public v3y0(byte[] bArr) throws InvalidKeyException {
        super(bArr);
    }

    @Override // xsna.uqa
    public final sqa d(int i, byte[] bArr) throws InvalidKeyException {
        return new u3y0(bArr, i);
    }
}
