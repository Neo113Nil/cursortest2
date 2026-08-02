package com.yandex.go.taxi.order.communications;

import com.yandex.go.taxi.order.communications.analytics.PromoPlaqueAnalytics$Screen;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import defpackage.a3y0;
import defpackage.bdc;
import defpackage.hbp0;
import defpackage.ipf0;
import defpackage.kdc;
import defpackage.kpf0;
import defpackage.l9;
import defpackage.o2y0;
import defpackage.pdc;
import defpackage.tls;
import defpackage.ufu;
import defpackage.uzg;
import defpackage.xng0;
import defpackage.ybf;
import defpackage.ypf0;
import defpackage.ytz;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes14.dex */
public final class i extends j {
    public final ListItemComponent j0;
    public final o2y0 k0;
    public final tls l0;
    public final PromoPlaqueAnalytics$Screen m0;
    public final ipf0 n0;
    public final pdc o0;

    public i(ru.yandex.taxi.utils.d dVar, ytz ytzVar, ru.yandex.taxi.widget.c cVar, ypf0 ypf0Var, ListItemComponent listItemComponent, o2y0 o2y0Var, tls tlsVar, PromoPlaqueAnalytics$Screen promoPlaqueAnalytics$Screen, ipf0 ipf0Var, pdc pdcVar) {
        super(dVar, ytzVar, ypf0Var, listItemComponent, o2y0Var, promoPlaqueAnalytics$Screen, ipf0Var, cVar);
        this.j0 = listItemComponent;
        this.k0 = o2y0Var;
        this.l0 = tlsVar;
        this.m0 = promoPlaqueAnalytics$Screen;
        this.n0 = ipf0Var;
        this.o0 = pdcVar;
    }

    @Override // com.yandex.go.taxi.order.communications.j, com.yandex.go.taxi.order.communications.f
    public final void X(kpf0 kpf0Var) {
        uzg uzgVar;
        uzg uzgVar2;
        super.X(kpf0Var);
        CommunicationItem.a aVar = kpf0Var.a.g;
        String str = (aVar == null || (uzgVar2 = aVar.a) == null) ? null : uzgVar2.c;
        kdc h = ((ufu) this.o0).h(new bdc(xng0.textMain), (aVar == null || (uzgVar = aVar.a) == null) ? null : uzgVar.a);
        ListItemComponent listItemComponent = this.j0;
        if (str == null || str.length() == 0) {
            listItemComponent.setDebounceClickListener(null);
            listItemComponent.setTrailMode(0);
            new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "DeeplinkArrowButtonCommunicationsViewHolder").b("bindInternal", new IllegalStateException("invalid deeplink in totw communication"), new ybf(17, kpf0Var));
        } else {
            listItemComponent.setDebounceClickListener(new l9(this, kpf0Var, str, listItemComponent, 7));
            listItemComponent.getNavigationIconParams().b = h;
            listItemComponent.setTrailMode(2);
        }
        listItemComponent.invalidateComponent();
    }

    @Override // com.yandex.go.taxi.order.communications.j, com.yandex.go.taxi.order.communications.f
    public final void a0(CommunicationItem communicationItem) {
        hbp0.e(this.S, null, null, new DeeplinkArrowButtonCommunicationsViewHolder$reportPromoPlaqueShown$1(this, communicationItem, null), 3);
    }
}
