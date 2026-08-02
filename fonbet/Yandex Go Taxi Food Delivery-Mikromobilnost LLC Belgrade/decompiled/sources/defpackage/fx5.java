package defpackage;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import io.appmetrica.analytics.AppMetrica;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PublicKey;
import ru.CryptoPro.JCP.JCP;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes11.dex */
public final class fx5 implements ex5 {
    public final rwo a;

    public fx5(rwo rwoVar) {
        this.a = rwoVar;
    }

    @Override // defpackage.ex5
    public final String a(Context context, String str) {
        PublicKey publicKey;
        if (apa1.e(FeatureFlag.ENABLE_BIOMETRY)) {
            boolean z = new mrj(new abe(context, 2)).g(15) == 0;
            qv90.a.getClass();
            String concat = "Доступна ли биометрия на устройстве: ".concat(z ? "доступна" : "не доступна");
            wj00 wj00Var = new wj00(0);
            wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat);
            wj00Var.i("value", z);
            iho c = y891.c("biometry_available_on_device", wj00Var);
            rwo rwoVar = this.a;
            ((y22) rwoVar).a(c);
            if (z) {
                String uuid = AppMetrica.getUuid(context);
                if (uuid == null) {
                    uuid = "";
                }
                String p = g8e.p(str, "-", uuid);
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    if (keyStore.containsAlias(p)) {
                        wj00 wj00Var2 = new wj00(0);
                        wj00Var2.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Публичный ключ существует");
                        ((y22) rwoVar).a(y891.c("biometry_public_key_exists", wj00Var2));
                        KeyStore keyStore2 = KeyStore.getInstance("AndroidKeyStore");
                        keyStore2.load(null);
                        publicKey = keyStore2.getCertificate(p).getPublicKey();
                    } else {
                        wj00 wj00Var3 = new wj00(0);
                        wj00Var3.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Начало генерации ключевой пары");
                        ((y22) rwoVar).a(y891.c("biometry_generate_key_pair_start", wj00Var3));
                        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
                        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(p, 4);
                        builder.setDigests(JCP.DIGEST_SHA_256);
                        builder.setUserAuthenticationRequired(true);
                        keyPairGenerator.initialize((Build.VERSION.SDK_INT >= 30 ? builder.setUserAuthenticationParameters(0, 3) : builder.setUserAuthenticationValidityDurationSeconds(-1)).build());
                        PublicKey publicKey2 = keyPairGenerator.generateKeyPair().getPublic();
                        if (publicKey2 != null) {
                            wj00 wj00Var4 = new wj00(0);
                            wj00Var4.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Успешная генерации ключевой пары");
                            ((y22) rwoVar).a(y891.c("biometry_generate_key_pair_success", wj00Var4));
                        } else {
                            ((y22) rwoVar).a(sv90.c("KeyPairGenerator.generateKeyPair() returned null"));
                        }
                        publicKey = publicKey2;
                    }
                } catch (Exception e) {
                    sv90 sv90Var = qv90.a;
                    String valueOf = String.valueOf(e.getMessage());
                    sv90Var.getClass();
                    ((y22) rwoVar).a(sv90.c(valueOf));
                    publicKey = null;
                }
                String encodeToString = publicKey != null ? Base64.encodeToString(publicKey.getEncoded(), 2) : null;
                if (encodeToString != null) {
                    return encodeToString;
                }
            }
        }
        return null;
    }
}
