package xsna;

import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import xsna.dw20;

/* compiled from: ProtectHintBottomSheet.kt */
/* loaded from: classes5.dex */
public final class y7e0 extends dw20 implements m0q0 {

    /* compiled from: ProtectHintBottomSheet.kt */
    public static final class a extends dw20.b {
        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            return new y7e0();
        }
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.UNBLOCK_PROTECT_ACCOUNT;
    }
}
