package defpackage;

import com.ybsdk.feature.settings.internal.screens.settings.presentation.SettingsFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class a8r0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingsFragment b;

    public /* synthetic */ a8r0(SettingsFragment settingsFragment, int i) {
        this.a = i;
        this.b = settingsFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 onViewCreated$lambda$8;
        zy11 onViewCreated$lambda$9;
        zy11 adapter$lambda$3;
        int i = this.a;
        SettingsFragment settingsFragment = this.b;
        switch (i) {
            case 0:
                onViewCreated$lambda$8 = SettingsFragment.onViewCreated$lambda$8(settingsFragment);
                return onViewCreated$lambda$8;
            case 1:
                onViewCreated$lambda$9 = SettingsFragment.onViewCreated$lambda$9(settingsFragment);
                return onViewCreated$lambda$9;
            default:
                adapter$lambda$3 = SettingsFragment.adapter$lambda$3(settingsFragment);
                return adapter$lambda$3;
        }
    }
}
