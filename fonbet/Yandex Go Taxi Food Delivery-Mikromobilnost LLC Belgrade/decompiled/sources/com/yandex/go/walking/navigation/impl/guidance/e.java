package com.yandex.go.walking.navigation.impl.guidance;

import android.content.Context;
import com.yandex.go.walking.navigation.impl.analytics.WalkingNavigationAnalytics$NavigationScreenType;
import com.yandex.go.walking.navigation.impl.analytics.WalkingNavigationAnalytics$WalkingNavigationGeneration;
import com.yandex.go.walking.navigation.impl.experiment.WalkNavExperiment;
import com.yandex.go.walking.navigation.impl.guidance.interactor.n;
import com.yandex.go.walking.navigation.impl.guidance.interactor.x;
import defpackage.a3v;
import defpackage.b741;
import defpackage.cne0;
import defpackage.f241;
import defpackage.jl40;
import defpackage.l141;
import defpackage.m341;
import defpackage.m950;
import defpackage.mu5;
import defpackage.n341;
import defpackage.pgd;
import defpackage.qd21;
import defpackage.qu;
import defpackage.smw0;
import defpackage.sy60;
import defpackage.tje;
import defpackage.w030;
import defpackage.w041;
import defpackage.w141;
import defpackage.wfd;
import defpackage.x241;
import defpackage.zy11;
import java.util.Iterator;

/* loaded from: classes14.dex */
public final class e extends pgd {
    public final Context F;
    public final w030 G;
    public final n341 H;
    public final x I;
    public final f241 J;
    public final qd21 K;
    public final f241 L;
    public final x241 M;
    public final com.yandex.go.walking.navigation.impl.navigation_core.guidance.a N;
    public final a3v O;
    public final b741 P;
    public final w041 Q;
    public final n R;
    public final mu5 S;

    public e(Context context, w030 w030Var, n341 n341Var, x xVar, f241 f241Var, qd21 qd21Var, f241 f241Var2, x241 x241Var, com.yandex.go.walking.navigation.impl.navigation_core.guidance.a aVar, a3v a3vVar, b741 b741Var, w041 w041Var, n nVar) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = n341Var;
        this.I = xVar;
        this.J = f241Var;
        this.K = qd21Var;
        this.L = f241Var2;
        this.M = x241Var;
        this.N = aVar;
        this.O = a3vVar;
        this.P = b741Var;
        this.Q = w041Var;
        this.R = nVar;
        this.S = new mu5(new w141(this, 0));
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        super.G((zy11) obj);
        this.O.b8(this);
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void H(Object obj) {
        super.H((zy11) obj);
        a3v a3vVar = this.O;
        a3vVar.t4(this);
        a3vVar.a0(this);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        WalkingNavigationAnalytics$WalkingNavigationGeneration walkingNavigationAnalytics$WalkingNavigationGeneration;
        Object obj2;
        if (!((Boolean) this.M.b.a.getValue()).booleanValue()) {
            r(new qu(9));
            return;
        }
        com.yandex.go.walking.navigation.impl.navigation_core.guidance.a aVar = this.N;
        long j = aVar.e.j("walk_nav_total_route_time", -1L);
        Long valueOf = j == -1 ? null : Long.valueOf(j);
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            if (longValue != -2) {
                long g = smw0.g(longValue, 1000L, System.currentTimeMillis(), ((WalkNavExperiment) ((l141) aVar.a.get()).a.b()).c * 60000);
                cne0 cne0Var = aVar.e;
                cne0Var.q(longValue, "walk_nav_total_route_time");
                cne0Var.q(g, "walk_nav_deadline");
                aVar.e(g);
            }
        }
        WalkingNavigationAnalytics$NavigationScreenType walkingNavigationAnalytics$NavigationScreenType = WalkingNavigationAnalytics$NavigationScreenType.InProgress;
        w041 w041Var = this.Q;
        String str = w041Var.a;
        if (w041Var.b != null) {
            Iterator<E> it = WalkingNavigationAnalytics$WalkingNavigationGeneration.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it.next();
                    if (jl40.l(((WalkingNavigationAnalytics$WalkingNavigationGeneration) obj2).getEventValue(), w041Var.b)) {
                        break;
                    }
                }
            }
            walkingNavigationAnalytics$WalkingNavigationGeneration = (WalkingNavigationAnalytics$WalkingNavigationGeneration) obj2;
        } else {
            walkingNavigationAnalytics$WalkingNavigationGeneration = null;
        }
        this.P.a(walkingNavigationAnalytics$NavigationScreenType, str, walkingNavigationAnalytics$WalkingNavigationGeneration);
        tje.N(o(), null, null, new WalkNavGuidanceInternalRouter$trackGuidanceShown$2(this, null), 3);
        String str2 = w041Var.a;
        if (str2 != null) {
            this.R.a(str2);
        }
        z((m950) this.J.get(), sy60.Q2);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.S;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }

    public final void U(m341 m341Var, boolean z) {
        if (((zy11) this.x) != null) {
            tje.N(o(), null, null, new WalkNavGuidanceInternalRouter$processAction$1$1(this, m341Var, z, null), 3);
        }
    }
}
