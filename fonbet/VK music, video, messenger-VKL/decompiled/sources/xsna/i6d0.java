package xsna;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PrfHmacJce.java */
/* loaded from: classes13.dex */
public final class i6d0 implements g6d0 {
    public final a a;
    public final String b;
    public final SecretKeySpec c;
    public final int d;

    /* compiled from: PrfHmacJce.java */
    public class a extends ThreadLocal<Mac> {
        public a() {
        }

        @Override // java.lang.ThreadLocal
        public final Mac initialValue() {
            i6d0 i6d0Var = i6d0.this;
            try {
                Mac a = olp.f.a(i6d0Var.b);
                a.init(i6d0Var.c);
                return a;
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public i6d0(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        a aVar = new a();
        this.a = aVar;
        this.b = str;
        this.c = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str) {
            case "HMACSHA1":
                this.d = 20;
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
        aVar.get();
    }

    @Override // xsna.g6d0
    public final byte[] a(int i, byte[] bArr) throws GeneralSecurityException {
        if (i > this.d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        a aVar = this.a;
        aVar.get().update(bArr);
        return Arrays.copyOf(aVar.get().doFinal(), i);
    }
}
