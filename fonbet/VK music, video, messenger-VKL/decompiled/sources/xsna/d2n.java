package xsna;

import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: DiscoverFragmentUpdater.kt */
/* loaded from: classes4.dex */
public final class d2n implements m1q0 {
    public final /* synthetic */ c2n a;

    public d2n(c2n c2nVar) {
        this.a = c2nVar;
    }

    @Override // xsna.m1q0
    public final void a(UiTrackingScreen uiTrackingScreen, UiTrackingScreen uiTrackingScreen2) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = uiTrackingScreen.a;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_MEDIA;
        c2n c2nVar = this.a;
        if (mobileOfficialAppsCoreNavStat$EventScreen == mobileOfficialAppsCoreNavStat$EventScreen2) {
            c2nVar.e = uiTrackingScreen2;
        } else if (uiTrackingScreen2.a == mobileOfficialAppsCoreNavStat$EventScreen2) {
            c2nVar.e = null;
        }
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen3 = uiTrackingScreen2.a;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen4 = MobileOfficialAppsCoreNavStat$EventScreen.SPRINGBOARD;
    }
}
