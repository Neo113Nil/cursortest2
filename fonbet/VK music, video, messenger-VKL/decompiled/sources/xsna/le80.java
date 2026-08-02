package xsna;

import android.content.Context;
import com.vk.core.preference.Preference;

/* compiled from: OnboardingPanelTrackerImpl.kt */
/* loaded from: classes6.dex */
public final class le80 implements ke80 {
    public static int a(String str) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return Preference.h(context, 0, "v3_redesign_onboarding_show_count_pref_name").getInt("v3_redesign_onboarding_show_count_field_name" + str, 0);
    }

    public static void b(int i, String str) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        qaj0.c(Preference.h(context, 0, "v3_redesign_onboarding_show_count_pref_name"), go9.b("v3_redesign_onboarding_show_count_field_name", str), Integer.valueOf(i));
    }

    @Override // xsna.ke80
    public final void drop() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        Preference.h(context, 0, "v3_redesign_onboarding_show_count_pref_name").edit().clear().apply();
    }
}
