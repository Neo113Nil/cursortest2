package xsna;

import android.content.Context;
import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import com.vk.log.L;
import com.vkontakte.android.R;

/* compiled from: SuperappDebugSettingsFragment.kt */
/* loaded from: classes6.dex */
public final class qgn0 extends androidx.preference.b {
    public lpj h;

    @Override // androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public final Context mo2getContext() {
        return this.h;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.h = new lpj(context, R.style.VkPreferenceTheme);
    }

    @Override // androidx.preference.b
    public final void onCreatePreferences(Bundle bundle, String str) {
        addPreferencesFromResource(R.xml.vk_superapp_preferences_debug);
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) findPreference("superapp_dbg_log_to_file");
        if (!L.q()) {
            switchPreferenceCompat.f = new yu50(11);
        }
        Preference findPreference = findPreference("superapp_send_logs");
        if (findPreference != null) {
            findPreference.g = new zil0(2);
        }
    }
}
