package xsna;

import android.content.SharedPreferences;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class a4l implements SharedPreferences.OnSharedPreferenceChangeListener {
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        String[] strArr = DebugDevSettingsFragment.t0;
        if (str.equals("__dbg_voip_ok_test_domain")) {
            a201.b().a().b();
        }
    }
}
