package xsna;

import android.os.Bundle;
import androidx.preference.Preference;
import java.util.List;
import xsna.ky6;

/* compiled from: SettingsGeneralFragment.java */
/* loaded from: classes7.dex */
public final class c2j0 implements Preference.b {
    @Override // androidx.preference.Preference.b
    public final boolean Sl(Preference preference, Object obj) {
        List<String> list = m6x.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ky6.a aVar = (ky6.a) com.vk.core.preference.Preference.j().edit();
        aVar.putBoolean("trackInstalledApps", booleanValue);
        aVar.a();
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        Bundle bundle = new rhp0().a;
        bundle.putBoolean("APPS_TRACKING_ENABLED", booleanValue);
        bVar.f(bundle);
        return true;
    }
}
