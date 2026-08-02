package xsna;

import android.os.Handler;
import android.os.Looper;
import com.vk.core.preference.Preference;
import com.vk.fullscreen.promo.core.PromoSessionInfo;
import xsna.azs;
import xsna.ky6;

/* compiled from: ContactSyncColdStartPromo.kt */
/* loaded from: classes17.dex */
public final class x9j extends azs {
    public static volatile boolean d;
    public static volatile boolean e;
    public final zys b;
    public final Handler c = new Handler(Looper.getMainLooper());

    /* compiled from: ContactSyncColdStartPromo.kt */
    /* loaded from: classes.dex */
    public static final class a implements azs.a {
        @Override // xsna.azs.a
        public final azs a(zys zysVar) {
            return new x9j(zysVar);
        }
    }

    public x9j(zys zysVar) {
        this.b = zysVar;
    }

    public static void b() {
        ky6 j = Preference.j();
        if (j.getBoolean("__contact_sync_cold_start_prefs_migrated_v2__", false)) {
            return;
        }
        ky6.a aVar = (ky6.a) j.edit();
        aVar.putBoolean("__contact_sync_cold_start_prefs_migrated_v2__", true);
        if (j.getBoolean("__contact_sync_prompt_dismissed__", false)) {
            aVar.putBoolean("__contact_sync_perm_modal_dismissed__", true);
            aVar.putBoolean("__contact_sync_share_modal_dismissed__", true);
        }
        int i = j.getInt("__contact_sync_prompt_shown_version__", 0);
        if (i > 0) {
            aVar.putInt("__contact_sync_cold_start_any_modal_version__", i);
            aVar.putInt("__contact_sync_perm_modal_shown_version__", i);
            aVar.putInt("__contact_sync_share_modal_shown_version__", i);
        }
        aVar.remove("__contact_sync_prompt_shown__");
        aVar.remove("__contact_sync_prompt_shown_version__");
        aVar.remove("__contact_sync_prompt_dismissed__");
        aVar.apply();
    }

    public static void c() {
        ky6 j = Preference.j();
        if (j.getBoolean("__contact_sync_unified_version_migrated__", false)) {
            return;
        }
        int max = Math.max(j.getInt("__contact_sync_perm_modal_shown_version__", 0), Math.max(j.getInt("__contact_sync_share_modal_shown_version__", 0), j.getInt("__contact_sync_cold_start_any_modal_version__", 0)));
        ky6.a aVar = (ky6.a) j.edit();
        aVar.putBoolean("__contact_sync_unified_version_migrated__", true);
        if (max > 0) {
            aVar.putInt("__contact_sync_cold_start_any_modal_version__", max);
        }
        aVar.remove("__contact_sync_perm_modal_shown_version__");
        aVar.remove("__contact_sync_share_modal_shown_version__");
        aVar.apply();
    }

    @Override // xsna.azs
    public final void a(PromoSessionInfo promoSessionInfo) {
        asu0.a.getClass();
        asu0.h().execute(new kw6(1, this, promoSessionInfo));
    }
}
