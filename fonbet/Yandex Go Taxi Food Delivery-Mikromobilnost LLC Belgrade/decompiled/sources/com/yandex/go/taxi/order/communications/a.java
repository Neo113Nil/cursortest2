package com.yandex.go.taxi.order.communications;

import com.yandex.go.taxi.order.communications.analytics.PromoPlaqueAnalytics$Screen;
import defpackage.baq0;
import defpackage.g00;
import defpackage.hbp0;
import defpackage.ipf0;
import defpackage.kpf0;
import defpackage.l9;
import defpackage.o2y0;
import defpackage.pr;
import defpackage.pzt0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.ypf0;
import defpackage.ytz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes14.dex */
public final class a extends j {
    public final ListItemComponent j0;
    public final ru.yandex.taxi.widget.c k0;
    public final pr l0;
    public final o2y0 m0;
    public final tls n0;
    public final ipf0 o0;
    public final PromoPlaqueAnalytics$Screen p0;
    public pzt0 q0;

    public a(ru.yandex.taxi.utils.d dVar, ytz ytzVar, ypf0 ypf0Var, ListItemComponent listItemComponent, ru.yandex.taxi.widget.c cVar, pr prVar, o2y0 o2y0Var, tls tlsVar, ipf0 ipf0Var, PromoPlaqueAnalytics$Screen promoPlaqueAnalytics$Screen) {
        super(dVar, ytzVar, ypf0Var, listItemComponent, o2y0Var, promoPlaqueAnalytics$Screen, ipf0Var, cVar);
        this.j0 = listItemComponent;
        this.k0 = cVar;
        this.l0 = prVar;
        this.m0 = o2y0Var;
        this.n0 = tlsVar;
        this.o0 = ipf0Var;
        this.p0 = promoPlaqueAnalytics$Screen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    @Override // com.yandex.go.taxi.order.communications.j, com.yandex.go.taxi.order.communications.f
    public final void X(kpf0 kpf0Var) {
        Object obj;
        List list;
        super.X(kpf0Var);
        CommunicationItem communicationItem = kpf0Var.a;
        CommunicationItem.a aVar = communicationItem.g;
        g00 g00Var = aVar != null ? aVar.f : null;
        if (g00Var == null || (list = g00Var.c) == null) {
            obj = EmptyList.a;
        } else {
            List list2 = list;
            obj = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                obj.add(((baq0) it.next()).a.name().toLowerCase(Locale.ROOT));
            }
        }
        l9 l9Var = new l9(this, communicationItem, obj, kpf0Var, 2);
        ListItemComponent listItemComponent = this.j0;
        listItemComponent.setDebounceClickListener(l9Var);
        listItemComponent.setTrailMode(2);
        listItemComponent.invalidateComponent();
        pzt0 pzt0Var = this.q0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.q0 = null;
        if (g00Var == null) {
            listItemComponent.setTrailCompanionText((CharSequence) null);
            listItemComponent.invalidateComponent();
        } else {
            listItemComponent.setTrailCompanionText((CharSequence) null);
            this.q0 = tje.N(this.S.c(), null, null, new ActionArrowButtonCommunicationsViewHolder$updateTrailText$1(this, g00Var, null), 3);
        }
    }

    @Override // com.yandex.go.taxi.order.communications.f
    public final void Z() {
        pzt0 pzt0Var = this.q0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.q0 = null;
        super.Z();
    }

    @Override // com.yandex.go.taxi.order.communications.j, com.yandex.go.taxi.order.communications.f
    public final void a0(CommunicationItem communicationItem) {
        hbp0.e(this.S, null, null, new ActionArrowButtonCommunicationsViewHolder$reportPromoPlaqueShown$1(communicationItem, this, null), 3);
    }
}
