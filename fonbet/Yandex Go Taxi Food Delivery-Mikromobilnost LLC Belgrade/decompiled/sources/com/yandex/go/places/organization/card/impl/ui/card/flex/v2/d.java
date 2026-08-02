package com.yandex.go.places.organization.card.impl.ui.card.flex.v2;

import com.yandex.go.places.models.data.entities.network.bottom_panel.OrganizationCardAnalyticsParams;
import defpackage.jl40;
import defpackage.ne80;
import defpackage.nh80;
import defpackage.pzt0;
import defpackage.sdc;
import defpackage.ti80;
import defpackage.tje;
import defpackage.uc4;
import defpackage.vpr;
import defpackage.zl50;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class d implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ d(g gVar, int i) {
        this.a = i;
        this.b = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        boolean z;
        ti80 ti80Var;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        g gVar = this.b;
        switch (i) {
            case 0:
                uc4 uc4Var = (uc4) obj;
                gVar.i0 = uc4Var;
                pzt0 pzt0Var = gVar.c0;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                gVar.c0 = tje.N(gVar.Jg(), null, null, new OrganizationCardsSliderPresenter$loadNewOrganizations$1(gVar, uc4Var, null), 3);
                break;
            default:
                ne80 ne80Var = (ne80) obj;
                boolean z2 = gVar.E;
                if (!z2) {
                    gVar.H.y.clear();
                }
                ne80 ne80Var2 = (ne80) kotlin.collections.a.R(gVar.Z);
                String Og = (ne80Var2 == null || (ti80Var = ne80Var2.a) == null) ? null : g.Og(ti80Var);
                ti80 ti80Var2 = ne80Var.a;
                if (!jl40.l(Og, g.Og(ti80Var2))) {
                    String Og2 = g.Og(ti80Var2);
                    List list = gVar.Z;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (g.Og(((ne80) it.next()).a).equals(Og2)) {
                                z = true;
                                if (z2 || z) {
                                    ArrayList arrayList = new ArrayList(gVar.Z);
                                    if (z2) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.removeIf(new sdc(20, new zl50(21, gVar, Og2)));
                                    }
                                    arrayList.add(0, ne80Var);
                                    gVar.Z = arrayList;
                                } else {
                                    gVar.Z = Collections.singletonList(ne80Var);
                                    gVar.W = g.Mg(ti80Var2);
                                    gVar.d0 = false;
                                    uc4 uc4Var2 = gVar.i0;
                                    if (uc4Var2 != null) {
                                        pzt0 pzt0Var2 = gVar.c0;
                                        if (pzt0Var2 != null) {
                                            pzt0Var2.a(null);
                                        }
                                        gVar.c0 = tje.N(gVar.Jg(), null, null, new OrganizationCardsSliderPresenter$loadNewOrganizations$1(gVar, uc4Var2, null), 3);
                                    }
                                }
                                if (!jl40.l(gVar.a0.a, ti80Var2)) {
                                    gVar.h0 = null;
                                    OrganizationCardAnalyticsParams organizationCardAnalyticsParams = (OrganizationCardAnalyticsParams) gVar.g0.get(ti80Var2);
                                    if (organizationCardAnalyticsParams == null) {
                                        organizationCardAnalyticsParams = new OrganizationCardAnalyticsParams(0);
                                    }
                                    gVar.f0 = organizationCardAnalyticsParams;
                                }
                                gVar.a0 = ne80Var;
                                gVar.V.invoke(ne80Var);
                                gVar.b0 = false;
                                ((nh80) gVar.Dg()).va();
                                gVar.Lg();
                                break;
                            }
                        }
                    }
                    z = false;
                    if (z2) {
                    }
                    ArrayList arrayList2 = new ArrayList(gVar.Z);
                    if (z2) {
                    }
                    arrayList2.add(0, ne80Var);
                    gVar.Z = arrayList2;
                    if (!jl40.l(gVar.a0.a, ti80Var2)) {
                    }
                    gVar.a0 = ne80Var;
                    gVar.V.invoke(ne80Var);
                    gVar.b0 = false;
                    ((nh80) gVar.Dg()).va();
                    gVar.Lg();
                } else if (!jl40.l(gVar.a0.a, ti80Var2)) {
                    ((nh80) gVar.Dg()).yb();
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
