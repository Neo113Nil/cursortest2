package com.yandex.go.masstransit.sdk.order.impl.tickets;

import com.yandex.go.masstransit.sdk.order.api.tickets.analytics.MtTicketActivationType;
import defpackage.at20;
import defpackage.pj;
import defpackage.sy60;
import defpackage.tje;
import defpackage.v740;
import defpackage.w740;
import defpackage.xl10;
import java.util.HashMap;
import ru.yandex.taxi.masstransit.tickets.analyticks.MasstransitTicketsAnalytics$TicketActivationType;

/* loaded from: classes12.dex */
public final class b implements sy60 {
    public final /* synthetic */ g a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String w;

    public b(g gVar, CharSequence charSequence, String str, String str2) {
        this.a = gVar;
        this.b = charSequence;
        this.c = str;
        this.w = str2;
    }

    @Override // defpackage.sy60
    public final void a() {
    }

    public final void n1(String str) {
        g gVar = this.a;
        tje.N(gVar.o(), null, null, new MtTicketsModalRouterImpl$InnerNavigator$launchActivationRouter$1$onActivationSuccess$1(gVar, this.w, this.c, str, null), 3);
        gVar.O.a(this.b);
        at20 at20Var = gVar.K;
        xl10 xl10Var = (xl10) at20Var.a;
        String str2 = this.c;
        MtTicketActivationType d = at20Var.d(str2);
        if (d == null) {
            d = MtTicketActivationType.QR;
        }
        v740 v740Var = ((w740) at20Var.b).a;
        String str3 = v740Var.a;
        String str4 = v740Var.c;
        pj pjVar = (pj) xl10Var.a;
        MasstransitTicketsAnalytics$TicketActivationType g = xl10.g(d);
        pjVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("activation_type", g.getEventValue());
        hashMap.put("order_id", str3);
        hashMap.put("ticket_id", str2);
        if (str4 != null) {
            hashMap.put("request_id", str4);
        }
        pjVar.a.a("MasstransitTickets.ActivationTicket.Success", hashMap, 2, new HashMap());
    }
}
