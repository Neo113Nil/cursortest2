package com.yandex.go.taxi.intercity.dashboard.impl.presentation.routing;

import android.content.Context;
import com.yandex.go.due.api.analytics.model.DueAnalyticDisplayContext;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.i0;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.dashboard.IntercityDashboardResponseDto;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.h;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.j;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.l;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.IntercityDashboardModalView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.g;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.repository.o;
import defpackage.a60;
import defpackage.a8v0;
import defpackage.abw;
import defpackage.bjw;
import defpackage.bom0;
import defpackage.clw;
import defpackage.com0;
import defpackage.d0l0;
import defpackage.e1n;
import defpackage.ea0;
import defpackage.ej1;
import defpackage.ekw;
import defpackage.eom0;
import defpackage.fbw;
import defpackage.fif;
import defpackage.fkw;
import defpackage.fom0;
import defpackage.fx60;
import defpackage.g18;
import defpackage.gfw;
import defpackage.ghw;
import defpackage.glw;
import defpackage.h3y;
import defpackage.hhw;
import defpackage.hjw;
import defpackage.hz91;
import defpackage.hzk;
import defpackage.ifw;
import defpackage.ip11;
import defpackage.izm;
import defpackage.jkw;
import defpackage.jl40;
import defpackage.jlw;
import defpackage.klw;
import defpackage.kpi0;
import defpackage.lfw;
import defpackage.lxm;
import defpackage.m9w;
import defpackage.miw;
import defpackage.mp60;
import defpackage.mqu;
import defpackage.mxm;
import defpackage.nfw;
import defpackage.nlw;
import defpackage.o1n;
import defpackage.olw;
import defpackage.oow;
import defpackage.ozm;
import defpackage.paq0;
import defpackage.pav;
import defpackage.pex0;
import defpackage.pwy0;
import defpackage.pxm;
import defpackage.py91;
import defpackage.pzm;
import defpackage.qiw;
import defpackage.qjw;
import defpackage.r1n;
import defpackage.r9w;
import defpackage.rhw;
import defpackage.sfw;
import defpackage.tje;
import defpackage.tt2;
import defpackage.udw;
import defpackage.ufw;
import defpackage.uxm;
import defpackage.v770;
import defpackage.v9w;
import defpackage.vxm;
import defpackage.w030;
import defpackage.w511;
import defpackage.w7u;
import defpackage.w9w;
import defpackage.wfw;
import defpackage.wiq0;
import defpackage.xjw;
import defpackage.xvf0;
import defpackage.y50;
import defpackage.ybw;
import defpackage.yjw;
import defpackage.yvf0;
import defpackage.z8w;
import defpackage.ziw;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes14.dex */
public final class e extends com.yandex.go.navigation.modals.coroutines.a {
    public final w030 F;
    public final r1n G;
    public final uxm H;
    public final xjw I;
    public final yjw J;
    public final udw K;
    public final yvf0 L;
    public final yvf0 M;
    public final yvf0 N;
    public final gfw O;
    public final ghw P;
    public final tt2 Q;
    public final com.yandex.go.navigation.screen.c R;
    public final wiq0 S;
    public final kpi0 T;
    public final o U;
    public final h3y V;
    public final h3y W;
    public final h3y Z;
    public final ifw a0;
    public final yvf0 b0;
    public final yvf0 c0;
    public final ea0 d0;
    public g e0;
    public com.yandex.go.taxi.intercity.dashboard.impl.dialog.bullets.routing.a f0;
    public final olw g0;

    public e(w030 w030Var, r1n r1nVar, uxm uxmVar, xjw xjwVar, yjw yjwVar, udw udwVar, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, gfw gfwVar, ghw ghwVar, tt2 tt2Var, com.yandex.go.navigation.screen.c cVar, wiq0 wiq0Var, kpi0 kpi0Var, o oVar, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, ifw ifwVar, yvf0 yvf0Var4, yvf0 yvf0Var5, ea0 ea0Var) {
        super(null);
        this.F = w030Var;
        this.G = r1nVar;
        this.H = uxmVar;
        this.I = xjwVar;
        this.J = yjwVar;
        this.K = udwVar;
        this.L = yvf0Var;
        this.M = yvf0Var2;
        this.N = yvf0Var3;
        this.O = gfwVar;
        this.P = ghwVar;
        this.Q = tt2Var;
        this.R = cVar;
        this.S = wiq0Var;
        this.T = kpi0Var;
        this.U = oVar;
        this.V = h3yVar;
        this.W = h3yVar2;
        this.Z = h3yVar3;
        this.a0 = ifwVar;
        this.b0 = yvf0Var4;
        this.c0 = yvf0Var5;
        this.d0 = ea0Var;
        this.g0 = new olw(w030Var);
    }

    public static final void T(e eVar, lfw lfwVar, fom0 fom0Var) {
        hz91 hz91Var;
        py91 py91Var;
        h3y h3yVar = eVar.Z;
        if (jl40.l(fom0Var, com0.a)) {
            if (lfwVar != null) {
                py91Var = new mxm(lfwVar.a);
            } else {
                if (lfwVar != null) {
                    w511.b();
                    return;
                }
                py91Var = lxm.a;
            }
            ((fx60) h3yVar.get()).a(Events$Zalogin$LoginContext.INTERCITY_DASHBOARD, new mqu(12, eVar, new vxm(DueAnalyticDisplayContext.DASHBOARD.getValue(), pxm.a, py91Var)));
            return;
        }
        if (fom0Var == null) {
            pex0 m = ((k) eVar.S).m();
            fom0Var = m != null ? m.D0 : null;
        }
        if (fom0Var instanceof bom0) {
            ((a60) ((y50) eVar.V.get())).c(((bom0) fom0Var).a, new v770(DueAnalyticDisplayContext.DASHBOARD.getValue()));
            return;
        }
        izm izmVar = new izm(jl40.l(fom0Var, eom0.a));
        if (lfwVar != null) {
            hz91Var = new pzm(lfwVar.a);
        } else {
            if (lfwVar != null) {
                w511.b();
                return;
            }
            hz91Var = ozm.c;
        }
        ((fx60) h3yVar.get()).a(Events$Zalogin$LoginContext.INTERCITY_DASHBOARD, new mqu(10, eVar, new o1n(DueAnalyticDisplayContext.DASHBOARD.getValue(), e1n.a, hz91Var, izmVar)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (r8 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        r8 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c0, code lost:
    
        if (r4 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c2, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f3, code lost:
    
        if (r4 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00a8, code lost:
    
        if (r8 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void U(e eVar, PointType pointType) {
        Object obj;
        IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity intercityDashboardSectionDto$AddressSelectorSectionDtoIntercity;
        String str;
        String str2;
        Object obj2;
        ziw ziwVar;
        String str3;
        Object obj3;
        ziw ziwVar2;
        String str4;
        String b = eVar.a0.b();
        z8w z8wVar = (z8w) eVar.b0.get();
        yjw yjwVar = eVar.J;
        d0l0 d0l0Var = (d0l0) z8wVar.c.getValue();
        klw klwVar = yjwVar.b;
        IntercityDashboardResponseDto intercityDashboardResponseDto = yjwVar.a.a().c;
        if (intercityDashboardResponseDto == null) {
            intercityDashboardSectionDto$AddressSelectorSectionDtoIntercity = null;
        } else {
            Iterator it = intercityDashboardResponseDto.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((i0) obj) instanceof IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity) {
                        break;
                    }
                }
            }
            if (!(obj instanceof IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity)) {
                obj = null;
            }
            intercityDashboardSectionDto$AddressSelectorSectionDtoIntercity = (IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity) obj;
        }
        IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity.Placeholders placeholders = intercityDashboardSectionDto$AddressSelectorSectionDtoIntercity != null ? intercityDashboardSectionDto$AddressSelectorSectionDtoIntercity.b : null;
        IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity.PlaceholderPoint placeholderPoint = placeholders != null ? placeholders.a : null;
        IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity.PlaceholderPoint placeholderPoint2 = placeholders != null ? placeholders.b : null;
        int i = 0;
        if (d0l0Var.h() == null) {
            str = placeholderPoint != null ? placeholderPoint.b : null;
            jlw a = klwVar.a();
            if (a instanceof glw) {
                mp60 mp60Var = ((glw) a).c;
                Object[] objArr = mp60Var.a;
                int i2 = mp60Var.b;
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        obj3 = null;
                        break;
                    }
                    obj3 = objArr[i3];
                    if (((hjw) obj3) instanceof bjw) {
                        break;
                    } else {
                        i3++;
                    }
                }
                bjw bjwVar = obj3 instanceof bjw ? (bjw) obj3 : null;
                if (bjwVar != null && (ziwVar2 = bjwVar.b.a) != null && (str4 = ziwVar2.b) != null) {
                    str = str4;
                }
            }
        } else {
            str = null;
        }
        if (d0l0Var.b() == null) {
            str2 = placeholderPoint2 != null ? placeholderPoint2.b : null;
            jlw a2 = klwVar.a();
            if (a2 instanceof glw) {
                mp60 mp60Var2 = ((glw) a2).c;
                Object[] objArr2 = mp60Var2.a;
                int i4 = mp60Var2.b;
                while (true) {
                    if (i >= i4) {
                        obj2 = null;
                        break;
                    }
                    obj2 = objArr2[i];
                    if (((hjw) obj2) instanceof bjw) {
                        break;
                    } else {
                        i++;
                    }
                }
                bjw bjwVar2 = obj2 instanceof bjw ? (bjw) obj2 : null;
                if (bjwVar2 != null && (ziwVar = bjwVar2.b.b) != null && (str3 = ziwVar.b) != null) {
                    str2 = str3;
                }
            }
        } else {
            str2 = null;
        }
        String str5 = placeholderPoint != null ? placeholderPoint.a : null;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = placeholderPoint2 != null ? placeholderPoint2.a : null;
        a8v0 a8v0Var = new a8v0(b, pointType, str, str5, str2, str6 == null ? "" : str6);
        hzk hzkVar = eVar.I.a;
        eVar.A(new ej1(z8wVar, (w030) ((xvf0) hzkVar.a).get(), (m9w) ((w7u) hzkVar.b).get(), 11), a8v0Var, new sfw(eVar, z8wVar));
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        olw olwVar = this.g0;
        g18 g18Var = olwVar.c;
        if (g18Var != null) {
            g18Var.cancel();
        }
        olwVar.c = null;
        olwVar.b.clear();
        com.yandex.go.navigation.screen.c cVar = this.R;
        Screen b = cVar.b();
        if (b == Screen.INTERCITY_DASHBOARD) {
            b = cVar.d();
        }
        cVar.i(b);
        this.f0 = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        olw olwVar = this.g0;
        olwVar.c = olwVar.a.g(new nlw(0, olwVar));
        tje.N(o(), null, null, new IntercityDashboardModalViewRouter$onLaunch$1(this, null), 3);
        tje.N(o(), null, null, new IntercityDashboardModalViewRouter$onLaunch$2(this, null), 3);
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return false;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        nfw nfwVar = new nfw(this);
        hhw hhwVar = this.P.a;
        g gVar = new g(nfwVar, (tt2) ((xvf0) hhwVar.a).get(), (com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.f) ((xvf0) hhwVar.b).get(), (klw) ((xvf0) hhwVar.c).get(), (v9w) ((xvf0) hhwVar.d).get(), (ifw) ((xvf0) hhwVar.e).get(), (fif) ((xvf0) hhwVar.f).get(), (miw) ((xvf0) hhwVar.g).get(), (j) ((xvf0) hhwVar.h).get(), (l) ((xvf0) hhwVar.i).get(), (h) ((xvf0) hhwVar.j).get(), (com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.a) ((xvf0) hhwVar.k).get(), (com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.a) ((xvf0) hhwVar.l).get(), (ekw) ((xvf0) hhwVar.m).get(), (oow) ((xvf0) hhwVar.n).get(), (ybw) ((xvf0) hhwVar.o).get(), (paq0) ((xvf0) hhwVar.p).get(), (fkw) ((xvf0) hhwVar.q).get(), (com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.k) ((xvf0) hhwVar.r).get(), (w9w) ((xvf0) hhwVar.s).get());
        this.e0 = gVar;
        wfw wfwVar = this.O.a;
        return new IntercityDashboardModalView((Context) wfwVar.a.get(), gVar, (ufw) wfwVar.b.get(), (pav) wfwVar.c.get(), (ip11) wfwVar.d.get(), (ru.yandex.taxi.design.utils.b) wfwVar.e.get(), (pwy0) wfwVar.f.get(), (qjw) wfwVar.g.get(), (r9w) wfwVar.h.get(), (clw) wfwVar.i.get(), (abw) wfwVar.j.get(), (jkw) wfwVar.k.get(), (rhw) wfwVar.l.get(), (qiw) wfwVar.m.get(), (fbw) wfwVar.n.a);
    }
}
