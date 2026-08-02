package defpackage;

import com.yandex.go.taxi.order.details.v2.analytics.perf.RideCardPerfAnalytics$FailureReason;
import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes14.dex */
public final class mlk0 {
    public final lx4 a;
    public final yxx0 b;
    public final a3y0 c = new a3y0(TaxiOrderLogGroup.RIDE_CARD.getTag(), "PerfAnalytics");

    public mlk0(lx4 lx4Var, yxx0 yxx0Var) {
        this.a = lx4Var;
        this.b = yxx0Var;
    }

    public static String a(RideCardPresentationType rideCardPresentationType, String str) {
        String b = vpa1.b(rideCardPresentationType);
        if (b.length() > 0) {
            b = ((Object) String.valueOf(b.charAt(0)).toUpperCase(Locale.ROOT)) + b.substring(1);
        }
        return b64.l("Perf.RideCard.", b, Extension.DOT_CHAR, str);
    }

    public final void b(long j, String str) {
        this.c.getClass();
        a3y0.h(new String[]{"recordHistogram"});
        hst hstVar = jst.e;
        ffx.O(str).c(j, TimeUnit.MILLISECONDS);
    }

    public final void c(String str, RideCardPresentationType rideCardPresentationType, RideCardPerfAnalytics$FailureReason rideCardPerfAnalytics$FailureReason) {
        String str2;
        String b = vpa1.b(rideCardPresentationType);
        rideCardPerfAnalytics$FailureReason.getClass();
        switch (llk0.a[rideCardPerfAnalytics$FailureReason.ordinal()]) {
            case 1:
                str2 = "detach";
                break;
            case 2:
                str2 = "no_ssp";
                break;
            case 3:
                str2 = "no_creation_timestamp";
                break;
            case 4:
                str2 = "no_creation_time";
                break;
            case 5:
                str2 = "no_attach";
                break;
            case 6:
                str2 = "no_presentation";
                break;
            case 7:
                str2 = "no_state_processing";
                break;
            case 8:
                str2 = "no_prepare_submit_start";
                break;
            case 9:
                str2 = "no_prepare_submit_end";
                break;
            case 10:
                str2 = "no_state_ready";
                break;
            case 11:
                str2 = "no_ready_submit_start";
                break;
            case 12:
                str2 = "no_ready_submit_end";
                break;
            default:
                w511.b();
                return;
        }
        yxx0 yxx0Var = this.b;
        yxx0Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("order_id", str);
        }
        yxx0Var.a.a("TaxiOrder.RideCard.Perf.ReportFailed", hashMap, 1, x4e.q(hashMap, "presentation", b, CRLReasonCodeExtension.REASON, str2));
    }
}
