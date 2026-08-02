package xsna;

import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogLayoutDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.core.preference.Preference;
import com.vk.dto.common.Source;
import com.vk.log.L;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class xv8 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ xv8(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                if (!((Boolean) obj).booleanValue()) {
                    Preference preference = Preference.a;
                    long j = o25.a().c().b;
                    preference.getClass();
                    Preference.E(j, false);
                }
                return s3q0.a;
            case 1:
                CatalogBlockDto catalogBlockDto = (CatalogBlockDto) obj;
                CatalogBlockVariant.a aVar = CatalogBlockVariant.Companion;
                return Boolean.valueOf(catalogBlockDto.n1().i() != CatalogLayoutDto.StyleDto.INVISIBLE_AUTHOR && catalogBlockDto.n1().q() == null);
            case 2:
                L.i((Exception) obj);
                return s3q0.a;
            case 3:
                a1w a1wVar = i2w.c;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                return a1wVar.C("ImEngineProvider.musicSubscription", new vo(Source.NETWORK));
            default:
                String str = (String) obj;
                List l = e43.l("vk_theme_helper", "contacts_sync_options", "contacts_sync_common", "install_referrer_prefs", "ServerTimeProvider_LIB_TIME_CONFIG", "vk_anonymous_token_prefs", "BillingManagerPrefs", "application_exit_info", "ConfigurationOverridingHelper", "im_prefs", "firebase_preferences", "firebase_preferences_bro_hosts", "multi_push_settings_prefs", "multi_account_toggles_prefs", "toggles_anonymous_common", "toggles_meta_".concat("anonymous"), "fcm_toast", "by_version", "stickers", "default_prefs", "voip_prefs_shared", "notifications_enabled", "notification_gdpr_dialog", "encrypted_session_management", "plain_session_management", "session_management_unencrypted", "multi_account_security_notification_settings_prefs", "music_prefs", "PlayerService_", "multiacc_additional_prefs", "biometrics_lock", "trusted_hashes", "VkStepsDataSourceStore", "VkStepsStore", "VkStepsUserStore", "AUTOTEST_SETTINGS");
                if (!(l instanceof Collection) || !l.isEmpty()) {
                    Iterator it = l.iterator();
                    while (it.hasNext()) {
                        if (brm0.B(str, (String) it.next(), false)) {
                            return Boolean.valueOf(r2);
                        }
                    }
                }
                r2 = false;
                return Boolean.valueOf(r2);
        }
    }
}
