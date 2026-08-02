package xsna;

import android.security.keystore.KeyGenParameterSpec;
import java.security.Key;
import java.security.KeyStore;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* compiled from: CryptographyManagerImpl.kt */
/* loaded from: classes6.dex */
public final class wjk {
    public static SecretKey a() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        Key key = keyStore.getKey("secret", null);
        if (key != null) {
            return (SecretKey) key;
        }
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("secret", 3);
        builder.setBlockModes("GCM");
        builder.setEncryptionPaddings("NoPadding");
        builder.setKeySize(256);
        builder.setUserAuthenticationRequired(true);
        KeyGenParameterSpec build = builder.build();
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(build);
        return keyGenerator.generateKey();
    }
}
