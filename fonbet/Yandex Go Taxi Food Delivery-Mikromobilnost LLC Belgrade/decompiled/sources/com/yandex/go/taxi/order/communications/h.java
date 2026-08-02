package com.yandex.go.taxi.order.communications;

import com.yandex.go.taxi.order.communications.analytics.PromoPlaqueAnalytics$Screen;
import com.yandex.go.taxi.order.communications.view.PromoCounterTrailView;
import defpackage.bze;
import defpackage.d1;
import defpackage.hbp0;
import defpackage.ipf0;
import defpackage.kpf0;
import defpackage.lyc;
import defpackage.o2y0;
import defpackage.tls;
import defpackage.ypf0;
import defpackage.ytz;
import kotlin.LazyThreadSafetyMode;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes14.dex */
public final class h extends j {
    public final ListItemComponent j0;
    public final o2y0 k0;
    public final tls l0;
    public final ipf0 m0;
    public final PromoPlaqueAnalytics$Screen n0;

    public h(ru.yandex.taxi.utils.d dVar, ytz ytzVar, ru.yandex.taxi.widget.c cVar, ypf0 ypf0Var, ListItemComponent listItemComponent, o2y0 o2y0Var, tls tlsVar, ipf0 ipf0Var, PromoPlaqueAnalytics$Screen promoPlaqueAnalytics$Screen) {
        super(dVar, ytzVar, ypf0Var, listItemComponent, o2y0Var, promoPlaqueAnalytics$Screen, ipf0Var, cVar);
        this.j0 = listItemComponent;
        this.k0 = o2y0Var;
        this.l0 = tlsVar;
        this.m0 = ipf0Var;
        this.n0 = promoPlaqueAnalytics$Screen;
    }

    @Override // com.yandex.go.taxi.order.communications.j, com.yandex.go.taxi.order.communications.f
    public final void X(kpf0 kpf0Var) {
        super.X(kpf0Var);
        CommunicationItem.a aVar = kpf0Var.a.g;
        bze bzeVar = aVar != null ? aVar.g : null;
        ListItemComponent listItemComponent = this.j0;
        if (bzeVar == null) {
            listItemComponent.setTrailView(null);
            listItemComponent.setDebounceClickListener(null);
            listItemComponent.invalidateComponent();
            return;
        }
        ((PromoCounterTrailView) kotlin.a.b(LazyThreadSafetyMode.NONE, new lyc(23, this)).getValue()).bind(bzeVar.c, bzeVar.b);
        listItemComponent.setTrailVisibility(0);
        listItemComponent.setTrailCompanionText((CharSequence) null);
        String str = bzeVar.a;
        if (str.length() > 0) {
            listItemComponent.setDebounceClickListener(new d1(25, this, kpf0Var, str));
        } else {
            listItemComponent.setDebounceClickListener(null);
        }
        listItemComponent.invalidateComponent();
    }

    @Override // com.yandex.go.taxi.order.communications.j, com.yandex.go.taxi.order.communications.f
    public final void a0(CommunicationItem communicationItem) {
        hbp0.e(this.S, null, null, new CounterArrowButtonCommunicationsViewHolder$reportPromoPlaqueShown$1(this, communicationItem, null), 3);
    }
}
