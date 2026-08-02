package xsna;

import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: UnstableNetworkDetectorInitTaskLogic.kt */
/* loaded from: classes7.dex */
public final class h6q0 implements m1q0 {
    @Override // xsna.m1q0
    public final void a(UiTrackingScreen uiTrackingScreen, UiTrackingScreen uiTrackingScreen2) {
        if (uiTrackingScreen.a == MobileOfficialAppsCoreNavStat$EventScreen.FEED_RECENT && uiTrackingScreen2.a == MobileOfficialAppsCoreNavStat$EventScreen.ATTACH_GALLERY) {
            return;
        }
        String a = com.vk.stat.scheme.t0.a(uiTrackingScreen2.a);
        ip20 ip20Var = uiTrackingScreen2.g;
        d6q0 d6q0Var = d6q0.a;
        synchronized (d6q0.class) {
            d6q0.j(new nhp0(a, ip20Var));
        }
    }
}
