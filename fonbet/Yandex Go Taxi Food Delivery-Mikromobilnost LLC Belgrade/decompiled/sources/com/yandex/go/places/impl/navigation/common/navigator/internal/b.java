package com.yandex.go.places.impl.navigation.common.navigator.internal;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlaceType;
import com.yandex.go.payments.api.preorder.SuitabilityCheckType;
import com.yandex.go.places.api.navigation.CardRevealing;
import com.yandex.go.places.api.navigation.OrganizationCardSliderPinDisplayStrategy;
import com.yandex.go.places.common.navigation.deeplink.PlacesNavigationMode;
import com.yandex.go.places.impl.navigation.common.stack.PlacesNavigationEntry$Source;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import defpackage.acc0;
import defpackage.b700;
import defpackage.bcc0;
import defpackage.ccc0;
import defpackage.cm80;
import defpackage.d0l0;
import defpackage.djv0;
import defpackage.egz;
import defpackage.fac0;
import defpackage.fnb0;
import defpackage.fse0;
import defpackage.gac0;
import defpackage.gn80;
import defpackage.he80;
import defpackage.hre0;
import defpackage.hxx;
import defpackage.i4b0;
import defpackage.ig80;
import defpackage.je80;
import defpackage.jg80;
import defpackage.jj3;
import defpackage.k9s0;
import defpackage.kc50;
import defpackage.l76;
import defpackage.lg80;
import defpackage.lse0;
import defpackage.m950;
import defpackage.mgv0;
import defpackage.n3h;
import defpackage.o75;
import defpackage.p1j0;
import defpackage.pep0;
import defpackage.pse0;
import defpackage.qu;
import defpackage.qzj0;
import defpackage.sls;
import defpackage.sn80;
import defpackage.svj;
import defpackage.sy60;
import defpackage.tg41;
import defpackage.ti80;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.um3;
import defpackage.vgc0;
import defpackage.vpe0;
import defpackage.w411;
import defpackage.w511;
import defpackage.wl80;
import defpackage.xl80;
import defpackage.xpb1;
import defpackage.xw90;
import defpackage.yce;
import defpackage.yl80;
import defpackage.z0j;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;

/* loaded from: classes13.dex */
public final class b {
    public final tse a;
    public final ccc0 b;
    public final PlacesNavigationMode c;
    public final z0j d;
    public final com.yandex.go.places.complaint.impl.navigation.a e;
    public final n3h f;
    public final vgc0 g;
    public final jj3 h;
    public final acc0 i;
    public final kc50 j;
    public final svj k;
    public final lg80 l;
    public final com.yandex.go.places.impl.navigation.common.base.b m;
    public final o75 n;
    public final gn80 o;

    public b(tse tseVar, ccc0 ccc0Var, PlacesNavigationMode placesNavigationMode, z0j z0jVar, com.yandex.go.places.complaint.impl.navigation.a aVar, n3h n3hVar, vgc0 vgc0Var, jj3 jj3Var, acc0 acc0Var, kc50 kc50Var, svj svjVar, lg80 lg80Var, com.yandex.go.places.impl.navigation.common.base.b bVar, o75 o75Var, gn80 gn80Var) {
        this.a = tseVar;
        this.b = ccc0Var;
        this.c = placesNavigationMode;
        this.d = z0jVar;
        this.e = aVar;
        this.f = n3hVar;
        this.g = vgc0Var;
        this.h = jj3Var;
        this.i = acc0Var;
        this.j = kc50Var;
        this.k = svjVar;
        this.l = lg80Var;
        this.m = bVar;
        this.n = o75Var;
        this.o = gn80Var;
    }

    public static void c(b bVar, svj svjVar, ti80 ti80Var, lg80 lg80Var, String str, String str2, boolean z, boolean z2, String str3, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, OrganizationCardSliderPinDisplayStrategy organizationCardSliderPinDisplayStrategy, tls tlsVar, int i) {
        boolean z8 = (i & 1024) != 0 ? false : z5;
        boolean z9 = (i & 2048) != 0 ? true : z6;
        boolean z10 = (i & 4096) != 0 ? false : z7;
        OrganizationCardSliderPinDisplayStrategy organizationCardSliderPinDisplayStrategy2 = (i & 8192) != 0 ? OrganizationCardSliderPinDisplayStrategy.ALL_PINS : organizationCardSliderPinDisplayStrategy;
        tls fnb0Var = (i & 16384) != 0 ? new fnb0(12) : tlsVar;
        lg80 lg80Var2 = bVar.l;
        je80 je80Var = je80.u;
        he80 he80Var = new he80();
        he80Var.c = z2;
        he80Var.d = z3;
        he80Var.f = true;
        he80Var.g = true;
        he80Var.a = !z4;
        he80Var.m = z8 ? CardRevealing.EXPANDED : CardRevealing.COMPACT;
        he80Var.r = lg80Var2.equals(ig80.b) || lg80Var2.equals(jg80.b);
        he80Var.o = z10;
        he80Var.p = organizationCardSliderPinDisplayStrategy2;
        tls tlsVar2 = fnb0Var;
        boolean z11 = z9;
        xl80 xl80Var = new xl80(svjVar, ti80Var, lg80Var, str, str2, z, null, null, he80Var.a(), str3, null, null, null, 7360);
        bVar.n.a();
        bVar.k(z11);
        bVar.b.d(new bcc0(xl80Var, PlacesNavigationEntry$Source.INTERNAL));
        bVar.m.h(ti80Var, new PlacesInternalNavigatorImpl$openOrganizationCard$1(xl80Var, null), new yce(z11, 23), new b700(24, tlsVar2, ti80Var, bVar));
    }

    public final void a(String str, boolean z) {
        this.m.d(PlacesInternalNavigatorImpl$openCustomTabsRouter$1.b, new tg41(str, z), sy60.Q2, p1j0.a);
    }

    public final void b(zzs zzsVar) {
        this.d.b();
        boolean z = false;
        this.h.c(new um3(Events$Zalogin$LoginContext.PLACES, new qzj0(null, new i4b0(19, new xw90(23, this, zzsVar))), z, false, 28));
    }

    public final void d(yl80 yl80Var, boolean z, sls slsVar) {
        this.o.q(false);
        k(z);
        this.b.b(new bcc0(yl80Var, PlacesNavigationEntry$Source.INTERNAL));
        this.m.c(PlacesInternalNavigatorImpl$openOrganizationsList$1.b, new PlacesInternalNavigatorImpl$openOrganizationsList$2(yl80Var, null), new fac0(this, slsVar, 1), new yce(z, 22));
    }

    public final void f(sn80 sn80Var, boolean z, sls slsVar) {
        this.o.q(true);
        k(z);
        this.b.b(new bcc0(new yl80(sn80Var.f, sn80Var.g, sn80Var.b, sn80Var.e, sn80Var.c, l76.I, sn80Var.d, sn80Var.h), PlacesNavigationEntry$Source.INTERNAL));
        this.m.c(PlacesInternalNavigatorImpl$openOrganizationsListV2$1.b, new PlacesInternalNavigatorImpl$openOrganizationsListV2$2(sn80Var, null), new fac0(this, slsVar, 0), new yce(z, 21));
    }

    public final void g(PlaceType placeType, zzs zzsVar, sls slsVar) {
        this.b.b(new bcc0(new wl80(placeType, zzsVar), PlacesNavigationEntry$Source.INTERNAL));
        this.m.f(placeType, zzsVar, new xw90(22, this, slsVar));
    }

    public final void h(boolean z, boolean z2, final sls slsVar) {
        cm80 cm80Var = new cm80(this.k, this.l, null, null, null, z, z2, 28);
        this.b.b(new bcc0(cm80Var, PlacesNavigationEntry$Source.INTERNAL));
        this.m.d(PlacesInternalNavigatorImpl$openSearchList$1.b, cm80Var, new sy60() { // from class: com.yandex.go.places.impl.navigation.common.navigator.internal.a
            @Override // defpackage.sy60
            public final void a() {
                Object value;
                ArrayList arrayList;
                b bVar = b.this;
                ccc0 ccc0Var = bVar.b;
                PlacesInternalNavigatorImpl$popInternalSearch$1 placesInternalNavigatorImpl$popInternalSearch$1 = new PlacesInternalNavigatorImpl$popInternalSearch$1(1, bVar, b.class, "isInternalSearch", "isInternalSearch(Lcom/yandex/go/places/impl/navigation/common/stack/PlacesNavigationEntry;)Z", 0);
                r0 r0Var = ccc0Var.a;
                do {
                    value = r0Var.getValue();
                    arrayList = new ArrayList();
                    for (Object obj : (List) value) {
                        if (!((Boolean) placesInternalNavigatorImpl$popInternalSearch$1.invoke(obj)).booleanValue()) {
                            arrayList.add(obj);
                        }
                    }
                } while (!r0Var.k(value, arrayList));
                slsVar.invoke();
            }
        }, p1j0.a);
    }

    public final void i(Address address) {
        boolean z;
        this.d.b();
        com.yandex.go.places.impl.navigation.summary.a aVar = (com.yandex.go.places.impl.navigation.summary.a) this.i;
        aVar.a.d(address);
        Preorder preorder = new Preorder(0);
        d0l0 d0l0Var = aVar.e.a.G;
        if (address != null) {
            d0l0Var = d0l0Var.k(Collections.singletonList(address));
        }
        preorder.l(d0l0Var);
        aVar.f.b();
        preorder.i(aVar.f.a());
        preorder.j(aVar.f.c.a.e());
        aVar.g.a();
        Address h = preorder.G.h();
        zzs B = h != null ? h.B() : null;
        Address b = preorder.G.b();
        zzs B2 = b != null ? b.B() : null;
        mgv0 mgv0Var = aVar.h.b;
        mgv0Var.d = true;
        mgv0Var.e = B;
        mgv0Var.f = B2;
        vpe0 vpe0Var = new vpe0(preorder);
        Iterator it = preorder.G.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (((Address) it.next()).getFinalSuggestAction() == null) {
                z = true;
                break;
            }
        }
        k9s0 k9s0Var = k9s0.f;
        k9s0 H = egz.H(null, djv0.a, 2);
        ((pep0) aVar.c).f((m950) aVar.d.get(), new hre0(vpe0Var, !aVar.i.a(new SuitabilityCheckType[0]) ? new fse0(H) : (!z || preorder.G.b.isEmpty()) ? new lse0(H) : new pse0(H), "open_summary_from_places_router", false, xpb1.c), hxx.a);
        int i = gac0.a[this.c.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.m.a.r(new qu(9));
            } else {
                w511.b();
            }
        }
    }

    public final void j(w411 w411Var) {
        tje.N(this.a, null, null, new PlacesInternalNavigatorImpl$openTransportNative$1(this, w411Var, null), 3);
    }

    public final void k(boolean z) {
        Object value;
        List list;
        if (z) {
            return;
        }
        PlacesInternalNavigatorImpl$truncateInternalSearchIfNeeded$1 placesInternalNavigatorImpl$truncateInternalSearchIfNeeded$1 = new PlacesInternalNavigatorImpl$truncateInternalSearchIfNeeded$1(1, this, b.class, "isInternalSearch", "isInternalSearch(Lcom/yandex/go/places/impl/navigation/common/stack/PlacesNavigationEntry;)Z", 0);
        r0 r0Var = this.b.a;
        do {
            value = r0Var.getValue();
            list = (List) value;
            Iterator it = list.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (((Boolean) placesInternalNavigatorImpl$truncateInternalSearchIfNeeded$1.invoke(it.next())).booleanValue()) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                list = kotlin.collections.a.A0(list, i);
            }
        } while (!r0Var.k(value, list));
    }
}
