package com.yandex.go.benefits_center.benefits.router;

import com.yandex.go.superapp.order.multi.old.provider.g;
import defpackage.avj0;
import defpackage.bg1;
import defpackage.bo5;
import defpackage.cwa0;
import defpackage.dj3;
import defpackage.h0w;
import defpackage.h55;
import defpackage.kn5;
import defpackage.kyh0;
import defpackage.m1h0;
import defpackage.oep0;
import defpackage.sno0;
import defpackage.tj60;
import defpackage.tje;
import defpackage.tm5;
import defpackage.wgr;
import defpackage.x4;
import defpackage.ymu;
import defpackage.yvf0;
import defpackage.z131;
import defpackage.zn5;
import defpackage.zuj0;
import ru.yandex.taxi.communications.benefitscenter.BenefitsCenterNotification;
import ru.yandex.taxi.perf.screen.PerformanceScreenName;

/* loaded from: classes12.dex */
public final class d extends h55 {
    public final tm5 D;
    public final yvf0 E;
    public final g F;
    public final oep0 G;
    public final wgr H;
    public final a I;
    public final tj60 J;
    public final com.yandex.go.benefits_center.benefits.sdk.document.a K;
    public final ru.yandex.taxi.communications.benefitscenter.b L;
    public final zuj0 M;
    public final com.yandex.go.benefits_center.claim.domain.a N;
    public final x4 O;
    public final h0w P;
    public final dj3 Q;
    public final sno0 R;
    public final ru.yandex.taxi.deeplinks.b S;
    public final ymu T;
    public final h0w U;
    public final yvf0 V;
    public final yvf0 W;
    public final h0w Z;
    public boolean a0;
    public boolean b0;
    public final kn5 c0;

    public d(tm5 tm5Var, yvf0 yvf0Var, g gVar, oep0 oep0Var, wgr wgrVar, a aVar, tj60 tj60Var, com.yandex.go.benefits_center.benefits.sdk.document.a aVar2, ru.yandex.taxi.communications.benefitscenter.b bVar, zuj0 zuj0Var, com.yandex.go.benefits_center.claim.domain.a aVar3, x4 x4Var, h0w h0wVar, dj3 dj3Var, sno0 sno0Var, ru.yandex.taxi.deeplinks.b bVar2, ymu ymuVar, h0w h0wVar2, yvf0 yvf0Var2, yvf0 yvf0Var3, h0w h0wVar3) {
        super(null);
        this.D = tm5Var;
        this.E = yvf0Var;
        this.F = gVar;
        this.G = oep0Var;
        this.H = wgrVar;
        this.I = aVar;
        this.J = tj60Var;
        this.K = aVar2;
        this.L = bVar;
        this.M = zuj0Var;
        this.N = aVar3;
        this.O = x4Var;
        this.P = h0wVar;
        this.Q = dj3Var;
        this.R = sno0Var;
        this.S = bVar2;
        this.T = ymuVar;
        this.U = h0wVar2;
        this.V = yvf0Var2;
        this.W = yvf0Var3;
        this.Z = h0wVar3;
        this.c0 = new kn5(0, this);
    }

    public static final void P(d dVar, String str) {
        zuj0 zuj0Var = dVar.M;
        ru.yandex.taxi.communications.benefitscenter.b bVar = dVar.L;
        if (str == null) {
            str = ((avj0) zuj0Var).h(kyh0.benefits_center_error_claiming_promocode);
        }
        String h = ((avj0) zuj0Var).h(kyh0.benefits_center_try_again);
        int i = m1h0.ic_error_activation;
        BenefitsCenterNotification a = bVar.a(str, h);
        bVar.d.e(a);
        a.setImage(i);
    }

    public static void Q(d dVar, zn5 zn5Var, boolean z) {
        tje.N(dVar.o(), null, null, new BenefitsCenterInnerRouter$handleReloadAction$1(dVar, zn5Var, z, false, null), 3);
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        ((ru.yandex.taxi.perf.screen.c) this.Z.b).h(PerformanceScreenName.BenefitsCenter);
        this.b0 = false;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        zn5 zn5Var = (zn5) obj;
        String str = zn5Var.a;
        h0w h0wVar = this.Z;
        String name = ((com.yandex.go.navigation.screen.c) h0wVar.c).b().name();
        PerformanceScreenName performanceScreenName = PerformanceScreenName.BenefitsCenter;
        cwa0 cwa0Var = new cwa0(performanceScreenName, name, new bg1(str, 4), null, 56);
        ru.yandex.taxi.perf.screen.c cVar = (ru.yandex.taxi.perf.screen.c) h0wVar.b;
        cVar.f(cwa0Var);
        cVar.g(performanceScreenName);
        tje.N(o(), null, null, new BenefitsCenterInnerRouter$onLaunch$1(this, zn5Var, null), 3);
        this.J.f();
        h0w h0wVar2 = this.P;
        String g = ((com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c) h0wVar2.b).g();
        if (g != null) {
            bo5 bo5Var = (bo5) h0wVar2.c;
            bo5Var.getClass();
            ((com.yandex.div.core.expression.variables.a) bo5Var.a.get()).i(new z131("benefits_center.active_taxi_promocode", g));
        }
        String str2 = zn5Var.c;
        dj3 dj3Var = this.Q;
        dj3Var.getClass();
        ((com.yandex.div.core.expression.variables.a) dj3Var.a.get()).i(new z131("benefits_center.active_section", str2));
    }

    @Override // defpackage.h55
    public final void K(Object obj) {
        zn5 zn5Var = (zn5) obj;
        if (this.a0) {
            this.a0 = false;
            Q(this, zn5Var, true);
        }
    }
}
