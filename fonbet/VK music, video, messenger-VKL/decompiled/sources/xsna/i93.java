package xsna;

import com.vk.core.preference.Preference;
import com.vk.stat.AppStartReporter;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeClickPreferenceValueItem;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class i93 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = AppStartReporter.a;
        bny.a.getClass();
        ((cny) bny.f.getValue()).getClass();
        String s = Preference.s("__launcher_icon_change__", "__from_launcher_name__", "");
        String s2 = Preference.s("__launcher_icon_change__", "__to_launcher_name__", "");
        Preference.B("__launcher_icon_change__");
        Pair pair = new Pair(s, s2);
        String str = (String) pair.d();
        String str2 = (String) pair.g();
        if (drm0.N(str) || drm0.N(str2)) {
            return;
        }
        SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(DevNullEventKey.LAUNCHER_ICONS_CHANGE.h(), null, str, null, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -22, 3, null);
        l5m l5mVar = new l5m(null, null, 3);
        l5mVar.g = schemeStat$TypeDevNullItem;
        l5mVar.q();
        new bjc(MobileOfficialAppsCoreNavStat$EventScreen.SETTINGS_APPEARANCE, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.SETTINGS, null, null, null, null, null, 62, null), new SchemeStat$TypeClickPreferenceValueItem(SchemeStat$TypeClickPreferenceValueItem.Type.APPEARANCE, SchemeStat$TypeClickPreferenceValueItem.Name.APP_ICON, str, str2), 2)).q();
    }
}
