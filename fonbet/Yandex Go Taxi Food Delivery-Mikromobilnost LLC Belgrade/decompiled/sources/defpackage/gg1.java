package defpackage;

import com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ru.CryptoPro.JCSP.JCSP;

/* loaded from: classes11.dex */
public final class gg1 {
    public static final TinkFipsUtil$AlgorithmFipsCompatibility d = TinkFipsUtil$AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    public static final fg1 e = new fg1(0);
    public final SecretKeySpec a;
    public final int b;
    public final int c;

    public gg1(byte[] bArr, int i) {
        if (!d.a()) {
            kbs.v("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        d131.a(bArr.length);
        this.a = new SecretKeySpec(bArr, JCSP.AES_NAME);
        int blockSize = ((Cipher) e.get()).getBlockSize();
        this.c = blockSize;
        if (i < 12 || i > blockSize) {
            kbs.v("invalid IV size");
            throw null;
        }
        this.b = i;
    }

    public final void a(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, boolean z) {
        Cipher cipher = (Cipher) e.get();
        byte[] bArr4 = new byte[this.c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.a;
        if (z) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) == i2) {
            return;
        }
        kbs.v("stored output's length does not match input's length");
    }
}
