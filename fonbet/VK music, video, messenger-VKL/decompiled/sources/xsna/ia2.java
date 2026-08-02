package xsna;

import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* compiled from: AndroidKeystoreKmsClient.java */
/* loaded from: classes.dex */
public final class ia2 implements cjy {
    public KeyStore a;

    public ia2() throws GeneralSecurityException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.a = keyStore;
        } catch (IOException | GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void c(String str) throws GeneralSecurityException {
        if (new ia2().d(str)) {
            throw new IllegalArgumentException(zr.a("cannot generate a new key ", str, " because it already exists; please delete it with deleteKey() and try again"));
        }
        String b = jjr0.b(str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(b, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    @Override // xsna.cjy
    public final synchronized ha2 a(String str) throws GeneralSecurityException {
        ha2 ha2Var;
        ha2Var = new ha2(jjr0.b(str), this.a);
        byte[] a = ewe0.a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(a, ha2Var.b(ha2Var.a(a, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return ha2Var;
    }

    @Override // xsna.cjy
    public final synchronized boolean b(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }

    public final synchronized boolean d(String str) throws GeneralSecurityException {
        String b;
        b = jjr0.b(str);
        try {
        } catch (NullPointerException unused) {
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.a = keyStore;
                keyStore.load(null);
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            } catch (InterruptedException unused2) {
            }
            return this.a.containsAlias(b);
        }
        return this.a.containsAlias(b);
    }
}
