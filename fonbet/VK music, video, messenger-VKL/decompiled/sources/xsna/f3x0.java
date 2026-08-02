package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;

/* compiled from: VoipVKShareInfoAnalyticsEventSenderImpl.kt */
/* loaded from: classes7.dex */
public final class f3x0 extends a3x0 implements i1x0 {
    public final String a = "VoipVKShareInfoAnalyticsEventImpl";

    @Override // xsna.i1x0
    public final void c() {
        a3x0.p(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CALL_LINK_QR_CODE_SHARED, null, null, false, null, null, 1073741822);
    }

    @Override // xsna.i1x0
    public final void f() {
        a3x0.p(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CALL_SHORT_LINK_SHARED, null, null, false, null, null, 1073741822);
    }

    @Override // xsna.a3x0
    public final String o() {
        return this.a;
    }
}
