package com.yandex.go.masstransit.sdk.order.impl.tickets;

import android.content.Context;
import defpackage.a840;
import defpackage.at20;
import defpackage.d240;
import defpackage.djb;
import defpackage.e100;
import defpackage.m840;
import defpackage.p1b;
import defpackage.pgd;
import defpackage.pj;
import defpackage.tje;
import defpackage.uk10;
import defpackage.w030;
import defpackage.wfd;
import defpackage.xl10;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class g extends pgd {
    public final Context F;
    public final w030 G;
    public final i H;
    public final l I;
    public final e100 J;
    public final at20 K;
    public final ru.yandex.taxi.masstransit.tickets.c L;
    public final djb M;
    public final d240 N;
    public final ru.yandex.taxi.masstransit.tickets.a O;
    public final uk10 P;
    public String Q;
    public final p1b R;

    public g(Context context, w030 w030Var, i iVar, l lVar, e100 e100Var, at20 at20Var, ru.yandex.taxi.masstransit.tickets.c cVar, djb djbVar, d240 d240Var, ru.yandex.taxi.masstransit.tickets.a aVar) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = iVar;
        this.I = lVar;
        this.J = e100Var;
        this.K = at20Var;
        this.L = cVar;
        this.M = djbVar;
        this.N = d240Var;
        this.O = aVar;
        this.P = new uk10(this);
        this.R = new p1b(lVar, new a840(this, 0));
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        m840 m840Var = (m840) obj;
        super.G(m840Var);
        tje.N(o(), null, null, new MtTicketsModalRouterImpl$onAttach$1(this, m840Var, null), 3);
        String str = m840Var.a;
        at20 at20Var = this.K;
        pj pjVar = (pj) ((xl10) at20Var.a).a;
        pjVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", str);
        pjVar.a.a("MasstransitTickets.Order.Shown", hashMap, 2, new HashMap());
        pj pjVar2 = (pj) ((xl10) at20Var.a).a;
        pjVar2.getClass();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("order_id", str);
        pjVar2.a.a("MasstransitTickets.Ticket.Shown", hashMap2, 2, new HashMap());
        tje.N(o(), null, null, new MtTicketsModalRouterImpl$observeStateForAnalytics$1(this, null), 3);
        tje.N(o(), null, null, new MtTicketsModalRouterImpl$observeStateForAnalytics$2(this, null), 3);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.R;
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
