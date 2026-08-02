package com.yandex.go.places.organization.card.impl.ui.card.flex.v2;

import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.x0;
import com.yandex.go.places.models.data.entities.network.bottom_panel.OrganizationCardAnalyticsParams;
import defpackage.bm50;
import defpackage.c9c0;
import defpackage.dvy0;
import defpackage.goa0;
import defpackage.jl40;
import defpackage.ne80;
import defpackage.qi80;
import defpackage.rg80;
import defpackage.ri80;
import defpackage.si80;
import defpackage.ti80;
import defpackage.tje;
import defpackage.ub60;
import defpackage.vqw;
import defpackage.w511;
import defpackage.xg80;
import defpackage.xwy0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes13.dex */
public final class a extends dvy0 {
    public ti80 A;
    public boolean B;
    public final g c;
    public final bm50 w;
    public final ub60 x;
    public final ArrayList y = new ArrayList();
    public final LinkedHashMap z = new LinkedHashMap();

    public a(g gVar, bm50 bm50Var, ub60 ub60Var, Lifecycle lifecycle) {
        this.c = gVar;
        this.w = bm50Var;
        this.x = ub60Var;
        lifecycle.a(new vqw(1, this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.Z.size();
    }

    @Override // defpackage.dvy0
    /* renamed from: i */
    public final void onViewRecycled(xwy0 xwy0Var) {
        xg80 xg80Var = (xg80) xwy0Var;
        super.onViewRecycled(xg80Var);
        ti80 ti80Var = xg80Var.P.h;
        if (ti80Var == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.z;
        if (linkedHashMap.get(ti80Var) == xg80Var) {
            linkedHashMap.remove(ti80Var);
        }
    }

    public final OrganizationCardPageView j(rg80 rg80Var) {
        Object obj;
        Iterator it = this.z.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((xg80) obj).P, rg80Var)) {
                break;
            }
        }
        xg80 xg80Var = (xg80) obj;
        if (xg80Var != null) {
            return xg80Var.O;
        }
        return null;
    }

    @Override // defpackage.dvy0, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(xg80 xg80Var, int i) {
        super.onBindViewHolder(xg80Var, i);
        if (this.B) {
            return;
        }
        ne80 ne80Var = (ne80) this.c.Z.get(i);
        ti80 ti80Var = xg80Var.P.h;
        LinkedHashMap linkedHashMap = this.z;
        if (ti80Var != null && linkedHashMap.get(ti80Var) == xg80Var) {
            linkedHashMap.remove(ti80Var);
        }
        rg80 rg80Var = xg80Var.P;
        boolean z = this.A != null ? !r3.equals(ne80Var.a) : i != 0;
        goa0 goa0Var = rg80Var.c;
        c9c0 c9c0Var = rg80Var.a;
        if (c9c0Var != null) {
            goa0Var.c = ne80Var;
            if (!jl40.l(rg80Var.h, ne80Var.a)) {
                rg80Var.g = null;
            }
            rg80Var.h = ne80Var.a;
            if (rg80Var.f) {
                c9c0Var.V(rg80Var.d, goa0Var);
            } else {
                rg80Var.e.invoke(c9c0Var);
                c9c0Var.a0(true);
                if (z) {
                    c9c0Var.W();
                }
                rg80Var.f = true;
            }
        }
        linkedHashMap.put(ne80Var.a, xg80Var);
        this.x.invoke(xg80Var.O);
    }

    public final void l(int i) {
        boolean z;
        rg80 rg80Var;
        rg80 rg80Var2;
        c9c0 c9c0Var;
        xg80 xg80Var;
        rg80 rg80Var3;
        c9c0 c9c0Var2;
        g gVar = this.c;
        ti80 ti80Var = ((ne80) gVar.Z.get(i)).a;
        LinkedHashMap linkedHashMap = this.z;
        xg80 xg80Var2 = (xg80) linkedHashMap.get(ti80Var);
        if (!jl40.l(ti80Var, this.A)) {
            ti80 ti80Var2 = this.A;
            if (ti80Var2 != null && (xg80Var = (xg80) linkedHashMap.get(ti80Var2)) != null && (rg80Var3 = xg80Var.P) != null && (c9c0Var2 = rg80Var3.a) != null) {
                c9c0Var2.W();
            }
            if (xg80Var2 != null && (rg80Var2 = xg80Var2.P) != null && (c9c0Var = rg80Var2.a) != null) {
                c9c0Var.Y();
            }
            this.A = ti80Var;
        }
        com.yandex.go.places.models.data.entities.network.map.e eVar = (xg80Var2 == null || (rg80Var = xg80Var2.P) == null) ? null : rg80Var.g;
        ne80 ne80Var = (ne80) gVar.Z.get(i);
        ti80 ti80Var3 = gVar.a0.a;
        ti80 ti80Var4 = ne80Var.a;
        boolean l = jl40.l(ti80Var3, ti80Var4);
        gVar.a0 = ne80Var;
        gVar.V.invoke(ne80Var);
        if (!l) {
            gVar.h0 = null;
            OrganizationCardAnalyticsParams organizationCardAnalyticsParams = (OrganizationCardAnalyticsParams) gVar.g0.get(ti80Var4);
            if (organizationCardAnalyticsParams == null) {
                organizationCardAnalyticsParams = new OrganizationCardAnalyticsParams(0);
            }
            gVar.f0 = organizationCardAnalyticsParams;
        }
        if (eVar != null) {
            if (ti80Var4 instanceof qi80) {
                z = jl40.l(eVar.getA(), ((qi80) ti80Var4).a);
            } else if (ti80Var4 instanceof si80) {
                z = jl40.l(eVar.getA(), ((si80) ti80Var4).b);
            } else {
                if (!(ti80Var4 instanceof ri80)) {
                    w511.b();
                    return;
                }
                z = true;
            }
            if (!z) {
                eVar = null;
            }
            if (eVar != null) {
                tje.N(gVar.Jg(), null, null, new OrganizationCardsSliderPresenter$updateOrganizationCardMapObjectDto$1(gVar, eVar, ti80Var4, null), 3);
            }
        } else if (!l) {
            tje.N(gVar.Jg(), null, null, new OrganizationCardsSliderPresenter$onPageSelected$3(gVar, null), 3);
        }
        gVar.Lg();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        OrganizationCardPageView organizationCardPageView = new OrganizationCardPageView(viewGroup.getContext());
        organizationCardPageView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        rg80 rg80Var = (rg80) this.w.invoke();
        this.y.add(rg80Var);
        return new xg80(organizationCardPageView, rg80Var);
    }

    @Override // defpackage.dvy0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(x0 x0Var) {
        xg80 xg80Var = (xg80) x0Var;
        super.onViewRecycled(xg80Var);
        ti80 ti80Var = xg80Var.P.h;
        if (ti80Var == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.z;
        if (linkedHashMap.get(ti80Var) == xg80Var) {
            linkedHashMap.remove(ti80Var);
        }
    }
}
