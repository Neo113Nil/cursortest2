package com.yandex.plus.home.feature.webviews.internal.stories;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import defpackage.al41;
import defpackage.bbd0;
import defpackage.bl41;
import defpackage.bvf0;
import defpackage.bzd0;
import defpackage.dc20;
import defpackage.f27;
import defpackage.fl41;
import defpackage.gov;
import defpackage.gsd0;
import defpackage.gym;
import defpackage.h27;
import defpackage.hov;
import defpackage.hsd0;
import defpackage.i3y;
import defpackage.ijd0;
import defpackage.imd0;
import defpackage.iz4;
import defpackage.jse;
import defpackage.kio;
import defpackage.nsu;
import defpackage.p3d0;
import defpackage.p4z;
import defpackage.pt80;
import defpackage.pzt0;
import defpackage.qio;
import defpackage.skd0;
import defpackage.sls;
import defpackage.so41;
import defpackage.szg;
import defpackage.tpp0;
import defpackage.uio;
import defpackage.ul60;
import defpackage.uu60;
import defpackage.v920;
import defpackage.vio;
import defpackage.w350;
import defpackage.wio;
import defpackage.xk41;
import defpackage.y4a0;
import defpackage.y821;
import defpackage.z17;
import defpackage.zk41;
import java.util.Arrays;
import java.util.Map;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class e extends iz4 implements p3d0, so41, w350 {
    public final ijd0 A;
    public final tpp0 B;
    public final sls C;
    public final sls D;
    public final boolean E;
    public final String F;
    public final y821 G;
    public final com.yandex.plus.home.api.prefetch.a H;
    public final z17 I;
    public final hov J;
    public final v920 K;
    public final com.yandex.plus.home.feature.webviews.internal.container.b L;
    public final uu60 M;
    public final bzd0 N;
    public final ul60 O;
    public pzt0 P;
    public final gsd0 Q;
    public final i3y R;
    public final r0 S;
    public pzt0 T;
    public final i3y U;
    public final d V;
    public final i3y W;
    public final i3y X;
    public boolean Y;
    public boolean Z;
    public final bl41 a0;
    public final szg f;
    public final fl41 g;
    public final jse h;
    public final jse i;
    public final jse j;
    public final com.yandex.plus.home.feature.webviews.internalapi.bridge.a k;
    public final p4z l;
    public final com.yandex.plus.home.feature.webviews.internal.settings.domain.b m;
    public final imd0 n;
    public final wio o;
    public final vio p;
    public final dc20 q;
    public final sls r;
    public final y4a0 s;
    public final com.yandex.plus.home.feature.webviews.internal.d t;
    public final com.yandex.plus.home.feature.webviews.internal.c u;
    public final gym v;
    public final uio w;
    public final String x;
    public final Map y;
    public final qio z;

    public e(szg szgVar, fl41 fl41Var, jse jseVar, jse jseVar2, jse jseVar3, com.yandex.plus.home.feature.webviews.internalapi.bridge.a aVar, p4z p4zVar, com.yandex.plus.home.feature.webviews.internal.settings.domain.b bVar, imd0 imd0Var, wio wioVar, vio vioVar, kio kioVar, dc20 dc20Var, sls slsVar, com.yandex.plus.home.auth.b bVar2, y4a0 y4a0Var, com.yandex.plus.home.feature.webviews.internal.d dVar, com.yandex.plus.home.feature.webviews.internal.c cVar, gym gymVar, hsd0 hsd0Var, uio uioVar, String str, Map map, qio qioVar, ijd0 ijd0Var, tpp0 tpp0Var, sls slsVar2, sls slsVar3, boolean z, boolean z2, String str2, y821 y821Var, com.yandex.plus.home.api.prefetch.a aVar2, z17 z17Var, hov hovVar, v920 v920Var, com.yandex.plus.home.feature.webviews.internal.container.b bVar3, uu60 uu60Var, bzd0 bzd0Var, ul60 ul60Var) {
        super(jseVar, new al41());
        this.f = szgVar;
        this.g = fl41Var;
        this.h = jseVar;
        this.i = jseVar2;
        this.j = jseVar3;
        this.k = aVar;
        this.l = p4zVar;
        this.m = bVar;
        this.n = imd0Var;
        this.o = wioVar;
        this.p = vioVar;
        this.q = dc20Var;
        this.r = slsVar;
        this.s = y4a0Var;
        this.t = dVar;
        this.u = cVar;
        this.v = gymVar;
        this.w = uioVar;
        this.x = str;
        this.y = map;
        this.z = qioVar;
        this.A = ijd0Var;
        this.B = tpp0Var;
        this.C = slsVar2;
        this.D = slsVar3;
        this.E = z;
        this.F = str2;
        this.G = y821Var;
        this.H = aVar2;
        this.I = z17Var;
        this.J = hovVar;
        this.K = v920Var;
        this.L = bVar3;
        this.M = uu60Var;
        this.N = bzd0Var;
        this.O = ul60Var;
        this.Q = new gsd0();
        int i = 0;
        this.R = kotlin.a.a(new zk41(this, i));
        this.S = bvf0.c(Boolean.FALSE);
        this.U = kotlin.a.a(new a(this, i));
        this.V = new d(this, szgVar.a.toString(), bVar2, kioVar, bVar3, v920Var, z2, jseVar);
        this.W = kotlin.a.a(new a(this, 1));
        this.X = kotlin.a.a(new a(this, 2));
        this.a0 = new bl41(this, hsd0Var);
        skd0.e(PlusLogTag.UI, "init() bundle=" + fl41Var);
    }

    @Override // defpackage.w350
    public final void a() {
        com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f k = k();
        h27 h27Var = (h27) k.c().getValue();
        if (!(h27Var instanceof f27)) {
            h27Var = null;
        }
        if (h27Var != null) {
            k.d.a((f27) h27Var);
        }
    }

    @Override // defpackage.iz4
    public final void d() {
        super.d();
        pzt0 pzt0Var = this.P;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.P = null;
        PlusLogTag plusLogTag = PlusLogTag.UI;
        skd0.e(plusLogTag, "detachView()");
        com.yandex.plus.home.common.utils.a.b(k().f);
        gsd0 gsd0Var = this.Q;
        gsd0Var.e = false;
        gsd0Var.a();
        com.yandex.plus.home.common.utils.a.b(this.V.h);
        skd0.b(plusLogTag, "detachView()");
    }

    @Override // defpackage.so41
    public final void f(String str, int i, String str2, String str3, boolean z) {
        if (z) {
            m(String.format("connection error, error code = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), str);
        }
        this.o.c(str, i, str2, str3, z);
    }

    @Override // defpackage.iz4
    public final void g() {
        PlusLogTag plusLogTag = PlusLogTag.UI;
        skd0.e(plusLogTag, "onPause()");
        this.Q.b();
        this.V.getClass();
        skd0.b(plusLogTag, "onPause()");
    }

    @Override // defpackage.iz4
    public final void h() {
        PlusLogTag plusLogTag = PlusLogTag.UI;
        skd0.e(plusLogTag, "onResume()");
        this.Q.d();
        d dVar = this.V;
        dVar.getClass();
        skd0.b(plusLogTag, "onResume()");
        dVar.a(new bbd0(23));
    }

    public final com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f k() {
        return (com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f) this.W.getValue();
    }

    @Override // defpackage.so41
    public final void l(String str, int i, String str2, String str3, boolean z) {
        if (z) {
            m("ssl error", str);
        }
        this.o.e(str, i, str2, str3, z);
    }

    public final void m(String str, String str2) {
        if (!this.E) {
            pzt0 pzt0Var = this.P;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            this.P = null;
        }
        this.s.s();
        skd0.e(PlusLogTag.UI, str);
        ((xk41) this.b).showError(str);
        if (str2 == null) {
            str2 = this.V.g;
        }
        this.a0.d(this.x, str2);
    }

    public final void n(pt80 pt80Var) {
        this.V.d(pt80Var, new WebStoriesPresenter$onNeedAuthorization$1(0, k(), com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f.class, "onWebAuthorizationShow", "onWebAuthorizationShow()V", 0), new WebStoriesPresenter$onNeedAuthorization$2(1, k(), com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f.class, "onAuthorizationResult", "onAuthorizationResult(Lcom/yandex/plus/home/feature/webviews/internalapi/authorization/AuthorizationResult;)V", 0));
    }

    public final void o() {
        this.s.t(this.V.g);
        ((nsu) this.X.getValue()).j = true;
        this.Y = true;
        this.Q.e();
        ((xk41) this.b).showContent();
        r0 r0Var = k().g;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
        this.a0.a(this.x);
    }

    @Override // defpackage.w350
    public final void onClose() {
        com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f k = k();
        pzt0 pzt0Var = k.i;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        k.i = null;
    }

    @Override // defpackage.p3d0
    public final void onMessage(String str) {
        skd0.b(PlusLogTag.UI, "onMessage() jsonMessage=".concat(str));
        ((b) this.R.getValue()).onMessage(str);
    }

    public final void p(gov govVar) {
        if (this.E) {
            ((xk41) this.b).sendMessage(govVar);
        } else {
            ((b) this.R.getValue()).A(govVar);
        }
    }

    @Override // defpackage.so41
    public final void r(String str, int i, String str2, String str3, boolean z) {
        if (z) {
            m(String.format("http error, status code = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), str);
        }
        this.o.b(str, i, str2, str3, z);
    }
}
