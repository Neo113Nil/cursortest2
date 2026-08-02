package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import ru.CryptoPro.JCSP.Cipher.GostCipher;
import ru.CryptoPro.JCSP.JCSP;

/* loaded from: classes.dex */
public final class ba2 implements ylx {
    public static final Object b = new Object();
    public KeyStore a = new a().a;

    public static final class a {
        public final KeyStore a;

        public a() {
            this.a = null;
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.a = keyStore;
                keyStore.load(null);
            } catch (IOException | GeneralSecurityException e) {
                ny61.o(e);
                throw null;
            }
        }
    }

    public static boolean a(String str) {
        ba2 ba2Var = new ba2();
        synchronized (b) {
            try {
                if (ba2Var.d(str)) {
                    return false;
                }
                b(str);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(String str) {
        String b2 = d131.b(str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance(JCSP.AES_NAME, "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(b2, 3).setKeySize(256).setBlockModes(GostCipher.STR_GCM_MODE).setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    public final synchronized aa2 c(String str) {
        aa2 aa2Var;
        aa2Var = new aa2(d131.b(str), this.a);
        byte[] a2 = i6i0.a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(a2, aa2Var.b(aa2Var.a(a2, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return aa2Var;
    }

    public final synchronized boolean d(String str) {
        String b2;
        b2 = d131.b(str);
        try {
            try {
            } catch (NullPointerException unused) {
                try {
                    Thread.sleep((int) (Math.random() * 40.0d));
                } catch (InterruptedException unused2) {
                }
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.a = keyStore;
                keyStore.load(null);
                return this.a.containsAlias(b2);
            }
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
        return this.a.containsAlias(b2);
    }
}
