package com.yandex.go.multimodal_route;

import android.content.Context;
import com.yandex.go.multimodal_route.analytics.MultimodalRouteAnalytics$MultimodalRouteSource;
import com.yandex.go.multimodal_route.interactors.b;
import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import defpackage.a3v;
import defpackage.as40;
import defpackage.at40;
import defpackage.b4g;
import defpackage.c0g;
import defpackage.c4g;
import defpackage.cs40;
import defpackage.d130;
import defpackage.ds40;
import defpackage.fu40;
import defpackage.gt40;
import defpackage.gu40;
import defpackage.h3y;
import defpackage.hu40;
import defpackage.i5m;
import defpackage.i6r;
import defpackage.is40;
import defpackage.iu40;
import defpackage.ju40;
import defpackage.ks40;
import defpackage.ku40;
import defpackage.lfl0;
import defpackage.lz6;
import defpackage.mu40;
import defpackage.n3w;
import defpackage.nu40;
import defpackage.o2y0;
import defpackage.ou40;
import defpackage.q5z;
import defpackage.q911;
import defpackage.ra00;
import defpackage.t0w0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.w511;
import defpackage.wr40;
import defpackage.y3g;
import defpackage.yvf0;
import defpackage.z0a0;
import defpackage.zuj0;
import defpackage.zv40;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.masstransit.detailedroute.ui.f;

/* loaded from: classes12.dex */
public final class a extends BaseRootNavigationRouter implements ku40 {
    public final i6r D;
    public final yvf0 E;
    public final lfl0 F;
    public c4g G;

    public a(i6r i6rVar, yvf0 yvf0Var, lfl0 lfl0Var) {
        this.D = i6rVar;
        this.E = yvf0Var;
        this.F = lfl0Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.G = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        ju40 ju40Var = (ju40) obj;
        c0g c0gVar = (c0g) this.D;
        b G5 = c0gVar.G5();
        if (ju40Var instanceof fu40) {
            fu40 fu40Var = (fu40) ju40Var;
            String str = fu40Var.d;
            if (str != null) {
                this.F.a.put(str, fu40Var.a);
            }
            tje.N(o(), null, null, new MultimodalRouteRootRouterImpl$onLaunch$2(G5, this, ju40Var, null), 3);
            return;
        }
        if (!(ju40Var instanceof iu40)) {
            w511.b();
            return;
        }
        iu40 iu40Var = (iu40) ju40Var;
        o2y0 o2y0Var = iu40Var.b;
        A(Q().c(), new q911(o2y0Var, c0gVar.H5().b(o2y0Var.b().a, o2y0Var.b().b.b), iu40Var.a, true), new ou40(this, iu40Var, 0));
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return new BaseRootNavigationRouter.a(null, BaseRootNavigationRouter.Background.MAP, null, 13);
    }

    public final c4g Q() {
        c4g c4gVar = this.G;
        if (c4gVar != null) {
            return c4gVar;
        }
        i6r i6rVar = this.D;
        i6rVar.getClass();
        c4g c4gVar2 = new c4g(i6rVar);
        this.G = c4gVar2;
        return c4gVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.util.ArrayList] */
    public final void R(fu40 fu40Var) {
        MultimodalRouteAnalytics$MultimodalRouteSource multimodalRouteAnalytics$MultimodalRouteSource;
        Iterator it;
        ?? r15;
        c4g Q = Q();
        gt40 gt40Var = (gt40) ((n3w) Q.s).a;
        at40 at40Var = (at40) ((n3w) Q.u).a;
        c0g c0gVar = (c0g) ((i6r) Q.a);
        f C5 = c0gVar.C5();
        Context H1 = c0gVar.H1();
        q5z.h(H1);
        d130 a = Q.a();
        y3g y3gVar = (y3g) Q.y;
        t0w0 t0w0Var = new t0w0(i5m.a(c0gVar.be));
        zv40 zv40Var = (zv40) ((n3w) Q.v).a;
        b4g b4gVar = (b4g) Q.z;
        b4g b4gVar2 = (b4g) Q.A;
        h3y a2 = i5m.a((b4g) Q.B);
        z0a0 M5 = c0gVar.M5();
        h3y a3 = i5m.a((y3g) Q.C);
        h3y a4 = i5m.a((b4g) Q.D);
        h3y a5 = i5m.a((b4g) Q.E);
        ra00 ra00Var = (ra00) c0gVar.u8.get();
        q5z.h(ra00Var);
        a3v j1 = c0gVar.j1();
        q5z.h(j1);
        zuj0 c = c0gVar.c();
        q5z.h(c);
        h3y a6 = i5m.a((y3g) Q.F);
        wr40 wr40Var = (wr40) c0gVar.z.Ko.get();
        q5z.h(wr40Var);
        ks40 ks40Var = new ks40(gt40Var, at40Var, C5, H1, a, y3gVar, t0w0Var, zv40Var, b4gVar, b4gVar2, a2, M5, a3, a4, a5, ra00Var, j1, c, a6, wr40Var, Q.b());
        String str = fu40Var.a;
        String str2 = fu40Var.c;
        String str3 = fu40Var.d;
        lz6 lz6Var = fu40Var.e;
        as40 as40Var = fu40Var.f;
        Long l = fu40Var.i;
        int i = mu40.a[fu40Var.g.ordinal()];
        if (i == 1) {
            multimodalRouteAnalytics$MultimodalRouteSource = MultimodalRouteAnalytics$MultimodalRouteSource.Hub;
        } else if (i == 2) {
            multimodalRouteAnalytics$MultimodalRouteSource = MultimodalRouteAnalytics$MultimodalRouteSource.Taxi;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            multimodalRouteAnalytics$MultimodalRouteSource = MultimodalRouteAnalytics$MultimodalRouteSource.Transport;
        }
        MultimodalRouteAnalytics$MultimodalRouteSource multimodalRouteAnalytics$MultimodalRouteSource2 = multimodalRouteAnalytics$MultimodalRouteSource;
        String str4 = fu40Var.b;
        List list = fu40Var.h;
        int i2 = 10;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            gu40 gu40Var = (gu40) it2.next();
            if (gu40Var != null) {
                List list2 = gu40Var.a;
                it = it2;
                r15 = new ArrayList(tcc.n(list2, i2));
                for (Iterator it3 = list2.iterator(); it3.hasNext(); it3 = it3) {
                    hu40 hu40Var = (hu40) it3.next();
                    r15.add(new ds40(hu40Var.a, hu40Var.b, hu40Var.c, hu40Var.d, hu40Var.e, hu40Var.f, hu40Var.g, hu40Var.h));
                }
            } else {
                it = it2;
                r15 = EmptyList.a;
            }
            arrayList.add(new cs40(r15));
            it2 = it;
            i2 = 10;
        }
        A(ks40Var, new is40(str, str4, str2, str3, lz6Var, as40Var, multimodalRouteAnalytics$MultimodalRouteSource2, arrayList, l), new nu40(this, fu40Var));
    }
}
