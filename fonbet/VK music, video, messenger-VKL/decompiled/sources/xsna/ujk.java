package xsna;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import xsna.e57;

/* compiled from: CryptoObjectUtils.java */
/* loaded from: classes11.dex */
public final class ujk {

    /* compiled from: CryptoObjectUtils.java */
    public static class a {
        @NonNull
        public static KeyGenParameterSpec a(@NonNull KeyGenParameterSpec.Builder builder) {
            return builder.build();
        }

        @NonNull
        public static KeyGenParameterSpec.Builder b(@NonNull String str, int i) {
            return new KeyGenParameterSpec.Builder(str, i);
        }

        public static void c(@NonNull KeyGenerator keyGenerator, @NonNull KeyGenParameterSpec keyGenParameterSpec) throws InvalidAlgorithmParameterException {
            keyGenerator.init(keyGenParameterSpec);
        }

        public static void d(@NonNull KeyGenParameterSpec.Builder builder) {
            builder.setBlockModes("CBC");
        }

        public static void e(@NonNull KeyGenParameterSpec.Builder builder) {
            builder.setEncryptionPaddings("PKCS7Padding");
        }
    }

    /* compiled from: CryptoObjectUtils.java */
    public static class b {
        @NonNull
        public static BiometricPrompt.CryptoObject a(@NonNull Signature signature) {
            return new BiometricPrompt.CryptoObject(signature);
        }

        @NonNull
        public static BiometricPrompt.CryptoObject b(@NonNull Cipher cipher) {
            return new BiometricPrompt.CryptoObject(cipher);
        }

        @NonNull
        public static BiometricPrompt.CryptoObject c(@NonNull Mac mac) {
            return new BiometricPrompt.CryptoObject(mac);
        }

        @Nullable
        public static Cipher d(@NonNull BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getCipher();
        }

        @Nullable
        public static Mac e(@NonNull BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getMac();
        }

        @Nullable
        public static Signature f(@NonNull BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getSignature();
        }
    }

    /* compiled from: CryptoObjectUtils.java */
    public static class c {
        @NonNull
        public static BiometricPrompt.CryptoObject a(@NonNull IdentityCredential identityCredential) {
            return new BiometricPrompt.CryptoObject(identityCredential);
        }

        @Nullable
        public static IdentityCredential b(@NonNull BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getIdentityCredential();
        }
    }

    @Nullable
    public static e57.c a() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder b2 = a.b("androidxBiometric", 3);
            a.d(b2);
            a.e(b2);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            a.c(keyGenerator, a.a(b2));
            keyGenerator.generateKey();
            SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new e57.c(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException unused) {
            return null;
        }
    }

    @Nullable
    public static BiometricPrompt.CryptoObject b(@Nullable e57.c cVar) {
        IdentityCredential identityCredential;
        if (cVar == null) {
            return null;
        }
        Cipher cipher = cVar.b;
        if (cipher != null) {
            return b.b(cipher);
        }
        Signature signature = cVar.a;
        if (signature != null) {
            return b.a(signature);
        }
        Mac mac = cVar.c;
        if (mac != null) {
            return b.c(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredential = cVar.d) == null) {
            return null;
        }
        return c.a(identityCredential);
    }
}
