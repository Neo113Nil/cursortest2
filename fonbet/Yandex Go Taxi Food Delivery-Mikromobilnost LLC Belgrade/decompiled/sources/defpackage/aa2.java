package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes.dex */
public final class aa2 implements ve1 {
    public final SecretKey a;

    public aa2(String str, KeyStore keyStore) {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.a = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException("Keystore cannot load the key with ID: ".concat(str));
        }
    }

    @Override // defpackage.ve1
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            return d(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException unused) {
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused2) {
            }
            return this.d(bArr, bArr2);
        }
    }

    @Override // defpackage.ve1
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 28) {
            kbs.v("ciphertext too short");
            return null;
        }
        try {
            return c(bArr, bArr2);
        } catch (AEADBadTagException e) {
            throw e;
        } catch (GeneralSecurityException | ProviderException unused) {
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused2) {
            }
            return this.c(bArr, bArr2);
        }
    }

    public final byte[] c(byte[] bArr, byte[] bArr2) {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, this.a, gCMParameterSpec);
        cipher.updateAAD(bArr2);
        return cipher.doFinal(bArr, 12, bArr.length - 12);
    }

    public final byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 2147483619) {
            kbs.v("plaintext too long");
            return null;
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, this.a);
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
        System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
        return bArr3;
    }
}
