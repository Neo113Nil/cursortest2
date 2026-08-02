package xsna;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PrfAesCmac.java */
/* loaded from: classes.dex */
public final class h6d0 implements g6d0 {
    public final SecretKeySpec a;
    public final byte[] b;
    public final byte[] c;

    public h6d0(byte[] bArr) throws GeneralSecurityException {
        jjr0.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.a = secretKeySpec;
        Cipher a = olp.e.a("AES/ECB/NoPadding");
        a.init(1, secretKeySpec);
        byte[] b = qjg.b(a.doFinal(new byte[16]));
        this.b = b;
        this.c = qjg.b(b);
    }

    @Override // xsna.g6d0
    public final byte[] a(int i, byte[] bArr) throws GeneralSecurityException {
        byte[] D;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher a = olp.e.a("AES/ECB/NoPadding");
        a.init(1, this.a);
        int max = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
        if (max * 16 == bArr.length) {
            D = yfb.C(bArr, (max - 1) * 16, 0, this.b, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length);
            if (copyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[copyOfRange.length] = Byte.MIN_VALUE;
            D = yfb.D(copyOf, this.c);
        }
        byte[] bArr2 = new byte[16];
        for (int i2 = 0; i2 < max - 1; i2++) {
            bArr2 = a.doFinal(yfb.C(bArr2, 0, i2 * 16, bArr, 16));
        }
        return Arrays.copyOf(a.doFinal(yfb.D(D, bArr2)), i);
    }
}
