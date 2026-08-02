package xsna;

import com.vk.api.generated.reports.dto.ReportsAddReportSourceLabelDto;
import com.vk.dto.common.Peer;

/* compiled from: ReportSpamDialogCmd.kt */
/* loaded from: classes2.dex */
public final class y5g0 extends le6<s3q0> {
    public final Peer b;
    public final Peer c;
    public final boolean d;
    public final String e;
    public final ReportsAddReportSourceLabelDto f;

    public y5g0(Peer peer, Peer peer2, boolean z, String str, ReportsAddReportSourceLabelDto reportsAddReportSourceLabelDto) {
        this.b = peer;
        this.c = peer2;
        this.d = z;
        this.e = str;
        this.f = reportsAddReportSourceLabelDto;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        Peer peer = this.b;
        bz2.c(new x4g0(peer.zb() ? "chat" : "dialogue", this.c, peer.b, this.d, this.e, this.f), null);
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5g0)) {
            return false;
        }
        y5g0 y5g0Var = (y5g0) obj;
        return epx.f(this.b, y5g0Var.b) && epx.f(this.c, y5g0Var.c) && this.d == y5g0Var.d && epx.f(this.e, y5g0Var.e) && this.f == y5g0Var.f;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(bh10.a(Long.hashCode(this.b.b) * 31, 31, this.c.b), 31, this.d);
        String str = this.e;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        ReportsAddReportSourceLabelDto reportsAddReportSourceLabelDto = this.f;
        return hashCode + (reportsAddReportSourceLabelDto != null ? reportsAddReportSourceLabelDto.hashCode() : 0);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ReportSpamDialogCmd(peer=" + this.b + ", owner=" + this.c + ", awaitNetwork=" + this.d + ", source=" + this.e + ", reportSourceLabel=" + this.f + ')';
    }
}
