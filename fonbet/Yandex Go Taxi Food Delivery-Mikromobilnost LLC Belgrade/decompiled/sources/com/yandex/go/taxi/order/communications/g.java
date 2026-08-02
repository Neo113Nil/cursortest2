package com.yandex.go.taxi.order.communications;

import android.view.ViewGroup;
import androidx.recyclerview.widget.x0;
import com.yandex.go.taxi.order.communications.analytics.PromoPlaqueAnalytics$Screen;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.UserActions;
import com.yandex.go.taxi.order.y;
import defpackage.a10;
import defpackage.cqz;
import defpackage.d800;
import defpackage.dvy0;
import defpackage.gw00;
import defpackage.ipf0;
import defpackage.kpf0;
import defpackage.n3h;
import defpackage.nzs;
import defpackage.o2y0;
import defpackage.pdc;
import defpackage.pr;
import defpackage.qqv;
import defpackage.qqz;
import defpackage.rv70;
import defpackage.tls;
import defpackage.tu;
import defpackage.u2y0;
import defpackage.xwy0;
import defpackage.ypf0;
import defpackage.ysg;
import defpackage.ytz;
import java.util.List;
import kotlin.Pair;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;

/* loaded from: classes14.dex */
public final class g extends dvy0 {
    public final pdc A;
    public final n3h B;
    public final d800 C;
    public final rv70 D;
    public final ru.yandex.taxi.communications.data.a E;
    public final pr F;
    public final tu G;
    public final qqz H;
    public final cqz I;
    public final ipf0 J;
    public final ypf0 K;
    public final u2y0 L;
    public final com.yandex.go.lootbox.impl.domain.interactors.activation.a M;
    public final qqv N;
    public final tls O;
    public final androidx.recyclerview.widget.c P = new androidx.recyclerview.widget.c(this, new a10(4));
    public o2y0 Q;
    public PromoPlaqueAnalytics$Screen R;
    public final ru.yandex.taxi.widget.c c;
    public final ru.yandex.taxi.utils.d w;
    public final ytz x;
    public final y y;
    public final ysg z;

    public g(ru.yandex.taxi.widget.c cVar, ru.yandex.taxi.utils.d dVar, ytz ytzVar, y yVar, ysg ysgVar, pdc pdcVar, n3h n3hVar, d800 d800Var, rv70 rv70Var, ru.yandex.taxi.communications.data.a aVar, pr prVar, tu tuVar, qqz qqzVar, cqz cqzVar, ipf0 ipf0Var, ypf0 ypf0Var, u2y0 u2y0Var, com.yandex.go.lootbox.impl.domain.interactors.activation.a aVar2, qqv qqvVar, tls tlsVar) {
        this.c = cVar;
        this.w = dVar;
        this.x = ytzVar;
        this.y = yVar;
        this.z = ysgVar;
        this.A = pdcVar;
        this.B = n3hVar;
        this.C = d800Var;
        this.D = rv70Var;
        this.E = aVar;
        this.F = prVar;
        this.G = tuVar;
        this.H = qqzVar;
        this.I = cqzVar;
        this.J = ipf0Var;
        this.K = ypf0Var;
        this.L = u2y0Var;
        this.M = aVar2;
        this.N = qqvVar;
        this.O = tlsVar;
    }

    public static final void j(g gVar, String str, Object obj) {
        o2y0 o2y0Var = gVar.Q;
        TaxiOrder b = o2y0Var != null ? o2y0Var.b() : null;
        if (b == null || obj == null) {
            return;
        }
        b.e = new UserActions(gw00.e(new Pair(str, new UserActions.Action(obj))));
        gVar.z.g(b);
        gVar.y.j(0L, b.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.P.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        CommunicationItem.a aVar = ((kpf0) this.P.f.get(i)).a.g;
        if (aVar == null) {
            return 0;
        }
        if (aVar.c != null) {
            return 1;
        }
        if (!aVar.e.isEmpty()) {
            return 2;
        }
        if (aVar.f != null) {
            return 3;
        }
        if (aVar.a != null) {
            return 4;
        }
        if (aVar.g != null) {
            return 6;
        }
        return aVar.h != null ? 5 : 0;
    }

    @Override // defpackage.dvy0
    /* renamed from: i */
    public final void onViewRecycled(xwy0 xwy0Var) {
        f fVar = (f) xwy0Var;
        super.onViewRecycled(fVar);
        fVar.Z();
    }

    @Override // defpackage.dvy0, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(f fVar, int i) {
        String str;
        super.onBindViewHolder(fVar, i);
        kpf0 kpf0Var = (kpf0) this.P.f.get(i);
        fVar.X(kpf0Var);
        String str2 = kpf0Var.a.a;
        o2y0 o2y0Var = this.Q;
        if (o2y0Var == null || (str = o2y0Var.b().a) == null) {
            return;
        }
        this.N.a(str, str2);
    }

    public final void l(List list, o2y0 o2y0Var, PromoPlaqueAnalytics$Screen promoPlaqueAnalytics$Screen) {
        this.R = promoPlaqueAnalytics$Screen;
        this.Q = o2y0Var;
        this.F.g = o2y0Var;
        this.P.b(list, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 1:
                ListItemSwitchComponent listItemSwitchComponent = new ListItemSwitchComponent(viewGroup.getContext(), null, 0, 6, null);
                listItemSwitchComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return new k(this.w, this.x, this.K, listItemSwitchComponent, this.J, this.c, this.Q, this.R, new CommunicationsAdapter$onCreateViewHolder$2(2, this, g.class, "updateUserAction", "updateUserAction(Ljava/lang/String;Ljava/lang/Object;)V", 0), this.O);
            case 2:
                ListItemComponent listItemComponent = new ListItemComponent(viewGroup.getContext(), null, 0, 6, null);
                nzs.s(listItemComponent, -1, -2);
                return new e(this.w, this.x, this.K, listItemComponent, this.c, this.A, this.E, this.H, this.B, new CommunicationsAdapter$onCreateViewHolder$4(2, this, g.class, "updateUserAction", "updateUserAction(Ljava/lang/String;Ljava/lang/Object;)V", 0), this.C, this.D, new CommunicationsAdapter$onCreateViewHolder$5(1, this, g.class, "updateOrderContact", "updateOrderContact(Lcom/yandex/go/taxi/order/models/api/request/OrderStatusParam$OrderContact;)V", 0), new CommunicationsAdapter$onCreateViewHolder$6(2, this.G, tu.class, "showInfoDialog", "showInfoDialog(Landroid/content/Context;Lru/yandex/taxi/communications/model/widgets/ActionButton$ModalViewAction;)V", 0), this.J, this.L, this.M, this.I, this.Q, this.O, this.R);
            case 3:
                ListItemComponent listItemComponent2 = new ListItemComponent(viewGroup.getContext(), null, 0, 6, null);
                nzs.s(listItemComponent2, -1, -2);
                return new a(this.w, this.x, this.K, listItemComponent2, this.c, this.F, this.Q, this.O, this.J, this.R);
            case 4:
                ListItemComponent listItemComponent3 = new ListItemComponent(viewGroup.getContext(), null, 0, 6, null);
                nzs.s(listItemComponent3, -1, -2);
                return new i(this.w, this.x, this.c, this.K, listItemComponent3, this.Q, this.O, this.R, this.J, this.A);
            case 5:
                ListItemComponent listItemComponent4 = new ListItemComponent(viewGroup.getContext(), null, 0, 6, null);
                nzs.s(listItemComponent4, -1, -2);
                return new l(this.w, this.x, this.K, listItemComponent4, this.Q, this.R, this.J, this.c);
            case 6:
                ListItemComponent listItemComponent5 = new ListItemComponent(viewGroup.getContext(), null, 0, 6, null);
                nzs.s(listItemComponent5, -1, -2);
                return new h(this.w, this.x, this.c, this.K, listItemComponent5, this.Q, this.O, this.J, this.R);
            default:
                ListItemComponent listItemComponent6 = new ListItemComponent(viewGroup.getContext(), null, 0, 6, null);
                nzs.s(listItemComponent6, -1, -2);
                return new j(this.w, this.x, this.K, listItemComponent6, this.Q, this.R, this.J, this.c);
        }
    }

    @Override // defpackage.dvy0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(x0 x0Var) {
        f fVar = (f) x0Var;
        super.onViewRecycled(fVar);
        fVar.Z();
    }
}
