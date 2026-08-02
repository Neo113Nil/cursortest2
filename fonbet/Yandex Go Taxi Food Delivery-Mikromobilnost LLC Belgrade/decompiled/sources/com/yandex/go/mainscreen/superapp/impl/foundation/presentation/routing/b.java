package com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.address.address_map_picker.api.AddressMapPickerPointType;
import com.yandex.go.flex.main_screen.api.domain.SuperappTopPlaqueType;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.v;
import com.yandex.go.mainscreen.superapp.impl.foundation.domain.j;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.SuperAppMainScreenFlexModalView;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.b;
import com.yandex.go.zone.repository.o;
import defpackage.a2w0;
import defpackage.a6s0;
import defpackage.a850;
import defpackage.ajr;
import defpackage.bae0;
import defpackage.bf4;
import defpackage.bk1;
import defpackage.byx;
import defpackage.c151;
import defpackage.c21;
import defpackage.c2x0;
import defpackage.c430;
import defpackage.cd00;
import defpackage.cyx;
import defpackage.dds;
import defpackage.ezw;
import defpackage.f0w0;
import defpackage.fje;
import defpackage.g1w0;
import defpackage.g2w0;
import defpackage.gep0;
import defpackage.gtq0;
import defpackage.h3y;
import defpackage.h7w0;
import defpackage.hay0;
import defpackage.i3y;
import defpackage.i5m;
import defpackage.ihf;
import defpackage.iir;
import defpackage.jd;
import defpackage.jst;
import defpackage.k42;
import defpackage.l3w0;
import defpackage.l880;
import defpackage.lhw0;
import defpackage.m01;
import defpackage.m950;
import defpackage.mag;
import defpackage.mj10;
import defpackage.ms2;
import defpackage.ney;
import defpackage.nmp;
import defpackage.ny61;
import defpackage.o31;
import defpackage.o4w0;
import defpackage.o900;
import defpackage.p3w0;
import defpackage.pv0;
import defpackage.q1w0;
import defpackage.qa00;
import defpackage.qcw0;
import defpackage.qz1;
import defpackage.r3w0;
import defpackage.rqo;
import defpackage.ry70;
import defpackage.sa00;
import defpackage.sy60;
import defpackage.t9f0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.tyz0;
import defpackage.v2w0;
import defpackage.vc00;
import defpackage.vcu;
import defpackage.vph;
import defpackage.w49;
import defpackage.w66;
import defpackage.xdw0;
import defpackage.xzv0;
import defpackage.y1w0;
import defpackage.y3w0;
import defpackage.ymu;
import defpackage.ysl;
import defpackage.yvf0;
import defpackage.z1w0;
import defpackage.zbw0;
import defpackage.znj;
import defpackage.zww0;
import defpackage.zzs;
import defpackage.zzv0;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.yandex.taxi.analytics.MainScreenVersion;
import ru.yandex.taxi.controller.feature.compat.FeatureStubFragment;
import ru.yandex.taxi.fragment.BaseFragment;
import ru.yandex.taxi.order.l;
import ru.yandex.taxi.search.suggest.i;
import ru.yandex.taxi.ui.FragmentBackground;

/* loaded from: classes.dex */
public final class b extends dds implements ihf, qa00 {
    public final a850 F;
    public final cyx G;
    public final h3y H;
    public final yvf0 I;
    public final k42 J;
    public final a2w0 K;
    public final vc00 L;
    public final yvf0 M;
    public final i N;
    public final com.yandex.go.mainscreen.superapp.impl.fragment.a O;
    public final i3y P;
    public FeatureStubFragment Q;
    public o900 R;

    public b(a850 a850Var, cyx cyxVar, h3y h3yVar, yvf0 yvf0Var, k42 k42Var, a2w0 a2w0Var, q1w0 q1w0Var, vc00 vc00Var, yvf0 yvf0Var2, i iVar, com.yandex.go.mainscreen.superapp.impl.fragment.a aVar) {
        super(null);
        this.F = a850Var;
        this.G = cyxVar;
        this.H = h3yVar;
        this.I = yvf0Var;
        this.J = k42Var;
        this.K = a2w0Var;
        this.L = vc00Var;
        this.M = yvf0Var2;
        this.N = iVar;
        this.O = aVar;
        this.P = kotlin.a.b(LazyThreadSafetyMode.NONE, new SuperAppMainScreenRouterImpl$isSupermapEnabled$2(0, q1w0Var, q1w0.class, "isSupermapEnabledBlocking", "isSupermapEnabledBlocking()Z", 0));
    }

    @Override // defpackage.dds, defpackage.h55
    public final void G(Object obj) {
        super.G((vph) obj);
        this.F.i("superapp_main", true);
        this.G.b(new byx(Screen.MAIN, new c430(Mode.NORMAL, (kotlinx.serialization.json.b) null, 6)));
    }

    @Override // defpackage.dds, defpackage.h55
    public final void H(Object obj) {
        this.L.a();
        super.H((vph) obj);
        FeatureStubFragment featureStubFragment = this.Q;
        if (featureStubFragment == null) {
            return;
        }
        a2w0 a2w0Var = this.K;
        if (a2w0Var.a.b() != Lifecycle.State.DESTROYED) {
            a2w0Var.b = featureStubFragment;
        }
        View view = featureStubFragment.getView();
        SuperAppMainScreenFlexModalView superAppMainScreenFlexModalView = view instanceof SuperAppMainScreenFlexModalView ? (SuperAppMainScreenFlexModalView) view : null;
        this.R = superAppMainScreenFlexModalView != null ? superAppMainScreenFlexModalView.getBottomView() : null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        zzs zzsVar;
        vph vphVar = (vph) obj;
        if (gtq0.u(V())) {
            V().i();
        }
        this.J.a = MainScreenVersion.FLEX;
        boolean booleanValue = ((Boolean) this.P.getValue()).booleanValue();
        c21 c21Var = sy60.Q2;
        if (booleanValue) {
            pv0 pv0Var = (pv0) this.N.i().orElse(null);
            if (pv0Var == null || (zzsVar = pv0Var.a.B()) == null || zzsVar.equals(zzs.f)) {
                zzsVar = null;
            }
            A((m950) this.M.get(), new m01(zzsVar != null ? new ymu(6, zzsVar, Float.valueOf(17.0f)) : null, AddressMapPickerPointType.Source), c21Var);
            z((m950) this.I.get(), c21Var);
        }
        V().f0 = vphVar;
        z(V(), c21Var);
    }

    @Override // defpackage.dds
    public final com.yandex.go.mainscreen.superapp.impl.fragment.a P() {
        return this.O;
    }

    @Override // defpackage.dds
    public final bf4 R(BaseFragment baseFragment) {
        return new bf4() { // from class: u3w0
            @Override // defpackage.bf4
            public final boolean onBackPress() {
                boolean S;
                b bVar = b.this;
                o4w0 V = bVar.V();
                if (vc00.b(V.d0)) {
                    S = true;
                } else {
                    u900 P = V.P();
                    S = P != null ? P.S() : false;
                }
                if (!S) {
                    bVar.r(new qu(9));
                }
                return true;
            }
        };
    }

    @Override // defpackage.dds
    public final BaseFragment T(Object obj) {
        View view;
        a2w0 a2w0Var = this.K;
        FeatureStubFragment featureStubFragment = a2w0Var.b;
        a2w0Var.b = null;
        if (featureStubFragment != null && (view = featureStubFragment.getView()) != null) {
            ru.yandex.taxi.design.utils.c.w(view, view);
        }
        this.Q = featureStubFragment;
        if (featureStubFragment != null) {
            return featureStubFragment;
        }
        nmp nmpVar = FeatureStubFragment.Companion;
        ysl yslVar = new ysl(0, ((Boolean) this.P.getValue()).booleanValue() ? FragmentBackground.MAP : FragmentBackground.BLANK);
        com.yandex.go.navigation.screen.api.Screen screen = com.yandex.go.navigation.screen.api.Screen.MAIN_V4;
        fje fjeVar = new fje() { // from class: com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.a
            @Override // defpackage.fje
            public final View a(Context context) {
                b bVar = b.this;
                o4w0 V = bVar.V();
                o900 o900Var = bVar.R;
                xdw0 xdw0Var = V.e0;
                if (xdw0Var != null) {
                    jst.e.s(new IllegalStateException("SuperappSearchbarRouter reference should be null there"));
                    xdw0Var.i();
                }
                e eVar = new e(V, (xdw0) V.W.get(), V.g0);
                V.g0 = false;
                z1w0 z1w0Var = V.E;
                SuperAppMainScreenViewRouter$initHeaderType$1 superAppMainScreenViewRouter$initHeaderType$1 = new SuperAppMainScreenViewRouter$initHeaderType$1(V, null);
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.a;
                vcu vcuVar = (vcu) tje.Y(emptyCoroutineContext, superAppMainScreenViewRouter$initHeaderType$1);
                SuperappTopPlaqueType superappTopPlaqueType = (SuperappTopPlaqueType) tje.Y(emptyCoroutineContext, new SuperAppMainScreenViewRouter$provideModalViewInstance$1(V, null));
                p3w0 p3w0Var = V.V.a;
                com.yandex.go.mainscreen.superapp.impl.foundation.presentation.e eVar2 = new com.yandex.go.mainscreen.superapp.impl.foundation.presentation.e((ry70) p3w0Var.a.get(), (tt2) p3w0Var.b.get(), (v) p3w0Var.c.get(), (j) p3w0Var.d.get(), (iir) p3w0Var.e.get(), (t9f0) p3w0Var.f.get(), (l3w0) p3w0Var.g.get(), (zzv0) p3w0Var.h.get(), (l) p3w0Var.i.get(), (l880) p3w0Var.j.get(), (c151) p3w0Var.k.get(), (o) p3w0Var.l.get(), (znj) p3w0Var.m.get(), (qcw0) p3w0Var.n.get(), (bk1) p3w0Var.o.get(), (g2w0) p3w0Var.p.get(), (qz1) p3w0Var.q.get(), (h7w0) p3w0Var.r.get(), (com.yandex.go.network.connectivity.a) p3w0Var.s.get(), (ney) p3w0Var.t.get(), (ms2) p3w0Var.u.get(), (y3w0) p3w0Var.v.get(), (r3w0) p3w0Var.w.get(), (ru.yandex.taxi.banners.c) p3w0Var.x.get(), (bae0) p3w0Var.y.get(), (zww0) p3w0Var.z.get(), (jd) p3w0Var.A.get(), (a6s0) p3w0Var.B.get(), (q1w0) p3w0Var.C.get(), (v2w0) p3w0Var.D.get(), (hay0) p3w0Var.E.get(), (com.yandex.go.flex.main_screen.presentation.feed.e) p3w0Var.F.get(), (ru.yandex.taxi.banners.model.h) p3w0Var.G.get(), (com.yandex.go.preload.e) p3w0Var.H.get(), (gep0) p3w0Var.I.get(), (vc00) p3w0Var.J.get(), (com.yandex.go.mainscreen.superapp.impl.foundation.presentation.sidepager.a) p3w0Var.K.get(), (o31) p3w0Var.L.get(), (lhw0) p3w0Var.M.get(), (ezw) p3w0Var.N.get(), (ajr) p3w0Var.O.get(), eVar);
                mag magVar = V.h0;
                if (magVar != null) {
                    y1w0 y1w0Var = z1w0Var.a;
                    return new SuperAppMainScreenFlexModalView((Context) y1w0Var.a.get(), (w66) y1w0Var.b.get(), (zbw0) y1w0Var.c.get(), i5m.a(y1w0Var.d), (w49) y1w0Var.e.get(), (sa00) y1w0Var.f.get(), (xzv0) y1w0Var.g.get(), (g1w0) y1w0Var.h.get(), (tyz0) y1w0Var.i.get(), (zww0) y1w0Var.j.get(), i5m.a(y1w0Var.k), i5m.a(y1w0Var.l), y1w0Var.m, (mj10) y1w0Var.n.get(), (f0w0) y1w0Var.o.get(), (c2x0) y1w0Var.p.get(), (rqo) y1w0Var.q.get(), (cd00) y1w0Var.r.get(), (vc00) y1w0Var.s.get(), (com.yandex.go.mainscreen.superapp.impl.foundation.presentation.sidepager.a) y1w0Var.t.get(), (q1w0) y1w0Var.u.get(), vcuVar, superappTopPlaqueType, eVar2, magVar, o900Var);
                }
                ny61.g("Required value was null.");
                return null;
            }
        };
        nmpVar.getClass();
        FeatureStubFragment a = nmp.a(yslVar, screen, fjeVar);
        this.Q = a;
        return a;
    }

    public final o4w0 V() {
        return (o4w0) this.H.get();
    }

    @Override // defpackage.ihf
    /* renamed from: getTrackedScreen */
    public final com.yandex.go.navigation.screen.api.Screen getScreen() {
        return com.yandex.go.navigation.screen.api.Screen.MAIN_V4;
    }
}
