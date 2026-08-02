package xsna;

import com.vk.common.view.settings.RadioSettingsViewGroup;
import com.vk.im.settings.appearance.AppearanceSettingsWithBackgroundsFragment;

/* compiled from: AppearanceSettingsWithBackgroundsFragment.kt */
/* loaded from: classes2.dex */
public final class tc3 implements RadioSettingsViewGroup.a {
    public final /* synthetic */ AppearanceSettingsWithBackgroundsFragment a;

    public tc3(AppearanceSettingsWithBackgroundsFragment appearanceSettingsWithBackgroundsFragment) {
        this.a = appearanceSettingsWithBackgroundsFragment;
    }

    @Override // com.vk.common.view.settings.RadioSettingsViewGroup.a
    public final void a(int i) {
        AppearanceSettingsWithBackgroundsFragment appearanceSettingsWithBackgroundsFragment = this.a;
        appearanceSettingsWithBackgroundsFragment.Y.post(new oc3(i, appearanceSettingsWithBackgroundsFragment));
    }
}
