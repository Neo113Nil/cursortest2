package xsna;

import com.vk.core.preference.Preference;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import java.util.concurrent.ExecutorService;

/* compiled from: PreloadPreferencesTaskLogic.kt */
/* loaded from: classes11.dex */
public final class u1d0 extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "PreloadPreferences";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        Preference preference = Preference.a;
        asu0.a.getClass();
        ExecutorService h = asu0.h();
        preference.getClass();
        h.execute(new sir(new String[]{"vk_prefs_migration", "camera_prefs", "creation.onboarding", "clips-subtitles-state", "clips_draft_prefs", "notifications_prefs", "keyboard", "review_offer_config_storage", "music_prefers_list_name", "menu_items", "music_prefs", "PlayerService_", "stories_cache_migration", "NetworkStateHolder", "notification_gdpr_dialog", "performance", "stories_default", "stories_default", "stickers_search", "SharingV2ViewSharedPrefs", "trusted_hashes", "vendor", "video-subtitles-state", "VkStepsDataSourceStore", "VkStepsStore", "VkStepsUserStore", "vk_theme_helper", "multiacc_additional_prefs"}, 1));
        return s3q0.a;
    }
}
