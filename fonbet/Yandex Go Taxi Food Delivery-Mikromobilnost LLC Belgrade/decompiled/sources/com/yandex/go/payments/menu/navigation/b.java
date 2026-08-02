package com.yandex.go.payments.menu.navigation;

import com.yandex.go.payments.api.model.PaymentsScreen;
import com.yandex.go.payments.data.k;
import com.yandex.go.payments.domain.y;
import com.yandex.go.payments.experiments.g;
import com.yandex.go.payments.menu.domain.c;
import com.yandex.go.payments.menu.navigation.b;
import com.yandex.go.payments.navigation.LpmPaymentRouter$UiMode;
import defpackage.a750;
import defpackage.ama;
import defpackage.azz;
import defpackage.bca0;
import defpackage.bzz;
import defpackage.c750;
import defpackage.cz51;
import defpackage.dy90;
import defpackage.e2a1;
import defpackage.f9y0;
import defpackage.ffa0;
import defpackage.h0a0;
import defpackage.h3y;
import defpackage.h55;
import defpackage.h9a0;
import defpackage.ida0;
import defpackage.kw;
import defpackage.l90;
import defpackage.lm10;
import defpackage.lv90;
import defpackage.m6a0;
import defpackage.m950;
import defpackage.mca0;
import defpackage.ny61;
import defpackage.o8h;
import defpackage.qaa0;
import defpackage.qmp;
import defpackage.raa0;
import defpackage.ryz;
import defpackage.t32;
import defpackage.tje;
import defpackage.u32;
import defpackage.u991;
import defpackage.uba0;
import defpackage.uj4;
import defpackage.uk10;
import defpackage.vba0;
import defpackage.vez0;
import defpackage.vj4;
import defpackage.w511;
import defpackage.w9a0;
import defpackage.wjd0;
import defpackage.wma0;
import defpackage.wqw;
import defpackage.wui;
import defpackage.xea0;
import defpackage.xku0;
import defpackage.yvf0;
import defpackage.z80;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.animation.NavigationDirection;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes8.dex */
public final class b extends h55 {
    public final xku0 D;
    public final yvf0 E;
    public final vj4 F;
    public final o8h G;
    public final qmp H;
    public final yvf0 I;
    public final c750 J;
    public final com.yandex.go.payments.superapp.payment.b K;
    public final h3y L;
    public final ryz M;
    public final h3y N;
    public final yvf0 O;
    public final raa0 P;
    public final com.yandex.go.payments.shared.a Q;
    public final c R;
    public final h3y S;
    public final h3y T;
    public final h3y U;
    public final h3y V;
    public final k W;
    public final g Z;
    public final f9y0 a0;
    public dy90 b0;

    public b(xku0 xku0Var, yvf0 yvf0Var, vj4 vj4Var, o8h o8hVar, qmp qmpVar, yvf0 yvf0Var2, c750 c750Var, com.yandex.go.payments.superapp.payment.b bVar, h3y h3yVar, ryz ryzVar, h3y h3yVar2, yvf0 yvf0Var3, raa0 raa0Var, com.yandex.go.payments.shared.a aVar, c cVar, h3y h3yVar3, h3y h3yVar4, h3y h3yVar5, h3y h3yVar6, k kVar, g gVar, f9y0 f9y0Var) {
        super(null);
        this.D = xku0Var;
        this.E = yvf0Var;
        this.F = vj4Var;
        this.G = o8hVar;
        this.H = qmpVar;
        this.I = yvf0Var2;
        this.J = c750Var;
        this.K = bVar;
        this.L = h3yVar;
        this.M = ryzVar;
        this.N = h3yVar2;
        this.O = yvf0Var3;
        this.P = raa0Var;
        this.Q = aVar;
        this.R = cVar;
        this.S = h3yVar3;
        this.T = h3yVar4;
        this.U = h3yVar5;
        this.V = h3yVar6;
        this.W = kVar;
        this.Z = gVar;
        this.a0 = f9y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(b bVar, wqw wqwVar, ContinuationImpl continuationImpl) {
        MenuPaymentMethodsListRouter$openNameEditScreen$1 menuPaymentMethodsListRouter$openNameEditScreen$1;
        int i;
        mca0 mca0Var;
        bVar.getClass();
        if (continuationImpl instanceof MenuPaymentMethodsListRouter$openNameEditScreen$1) {
            menuPaymentMethodsListRouter$openNameEditScreen$1 = (MenuPaymentMethodsListRouter$openNameEditScreen$1) continuationImpl;
            int i2 = menuPaymentMethodsListRouter$openNameEditScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                menuPaymentMethodsListRouter$openNameEditScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = menuPaymentMethodsListRouter$openNameEditScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = menuPaymentMethodsListRouter$openNameEditScreen$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    z80 z80Var = (z80) wqwVar;
                    mca0 mca0Var2 = new mca0(z80Var.d(), new xea0(z80Var.c(), PaymentMethod$Type.CARD));
                    y yVar = (y) bVar.N.get();
                    menuPaymentMethodsListRouter$openNameEditScreen$1.L$0 = null;
                    menuPaymentMethodsListRouter$openNameEditScreen$1.L$1 = mca0Var2;
                    menuPaymentMethodsListRouter$openNameEditScreen$1.label = 1;
                    if (yVar.d(menuPaymentMethodsListRouter$openNameEditScreen$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    mca0Var = mca0Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mca0Var = (mca0) menuPaymentMethodsListRouter$openNameEditScreen$1.L$1;
                    kotlin.b.b(obj);
                }
                bVar.A((m950) bVar.O.get(), mca0Var, new wui(bVar, 24));
                return zy11.a;
            }
        }
        menuPaymentMethodsListRouter$openNameEditScreen$1 = new MenuPaymentMethodsListRouter$openNameEditScreen$1(bVar, continuationImpl);
        Object obj2 = menuPaymentMethodsListRouter$openNameEditScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = menuPaymentMethodsListRouter$openNameEditScreen$1.label;
        if (i != 0) {
        }
        bVar.A((m950) bVar.O.get(), mca0Var, new wui(bVar, 24));
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(final b bVar, h9a0 h9a0Var, ContinuationImpl continuationImpl) {
        MenuPaymentMethodsListRouter$openPaymentsList$1 menuPaymentMethodsListRouter$openPaymentsList$1;
        int i;
        Object obj;
        int i2;
        int i3;
        final boolean z;
        m6a0 c0;
        h0a0 c;
        h9a0 h9a0Var2 = h9a0Var;
        qmp qmpVar = bVar.H;
        o8h o8hVar = bVar.G;
        if (continuationImpl instanceof MenuPaymentMethodsListRouter$openPaymentsList$1) {
            menuPaymentMethodsListRouter$openPaymentsList$1 = (MenuPaymentMethodsListRouter$openPaymentsList$1) continuationImpl;
            int i4 = menuPaymentMethodsListRouter$openPaymentsList$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                menuPaymentMethodsListRouter$openPaymentsList$1.label = i4 - Integer.MIN_VALUE;
                Object obj2 = menuPaymentMethodsListRouter$openPaymentsList$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = menuPaymentMethodsListRouter$openPaymentsList$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    boolean z2 = h9a0Var2.d;
                    g gVar = bVar.Z;
                    menuPaymentMethodsListRouter$openPaymentsList$1.L$0 = h9a0Var2;
                    menuPaymentMethodsListRouter$openPaymentsList$1.I$0 = 0;
                    menuPaymentMethodsListRouter$openPaymentsList$1.label = 1;
                    Object b = gVar.b(menuPaymentMethodsListRouter$openPaymentsList$1);
                    if (b != obj3) {
                        obj = b;
                        i2 = 0;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return obj2;
                }
                int i5 = menuPaymentMethodsListRouter$openPaymentsList$1.I$0;
                h9a0 h9a0Var3 = (h9a0) menuPaymentMethodsListRouter$openPaymentsList$1.L$0;
                kotlin.b.b(obj2);
                i2 = i5;
                h9a0Var2 = h9a0Var3;
                obj = obj2;
                if (!((Boolean) obj).booleanValue()) {
                    o8hVar.getClass();
                    qmpVar.getClass();
                    String str = h9a0Var2.e;
                    if (str == null || !e2a1.c(str)) {
                        i3 = 0;
                        if (i3 == 0) {
                            z = i2 == 0;
                            menuPaymentMethodsListRouter$openPaymentsList$1.L$0 = null;
                            menuPaymentMethodsListRouter$openPaymentsList$1.I$0 = i2;
                            menuPaymentMethodsListRouter$openPaymentsList$1.I$1 = i3;
                            menuPaymentMethodsListRouter$openPaymentsList$1.label = 2;
                            Object S = bVar.S(h9a0Var2, menuPaymentMethodsListRouter$openPaymentsList$1, z);
                            return S == obj3 ? obj3 : S;
                        }
                        z = i2 == 0;
                        o8hVar.getClass();
                        qmpVar.getClass();
                        String str2 = h9a0Var2.e;
                        if (str2 == null) {
                            str2 = TariffOrderFlow.ORDER_FLOW_TAXI_KEY;
                        }
                        final boolean equals = str2.equals(TariffOrderFlow.ORDER_FLOW_TAXI_KEY);
                        uba0 uba0Var = new uba0((cz51) null, (uk10) null, new a(bVar, z), bVar.a0.a(null), (w9a0) null, 51);
                        com.yandex.go.payments.superapp.payment.b bVar2 = bVar.K;
                        u32.a.getClass();
                        final dy90 a = bVar2.a(str2, t32.b, new l90(), uba0Var);
                        bVar.b0 = a;
                        m950 a2 = a.a.a();
                        qaa0 a3 = bVar.P.a();
                        zzs zzsVar = a3 != null ? a3.b : null;
                        if (!equals) {
                            lv90 b2 = bVar.W.b(str2.concat("_no_feature"));
                            if (b2 != null) {
                                c0 = vez0.c0(b2, null);
                                m6a0 m6a0Var = c0;
                                PaymentsScreen paymentsScreen = PaymentsScreen.MENU;
                                if (zzsVar == null) {
                                }
                                h0a0 h0a0Var = c;
                                LpmPaymentRouter$UiMode lpmPaymentRouter$UiMode = LpmPaymentRouter$UiMode.FULLSCREEN;
                                NavigationDirection navigationDirection = bVar.J.a;
                                wjd0 wjd0Var = h9a0Var2.c;
                                bVar.A(a2, new azz(paymentsScreen, "no_feature", h0a0Var, m6a0Var, true, true, null, false, false, lpmPaymentRouter$UiMode, navigationDirection, wjd0Var == null ? new kw(wjd0Var.c(), wjd0Var.b(), wjd0Var.a(), wjd0Var.d(), false) : null, new bzz() { // from class: km10
                                    @Override // defpackage.bzz
                                    public final ffa0 a(yyz yyzVar) {
                                        ffa0 yyzVar2;
                                        if (equals) {
                                            b bVar3 = bVar;
                                            yyzVar2 = z ? (ffa0) bVar3.T.get() : (ffa0) bVar3.U.get();
                                        } else {
                                            yyzVar2 = new yyz(1, a);
                                        }
                                        return new myz(yyzVar, yyzVar2, 2);
                                    }
                                }, null, null, null, null, null, 508800), new ama(3, bVar));
                                return zy11.a;
                            }
                            c0 = null;
                            m6a0 m6a0Var2 = c0;
                            PaymentsScreen paymentsScreen2 = PaymentsScreen.MENU;
                            if (zzsVar == null) {
                            }
                            h0a0 h0a0Var2 = c;
                            LpmPaymentRouter$UiMode lpmPaymentRouter$UiMode2 = LpmPaymentRouter$UiMode.FULLSCREEN;
                            NavigationDirection navigationDirection2 = bVar.J.a;
                            wjd0 wjd0Var2 = h9a0Var2.c;
                            bVar.A(a2, new azz(paymentsScreen2, "no_feature", h0a0Var2, m6a0Var2, true, true, null, false, false, lpmPaymentRouter$UiMode2, navigationDirection2, wjd0Var2 == null ? new kw(wjd0Var2.c(), wjd0Var2.b(), wjd0Var2.a(), wjd0Var2.d(), false) : null, new bzz() { // from class: km10
                                @Override // defpackage.bzz
                                public final ffa0 a(yyz yyzVar) {
                                    ffa0 yyzVar2;
                                    if (equals) {
                                        b bVar3 = bVar;
                                        yyzVar2 = z ? (ffa0) bVar3.T.get() : (ffa0) bVar3.U.get();
                                    } else {
                                        yyzVar2 = new yyz(1, a);
                                    }
                                    return new myz(yyzVar, yyzVar2, 2);
                                }
                            }, null, null, null, null, null, 508800), new ama(3, bVar));
                            return zy11.a;
                        }
                        lv90 a4 = bVar.D.a.a();
                        PaymentMethod$Type paymentMethod$Type = a4.a;
                        if (paymentMethod$Type != null) {
                            c0 = new m6a0(paymentMethod$Type, a4.b, null);
                            m6a0 m6a0Var22 = c0;
                            PaymentsScreen paymentsScreen22 = PaymentsScreen.MENU;
                            if (zzsVar == null) {
                                c = new h0a0(zzsVar);
                            } else {
                                h0a0 h0a0Var3 = h0a0.c;
                                c = u991.c();
                            }
                            h0a0 h0a0Var22 = c;
                            LpmPaymentRouter$UiMode lpmPaymentRouter$UiMode22 = LpmPaymentRouter$UiMode.FULLSCREEN;
                            NavigationDirection navigationDirection22 = bVar.J.a;
                            wjd0 wjd0Var22 = h9a0Var2.c;
                            bVar.A(a2, new azz(paymentsScreen22, "no_feature", h0a0Var22, m6a0Var22, true, true, null, false, false, lpmPaymentRouter$UiMode22, navigationDirection22, wjd0Var22 == null ? new kw(wjd0Var22.c(), wjd0Var22.b(), wjd0Var22.a(), wjd0Var22.d(), false) : null, new bzz() { // from class: km10
                                @Override // defpackage.bzz
                                public final ffa0 a(yyz yyzVar) {
                                    ffa0 yyzVar2;
                                    if (equals) {
                                        b bVar3 = bVar;
                                        yyzVar2 = z ? (ffa0) bVar3.T.get() : (ffa0) bVar3.U.get();
                                    } else {
                                        yyzVar2 = new yyz(1, a);
                                    }
                                    return new myz(yyzVar, yyzVar2, 2);
                                }
                            }, null, null, null, null, null, 508800), new ama(3, bVar));
                            return zy11.a;
                        }
                        c0 = null;
                        m6a0 m6a0Var222 = c0;
                        PaymentsScreen paymentsScreen222 = PaymentsScreen.MENU;
                        if (zzsVar == null) {
                        }
                        h0a0 h0a0Var222 = c;
                        LpmPaymentRouter$UiMode lpmPaymentRouter$UiMode222 = LpmPaymentRouter$UiMode.FULLSCREEN;
                        NavigationDirection navigationDirection222 = bVar.J.a;
                        wjd0 wjd0Var222 = h9a0Var2.c;
                        bVar.A(a2, new azz(paymentsScreen222, "no_feature", h0a0Var222, m6a0Var222, true, true, null, false, false, lpmPaymentRouter$UiMode222, navigationDirection222, wjd0Var222 == null ? new kw(wjd0Var222.c(), wjd0Var222.b(), wjd0Var222.a(), wjd0Var222.d(), false) : null, new bzz() { // from class: km10
                            @Override // defpackage.bzz
                            public final ffa0 a(yyz yyzVar) {
                                ffa0 yyzVar2;
                                if (equals) {
                                    b bVar3 = bVar;
                                    yyzVar2 = z ? (ffa0) bVar3.T.get() : (ffa0) bVar3.U.get();
                                } else {
                                    yyzVar2 = new yyz(1, a);
                                }
                                return new myz(yyzVar, yyzVar2, 2);
                            }
                        }, null, null, null, null, null, 508800), new ama(3, bVar));
                        return zy11.a;
                    }
                }
                i3 = 1;
                if (i3 == 0) {
                }
            }
        }
        menuPaymentMethodsListRouter$openPaymentsList$1 = new MenuPaymentMethodsListRouter$openPaymentsList$1(bVar, continuationImpl);
        Object obj22 = menuPaymentMethodsListRouter$openPaymentsList$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = menuPaymentMethodsListRouter$openPaymentsList$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        i3 = 1;
        if (i3 == 0) {
        }
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        dy90 dy90Var = this.b0;
        if (dy90Var != null) {
            dy90Var.dispose();
        }
        this.b0 = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new MenuPaymentMethodsListRouter$onLaunch$1(this, (h9a0) obj, null), 3);
        this.Q.c.b.set(false);
        c750 c750Var = this.J;
        NavigationDirection navigationDirection = c750Var.a;
        NavigationDirection navigationDirection2 = NavigationDirection.BACKWARD;
        if (navigationDirection == navigationDirection2) {
            int i = a750.a[navigationDirection.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    navigationDirection2 = NavigationDirection.FORWARD;
                } else {
                    if (i != 3) {
                        w511.b();
                        return;
                    }
                    navigationDirection2 = NavigationDirection.NO_ANIMATE;
                }
            }
            c750Var.a = navigationDirection2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object R(h9a0 h9a0Var, ContinuationImpl continuationImpl, boolean z) {
        MenuPaymentMethodsListRouter$createPmlPayload$1 menuPaymentMethodsListRouter$createPmlPayload$1;
        int i;
        h9a0 h9a0Var2;
        boolean z2;
        if (continuationImpl instanceof MenuPaymentMethodsListRouter$createPmlPayload$1) {
            menuPaymentMethodsListRouter$createPmlPayload$1 = (MenuPaymentMethodsListRouter$createPmlPayload$1) continuationImpl;
            int i2 = menuPaymentMethodsListRouter$createPmlPayload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                menuPaymentMethodsListRouter$createPmlPayload$1.label = i2 - Integer.MIN_VALUE;
                Object obj = menuPaymentMethodsListRouter$createPmlPayload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = menuPaymentMethodsListRouter$createPmlPayload$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PaymentsScreen paymentsScreen = PaymentsScreen.MENU;
                    menuPaymentMethodsListRouter$createPmlPayload$1.L$0 = h9a0Var;
                    menuPaymentMethodsListRouter$createPmlPayload$1.Z$0 = z;
                    menuPaymentMethodsListRouter$createPmlPayload$1.label = 1;
                    obj = ((com.yandex.go.payments.badges.a) this.F).a(TariffOrderFlow.ORDER_FLOW_TAXI_KEY, null, paymentsScreen, menuPaymentMethodsListRouter$createPmlPayload$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    h9a0Var2 = h9a0Var;
                    z2 = z;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = menuPaymentMethodsListRouter$createPmlPayload$1.Z$0;
                    h9a0Var2 = (h9a0) menuPaymentMethodsListRouter$createPmlPayload$1.L$0;
                    kotlin.b.b(obj);
                }
                uj4 uj4Var = (uj4) obj;
                PaymentsScreen paymentsScreen2 = PaymentsScreen.MENU;
                NavigationDirection navigationDirection = this.J.a;
                wjd0 wjd0Var = h9a0Var2.c;
                return new ida0(new vba0(paymentsScreen2, new bca0(navigationDirection, wjd0Var == null ? new kw(wjd0Var.c(), wjd0Var.b(), wjd0Var.a(), wjd0Var.d(), false) : null, z2), new wma0(EmptyList.a), null, TariffOrderFlow.ORDER_FLOW_TAXI_KEY, uj4Var, h9a0Var2.f, 8), !z2 ? (ffa0) this.T.get() : (ffa0) this.U.get(), this.R.c(z2), null, new uba0((cz51) null, (uk10) null, new a(this, z2), this.a0.a(null), (w9a0) null, 51));
            }
        }
        menuPaymentMethodsListRouter$createPmlPayload$1 = new MenuPaymentMethodsListRouter$createPmlPayload$1(this, continuationImpl);
        Object obj2 = menuPaymentMethodsListRouter$createPmlPayload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = menuPaymentMethodsListRouter$createPmlPayload$1.label;
        if (i != 0) {
        }
        uj4 uj4Var2 = (uj4) obj2;
        PaymentsScreen paymentsScreen22 = PaymentsScreen.MENU;
        NavigationDirection navigationDirection2 = this.J.a;
        wjd0 wjd0Var2 = h9a0Var2.c;
        return new ida0(new vba0(paymentsScreen22, new bca0(navigationDirection2, wjd0Var2 == null ? new kw(wjd0Var2.c(), wjd0Var2.b(), wjd0Var2.a(), wjd0Var2.d(), false) : null, z2), new wma0(EmptyList.a), null, TariffOrderFlow.ORDER_FLOW_TAXI_KEY, uj4Var2, h9a0Var2.f, 8), !z2 ? (ffa0) this.T.get() : (ffa0) this.U.get(), this.R.c(z2), null, new uba0((cz51) null, (uk10) null, new a(this, z2), this.a0.a(null), (w9a0) null, 51));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(h9a0 h9a0Var, ContinuationImpl continuationImpl, boolean z) {
        MenuPaymentMethodsListRouter$openPmPaymentsList$1 menuPaymentMethodsListRouter$openPmPaymentsList$1;
        int i;
        m950 m950Var;
        b bVar;
        if (continuationImpl instanceof MenuPaymentMethodsListRouter$openPmPaymentsList$1) {
            menuPaymentMethodsListRouter$openPmPaymentsList$1 = (MenuPaymentMethodsListRouter$openPmPaymentsList$1) continuationImpl;
            int i2 = menuPaymentMethodsListRouter$openPmPaymentsList$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                menuPaymentMethodsListRouter$openPmPaymentsList$1.label = i2 - Integer.MIN_VALUE;
                Object obj = menuPaymentMethodsListRouter$openPmPaymentsList$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = menuPaymentMethodsListRouter$openPmPaymentsList$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    m950 m950Var2 = (m950) this.I.get();
                    menuPaymentMethodsListRouter$openPmPaymentsList$1.L$0 = null;
                    menuPaymentMethodsListRouter$openPmPaymentsList$1.L$1 = this;
                    menuPaymentMethodsListRouter$openPmPaymentsList$1.L$2 = m950Var2;
                    menuPaymentMethodsListRouter$openPmPaymentsList$1.Z$0 = z;
                    menuPaymentMethodsListRouter$openPmPaymentsList$1.label = 1;
                    Object R = R(h9a0Var, menuPaymentMethodsListRouter$openPmPaymentsList$1, z);
                    if (R == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = R;
                    m950Var = m950Var2;
                    bVar = this;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m950Var = (m950) menuPaymentMethodsListRouter$openPmPaymentsList$1.L$2;
                    bVar = (b) menuPaymentMethodsListRouter$openPmPaymentsList$1.L$1;
                    kotlin.b.b(obj);
                }
                bVar.A(m950Var, obj, new lm10(this, 0));
                return zy11.a;
            }
        }
        menuPaymentMethodsListRouter$openPmPaymentsList$1 = new MenuPaymentMethodsListRouter$openPmPaymentsList$1(this, continuationImpl);
        Object obj2 = menuPaymentMethodsListRouter$openPmPaymentsList$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = menuPaymentMethodsListRouter$openPmPaymentsList$1.label;
        if (i != 0) {
        }
        bVar.A(m950Var, obj2, new lm10(this, 0));
        return zy11.a;
    }
}
