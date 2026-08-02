package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.perf.b;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

/* loaded from: classes6.dex */
public final class m9s0 {
    public final xcv0 a;
    public final b b;
    public final fva0 c;
    public boolean d;

    public m9s0(xcv0 xcv0Var, b bVar, fva0 fva0Var) {
        this.a = xcv0Var;
        this.b = bVar;
        this.c = fva0Var;
    }

    public final void a(List list, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, boolean z) {
        if (this.d) {
            return;
        }
        if (priceUpdate$PriceLoadingState == PriceUpdate$PriceLoadingState.LOADING) {
            fva0.f(this.c, "TariffSelector.Routestats", PerformanceAnalytics$Type.Loading, 0L, 4);
        }
        if (priceUpdate$PriceLoadingState == PriceUpdate$PriceLoadingState.LOADED) {
            List<elx0> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return;
            }
            for (elx0 elx0Var : list2) {
                t0f0 t0f0Var = elx0Var.n;
                String a = t0f0Var != null ? t0f0Var.a() : null;
                if (a != null && a.length() != 0) {
                    List list3 = elx0Var.e;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            t0f0 t0f0Var2 = ((elx0) it.next()).n;
                            String a2 = t0f0Var2 != null ? t0f0Var2.a() : null;
                            if (a2 == null || a2.length() == 0) {
                            }
                        }
                    }
                }
                fva0.b(this.c, "TariffSelector.Routestats", PerformanceAnalytics$Type.Loading, null, 4);
                if (z) {
                    String c = this.b.c();
                    xcv0 xcv0Var = this.a;
                    xcv0Var.a.a("Summary.Price.Shown", nnm.m(xcv0Var, "time_since_app_launch_sec", c), 1, new HashMap());
                }
                this.d = true;
                return;
            }
        }
    }
}
