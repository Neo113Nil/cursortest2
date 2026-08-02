package defpackage;

import com.yandex.go.route.interactor.b;
import com.yandex.go.summary.interactor.expanded.action.c;
import com.yandex.go.summary.interactor.expanded.action.d;
import com.yandex.go.taxi.summary.mobilityhub.interactor.z;
import com.yandex.go.taxi.tariffs.repository.g;
import com.yandex.go.walking.navigation.impl.ui.overlay.e;
import com.yandex.passport.internal.ui.bouncer.model.middleware.c1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.d0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.i0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.j;
import com.yandex.passport.internal.ui.bouncer.model.middleware.l1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.n;
import com.yandex.passport.internal.ui.bouncer.model.middleware.p1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.w;
import com.yandex.passport.internal.ui.bouncer.model.middleware.w0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.z0;
import ru.yandex.taxi.preorder.summary.tariffpage.requirements.a;
import ru.yandex.taxi.requirements.interactor.e0;
import ru.yandex.taxi.summary.requirements.list.interactors.k0;
import ru.yandex.taxi.summary.ui.SummaryStateTracker;

/* loaded from: classes14.dex */
public final class kdv0 implements v7p {
    public final /* synthetic */ int a = 5;
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

    public kdv0(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7, yvf0 yvf0Var8, yvf0 yvf0Var9, yvf0 yvf0Var10, xvf0 xvf0Var) {
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
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        yvf0 yvf0Var = this.l;
        yvf0 yvf0Var2 = this.k;
        yvf0 yvf0Var3 = this.j;
        yvf0 yvf0Var4 = this.i;
        yvf0 yvf0Var5 = this.h;
        yvf0 yvf0Var6 = this.g;
        yvf0 yvf0Var7 = this.f;
        yvf0 yvf0Var8 = this.e;
        yvf0 yvf0Var9 = this.d;
        yvf0 yvf0Var10 = this.c;
        switch (i) {
            case 0:
                return new jdv0((ghd) xvf0Var.get(), (biv0) ((b1g) yvf0Var2).get(), (sev0) ((xvf0) yvf0Var10).get(), (ldv0) ((xvf0) yvf0Var9).get(), (wiq0) ((w0g) yvf0Var).get(), (mo40) ((xvf0) yvf0Var8).get(), (o0m0) ((xvf0) yvf0Var7).get(), (fco) ((xvf0) yvf0Var6).get(), (fwu0) ((xvf0) yvf0Var5).get(), (SummaryStateTracker) ((xvf0) yvf0Var4).get(), (tt2) ((xvf0) yvf0Var3).get());
            case 1:
                return new a((sgt0) xvf0Var.get(), (coj0) ((xvf0) yvf0Var10).get(), (ojj0) ((xvf0) yvf0Var9).get(), (w030) ((xvf0) yvf0Var8).get(), (iqj0) ((xvf0) yvf0Var7).get(), (s0g) yvf0Var2, (z880) ((xvf0) yvf0Var6).get(), (xvf0) yvf0Var5, (vqv0) ((xvf0) yvf0Var4).get(), (tse) ((y0g) yvf0Var).get(), (oep0) ((xvf0) yvf0Var3).get());
            case 2:
                return new d((ftz0) xvf0Var.get(), (gdu) ((xvf0) yvf0Var10).get(), (com.yandex.go.summary.interactor.common.action.a) ((xvf0) yvf0Var9).get(), (c) ((xvf0) yvf0Var8).get(), (rn40) ((xvf0) yvf0Var7).get(), (lb5) ((xvf0) yvf0Var6).get(), (pev0) ((xvf0) yvf0Var5).get(), (dcx0) ((xvf0) yvf0Var4).get(), (v920) ((gx8) yvf0Var2).get(), (cux) ((xvf0) yvf0Var3).get(), (c0h) ((ivo0) yvf0Var).get());
            case 3:
                return new bgz0((tse) xvf0Var.get(), (dm21) ((xvf0) yvf0Var10).get(), (o2y0) ((xvf0) yvf0Var9).get(), (wze0) ((xvf0) yvf0Var8).get(), (tgz0) ((xvf0) yvf0Var7).get(), (orq) ((xvf0) yvf0Var6).get(), (xdf) ((xvf0) yvf0Var5).get(), (ufz0) ((xvf0) yvf0Var4).get(), (xvf0) yvf0Var3, (uio0) ((z7y0) yvf0Var2).get(), (oep0) ((xvf0) yvf0Var).get());
            case 4:
                return new qw11((ck31) xvf0Var.get(), (sk7) ((by8) yvf0Var6).get(), (wiq0) ((w0g) yvf0Var).get(), (vfx0) ((xvf0) yvf0Var10).get(), (e0) ((xvf0) yvf0Var9).get(), (bpj0) ((hs30) yvf0Var5).get(), (cjj0) ((xvf0) yvf0Var8).get(), (g) ((w0g) yvf0Var4).get(), (k0) ((ut) yvf0Var3).get(), (hqj0) ((xvf0) yvf0Var7).get(), (unj0) ((vnj0) yvf0Var2).get());
            case 5:
                return new z((String) xvf0Var.get(), (tt2) ((xvf0) yvf0Var10).get(), (o7r0) ((qcz0) yvf0Var4).get(), (cyu) ((xvf0) yvf0Var9).get(), (qbl0) ((xvf0) yvf0Var8).get(), (b) ((l3g) yvf0Var3).get(), (uze0) ((xvf0) yvf0Var7).get(), (hpi0) ((xvf0) yvf0Var6).get(), (com.yandex.go.taxi.summary.mobilityhub.repository.a) ((gpx0) yvf0Var2).get(), (a201) ((ibz0) yvf0Var).get(), (com.yandex.go.taxi.summary.mobilityhub.experiment.g) ((xvf0) yvf0Var5).get());
            case 6:
                return new e((ney) xvf0Var.get(), (tt2) ((jcg) yvf0Var8).get(), (zuj0) ((pcg) yvf0Var7).get(), (pwy0) ((pcg) yvf0Var6).get(), (com.yandex.go.pin.api.widget.b) ((pcg) yvf0Var5).get(), (a341) ((ocg) yvf0Var4).get(), i5m.a((ocg) yvf0Var3), i5m.a((ocg) yvf0Var2), i5m.a((xvf0) yvf0Var10), i5m.a((jcg) yvf0Var), (g241) ((xvf0) yvf0Var9).get());
            default:
                return new com.yandex.passport.internal.ui.bouncer.model.middleware.b((d0) yvf0Var10.get(), (l1) yvf0Var9.get(), (w0) yvf0Var8.get(), (c1) yvf0Var7.get(), (p1) yvf0Var6.get(), (i0) yvf0Var5.get(), (j) yvf0Var4.get(), (com.yandex.passport.internal.ui.bouncer.model.middleware.e) yvf0Var3.get(), (z0) yvf0Var2.get(), (w) yvf0Var.get(), (n) xvf0Var.get());
        }
    }

    public kdv0(qcz0 qcz0Var, wvq wvqVar, qx4 qx4Var, fmn fmnVar, oe3 oe3Var, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, gx8 gx8Var, xvf0 xvf0Var4, ivo0 ivo0Var) {
        this.b = qcz0Var;
        this.c = wvqVar;
        this.d = qx4Var;
        this.e = fmnVar;
        this.f = oe3Var;
        this.g = xvf0Var;
        this.h = xvf0Var2;
        this.i = xvf0Var3;
        this.k = gx8Var;
        this.j = xvf0Var4;
        this.l = ivo0Var;
    }

    public kdv0(xvf0 xvf0Var, xvf0 xvf0Var2, lq40 lq40Var, xvf0 xvf0Var3, dqx0 dqx0Var, prq prqVar, xvf0 xvf0Var4, y0y0 y0y0Var, y0y0 y0y0Var2, z7y0 z7y0Var, eqh eqhVar) {
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = lq40Var;
        this.e = xvf0Var3;
        this.f = dqx0Var;
        this.g = prqVar;
        this.h = xvf0Var4;
        this.i = y0y0Var;
        this.j = y0y0Var2;
        this.k = z7y0Var;
        this.l = eqhVar;
    }

    public kdv0(n3w n3wVar, h3g h3gVar, qcz0 qcz0Var, h3g h3gVar2, l3g l3gVar, l3g l3gVar2, l3g l3gVar3, xvf0 xvf0Var, gpx0 gpx0Var, ibz0 ibz0Var, y1u y1uVar) {
        this.b = n3wVar;
        this.c = h3gVar;
        this.i = qcz0Var;
        this.d = h3gVar2;
        this.e = l3gVar;
        this.j = l3gVar2;
        this.f = l3gVar3;
        this.g = xvf0Var;
        this.k = gpx0Var;
        this.l = ibz0Var;
        this.h = y1uVar;
    }

    public kdv0(peb pebVar, b1g b1gVar, xvf0 xvf0Var, xvf0 xvf0Var2, w0g w0gVar, v0g v0gVar, a1g a1gVar, s0g s0gVar, nwf nwfVar, xvf0 xvf0Var3, t0g t0gVar) {
        this.b = pebVar;
        this.k = b1gVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.l = w0gVar;
        this.e = v0gVar;
        this.f = a1gVar;
        this.g = s0gVar;
        this.h = nwfVar;
        this.i = xvf0Var3;
        this.j = t0gVar;
    }

    public kdv0(y0g y0gVar, by8 by8Var, w0g w0gVar, xvf0 xvf0Var, sb1 sb1Var, hs30 hs30Var, z0g z0gVar, w0g w0gVar2, ut utVar, a1g a1gVar, vnj0 vnj0Var) {
        this.b = y0gVar;
        this.g = by8Var;
        this.l = w0gVar;
        this.c = xvf0Var;
        this.d = sb1Var;
        this.h = hs30Var;
        this.e = z0gVar;
        this.i = w0gVar2;
        this.j = utVar;
        this.f = a1gVar;
        this.k = vnj0Var;
    }

    public kdv0(pcg pcgVar, jcg jcgVar, pcg pcgVar2, pcg pcgVar3, pcg pcgVar4, ocg ocgVar, ocg ocgVar2, ocg ocgVar3, pcg pcgVar5, jcg jcgVar2, xvf0 xvf0Var) {
        this.b = pcgVar;
        this.e = jcgVar;
        this.f = pcgVar2;
        this.g = pcgVar3;
        this.h = pcgVar4;
        this.i = ocgVar;
        this.j = ocgVar2;
        this.k = ocgVar3;
        this.c = pcgVar5;
        this.l = jcgVar2;
        this.d = xvf0Var;
    }

    public kdv0(v0g v0gVar, jzi0 jzi0Var, xvf0 xvf0Var, x0g x0gVar, xvf0 xvf0Var2, s0g s0gVar, eqh eqhVar, y501 y501Var, xvf0 xvf0Var3, y0g y0gVar, a1g a1gVar) {
        this.b = v0gVar;
        this.c = jzi0Var;
        this.d = xvf0Var;
        this.e = x0gVar;
        this.f = xvf0Var2;
        this.k = s0gVar;
        this.g = eqhVar;
        this.h = y501Var;
        this.i = xvf0Var3;
        this.l = y0gVar;
        this.j = a1gVar;
    }
}
