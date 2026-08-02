package xsna;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: AesGcmSiv.java */
/* loaded from: classes13.dex */
public final class i61 implements b51 {
    public static final a b = new a();
    public final SecretKeySpec a;

    /* compiled from: AesGcmSiv.java */
    public class a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        public final Cipher initialValue() {
            try {
                return olp.e.a("AES/GCM-SIV/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public i61(byte[] bArr) throws GeneralSecurityException {
        jjr0.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec c(int i, byte[] bArr) throws GeneralSecurityException {
        try {
            try {
                Class.forName("javax.crypto.spec.GCMParameterSpec");
                return new GCMParameterSpec(128, bArr, 0, i);
            } catch (Exception unused) {
                throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
            }
        } catch (ClassNotFoundException unused2) {
            Class.forName("android.app.Application", false, null);
            return new IvParameterSpec(bArr, 0, i);
        }
    }

    @Override // xsna.b51
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] a2 = ewe0.a(12);
        System.arraycopy(a2, 0, bArr3, 0, 12);
        AlgorithmParameterSpec c = c(a2.length, a2);
        a aVar = b;
        aVar.get().init(1, this.a, c);
        if (bArr2 != null && bArr2.length != 0) {
            aVar.get().updateAAD(bArr2);
        }
        int doFinal = aVar.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (doFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(tgw.b(doFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
    }

    @Override // xsna.b51
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec c = c(12, bArr);
        a aVar = b;
        aVar.get().init(2, this.a, c);
        if (bArr2 != null && bArr2.length != 0) {
            aVar.get().updateAAD(bArr2);
        }
        return aVar.get().doFinal(bArr, 12, bArr.length - 12);
    }
}
