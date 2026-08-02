package com.yandex.go.scooters.passes;

import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import com.yandex.go.scooters.passes.domain.model.ScootersPassesType;
import defpackage.ago0;
import defpackage.avm0;
import defpackage.b9o0;
import defpackage.bei;
import defpackage.beo0;
import defpackage.bgo0;
import defpackage.cgo0;
import defpackage.dfo0;
import defpackage.dgo0;
import defpackage.ehn0;
import defpackage.frm0;
import defpackage.h55;
import defpackage.jl40;
import defpackage.joo0;
import defpackage.jst;
import defpackage.ksm0;
import defpackage.kvm0;
import defpackage.l76;
import defpackage.l7o0;
import defpackage.lbn0;
import defpackage.m950;
import defpackage.moo0;
import defpackage.p7o0;
import defpackage.poo0;
import defpackage.qco0;
import defpackage.qu;
import defpackage.qx5;
import defpackage.rco0;
import defpackage.reo0;
import defpackage.sco0;
import defpackage.seo0;
import defpackage.sls;
import defpackage.teo0;
import defpackage.tje;
import defpackage.u50;
import defpackage.ueo0;
import defpackage.veo0;
import defpackage.w20;
import defpackage.w511;
import defpackage.wrm0;
import defpackage.yvf0;
import defpackage.zgz;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;

/* loaded from: classes13.dex */
public final class h extends h55 {
    public final beo0 D;
    public final MapNotificationsMuteRepository E;
    public final yvf0 F;
    public final yvf0 G;
    public final yvf0 H;
    public final yvf0 I;
    public final yvf0 J;
    public final yvf0 K;
    public final yvf0 L;
    public final yvf0 M;
    public final yvf0 N;
    public final qx5 O;
    public final yvf0 P;
    public boolean Q;

    public h(beo0 beo0Var, MapNotificationsMuteRepository mapNotificationsMuteRepository, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7, yvf0 yvf0Var8, yvf0 yvf0Var9, qx5 qx5Var, yvf0 yvf0Var10) {
        super(null);
        this.D = beo0Var;
        this.E = mapNotificationsMuteRepository;
        this.F = yvf0Var;
        this.G = yvf0Var2;
        this.H = yvf0Var3;
        this.I = yvf0Var4;
        this.J = yvf0Var5;
        this.K = yvf0Var6;
        this.L = yvf0Var7;
        this.M = yvf0Var8;
        this.N = yvf0Var9;
        this.O = qx5Var;
        this.P = yvf0Var10;
    }

    public static final void P(h hVar, ueo0 ueo0Var, ScootersPassesFromScreen scootersPassesFromScreen, String str) {
        lbn0 lbn0Var = (lbn0) hVar.M.get();
        sco0 sco0Var = (sco0) ((r0) lbn0Var.b).getValue();
        if (sco0Var == null && scootersPassesFromScreen == ScootersPassesFromScreen.OFFER_CARD) {
            zgz.a(null, new IllegalArgumentException("No passes when opening from offer card"));
            hVar.r(new qu(9));
        } else if (sco0Var != null) {
            hVar.R(sco0Var, ueo0Var, scootersPassesFromScreen, str);
        } else {
            tje.N(hVar.o(), null, null, new ScootersPassesRouter$requestScootersPassesWithLoading$1(hVar, scootersPassesFromScreen, new u50((Object) lbn0Var, (Object) hVar, (Object) ueo0Var, (Object) scootersPassesFromScreen, str, 20), null), 3);
        }
    }

    public static final void Q(h hVar, moo0 moo0Var, ScootersPassesType scootersPassesType) {
        hVar.getClass();
        if (moo0Var != null && !moo0Var.equals(joo0.a)) {
            hVar.A((m950) hVar.O.get(), new poo0(moo0Var, scootersPassesType), new ago0(hVar, 1));
        } else {
            hVar.r(new qu(9));
            jst.e.getClass();
        }
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        if (this.Q) {
            this.Q = false;
            ((lbn0) this.M.get()).Fg(null);
        }
        this.E.b();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.E.a();
        tje.N(o(), null, null, new ScootersPassesRouter$onLaunch$1((veo0) obj, this, null), 3);
    }

    public final void R(sco0 sco0Var, ueo0 ueo0Var, ScootersPassesFromScreen scootersPassesFromScreen, String str) {
        rco0 rco0Var;
        kvm0 kvm0Var;
        List list;
        int i = 9;
        avm0 avm0Var = null;
        avm0Var = null;
        if (ueo0Var instanceof seo0) {
            qco0 qco0Var = sco0Var instanceof qco0 ? (qco0) sco0Var : null;
            String str2 = ((seo0) ueo0Var).a;
            ScootersPassesRouter$directLaunch$1 scootersPassesRouter$directLaunch$1 = new ScootersPassesRouter$directLaunch$1(0, this, h.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0);
            if (qco0Var == null) {
                zgz.a("Packages opening was requested, but data model is wrong type", new IllegalStateException());
                r(new qu(i));
                return;
            }
            b9o0 b9o0Var = qco0Var.j;
            if (b9o0Var != null) {
                A((m950) this.L.get(), new p7o0(b9o0Var, str2, scootersPassesFromScreen, str), new e(this, scootersPassesRouter$directLaunch$1));
                return;
            } else if (!qco0Var.h.isEmpty()) {
                A((m950) this.G.get(), new l7o0(qco0Var, str2, scootersPassesFromScreen, str), new f(this, scootersPassesRouter$directLaunch$1));
                return;
            } else {
                jst.e.getClass();
                r(new qu(i));
                return;
            }
        }
        if (ueo0Var instanceof teo0) {
            T(sco0Var, scootersPassesFromScreen, str, ((teo0) ueo0Var).a, new ehn0(16, this));
            return;
        }
        if (jl40.l(ueo0Var, l76.P)) {
            qco0 qco0Var2 = sco0Var instanceof qco0 ? (qco0) sco0Var : null;
            if (qco0Var2 == null) {
                zgz.a("Packages opening was requested, but data model is wrong type", new IllegalStateException());
                r(new qu(i));
                return;
            }
            w20 w20Var = qco0Var2.g;
            if (w20Var != null && (list = w20Var.c) != null && (!list.isEmpty())) {
                A((m950) this.I.get(), new frm0(scootersPassesFromScreen, str), new ago0(this, 0));
                return;
            } else {
                zgz.a("Active packages is empty", new IllegalStateException());
                r(new qu(i));
                return;
            }
        }
        if (ueo0Var instanceof reo0) {
            S(sco0Var, scootersPassesFromScreen, str);
            return;
        }
        if (!jl40.l(ueo0Var, bei.N)) {
            w511.b();
            return;
        }
        qco0 qco0Var3 = sco0Var instanceof qco0 ? (qco0) sco0Var : null;
        if (qco0Var3 == null || (rco0Var = qco0Var3.i) == null) {
            rco0Var = sco0Var instanceof rco0 ? (rco0) sco0Var : null;
        }
        if (rco0Var != null && (kvm0Var = rco0Var.i) != null) {
            ArrayList arrayList = kvm0Var.d.c;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof avm0) {
                    arrayList2.add(obj);
                }
            }
            avm0Var = (avm0) kotlin.collections.a.R(arrayList2);
        }
        if (avm0Var != null) {
            A((m950) this.P.get(), new ksm0(avm0Var, ScootersPassesFromScreen.DISCOVERY), new cgo0(this));
        } else {
            zgz.a("Super passes renew opening was requested, but data model is wrong type", new IllegalStateException());
            r(new qu(i));
        }
    }

    public final void S(sco0 sco0Var, ScootersPassesFromScreen scootersPassesFromScreen, String str) {
        rco0 rco0Var;
        qco0 qco0Var = sco0Var instanceof qco0 ? (qco0) sco0Var : null;
        if (qco0Var == null || (rco0Var = qco0Var.i) == null) {
            rco0Var = sco0Var instanceof rco0 ? (rco0) sco0Var : null;
        }
        if ((rco0Var != null ? rco0Var.i : null) != null) {
            A((m950) this.K.get(), new wrm0(scootersPassesFromScreen, str), new bgo0(this, scootersPassesFromScreen, str));
        } else {
            zgz.a("Super passes opening was requested, but data model is wrong type", new IllegalStateException());
            r(new qu(9));
        }
    }

    public final void T(sco0 sco0Var, ScootersPassesFromScreen scootersPassesFromScreen, String str, String str2, sls slsVar) {
        rco0 rco0Var;
        qco0 qco0Var = sco0Var instanceof qco0 ? (qco0) sco0Var : null;
        if (qco0Var == null || (rco0Var = qco0Var.i) == null) {
            rco0Var = sco0Var instanceof rco0 ? (rco0) sco0Var : null;
        }
        if ((rco0Var != null ? rco0Var.h : null) != null) {
            A((m950) this.N.get(), new dfo0(scootersPassesFromScreen, str, str2), new dgo0(this, slsVar));
        } else {
            zgz.a("Super passes opening was requested, but data model is wrong type", new IllegalStateException());
            r(new qu(9));
        }
    }
}
