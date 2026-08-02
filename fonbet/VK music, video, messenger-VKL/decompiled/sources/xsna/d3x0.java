package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.voip.ui.prodstat.analytics.notification.model.VoipNotificationShowFailedReasonAnalytics;

/* compiled from: VoipVKNotificationAnalyticsEventSenderImpl.kt */
/* loaded from: classes7.dex */
public final class d3x0 extends a3x0 {
    public final String a = "VoipVKNotificationAnalyticsEventSenderImpl";

    @Override // xsna.a3x0
    public final String o() {
        return this.a;
    }

    public final void q(VoipNotificationShowFailedReasonAnalytics voipNotificationShowFailedReasonAnalytics) {
        a3x0.p(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CALL_NOTIFICATION_SHOW_FAILED, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, com.vk.voip.ui.c.b.s0(), voipNotificationShowFailedReasonAnalytics.h(), null, 1073740662);
    }
}
