package defpackage;

import com.yandex.go.analytics.realtime.a;
import com.yandex.go.analytics.realtime.event.CreativeType;
import java.util.Map;
import java.util.Objects;
import ru.yandex.taxi.summary.promotions.analytics.SummaryPromotionsAnalytics$SummaryState;
import ru.yandex.taxi.summary.solid.interactor.p;

/* loaded from: classes6.dex */
public final /* synthetic */ class bsf0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ zkv0 c;

    public /* synthetic */ bsf0(p pVar, zkv0 zkv0Var, int i) {
        this.a = i;
        this.b = pVar;
        this.c = zkv0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                p pVar = this.b;
                zkv0 zkv0Var = this.c;
                mnv0 mnv0Var = pVar.c;
                mnv0Var.f.c(zkv0Var, SummaryPromotionsAnalytics$SummaryState.COLLAPSED);
                return zy11.a;
            case 1:
                p pVar2 = this.b;
                zkv0 zkv0Var2 = this.c;
                smv0 smv0Var = pVar2.c.f.a;
                smv0Var.getClass();
                Map map = zkv0Var2.k;
                if (map != null && !map.isEmpty()) {
                    synchronized (smv0Var.d) {
                        if (!smv0Var.f.contains(zkv0Var2.a)) {
                            smv0Var.f.add(zkv0Var2.a);
                            hst hstVar = jst.e;
                            Objects.toString(Thread.currentThread());
                            hstVar.getClass();
                            ((a) smv0Var.c).d(new iei0(CreativeType.PromoOnSummary, zkv0Var2.a, zkv0Var2.k, zkv0Var2.l, 2));
                        }
                    }
                }
                return zy11.a;
            case 2:
                p pVar3 = this.b;
                pVar3.c.c(this.c, SummaryPromotionsAnalytics$SummaryState.COLLAPSED);
                return zy11.a;
            case 3:
                p pVar4 = this.b;
                zkv0 zkv0Var3 = this.c;
                mnv0 mnv0Var2 = pVar4.c;
                mnv0Var2.f.c(zkv0Var3, SummaryPromotionsAnalytics$SummaryState.COLLAPSED);
                return zy11.a;
            default:
                p pVar5 = this.b;
                pVar5.c.c(this.c, SummaryPromotionsAnalytics$SummaryState.COLLAPSED);
                return zy11.a;
        }
    }
}
