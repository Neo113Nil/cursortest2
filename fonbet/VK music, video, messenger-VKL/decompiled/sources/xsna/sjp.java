package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import androidx.security.crypto.EncryptedSharedPreferences;
import com.vk.core.preference.Preference;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.crypto.KeyGenerator;
import xsna.ga2;

/* compiled from: EncryptedPreferencesHelper.kt */
/* loaded from: classes.dex */
public final class sjp {
    public static boolean a;

    public static EncryptedSharedPreferences a(Context context, String str, SharedPreferences sharedPreferences) {
        aiy a2;
        aiy a3;
        String concat = "encrypted_".concat(str);
        KeyGenParameterSpec keyGenParameterSpec = fk10.a;
        if (keyGenParameterSpec.getKeySize() != 256) {
            throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec.getKeySize() + " bits");
        }
        if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
            throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpec.getBlockModes()));
        }
        if (keyGenParameterSpec.getPurposes() != 3) {
            throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpec.getPurposes());
        }
        if (!Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
        }
        if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
            throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
        }
        String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.containsAlias(keystoreAlias)) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(keyGenParameterSpec);
            keyGenerator.generateKey();
        }
        String keystoreAlias2 = keyGenParameterSpec.getKeystoreAlias();
        EncryptedSharedPreferences.PrefKeyEncryptionScheme prefKeyEncryptionScheme = EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV;
        EncryptedSharedPreferences.PrefValueEncryptionScheme prefValueEncryptionScheme = EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM;
        int i = j5m.a;
        mrf0.f(new r61(o61.class, new q61(i5m.class)), true);
        mrf0.g(new k5m());
        c51.a();
        ga2.a aVar = new ga2.a();
        aVar.e = prefKeyEncryptionScheme.h();
        aVar.d(context, "__androidx_security_crypto_encrypted_prefs_key_keyset__", concat);
        String str2 = "android-keystore://" + keystoreAlias2;
        if (!str2.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        aVar.c = str2;
        ga2 a4 = aVar.a();
        synchronized (a4) {
            a2 = a4.a.a();
        }
        ga2.a aVar2 = new ga2.a();
        aVar2.e = prefValueEncryptionScheme.h();
        aVar2.d(context, "__androidx_security_crypto_encrypted_prefs_value_keyset__", concat);
        String str3 = "android-keystore://" + keystoreAlias2;
        if (!str3.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        aVar2.c = str3;
        ga2 a5 = aVar2.a();
        synchronized (a5) {
            a3 = a5.a.a();
        }
        EncryptedSharedPreferences encryptedSharedPreferences = new EncryptedSharedPreferences(concat, Preference.h(context, 0, concat), (b51) a3.a(b51.class), (i5m) a2.a(i5m.class));
        sharedPreferences.edit().putInt("____encryptedPrefsApi____", 23).apply();
        return encryptedSharedPreferences;
    }

    public static void b(Context context) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        if (!uz70.c()) {
            uz70.b(Preference.a, new b61(context, newSingleThreadExecutor, new xv8(2), new myc0(), new com.vk.movika.sdk.base.ui.v(2)));
        }
        uz70.c.await(1500L, TimeUnit.MILLISECONDS);
        b61 b61Var = uz70.a;
        if (b61Var == null) {
            b61Var = null;
        }
        b61Var.g(1500L);
    }
}
