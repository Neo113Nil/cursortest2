package defpackage;

import com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes11.dex */
public final class mye0 implements jye0 {
    public static final TinkFipsUtil$AlgorithmFipsCompatibility e = TinkFipsUtil$AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    public final lye0 a;
    public final String b;
    public final SecretKeySpec c;
    public final int d;

    public mye0(String str, SecretKeySpec secretKeySpec) {
        lye0 lye0Var = new lye0(this);
        this.a = lye0Var;
        if (!e.a()) {
            kbs.v("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        this.b = str;
        this.c = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            kbs.t("key size too small, need at least 16 bytes");
            throw null;
        }
        switch (str) {
            case "HMACSHA1":
                this.d = 20;
                break;
            case "HMACSHA224":
                this.d = 28;
                break;
            case "HMACSHA256":
                this.d = 32;
                break;
            case "HMACSHA384":
                this.d = 48;
                break;
            case "HMACSHA512":
                this.d = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        lye0Var.get();
    }

    @Override // defpackage.jye0
    public final byte[] a(int i, byte[] bArr) {
        if (i > this.d) {
            kbs.t("tag size too big");
            return null;
        }
        lye0 lye0Var = this.a;
        ((Mac) lye0Var.get()).update(bArr);
        return Arrays.copyOf(((Mac) lye0Var.get()).doFinal(), i);
    }
}
