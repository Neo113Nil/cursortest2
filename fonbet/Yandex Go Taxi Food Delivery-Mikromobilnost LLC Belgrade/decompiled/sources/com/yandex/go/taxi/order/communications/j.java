package com.yandex.go.taxi.order.communications;

import com.yandex.go.taxi.order.communications.analytics.PromoPlaqueAnalytics$Screen;
import defpackage.hbp0;
import defpackage.ipf0;
import defpackage.kpf0;
import defpackage.o2y0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.ypf0;
import defpackage.ytz;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes14.dex */
public class j extends f {
    public static final /* synthetic */ int i0 = 0;
    public final ListItemComponent c0;
    public final o2y0 d0;
    public final PromoPlaqueAnalytics$Screen e0;
    public final ipf0 f0;
    public final ru.yandex.taxi.widget.c g0;
    public pzt0 h0;

    public j(ru.yandex.taxi.utils.d dVar, ytz ytzVar, ypf0 ypf0Var, ListItemComponent listItemComponent, o2y0 o2y0Var, PromoPlaqueAnalytics$Screen promoPlaqueAnalytics$Screen, ipf0 ipf0Var, ru.yandex.taxi.widget.c cVar) {
        super(listItemComponent, dVar, ytzVar, ypf0Var);
        this.c0 = listItemComponent;
        this.d0 = o2y0Var;
        this.e0 = promoPlaqueAnalytics$Screen;
        this.f0 = ipf0Var;
        this.g0 = cVar;
    }

    @Override // com.yandex.go.taxi.order.communications.f
    public void X(kpf0 kpf0Var) {
        super.X(kpf0Var);
        pzt0 pzt0Var = this.h0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.h0 = tje.N(this.S.c(), null, null, new ListCommunicationsViewHolder$bind$1(this, kpf0Var, null), 3);
    }

    @Override // com.yandex.go.taxi.order.communications.f
    public void a0(CommunicationItem communicationItem) {
        hbp0.e(this.S, null, null, new ListCommunicationsViewHolder$reportPromoPlaqueShown$1(this, communicationItem, null), 3);
    }
}
