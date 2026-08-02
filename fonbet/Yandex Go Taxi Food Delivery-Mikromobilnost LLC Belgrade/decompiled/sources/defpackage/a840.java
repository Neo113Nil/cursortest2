package defpackage;

import androidx.compose.runtime.internal.a;
import com.yandex.go.masstransit.sdk.order.api.tickets.analytics.MtTicketActivationType;
import com.yandex.go.masstransit.sdk.order.api.tickets.analytics.MtTicketOrderAction;
import com.yandex.go.masstransit.sdk.order.impl.tickets.g;
import defpackage.i940;
import defpackage.tje;
import defpackage.zy11;
import java.util.HashMap;
import ru.yandex.taxi.masstransit.tickets.analyticks.MasstransitTicketsAnalytics$TicketActivationType;

/* loaded from: classes12.dex */
public final /* synthetic */ class a840 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ a840(g gVar, int i) {
        this.a = i;
        this.b = gVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        final g gVar = this.b;
        switch (i) {
            case 0:
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).e = new tls() { // from class: com.yandex.go.masstransit.sdk.order.impl.tickets.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        g gVar2 = g.this;
                        tje.N(gVar2.o(), null, null, new MtTicketsModalRouterImpl$content$1$1$1(gVar2, (i940) obj2, null), 3);
                        return zy11.a;
                    }
                };
                ((agd) yfdVar).g = new a(-1698719770, new alb0(16, gVar), true);
                break;
            default:
                String str = (String) obj;
                String str2 = gVar.Q;
                at20 at20Var = gVar.K;
                if (!jl40.l(str2, str) && gVar.Q != null) {
                    at20Var.j(MtTicketOrderAction.TicketPaging, null);
                }
                gVar.Q = str;
                if (str != null) {
                    xl10 xl10Var = (xl10) at20Var.a;
                    v740 v740Var = ((w740) at20Var.b).a;
                    String str3 = v740Var.a;
                    String str4 = v740Var.c;
                    MtTicketActivationType d = at20Var.d(str);
                    pj pjVar = (pj) xl10Var.a;
                    MasstransitTicketsAnalytics$TicketActivationType g = d != null ? xl10.g(d) : null;
                    pjVar.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("order_id", str3);
                    hashMap.put("ticket_id", str);
                    if (str4 != null) {
                        hashMap.put("request_id", str4);
                    }
                    if (g != null) {
                        hashMap.put("activation_type", g.getEventValue());
                    }
                    pjVar.a.a("MasstransitTickets.Ticket.Loaded", hashMap, 1, new HashMap());
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
