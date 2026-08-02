package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.b0;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.m;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.n;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.p0;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.q0;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.u;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.v;
import com.yandex.go.superapp.tracking.data.e;
import com.yandex.go.taxi.main.shortcuts.interactors.b;
import com.yandex.go.taxi.order.multi.shortcuts.f;
import com.yandex.go.taxi.order.view.l;
import com.yandex.go.taxi.tariffs.repository.g;
import com.yandex.passport.sloth.command.performers.d;
import com.yandex.passport.sloth.command.performers.h;
import com.yandex.passport.sloth.command.performers.j;
import com.yandex.passport.sloth.command.performers.o;
import com.yandex.passport.sloth.command.performers.q;
import com.yandex.passport.sloth.command.performers.r;
import com.yandex.passport.sloth.command.performers.s;
import com.yandex.passport.sloth.command.performers.t;
import com.yandex.passport.sloth.command.performers.w;
import com.yandex.passport.sloth.data.SlothParams;
import ru.yandex.taxi.delivery.interactors.p;
import ru.yandex.taxi.delivery.ui.setuprequierements.c;
import ru.yandex.taxi.preorder.source.domain.a;
import ru.yandex.taxi.summary.requirements.list.interactors.u0;
import ru.yandex.taxi.summary.requirements.list.recycler.i;
import ru.yandex.taxi.summary.ui.SummaryStateTracker;

/* loaded from: classes14.dex */
public final class npi implements v7p {
    public final /* synthetic */ int a = 0;
    public final xvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final yvf0 f;
    public final yvf0 g;
    public final yvf0 h;
    public final yvf0 i;
    public final yvf0 j;
    public final yvf0 k;
    public final yvf0 l;
    public final yvf0 m;
    public final yvf0 n;
    public final yvf0 o;
    public final yvf0 p;
    public final yvf0 q;
    public final yvf0 r;
    public final yvf0 s;
    public final yvf0 t;
    public final yvf0 u;
    public final yvf0 v;
    public final xvf0 w;

    public npi(n3w n3wVar, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7, yvf0 yvf0Var8, yvf0 yvf0Var9, yvf0 yvf0Var10, yvf0 yvf0Var11, yvf0 yvf0Var12, yvf0 yvf0Var13, yvf0 yvf0Var14, yvf0 yvf0Var15, yvf0 yvf0Var16, yvf0 yvf0Var17, yvf0 yvf0Var18, yvf0 yvf0Var19, yvf0 yvf0Var20, xvf0 xvf0Var) {
        this.w = n3wVar;
        this.c = yvf0Var;
        this.d = yvf0Var2;
        this.e = yvf0Var3;
        this.f = yvf0Var4;
        this.g = yvf0Var5;
        this.h = yvf0Var6;
        this.i = yvf0Var7;
        this.j = yvf0Var8;
        this.k = yvf0Var9;
        this.l = yvf0Var10;
        this.m = yvf0Var11;
        this.n = yvf0Var12;
        this.o = yvf0Var13;
        this.p = yvf0Var14;
        this.q = yvf0Var15;
        this.r = yvf0Var16;
        this.s = yvf0Var17;
        this.t = yvf0Var18;
        this.u = yvf0Var19;
        this.v = yvf0Var20;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        yvf0 yvf0Var = this.v;
        yvf0 yvf0Var2 = this.u;
        yvf0 yvf0Var3 = this.t;
        yvf0 yvf0Var4 = this.s;
        yvf0 yvf0Var5 = this.r;
        yvf0 yvf0Var6 = this.q;
        yvf0 yvf0Var7 = this.p;
        yvf0 yvf0Var8 = this.o;
        yvf0 yvf0Var9 = this.n;
        yvf0 yvf0Var10 = this.m;
        yvf0 yvf0Var11 = this.l;
        yvf0 yvf0Var12 = this.k;
        yvf0 yvf0Var13 = this.j;
        yvf0 yvf0Var14 = this.i;
        yvf0 yvf0Var15 = this.h;
        yvf0 yvf0Var16 = this.g;
        yvf0 yvf0Var17 = this.f;
        yvf0 yvf0Var18 = this.e;
        yvf0 yvf0Var19 = this.d;
        yvf0 yvf0Var20 = this.c;
        xvf0 xvf0Var2 = this.w;
        switch (i) {
            case 0:
                return new c((w030) xvf0Var.get(), (Context) ((xvf0) yvf0Var20).get(), (g580) ((xvf0) yvf0Var19).get(), (vsi) ((xvf0) yvf0Var18).get(), (xjj0) ((xvf0) yvf0Var17).get(), (lx4) ((xvf0) yvf0Var16).get(), (kki) ((xvf0) yvf0Var15).get(), (gsi) ((xvf0) yvf0Var14).get(), (dqe0) ((xvf0) yvf0Var13).get(), (p) ((xvf0) yvf0Var12).get(), (zsi) ((n3w) xvf0Var2).a, (wiq0) ((xvf0) yvf0Var11).get(), (rqo) ((xvf0) yvf0Var10).get(), (ynj0) ((xvf0) yvf0Var9).get(), (Activity) ((xvf0) yvf0Var8).get(), (g) ((xvf0) yvf0Var7).get(), (cq40) ((xvf0) yvf0Var6).get(), (iev0) ((xvf0) yvf0Var5).get(), (oep0) ((xvf0) yvf0Var4).get(), (pho) ((xvf0) yvf0Var3).get(), (tt2) ((xvf0) yvf0Var2).get(), (pwy0) ((xvf0) yvf0Var).get());
            case 1:
                return new d680((y50) xvf0Var.get(), (l) ((xvf0) yvf0Var20).get(), (xvf0) yvf0Var19, (n1s0) ((xvf0) yvf0Var18).get(), (a) ((xvf0) yvf0Var17).get(), (f) ((xvf0) yvf0Var16).get(), (sm40) ((xvf0) yvf0Var15).get(), (oh70) ((xvf0) yvf0Var14).get(), (oh70) ((xvf0) yvf0Var13).get(), (ck31) ((xvf0) yvf0Var12).get(), (hwe0) ((xvf0) yvf0Var11).get(), (c4r0) ((xvf0) yvf0Var10).get(), (mpc) ((xvf0) yvf0Var9).get(), i5m.a((eqh) xvf0Var2), (i270) ((xvf0) yvf0Var8).get(), (o7r) ((xvf0) yvf0Var7).get(), (t4l0) ((xvf0) yvf0Var6).get(), (xvf0) yvf0Var5, (jjv0) ((xvf0) yvf0Var4).get(), (ru.yandex.taxi.shortcuts.interactors.a) ((xvf0) yvf0Var3).get(), (tse) ((xvf0) yvf0Var2).get(), (oep0) ((xvf0) yvf0Var).get());
            case 2:
                return new t680((d680) xvf0Var.get(), (sxr0) ((xvf0) yvf0Var20).get(), (f680) ((xvf0) yvf0Var19).get(), i5m.a((xvf0) yvf0Var18), (h680) ((xvf0) yvf0Var17).get(), (gy70) ((xvf0) yvf0Var16).get(), (jt00) ((xvf0) yvf0Var15).get(), (n170) ((xvf0) yvf0Var14).get(), (c1f) ((xvf0) yvf0Var13).get(), (x1s0) ((xvf0) yvf0Var12).get(), (t4s0) ((xvf0) yvf0Var11).get(), (k3s0) ((xvf0) yvf0Var10).get(), (mqv0) ((xvf0) yvf0Var9).get(), (ip11) ((xvf0) yvf0Var8).get(), (zzr0) ((xvf0) yvf0Var7).get(), (p1s0) ((xvf0) yvf0Var6).get(), (s1s0) ((xvf0) yvf0Var5).get(), (jep0) ((xvf0) yvf0Var4).get(), (e) ((xvf0) yvf0Var3).get(), (ge50) xvf0Var2, i5m.a((xvf0) yvf0Var2), (m30) ((xvf0) yvf0Var).get());
            case 3:
                Context context = (Context) ((t0g) yvf0Var2).get();
                tt2 tt2Var = (tt2) xvf0Var.get();
                pwy0 pwy0Var = (pwy0) ((xvf0) yvf0Var19).get();
                pav pavVar = (pav) ((xvf0) yvf0Var18).get();
                xdf xdfVar = (xdf) ((xvf0) yvf0Var17).get();
                c4r0 c4r0Var = (c4r0) ((xvf0) yvf0Var16).get();
                pdc pdcVar = (pdc) ((xvf0) yvf0Var15).get();
                h4j h4jVar = (h4j) ((rwh) yvf0Var).get();
                SummaryStateTracker summaryStateTracker = (SummaryStateTracker) ((xvf0) yvf0Var14).get();
                wiq0 wiq0Var = (wiq0) ((w0g) xvf0Var2).get();
                b8r b8rVar = (b8r) ((xvf0) yvf0Var13).get();
                maj0 maj0Var = (maj0) ((xvf0) yvf0Var12).get();
                ru.yandex.taxi.widget.c cVar = (ru.yandex.taxi.widget.c) ((xvf0) yvf0Var11).get();
                return new y9j0(context, tt2Var, pwy0Var, pavVar, xdfVar, c4r0Var, pdcVar, h4jVar, summaryStateTracker, wiq0Var, b8rVar, maj0Var, cVar, (ici) ((xvf0) yvf0Var8).get(), (lci) ((xvf0) yvf0Var7).get(), (oci) ((xvf0) yvf0Var6).get(), (goi) ((xvf0) yvf0Var5).get(), (n3h) ((xvf0) yvf0Var4).get(), (oep0) ((xvf0) yvf0Var3).get());
            case 4:
                return new b((tse) ((x2g) yvf0Var10).get(), (i130) ((r9g) yvf0Var9).get(), (y50) ((x2g) yvf0Var8).get(), (hwe0) ((r9g) yvf0Var7).get(), (c4r0) ((s9g) yvf0Var6).get(), (a) ((x2g) yvf0Var5).get(), (arv0) ((r9g) yvf0Var4).get(), (yb00) xvf0Var.get(), (com.yandex.go.taxi.main.shortcuts.interactors.c) ((xvf0) yvf0Var20).get(), (ck31) ((xvf0) yvf0Var19).get(), (i270) ((xvf0) yvf0Var18).get(), (o7r) ((xvf0) yvf0Var17).get(), (xvf0) yvf0Var16, (ru.yandex.taxi.sdc.router.e) ((xvf0) yvf0Var15).get(), (mpc) ((xvf0) yvf0Var14).get(), (jc00) ((xvf0) yvf0Var13).get(), (mxb) ((xvf0) yvf0Var12).get(), (oep0) ((xvf0) yvf0Var11).get(), (r0s0) ((h0l0) yvf0Var3).get(), (t4l0) ((r9g) yvf0Var2).get(), (x7k0) ((s9g) yvf0Var).get(), (s9g) xvf0Var2);
            case 5:
                return new jov0((ou7) ((g0g) yvf0Var3).get(), (biv0) ((b1g) yvf0Var2).get(), (z880) xvf0Var.get(), (i130) ((xvf0) yvf0Var20).get(), (xvf0) yvf0Var19, (jas0) ((xvf0) yvf0Var18).get(), (wc11) ((xvf0) yvf0Var17).get(), (ru.yandex.taxi.statebar.a) ((xvf0) yvf0Var16).get(), (ru.yandex.taxi.perf.screen.c) ((xvf0) yvf0Var15).get(), (mgv0) ((xvf0) yvf0Var14).get(), (smv0) ((xvf0) yvf0Var13).get(), (set0) ((xvf0) yvf0Var12).get(), i5m.a((xvf0) yvf0Var11), i5m.a((xvf0) yvf0Var10), (rf5) ((xvf0) yvf0Var9).get(), (e7k0) ((xvf0) yvf0Var8).get(), (mhd) ((xvf0) yvf0Var7).get(), (rh31) ((xvf0) yvf0Var6).get(), (kov0) ((xvf0) yvf0Var5).get(), (com.yandex.go.analytics.b) ((xvf0) yvf0Var4).get(), (a850) ((z0g) yvf0Var).get(), (y0g) xvf0Var2);
            case 6:
                return new dex0((ltz0) xvf0Var.get(), (vfx0) ((xvf0) yvf0Var20).get(), (com.yandex.go.summary.interactor.expanded.state.content.tariffcard.b) ((xvf0) yvf0Var19).get(), (q0) ((xvf0) yvf0Var18).get(), (com.yandex.go.summary.interactor.expanded.state.content.tariffcard.c) ((xvf0) yvf0Var17).get(), (y7t0) ((xvf0) yvf0Var16).get(), (x2u) ((xvf0) yvf0Var15).get(), (p0) ((xvf0) yvf0Var14).get(), (v) ((xvf0) yvf0Var13).get(), (u) ((xvf0) yvf0Var12).get(), (b0) ((xvf0) yvf0Var11).get(), (ndx0) ((xvf0) yvf0Var10).get(), (jz8) ((xvf0) yvf0Var9).get(), (viv0) ((xvf0) yvf0Var8).get(), (ihp0) ((xvf0) yvf0Var7).get(), (com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.l) ((qrb) yvf0Var6).get(), (owh) ((xv8) yvf0Var5).get(), (igj) ((gx8) yvf0Var4).get(), (z1f) ((n00) yvf0Var3).get(), (m) ((iv0) yvf0Var2).get(), (n) ((epf) yvf0Var).get(), (wiq0) ((w0g) xvf0Var2).get());
            case 7:
                return new iix0((tix0) xvf0Var.get(), (gfv0) ((n3w) xvf0Var2).a, (wiq0) ((w0g) yvf0Var3).get(), i5m.a((xvf0) yvf0Var20), (xvf0) yvf0Var19, (xvf0) yvf0Var18, (oep0) ((xvf0) yvf0Var17).get(), (tbx0) ((xvf0) yvf0Var16).get(), (nex0) ((xvf0) yvf0Var15).get(), (bxi0) ((xvf0) yvf0Var14).get(), (tt2) ((xvf0) yvf0Var13).get(), (xb80) ((xvf0) yvf0Var12).get(), (f580) ((xvf0) yvf0Var11).get(), (n3h) ((xvf0) yvf0Var10).get(), (u0) ((xvf0) yvf0Var9).get(), (i) ((xvf0) yvf0Var8).get(), (yix0) ((sit0) yvf0Var2).get(), (wjm) ((z9n) yvf0Var).get(), (ck31) ((xvf0) yvf0Var7).get(), (viv0) ((xvf0) yvf0Var6).get(), (y7r) ((xvf0) yvf0Var5).get(), (iev0) ((xvf0) yvf0Var4).get());
            default:
                return new com.yandex.passport.sloth.command.p((SlothParams) ((n3w) xvf0Var2).a, (com.yandex.passport.sloth.dependencies.f) yvf0Var20.get(), (t) yvf0Var19.get(), (com.yandex.passport.sloth.command.performers.b) yvf0Var18.get(), (com.yandex.passport.sloth.command.performers.l) yvf0Var17.get(), (o) yvf0Var16.get(), (com.yandex.passport.sloth.command.performers.p) yvf0Var15.get(), (r) yvf0Var14.get(), (com.yandex.passport.sloth.command.performers.a) yvf0Var13.get(), (com.yandex.passport.sloth.command.performers.n) yvf0Var12.get(), (com.yandex.passport.sloth.command.performers.m) yvf0Var11.get(), (s) yvf0Var10.get(), (com.yandex.passport.sloth.command.performers.f) yvf0Var9.get(), (d) yvf0Var8.get(), (com.yandex.passport.sloth.command.performers.g) yvf0Var7.get(), (com.yandex.passport.sloth.command.performers.e) yvf0Var6.get(), (j) yvf0Var5.get(), (h) yvf0Var4.get(), (com.yandex.passport.sloth.command.performers.i) yvf0Var3.get(), (w) yvf0Var2.get(), (com.yandex.passport.sloth.command.performers.c) yvf0Var.get(), (q) xvf0Var.get());
        }
    }

    public npi(ibz0 ibz0Var, xvf0 xvf0Var, ju9 ju9Var, gpx0 gpx0Var, k4 k4Var, cys0 cys0Var, h1t h1tVar, z6x0 z6x0Var, cto ctoVar, cto ctoVar2, q150 q150Var, n00 n00Var, ht0 ht0Var, b1g b1gVar, xvf0 xvf0Var2, qrb qrbVar, xv8 xv8Var, gx8 gx8Var, n00 n00Var2, iv0 iv0Var, epf epfVar, w0g w0gVar) {
        this.b = ibz0Var;
        this.c = xvf0Var;
        this.d = ju9Var;
        this.e = gpx0Var;
        this.f = k4Var;
        this.g = cys0Var;
        this.h = h1tVar;
        this.i = z6x0Var;
        this.j = ctoVar;
        this.k = ctoVar2;
        this.l = q150Var;
        this.m = n00Var;
        this.n = ht0Var;
        this.o = b1gVar;
        this.p = xvf0Var2;
        this.q = qrbVar;
        this.r = xv8Var;
        this.s = gx8Var;
        this.t = n00Var2;
        this.u = iv0Var;
        this.v = epfVar;
        this.w = w0gVar;
    }

    public npi(x2g x2gVar, r9g r9gVar, x2g x2gVar2, r9g r9gVar2, s9g s9gVar, x2g x2gVar3, r9g r9gVar3, n3w n3wVar, vo3 vo3Var, s9g s9gVar2, r9g r9gVar4, xvf0 xvf0Var, r9g r9gVar5, r9g r9gVar6, x2g x2gVar4, r9g r9gVar7, x2g x2gVar5, r9g r9gVar8, h0l0 h0l0Var, r9g r9gVar9, s9g s9gVar3, s9g s9gVar4) {
        this.m = x2gVar;
        this.n = r9gVar;
        this.o = x2gVar2;
        this.p = r9gVar2;
        this.q = s9gVar;
        this.r = x2gVar3;
        this.s = r9gVar3;
        this.b = n3wVar;
        this.c = vo3Var;
        this.d = s9gVar2;
        this.e = r9gVar4;
        this.f = xvf0Var;
        this.g = r9gVar5;
        this.h = r9gVar6;
        this.i = x2gVar4;
        this.j = r9gVar7;
        this.k = x2gVar5;
        this.l = r9gVar8;
        this.t = h0l0Var;
        this.u = r9gVar9;
        this.v = s9gVar3;
        this.w = s9gVar4;
    }

    public npi(t0g t0gVar, t0g t0gVar2, x0g x0gVar, x0g x0gVar2, u0g u0gVar, t0g t0gVar3, a1g a1gVar, a1g a1gVar2, rwh rwhVar, xvf0 xvf0Var, w0g w0gVar, u0g u0gVar2, z0g z0gVar, u0g u0gVar3, v0g v0gVar, w0g w0gVar2, u0g u0gVar4, u0g u0gVar5, u0g u0gVar6, u0g u0gVar7, s0g s0gVar, a1g a1gVar3) {
        this.u = t0gVar;
        this.b = t0gVar2;
        this.c = x0gVar;
        this.d = x0gVar2;
        this.e = u0gVar;
        this.f = t0gVar3;
        this.g = a1gVar;
        this.h = a1gVar2;
        this.v = rwhVar;
        this.i = xvf0Var;
        this.w = w0gVar;
        this.j = u0gVar2;
        this.k = z0gVar;
        this.l = u0gVar3;
        this.m = v0gVar;
        this.n = w0gVar2;
        this.o = u0gVar4;
        this.p = u0gVar5;
        this.q = u0gVar6;
        this.r = u0gVar7;
        this.s = s0gVar;
        this.t = a1gVar3;
    }

    public npi(xvf0 xvf0Var, xvf0 xvf0Var2, eqh eqhVar, vo3 vo3Var, xvf0 xvf0Var3, pl plVar, xvf0 xvf0Var4, ph70 ph70Var, ph70 ph70Var2, xvf0 xvf0Var5, dld0 dld0Var, swo0 swo0Var, my0 my0Var, eqh eqhVar2, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, zzg zzgVar, xvf0 xvf0Var9, swb swbVar, xvf0 xvf0Var10, eqh eqhVar3) {
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = eqhVar;
        this.e = vo3Var;
        this.f = xvf0Var3;
        this.g = plVar;
        this.h = xvf0Var4;
        this.i = ph70Var;
        this.j = ph70Var2;
        this.k = xvf0Var5;
        this.l = dld0Var;
        this.m = swo0Var;
        this.n = my0Var;
        this.w = eqhVar2;
        this.o = xvf0Var6;
        this.p = xvf0Var7;
        this.q = xvf0Var8;
        this.r = zzgVar;
        this.s = xvf0Var9;
        this.t = swbVar;
        this.u = xvf0Var10;
        this.v = eqhVar3;
    }

    public npi(mal0 mal0Var, n3w n3wVar, w0g w0gVar, xvf0 xvf0Var, b1g b1gVar, h0l0 h0l0Var, a1g a1gVar, fat0 fat0Var, x0g x0gVar, z0g z0gVar, t0g t0gVar, z0g z0gVar2, axy axyVar, s0g s0gVar, ubq0 ubq0Var, xvf0 xvf0Var2, sit0 sit0Var, z9n z9nVar, y0g y0gVar, b1g b1gVar2, xvf0 xvf0Var3, z0s0 z0s0Var) {
        this.b = mal0Var;
        this.w = n3wVar;
        this.t = w0gVar;
        this.c = xvf0Var;
        this.d = b1gVar;
        this.e = h0l0Var;
        this.f = a1gVar;
        this.g = fat0Var;
        this.h = x0gVar;
        this.i = z0gVar;
        this.j = t0gVar;
        this.k = z0gVar2;
        this.l = axyVar;
        this.m = s0gVar;
        this.n = ubq0Var;
        this.o = xvf0Var2;
        this.u = sit0Var;
        this.v = z9nVar;
        this.p = y0gVar;
        this.q = b1gVar2;
        this.r = xvf0Var3;
        this.s = z0s0Var;
    }

    public npi(g0g g0gVar, b1g b1gVar, eqh eqhVar, v0g v0gVar, jpn0 jpn0Var, a1g a1gVar, c1g c1gVar, x0g x0gVar, z0g z0gVar, b1g b1gVar2, b1g b1gVar3, a1g a1gVar2, a1g a1gVar3, v0g v0gVar2, g0g g0gVar2, n7i0 n7i0Var, fwc fwcVar, ibz0 ibz0Var, xvf0 xvf0Var, s0g s0gVar, z0g z0gVar2, y0g y0gVar) {
        this.t = g0gVar;
        this.u = b1gVar;
        this.b = eqhVar;
        this.c = v0gVar;
        this.d = jpn0Var;
        this.e = a1gVar;
        this.f = c1gVar;
        this.g = x0gVar;
        this.h = z0gVar;
        this.i = b1gVar2;
        this.j = b1gVar3;
        this.k = a1gVar2;
        this.l = a1gVar3;
        this.m = v0gVar2;
        this.n = g0gVar2;
        this.o = n7i0Var;
        this.p = fwcVar;
        this.q = ibz0Var;
        this.r = xvf0Var;
        this.s = s0gVar;
        this.v = z0gVar2;
        this.w = y0gVar;
    }

    public npi(fyf fyfVar, fyf fyfVar2, n3w n3wVar, n3w n3wVar2, zni0 zni0Var, fyf fyfVar3, xvf0 xvf0Var, fyf fyfVar4, gyf gyfVar, qx5 qx5Var, n3w n3wVar3, gyf gyfVar2, fyf fyfVar5, gyf gyfVar3, fyf fyfVar6, gyf gyfVar4, gyf gyfVar5, fyf fyfVar7, gyf gyfVar6, fyf fyfVar8, fyf fyfVar9, gyf gyfVar7) {
        this.b = fyfVar;
        this.c = fyfVar2;
        this.d = n3wVar;
        this.e = n3wVar2;
        this.f = zni0Var;
        this.g = fyfVar3;
        this.h = xvf0Var;
        this.i = fyfVar4;
        this.j = gyfVar;
        this.k = qx5Var;
        this.w = n3wVar3;
        this.l = gyfVar2;
        this.m = fyfVar5;
        this.n = gyfVar3;
        this.o = fyfVar6;
        this.p = gyfVar4;
        this.q = gyfVar5;
        this.r = fyfVar7;
        this.s = gyfVar6;
        this.t = fyfVar8;
        this.u = fyfVar9;
        this.v = gyfVar7;
    }

    public npi(xvf0 xvf0Var, xvf0 xvf0Var2, g680 g680Var, xvf0 xvf0Var3, xvf0 xvf0Var4, kkt kktVar, n3w n3wVar, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, xvf0 xvf0Var14, xvf0 xvf0Var15, xvf0 xvf0Var16, ge50 ge50Var, ur3 ur3Var, xvf0 xvf0Var17) {
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = g680Var;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = kktVar;
        this.h = n3wVar;
        this.i = xvf0Var5;
        this.j = xvf0Var6;
        this.k = xvf0Var7;
        this.l = xvf0Var8;
        this.m = xvf0Var9;
        this.n = xvf0Var10;
        this.o = xvf0Var11;
        this.p = xvf0Var12;
        this.q = xvf0Var13;
        this.r = xvf0Var14;
        this.s = xvf0Var15;
        this.t = xvf0Var16;
        this.w = ge50Var;
        this.u = ur3Var;
        this.v = xvf0Var17;
    }
}
