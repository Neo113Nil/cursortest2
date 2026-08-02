package xsna;

import androidx.annotation.NonNull;
import androidx.preference.Preference;
import com.google.android.ump.ConsentInformation;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import xsna.lau;

/* compiled from: SettingsGeneralFragment.java */
/* loaded from: classes7.dex */
public final class h2j0 implements lau.a {
    public final /* synthetic */ Preference a;
    public final /* synthetic */ SettingsGeneralFragment b;

    public h2j0(SettingsGeneralFragment settingsGeneralFragment, Preference preference) {
        this.b = settingsGeneralFragment;
        this.a = preference;
    }

    @Override // xsna.lau.a
    public final void a(@NonNull rau rauVar) {
        if (rauVar.a.getPrivacyOptionsRequirementStatus() == ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED) {
            Preference preference = this.a;
            preference.K(true);
            int i = SettingsGeneralFragment.z0;
            preference.g = new i1a(this.b, rauVar);
        }
    }

    @Override // xsna.lau.a
    public final void b(@NonNull g2q0 g2q0Var) {
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.e, new Object[]{"User consent info request error: " + g2q0Var});
    }
}
