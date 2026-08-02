package defpackage;

import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$FlowOrigin;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$ScheduleEntryPointSource;
import ru.yandex.taxi.masstransit.trains.schedule.e;

/* loaded from: classes6.dex */
public final class pf30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ pf30(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    private final void b() {
    }

    private final void e(String str) {
    }

    private final void f() {
    }

    public final void a() {
        int i = this.a;
        int i2 = 9;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((qf30) h55Var).r(new qu(i2));
                break;
            default:
                ((j4a) h55Var).r(new qu(i2));
                break;
        }
    }

    public final void c(final bzy0 bzy0Var) {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                final int i2 = 0;
                ((qf30) h55Var).r(new tls() { // from class: lf30
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        Object value;
                        Object value2;
                        int i3 = i2;
                        zy11 zy11Var = zy11.a;
                        bzy0 bzy0Var2 = bzy0Var;
                        qg30 qg30Var = (qg30) obj;
                        switch (i3) {
                            case 0:
                                r0 r0Var = qg30Var.a.a;
                                do {
                                    value = r0Var.getValue();
                                } while (!r0Var.k(value, new if30(bzy0Var2)));
                            default:
                                r0 r0Var2 = qg30Var.a.a;
                                do {
                                    value2 = r0Var2.getValue();
                                } while (!r0Var2.k(value2, new if30(bzy0Var2)));
                        }
                        return zy11Var;
                    }
                });
                break;
            default:
                final int i3 = 1;
                ((j4a) h55Var).r(new tls() { // from class: lf30
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        Object value;
                        Object value2;
                        int i32 = i3;
                        zy11 zy11Var = zy11.a;
                        bzy0 bzy0Var2 = bzy0Var;
                        qg30 qg30Var = (qg30) obj;
                        switch (i32) {
                            case 0:
                                r0 r0Var = qg30Var.a.a;
                                do {
                                    value = r0Var.getValue();
                                } while (!r0Var.k(value, new if30(bzy0Var2)));
                            default:
                                r0 r0Var2 = qg30Var.a.a;
                                do {
                                    value2 = r0Var2.getValue();
                                } while (!r0Var2.k(value2, new if30(bzy0Var2)));
                        }
                        return zy11Var;
                    }
                });
                break;
        }
    }

    public final void d(fe01 fe01Var) {
        int i = this.a;
        int i2 = 4;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                qf30 qf30Var = (qf30) h55Var;
                qf30Var.A((e) ((cv5) ((ae40) qf30Var.L.get()).a(TransportRouteAnalytics$FlowOrigin.DetailCard).A).get(), new hh40(fe01Var.a, fe01Var.b, TransportRouteAnalytics$ScheduleEntryPointSource.DetailCard, i2), new mf30());
                break;
            default:
                j4a j4aVar = (j4a) h55Var;
                j4aVar.A((e) ((cv5) ((ae40) ((h3y) j4aVar.H).get()).a(TransportRouteAnalytics$FlowOrigin.DetailCard).A).get(), new hh40(fe01Var.a, fe01Var.b, TransportRouteAnalytics$ScheduleEntryPointSource.DetailCard, i2), new mf30());
                break;
        }
    }

    public final void g(String str) {
        int i = this.a;
        v770 v770Var = v770.c;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((a60) ((qf30) h55Var).K).c(str, v770Var);
                break;
            default:
                ((a60) ((y50) ((j4a) h55Var).G)).c(str, v770Var);
                break;
        }
    }
}
