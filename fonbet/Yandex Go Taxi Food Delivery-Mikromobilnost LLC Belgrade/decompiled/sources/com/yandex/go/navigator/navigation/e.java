package com.yandex.go.navigator.navigation;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.navigator.domain.j;
import com.yandex.go.navigator.domain.t;
import com.yandex.go.navigator.events.f;
import com.yandex.go.preorder.navigation.g;
import com.yandex.mapkit.location.Location;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.navigation.automotive.Navigation;
import defpackage.cm9;
import defpackage.dg50;
import defpackage.dlm;
import defpackage.dpb;
import defpackage.dt20;
import defpackage.ej40;
import defpackage.g18;
import defpackage.gh00;
import defpackage.h3y;
import defpackage.hfl0;
import defpackage.ii9;
import defpackage.jl40;
import defpackage.jlm;
import defpackage.ju9;
import defpackage.lb50;
import defpackage.lx4;
import defpackage.m950;
import defpackage.mf50;
import defpackage.nb50;
import defpackage.ny61;
import defpackage.ob50;
import defpackage.oc50;
import defpackage.od50;
import defpackage.pe50;
import defpackage.qu;
import defpackage.rd50;
import defpackage.re50;
import defpackage.rx4;
import defpackage.sb50;
import defpackage.sf30;
import defpackage.tc50;
import defpackage.td50;
import defpackage.tje;
import defpackage.tz60;
import defpackage.ud50;
import defpackage.ut;
import defpackage.wb50;
import defpackage.xe50;
import defpackage.xes0;
import defpackage.ye50;
import defpackage.yvf0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

/* loaded from: classes12.dex */
public final class e extends BaseRootNavigationRouter {
    public final re50 D;
    public final yvf0 E;
    public final oc50 F;
    public final h3y G;
    public final yvf0 H;
    public final xes0 I;
    public final t J;
    public final com.yandex.go.navigator.address.a K;
    public final com.yandex.go.navigator.notifications.cartech.b L;
    public final h3y M;
    public final h3y N;
    public final mf50 O;
    public final yvf0 P;
    public final tz60 Q;
    public final dt20 R;
    public final yvf0 S;
    public final com.yandex.go.navigator.main_screen.experiement.e T;
    public final sb50 U;
    public final f V;
    public final g W;
    public final od50 Z;
    public final j a0;
    public final BaseRootNavigationRouter.a b0 = new BaseRootNavigationRouter.a(Screen.NAVIGATOR, BaseRootNavigationRouter.Background.MAP, BaseRootNavigationRouter.AnimationType.STAR_WARS, 8);
    public SimpleSpinnerModalView c0;

    public e(re50 re50Var, ut utVar, oc50 oc50Var, h3y h3yVar, rx4 rx4Var, xes0 xes0Var, t tVar, com.yandex.go.navigator.address.a aVar, com.yandex.go.navigator.notifications.cartech.b bVar, h3y h3yVar2, h3y h3yVar3, mf50 mf50Var, ii9 ii9Var, tz60 tz60Var, dt20 dt20Var, ju9 ju9Var, com.yandex.go.navigator.main_screen.experiement.e eVar, sb50 sb50Var, f fVar, g gVar, od50 od50Var, j jVar) {
        this.D = re50Var;
        this.E = utVar;
        this.F = oc50Var;
        this.G = h3yVar;
        this.H = rx4Var;
        this.I = xes0Var;
        this.J = tVar;
        this.K = aVar;
        this.L = bVar;
        this.M = h3yVar2;
        this.N = h3yVar3;
        this.O = mf50Var;
        this.P = ii9Var;
        this.Q = tz60Var;
        this.R = dt20Var;
        this.S = ju9Var;
        this.T = eVar;
        this.U = sb50Var;
        this.V = fVar;
        this.W = gVar;
        this.Z = od50Var;
        this.a0 = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(e eVar, ContinuationImpl continuationImpl) {
        NavigatorRouter$canGoBackToNavigatorMain$1 navigatorRouter$canGoBackToNavigatorMain$1;
        int i;
        eVar.getClass();
        if (continuationImpl instanceof NavigatorRouter$canGoBackToNavigatorMain$1) {
            navigatorRouter$canGoBackToNavigatorMain$1 = (NavigatorRouter$canGoBackToNavigatorMain$1) continuationImpl;
            int i2 = navigatorRouter$canGoBackToNavigatorMain$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigatorRouter$canGoBackToNavigatorMain$1.label = i2 - Integer.MIN_VALUE;
                Object obj = navigatorRouter$canGoBackToNavigatorMain$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigatorRouter$canGoBackToNavigatorMain$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.navigator.main_screen.experiement.e eVar2 = eVar.T;
                    navigatorRouter$canGoBackToNavigatorMain$1.label = 1;
                    obj = eVar2.a(navigatorRouter$canGoBackToNavigatorMain$1);
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
                boolean z = ((tc50) obj).a;
                ud50 ud50Var = (ud50) eVar.x;
                return Boolean.valueOf((z || ((ud50Var != null ? ud50Var.b : null) instanceof ob50)) ? false : true);
            }
        }
        navigatorRouter$canGoBackToNavigatorMain$1 = new NavigatorRouter$canGoBackToNavigatorMain$1(eVar, continuationImpl);
        Object obj2 = navigatorRouter$canGoBackToNavigatorMain$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigatorRouter$canGoBackToNavigatorMain$1.label;
        if (i != 0) {
        }
        boolean z2 = ((tc50) obj2).a;
        ud50 ud50Var2 = (ud50) eVar.x;
        return Boolean.valueOf((z2 || ((ud50Var2 != null ? ud50Var2.b : null) instanceof ob50)) ? false : true);
    }

    public static final void R(e eVar) {
        tje.N(eVar.o(), null, null, new NavigatorRouter$handleExitAfterFinish$1(eVar, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0087, code lost:
    
        if (r12 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object S(e eVar, zzs zzsVar, String str, ud50 ud50Var, ContinuationImpl continuationImpl) {
        NavigatorRouter$startFromDeeplink$1 navigatorRouter$startFromDeeplink$1;
        int i;
        Object obj;
        pe50 pe50Var;
        String str2;
        com.yandex.go.navigator.notifications.cartech.b bVar;
        pe50 pe50Var2;
        ud50 ud50Var2;
        List list;
        eVar.getClass();
        if (continuationImpl instanceof NavigatorRouter$startFromDeeplink$1) {
            navigatorRouter$startFromDeeplink$1 = (NavigatorRouter$startFromDeeplink$1) continuationImpl;
            int i2 = navigatorRouter$startFromDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigatorRouter$startFromDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = navigatorRouter$startFromDeeplink$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigatorRouter$startFromDeeplink$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    eVar.c0 = eVar.I.b(new sf30(11, eVar));
                    eVar.j(dpb.a);
                    d dVar = (d) eVar.G.get();
                    navigatorRouter$startFromDeeplink$1.L$0 = zzsVar;
                    navigatorRouter$startFromDeeplink$1.L$1 = null;
                    navigatorRouter$startFromDeeplink$1.L$2 = ud50Var;
                    navigatorRouter$startFromDeeplink$1.label = 1;
                    Object a = dVar.a(zzsVar, str, navigatorRouter$startFromDeeplink$1);
                    obj = a;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        pe50Var2 = (pe50) navigatorRouter$startFromDeeplink$1.L$3;
                        ud50Var2 = (ud50) navigatorRouter$startFromDeeplink$1.L$2;
                        kotlin.b.b(obj2);
                        List list2 = pe50Var2.b;
                        pe50 c = eVar.D.c();
                        list = c != null ? c.b : null;
                        if (list == null) {
                            list = EmptyList.a;
                        }
                        eVar.T();
                        if (eVar.F.a() || !jl40.l(list2, list)) {
                            eVar.V(false, pe50Var2);
                            return zy11Var;
                        }
                        eVar.W(new dlm(true, ud50Var2.e));
                        return zy11Var;
                    }
                    ud50Var = (ud50) navigatorRouter$startFromDeeplink$1.L$2;
                    zzsVar = (zzs) navigatorRouter$startFromDeeplink$1.L$0;
                    kotlin.b.b(obj2);
                    obj = obj2;
                }
                pe50Var = (pe50) obj;
                if (pe50Var != null) {
                    eVar.Y(ud50Var);
                    return zy11Var;
                }
                if (jl40.l(ud50Var.b, lb50.b)) {
                    rd50 rd50Var = ud50Var instanceof rd50 ? (rd50) ud50Var : null;
                    if (rd50Var != null) {
                        str2 = rd50Var.g;
                        bVar = eVar.L;
                        navigatorRouter$startFromDeeplink$1.L$0 = null;
                        navigatorRouter$startFromDeeplink$1.L$1 = null;
                        navigatorRouter$startFromDeeplink$1.L$2 = ud50Var;
                        navigatorRouter$startFromDeeplink$1.L$3 = pe50Var;
                        navigatorRouter$startFromDeeplink$1.L$4 = null;
                        navigatorRouter$startFromDeeplink$1.label = 2;
                        if (bVar.a(zzsVar, str2, navigatorRouter$startFromDeeplink$1) != obj3) {
                            pe50Var2 = pe50Var;
                            ud50Var2 = ud50Var;
                            List list22 = pe50Var2.b;
                            pe50 c2 = eVar.D.c();
                            if (c2 != null) {
                            }
                            if (list == null) {
                            }
                            eVar.T();
                            if (eVar.F.a()) {
                            }
                            eVar.V(false, pe50Var2);
                            return zy11Var;
                        }
                        return obj3;
                    }
                }
                str2 = null;
                bVar = eVar.L;
                navigatorRouter$startFromDeeplink$1.L$0 = null;
                navigatorRouter$startFromDeeplink$1.L$1 = null;
                navigatorRouter$startFromDeeplink$1.L$2 = ud50Var;
                navigatorRouter$startFromDeeplink$1.L$3 = pe50Var;
                navigatorRouter$startFromDeeplink$1.L$4 = null;
                navigatorRouter$startFromDeeplink$1.label = 2;
                if (bVar.a(zzsVar, str2, navigatorRouter$startFromDeeplink$1) != obj3) {
                }
                return obj3;
            }
        }
        navigatorRouter$startFromDeeplink$1 = new NavigatorRouter$startFromDeeplink$1(eVar, continuationImpl);
        Object obj22 = navigatorRouter$startFromDeeplink$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigatorRouter$startFromDeeplink$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        pe50Var = (pe50) obj;
        if (pe50Var != null) {
        }
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        this.W.b(true);
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        this.W.b(false);
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        Navigation navigation;
        this.U.e = false;
        this.V.b(new ej40(16), true);
        com.yandex.go.navigator.ui.b bVar = (com.yandex.go.navigator.ui.b) this.N.get();
        bVar.K.cancel();
        bVar.K = g18.u1;
        wb50 wb50Var = bVar.D;
        gh00 gh00Var = (gh00) wb50Var.a;
        if (gh00Var.a.e(wb50Var)) {
            wb50Var.d();
            gh00Var.r(wb50Var);
        }
        bVar.C.detach();
        bVar.z.showBlockedZones();
        bVar.w.Cg();
        bVar.B.d.b();
        bVar.y.b(new ej40(12), false);
        if (!this.F.a() && (navigation = this.J.w) != null) {
            navigation.resetRoutes();
        }
        dt20 dt20Var = this.R;
        ((ru.yandex.taxi.analytics.j) ((lx4) dt20Var.b)).m.o.remove((cm9) dt20Var.x);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        ud50 ud50Var = (ud50) obj;
        rd50 rd50Var = ud50Var instanceof rd50 ? (rd50) ud50Var : null;
        if (!this.F.a()) {
            boolean z = ud50Var.b instanceof nb50;
            mf50 mf50Var = this.O;
            mf50Var.c = z;
            mf50Var.b.a().u("is_launched_from_drive", z);
        }
        if (rd50Var != null) {
            tje.N(o(), null, null, new NavigatorRouter$startNavigator$1(this, ud50Var, rd50Var.h, null), 3);
        } else {
            Y(ud50Var);
        }
        this.Z.a = ud50Var.b.a;
        dt20 dt20Var = this.R;
        ((ru.yandex.taxi.analytics.j) ((lx4) dt20Var.b)).m.o.add((cm9) dt20Var.x);
        ((com.yandex.go.navigator.ui.b) this.N.get()).attach();
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.b0;
    }

    public final void T() {
        SimpleSpinnerModalView simpleSpinnerModalView = this.c0;
        if (simpleSpinnerModalView != null) {
            simpleSpinnerModalView.dismiss();
        }
        this.c0 = null;
    }

    public final void U() {
        this.D.b.l(null);
        this.J.a();
        r(new qu(9));
    }

    public final void V(boolean z, pe50 pe50Var) {
        ud50 ud50Var = (ud50) this.x;
        if (ud50Var != null && !ud50Var.d) {
            D((m950) this.P.get(), new dg50(z, new hfl0(pe50Var)), new jlm(this, 2));
        } else {
            if (!this.F.a()) {
                tje.N(o(), null, null, new NavigatorRouter$handleStartOnLaunch$1(this, pe50Var, z, null), 3);
                return;
            }
            T();
            ud50 ud50Var2 = (ud50) this.x;
            boolean z2 = false;
            if (ud50Var2 != null && ud50Var2.e) {
                z2 = true;
            }
            W(new dlm(true, z2));
        }
    }

    public final void W(dlm dlmVar) {
        if (dlmVar.a) {
            com.yandex.go.navigator.a aVar = (com.yandex.go.navigator.a) this.M.get();
            Location a = aVar.d.a();
            if (a != null) {
                Double speed = a.getSpeed();
                Float valueOf = speed != null ? Float.valueOf((float) speed.doubleValue()) : null;
                if (valueOf != null) {
                    aVar.f = com.yandex.go.navigator.a.d(valueOf);
                    aVar.g = Math.abs(aVar.f - ((gh00) aVar.a).j()) / 35.0f;
                }
                Double heading = a.getHeading();
                ((gh00) aVar.a).H(new CameraPosition(a.getPosition(), aVar.f, heading != null ? (float) heading.doubleValue() : ((gh00) aVar.a).e.c.getAzimuth(), 0.0f));
            }
        }
        D((m950) this.E.get(), dlmVar, new xe50(this));
    }

    public final void X() {
        C((m950) this.S.get(), new ye50(this));
    }

    public final void Y(ud50 ud50Var) {
        tje.N(o(), null, null, new NavigatorRouter$startFromPayload$1(this, null), 3);
        if ((ud50Var instanceof td50) || (ud50Var instanceof rd50)) {
            tje.N(o(), null, null, new NavigatorRouter$startFromPayload$2(this, null), 3);
        } else if (this.F.a()) {
            T();
            W(new dlm(true, ud50Var.e));
        } else {
            T();
            X();
        }
    }
}
