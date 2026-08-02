package xsna;

import java.security.InvalidKeyException;

/* compiled from: ChaCha20Poly1305.java */
/* loaded from: classes13.dex */
public final class tqa extends uqa {
    public tqa(byte[] bArr) throws InvalidKeyException {
        super(bArr);
    }

    @Override // xsna.uqa
    public final sqa d(int i, byte[] bArr) throws InvalidKeyException {
        return new rqa(bArr, i);
    }
}
