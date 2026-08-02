package com.yandex.go.taxi.order.search.overlay.ordinary.mvp;

import android.animation.AnimatorSet;
import android.graphics.PointF;
import com.yandex.go.taxi.order.domain.repositories.n;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.search.overlay.ordinary.domain.OrdinarySearchAnalytics$CarInsideCheckType;
import com.yandex.go.taxi.order.search.ui.search.SearchViews;
import com.yandex.go.taxi.order.search.ui.search_views.d;
import com.yandex.go.taxi.order.state.search.SearchState;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import defpackage.a3y0;
import defpackage.ah00;
import defpackage.avj0;
import defpackage.bgc;
import defpackage.et00;
import defpackage.fi6;
import defpackage.gh00;
import defpackage.h080;
import defpackage.hst;
import defpackage.i3y;
import defpackage.ist;
import defpackage.jst;
import defpackage.jzf0;
import defpackage.ke00;
import defpackage.l390;
import defpackage.ly3;
import defpackage.m58;
import defpackage.mqg0;
import defpackage.n58;
import defpackage.oo31;
import defpackage.ow70;
import defpackage.pb30;
import defpackage.pwy0;
import defpackage.pzt0;
import defpackage.r8;
import defpackage.sls;
import defpackage.st0;
import defpackage.svp0;
import defpackage.tje;
import defpackage.tse;
import defpackage.u8w;
import defpackage.ud80;
import defpackage.uh60;
import defpackage.uz8;
import defpackage.v1e0;
import defpackage.vd80;
import defpackage.wd80;
import defpackage.x4e;
import defpackage.xd80;
import defpackage.xm00;
import defpackage.y3u0;
import defpackage.ys0;
import defpackage.yx01;
import defpackage.z1e0;
import defpackage.zuj0;
import defpackage.zzs;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.order.search.ui.bubbles.PollingBubblesViewImpl;
import ru.yandex.taxi.widget.AnimatedCircularHoleFogView;

/* loaded from: classes14.dex */
public final class c extends r8 implements svp0, wd80 {
    public final jzf0 A;
    public final b B;
    public final ow70 C;
    public final y3u0 D;
    public final h080 E;
    public final pwy0 F;
    public final tse G;
    public final a3y0 H;
    public st0 I;
    public ScreenRect J;
    public int K;
    public pzt0 L;
    public final xm00 M;
    public final i3y N;
    public final l390 c;
    public final d w;
    public final et00 x;
    public final uz8 y;
    public final zuj0 z;

    public c(ah00 ah00Var, xm00 xm00Var, l390 l390Var, d dVar, et00 et00Var, uz8 uz8Var, zuj0 zuj0Var, jzf0 jzf0Var, b bVar, ow70 ow70Var, y3u0 y3u0Var, h080 h080Var, pwy0 pwy0Var, tse tseVar) {
        super(5, ah00Var);
        this.c = l390Var;
        this.w = dVar;
        this.x = et00Var;
        this.y = uz8Var;
        this.z = zuj0Var;
        this.A = jzf0Var;
        this.B = bVar;
        this.C = ow70Var;
        this.D = y3u0Var;
        this.E = h080Var;
        this.F = pwy0Var;
        this.G = tseVar;
        this.H = new a3y0(TaxiOrderLogGroup.ORDINARY_SEARCH.getTag(), "OrdinarySearchOverlay");
        this.K = ((avj0) zuj0Var).a(mqg0.component_gray_450);
        this.M = xm00Var.p();
        this.N = kotlin.a.a(new uh60(27, this));
    }

    @Override // defpackage.wd80
    public final void D0(z1e0 z1e0Var) {
        SearchViews I = this.w.I();
        PollingBubblesViewImpl pollingBubblesView = I != null ? I.getPollingBubblesView() : null;
        if (pollingBubblesView != null) {
            ah00 ah00Var = (ah00) this.b;
            int i = this.E.a;
            int i2 = this.K;
            ys0 ys0Var = new ys0(i, this.D, 10);
            uz8 uz8Var = this.y;
            xm00 xm00Var = this.M;
            st0 st0Var = new st0(z1e0Var, xm00Var, ah00Var, pollingBubblesView, ys0Var, new v1e0(ah00Var, pollingBubblesView, uz8Var, xm00Var, ys0Var, i2, this.z));
            Hg(z1e0Var.a.c, OrdinarySearchAnalytics$CarInsideCheckType.POLLING_CANDIDATE);
            this.I = st0Var;
            st0Var.o();
            return;
        }
        a3y0 a3y0Var = this.H;
        String l = a3y0Var.l(new String[]{"startCarPolling"});
        hst hstVar = jst.e;
        String str = a3y0Var.a;
        hstVar.getClass();
        ist m = hstVar.m(l);
        ke00 a = m.b.a();
        if (a == null || !a.b(15)) {
            return;
        }
        a.a(15, str, null, "Polling bubbles view is null", m.a);
    }

    @Override // defpackage.wd80
    public final void E0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m58 m58Var = (m58) it.next();
            n58 n58Var = m58Var.d;
            if (n58Var == null) {
                Point point = m58Var.c;
                xm00 xm00Var = this.M;
                n58Var = new n58(xm00Var.r(point), this.y, m58Var.b, xm00Var);
            }
            n58Var.c(((gh00) ((ah00) this.b)).j());
            m58Var.d = n58Var;
            pb30 pb30Var = n58Var.d;
            Point point2 = pb30Var.x;
            if (point2 != null) {
                Hg(point2, OrdinarySearchAnalytics$CarInsideCheckType.NEAREST_DRIVER);
                n58Var.a(pb30Var);
            }
        }
    }

    public final void Hg(Point point, OrdinarySearchAnalytics$CarInsideCheckType ordinarySearchAnalytics$CarInsideCheckType) {
        ScreenRect c;
        gh00 gh00Var = (gh00) ((ah00) this.b);
        ScreenPoint e = gh00Var.e.e(point);
        if (e == null || (c = gh00Var.a.c()) == null) {
            return;
        }
        boolean q = ru.yandex.taxi.map.utils.a.q(e, c);
        b bVar = this.B;
        ud80 ud80Var = bVar.B;
        SearchState k = ((n) ud80Var.d).k(bVar.x.b().a);
        if (k == null) {
            return;
        }
        ScreenPoint topLeft = c.getTopLeft();
        Pair pair = new Pair(Float.valueOf(topLeft.getX()), Float.valueOf(topLeft.getY()));
        float floatValue = ((Number) pair.getFirst()).floatValue();
        float floatValue2 = ((Number) pair.getSecond()).floatValue();
        ScreenPoint bottomRight = c.getBottomRight();
        Pair pair2 = new Pair(Float.valueOf(bottomRight.getX()), Float.valueOf(bottomRight.getY()));
        float floatValue3 = ((Number) pair2.getFirst()).floatValue();
        float floatValue4 = ((Number) pair2.getSecond()).floatValue();
        String e2 = x4e.e("{", e.getX(), Extension.FIX_SPACE, e.getY(), "}");
        String q2 = ly3.q(oo31.k("tl -> {", floatValue, Extension.FIX_SPACE, floatValue2, "} br -> {"), floatValue3, Extension.FIX_SPACE, floatValue4, "}");
        ud80Var.f.getClass();
        a3y0.h(new String[]{"reportCarIsInsideFocusRect"});
        hst hstVar = jst.e;
        u8w u8wVar = ud80Var.e;
        String Hg = ud80Var.c.b.Hg();
        String str = k.a;
        String str2 = k.b;
        String format = ud80Var.g.format(new Date());
        Boolean valueOf = Boolean.valueOf(q);
        String lowerCase = ordinarySearchAnalytics$CarInsideCheckType.name().toLowerCase(Locale.ROOT);
        u8wVar.getClass();
        HashMap hashMap = new HashMap();
        if (Hg != null) {
            hashMap.put("user_phone_id", Hg);
        }
        if (str != null) {
            hashMap.put("order_id", str);
        }
        if (str2 != null) {
            hashMap.put("tariff_zone", str2);
        }
        if (format != null) {
            hashMap.put(ClidProvider.TIMESTAMP, format);
        }
        hashMap.put("car_point_inside", valueOf);
        hashMap.put("type", lowerCase);
        u8wVar.a.a("SearchAnimation.CarPointIsInsideScreenRect", hashMap, 1, x4e.q(hashMap, "car_screen_point", e2, "screen_focus_rect", q2));
    }

    @Override // defpackage.wd80
    public final void T1(boolean z) {
        this.H.getClass();
        a3y0.h(new String[]{"toggleShadowOverlayVisibility"});
        hst hstVar = jst.e;
        i3y i3yVar = this.N;
        if (z) {
            AnimatedCircularHoleFogView animatedCircularHoleFogView = (AnimatedCircularHoleFogView) i3yVar.getValue();
            if (animatedCircularHoleFogView != null) {
                AnimatedCircularHoleFogView.showStaticFogAnimated$default(animatedCircularHoleFogView, null, 1, null);
                return;
            }
            return;
        }
        AnimatedCircularHoleFogView animatedCircularHoleFogView2 = (AnimatedCircularHoleFogView) i3yVar.getValue();
        if (animatedCircularHoleFogView2 != null) {
            animatedCircularHoleFogView2.hideStaticFogAnimated();
        }
    }

    @Override // defpackage.svp0
    public final void attach() {
        this.B.Bg(this);
    }

    @Override // defpackage.svp0
    public final void b9(ScreenRect screenRect) {
        if (screenRect == null) {
            return;
        }
        this.J = screenRect;
        this.A.getClass();
        PointF a = jzf0.a(screenRect);
        SearchViews I = this.w.I();
        if (I != null) {
            I.setPulsingCirclesViewAnchor(a);
        }
        ((gh00) ((ah00) this.b)).y(this.c, screenRect);
        st0 st0Var = this.I;
        if (st0Var != null) {
            st0Var.n();
        }
    }

    @Override // defpackage.svp0
    public final void detach() {
        SearchViews I;
        st0 st0Var = this.I;
        if (st0Var != null) {
            st0Var.p(new bgc(12));
        }
        xm00 xm00Var = this.M;
        xm00Var.m();
        xm00Var.d();
        d dVar = this.w;
        SearchViews I2 = dVar.I();
        if (I2 != null) {
            I2.hidePollingBubblesView();
        }
        b bVar = this.B;
        bVar.Cg();
        AnimatedCircularHoleFogView animatedCircularHoleFogView = (AnimatedCircularHoleFogView) this.N.getValue();
        if (animatedCircularHoleFogView != null) {
            animatedCircularHoleFogView.hideStaticFogAnimated();
        }
        if (((Boolean) bVar.A.k.a.getValue()).booleanValue() || (I = dVar.I()) == null) {
            return;
        }
        I.hideLongSearch();
    }

    @Override // defpackage.wd80
    public final void j0(m58 m58Var) {
        n58 n58Var = m58Var.d;
        if (n58Var != null) {
            n58Var.b();
        }
        if (n58Var != null) {
            m58Var.d = null;
        }
    }

    @Override // defpackage.wd80
    public final void p(sls slsVar) {
        this.H.getClass();
        a3y0.h(new String[]{"stopCarPolling"});
        hst hstVar = jst.e;
        st0 st0Var = this.I;
        if (st0Var != null) {
            st0Var.p(slsVar);
        }
        this.I = null;
    }

    @Override // defpackage.wd80
    public final void p2(List list, zzs zzsVar, vd80 vd80Var) {
        fi6 fi6Var = new fi6();
        fi6Var.e(list);
        BoundingBox h = fi6Var.h(ru.yandex.taxi.map.utils.a.F(zzsVar));
        gh00 gh00Var = (gh00) ((ah00) this.b);
        gh00Var.g.g(h, vd80Var, 400.0f, null);
        Iterator it = this.B.E.iterator();
        while (it.hasNext()) {
            n58 n58Var = ((m58) it.next()).d;
            if (n58Var != null) {
                n58Var.c(gh00Var.j());
            }
        }
    }

    @Override // defpackage.svp0
    public final yx01 p6() {
        return new xd80(this, 1);
    }

    @Override // defpackage.svp0
    public final void pause() {
        pzt0 pzt0Var = this.L;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.L = null;
        st0 st0Var = this.I;
        if (st0Var != null) {
            AnimatorSet animatorSet = (AnimatorSet) st0Var.C;
            if (animatorSet != null && animatorSet.isRunning()) {
                animatorSet.pause();
            }
            AnimatorSet animatorSet2 = (AnimatorSet) st0Var.D;
            if (animatorSet2 != null && animatorSet2.isRunning()) {
                animatorSet2.pause();
            }
        }
        this.B.pause();
    }

    @Override // defpackage.svp0
    public final void resume() {
        pzt0 pzt0Var = this.L;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.L = null;
        this.L = tje.N(this.G, null, null, new OrdinarySearchOverlay$collectThemeType$1(this, null), 3);
        b9(this.J);
        zzs Mg = this.B.Mg();
        Point point = new Point(Mg.a, Mg.b);
        Point target = ((gh00) ((ah00) this.b)).e.c.getTarget();
        if (target.getLatitude() != point.getLatitude() && target.getLongitude() != point.getLongitude()) {
            ((gh00) ((ah00) this.b)).D(point, 17.0f, 0.0f, null);
        }
        this.B.resume();
        st0 st0Var = this.I;
        if (st0Var != null) {
            AnimatorSet animatorSet = (AnimatorSet) st0Var.C;
            if (animatorSet != null && animatorSet.isPaused()) {
                animatorSet.resume();
            }
            AnimatorSet animatorSet2 = (AnimatorSet) st0Var.D;
            if (animatorSet2 != null && animatorSet2.isPaused()) {
                animatorSet2.resume();
            }
        }
        this.x.c();
        this.M.k(1.0f);
    }

    @Override // defpackage.svp0
    public final yx01 s5() {
        return new xd80(this, 0);
    }
}
