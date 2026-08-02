package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ViewStub;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.taxi.tariffs.internal.routestats.interactor.a0;
import com.yandex.go.zone.repository.l;
import com.yandex.go.zone.repository.r;
import ru.yandex.taxi.am.i;
import ru.yandex.taxi.am.token.a;
import ru.yandex.taxi.contacts.g;
import ru.yandex.taxi.delivery.experiments.e;
import ru.yandex.taxi.fragment.common.b;
import ru.yandex.taxi.logistics.care.impl.router.f;
import ru.yandex.taxi.logistics.payment_method_selector.c;
import ru.yandex.taxi.masstransit.detailedroute.ui.v2.d;
import ru.yandex.taxi.masstransit.detailedroute.ui.v2.o;
import ru.yandex.taxi.masstransit.experiment.d0;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes9.dex */
public final class pn2 implements v7p {
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

    public /* synthetic */ pn2(v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var, v7p v7pVar3, xvf0 xvf0Var2, v7p v7pVar4, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, v7p v7pVar5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, int i) {
        this.a = i;
        this.b = v7pVar;
        this.c = v7pVar2;
        this.d = xvf0Var;
        this.e = v7pVar3;
        this.f = xvf0Var2;
        this.g = v7pVar4;
        this.h = xvf0Var3;
        this.i = xvf0Var4;
        this.j = xvf0Var5;
        this.k = v7pVar5;
        this.l = xvf0Var6;
        this.m = xvf0Var7;
        this.n = xvf0Var8;
        this.o = xvf0Var9;
        this.p = xvf0Var10;
        this.q = xvf0Var11;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.k;
        xvf0 xvf0Var2 = this.j;
        xvf0 xvf0Var3 = this.i;
        xvf0 xvf0Var4 = this.h;
        xvf0 xvf0Var5 = this.g;
        xvf0 xvf0Var6 = this.f;
        xvf0 xvf0Var7 = this.e;
        xvf0 xvf0Var8 = this.q;
        xvf0 xvf0Var9 = this.p;
        xvf0 xvf0Var10 = this.o;
        xvf0 xvf0Var11 = this.n;
        xvf0 xvf0Var12 = this.m;
        xvf0 xvf0Var13 = this.l;
        xvf0 xvf0Var14 = this.d;
        xvf0 xvf0Var15 = this.c;
        xvf0 xvf0Var16 = this.b;
        switch (i) {
            case 0:
                return new on2((ey2) xvf0Var16.get(), i5m.a(xvf0Var15), (wnt) xvf0Var14.get(), (umx) xvf0Var7.get(), (a) xvf0Var6.get(), (h) xvf0Var5.get(), i5m.a(xvf0Var4), (tt2) xvf0Var3.get(), i5m.a(xvf0Var2), i5m.a(xvf0Var), i5m.a(xvf0Var13), i5m.a((p9p) xvf0Var10), i5m.a((p350) xvf0Var9), i5m.a(xvf0Var12), i5m.a(xvf0Var11), (e6v0) xvf0Var8);
            case 1:
                return new f((zuj0) xvf0Var16.get(), (nwh) xvf0Var15.get(), (ru.yandex.taxi.logistics.care.impl.auth.a) ((fr3) xvf0Var10).get(), (ru.yandex.taxi.logistics.care.impl.experiments.a) ((zzg) xvf0Var9).get(), (v7j0) xvf0Var14.get(), (b) xvf0Var7.get(), i5m.a(xvf0Var6), i5m.a(xvf0Var5), (kb20) xvf0Var4.get(), (tse) xvf0Var3.get(), (Context) xvf0Var2.get(), (w030) xvf0Var.get(), (c2x0) xvf0Var13.get(), (po21) xvf0Var12.get(), (tj21) xvf0Var11.get(), (pwy0) xvf0Var8.get());
            case 2:
                Context context = (Context) xvf0Var16.get();
                ru.yandex.taxi.contacts.a aVar = (ru.yandex.taxi.contacts.a) xvf0Var15.get();
                zuj0 zuj0Var = (zuj0) xvf0Var14.get();
                g gVar = (g) xvf0Var7.get();
                uq1 uq1Var = (uq1) xvf0Var6.get();
                rqo rqoVar = (rqo) xvf0Var5.get();
                pav pavVar = (pav) xvf0Var4.get();
                k7x0 k7x0Var = (k7x0) xvf0Var3.get();
                wt90 wt90Var = (wt90) xvf0Var2.get();
                y5i y5iVar = (y5i) xvf0Var.get();
                e eVar = (e) xvf0Var13.get();
                return new s14(context, aVar, zuj0Var, gVar, uq1Var, rqoVar, pavVar, k7x0Var, wt90Var, y5iVar, eVar, (apf) ((zth) xvf0Var10).get(), (c) ((vd) xvf0Var9).get(), (oep0) xvf0Var11.get(), (pho) xvf0Var8.get());
            case 3:
                lz30 lz30Var = (lz30) xvf0Var13.get();
                n6a0 n6a0Var = (n6a0) xvf0Var12.get();
                s111 s111Var = (s111) xvf0Var11.get();
                return new qf30((Context) xvf0Var16.get(), (w030) xvf0Var15.get(), (o) ((vw2) xvf0Var10).get(), (d) ((lcw) xvf0Var9).get(), (yw30) xvf0Var14.get(), (y50) xvf0Var7.get(), i5m.a(xvf0Var6), (a3v) xvf0Var5.get(), (zuj0) xvf0Var4.get(), this.i, (z0a0) xvf0Var2.get(), (gtc) xvf0Var8, this.k, lz30Var, n6a0Var, s111Var);
            case 4:
                return new ru.yandex.taxi.masstransit.detailedroute.router.c((ru.yandex.taxi.masstransit.datasource.routing.a) xvf0Var16.get(), (yp30) xvf0Var15.get(), (a3v) xvf0Var14.get(), this.e, this.f, this.g, this.h, (com.yandex.go.navigation.screen.c) xvf0Var3.get(), this.j, (d0) xvf0Var.get(), (ru.yandex.taxi.masstransit.trains.config.a) xvf0Var13.get(), (zuj0) xvf0Var12.get(), (ah00) xvf0Var11.get(), (k141) xvf0Var10.get(), (a3l0) ((xpj0) xvf0Var9).get(), (f0o0) xvf0Var8.get());
            case 5:
                return new a0((ru.yandex.taxi.launch.c) xvf0Var16.get(), (com.yandex.go.route.interactor.b) xvf0Var15.get(), (qoj0) ((kxa0) xvf0Var13).get(), (mmf0) ((zlf0) xvf0Var12).get(), (hqe0) ((pqd0) xvf0Var11).get(), (n1d) ((b900) xvf0Var10).get(), (vo40) ((k220) xvf0Var9).get(), (ru.yandex.taxi.preorder.tollroad.data.e) xvf0Var14.get(), (au50) ((kyd) xvf0Var8).get(), (pte0) xvf0Var7.get(), (ldm) xvf0Var6.get(), (kni) xvf0Var5.get(), (uvw) xvf0Var4.get(), (jd21) xvf0Var3.get(), (i) xvf0Var2.get(), (wiq0) xvf0Var.get());
            case 6:
                return new ru.yandex.taxi.map_common.c((ViewStub) xvf0Var16.get(), i5m.a(xvf0Var15), (yl00) xvf0Var14.get(), i5m.a(xvf0Var7), i5m.a(xvf0Var6), i5m.a(xvf0Var5), i5m.a(xvf0Var4), i5m.a(xvf0Var3), (Lifecycle) xvf0Var2.get(), (tse) xvf0Var.get(), (Activity) xvf0Var13.get(), i5m.a(xvf0Var12), i5m.a((zof0) xvf0Var10), (lx4) xvf0Var11.get(), (el00) xvf0Var9.get(), (ru.yandex.taxi.map_common.map.experiment.b) ((bsz) xvf0Var8).get());
            default:
                return new com.yandex.go.zone.repository.o((on2) xvf0Var16.get(), (l) xvf0Var15.get(), (r8h) xvf0Var14.get(), (kd61) xvf0Var7.get(), (com.yandex.go.zone.repository.h) xvf0Var6.get(), (id61) xvf0Var5.get(), (r) xvf0Var4.get(), (fn21) xvf0Var3.get(), (tt2) xvf0Var2.get(), (ae61) xvf0Var.get(), (jd61) xvf0Var13.get(), (bqe) xvf0Var12.get(), (rre) xvf0Var11.get(), (h1f) xvf0Var10.get(), (ru.yandex.taxi.perf.screen.c) xvf0Var9.get(), (com.yandex.go.zone.repository.d) ((rk21) xvf0Var8).get());
        }
    }

    public pn2(eqh eqhVar, xvf0 xvf0Var, kxa0 kxa0Var, zlf0 zlf0Var, pqd0 pqd0Var, b900 b900Var, k220 k220Var, xvf0 xvf0Var2, kyd kydVar, xvf0 xvf0Var3, xvf0 xvf0Var4, xh xhVar, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8) {
        this.a = 5;
        this.b = eqhVar;
        this.c = xvf0Var;
        this.l = kxa0Var;
        this.m = zlf0Var;
        this.n = pqd0Var;
        this.o = b900Var;
        this.p = k220Var;
        this.d = xvf0Var2;
        this.q = kydVar;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = xhVar;
        this.h = xvf0Var5;
        this.i = xvf0Var6;
        this.j = xvf0Var7;
        this.k = xvf0Var8;
    }

    public pn2(xvf0 xvf0Var, zth zthVar, xvf0 xvf0Var2, rxm0 rxm0Var, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xcz xczVar, eqh eqhVar, zth zthVar2, vd vdVar, eqh eqhVar2, eqh eqhVar3) {
        this.a = 2;
        this.b = xvf0Var;
        this.c = zthVar;
        this.d = xvf0Var2;
        this.e = rxm0Var;
        this.f = xvf0Var3;
        this.g = xvf0Var4;
        this.h = xvf0Var5;
        this.i = xvf0Var6;
        this.j = xvf0Var7;
        this.k = xvf0Var8;
        this.l = xczVar;
        this.m = eqhVar;
        this.o = zthVar2;
        this.p = vdVar;
        this.n = eqhVar2;
        this.q = eqhVar3;
    }

    public pn2(xv2 xv2Var, eqh eqhVar, xvf0 xvf0Var, xvf0 xvf0Var2, eqh eqhVar2, xvf0 xvf0Var3, oe oeVar, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, p9p p9pVar, p350 p350Var, xvf0 xvf0Var8, xvf0 xvf0Var9, e6v0 e6v0Var) {
        this.a = 0;
        this.b = xv2Var;
        this.c = eqhVar;
        this.d = xvf0Var;
        this.e = xvf0Var2;
        this.f = eqhVar2;
        this.g = xvf0Var3;
        this.h = oeVar;
        this.i = xvf0Var4;
        this.j = xvf0Var5;
        this.k = xvf0Var6;
        this.l = xvf0Var7;
        this.o = p9pVar;
        this.p = p350Var;
        this.m = xvf0Var8;
        this.n = xvf0Var9;
        this.q = e6v0Var;
    }

    public pn2(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, bsz bszVar, eqh eqhVar, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, n3w n3wVar, eqh eqhVar2, zof0 zof0Var, eqh eqhVar3, xvf0 xvf0Var9, bsz bszVar2) {
        this.a = 6;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = bszVar;
        this.f = eqhVar;
        this.g = xvf0Var4;
        this.h = xvf0Var5;
        this.i = xvf0Var6;
        this.j = xvf0Var7;
        this.k = xvf0Var8;
        this.l = n3wVar;
        this.m = eqhVar2;
        this.o = zof0Var;
        this.n = eqhVar3;
        this.p = xvf0Var9;
        this.q = bszVar2;
    }

    public pn2(xvf0 xvf0Var, eqh eqhVar, vw2 vw2Var, lcw lcwVar, zw30 zw30Var, xvf0 xvf0Var2, s730 s730Var, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, axy axyVar, gtc gtcVar, k220 k220Var, xvf0 xvf0Var6, xvf0 xvf0Var7, rsn0 rsn0Var) {
        this.a = 3;
        this.b = xvf0Var;
        this.c = eqhVar;
        this.o = vw2Var;
        this.p = lcwVar;
        this.d = zw30Var;
        this.e = xvf0Var2;
        this.f = s730Var;
        this.g = xvf0Var3;
        this.h = xvf0Var4;
        this.i = xvf0Var5;
        this.j = axyVar;
        this.q = gtcVar;
        this.k = k220Var;
        this.l = xvf0Var6;
        this.m = xvf0Var7;
        this.n = rsn0Var;
    }

    public pn2(xvf0 xvf0Var, zth zthVar, fr3 fr3Var, zzg zzgVar, gwb0 gwb0Var, xvf0 xvf0Var2, zzg zzgVar2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, eqh eqhVar, xvf0 xvf0Var7, eqh eqhVar2, d701 d701Var, xvf0 xvf0Var8) {
        this.a = 1;
        this.b = xvf0Var;
        this.c = zthVar;
        this.o = fr3Var;
        this.p = zzgVar;
        this.d = gwb0Var;
        this.e = xvf0Var2;
        this.f = zzgVar2;
        this.g = xvf0Var3;
        this.h = xvf0Var4;
        this.i = xvf0Var5;
        this.j = xvf0Var6;
        this.k = eqhVar;
        this.l = xvf0Var7;
        this.m = eqhVar2;
        this.n = d701Var;
        this.q = xvf0Var8;
    }
}
