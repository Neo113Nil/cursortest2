package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: VoipVKHandAnalyticsEventSenderImpl.kt */
/* loaded from: classes7.dex */
public final class b3x0 extends a3x0 {
    public final String a = "VoipVKHandAnalyticsEventImpl";

    @Override // xsna.a3x0
    public final String o() {
        return this.a;
    }

    public final void q(String str) {
        a3x0.p(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.ALL_HANDS_LOWERED, str, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, com.vk.voip.ui.c.b.s0(), null, null, 1073741682);
    }

    public final void r() {
        a3x0.p(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.USER_HAND_LOWERED, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, com.vk.voip.ui.c.b.s0(), null, null, 1073741686);
    }

    public final void s() {
        a3x0.p(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.HAND_LOWERED, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, com.vk.voip.ui.c.b.s0(), null, null, 1073741686);
    }

    public final void t() {
        a3x0.p(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.HAND_RAISED, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, com.vk.voip.ui.c.b.s0(), null, null, 1073741686);
    }
}
