package xsna;

import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import xsna.dw20;
import xsna.tzp0;

/* compiled from: ClassifiedsCatalogRootModalBottomSheet.kt */
/* loaded from: classes18.dex */
public final class dgc extends dw20 implements m0q0 {

    /* compiled from: ClassifiedsCatalogRootModalBottomSheet.kt */
    public static final class a extends dw20.b {
        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            return new dgc();
        }
    }

    public dgc() {
        this.x = new tzp0.c.a(this, true);
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.MARKETPLACE_PROFILE;
    }
}
