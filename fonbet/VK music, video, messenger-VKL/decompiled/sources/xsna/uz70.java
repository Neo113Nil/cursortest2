package xsna;

import com.vk.core.preference.Preference;
import com.vk.core.preference.crypto.EncryptionException;
import com.vk.log.L;
import java.security.KeyStore;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: OldEncryptedPreference.kt */
@ozl
/* loaded from: classes.dex */
public final class uz70 {
    public static b61 a;
    public static final ReentrantLock b = new ReentrantLock();
    public static final CountDownLatch c = new CountDownLatch(1);

    public static String a(String str, String str2) {
        String s;
        s = Preference.s(str2, str, new String());
        if (!drm0.N(s)) {
            try {
                b61 b61Var = a;
                if (b61Var == null) {
                    b61Var = null;
                }
                byte[] d = b61Var.d(str, c4g0.F(s));
                if (d != null) {
                    return new String(d, emb.b);
                }
            } catch (EncryptionException e) {
                L.j(e, "Failed to decrypt data");
                return null;
            }
        }
        return null;
    }

    public static void b(Preference preference, b61 b61Var) {
        ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            if (c()) {
                return;
            }
            a = b61Var;
            c.countDown();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static boolean c() {
        return c.getCount() == 0;
    }

    public static void d(String str, String str2, String str3) throws EncryptionException {
        b61 b61Var = a;
        Cipher cipher = null;
        if (b61Var == null) {
            b61Var = null;
        }
        byte[] bytes = str2.getBytes(emb.b);
        ReentrantReadWriteLock.ReadLock readLock = b61Var.b.readLock();
        readLock.lock();
        try {
            b61Var.a();
            s3q0 s3q0Var = s3q0.a;
            readLock.unlock();
            byte[] e = b61Var.e(str);
            if (e == null) {
                try {
                    e = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(brm0.y(UUID.randomUUID().toString().toLowerCase(Locale.ROOT), "-", "").toCharArray(), f870.g(UUID.randomUUID()), 10000, 256)).getEncoded();
                    try {
                        Cipher cipher2 = Cipher.getInstance("RSA/NONE/PKCS1Padding");
                        KeyStore keyStore = b61Var.d;
                        if (keyStore == null) {
                            keyStore = null;
                        }
                        cipher2.init(1, keyStore.getCertificate("ALIAS_MASTER_KEY").getPublicKey());
                        b61Var.a.a(str, cipher2.doFinal(e));
                    } catch (Exception e2) {
                        throw new EncryptionException("Failed to encrypt with master key", e2);
                    }
                } catch (Exception e3) {
                    throw new EncryptionException("Failed to generate key", e3);
                }
            }
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(e, "AES");
                ReentrantLock reentrantLock = b61Var.f;
                reentrantLock.lock();
                try {
                    Cipher cipher3 = b61Var.e;
                    if (cipher3 == null) {
                        cipher3 = null;
                    }
                    cipher3.init(1, secretKeySpec);
                    Cipher cipher4 = b61Var.e;
                    if (cipher4 == null) {
                        cipher4 = null;
                    }
                    byte[] doFinal = cipher4.doFinal(bytes);
                    Cipher cipher5 = b61Var.e;
                    if (cipher5 != null) {
                        cipher = cipher5;
                    }
                    Preference.H(str3, str, c4g0.D(new vjp(doFinal, cipher.getIV())));
                } finally {
                    reentrantLock.unlock();
                }
            } catch (Exception e4) {
                throw new EncryptionException("Failed to encrypt with raw aes key", e4);
            }
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }
}
