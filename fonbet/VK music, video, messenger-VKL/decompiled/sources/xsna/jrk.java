package xsna;

import android.content.SharedPreferences;
import com.vk.core.preference.Preference;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoDynamicTabsOnboardingItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.video.ui.discovery.minimizable.q;

/* compiled from: D2DOnboardingDelegateImpl.kt */
/* loaded from: classes7.dex */
public final class jrk implements irk {
    public final bpn0 a;
    public final SharedPreferences b = Preference.f("video_d2d_onboarding");

    public jrk(bpn0 bpn0Var) {
        this.a = bpn0Var;
    }

    @Override // xsna.irk
    public final void a() {
        SharedPreferences sharedPreferences = this.b;
        int i = sharedPreferences.getInt("d2d_onboarding_tab_clicks", 0);
        if (i < 3) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt("d2d_onboarding_tab_clicks", i + 1);
            edit.apply();
        }
    }

    @Override // xsna.irk
    public final void b() {
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = this.b;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong("d2d_onboarding_shown_timestamp", currentTimeMillis);
        edit.apply();
        int i = sharedPreferences.getInt("d2d_onboarding_shown_count", 0) + 1;
        SharedPreferences.Editor edit2 = sharedPreferences.edit();
        edit2.putInt("d2d_onboarding_shown_count", i);
        edit2.apply();
        new iid0(MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_DISCOVERY, SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsVideoStat$TypeVideoDynamicTabsOnboardingItem(MobileOfficialAppsVideoStat$TypeVideoDynamicTabsOnboardingItem.EventType.ONBOARDING_DYNAMIC_TABS_DOC2DOC, MobileOfficialAppsVideoStat$TypeVideoDynamicTabsOnboardingItem.EventSubtype.VIEW), 3)).q();
    }

    @Override // xsna.irk
    public final boolean c(q.b bVar) {
        return d() && bVar.g && bVar.d >= 5 && bVar.c && bVar.e && bVar.h && !bVar.f && System.currentTimeMillis() - this.b.getLong("d2d_onboarding_shown_timestamp", 0L) >= 259200000;
    }

    @Override // xsna.irk
    public final void clear() {
        this.b.edit().clear().apply();
    }

    @Override // xsna.irk
    public final boolean d() {
        Object obj = rys0.a;
        ((be80) this.a.getValue()).getClass();
        SharedPreferences sharedPreferences = this.b;
        return sharedPreferences.getInt("d2d_onboarding_tab_clicks", 0) < 3 && sharedPreferences.getInt("d2d_onboarding_shown_count", 0) < 2;
    }
}
