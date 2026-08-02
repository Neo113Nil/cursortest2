package defpackage;

import com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import ru.CryptoPro.JCSP.JCSP;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes.dex */
public final class kye0 implements jye0 {
    public static final TinkFipsUtil$AlgorithmFipsCompatibility d = TinkFipsUtil$AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    public final SecretKeySpec a;
    public final byte[] b;
    public final byte[] c;

    public kye0(byte[] bArr) {
        d131.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, JCSP.AES_NAME);
        this.a = secretKeySpec;
        if (!d.a()) {
            kbs.v("Can not use AES-CMAC in FIPS-mode.");
            throw null;
        }
        Cipher cipher = (Cipher) s1o.b.a.n("AES/ECB/NoPadding");
        cipher.init(1, secretKeySpec);
        byte[] l = kp50.l(cipher.doFinal(new byte[16]));
        this.b = l;
        this.c = kp50.l(l);
    }

    @Override // defpackage.jye0
    public final byte[] a(int i, byte[] bArr) {
        byte[] k0;
        if (i > 16) {
            kbs.t("outputLength too large, max is 16 bytes");
            return null;
        }
        if (!d.a()) {
            kbs.v("Can not use AES-CMAC in FIPS-mode.");
            return null;
        }
        Cipher cipher = (Cipher) s1o.b.a.n("AES/ECB/NoPadding");
        cipher.init(1, this.a);
        int max = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
        if (max * 16 == bArr.length) {
            k0 = ffx.j0(bArr, (max - 1) * 16, 0, this.b, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length);
            if (copyOfRange.length >= 16) {
                ny61.g("x must be smaller than a block.");
                return null;
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[copyOfRange.length] = DerValue.TAG_CONTEXT;
            k0 = ffx.k0(copyOf, this.c);
        }
        byte[] bArr2 = new byte[16];
        for (int i2 = 0; i2 < max - 1; i2++) {
            bArr2 = cipher.doFinal(ffx.j0(bArr2, 0, i2 * 16, bArr, 16));
        }
        return Arrays.copyOf(cipher.doFinal(ffx.k0(k0, bArr2)), i);
    }
}
