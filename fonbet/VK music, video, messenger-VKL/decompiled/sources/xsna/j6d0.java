package xsna;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: PrfMac.java */
/* loaded from: classes13.dex */
public final class j6d0 implements dc00 {
    public final g6d0 a;
    public final int b;

    public j6d0(g6d0 g6d0Var, int i) throws GeneralSecurityException {
        this.a = g6d0Var;
        this.b = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        g6d0Var.a(i, new byte[0]);
    }

    @Override // xsna.dc00
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!yfb.f(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // xsna.dc00
    public final byte[] b(byte[] bArr) throws GeneralSecurityException {
        return this.a.a(this.b, bArr);
    }
}
