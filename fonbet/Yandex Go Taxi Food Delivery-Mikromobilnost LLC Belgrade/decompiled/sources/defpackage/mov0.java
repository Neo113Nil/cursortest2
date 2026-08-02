package defpackage;

import com.yandex.go.preorder.mode.SourcePointMode;
import com.yandex.go.summary.analytics.SummaryAnalytics$ComplementaryPaymentMethod;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryZoomType;
import java.util.HashMap;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.perf.b;
import ru.yandex.taxi.preorder.source.mode.interactor.e;

/* loaded from: classes14.dex */
public final class mov0 {
    public final xcv0 a;
    public final b b;
    public final dqe0 c;
    public final e d;

    public mov0(xcv0 xcv0Var, b bVar, dqe0 dqe0Var, e eVar) {
        this.a = xcv0Var;
        this.b = bVar;
        this.c = dqe0Var;
        this.d = eVar;
    }

    public final void a(bov0 bov0Var) {
        String code;
        PaymentMethod$Type a = this.c.a.h().a();
        if (a == null || (code = a.getCode()) == null) {
            return;
        }
        lv90 e = this.c.a.e();
        SummaryAnalytics$ComplementaryPaymentMethod summaryAnalytics$ComplementaryPaymentMethod = null;
        PaymentMethod$Type a2 = e != null ? e.a().a() : null;
        int i = a2 == null ? -1 : lov0.a[a2.ordinal()];
        if (i == 1) {
            summaryAnalytics$ComplementaryPaymentMethod = SummaryAnalytics$ComplementaryPaymentMethod.PersonalWallet;
        } else if (i == 2) {
            summaryAnalytics$ComplementaryPaymentMethod = SummaryAnalytics$ComplementaryPaymentMethod.BirbonusWallet;
        }
        SourcePointMode a3 = this.d.a.a();
        boolean z = this.c.a() != null;
        int i2 = adv0.a[a3.ordinal()];
        SummaryAnalytics$SummaryZoomType summaryAnalytics$SummaryZoomType = (i2 == 1 || i2 == 2) ? SummaryAnalytics$SummaryZoomType.StartingPoint : i2 != 3 ? i2 != 4 ? SummaryAnalytics$SummaryZoomType.Route : z ? SummaryAnalytics$SummaryZoomType.Route : SummaryAnalytics$SummaryZoomType.StartingPoint : SummaryAnalytics$SummaryZoomType.DestinationPoint;
        xcv0 xcv0Var = this.a;
        boolean z2 = bov0Var.d;
        String c = this.b.c();
        HashMap q = tse0.q(xcv0Var);
        q.put("is_opened_by_deeplink", Boolean.valueOf(z2));
        q.put("selected_payment_method", code);
        if (summaryAnalytics$ComplementaryPaymentMethod != null) {
            q.put("complementary_payment_method", summaryAnalytics$ComplementaryPaymentMethod.getEventValue());
        }
        q.put("time_since_app_launch_sec", c);
        q.put("zoom_type", summaryAnalytics$SummaryZoomType.getEventValue());
        xcv0Var.a.a("Summary.Screen.Shown", q, 2, new HashMap());
    }
}
