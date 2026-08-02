package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.navigator.domain.o;
import com.yandex.go.navigator.domain.t;
import com.yandex.go.navigator.driving.speaker.d;
import com.yandex.go.navigator.repository.f;
import com.yandex.go.navigator.settings.debug_panel.domain.b;
import com.yandex.go.places.common.navigation.deeplink.PlacesNavigationMode;
import com.yandex.go.shortcuts.impl.repository.j;
import com.yandex.go.taxi.order.domain.repositories.f0;
import com.yandex.go.taxi.tariffs.repository.g;
import com.yandex.messaging.InitialOrganizationStrategy;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.favorites.data.repo.a;
import ru.yandex.taxi.logistics.experiments.k;
import ru.yandex.taxi.logistics.ndd_map.router.e;
import ru.yandex.taxi.preorder.suggested.i;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class kkt implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final xvf0 i;
    public final xvf0 j;
    public final xvf0 k;
    public final xvf0 l;
    public final xvf0 m;
    public final xvf0 n;
    public final xvf0 o;
    public final xvf0 p;
    public final xvf0 q;
    public final xvf0 r;
    public final xvf0 s;
    public final xvf0 t;
    public final xvf0 u;
    public final xvf0 v;

    public /* synthetic */ kkt(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, xvf0 xvf0Var14, v7p v7pVar, xvf0 xvf0Var15, xvf0 xvf0Var16, xvf0 xvf0Var17, xvf0 xvf0Var18, xvf0 xvf0Var19, xvf0 xvf0Var20, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.j = xvf0Var9;
        this.k = xvf0Var10;
        this.l = xvf0Var11;
        this.m = xvf0Var12;
        this.n = xvf0Var13;
        this.o = xvf0Var14;
        this.p = v7pVar;
        this.q = xvf0Var15;
        this.r = xvf0Var16;
        this.s = xvf0Var17;
        this.t = xvf0Var18;
        this.u = xvf0Var19;
        this.v = xvf0Var20;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.q;
        xvf0 xvf0Var2 = this.k;
        xvf0 xvf0Var3 = this.m;
        xvf0 xvf0Var4 = this.f;
        xvf0 xvf0Var5 = this.r;
        xvf0 xvf0Var6 = this.v;
        xvf0 xvf0Var7 = this.j;
        xvf0 xvf0Var8 = this.s;
        xvf0 xvf0Var9 = this.i;
        xvf0 xvf0Var10 = this.p;
        xvf0 xvf0Var11 = this.h;
        xvf0 xvf0Var12 = this.g;
        xvf0 xvf0Var13 = this.t;
        xvf0 xvf0Var14 = this.o;
        xvf0 xvf0Var15 = this.n;
        xvf0 xvf0Var16 = this.u;
        xvf0 xvf0Var17 = this.l;
        xvf0 xvf0Var18 = this.e;
        xvf0 xvf0Var19 = this.d;
        xvf0 xvf0Var20 = this.c;
        xvf0 xvf0Var21 = this.b;
        switch (i) {
            case 0:
                Context context = (Context) ((t0g) xvf0Var5).get();
                g580 g580Var = (g580) xvf0Var21.get();
                tt2 tt2Var = (tt2) xvf0Var20.get();
                pho phoVar = (pho) xvf0Var18.get();
                ubx0 ubx0Var = (ubx0) xvf0Var4.get();
                return new jkt(context, g580Var, tt2Var, phoVar, ubx0Var, (pwy0) xvf0Var9.get(), (g) ((w0g) xvf0Var8).get(), (dqe0) ((w0g) xvf0Var13).get(), (arv0) xvf0Var7.get(), zzf.Z0(), (pdc) xvf0Var2.get(), (aqj0) xvf0Var17.get(), (wiq0) ((w0g) xvf0Var16).get(), (iev0) xvf0Var3.get(), (rqo) ((u0g) xvf0Var6).get(), (oep0) xvf0Var15.get(), (pav) xvf0Var14.get(), i5m.a(xvf0Var10), this.q);
            case 1:
                return new kv1((liq0) xvf0Var21.get(), (l4u) xvf0Var20.get(), (f) xvf0Var19.get(), (d) xvf0Var18.get(), (bf50) xvf0Var4.get(), (t) xvf0Var12.get(), (uyd) xvf0Var11.get(), (uyd) xvf0Var9.get(), (hbp0) xvf0Var7.get(), (b621) xvf0Var2.get(), (re50) xvf0Var17.get(), (par) xvf0Var3.get(), (o) xvf0Var15.get(), (vff) xvf0Var14.get(), (cb50) xvf0Var10.get(), (e621) xvf0Var.get(), (df50) xvf0Var5.get(), (b) xvf0Var8.get(), (a) ((f4g) xvf0Var13).get(), (com.yandex.go.places.impl.data.repositories.favorites.a) ((f4g) xvf0Var16).get(), (od50) xvf0Var6.get());
            case 2:
                return new yi50((Integer) ((n3w) xvf0Var5).a, (AddressResolveRepository) xvf0Var21.get(), (e100) ((di20) xvf0Var4).get(), (ah00) ((n4g) xvf0Var12).get(), (f5v0) ((n4g) xvf0Var11).get(), (ai50) ((ys10) xvf0Var9).get(), (n3a) ((n4g) xvf0Var7).get(), (k) ((n4g) xvf0Var2).get(), (Context) ((l4g) xvf0Var17).get(), (li50) ((ge50) xvf0Var3).get(), (ji50) ((n3w) xvf0Var15).a, (fl10) ((aos) xvf0Var14).get(), (uk10) ((lq40) xvf0Var10).get(), (u9i) xvf0Var20.get(), (uli) ((n4g) xvf0Var).get(), (e) xvf0Var19.get(), (n4g) xvf0Var8, (yh50) ((n3w) xvf0Var13).a, (oep0) ((n4g) xvf0Var16).get(), (oh50) xvf0Var18.get(), (aj50) ((di20) xvf0Var6).get());
            case 3:
                f0 f0Var = (f0) xvf0Var13.get();
                h3y a = i5m.a(xvf0Var16);
                com.yandex.go.taxi.order.details.v2.navigation.d dVar = (com.yandex.go.taxi.order.details.v2.navigation.d) xvf0Var6.get();
                return new ky70((Lifecycle) xvf0Var21.get(), (pav) xvf0Var20.get(), (k48) xvf0Var19.get(), (tse) xvf0Var18.get(), (k7x0) xvf0Var4.get(), (ney) xvf0Var12.get(), (c) xvf0Var11.get(), (j) xvf0Var9.get(), (com.yandex.go.navigation.screen.c) xvf0Var7.get(), (gpf0) xvf0Var2.get(), (iqz) xvf0Var17.get(), (com.yandex.go.superapp.order.multi.old.router.a) xvf0Var3.get(), (cim) xvf0Var15.get(), (v301) xvf0Var14.get(), (ru.yandex.taxi.apprate.common.domain.a) xvf0Var10.get(), this.q, this.r, (rct0) xvf0Var8, f0Var, a, dVar);
            case 4:
                return new xe80((Context) ((x4g) xvf0Var5).get(), (tse) xvf0Var21.get(), (com.yandex.go.places.impl.navigation.common.navigator.internal.b) xvf0Var20.get(), (p75) xvf0Var19.get(), (se80) xvf0Var18.get(), (mh80) xvf0Var4.get(), (ff80) xvf0Var12.get(), (xh80) xvf0Var11.get(), (n3h) xvf0Var9.get(), (PlacesNavigationMode) xvf0Var7.get(), (g3h) xvf0Var2.get(), (af80) xvf0Var17.get(), (oh80) xvf0Var3.get(), (mg80) xvf0Var15.get(), (wbc0) xvf0Var14.get(), (wf80) xvf0Var10.get(), (yf80) xvf0Var.get(), (wg80) ((n3w) xvf0Var8).a, (com.yandex.go.places.organization.card.impl.domain.interactors.map.flex.g) ((so4) xvf0Var13).get(), (com.yandex.go.places.organization.card.impl.domain.interactors.map.flex.j) ((so4) xvf0Var16).get(), (w030) ((x4g) xvf0Var6).get());
            case 5:
                return new ghf0((q5b0) ((q720) xvf0Var5).get(), (y7b0) ((q720) xvf0Var9).get(), (u2k0) ((q720) xvf0Var7).get(), (az10) ((q720) xvf0Var2).get(), (ueb) ((br10) xvf0Var17).get(), (t3f0) ((q720) xvf0Var3).get(), (ro6) ((br10) xvf0Var15).get(), (t5b0) ((q720) xvf0Var14).get(), (s2c0) ((q720) xvf0Var10).get(), (wgu) ((br10) xvf0Var).get(), (a8b) ((br10) xvf0Var8).get(), (q5b) ((br10) xvf0Var13).get(), (ot21) ((q720) xvf0Var16).get(), (nmf) ((br10) xvf0Var6).get(), (k020) xvf0Var21.get(), (InitialOrganizationStrategy) xvf0Var20.get(), (ai80) xvf0Var19.get(), (el21) xvf0Var18.get(), (com.yandex.messaging.data.e) xvf0Var4.get(), (ph9) xvf0Var12.get(), (dlf) xvf0Var11.get());
            case 6:
                byb bybVar = (byb) xvf0Var14.get();
                w6r w6rVar = (w6r) xvf0Var10.get();
                hnb0 hnb0Var = (hnb0) xvf0Var16.get();
                oep0 oep0Var = (oep0) xvf0Var6.get();
                return new ru.yandex.taxi.routeselector.a((zuj0) xvf0Var21.get(), (mhf) xvf0Var20.get(), (n050) xvf0Var19.get(), (yit0) xvf0Var18.get(), this.f, (qy41) xvf0Var12.get(), (AddressResolveRepository) xvf0Var11.get(), (n3o) ((k0n) xvf0Var5).get(), (kev0) xvf0Var9.get(), (i130) xvf0Var7.get(), (i6r) xvf0Var2.get(), (uet0) xvf0Var17.get(), this.m, (v8l0) xvf0Var15.get(), (b1) ((c7n) xvf0Var8).get(), (pp0) xvf0Var13, bybVar, w6rVar, this.q, hnb0Var, oep0Var);
            case 7:
                return new mvq0((ru.yandex.taxi.design.utils.b) ((kpp0) xvf0Var5).get(), (i) ((k51) xvf0Var10).get(), (v7b0) ((q150) xvf0Var).get(), (mbv0) ((m580) xvf0Var8).get(), (com.yandex.go.address.search.common.domain.interactor.a) ((im21) xvf0Var13).get(), (fhf) ((zfa) xvf0Var16).get(), (rwp0) ((lk) xvf0Var6).get(), (lvq0) xvf0Var21.get(), (s3o) xvf0Var20.get(), (f3o) xvf0Var19.get(), (fif) xvf0Var18.get(), (ru.yandex.taxi.search.c) xvf0Var4.get(), (nbv0) xvf0Var12.get(), (prj0) xvf0Var11.get(), (h51) xvf0Var9.get(), (qoi) xvf0Var7.get(), this.k, (oep0) xvf0Var17.get(), (d6v0) xvf0Var3.get(), (h4v0) xvf0Var15.get(), (nvq0) xvf0Var14.get());
            default:
                return new cpv0((amp0) ((sit0) xvf0Var5).get(), (com.yandex.go.route.interactor.b) xvf0Var21.get(), (s0c0) xvf0Var20.get(), (ck31) xvf0Var19.get(), (tt2) xvf0Var18.get(), (y5s0) xvf0Var4.get(), (ru.yandex.taxi.hints.interactors.c) ((iv0) xvf0Var17).get(), (w810) ((xpj0) xvf0Var3).get(), (wiq0) ((w0g) xvf0Var16).get(), (ekz) ((mvy) xvf0Var15).get(), (wae0) ((g680) xvf0Var14).get(), (dqe0) ((w0g) xvf0Var13).get(), (com.yandex.go.route.interactor.c) xvf0Var12.get(), (ru.yandex.taxi.address.repository.f) xvf0Var11.get(), (yjt0) ((l9t0) xvf0Var10).get(), (p0j) ((oti) xvf0Var).get(), (ru.yandex.taxi.widget.utils.e) xvf0Var9.get(), (com.yandex.go.taxi.summary.shared.sourcedestination.c) ((mz70) xvf0Var8).get(), (pwy0) xvf0Var7.get(), (ixb) xvf0Var2.get(), (sue0) ((upk0) xvf0Var6).get());
        }
    }

    public kkt(n3w n3wVar, xvf0 xvf0Var, di20 di20Var, n4g n4gVar, n4g n4gVar2, ys10 ys10Var, n4g n4gVar3, n4g n4gVar4, l4g l4gVar, ge50 ge50Var, n3w n3wVar2, aos aosVar, lq40 lq40Var, xvf0 xvf0Var2, n4g n4gVar5, xvf0 xvf0Var3, n4g n4gVar6, n3w n3wVar3, n4g n4gVar7, xvf0 xvf0Var4, di20 di20Var2) {
        this.a = 2;
        this.r = n3wVar;
        this.b = xvf0Var;
        this.f = di20Var;
        this.g = n4gVar;
        this.h = n4gVar2;
        this.i = ys10Var;
        this.j = n4gVar3;
        this.k = n4gVar4;
        this.l = l4gVar;
        this.m = ge50Var;
        this.n = n3wVar2;
        this.o = aosVar;
        this.p = lq40Var;
        this.c = xvf0Var2;
        this.q = n4gVar5;
        this.d = xvf0Var3;
        this.s = n4gVar6;
        this.t = n3wVar3;
        this.u = n4gVar7;
        this.e = xvf0Var4;
        this.v = di20Var2;
    }

    public kkt(q720 q720Var, q720 q720Var2, q720 q720Var3, q720 q720Var4, br10 br10Var, q720 q720Var5, br10 br10Var2, q720 q720Var6, q720 q720Var7, br10 br10Var3, br10 br10Var4, br10 br10Var5, q720 q720Var8, br10 br10Var6, eqh eqhVar, xvf0 xvf0Var, xvf0 xvf0Var2, edf0 edf0Var, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5) {
        this.a = 5;
        this.r = q720Var;
        this.i = q720Var2;
        this.j = q720Var3;
        this.k = q720Var4;
        this.l = br10Var;
        this.m = q720Var5;
        this.n = br10Var2;
        this.o = q720Var6;
        this.p = q720Var7;
        this.q = br10Var3;
        this.s = br10Var4;
        this.t = br10Var5;
        this.u = q720Var8;
        this.v = br10Var6;
        this.b = eqhVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = edf0Var;
        this.f = xvf0Var3;
        this.g = xvf0Var4;
        this.h = xvf0Var5;
    }

    public kkt(xvf0 xvf0Var, xvf0 xvf0Var2, oet0 oet0Var, eqh eqhVar, aj0 aj0Var, xvf0 xvf0Var3, n3w n3wVar, k0n k0nVar, xvf0 xvf0Var4, xvf0 xvf0Var5, n3w n3wVar2, eqh eqhVar2, npe0 npe0Var, gwb0 gwb0Var, c7n c7nVar, pp0 pp0Var, xvf0 xvf0Var6, xvf0 xvf0Var7, pl plVar, qta0 qta0Var, eqh eqhVar3) {
        this.a = 6;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = oet0Var;
        this.e = eqhVar;
        this.f = aj0Var;
        this.g = xvf0Var3;
        this.h = n3wVar;
        this.r = k0nVar;
        this.i = xvf0Var4;
        this.j = xvf0Var5;
        this.k = n3wVar2;
        this.l = eqhVar2;
        this.m = npe0Var;
        this.n = gwb0Var;
        this.s = c7nVar;
        this.t = pp0Var;
        this.o = xvf0Var6;
        this.p = xvf0Var7;
        this.q = plVar;
        this.u = qta0Var;
        this.v = eqhVar3;
    }

    public kkt(sit0 sit0Var, w0g w0gVar, w0g w0gVar2, y0g y0gVar, t0g t0gVar, w0g w0gVar3, iv0 iv0Var, xpj0 xpj0Var, w0g w0gVar4, mvy mvyVar, g680 g680Var, w0g w0gVar5, b1g b1gVar, b1g b1gVar2, l9t0 l9t0Var, oti otiVar, xvf0 xvf0Var, mz70 mz70Var, x0g x0gVar, g0g g0gVar, upk0 upk0Var) {
        this.a = 8;
        this.r = sit0Var;
        this.b = w0gVar;
        this.c = w0gVar2;
        this.d = y0gVar;
        this.e = t0gVar;
        this.f = w0gVar3;
        this.l = iv0Var;
        this.m = xpj0Var;
        this.u = w0gVar4;
        this.n = mvyVar;
        this.o = g680Var;
        this.t = w0gVar5;
        this.g = b1gVar;
        this.h = b1gVar2;
        this.p = l9t0Var;
        this.q = otiVar;
        this.i = xvf0Var;
        this.s = mz70Var;
        this.j = x0gVar;
        this.k = g0gVar;
        this.v = upk0Var;
    }

    public kkt(kpp0 kpp0Var, k51 k51Var, q150 q150Var, m580 m580Var, im21 im21Var, zfa zfaVar, lk lkVar, n3w n3wVar, xvf0 xvf0Var, oti otiVar, o7g o7gVar, k220 k220Var, l9t0 l9t0Var, zni0 zni0Var, o7g o7gVar2, o7g o7gVar3, l9g l9gVar, o7g o7gVar4, l9g l9gVar2, pmn0 pmn0Var, xvf0 xvf0Var2) {
        this.a = 7;
        this.r = kpp0Var;
        this.p = k51Var;
        this.q = q150Var;
        this.s = m580Var;
        this.t = im21Var;
        this.u = zfaVar;
        this.v = lkVar;
        this.b = n3wVar;
        this.c = xvf0Var;
        this.d = otiVar;
        this.e = o7gVar;
        this.f = k220Var;
        this.g = l9t0Var;
        this.h = zni0Var;
        this.i = o7gVar2;
        this.j = o7gVar3;
        this.k = l9gVar;
        this.l = o7gVar4;
        this.m = l9gVar2;
        this.n = pmn0Var;
        this.o = xvf0Var2;
    }

    public kkt(x4g x4gVar, n3w n3wVar, n3w n3wVar2, n3w n3wVar3, n3w n3wVar4, n3w n3wVar5, n3w n3wVar6, n3w n3wVar7, x4g x4gVar2, n3w n3wVar8, n3w n3wVar9, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, n3w n3wVar10, n3w n3wVar11, n3w n3wVar12, so4 so4Var, so4 so4Var2, x4g x4gVar3) {
        this.a = 4;
        this.r = x4gVar;
        this.b = n3wVar;
        this.c = n3wVar2;
        this.d = n3wVar3;
        this.e = n3wVar4;
        this.f = n3wVar5;
        this.g = n3wVar6;
        this.h = n3wVar7;
        this.i = x4gVar2;
        this.j = n3wVar8;
        this.k = n3wVar9;
        this.l = xvf0Var;
        this.m = xvf0Var2;
        this.n = xvf0Var3;
        this.o = xvf0Var4;
        this.p = n3wVar10;
        this.q = n3wVar11;
        this.s = n3wVar12;
        this.t = so4Var;
        this.u = so4Var2;
        this.v = x4gVar3;
    }

    public kkt(t0g t0gVar, xvf0 xvf0Var, t0g t0gVar2, t0g t0gVar3, u0g u0gVar, x0g x0gVar, y0g y0gVar, v0g v0gVar, x0g x0gVar2, w0g w0gVar, w0g w0gVar2, x0g x0gVar3, nwf nwfVar, a1g a1gVar, zni0 zni0Var, w0g w0gVar3, y0g y0gVar2, u0g u0gVar2, a1g a1gVar2, u0g u0gVar3, g0g g0gVar, g0g g0gVar2) {
        this.a = 0;
        this.r = t0gVar;
        this.b = xvf0Var;
        this.c = t0gVar2;
        this.d = t0gVar3;
        this.e = u0gVar;
        this.f = x0gVar;
        this.g = y0gVar;
        this.h = v0gVar;
        this.i = x0gVar2;
        this.s = w0gVar;
        this.t = w0gVar2;
        this.j = x0gVar3;
        this.k = a1gVar;
        this.l = zni0Var;
        this.u = w0gVar3;
        this.m = y0gVar2;
        this.v = u0gVar2;
        this.n = a1gVar2;
        this.o = u0gVar3;
        this.p = g0gVar;
        this.q = g0gVar2;
    }
}
