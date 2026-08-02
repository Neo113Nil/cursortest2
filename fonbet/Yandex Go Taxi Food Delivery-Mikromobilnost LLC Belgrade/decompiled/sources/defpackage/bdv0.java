package defpackage;

import com.yandex.go.summary.analytics.SummaryAnalytics$AddressPlacement;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryExpandingState;
import com.yandex.go.taxi.tariffs.internal.repository.k;

/* loaded from: classes14.dex */
public final class bdv0 {
    public final xcv0 a;
    public final ucv0 b;
    public final wiq0 c;
    public final viv0 d;

    public bdv0(xcv0 xcv0Var, ucv0 ucv0Var, wiq0 wiq0Var, viv0 viv0Var) {
        this.a = xcv0Var;
        this.b = ucv0Var;
        this.c = wiq0Var;
        this.d = viv0Var;
    }

    public final SummaryAnalytics$AddressPlacement a(SummaryAnalytics$SummaryExpandingState summaryAnalytics$SummaryExpandingState) {
        q81 a = this.b.a();
        if (a instanceof o81) {
            if (summaryAnalytics$SummaryExpandingState == SummaryAnalytics$SummaryExpandingState.Expanded) {
                if (this.d.g(((k) this.c).h())) {
                    return SummaryAnalytics$AddressPlacement.FullDetailCard;
                }
            }
            return SummaryAnalytics$AddressPlacement.AddressHeader;
        }
        if (a.equals(p81.a)) {
            return SummaryAnalytics$AddressPlacement.AddressOnTop;
        }
        if (a.equals(msb1.c)) {
            return SummaryAnalytics$AddressPlacement.Map;
        }
        w511.b();
        return null;
    }
}
