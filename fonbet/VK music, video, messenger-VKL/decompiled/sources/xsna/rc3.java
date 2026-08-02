package xsna;

import android.security.keystore.KeyGenParameterSpec;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.vk.core.preference.Preference;
import com.vk.im.settings.appearance.AppearanceSettingsWithBackgroundsFragment;
import java.util.concurrent.Callable;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class rc3 implements Callable {
    public final /* synthetic */ int b = 0;

    public /* synthetic */ rc3() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z = true;
        switch (this.b) {
            case 0:
                int i = AppearanceSettingsWithBackgroundsFragment.b0;
                boolean K = dhr0.K();
                boolean P = dhr0.P();
                boolean Q = dhr0.Q();
                if (dhr0.Q() || dhr0.K() || dhr0.N() || dhr0.R() || (!dhr0.C().b && Preference.v("vk_theme_helper", "current_theme_name"))) {
                    z = false;
                }
                return new AppearanceSettingsWithBackgroundsFragment.c(K, P, Q, z, dhr0.N());
            default:
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(new KeyGenParameterSpec.Builder("KEY_NAME", 3).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").setUserAuthenticationRequired(true).build());
                SecretKey generateKey = keyGenerator.generateKey();
                Cipher cipher = Cipher.getInstance(j5g.g0(e43.l("AES", "CBC", "PKCS7Padding"), DomExceptionUtils.SEPARATOR, null, null, 0, null, 62));
                cipher.init(1, generateKey);
                return cipher;
        }
    }

    public /* synthetic */ rc3(y97 y97Var) {
    }
}
