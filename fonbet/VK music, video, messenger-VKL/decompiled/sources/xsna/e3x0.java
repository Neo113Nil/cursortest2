package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;

/* compiled from: VoipVKOpenScreenAnalyticsEventSenderImpl.kt */
/* loaded from: classes7.dex */
public final class e3x0 extends a3x0 implements ktw0 {
    public final String a = "VoipVKOpenScreenAnalyticsEventImpl";

    @Override // xsna.ktw0
    public final void m() {
        a3x0.p(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CALL_LINK_QR_CODE_CLICK, null, null, false, null, null, 1073741822);
    }

    @Override // xsna.a3x0
    public final String o() {
        return this.a;
    }
}
