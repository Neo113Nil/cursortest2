package com.yandex.go.scooters.discovery;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.scooters.mosru.api.analytics.ScootersMosRuAnalyticsFromScreen;
import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import com.yandex.go.scooters.requirements.SkipCheck;
import com.yandex.go.sharing_personal_goals.api.domain.model.SharingPersonalGoalsDisplayContext;
import com.yandex.go.sharing_personal_goals.api.domain.model.SharingPersonalGoalsServiceName;
import defpackage.cio0;
import defpackage.czn0;
import defpackage.dpb;
import defpackage.e90;
import defpackage.h3y;
import defpackage.h55;
import defpackage.iin0;
import defpackage.iu4;
import defpackage.jzn0;
import defpackage.lbb0;
import defpackage.lzn0;
import defpackage.m950;
import defpackage.mdn0;
import defpackage.mo21;
import defpackage.mo30;
import defpackage.mwj;
import defpackage.nin0;
import defpackage.ny61;
import defpackage.orr0;
import defpackage.ph70;
import defpackage.pin0;
import defpackage.po21;
import defpackage.q970;
import defpackage.qa0;
import defpackage.qin0;
import defpackage.rin0;
import defpackage.scn0;
import defpackage.sgo0;
import defpackage.sin0;
import defpackage.sls;
import defpackage.sw80;
import defpackage.swj;
import defpackage.sy60;
import defpackage.tje;
import defpackage.u6n0;
import defpackage.ueo0;
import defpackage.veo0;
import defpackage.vin0;
import defpackage.w030;
import defpackage.ygo0;
import defpackage.yvf0;
import defpackage.z970;
import defpackage.zgo0;
import defpackage.zro0;
import defpackage.zy11;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class m extends h55 {
    public final w030 D;
    public final h3y E;
    public final h3y F;
    public final po21 G;
    public final yvf0 H;
    public final com.yandex.go.navigation.screen.c I;
    public final h3y J;
    public final cio0 K;
    public final yvf0 L;
    public final yvf0 M;
    public final yvf0 N;
    public final scn0 O;
    public final yvf0 P;
    public final yvf0 Q;
    public final ru.yandex.taxi.deeplinks.b R;
    public final czn0 S;
    public final yvf0 T;
    public final yvf0 U;
    public final yvf0 V;
    public final yvf0 W;
    public final yvf0 Z;
    public final yvf0 a0;
    public final yvf0 b0;
    public final h3y c0;
    public final ph70 d0;
    public final yvf0 e0;
    public final com.yandex.go.scooters.payments.domain.a f0;
    public final zgo0 g0;
    public final sin0 h0;
    public e90 i0;
    public final qa0 j0;

    public m(w030 w030Var, h3y h3yVar, h3y h3yVar2, po21 po21Var, yvf0 yvf0Var, com.yandex.go.navigation.screen.c cVar, h3y h3yVar3, cio0 cio0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, scn0 scn0Var, yvf0 yvf0Var5, yvf0 yvf0Var6, ru.yandex.taxi.deeplinks.b bVar, czn0 czn0Var, yvf0 yvf0Var7, yvf0 yvf0Var8, yvf0 yvf0Var9, yvf0 yvf0Var10, yvf0 yvf0Var11, yvf0 yvf0Var12, yvf0 yvf0Var13, h3y h3yVar4, ph70 ph70Var, yvf0 yvf0Var14, com.yandex.go.scooters.payments.domain.a aVar, zgo0 zgo0Var, sin0 sin0Var) {
        super(null);
        this.D = w030Var;
        this.E = h3yVar;
        this.F = h3yVar2;
        this.G = po21Var;
        this.H = yvf0Var;
        this.I = cVar;
        this.J = h3yVar3;
        this.K = cio0Var;
        this.L = yvf0Var2;
        this.M = yvf0Var3;
        this.N = yvf0Var4;
        this.O = scn0Var;
        this.P = yvf0Var5;
        this.Q = yvf0Var6;
        this.R = bVar;
        this.S = czn0Var;
        this.T = yvf0Var7;
        this.U = yvf0Var8;
        this.V = yvf0Var9;
        this.W = yvf0Var10;
        this.Z = yvf0Var11;
        this.a0 = yvf0Var12;
        this.b0 = yvf0Var13;
        this.c0 = h3yVar4;
        this.d0 = ph70Var;
        this.e0 = yvf0Var14;
        this.f0 = aVar;
        this.g0 = zgo0Var;
        this.h0 = sin0Var;
        this.j0 = new qa0(23, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(m mVar, ContinuationImpl continuationImpl) {
        ScootersDiscoveryRouter$openPaymentMethods$1 scootersDiscoveryRouter$openPaymentMethods$1;
        int i;
        m950 m950Var;
        m mVar2;
        mVar.getClass();
        if (continuationImpl instanceof ScootersDiscoveryRouter$openPaymentMethods$1) {
            scootersDiscoveryRouter$openPaymentMethods$1 = (ScootersDiscoveryRouter$openPaymentMethods$1) continuationImpl;
            int i2 = scootersDiscoveryRouter$openPaymentMethods$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDiscoveryRouter$openPaymentMethods$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDiscoveryRouter$openPaymentMethods$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDiscoveryRouter$openPaymentMethods$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    m950 m950Var2 = (m950) mVar.Q.get();
                    po21 po21Var = mVar.G;
                    scootersDiscoveryRouter$openPaymentMethods$1.L$0 = mVar;
                    scootersDiscoveryRouter$openPaymentMethods$1.L$1 = m950Var2;
                    scootersDiscoveryRouter$openPaymentMethods$1.label = 1;
                    Object h = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).h(scootersDiscoveryRouter$openPaymentMethods$1);
                    if (h == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    m950Var = m950Var2;
                    obj = h;
                    mVar2 = mVar;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m950Var = (m950) scootersDiscoveryRouter$openPaymentMethods$1.L$1;
                    mVar2 = (m) scootersDiscoveryRouter$openPaymentMethods$1.L$0;
                    kotlin.b.b(obj);
                }
                mVar2.A(m950Var, new sgo0(((mo21) obj).a(), true, mVar.f0.c().d()), new mdn0(mVar, i3));
                return zy11.a;
            }
        }
        scootersDiscoveryRouter$openPaymentMethods$1 = new ScootersDiscoveryRouter$openPaymentMethods$1(mVar, continuationImpl);
        Object obj2 = scootersDiscoveryRouter$openPaymentMethods$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDiscoveryRouter$openPaymentMethods$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        mVar2.A(m950Var, new sgo0(((mo21) obj2).a(), true, mVar.f0.c().d()), new mdn0(mVar, i32));
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(m mVar, ContinuationImpl continuationImpl) {
        ScootersDiscoveryRouter$openPersonalGoals$1 scootersDiscoveryRouter$openPersonalGoals$1;
        int i;
        boolean z;
        mVar.getClass();
        if (continuationImpl instanceof ScootersDiscoveryRouter$openPersonalGoals$1) {
            scootersDiscoveryRouter$openPersonalGoals$1 = (ScootersDiscoveryRouter$openPersonalGoals$1) continuationImpl;
            int i2 = scootersDiscoveryRouter$openPersonalGoals$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDiscoveryRouter$openPersonalGoals$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDiscoveryRouter$openPersonalGoals$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDiscoveryRouter$openPersonalGoals$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zgo0 zgo0Var = mVar.g0;
                    scootersDiscoveryRouter$openPersonalGoals$1.label = 1;
                    obj = zgo0Var.a.b(scootersDiscoveryRouter$openPersonalGoals$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                z = ((ygo0) obj).b;
                zy11 zy11Var = zy11.a;
                if (z) {
                    return zy11Var;
                }
                m950 m950Var = (m950) mVar.Z.get();
                SharingPersonalGoalsServiceName sharingPersonalGoalsServiceName = SharingPersonalGoalsServiceName.SCOOTERS;
                SharingPersonalGoalsDisplayContext sharingPersonalGoalsDisplayContext = SharingPersonalGoalsDisplayContext.OFFER_CARD;
                mVar.A(m950Var, new orr0(sharingPersonalGoalsServiceName), sy60.Q2);
                return zy11Var;
            }
        }
        scootersDiscoveryRouter$openPersonalGoals$1 = new ScootersDiscoveryRouter$openPersonalGoals$1(mVar, continuationImpl);
        Object obj2 = scootersDiscoveryRouter$openPersonalGoals$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDiscoveryRouter$openPersonalGoals$1.label;
        if (i != 0) {
        }
        z = ((ygo0) obj2).b;
        zy11 zy11Var2 = zy11.a;
        if (z) {
        }
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        nin0 nin0Var = (nin0) obj;
        this.I.i(Screen.SCOOTERS_DISCOVERY);
        this.S.b.add(ScootersMosRuAnalyticsFromScreen.DISCOVERY);
        ru.yandex.taxi.discovery.b bVar = (ru.yandex.taxi.discovery.b) this.E.get();
        Object obj2 = this.c0.get();
        vin0 vin0Var = (vin0) obj2;
        vin0Var.r = new pin0(this, 11);
        vin0Var.s = new pin0(this, 12);
        int i = 1;
        vin0Var.t = new iin0(i, this);
        vin0Var.u = new pin0(this, 13);
        vin0Var.v = new pin0(this, 14);
        vin0Var.w = new pin0(this, 15);
        vin0Var.x = new pin0(this, 0);
        vin0Var.y = new pin0(this, i);
        vin0Var.z = new lbb0(24, this);
        vin0Var.A = new ScootersDiscoveryRouter$prepareDiscoveryParams$1$10(1, this, m.class, "openAttention", "openAttention(Lcom/yandex/go/scooters/misc/api/attention/domain/ScootersAttention;)V", 0);
        vin0Var.B = new pin0(this, 2);
        vin0Var.C = nin0Var.a;
        this.i0 = bVar.b(new mwj("scooter", "discovery_scooters", null, new sw80((swj) obj2)), new mo30(27, this));
        ru.yandex.taxi.banners.model.h b = ((iu4) this.F.get()).b();
        CopyOnWriteArrayList copyOnWriteArrayList = b.p;
        qa0 qa0Var = this.j0;
        copyOnWriteArrayList.add(qa0Var);
        String str = b.t;
        if (str != null) {
            qa0Var.accept(str);
        }
        z970 z970Var = nin0Var.b;
        if (z970Var != null) {
            R(z970Var instanceof q970 ? SkipCheck.DEBT : null, new k(this, z970Var));
        }
        if (z970Var == null) {
            z((m950) this.M.get(), new rin0(new pin0(this, 10)));
        }
        tje.N(o(), null, null, new ScootersDiscoveryRouter$handleScootersIntents$1(this, null), 3);
        this.h0.a.a(sin0.a(z970Var));
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        j(dpb.a);
        com.yandex.go.navigation.screen.c cVar = this.I;
        cVar.i(cVar.d());
        this.S.a();
        ru.yandex.taxi.banners.model.h b = ((iu4) this.F.get()).b();
        b.p.remove(this.j0);
        e90 e90Var = this.i0;
        if (e90Var != null) {
            e90Var.f();
        }
        this.i0 = null;
    }

    public final void R(SkipCheck skipCheck, sls slsVar) {
        A((m950) this.b0.get(), new zro0(skipCheck), new qin0(slsVar));
    }

    public final void S(jzn0 jzn0Var) {
        A((m950) this.L.get(), new lzn0(jzn0Var), new u6n0(1));
    }

    public final void T(ueo0 ueo0Var, String str) {
        D((m950) this.N.get(), new veo0(ueo0Var, ScootersPassesFromScreen.DISCOVERY, str), sy60.Q2);
    }
}
