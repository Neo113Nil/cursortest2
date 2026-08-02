package xsna;

import androidx.preference.Preference;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.superapp.vkworkout.widget.api.di.VkWorkoutWidgetComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class d3l implements Preference.c, Preference.b {
    public final /* synthetic */ DebugDevSettingsFragment b;

    public /* synthetic */ d3l(DebugDevSettingsFragment debugDevSettingsFragment) {
        this.b = debugDevSettingsFragment;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        String[] strArr = DebugDevSettingsFragment.t0;
        i0q0.d(500L, new r44(this.b, 10));
        return true;
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        String[] strArr = DebugDevSettingsFragment.t0;
        DebugDevSettingsFragment debugDevSettingsFragment = this.b;
        ((VkWorkoutWidgetComponent) j6i.b(m7m.f(debugDevSettingsFragment), VkWorkoutWidgetComponent.class)).v5().g(debugDevSettingsFragment.requireContext());
        return true;
    }
}
