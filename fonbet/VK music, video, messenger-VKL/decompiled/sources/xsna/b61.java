package xsna;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import com.vk.core.preference.crypto.EncryptionException;
import com.vk.log.L;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.Calendar;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;

/* compiled from: EncryptionManager.kt */
/* loaded from: classes.dex */
public final class b61 {
    public final bey a;
    public final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    public final CountDownLatch c;
    public KeyStore d;
    public Cipher e;
    public final ReentrantLock f;

    public b61(Context context, ExecutorService executorService, final izs izsVar, bey beyVar, final gzs gzsVar) {
        this.a = beyVar;
        context.getApplicationContext();
        this.c = new CountDownLatch(1);
        this.f = new ReentrantLock();
        Calendar calendar = Calendar.getInstance();
        calendar.getTime();
        calendar.add(1, 30);
        calendar.getTime();
        executorService.execute(new Runnable() { // from class: xsna.a61
            @Override // java.lang.Runnable
            public final void run() {
                izs izsVar2 = izsVar;
                gzs gzsVar2 = gzsVar;
                b61 b61Var = b61.this;
                CountDownLatch countDownLatch = b61Var.c;
                ReentrantReadWriteLock reentrantReadWriteLock = b61Var.b;
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                int i = 0;
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    readLock.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    try {
                        if (countDownLatch.getCount() == 0) {
                            return;
                        }
                        try {
                            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                            b61Var.d = keyStore;
                            keyStore.load(null);
                            b61Var.e = Cipher.getInstance("AES/CBC/PKCS7Padding");
                            if (!b61Var.f()) {
                                b61.b();
                                gzsVar2.invoke();
                            }
                        } catch (Exception e) {
                            izsVar2.invoke(new EncryptionException("Failed to run init", e));
                        }
                        s3q0 s3q0Var = s3q0.a;
                        while (i < readHoldCount) {
                            readLock.lock();
                            i++;
                        }
                        writeLock.unlock();
                    } finally {
                        countDownLatch.countDown();
                    }
                } finally {
                    while (i < readHoldCount) {
                        readLock.lock();
                        i++;
                    }
                    writeLock.unlock();
                }
            }
        });
    }

    public static void b() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            keyPairGenerator.initialize(c());
            keyPairGenerator.generateKeyPair();
        } catch (Exception e) {
            throw new EncryptionException("Failed to generate master key", e);
        }
    }

    public static KeyGenParameterSpec c() {
        return new KeyGenParameterSpec.Builder("ALIAS_MASTER_KEY", 3).setKeySize(2048).setEncryptionPaddings("PKCS1Padding").setAlgorithmParameterSpec(new RSAKeyGenParameterSpec(2048, RSAKeyGenParameterSpec.F4)).setCertificateSubject(new X500Principal("CN=ALIAS_MASTER_KEY")).setCertificateSerialNumber(BigInteger.valueOf(Math.abs(1301899345))).build();
    }

    public final void a() {
        if (this.c.getCount() > 0) {
            throw new EncryptionException("Manager is not initialized");
        }
        if (!f()) {
            throw new EncryptionException("Cannot perform operations without master key");
        }
    }

    public final byte[] d(String str, vjp vjpVar) {
        ReentrantReadWriteLock.ReadLock readLock = this.b.readLock();
        readLock.lock();
        try {
            a();
            s3q0 s3q0Var = s3q0.a;
            readLock.unlock();
            byte[] e = e(str);
            if (e == null) {
                throw new EncryptionException("No key with alias ".concat(str));
            }
            try {
                ReentrantLock reentrantLock = this.f;
                reentrantLock.lock();
                try {
                    SecretKeySpec secretKeySpec = new SecretKeySpec(e, "AES");
                    Cipher cipher = this.e;
                    Cipher cipher2 = null;
                    if (cipher == null) {
                        cipher = null;
                    }
                    cipher.init(2, secretKeySpec, new IvParameterSpec(vjpVar.b()));
                    Cipher cipher3 = this.e;
                    if (cipher3 != null) {
                        cipher2 = cipher3;
                    }
                    return cipher2.doFinal(vjpVar.a());
                } finally {
                    reentrantLock.unlock();
                }
            } catch (Exception e2) {
                throw new EncryptionException("Failed to decrypt with aes key", e2);
            }
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    public final byte[] e(String str) {
        byte[] bArr = this.a.get(str);
        if (bArr == null) {
            L.p("No key with alias ".concat(str));
            return null;
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA/NONE/PKCS1Padding");
            KeyStore keyStore = this.d;
            if (keyStore == null) {
                keyStore = null;
            }
            cipher.init(2, keyStore.getKey("ALIAS_MASTER_KEY", null));
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            throw new EncryptionException("Failed to decrypt with master key", e);
        }
    }

    public final boolean f() {
        try {
            KeyStore keyStore = this.d;
            if (keyStore == null) {
                keyStore = null;
            }
            return keyStore.getKey("ALIAS_MASTER_KEY", null) != null;
        } catch (Exception e) {
            L.E(e, "Failed to retrieve master key");
            return false;
        }
    }

    public final boolean g(long j) {
        return this.c.await(j, TimeUnit.MILLISECONDS);
    }
}
