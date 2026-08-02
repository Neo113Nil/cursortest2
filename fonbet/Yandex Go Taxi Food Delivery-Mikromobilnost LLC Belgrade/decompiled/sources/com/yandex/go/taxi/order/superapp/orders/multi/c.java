package com.yandex.go.taxi.order.superapp.orders.multi;

import android.content.Context;
import android.util.Size;
import android.view.View;
import com.yandex.go.taxi.order.map_objects.f;
import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import com.yandex.mapkit.ScreenRect;
import defpackage.aet0;
import defpackage.ah00;
import defpackage.an8;
import defpackage.cmm;
import defpackage.f09;
import defpackage.g6y0;
import defpackage.gh00;
import defpackage.h080;
import defpackage.hf2;
import defpackage.i6y0;
import defpackage.jtp0;
import defpackage.jwp0;
import defpackage.ktp0;
import defpackage.lw70;
import defpackage.m09;
import defpackage.mdh;
import defpackage.n080;
import defpackage.o080;
import defpackage.o09;
import defpackage.o2y0;
import defpackage.p080;
import defpackage.p09;
import defpackage.pzt0;
import defpackage.q09;
import defpackage.ro21;
import defpackage.s580;
import defpackage.sjh;
import defpackage.tdt0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tt2;
import defpackage.u08;
import defpackage.uyj;
import defpackage.vdt0;
import defpackage.xm00;
import defpackage.zfm;
import defpackage.zkb1;
import java.util.ArrayList;
import java.util.HashMap;
import kotlinx.coroutines.flow.e;

/* loaded from: classes14.dex */
public final class c implements n080 {
    public final hf2 A;
    public final cmm B;
    public final Context C;
    public final tse D;
    public final tt2 E;
    public final aet0 F;
    public final g6y0 G;
    public final jtp0 H;
    public boolean I;
    public boolean J;
    public jwp0 K;
    public pzt0 L;
    public pzt0 M;
    public pzt0 N;
    public final p080 a;
    public final o2y0 b;
    public final s580 c;
    public final lw70 w;
    public final f x;
    public final zfm y;
    public final f09 z;

    public c(p080 p080Var, o2y0 o2y0Var, s580 s580Var, lw70 lw70Var, f fVar, zfm zfmVar, f09 f09Var, ktp0 ktp0Var, hf2 hf2Var, cmm cmmVar, Context context, tse tseVar, tt2 tt2Var, aet0 aet0Var, g6y0 g6y0Var) {
        this.a = p080Var;
        this.b = o2y0Var;
        this.c = s580Var;
        this.w = lw70Var;
        this.x = fVar;
        this.y = zfmVar;
        this.z = f09Var;
        this.A = hf2Var;
        this.B = cmmVar;
        this.C = context;
        this.D = tseVar;
        this.E = tt2Var;
        this.F = aet0Var;
        this.G = g6y0Var;
        this.H = ktp0Var.a;
    }

    @Override // defpackage.n080
    public final void A0(boolean z) {
        this.a.b.Lg().z0(z);
    }

    @Override // defpackage.n080
    public final void Q(ro21 ro21Var, ro21 ro21Var2) {
        this.a.b.Lg().y0(ro21Var, ro21Var2);
    }

    @Override // defpackage.n080
    public final void a(boolean z) {
        if (this.J) {
            return;
        }
        this.J = true;
        pzt0 pzt0Var = this.L;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.M;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        pzt0 pzt0Var3 = this.N;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
        this.y.getClass();
        o2y0 o2y0Var = this.b;
        DetailOrderOverlay$start$$inlined$safeCollectIn$1 detailOrderOverlay$start$$inlined$safeCollectIn$1 = new DetailOrderOverlay$start$$inlined$safeCollectIn$1(e.s(zfm.a(o2y0Var), new DetailOrderOverlay$start$1(2, this, c.class, "compareDriveStates", "compareDriveStates(Lru/yandex/taxi/object/DriveState;Lru/yandex/taxi/object/DriveState;)Z", 0)), null, this);
        tse tseVar = this.D;
        this.L = tje.N(tseVar, null, null, detailOrderOverlay$start$$inlined$safeCollectIn$1, 3);
        this.M = tje.N(tseVar, null, null, new DetailOrderOverlay$start$$inlined$safeCollectIn$2(e.d(this.F.a), null, this), 3);
        tpr t = e.t(new b(o2y0Var.a()));
        this.E.getClass();
        sjh sjhVar = uyj.a;
        this.N = tje.N(tseVar, null, null, new DetailOrderOverlay$start$$inlined$safeCollectIn$3(e.F(t, mdh.b), null, this), 3);
        this.a.b.attach();
        this.x.attach();
        ((i6y0) this.G).b(zkb1.a(TaxiOrderSessionCheckpoint.OVERLAY));
        if (this.I) {
            e();
        }
    }

    @Override // defpackage.n080
    public final void b() {
        ScreenRect f = f();
        p080 p080Var = this.a;
        p080Var.b.Vg(p080Var.c, f, false, false);
    }

    @Override // defpackage.n080
    public final void c() {
        ScreenRect f = f();
        p080 p080Var = this.a;
        p080Var.b.Vg(p080Var.c, f, true, false);
    }

    @Override // defpackage.n080
    public final void d(boolean z) {
        jwp0 jwp0Var = this.K;
        if (jwp0Var != null) {
            this.z.Hg(jwp0Var);
        }
        this.a.b.Wg();
        f fVar = this.x;
        ((gh00) ((ah00) fVar.b)).u(fVar.A);
        this.A.f(z);
        this.I = false;
    }

    @Override // defpackage.n080
    public final void disableFocusOnPinWhenZooming() {
        ((gh00) this.a.a).L(null);
    }

    public final void e() {
        this.a.b.Ug();
        f fVar = this.x;
        ((gh00) ((ah00) fVar.b)).e(fVar.A);
        jwp0 jwp0Var = this.K;
        if (jwp0Var != null) {
            an8 an8Var = this.z.w;
            an8Var.getClass();
            an8Var.u(new o09(jwp0Var));
        }
        if (this.K != null) {
            this.A.e();
        }
    }

    public final ScreenRect f() {
        int i;
        View view = this.w.a.getView();
        int i2 = 0;
        Size size = view == null ? new Size(0, 0) : new Size(view.getWidth(), view.getHeight());
        s580 s580Var = this.c;
        h080 h080Var = s580Var.c;
        h080 h080Var2 = s580Var.c;
        ScreenRect a = s580Var.a(size, h080Var.f, h080Var.e, h080Var.g);
        f09 f09Var = this.z;
        f09Var.getClass();
        u08 u08Var = new u08(10, f09Var, a);
        q09 q09Var = (q09) f09Var.w.x;
        if ((q09Var instanceof m09) || (q09Var instanceof p09)) {
            f09Var.x = u08Var;
        } else {
            u08Var.invoke();
        }
        vdt0 vdt0Var = (vdt0) e.d(this.F.a).a.getValue();
        if (vdt0Var instanceof tdt0) {
            tdt0 tdt0Var = (tdt0) vdt0Var;
            i2 = tdt0Var.a;
            i = tdt0Var.b;
        } else {
            i = 0;
        }
        if (size.getWidth() == 0 || size.getHeight() == 0) {
            return null;
        }
        o2y0 o2y0Var = this.b;
        return o2y0Var.b().B() ? o2y0Var.b().d() != null ? s580Var.a(size, h080Var2.k, h080Var2.i, h080Var2.d) : s580Var.a(size, h080Var2.h, h080Var2.i, h080Var2.j) : o2y0Var.b().V().j0 != null ? s580Var.a(size, h080Var2.h, h080Var2.i, h080Var2.d) : s580Var.a(size, h080Var2.c + i2, h080Var2.b + i, h080Var2.d + i);
    }

    @Override // defpackage.n080
    public final void resume() {
        if (this.I) {
            return;
        }
        this.I = true;
        e();
    }

    @Override // defpackage.n080
    public final void stop() {
        p080 p080Var = this.a;
        p080Var.b.detach();
        f fVar = this.x;
        xm00 xm00Var = fVar.c;
        HashMap hashMap = fVar.z;
        ru.yandex.taxi.map.utils.a.B(xm00Var, new ArrayList(hashMap.values()));
        hashMap.clear();
        fVar.w.Cg();
        ah00 ah00Var = p080Var.a;
        o080 o080Var = p080Var.c;
        gh00 gh00Var = (gh00) ah00Var;
        if (gh00Var.a.e(o080Var)) {
            gh00Var.r(o080Var);
        }
        jwp0 jwp0Var = this.K;
        if (jwp0Var != null) {
            f09 f09Var = this.z;
            f09Var.Hg(jwp0Var);
            f09Var.Hg(jwp0Var);
            an8 an8Var = f09Var.w;
            an8Var.getClass();
            an8Var.u(new m09(jwp0Var));
            this.K = null;
        }
        pzt0 pzt0Var = this.L;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.M;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        pzt0 pzt0Var3 = this.N;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
        this.J = false;
    }
}
