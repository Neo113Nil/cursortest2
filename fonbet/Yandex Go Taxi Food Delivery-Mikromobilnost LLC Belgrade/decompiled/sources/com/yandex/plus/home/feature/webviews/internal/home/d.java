package com.yandex.plus.home.feature.webviews.internal.home;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.core.config.Environment;
import com.yandex.plus.home.api.config.PlusHomeBundle;
import com.yandex.plus.home.feature.webviews.internal.home.b;
import com.yandex.plus.home.feature.webviews.internal.home.d;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$Source;
import defpackage.bbd0;
import defpackage.bzd0;
import defpackage.cfd0;
import defpackage.cjw0;
import defpackage.dc20;
import defpackage.dfd0;
import defpackage.f27;
import defpackage.fsd0;
import defpackage.gov;
import defpackage.gsd0;
import defpackage.h0w;
import defpackage.h27;
import defpackage.hov;
import defpackage.hsd0;
import defpackage.i3y;
import defpackage.ijd0;
import defpackage.imd0;
import defpackage.iz4;
import defpackage.jln;
import defpackage.jse;
import defpackage.kio;
import defpackage.nsu;
import defpackage.ozg;
import defpackage.p3d0;
import defpackage.p4z;
import defpackage.pt80;
import defpackage.pzt0;
import defpackage.qio;
import defpackage.rzf0;
import defpackage.s4d0;
import defpackage.skd0;
import defpackage.sls;
import defpackage.so41;
import defpackage.tpp0;
import defpackage.tse;
import defpackage.u4d0;
import defpackage.uio;
import defpackage.ul60;
import defpackage.uu60;
import defpackage.v920;
import defpackage.vio;
import defpackage.w350;
import defpackage.wio;
import defpackage.y4a0;
import defpackage.y821;
import defpackage.z17;
import defpackage.z250;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public final class d extends iz4 implements p3d0, so41, w350 {
    public final uio A;
    public final qio B;
    public final String C;
    public final Map D;
    public final ijd0 E;
    public final cjw0 F;
    public final v920 G;
    public final com.yandex.plus.home.feature.webviews.internal.container.b H;
    public final boolean I;
    public final String J;
    public final y821 K;
    public final com.yandex.plus.home.api.prefetch.a L;
    public final z17 M;
    public final com.yandex.plus.home.feature.webviews.internal.purchase.subscription.a N;
    public final hov O;
    public final fsd0 P;
    public final uu60 Q;
    public final bzd0 R;
    public final ul60 S;
    public boolean T;
    public pzt0 U;
    public boolean V;
    public final gsd0 W;
    public final i3y X;
    public final i3y Y;
    public final c Z;
    public final i3y a0;
    public final i3y b0;
    public final i3y c0;
    public final ozg f;
    public final PlusHomeBundle g;
    public final jse h;
    public final jse i;
    public final jse j;
    public final com.yandex.plus.home.feature.webviews.internalapi.bridge.a k;
    public final p4z l;
    public final com.yandex.plus.home.feature.webviews.internal.settings.domain.b m;
    public final jln n;
    public final imd0 o;
    public final wio p;
    public final vio q;
    public final dc20 r;
    public final sls s;
    public final com.yandex.plus.home.auth.b t;
    public final y4a0 u;
    public final com.yandex.plus.home.feature.webviews.internal.d v;
    public final com.yandex.plus.home.feature.webviews.internal.c w;
    public final tpp0 x;
    public final Environment y;
    public final hsd0 z;

    public d(ozg ozgVar, PlusHomeBundle plusHomeBundle, jse jseVar, jse jseVar2, jse jseVar3, com.yandex.plus.home.feature.webviews.internalapi.bridge.a aVar, p4z p4zVar, com.yandex.plus.home.feature.webviews.internal.settings.domain.b bVar, jln jlnVar, imd0 imd0Var, wio wioVar, vio vioVar, kio kioVar, dc20 dc20Var, sls slsVar, com.yandex.plus.home.auth.b bVar2, y4a0 y4a0Var, com.yandex.plus.home.feature.webviews.internal.d dVar, com.yandex.plus.home.feature.webviews.internal.c cVar, tpp0 tpp0Var, Environment environment, hsd0 hsd0Var, uio uioVar, qio qioVar, String str, Map map, ijd0 ijd0Var, cjw0 cjw0Var, v920 v920Var, com.yandex.plus.home.feature.webviews.internal.container.b bVar3, boolean z, boolean z2, String str2, y821 y821Var, com.yandex.plus.home.api.prefetch.a aVar2, z17 z17Var, com.yandex.plus.home.feature.webviews.internal.purchase.subscription.a aVar3, hov hovVar, fsd0 fsd0Var, uu60 uu60Var, bzd0 bzd0Var, ul60 ul60Var) {
        super(jseVar, new u4d0());
        this.f = ozgVar;
        this.g = plusHomeBundle;
        this.h = jseVar;
        this.i = jseVar2;
        this.j = jseVar3;
        this.k = aVar;
        this.l = p4zVar;
        this.m = bVar;
        this.n = jlnVar;
        this.o = imd0Var;
        this.p = wioVar;
        this.q = vioVar;
        this.r = dc20Var;
        this.s = slsVar;
        this.t = bVar2;
        this.u = y4a0Var;
        this.v = dVar;
        this.w = cVar;
        this.x = tpp0Var;
        this.y = environment;
        this.z = hsd0Var;
        this.A = uioVar;
        this.B = qioVar;
        this.C = str;
        this.D = map;
        this.E = ijd0Var;
        this.F = cjw0Var;
        this.G = v920Var;
        this.H = bVar3;
        this.I = z;
        this.J = str2;
        this.K = y821Var;
        this.L = aVar2;
        this.M = z17Var;
        this.N = aVar3;
        this.O = hovVar;
        this.P = fsd0Var;
        this.Q = uu60Var;
        this.R = bzd0Var;
        this.S = ul60Var;
        this.W = new gsd0();
        final int i = 0;
        this.X = kotlin.a.a(new sls(this) { // from class: t4d0
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                d dVar2 = this.b;
                switch (i2) {
                    case 0:
                        return new b(dVar2);
                    default:
                        return dVar2.F.c();
                }
            }
        });
        this.Y = kotlin.a.a(new sls(this) { // from class: com.yandex.plus.home.feature.webviews.internal.home.a
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                switch (i) {
                    case 0:
                        d dVar2 = this.b;
                        return new com.yandex.plus.home.feature.webviews.internal.bridge.b(dVar2.K, new PlusHomeWebPresenter$updateTargetHandler$2$1(dVar2, null));
                    case 1:
                        d dVar3 = this.b;
                        z17 z17Var2 = dVar3.M;
                        PlusPaymentStat$Source plusPaymentStat$Source = PlusPaymentStat$Source.HOME;
                        PlusHomeWebPresenter$homeButtonSectionDelegate$2$1 plusHomeWebPresenter$homeButtonSectionDelegate$2$1 = new PlusHomeWebPresenter$homeButtonSectionDelegate$2$1(1, dVar3, d.class, "sendContractsMessage", "sendContractsMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0);
                        tse e = dVar3.e();
                        String str3 = dVar3.C;
                        Map map2 = dVar3.D;
                        if (map2 == null) {
                            map2 = kotlin.collections.b.f();
                        }
                        Map map3 = map2;
                        PlusHomeWebPresenter$homeButtonSectionDelegate$2$2 plusHomeWebPresenter$homeButtonSectionDelegate$2$2 = new PlusHomeWebPresenter$homeButtonSectionDelegate$2$2(0, dVar3.b, s4d0.class, "hideNativePayButton", "hideNativePayButton()V", 0);
                        PlusHomeWebPresenter$homeButtonSectionDelegate$2$3 plusHomeWebPresenter$homeButtonSectionDelegate$2$3 = new PlusHomeWebPresenter$homeButtonSectionDelegate$2$3(1, dVar3.b, s4d0.class, "showNativePayError", "showNativePayError(Lcom/yandex/plus/home/pay/PayError;)V", 0);
                        PlusHomeWebPresenter$homeButtonSectionDelegate$2$4 plusHomeWebPresenter$homeButtonSectionDelegate$2$4 = new PlusHomeWebPresenter$homeButtonSectionDelegate$2$4(1, dVar3.b, s4d0.class, "showNativePayButton", "showNativePayButton(Lcom/yandex/plus/home/feature/webviews/internal/purchase/pay/common/NativePayButtonConfig;)V", 0);
                        PlusHomeWebPresenter$homeButtonSectionDelegate$2$5 plusHomeWebPresenter$homeButtonSectionDelegate$2$5 = new PlusHomeWebPresenter$homeButtonSectionDelegate$2$5(0, dVar3.b, s4d0.class, "showHostBuyView", "showHostBuyView()V", 0);
                        PlusHomeWebPresenter$homeButtonSectionDelegate$2$6 plusHomeWebPresenter$homeButtonSectionDelegate$2$6 = new PlusHomeWebPresenter$homeButtonSectionDelegate$2$6(0, dVar3.b, s4d0.class, "cancelPayButtonLoading", "cancelPayButtonLoading()V", 0);
                        new cfd0();
                        dfd0 dfd0Var = new dfd0(str3, "purchase_button", "plus_home");
                        rzf0 rzf0Var = new rzf0(z17Var2.c, dfd0Var, plusPaymentStat$Source, z17Var2.e, z17Var2.i, z17Var2.h, plusHomeWebPresenter$homeButtonSectionDelegate$2$1, z17Var2.f, z17Var2.g);
                        return new com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.e(z17Var2.m, rzf0Var, new z250(z17Var2.k, rzf0Var), new h0w(3, z17Var2.p, z17Var2.o), new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.a(e, rzf0Var, new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.payment.a(z17Var2.c, dfd0Var, map3, rzf0Var, z17Var2.a, z17Var2.m, plusHomeWebPresenter$homeButtonSectionDelegate$2$2, plusHomeWebPresenter$homeButtonSectionDelegate$2$3, z17Var2.d, z17Var2.n), z17Var2.k, z17Var2.j, plusHomeWebPresenter$homeButtonSectionDelegate$2$4, plusHomeWebPresenter$homeButtonSectionDelegate$2$6), new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.host.a(e, rzf0Var, plusHomeWebPresenter$homeButtonSectionDelegate$2$5), z17Var2.l, z17Var2.b);
                    default:
                        d dVar4 = this.b;
                        return new nsu(dVar4.g, dVar4.x, new PlusHomeWebPresenter$hostPayProvider$2$1(1, dVar4, d.class, "sendContractsMessage", "sendContractsMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0), new PlusHomeWebPresenter$hostPayProvider$2$2(0, dVar4.Z, com.yandex.plus.home.feature.webviews.internal.a.class, "reload", "reload()V", 0), new PlusHomeWebPresenter$hostPayProvider$2$3(0, dVar4.b, s4d0.class, "hideHostBuyView", "hideHostBuyView()V", 0), dVar4.C, new PlusHomeWebPresenter$hostPayProvider$2$4(0, dVar4.k(), com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.e.class, "onPayButtonClicked", "onPayButtonClicked()V", 0), dVar4.A, PlusPaymentStat$Source.HOME, dVar4.B, dVar4.f.b);
                }
            }
        });
        this.Z = new c(this, ozgVar.a.toString(), bVar2, kioVar, v920Var, bVar3, z2, jseVar);
        final int i2 = 1;
        this.a0 = kotlin.a.a(new sls(this) { // from class: t4d0
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                d dVar2 = this.b;
                switch (i22) {
                    case 0:
                        return new b(dVar2);
                    default:
                        return dVar2.F.c();
                }
            }
        });
        this.b0 = kotlin.a.a(new sls(this) { // from class: com.yandex.plus.home.feature.webviews.internal.home.a
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        d dVar2 = this.b;
                        return new com.yandex.plus.home.feature.webviews.internal.bridge.b(dVar2.K, new PlusHomeWebPresenter$updateTargetHandler$2$1(dVar2, null));
                    case 1:
                        d dVar3 = this.b;
                        z17 z17Var2 = dVar3.M;
                        PlusPaymentStat$Source plusPaymentStat$Source = PlusPaymentStat$Source.HOME;
                        PlusHomeWebPresenter$homeButtonSectionDelegate$2$1 plusHomeWebPresenter$homeButtonSectionDelegate$2$1 = new PlusHomeWebPresenter$homeButtonSectionDelegate$2$1(1, dVar3, d.class, "sendContractsMessage", "sendContractsMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0);
                        tse e = dVar3.e();
                        String str3 = dVar3.C;
                        Map map2 = dVar3.D;
                        if (map2 == null) {
                            map2 = kotlin.collections.b.f();
                        }
                        Map map3 = map2;
                        PlusHomeWebPresenter$homeButtonSectionDelegate$2$2 plusHomeWebPresenter$homeButtonSectionDelegate$2$2 = new PlusHomeWebPresenter$homeButtonSectionDelegate$2$2(0, dVar3.b, s4d0.class, "hideNativePayButton", "hideNativePayButton()V", 0);
                        PlusHomeWebPresenter$homeButtonSectionDelegate$2$3 plusHomeWebPresenter$homeButtonSectionDelegate$2$3 = new PlusHomeWebPresenter$homeButtonSectionDelegate$2$3(1, dVar3.b, s4d0.class, "showNativePayError", "showNativePayError(Lcom/yandex/plus/home/pay/PayError;)V", 0);
                        PlusHomeWebPresenter$homeButtonSectionDelegate$2$4 plusHomeWebPresenter$homeButtonSectionDelegate$2$4 = new PlusHomeWebPresenter$homeButtonSectionDelegate$2$4(1, dVar3.b, s4d0.class, "showNativePayButton", "showNativePayButton(Lcom/yandex/plus/home/feature/webviews/internal/purchase/pay/common/NativePayButtonConfig;)V", 0);
                        PlusHomeWebPresenter$homeButtonSectionDelegate$2$5 plusHomeWebPresenter$homeButtonSectionDelegate$2$5 = new PlusHomeWebPresenter$homeButtonSectionDelegate$2$5(0, dVar3.b, s4d0.class, "showHostBuyView", "showHostBuyView()V", 0);
                        PlusHomeWebPresenter$homeButtonSectionDelegate$2$6 plusHomeWebPresenter$homeButtonSectionDelegate$2$6 = new PlusHomeWebPresenter$homeButtonSectionDelegate$2$6(0, dVar3.b, s4d0.class, "cancelPayButtonLoading", "cancelPayButtonLoading()V", 0);
                        new cfd0();
                        dfd0 dfd0Var = new dfd0(str3, "purchase_button", "plus_home");
                        rzf0 rzf0Var = new rzf0(z17Var2.c, dfd0Var, plusPaymentStat$Source, z17Var2.e, z17Var2.i, z17Var2.h, plusHomeWebPresenter$homeButtonSectionDelegate$2$1, z17Var2.f, z17Var2.g);
                        return new com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.e(z17Var2.m, rzf0Var, new z250(z17Var2.k, rzf0Var), new h0w(3, z17Var2.p, z17Var2.o), new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.a(e, rzf0Var, new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.payment.a(z17Var2.c, dfd0Var, map3, rzf0Var, z17Var2.a, z17Var2.m, plusHomeWebPresenter$homeButtonSectionDelegate$2$2, plusHomeWebPresenter$homeButtonSectionDelegate$2$3, z17Var2.d, z17Var2.n), z17Var2.k, z17Var2.j, plusHomeWebPresenter$homeButtonSectionDelegate$2$4, plusHomeWebPresenter$homeButtonSectionDelegate$2$6), new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.host.a(e, rzf0Var, plusHomeWebPresenter$homeButtonSectionDelegate$2$5), z17Var2.l, z17Var2.b);
                    default:
                        d dVar4 = this.b;
                        return new nsu(dVar4.g, dVar4.x, new PlusHomeWebPresenter$hostPayProvider$2$1(1, dVar4, d.class, "sendContractsMessage", "sendContractsMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0), new PlusHomeWebPresenter$hostPayProvider$2$2(0, dVar4.Z, com.yandex.plus.home.feature.webviews.internal.a.class, "reload", "reload()V", 0), new PlusHomeWebPresenter$hostPayProvider$2$3(0, dVar4.b, s4d0.class, "hideHostBuyView", "hideHostBuyView()V", 0), dVar4.C, new PlusHomeWebPresenter$hostPayProvider$2$4(0, dVar4.k(), com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.e.class, "onPayButtonClicked", "onPayButtonClicked()V", 0), dVar4.A, PlusPaymentStat$Source.HOME, dVar4.B, dVar4.f.b);
                }
            }
        });
        final int i3 = 2;
        this.c0 = kotlin.a.a(new sls(this) { // from class: com.yandex.plus.home.feature.webviews.internal.home.a
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        d dVar2 = this.b;
                        return new com.yandex.plus.home.feature.webviews.internal.bridge.b(dVar2.K, new PlusHomeWebPresenter$updateTargetHandler$2$1(dVar2, null));
                    case 1:
                        d dVar3 = this.b;
                        z17 z17Var2 = dVar3.M;
                        PlusPaymentStat$Source plusPaymentStat$Source = PlusPaymentStat$Source.HOME;
                        PlusHomeWebPresenter$homeButtonSectionDelegate$2$1 plusHomeWebPresenter$homeButtonSectionDelegate$2$1 = new PlusHomeWebPresenter$homeButtonSectionDelegate$2$1(1, dVar3, d.class, "sendContractsMessage", "sendContractsMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0);
                        tse e = dVar3.e();
                        String str3 = dVar3.C;
                        Map map2 = dVar3.D;
                        if (map2 == null) {
                            map2 = kotlin.collections.b.f();
                        }
                        Map map3 = map2;
                        PlusHomeWebPresenter$homeButtonSectionDelegate$2$2 plusHomeWebPresenter$homeButtonSectionDelegate$2$2 = new PlusHomeWebPresenter$homeButtonSectionDelegate$2$2(0, dVar3.b, s4d0.class, "hideNativePayButton", "hideNativePayButton()V", 0);
                        PlusHomeWebPresenter$homeButtonSectionDelegate$2$3 plusHomeWebPresenter$homeButtonSectionDelegate$2$3 = new PlusHomeWebPresenter$homeButtonSectionDelegate$2$3(1, dVar3.b, s4d0.class, "showNativePayError", "showNativePayError(Lcom/yandex/plus/home/pay/PayError;)V", 0);
                        PlusHomeWebPresenter$homeButtonSectionDelegate$2$4 plusHomeWebPresenter$homeButtonSectionDelegate$2$4 = new PlusHomeWebPresenter$homeButtonSectionDelegate$2$4(1, dVar3.b, s4d0.class, "showNativePayButton", "showNativePayButton(Lcom/yandex/plus/home/feature/webviews/internal/purchase/pay/common/NativePayButtonConfig;)V", 0);
                        PlusHomeWebPresenter$homeButtonSectionDelegate$2$5 plusHomeWebPresenter$homeButtonSectionDelegate$2$5 = new PlusHomeWebPresenter$homeButtonSectionDelegate$2$5(0, dVar3.b, s4d0.class, "showHostBuyView", "showHostBuyView()V", 0);
                        PlusHomeWebPresenter$homeButtonSectionDelegate$2$6 plusHomeWebPresenter$homeButtonSectionDelegate$2$6 = new PlusHomeWebPresenter$homeButtonSectionDelegate$2$6(0, dVar3.b, s4d0.class, "cancelPayButtonLoading", "cancelPayButtonLoading()V", 0);
                        new cfd0();
                        dfd0 dfd0Var = new dfd0(str3, "purchase_button", "plus_home");
                        rzf0 rzf0Var = new rzf0(z17Var2.c, dfd0Var, plusPaymentStat$Source, z17Var2.e, z17Var2.i, z17Var2.h, plusHomeWebPresenter$homeButtonSectionDelegate$2$1, z17Var2.f, z17Var2.g);
                        return new com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.e(z17Var2.m, rzf0Var, new z250(z17Var2.k, rzf0Var), new h0w(3, z17Var2.p, z17Var2.o), new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.a(e, rzf0Var, new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.payment.a(z17Var2.c, dfd0Var, map3, rzf0Var, z17Var2.a, z17Var2.m, plusHomeWebPresenter$homeButtonSectionDelegate$2$2, plusHomeWebPresenter$homeButtonSectionDelegate$2$3, z17Var2.d, z17Var2.n), z17Var2.k, z17Var2.j, plusHomeWebPresenter$homeButtonSectionDelegate$2$4, plusHomeWebPresenter$homeButtonSectionDelegate$2$6), new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.host.a(e, rzf0Var, plusHomeWebPresenter$homeButtonSectionDelegate$2$5), z17Var2.l, z17Var2.b);
                    default:
                        d dVar4 = this.b;
                        return new nsu(dVar4.g, dVar4.x, new PlusHomeWebPresenter$hostPayProvider$2$1(1, dVar4, d.class, "sendContractsMessage", "sendContractsMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0), new PlusHomeWebPresenter$hostPayProvider$2$2(0, dVar4.Z, com.yandex.plus.home.feature.webviews.internal.a.class, "reload", "reload()V", 0), new PlusHomeWebPresenter$hostPayProvider$2$3(0, dVar4.b, s4d0.class, "hideHostBuyView", "hideHostBuyView()V", 0), dVar4.C, new PlusHomeWebPresenter$hostPayProvider$2$4(0, dVar4.k(), com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.e.class, "onPayButtonClicked", "onPayButtonClicked()V", 0), dVar4.A, PlusPaymentStat$Source.HOME, dVar4.B, dVar4.f.b);
                }
            }
        });
        skd0.e(PlusLogTag.UI, "init() bundle=" + plusHomeBundle);
    }

    @Override // defpackage.w350
    public final void a() {
        com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.e k = k();
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
        com.yandex.plus.home.common.utils.a.b(k().f);
        gsd0 gsd0Var = this.W;
        gsd0Var.e = false;
        gsd0Var.a();
        pzt0 pzt0Var = this.U;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.U = null;
        PlusLogTag plusLogTag = PlusLogTag.UI;
        skd0.e(plusLogTag, "detachView()");
        com.yandex.plus.home.common.utils.a.b(this.Z.h);
        skd0.b(plusLogTag, "detachView()");
    }

    @Override // defpackage.so41
    public final void f(String str, int i, String str2, String str3, boolean z) {
        this.p.c(str, i, str2, str3, z);
        if (z) {
            o(String.format("connection error, error code = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), str);
        }
    }

    @Override // defpackage.iz4
    public final void g() {
        PlusLogTag plusLogTag = PlusLogTag.UI;
        skd0.e(plusLogTag, "onPause()");
        this.Z.getClass();
        skd0.b(plusLogTag, "onPause()");
        this.W.b();
    }

    @Override // defpackage.iz4
    public final void h() {
        PlusLogTag plusLogTag = PlusLogTag.UI;
        skd0.e(plusLogTag, "onResume()");
        c cVar = this.Z;
        cVar.getClass();
        skd0.b(plusLogTag, "onResume()");
        cVar.a(new bbd0(23));
        this.W.d();
    }

    public final com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.e k() {
        return (com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.e) this.b0.getValue();
    }

    @Override // defpackage.so41
    public final void l(String str, int i, String str2, String str3, boolean z) {
        this.p.e(str, i, str2, str3, z);
        if (z) {
            if (this.y == Environment.TESTING) {
                ((s4d0) this.b).showSslCertificateError();
            }
            o("ssl error", str);
        }
    }

    public final void m(pt80 pt80Var) {
        this.Z.d(pt80Var, new PlusHomeWebPresenter$onNeedAuthorization$1(0, k(), com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.e.class, "onWebAuthorizationShow", "onWebAuthorizationShow()V", 0), new PlusHomeWebPresenter$onNeedAuthorization$2(1, k(), com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.e.class, "onAuthorizationResult", "onAuthorizationResult(Lcom/yandex/plus/home/feature/webviews/internalapi/authorization/AuthorizationResult;)V", 0));
    }

    public final void n() {
        this.u.s();
        skd0.c(PlusLogTag.UI, "web view timeout", null);
        ((s4d0) this.b).showError("loading timeout");
        c cVar = this.Z;
        this.z.d(this.C, cVar.g);
        String str = cVar.g;
        this.p.d(this.R.b, str);
    }

    public final void o(String str, String str2) {
        if (!this.V) {
            this.u.s();
        }
        skd0.c(PlusLogTag.UI, str, null);
        if (!this.I) {
            pzt0 pzt0Var = this.U;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            this.U = null;
        }
        if (this.V) {
            return;
        }
        ((s4d0) this.b).showError(str);
        if (str2 == null) {
            str2 = this.Z.g;
        }
        this.z.d(this.C, str2);
    }

    @Override // defpackage.w350
    public final void onClose() {
        com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.e k = k();
        pzt0 pzt0Var = k.i;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        k.i = null;
    }

    @Override // defpackage.p3d0
    public final void onMessage(String str) {
        skd0.b(PlusLogTag.UI, "onMessage() jsonMessage=".concat(str));
        ((b) this.X.getValue()).onMessage(str);
    }

    public final void p(gov govVar) {
        if (this.I) {
            ((s4d0) this.b).sendMessage(govVar);
        } else {
            ((b) this.X.getValue()).A(govVar);
        }
    }

    @Override // defpackage.so41
    public final void r(String str, int i, String str2, String str3, boolean z) {
        this.p.b(str, i, str2, str3, z);
        if (z) {
            o(String.format("http error, status code = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), str);
        }
    }
}
