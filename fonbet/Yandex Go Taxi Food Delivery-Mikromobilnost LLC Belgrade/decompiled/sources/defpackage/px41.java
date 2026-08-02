package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$FlowOrigin;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$ScheduleEntryPointSource;

/* loaded from: classes12.dex */
public final class px41 extends pgd {
    public final Context F;
    public final w030 G;
    public final mj31 H;
    public final sx41 I;
    public final nr41 J;
    public final ji41 K;
    public final p1b L;

    public px41(Context context, w030 w030Var, mj31 mj31Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = mj31Var;
        sx41 sx41Var = new sx41(0);
        this.I = sx41Var;
        this.J = new nr41(2, mj31Var);
        this.K = new ji41(7, this);
        this.L = new p1b(sx41Var, new qq31(15, this));
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        Object value;
        ox41 ox41Var = (ox41) obj;
        ix41 ix41Var = ox41Var.a;
        hx41 hx41Var = ox41Var.b;
        String str = hx41Var.a;
        r0 r0Var = this.I.a;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, rx41.a((rx41) value, ix41Var, 0, false, 4)));
        mj31 mj31Var = this.H;
        b611 b611Var = (b611) mj31Var.b;
        TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin = (TransportRouteAnalytics$FlowOrigin) mj31Var.w;
        List list = hx41Var.e;
        String str2 = hx41Var.c;
        String str3 = hx41Var.b;
        HashMap o = smw0.o(b611Var);
        o.put("origin", transportRouteAnalytics$FlowOrigin.getEventValue());
        o.put("selected_date", str);
        o.put("start_stop_id", str3);
        o.put("final_stop_id", str2);
        if (list != null) {
            o.put("selected_filters", list);
        }
        b611Var.a.a("TransportRoute.ScheduleCalendar.Shown", o, 3, new HashMap());
        b611 b611Var2 = (b611) mj31Var.b;
        TransportRouteAnalytics$ScheduleEntryPointSource transportRouteAnalytics$ScheduleEntryPointSource = ((cg40) mj31Var.c).a;
        String str4 = hx41Var.d;
        HashMap o2 = smw0.o(b611Var2);
        if (str4 != null) {
            o2.put("request_id", str4);
        }
        o2.put("source", transportRouteAnalytics$ScheduleEntryPointSource.getEventValue());
        o2.put("origin", transportRouteAnalytics$FlowOrigin.getEventValue());
        o2.put("selected_date", str);
        o2.put("start_stop_id", str3);
        o2.put("final_stop_id", str2);
        if (list != null) {
            o2.put("selected_filters", list);
        }
        b611Var2.a.a("TransportRoute.ScheduleCalendar.FirstLoaded", o2, 2, new HashMap());
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.L;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }

    @Override // defpackage.pgd
    public final boolean T() {
        return true;
    }
}
