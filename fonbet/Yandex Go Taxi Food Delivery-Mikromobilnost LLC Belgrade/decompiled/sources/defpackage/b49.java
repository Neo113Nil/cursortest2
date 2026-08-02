package defpackage;

import com.yandex.go.plus.experiment.CashbackExperiment;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.cashback.l;
import ru.yandex.taxi.plus.design.gradient.CashbackGradientDrawable;
import ru.yandex.taxi.tariffs.model.TariffSource;

/* loaded from: classes6.dex */
public final class b49 implements xi70 {
    public final wk21 a;
    public final drd b;
    public bj70 c;

    public b49(wk21 wk21Var, drd drdVar) {
        this.a = wk21Var;
        this.b = drdVar;
    }

    @Override // defpackage.xi70
    public final Object a(vi70 vi70Var, Continuation continuation) {
        pex0 pex0Var = vi70Var.a.a;
        if (this.b.b.b()) {
            l lVar = (l) this.a;
            if (lVar.a().b) {
                List list = pex0Var.S;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((ServiceLevel.Branding) it.next()).c == ServiceLevel.Branding.Type.COMPLEMENT_PAYMENT_FULL_COST_COVERAGE) {
                            CashbackExperiment a = lVar.a();
                            a.getClass();
                            String Y = d6z.Y(a, "cashback_full_cost_coverage_order_button_title");
                            if (!evu0.J(Y)) {
                                bj70 bj70Var = this.c;
                                if (bj70Var == null) {
                                    bj70Var = new bj70(new ni70(new CashbackGradientDrawable()), new gdc(mqg0.component_white), new up2(zp2.a));
                                    this.c = bj70Var;
                                }
                                return hay.g(Y, null, bj70Var, pex0Var.a == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS, 10);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.xi70
    public final String b() {
        return "CashbackOrderButtonStateInteractor";
    }
}
