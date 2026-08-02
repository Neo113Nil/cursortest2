package xsna;

import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.toggle.Features;
import com.vk.toggle.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class a3l implements Preference.b, Preference.c {
    public final /* synthetic */ DebugDevSettingsFragment b;

    public /* synthetic */ a3l(DebugDevSettingsFragment debugDevSettingsFragment) {
        this.b = debugDevSettingsFragment;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        String[] strArr = DebugDevSettingsFragment.t0;
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.b.findPreference("__dbg_view_post_time_overlay");
        if (((Boolean) obj).booleanValue()) {
            checkBoxPreference.O(false);
        }
        DebugDevSettingsFragment.jo();
        return true;
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        String[] strArr = DebugDevSettingsFragment.t0;
        Features.Type type = Features.Type.FEATURE_NET_ZSTD;
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        b.d i = bVar.i(type);
        if (i != null) {
            b0r0 b0r0Var = new b0r0(i);
            b0r0Var.a = false;
            b0r0.d.c(b0r0Var);
        }
        o2l.a.getClass();
        o2l.h("__dbg_msg_pack_disabled", true);
        b.d i2 = bVar.i(Features.Type.FEATURE_NET_PROTOCOL_TYPE);
        if (i2 != null) {
            b0r0 b0r0Var2 = new b0r0(i2);
            b0r0Var2.a = false;
            b0r0.d.c(b0r0Var2);
        }
        this.b.ko();
        return true;
    }
}
