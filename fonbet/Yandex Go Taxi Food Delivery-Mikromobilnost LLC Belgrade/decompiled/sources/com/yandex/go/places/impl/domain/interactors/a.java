package com.yandex.go.places.impl.domain.interactors;

import android.content.Context;
import com.yandex.go.logistics.cargo_flow.api.DeliveryCargoFlowPlacesNavigator$PointType;
import com.yandex.go.places.common.navigation.deeplink.PlacesNavigationMode;
import com.yandex.go.places.impl.domain.interactors.a;
import com.yandex.go.places.webview.api.navigation.PlacesWebAuthType;
import defpackage.agi;
import defpackage.aq;
import defpackage.br;
import defpackage.c5c0;
import defpackage.coe;
import defpackage.cq;
import defpackage.dq;
import defpackage.dsj;
import defpackage.eac0;
import defpackage.eq;
import defpackage.fq;
import defpackage.fr;
import defpackage.fvj;
import defpackage.g3h;
import defpackage.gq;
import defpackage.gyh;
import defpackage.hjt;
import defpackage.hq;
import defpackage.hvj;
import defpackage.hxx;
import defpackage.hyh;
import defpackage.i3y;
import defpackage.iq;
import defpackage.iuj;
import defpackage.iyh;
import defpackage.jp;
import defpackage.jyh;
import defpackage.kp;
import defpackage.kq;
import defpackage.kyh;
import defpackage.lg80;
import defpackage.m950;
import defpackage.mg80;
import defpackage.mud0;
import defpackage.muj;
import defpackage.ouj;
import defpackage.p1j0;
import defpackage.pep0;
import defpackage.pgc0;
import defpackage.q5z;
import defpackage.qgc0;
import defpackage.rp;
import defpackage.ruj;
import defpackage.scc;
import defpackage.sls;
import defpackage.so;
import defpackage.svj;
import defpackage.t4s;
import defpackage.ti80;
import defpackage.tje;
import defpackage.tq;
import defpackage.tse;
import defpackage.ugc0;
import defpackage.uq;
import defpackage.w511;
import defpackage.wbc0;
import defpackage.xq;
import defpackage.ymj;
import defpackage.yp;
import defpackage.yq;
import defpackage.ysd0;
import defpackage.zzs;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;

/* loaded from: classes13.dex */
public final class a {
    public final Context a;
    public final tse b;
    public final com.yandex.go.places.impl.navigation.common.navigator.internal.b c;
    public final wbc0 d;
    public final b e;
    public final mg80 f;
    public final g3h g;
    public final PlacesNavigationMode h;
    public final ysd0 i;
    public final tse j;
    public final com.yandex.go.places.impl.ui.notifications.favorites.a k;
    public final i3y l;
    public final i3y m;

    public a(Context context, tse tseVar, com.yandex.go.places.impl.navigation.common.navigator.internal.b bVar, wbc0 wbc0Var, b bVar2, mg80 mg80Var, g3h g3hVar, PlacesNavigationMode placesNavigationMode, ysd0 ysd0Var, tse tseVar2, com.yandex.go.places.impl.ui.notifications.favorites.a aVar) {
        this.a = context;
        this.b = tseVar;
        this.c = bVar;
        this.d = wbc0Var;
        this.e = bVar2;
        this.f = mg80Var;
        this.g = g3hVar;
        this.h = placesNavigationMode;
        this.i = ysd0Var;
        this.j = tseVar2;
        this.k = aVar;
        final int i = 0;
        sls slsVar = new sls(this) { // from class: csj
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                a aVar2 = this.b;
                switch (i2) {
                    case 0:
                        return new esj(aVar2);
                    default:
                        return aVar2.g.a((esj) aVar2.l.getValue(), aVar2.h);
                }
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.l = kotlin.a.b(lazyThreadSafetyMode, slsVar);
        final int i2 = 1;
        this.m = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: csj
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                a aVar2 = this.b;
                switch (i22) {
                    case 0:
                        return new esj(aVar2);
                    default:
                        return aVar2.g.a((esj) aVar2.l.getValue(), aVar2.h);
                }
            }
        });
    }

    public final void a(fr frVar, c5c0 c5c0Var) {
        hyh hyhVar;
        int i;
        DeliveryCargoFlowPlacesNavigator$PointType deliveryCargoFlowPlacesNavigator$PointType;
        if (frVar instanceof yp) {
            Iterator it = ((yp) frVar).a.iterator();
            while (it.hasNext()) {
                a((fr) it.next(), null);
            }
            return;
        }
        mud0 mud0Var = null;
        if (frVar instanceof jp) {
            tje.N(this.b, null, null, new DiscoveryActionsInteractorImpl$handleAction$2(frVar, c5c0Var, this, null), 3);
            return;
        }
        boolean z = frVar instanceof hq;
        pgc0 pgc0Var = qgc0.U3;
        int i2 = 1;
        com.yandex.go.places.impl.navigation.common.navigator.internal.b bVar = this.c;
        if (z) {
            bVar.m.d(new eac0(bVar, i2), new ugc0(((hq) frVar).a, PlacesWebAuthType.OAUTH, false, 12), pgc0Var, p1j0.a);
            return;
        }
        if (frVar instanceof iq) {
            iq iqVar = (iq) frVar;
            bVar.m.d(new eac0(bVar, i2), new ugc0(iqVar.a, iqVar.b, false, 12), pgc0Var, p1j0.a);
            return;
        }
        if (frVar instanceof gq) {
            gq gqVar = (gq) frVar;
            bVar.a(gqVar.a, gqVar.b);
            return;
        }
        if (frVar instanceof xq) {
            xq xqVar = (xq) frVar;
            q5z.c0(xqVar.a, xqVar.c, this.a, 0);
            return;
        }
        if (frVar instanceof kq) {
            svj a = this.d.a();
            if (!(a instanceof hvj) && !(a instanceof fvj)) {
                a = a.d() ? ruj.b : a.c() ? ouj.b : a.b() ? iuj.b : muj.b;
            }
            svj svjVar = a;
            kq kqVar = (kq) frVar;
            ti80 ti80Var = kqVar.a;
            lg80 lg80Var = kqVar.b;
            if (lg80Var == null) {
                lg80Var = this.f.a();
            }
            com.yandex.go.places.impl.navigation.common.navigator.internal.b.c(this.c, svjVar, ti80Var, lg80Var, kqVar.c, kqVar.d, true, true, null, true, false, false, false, false, null, null, 31744);
            return;
        }
        if (frVar instanceof fq) {
            bVar.m.a.g0(((fq) frVar).a);
            return;
        }
        if (!(frVar instanceof cq)) {
            if (frVar instanceof dq) {
                dq dqVar = (dq) frVar;
                bVar.m.a.d0(dqVar.b, dqVar.a);
                return;
            }
            if (frVar instanceof br) {
                b bVar2 = this.e;
                com.yandex.go.coroutines.b.g(hjt.a, bVar2.c, null, new TrackingLinkInteractor$handleAction$1(bVar2, (br) frVar, null), 2);
                return;
            }
            if (frVar instanceof so) {
                tje.N(this.j, null, null, new DiscoveryActionsInteractorImpl$handleAction$4(this, frVar, null), 3);
                return;
            }
            if (frVar instanceof yq) {
                this.k.a((yq) frVar, new ymj(4, this, frVar));
                return;
            }
            if ((frVar instanceof kp) || (frVar instanceof rp) || (frVar instanceof eq) || (frVar instanceof tq) || (frVar instanceof uq) || (frVar instanceof aq)) {
                return;
            }
            w511.b();
            return;
        }
        cq cqVar = (cq) frVar;
        String str = cqVar.b;
        String str2 = cqVar.a;
        agi agiVar = cqVar.c;
        if (agiVar != null) {
            coe coeVar = agiVar.c;
            double d = coeVar.a;
            double d2 = coeVar.b;
            String str3 = agiVar.b;
            int i3 = dsj.a[agiVar.a.ordinal()];
            if (i3 == 1) {
                deliveryCargoFlowPlacesNavigator$PointType = DeliveryCargoFlowPlacesNavigator$PointType.SOURCE;
            } else {
                if (i3 != 2) {
                    w511.b();
                    return;
                }
                deliveryCargoFlowPlacesNavigator$PointType = DeliveryCargoFlowPlacesNavigator$PointType.DESTINATION;
            }
            hyhVar = new hyh(d, d2, str3, deliveryCargoFlowPlacesNavigator$PointType, agiVar.d);
        } else {
            hyhVar = null;
        }
        jyh jyhVar = bVar.m.a.L;
        if (hyhVar != null) {
            jyhVar.getClass();
            zzs zzsVar = new zzs(hyhVar.a, hyhVar.b, 0, null, null, 28);
            String str4 = hyhVar.c;
            Integer num = hyhVar.e;
            if (num != null) {
                i2 = num.intValue();
            } else {
                int i4 = iyh.a[hyhVar.d.ordinal()];
                if (i4 == 1) {
                    i = 0;
                    mud0Var = new mud0(i, 52, zzsVar, str4, (String) null, (String) null);
                } else if (i4 != 2) {
                    w511.b();
                    return;
                }
            }
            i = i2;
            mud0Var = new mud0(i, 52, zzsVar, str4, (String) null, (String) null);
        }
        kyh kyhVar = jyhVar.c.a;
        if (kyhVar != null) {
            kyhVar.i();
        }
        ((pep0) jyhVar.b).f((m950) jyhVar.a.get(), new gyh(str, scc.h(mud0Var), null, null, new t4s("places"), null, false, false, null, str2, null, 1516), hxx.a);
    }
}
