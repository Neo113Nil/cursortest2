package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$FlowOrigin;

/* loaded from: classes6.dex */
public final class hi40 extends pgd {
    public final Context F;
    public final w030 G;
    public final ti40 H;
    public final pi40 I;
    public ii40 J;
    public final mu5 K;

    public hi40(Context context, w030 w030Var, ti40 ti40Var, pi40 pi40Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = ti40Var;
        this.I = pi40Var;
        this.K = new mu5(new x240(11, this));
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        ii40 ii40Var = (ii40) obj;
        super.G(ii40Var);
        this.J = ii40Var;
        gg40 b = ii40Var.f.b();
        xf40 xf40Var = ii40Var.e;
        String str = b.a;
        String str2 = b.b;
        String str3 = b.c;
        na11 na11Var = ii40Var.d;
        String str4 = na11Var.a;
        String str5 = na11Var.b;
        b611 b611Var = xf40Var.a;
        TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin = xf40Var.c;
        HashMap o = smw0.o(b611Var);
        o.put("origin", transportRouteAnalytics$FlowOrigin.getEventValue());
        o.put("selected_date", str);
        o.put("start_stop_id", str2);
        o.put("final_stop_id", str3);
        na11 na11Var2 = na11Var;
        if (str5 != null) {
            o.put("preselected_filter_id", str5);
        }
        b611Var.a.a("TransportRoute.ScheduleFilterModal.Shown", o, 2, tse0.r("filter_type_id", o, str4));
        String str6 = b.e;
        b611 b611Var2 = xf40Var.a;
        HashMap o2 = smw0.o(b611Var2);
        if (str6 != null) {
            o2.put("request_id", str6);
        }
        o2.put("origin", transportRouteAnalytics$FlowOrigin.getEventValue());
        o2.put("selected_date", str);
        o2.put("start_stop_id", str2);
        o2.put("final_stop_id", str3);
        if (str5 != null) {
            o2.put("preselected_filter_id", str5);
        }
        b611Var2.a.a("TransportRoute.ScheduleFilterModal.FirstLoaded", o2, 2, tse0.r("filter_type_id", o2, str4));
        CharSequence charSequence = ii40Var.a;
        CharSequence charSequence2 = ii40Var.b;
        ArrayList arrayList = ii40Var.c;
        r0 r0Var = this.H.a;
        while (true) {
            Object value = r0Var.getValue();
            na11 na11Var3 = na11Var2;
            if (r0Var.k(value, new si40(charSequence, arrayList, na11Var3, charSequence2))) {
                return;
            } else {
                na11Var2 = na11Var3;
            }
        }
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.K;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
