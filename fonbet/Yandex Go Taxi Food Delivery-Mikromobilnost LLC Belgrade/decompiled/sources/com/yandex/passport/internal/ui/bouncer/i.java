package com.yandex.passport.internal.ui.bouncer;

import android.app.Activity;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.w;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.account.PassportAccountImpl;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import com.yandex.passport.internal.report.zd;
import com.yandex.passport.internal.ui.bouncer.model.BouncerUiState$SocialAction;
import com.yandex.passport.internal.ui.bouncer.model.a2;
import com.yandex.passport.internal.ui.bouncer.model.b2;
import com.yandex.passport.internal.ui.bouncer.model.c2;
import com.yandex.passport.internal.ui.bouncer.model.k1;
import com.yandex.passport.internal.ui.bouncer.model.l1;
import com.yandex.passport.internal.ui.bouncer.model.m1;
import com.yandex.passport.internal.ui.bouncer.model.n1;
import com.yandex.passport.internal.ui.bouncer.model.o1;
import com.yandex.passport.internal.ui.bouncer.model.p1;
import com.yandex.passport.internal.ui.bouncer.model.q1;
import com.yandex.passport.internal.ui.bouncer.model.r1;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import com.yandex.passport.internal.ui.bouncer.model.t1;
import com.yandex.passport.internal.ui.bouncer.model.u1;
import com.yandex.passport.internal.ui.bouncer.model.v1;
import com.yandex.passport.internal.ui.bouncer.model.w1;
import com.yandex.passport.internal.ui.bouncer.model.x1;
import com.yandex.passport.internal.ui.bouncer.model.y1;
import com.yandex.passport.internal.ui.bouncer.model.z1;
import com.yandex.passport.sloth.ui.d0;
import com.yandex.passport.sloth.ui.u0;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.h3y;
import defpackage.i3y;
import defpackage.ins0;
import defpackage.jl40;
import defpackage.kum;
import defpackage.nns0;
import defpackage.tje;
import defpackage.w511;
import defpackage.yv5;

/* loaded from: classes2.dex */
public final class i implements p {
    public final com.yandex.passport.internal.ui.bouncer.error.a A;
    public final com.yandex.passport.internal.ui.bouncer.fallback.c B;
    public final h3y C;
    public final com.yandex.passport.internal.ui.bouncer.error.p D;
    public final com.yandex.passport.internal.ui.bouncer.loading.j E;
    public final com.yandex.passport.internal.report.reporters.n F;
    public final zd G;
    public final com.yandex.passport.internal.flags.j H;
    public final ProgressPropertiesImpl I;
    public final com.yandex.passport.internal.ui.bouncer.chooser.l J;
    public final com.yandex.passport.internal.ui.bouncer.sloth.f K;
    public final i3y L = kotlin.a.a(new com.yandex.passport.internal.flags.experiments.h(7, this));
    public boolean M;
    public final Activity a;
    public final com.yandex.passport.internal.ui.bouncer.sloth.g b;
    public final l c;
    public final t w;
    public final com.yandex.passport.internal.ui.bouncer.roundabout.v x;
    public final com.yandex.passport.internal.ui.bouncer.loading.c y;
    public final com.yandex.passport.internal.ui.bouncer.loading.f z;

    public i(Activity activity, com.yandex.passport.internal.ui.bouncer.sloth.g gVar, l lVar, t tVar, com.yandex.passport.internal.ui.bouncer.roundabout.v vVar, com.yandex.passport.internal.ui.bouncer.loading.c cVar, com.yandex.passport.internal.ui.bouncer.loading.f fVar, com.yandex.passport.internal.ui.bouncer.error.a aVar, com.yandex.passport.internal.ui.bouncer.fallback.c cVar2, h3y h3yVar, com.yandex.passport.internal.ui.bouncer.error.p pVar, com.yandex.passport.internal.ui.bouncer.loading.j jVar, com.yandex.passport.internal.report.reporters.n nVar, zd zdVar, com.yandex.passport.internal.flags.j jVar2, ProgressPropertiesImpl progressPropertiesImpl, com.yandex.passport.internal.ui.bouncer.chooser.l lVar2, com.yandex.passport.internal.ui.bouncer.sloth.f fVar2) {
        this.a = activity;
        this.b = gVar;
        this.c = lVar;
        this.w = tVar;
        this.x = vVar;
        this.y = cVar;
        this.z = fVar;
        this.A = aVar;
        this.B = cVar2;
        this.C = h3yVar;
        this.D = pVar;
        this.E = jVar;
        this.F = nVar;
        this.G = zdVar;
        this.H = jVar2;
        this.I = progressPropertiesImpl;
        this.J = lVar2;
        this.K = fVar2;
    }

    public final void a(Activity activity, w wVar) {
        com.yandex.passport.internal.ui.c.k(activity, com.yandex.passport.internal.ui.c.B(wVar));
        zd zdVar = this.G;
        zdVar.e("native.finish");
        zdVar.c.put(TarifficatorScenarioActivity.RESULT_KEY, com.yandex.passport.internal.properties.u.x(wVar));
    }

    @Override // com.yandex.passport.internal.ui.bouncer.p
    public final boolean canGoBackInSloth() {
        com.yandex.passport.internal.ui.bouncer.sloth.g gVar = this.b;
        if (((d0) gVar.f.getValue()).o().w.a(Lifecycle.State.CREATED)) {
            return ((d0) gVar.f.getValue()).p().onBackPressed();
        }
        return false;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.p
    public final View getTheRootView() {
        return this.c.getRoot();
    }

    @Override // com.yandex.passport.internal.ui.bouncer.p
    public final void onDestroy() {
        com.yandex.passport.internal.ui.bouncer.sloth.g gVar = this.b;
        if (((d0) gVar.f.getValue()).o().w.a(Lifecycle.State.CREATED)) {
            ((d0) gVar.f.getValue()).h();
        }
        if (this.M) {
            ins0 ins0Var = (ins0) this.L.getValue();
            com.yandex.passport.internal.ui.common.web.g gVar2 = ins0Var instanceof com.yandex.passport.internal.ui.common.web.g ? (com.yandex.passport.internal.ui.common.web.g) ins0Var : null;
            if (gVar2 != null) {
                gVar2.h();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.yandex.passport.internal.ui.bouncer.sloth.f] */
    /* JADX WARN: Type inference failed for: r15v12, types: [com.yandex.passport.internal.ui.bouncer.chooser.l] */
    /* JADX WARN: Type inference failed for: r15v13, types: [com.lightside.slab.a, com.yandex.passport.internal.ui.bouncer.loading.j] */
    /* JADX WARN: Type inference failed for: r15v14, types: [com.lightside.slab.a, com.yandex.passport.internal.ui.bouncer.error.p] */
    /* JADX WARN: Type inference failed for: r15v18, types: [ins0] */
    /* JADX WARN: Type inference failed for: r15v19, types: [com.lightside.slab.a, com.yandex.passport.internal.ui.bouncer.fallback.c] */
    /* JADX WARN: Type inference failed for: r15v27, types: [com.lightside.slab.a, com.yandex.passport.sloth.ui.d0] */
    /* JADX WARN: Type inference failed for: r15v30, types: [com.lightside.slab.a, com.yandex.passport.internal.ui.bouncer.roundabout.v] */
    /* JADX WARN: Type inference failed for: r15v34, types: [com.lightside.slab.a, com.yandex.passport.internal.ui.bouncer.loading.c] */
    /* JADX WARN: Type inference failed for: r15v35, types: [com.lightside.slab.a, com.yandex.passport.internal.ui.bouncer.loading.f] */
    /* JADX WARN: Type inference failed for: r15v37, types: [com.lightside.slab.a, com.yandex.passport.internal.ui.bouncer.error.a] */
    @Override // com.yandex.passport.common.mvi.f
    public final void render(Object obj) {
        kum kumVar;
        s1 s1Var = (s1) obj;
        c2 c2Var = s1Var.a;
        r1 r1Var = s1Var.b;
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "render state ".concat(com.yandex.passport.internal.properties.u.t(s1Var)), 8);
        }
        com.yandex.passport.internal.report.reporters.n nVar = this.F;
        nVar.l(s1Var);
        boolean z = c2Var instanceof t1;
        if (z || (c2Var instanceof z1) || (c2Var instanceof v1) || (c2Var instanceof y1) || (c2Var instanceof a2) || (c2Var instanceof b2) || (c2Var instanceof w1)) {
            this.G.e(com.yandex.passport.internal.properties.u.y(c2Var));
        }
        p1 p1Var = p1.a;
        boolean l = jl40.l(r1Var, p1Var);
        Activity activity = this.a;
        if (!l) {
            nVar.k(r1Var);
            if (r1Var.equals(k1.a) || (r1Var instanceof l1)) {
                a(activity, com.yandex.passport.api.q.a);
                return;
            }
            if (r1Var instanceof m1) {
                a(activity, new com.yandex.passport.api.s(((m1) r1Var).a));
                return;
            }
            if (r1Var.equals(n1.a)) {
                a(activity, com.yandex.passport.api.t.a);
                return;
            }
            if (!(r1Var instanceof q1)) {
                if (r1Var instanceof o1) {
                    o1 o1Var = (o1) r1Var;
                    a(activity, new com.yandex.passport.api.v(o1Var.a, o1Var.b));
                    return;
                } else {
                    if (r1Var.equals(p1Var)) {
                        return;
                    }
                    w511.b();
                    return;
                }
            }
            q1 q1Var = (q1) r1Var;
            ModernAccount modernAccount = q1Var.a;
            PassportUidImpl A = com.yandex.passport.internal.util.p.A(modernAccount.getUid());
            PassportAccountImpl g0 = a0.g0(modernAccount);
            PassportLoginAction passportLoginAction = q1Var.c;
            String str = q1Var.d;
            String str2 = q1Var.e;
            if (str2 == null) {
                str2 = s1Var.f;
            }
            a(activity, new com.yandex.passport.api.u(A, g0, passportLoginAction, str, str2));
            return;
        }
        if (c2Var instanceof v1) {
            ?? r15 = this.A;
            r15.c(c2Var);
            kumVar = r15;
        } else if (c2Var instanceof x1) {
            if (((x1) c2Var).b) {
                ?? r152 = this.z;
                r152.c(c2Var);
                kumVar = r152;
            } else {
                ?? r153 = this.y;
                r153.c(c2Var);
                kumVar = r153;
            }
        } else if (c2Var instanceof y1) {
            ?? r154 = this.x;
            r154.c(c2Var);
            kumVar = r154;
        } else if (c2Var instanceof z1) {
            if (((Boolean) this.H.b(com.yandex.passport.internal.flags.q.Z)).booleanValue()) {
                u0 u0Var = new u0(((z1) c2Var).b);
                ?? r0 = this.K;
                r0.c(u0Var);
                kumVar = r0;
            } else {
                ?? r155 = (d0) this.b.f.getValue();
                r155.c(new u0(((z1) c2Var).b));
                kumVar = r155;
            }
        } else if (c2Var instanceof w1) {
            ?? r156 = this.B;
            r156.c(c2Var);
            kumVar = r156;
        } else if (z) {
            this.M = true;
            i3y i3yVar = this.L;
            yv5 yv5Var = (yv5) ((ins0) i3yVar.getValue());
            t1 t1Var = (t1) c2Var;
            com.yandex.passport.internal.ui.challenge.v vVar = t1Var.a;
            Uid uid = t1Var.b;
            PassportTheme passportTheme = t1Var.c;
            t tVar = this.w;
            tje.N(tVar.b, null, null, new BouncerWishSource$wireChallengeResult$1(tVar, uid, vVar, passportTheme, null), 3);
            yv5Var.c(vVar);
            kumVar = (ins0) i3yVar.getValue();
        } else if (c2Var instanceof b2) {
            ?? r157 = this.D;
            r157.c(c2Var);
            kumVar = r157;
        } else if (c2Var instanceof a2) {
            ?? r158 = this.E;
            r158.c(c2Var);
            kumVar = r158;
        } else if (c2Var instanceof u1) {
            ?? r159 = this.J;
            r159.c(c2Var);
            kumVar = r159;
        } else {
            if (!(c2Var instanceof BouncerUiState$SocialAction)) {
                w511.b();
                return;
            }
            kumVar = new kum(new nns0(activity, 0));
        }
        this.c.c.b(kumVar);
    }
}
