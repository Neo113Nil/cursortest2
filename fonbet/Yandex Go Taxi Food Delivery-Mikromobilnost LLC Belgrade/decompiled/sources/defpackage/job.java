package defpackage;

import com.yandex.go.summary.analytics.SummaryAnalytics$ModalCloseReason;
import com.yandex.go.summary.analytics.SummaryAnalytics$ModalType;

/* loaded from: classes13.dex */
public final class job {
    public final iob a;
    public final /* synthetic */ uv6 b;

    public job(uv6 uv6Var, iob iobVar) {
        this.b = uv6Var;
        this.a = iobVar;
    }

    public final void a(SummaryAnalytics$ModalCloseReason summaryAnalytics$ModalCloseReason) {
        uv6 uv6Var = this.b;
        ((sue0) uv6Var.I).h(SummaryAnalytics$ModalType.ChildSeats, this.a.b.c, summaryAnalytics$ModalCloseReason);
        uv6Var.r(new qu(9));
    }
}
