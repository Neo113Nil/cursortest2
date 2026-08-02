package ru.mail.libverify.storage;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ru.mail.libverify.platform.storage.KeyValueStorage;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
final class i {
    private final KeyValueStorage a;

    public i(KeyValueStorage keyValueStorage) {
        this.a = keyValueStorage;
    }

    @Nullable
    public final synchronized String a() {
        String value = this.a.getValue("server_key_manager_private_data");
        String value2 = this.a.getValue("server_key_manager_public_data");
        if (!TextUtils.isEmpty(value2) && !TextUtils.isEmpty(value)) {
            return value2;
        }
        try {
            FileLog.v("ServerKeyManager", "key generation started");
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
            FileLog.v("ServerKeyManager", "key generation completed");
            String b = ru.mail.libverify.n0.e.b(generateKeyPair.getPrivate().getEncoded());
            String b2 = ru.mail.libverify.n0.e.b(generateKeyPair.getPublic().getEncoded());
            this.a.putValue("server_key_manager_private_data", b).putValue("server_key_manager_public_data", b2).commit();
            return b2;
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException e) {
            FileLog.e("ServerKeyManager", "failed to generate key pair", e);
            return null;
        }
    }

    public final synchronized void b() {
        this.a.removeValue("server_key_manager_private_data").removeValue("server_key_manager_public_data").commit();
    }

    @NonNull
    public final synchronized String a(@NonNull String str, @NonNull String str2) throws DecryptionError {
        byte[] b;
        Cipher cipher;
        FileLog.v("ServerKeyManager", "decrypt message started");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String value = this.a.getValue("server_key_manager_private_data");
            try {
                if (!TextUtils.isEmpty(value)) {
                    try {
                        PrivateKey a = a(value);
                        Cipher cipher2 = Cipher.getInstance("RSA/ECB/PKCS1PADDING");
                        cipher2.init(2, a);
                        byte[] doFinal = cipher2.doFinal(ru.mail.libverify.n0.e.b(str2));
                        b = ru.mail.libverify.n0.e.b(str);
                        cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                        cipher.init(2, new SecretKeySpec(doFinal, "AES"), new IvParameterSpec(b, 0, 16));
                    } catch (InvalidKeyException e) {
                        e = e;
                        FileLog.e("ServerKeyManager", "failed to decrypt server message", e);
                        this.a.removeValue("server_key_manager_private_data").removeValue("server_key_manager_public_data").commit();
                        throw new DecryptionError(e);
                    } catch (NoSuchAlgorithmException e2) {
                        e = e2;
                        FileLog.e("ServerKeyManager", "failed to decrypt server message", e);
                        this.a.removeValue("server_key_manager_private_data").removeValue("server_key_manager_public_data").commit();
                        throw new DecryptionError(e);
                    } catch (InvalidKeySpecException e3) {
                        e = e3;
                        FileLog.e("ServerKeyManager", "failed to decrypt server message", e);
                        this.a.removeValue("server_key_manager_private_data").removeValue("server_key_manager_public_data").commit();
                        throw new DecryptionError(e);
                    } catch (BadPaddingException e4) {
                        e = e4;
                        FileLog.e("ServerKeyManager", "failed to decrypt server message", e);
                        this.a.removeValue("server_key_manager_private_data").removeValue("server_key_manager_public_data").commit();
                        throw new DecryptionError(e);
                    } catch (IllegalBlockSizeException e5) {
                        e = e5;
                        FileLog.e("ServerKeyManager", "failed to decrypt server message", e);
                        this.a.removeValue("server_key_manager_private_data").removeValue("server_key_manager_public_data").commit();
                        throw new DecryptionError(e);
                    } catch (NoSuchPaddingException e6) {
                        e = e6;
                        FileLog.e("ServerKeyManager", "failed to decrypt server message", e);
                        this.a.removeValue("server_key_manager_private_data").removeValue("server_key_manager_public_data").commit();
                        throw new DecryptionError(e);
                    } catch (Exception e7) {
                        ru.mail.libverify.n0.b.a("ServerKeyManager", "failed to decrypt server message", e7);
                        this.a.removeValue("server_key_manager_private_data").removeValue("server_key_manager_public_data").commit();
                        throw new DecryptionError(e7);
                    }
                } else {
                    throw new DecryptionError();
                }
            } finally {
                FileLog.v("ServerKeyManager", "decrypt message completed");
            }
        } else {
            throw new IllegalArgumentException();
        }
        return new String(cipher.doFinal(b, 16, b.length - 16), StandardCharsets.UTF_8);
    }

    private static PrivateKey a(@NonNull String str) throws NoSuchAlgorithmException, InvalidKeySpecException {
        return KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(ru.mail.libverify.n0.e.b(str)));
    }
}
