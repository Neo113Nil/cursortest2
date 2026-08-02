package defpackage;

import ru.yandex.taxi.summary.promotions.analytics.SummaryPromotionsAnalytics$SummaryState;

/* loaded from: classes6.dex */
public final class has0 {
    public final zkv0 a;
    public final SummaryPromotionsAnalytics$SummaryState b;
    public final Boolean c;

    public has0(zkv0 zkv0Var, SummaryPromotionsAnalytics$SummaryState summaryPromotionsAnalytics$SummaryState, Boolean bool) {
        this.a = zkv0Var;
        this.b = summaryPromotionsAnalytics$SummaryState;
        this.c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && has0.class.equals(obj.getClass())) {
            has0 has0Var = (has0) obj;
            zkv0 zkv0Var = has0Var.a;
            zkv0 zkv0Var2 = this.a;
            if (jl40.l(zkv0Var2.a, zkv0Var.a) && jl40.l(zkv0Var2.g, zkv0Var.g) && this.b == has0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        zkv0 zkv0Var = this.a;
        return this.b.hashCode() + unr0.b(zkv0Var.a.hashCode() * 31, 31, zkv0Var.g);
    }
}
