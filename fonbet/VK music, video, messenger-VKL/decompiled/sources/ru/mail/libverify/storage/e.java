package ru.mail.libverify.storage;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import java.security.UnrecoverableKeyException;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import ru.mail.libverify.l0.d;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
final class e extends ru.mail.libverify.l0.c {
    private static String b;
    private static f c;

    @Nullable
    private static volatile String d;

    private static byte[] a(@NonNull Context context, @NonNull String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        if (b(context).a()) {
            return bytes;
        }
        try {
            KeyPair c2 = c(context);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1PADDING");
            cipher.init(1, c2.getPublic());
            return cipher.doFinal(bytes);
        } catch (IllegalArgumentException e) {
            e = e;
            FileLog.e("Installation", "Failed to encrypt installation id (unsupported system locale)", e);
            b(context).a(context, true);
            return bytes;
        } catch (IllegalStateException e2) {
            FileLog.e("Installation", "Failed to encrypt installation id (credentials storage locked)", e2);
            b(context).a(context, true);
            return bytes;
        } catch (InvalidKeyException e3) {
            e = e3;
            FileLog.e("Installation", "Failed to encrypt installation id, no such algorithm", e);
            b(context).a(context, true);
            return bytes;
        } catch (NoSuchAlgorithmException e4) {
            e = e4;
            FileLog.e("Installation", "Failed to encrypt installation id, no such algorithm", e);
            b(context).a(context, true);
            return bytes;
        } catch (ProviderException e5) {
            e = e5;
            FileLog.e("Installation", "Failed to encrypt installation id (unsupported system locale)", e);
            b(context).a(context, true);
            return bytes;
        } catch (UnrecoverableKeyException e6) {
            FileLog.e("Installation", "Failed to encrypt installation id (private key error)", e6);
            b(context).a(context, true);
            return bytes;
        } catch (BadPaddingException e7) {
            e = e7;
            FileLog.e("Installation", "Failed to encrypt installation id (use plain text one)", e);
            b(context).a(context, true);
            return bytes;
        } catch (IllegalBlockSizeException e8) {
            e = e8;
            FileLog.e("Installation", "Failed to encrypt installation id (use plain text one)", e);
            b(context).a(context, true);
            return bytes;
        } catch (NoSuchPaddingException e9) {
            e = e9;
            FileLog.e("Installation", "Failed to encrypt installation id, no such algorithm", e);
            b(context).a(context, true);
            return bytes;
        } catch (Exception e10) {
            ru.mail.libverify.n0.b.a("Installation", "Failed to encrypt installation id (use plain text one)", e10);
            b(context).a(context, true);
            return bytes;
        }
    }

    @NonNull
    private static f b(@NonNull Context context) {
        if (c == null) {
            c = new f(context);
        }
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.security.KeyStore$LoadStoreParameter, java.security.KeyStore$ProtectionParameter] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.security.KeyStore$Entry] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.security.KeyStore] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.security.KeyStore] */
    private static KeyPair c(@NonNull Context context) throws Exception {
        ?? r1 = 0;
        int i = 0;
        Exception e = null;
        while (i < 5) {
            try {
                String d2 = d(context);
                ?? keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(r1);
                r1 = keyStore.getEntry(d2, r1);
            } catch (NullPointerException e2) {
                FileLog.e("Installation", "error raised during key search", e2);
                try {
                    FileLog.v("Installation", "try to remove key");
                    String d3 = d(context);
                    ?? keyStore2 = KeyStore.getInstance("AndroidKeyStore");
                    keyStore2.load(r1);
                    keyStore2.deleteEntry(d3);
                } catch (Throwable th) {
                    FileLog.e("Installation", "failed to clear key", th);
                }
            } catch (Exception e3) {
                e = e3;
                FileLog.e("Installation", e, "error raised during key search on attempt %s", Integer.valueOf(i));
                i++;
                try {
                    FileLog.d("Installation", "failed to get extract key during attempt %s", Integer.valueOf(i));
                    synchronized (e.class) {
                        e.class.wait(i * i * 100);
                        r1 = r1;
                    }
                } catch (InterruptedException e4) {
                    FileLog.e("Installation", e4, "failed to wait timeout before next attempt", new Object[0]);
                }
            }
            if (r1 != 0) {
                KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) r1;
                return new KeyPair(privateKeyEntry.getCertificate().getPublicKey(), privateKeyEntry.getPrivateKey());
            }
            Locale locale = Locale.US;
            GregorianCalendar gregorianCalendar = new GregorianCalendar(locale);
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(locale);
            gregorianCalendar2.add(1, 5);
            KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(d(context), 3).setDigests("SHA-256", "SHA-512").setSignaturePaddings("PKCS1").setEncryptionPaddings("PKCS1Padding").setKeyValidityStart(gregorianCalendar.getTime()).setKeyValidityEnd(gregorianCalendar2.getTime()).build();
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            keyPairGenerator.initialize(build);
            return keyPairGenerator.generateKeyPair();
        }
        throw e;
    }

    @NonNull
    private static String d(@NonNull Context context) {
        if (b == null) {
            b = context.getPackageName() + "_libverify_installation_key";
        }
        return b;
    }

    @NonNull
    public static String e(@NonNull Context context) {
        d.b bVar;
        FileOutputStream fileOutputStream;
        if (d == null) {
            synchronized (e.class) {
                if (d == null) {
                    ru.mail.libverify.l0.d dVar = ru.mail.libverify.l0.c.a;
                    dVar.a(d.b.INITIALIZING);
                    try {
                        File file = new File(ru.mail.libverify.n0.e.c(context), "VERIFY_INSTALLATION");
                        if (file.exists()) {
                            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                            try {
                                byte[] bArr = new byte[(int) randomAccessFile.length()];
                                randomAccessFile.readFully(bArr);
                                String a = a(context, bArr);
                                randomAccessFile.close();
                                d = a;
                                if (TextUtils.isEmpty(d)) {
                                    f(context);
                                    d = UUID.randomUUID().toString();
                                    String str = d;
                                    Objects.requireNonNull(str);
                                    fileOutputStream = new FileOutputStream(file);
                                    try {
                                        fileOutputStream.write(a(context, str));
                                        fileOutputStream.flush();
                                        fileOutputStream.close();
                                    } finally {
                                    }
                                }
                            } finally {
                            }
                        } else {
                            d = UUID.randomUUID().toString();
                            String str2 = d;
                            Objects.requireNonNull(str2);
                            fileOutputStream = new FileOutputStream(file);
                            try {
                                fileOutputStream.write(a(context, str2));
                                fileOutputStream.flush();
                                fileOutputStream.close();
                            } finally {
                            }
                        }
                        bVar = d.b.HAS_INSTALLATION;
                    } catch (Throwable th) {
                        try {
                            ru.mail.libverify.n0.b.a("Installation", "failed to create installation file", new RuntimeException(th));
                            f(context);
                            d = UUID.randomUUID().toString();
                            dVar = ru.mail.libverify.l0.c.a;
                            bVar = d.b.HAS_INSTALLATION;
                        } catch (Throwable th2) {
                            ru.mail.libverify.l0.c.a.a(d.b.HAS_INSTALLATION);
                            throw th2;
                        }
                    }
                    dVar.a(bVar);
                }
            }
        }
        String str3 = d;
        Objects.requireNonNull(str3);
        return str3;
    }

    public static synchronized void f(@NonNull Context context) {
        synchronized (e.class) {
            try {
                ru.mail.libverify.l0.d dVar = ru.mail.libverify.l0.c.a;
                dVar.a(d.b.RESETTING);
                d = null;
                File file = new File(ru.mail.libverify.n0.e.c(context), "VERIFY_INSTALLATION");
                if (!file.exists()) {
                    dVar.a(d.b.NO_INSTALLATION);
                    b(context).a(context, false);
                    return;
                }
                boolean delete = file.delete();
                if (!delete) {
                    File file2 = new File(ru.mail.libverify.n0.e.c(context), "VERIFY_INSTALLATION_TMP");
                    boolean renameTo = file.renameTo(file2);
                    delete = renameTo ? file2.delete() : renameTo;
                }
                FileLog.d("Installation", "installation file delete result " + delete);
                dVar.a(d.b.NO_INSTALLATION);
                b(context).a(context, false);
            } catch (Throwable th) {
                try {
                    FileLog.e("Installation", "failed to reset installation file", th);
                } finally {
                    ru.mail.libverify.l0.c.a.a(d.b.NO_INSTALLATION);
                    b(context).a(context, false);
                }
            }
        }
    }

    @Nullable
    private static String a(@NonNull Context context, @NonNull byte[] bArr) {
        if (b(context).a()) {
            return new String(bArr, StandardCharsets.UTF_8);
        }
        try {
            KeyPair c2 = c(context);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1PADDING");
            cipher.init(2, c2.getPrivate());
            return new String(cipher.doFinal(bArr), StandardCharsets.UTF_8);
        } catch (IllegalArgumentException e) {
            FileLog.e("Installation", "Failed to decrypt installation id (unsupported system locale)", e);
            return null;
        } catch (IllegalStateException e2) {
            FileLog.e("Installation", "Failed to decrypt installation id (credentials storage locked)", e2);
            return null;
        } catch (InvalidKeyException e3) {
            e = e3;
            FileLog.e("Installation", "Failed to decrypt installation id, no such algorithm", e);
            return null;
        } catch (NoSuchAlgorithmException e4) {
            e = e4;
            FileLog.e("Installation", "Failed to decrypt installation id, no such algorithm", e);
            return null;
        } catch (UnrecoverableKeyException e5) {
            FileLog.e("Installation", "Failed to decrypt installation id (private key error)", e5);
            return null;
        } catch (BadPaddingException e6) {
            e = e6;
            FileLog.e("Installation", "Failed to decrypt installation id, bad key", e);
            return null;
        } catch (IllegalBlockSizeException e7) {
            e = e7;
            FileLog.e("Installation", "Failed to decrypt installation id, bad key", e);
            return null;
        } catch (NoSuchPaddingException e8) {
            e = e8;
            FileLog.e("Installation", "Failed to decrypt installation id, no such algorithm", e);
            return null;
        } catch (Throwable th) {
            ru.mail.libverify.n0.b.a("Installation", "Failed to decrypt installation id", th);
            return null;
        }
    }
}
