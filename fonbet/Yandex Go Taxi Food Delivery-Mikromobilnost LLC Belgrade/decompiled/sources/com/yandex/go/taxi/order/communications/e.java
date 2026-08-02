package com.yandex.go.taxi.order.communications;

import com.yandex.go.taxi.order.communications.analytics.PromoPlaqueAnalytics$Screen;
import com.yandex.go.taxi.order.models.api.request.OrderStatusParam;
import defpackage.cqz;
import defpackage.d800;
import defpackage.hbp0;
import defpackage.ipf0;
import defpackage.kpf0;
import defpackage.n3h;
import defpackage.o2y0;
import defpackage.pdc;
import defpackage.pzt0;
import defpackage.qqz;
import defpackage.rv70;
import defpackage.tje;
import defpackage.tls;
import defpackage.u2y0;
import defpackage.wls;
import defpackage.ypf0;
import defpackage.ytz;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes14.dex */
public final class e extends f {
    public static final /* synthetic */ int w0 = 0;
    public final ListItemComponent c0;
    public final ru.yandex.taxi.widget.c d0;
    public final pdc e0;
    public final ru.yandex.taxi.communications.data.a f0;
    public final qqz g0;
    public final n3h h0;
    public final wls i0;
    public final d800 j0;
    public final rv70 k0;
    public final tls l0;
    public final wls m0;
    public final ipf0 n0;
    public final u2y0 o0;
    public final com.yandex.go.lootbox.impl.domain.interactors.activation.a p0;
    public final cqz q0;
    public final o2y0 r0;
    public final tls s0;
    public final PromoPlaqueAnalytics$Screen t0;
    public OrderStatusParam.OrderContact u0;
    public pzt0 v0;

    public e(ru.yandex.taxi.utils.d dVar, ytz ytzVar, ypf0 ypf0Var, ListItemComponent listItemComponent, ru.yandex.taxi.widget.c cVar, pdc pdcVar, ru.yandex.taxi.communications.data.a aVar, qqz qqzVar, n3h n3hVar, wls wlsVar, d800 d800Var, rv70 rv70Var, tls tlsVar, wls wlsVar2, ipf0 ipf0Var, u2y0 u2y0Var, com.yandex.go.lootbox.impl.domain.interactors.activation.a aVar2, cqz cqzVar, o2y0 o2y0Var, tls tlsVar2, PromoPlaqueAnalytics$Screen promoPlaqueAnalytics$Screen) {
        super(listItemComponent, dVar, ytzVar, ypf0Var);
        this.c0 = listItemComponent;
        this.d0 = cVar;
        this.e0 = pdcVar;
        this.f0 = aVar;
        this.g0 = qqzVar;
        this.h0 = n3hVar;
        this.i0 = wlsVar;
        this.j0 = d800Var;
        this.k0 = rv70Var;
        this.l0 = tlsVar;
        this.m0 = wlsVar2;
        this.n0 = ipf0Var;
        this.o0 = u2y0Var;
        this.p0 = aVar2;
        this.q0 = cqzVar;
        this.r0 = o2y0Var;
        this.s0 = tlsVar2;
        this.t0 = promoPlaqueAnalytics$Screen;
    }

    @Override // com.yandex.go.taxi.order.communications.f
    public final void X(kpf0 kpf0Var) {
        super.X(kpf0Var);
        pzt0 pzt0Var = this.v0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.v0 = tje.N(this.S.c(), null, null, new ActionButtonsCommunicationsViewHolder$bind$1(this, kpf0Var, null), 3);
    }

    @Override // com.yandex.go.taxi.order.communications.f
    public final void a0(CommunicationItem communicationItem) {
        hbp0.e(this.S, null, null, new ActionButtonsCommunicationsViewHolder$reportPromoPlaqueShown$1(communicationItem, this, null), 3);
    }
}
