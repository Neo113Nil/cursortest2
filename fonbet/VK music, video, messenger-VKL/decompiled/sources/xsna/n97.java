package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.hsk0;

/* compiled from: BiometricsLockStatInteractor.kt */
/* loaded from: classes15.dex */
public final class n97 {
    public static void a(hsk0 hsk0Var, int i) {
        MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem.BiometricsType biometricsType;
        if (i != 0) {
            if (i != 1) {
                if (i == 11) {
                    biometricsType = MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem.BiometricsType.NO_ENROLLED;
                } else if (i != 12) {
                    biometricsType = MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem.BiometricsType.UNKNOWN;
                }
            }
            biometricsType = MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem.BiometricsType.HARDWARE_UNAVAILABLE;
        } else {
            biometricsType = MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem.BiometricsType.TOUCH_ID;
        }
        MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem.BiometricsType biometricsType2 = biometricsType;
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), hsk0Var instanceof hsk0.a ? new MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem(o97.a(hsk0Var), biometricsType2, Integer.valueOf((int) ((hsk0.a) hsk0Var).a), null, 8, null) : hsk0Var instanceof isk0 ? new MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem(o97.a(hsk0Var), biometricsType2, null, Boolean.valueOf(((isk0) hsk0Var).isEnabled()), 4, null) : null, 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }
}
