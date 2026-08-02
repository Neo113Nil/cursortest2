package xsna;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: AesSiv.java */
/* loaded from: classes.dex */
public final class n61 implements i5m {
    public static final List c = Arrays.asList(64);
    public static final byte[] d = new byte[16];
    public static final byte[] e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    public final h6d0 a;
    public final byte[] b;

    public n61(byte[] bArr) throws GeneralSecurityException {
        if (!c.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException(h5s.c(bArr.length, " bytes; key must have 64 bytes", new StringBuilder("invalid key size: ")));
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.a = new h6d0(copyOfRange);
    }

    @Override // xsna.i5m
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher a = olp.e.a("AES/CTR/NoPadding");
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) copyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        a.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(bArr3));
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] doFinal = a.doFinal(copyOfRange2);
        if (copyOfRange2.length == 0 && doFinal == null) {
            try {
                Class.forName("android.app.Application", false, null);
                doFinal = new byte[0];
            } catch (Exception unused) {
            }
        }
        if (yfb.f(copyOfRange, c(bArr2, doFinal))) {
            return doFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    @Override // xsna.i5m
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher a = olp.e.a("AES/CTR/NoPadding");
        byte[] c2 = c(bArr2, bArr);
        byte[] bArr3 = (byte[]) c2.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        a.init(1, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(bArr3));
        return yfb.e(c2, a.doFinal(bArr));
    }

    public final byte[] c(byte[]... bArr) throws GeneralSecurityException {
        byte[] D;
        int length = bArr.length;
        h6d0 h6d0Var = this.a;
        if (length == 0) {
            return h6d0Var.a(16, e);
        }
        byte[] a = h6d0Var.a(16, d);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            a = yfb.D(qjg.b(a), h6d0Var.a(16, bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length < a.length) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int length2 = bArr3.length - a.length;
            D = Arrays.copyOf(bArr3, bArr3.length);
            for (int i2 = 0; i2 < a.length; i2++) {
                int i3 = length2 + i2;
                D[i3] = (byte) (D[i3] ^ a[i2]);
            }
        } else {
            if (bArr3.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(bArr3, 16);
            copyOf[bArr3.length] = Byte.MIN_VALUE;
            D = yfb.D(copyOf, qjg.b(a));
        }
        return h6d0Var.a(16, D);
    }
}
