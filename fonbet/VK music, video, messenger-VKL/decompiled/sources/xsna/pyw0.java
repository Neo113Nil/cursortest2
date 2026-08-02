package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduledCallReportType;

/* compiled from: VoipScheduledCallStatReport.kt */
/* loaded from: classes7.dex */
public final class pyw0 {
    public final VoipScheduledCallReportType a;
    public final CallId b;
    public final MobileOfficialAppsCallsStat$TypeVoipCallItem.SharingChannel c;

    public pyw0(VoipScheduledCallReportType voipScheduledCallReportType, CallId callId, MobileOfficialAppsCallsStat$TypeVoipCallItem.SharingChannel sharingChannel) {
        this.a = voipScheduledCallReportType;
        this.b = callId;
        this.c = sharingChannel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pyw0)) {
            return false;
        }
        pyw0 pyw0Var = (pyw0) obj;
        return this.a == pyw0Var.a && epx.f(this.b, pyw0Var.b) && this.c == pyw0Var.c;
    }

    public final int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b.b);
        MobileOfficialAppsCallsStat$TypeVoipCallItem.SharingChannel sharingChannel = this.c;
        return a + (sharingChannel == null ? 0 : sharingChannel.hashCode());
    }

    public final String toString() {
        return "VoipScheduledCallStatReport(reportType=" + this.a + ", callId=" + this.b + ", channel=" + this.c + ')';
    }
}
