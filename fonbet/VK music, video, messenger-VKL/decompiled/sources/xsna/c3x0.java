package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: VoipVKMediaMuteAnalyticsEventSenderImpl.kt */
/* loaded from: classes7.dex */
public final class c3x0 extends a3x0 implements esw0 {
    public final String a = "VoipVKMediaMuteAnalyticsEventImpl";

    @Override // xsna.esw0
    public final void a(boolean z) {
        a3x0.p(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.USER_MICS_AND_VIDEO_DISABLED, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, com.vk.voip.ui.c.b.s0(), null, Boolean.valueOf(z), 1073479542);
    }

    @Override // xsna.esw0
    public final void b(boolean z) {
        a3x0.p(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.USER_VIDEO_DISABLED, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, com.vk.voip.ui.c.b.s0(), null, Boolean.valueOf(z), 1073479542);
    }

    @Override // xsna.esw0
    public final void d(boolean z) {
        a3x0.p(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.ALL_MICS_AND_VIDEO_DISABLED, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, com.vk.voip.ui.c.b.s0(), null, Boolean.valueOf(z), 1073479542);
    }

    @Override // xsna.esw0
    public final void e() {
        a3x0.p(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.ASK_USER_TO_UNMUTE_VIDEO, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, com.vk.voip.ui.c.b.s0(), null, null, 1073741686);
    }

    @Override // xsna.esw0
    public final void g() {
        a3x0.p(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.USER_SCREEN_SHARING_DISABLED, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, com.vk.voip.ui.c.b.s0(), null, null, 1073741686);
    }

    @Override // xsna.esw0
    public final void h() {
        a3x0.p(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.ALL_SCREEN_SHARING_DISABLED, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, com.vk.voip.ui.c.b.s0(), null, null, 1073741686);
    }

    @Override // xsna.esw0
    public final void i() {
        a3x0.p(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.ALL_WATCH_TOGETHER_DISABLED, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, com.vk.voip.ui.c.b.s0(), null, null, 1073741686);
    }

    @Override // xsna.esw0
    public final void j() {
        a3x0.p(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.USER_WATCH_TOGETHER_DISABLED, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, com.vk.voip.ui.c.b.s0(), null, null, 1073741686);
    }

    @Override // xsna.esw0
    public final void k() {
        a3x0.p(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.ASK_USER_TO_UNMUTE, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, com.vk.voip.ui.c.b.s0(), null, null, 1073741686);
    }

    @Override // xsna.esw0
    public final void l() {
        a3x0.p(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.ASK_USER_TO_UNMUTE_AUDIO, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, com.vk.voip.ui.c.b.s0(), null, null, 1073741686);
    }

    @Override // xsna.esw0
    public final void n(boolean z) {
        a3x0.p(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.USER_MICS_DISABLED, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, com.vk.voip.ui.c.b.s0(), null, Boolean.valueOf(z), 1073479542);
    }

    @Override // xsna.a3x0
    public final String o() {
        return this.a;
    }
}
