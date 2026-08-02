package defpackage;

import com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ru.CryptoPro.JCP.tools.Platform;
import ru.CryptoPro.JCSP.JCSP;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes.dex */
public final class ei1 implements w9j {
    public static final TinkFipsUtil$AlgorithmFipsCompatibility c = TinkFipsUtil$AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    public static final List d = Arrays.asList(64);
    public static final byte[] e = new byte[16];
    public static final byte[] f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    public final kye0 a;
    public final byte[] b;

    public ei1(byte[] bArr) {
        if (!c.a()) {
            kbs.v("Can not use AES-SIV in FIPS-mode.");
            throw null;
        }
        if (!d.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException(oyr.m(bArr.length, " bytes; key must have 64 bytes", new StringBuilder("invalid key size: ")));
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.a = new kye0(copyOfRange);
    }

    @Override // defpackage.w9j
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 16) {
            kbs.v("Ciphertext too short.");
            return null;
        }
        Cipher cipher = (Cipher) s1o.b.a.n("AES/CTR/NoPadding");
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) copyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        cipher.init(2, new SecretKeySpec(this.b, JCSP.AES_NAME), new IvParameterSpec(bArr3));
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] doFinal = cipher.doFinal(copyOfRange2);
        if (copyOfRange2.length == 0 && doFinal == null && "The Android Project".equals(System.getProperty(Platform.STR_VENDOR_PROPERTY))) {
            doFinal = new byte[0];
        }
        if (MessageDigest.isEqual(copyOfRange, c(bArr2, doFinal))) {
            return doFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    @Override // defpackage.w9j
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 2147483631) {
            kbs.v("plaintext too long");
            return null;
        }
        Cipher cipher = (Cipher) s1o.b.a.n("AES/CTR/NoPadding");
        byte[] c2 = c(bArr2, bArr);
        byte[] bArr3 = (byte[]) c2.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        cipher.init(1, new SecretKeySpec(this.b, JCSP.AES_NAME), new IvParameterSpec(bArr3));
        return ffx.x(c2, cipher.doFinal(bArr));
    }

    public final byte[] c(byte[]... bArr) {
        byte[] k0;
        int length = bArr.length;
        kye0 kye0Var = this.a;
        if (length == 0) {
            return kye0Var.a(16, f);
        }
        byte[] a = kye0Var.a(16, e);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            a = ffx.k0(kp50.l(a), kye0Var.a(16, bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length < a.length) {
                ny61.g("xorEnd requires a.length >= b.length");
                return null;
            }
            int length2 = bArr3.length - a.length;
            k0 = Arrays.copyOf(bArr3, bArr3.length);
            for (int i2 = 0; i2 < a.length; i2++) {
                int i3 = length2 + i2;
                k0[i3] = (byte) (k0[i3] ^ a[i2]);
            }
        } else {
            if (bArr3.length >= 16) {
                ny61.g("x must be smaller than a block.");
                return null;
            }
            byte[] copyOf = Arrays.copyOf(bArr3, 16);
            copyOf[bArr3.length] = DerValue.TAG_CONTEXT;
            k0 = ffx.k0(copyOf, kp50.l(a));
        }
        return kye0Var.a(16, k0);
    }
}
