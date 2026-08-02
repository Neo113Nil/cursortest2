package com.yandex.plus.home.feature.webviews.internal.home;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$ButtonType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$PurchaseType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$Source;
import defpackage.a3d0;
import defpackage.b3d0;
import defpackage.bt80;
import defpackage.bv80;
import defpackage.cs80;
import defpackage.dc20;
import defpackage.du80;
import defpackage.eu80;
import defpackage.imd0;
import defpackage.is80;
import defpackage.iw80;
import defpackage.jse;
import defpackage.lrb1;
import defpackage.lt80;
import defpackage.lz40;
import defpackage.nsu;
import defpackage.nv80;
import defpackage.nw70;
import defpackage.ow80;
import defpackage.p4z;
import defpackage.ps80;
import defpackage.pt80;
import defpackage.pu80;
import defpackage.pzt0;
import defpackage.qv80;
import defpackage.s4d0;
import defpackage.skd0;
import defpackage.sls;
import defpackage.st80;
import defpackage.su80;
import defpackage.szg;
import defpackage.tje;
import defpackage.tse;
import defpackage.vio;
import defpackage.vu80;
import defpackage.wio;
import defpackage.wk41;
import defpackage.ys80;
import defpackage.yt80;
import defpackage.yu80;
import defpackage.zv80;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class b extends com.yandex.plus.home.feature.webviews.internal.bridge.a {
    public final /* synthetic */ d t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(d dVar) {
        super(r7, r8, r9, r10, r11, r12, r7, r8, r9, r10, r11, dVar.z, dVar.C, dVar.E, dVar.H, dVar.K, dVar.O, new nw70(4, dVar.G), r1);
        this.t = dVar;
        jse jseVar = dVar.h;
        jse jseVar2 = dVar.j;
        jse jseVar3 = dVar.i;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.a aVar = dVar.k;
        p4z p4zVar = dVar.l;
        com.yandex.plus.home.feature.webviews.internal.settings.domain.b bVar = dVar.m;
        imd0 imd0Var = dVar.o;
        wio wioVar = dVar.p;
        vio vioVar = dVar.q;
        dc20 dc20Var = dVar.r;
        sls slsVar = dVar.s;
        PlusHomeWebPresenter$PlusHomeWebMessagesHandler$1 plusHomeWebPresenter$PlusHomeWebMessagesHandler$1 = new PlusHomeWebPresenter$PlusHomeWebMessagesHandler$1(dVar, d.class, "mainScope", "getMainScope()Lkotlinx/coroutines/CoroutineScope;", 0);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void B(String str) {
        ((s4d0) this.t.b).sendMessage(str);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void a(cs80 cs80Var) {
        skd0.b(PlusLogTag.JS, "handleCallbackEvent() outMessage=" + cs80Var);
        ((lz40) this.t.n.b).g(new b3d0(cs80Var.b));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void b(is80 is80Var) {
        skd0.b(PlusLogTag.JS, "handleCloseCurrentWebViewMessage() outMessage=" + is80Var);
        ((s4d0) this.t.b).dismiss();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void d(ps80 ps80Var) {
        super.d(ps80Var);
        ((s4d0) this.t.b).showError(ps80Var.b);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void e(ys80 ys80Var) {
        skd0.b(PlusLogTag.JS, "handleGetProductsRequest() outMessage=" + ys80Var);
        this.t.k().b("GetProductsRequest");
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void g(pt80 pt80Var) {
        skd0.b(PlusLogTag.JS, "handleNeedAuthorizationMessage() outMessage=" + pt80Var);
        this.t.m(pt80Var);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void h(bt80 bt80Var) {
        skd0.b(PlusLogTag.JS, "handleNeedLogoutMessage() outMessage=" + bt80Var);
        this.t.Z.f(bt80Var, new PlusHomeWebPresenter$PlusHomeWebMessagesHandler$handleNeedLogoutMessage$1(1, this, b.class, "sendMessage", "sendMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void i(st80 st80Var) {
        skd0.b(PlusLogTag.JS, "handleOpenNativeSharingMessage() outMessage=" + st80Var);
        ((com.yandex.plus.home.feature.webviews.internal.container.a) this.t.H).t(st80Var.b, st80Var.c, st80Var.d);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void j(eu80 eu80Var) {
        skd0.b(PlusLogTag.JS, "handleOpenStoriesListMessage() outMessage=" + eu80Var);
        d dVar = this.t;
        com.yandex.plus.home.feature.webviews.internal.container.b bVar = dVar.H;
        List<du80> list = eu80Var.b;
        ArrayList arrayList = new ArrayList();
        for (du80 du80Var : list) {
            Object F = nw70.F(du80Var);
            if (!(F instanceof Result.Failure)) {
                F = new wk41((szg) F, du80Var.b, du80Var.c);
            }
            Throwable a = Result.a(F);
            if (a != null) {
                skd0.c(PlusLogTag.JS, "handleOpenStoriesListMessage() outMessage=" + eu80Var, a);
                dVar.q.c(du80Var.a);
                F = null;
            }
            wk41 wk41Var = (wk41) F;
            if (wk41Var != null) {
                arrayList.add(wk41Var);
            }
        }
        com.yandex.plus.home.feature.webviews.internal.container.b.a(bVar, arrayList);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void k(yt80 yt80Var) {
        PlusLogTag plusLogTag = PlusLogTag.JS;
        skd0.b(plusLogTag, "handleOpenStoriesMessage() outMessage=" + yt80Var);
        Object C = nw70.C(yt80Var);
        boolean z = C instanceof Result.Failure;
        d dVar = this.t;
        if (!z) {
            com.yandex.plus.home.feature.webviews.internal.container.b.b(dVar.H, (szg) C, true, yt80Var.d, null, null, null, 56);
        }
        Throwable a = Result.a(C);
        if (a != null) {
            skd0.c(plusLogTag, "handleOpenStoriesMessage() outMessage=" + yt80Var, a);
            dVar.q.c(yt80Var.b);
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void m(pu80 pu80Var) {
        skd0.b(PlusLogTag.JS, "handlePurchaseButtonShown() outMessage=" + pu80Var);
        this.t.k().h(pu80Var);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void n(su80 su80Var) {
        skd0.b(PlusLogTag.JS, "handlePurchaseProductRequest() outMessage=" + su80Var);
        this.t.k().b("PurchaseProductRequest");
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void o(yu80 yu80Var) {
        skd0.b(PlusLogTag.JS, "handleReadyForMessagingMessage() outMessage=" + yu80Var);
        this.t.W.c();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void p(vu80 vu80Var) {
        skd0.b(PlusLogTag.JS, "handleReadyMessage() outMessage=" + vu80Var);
        d dVar = this.t;
        pzt0 pzt0Var = dVar.U;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        dVar.U = null;
        ((s4d0) dVar.b).hideLoading();
        ((nsu) dVar.c0.getValue()).j = true;
        dVar.V = true;
        dVar.W.e();
        r0 r0Var = dVar.k().g;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void q(bv80 bv80Var) {
        skd0.b(PlusLogTag.JS, "handleSendBroadcastEvent() outMessage=" + bv80Var);
        tje.N((tse) this.s.get(), null, null, new PlusHomeWebPresenter$PlusHomeWebMessagesHandler$handleSendBroadcastEvent$1(this.t, bv80Var, null), 3);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void t(nv80 nv80Var) {
        skd0.b(PlusLogTag.JS, "handleShowPurchaseButton() outMessage=" + nv80Var);
        String str = nv80Var.a;
        d dVar = this.t;
        dVar.g.k(str);
        r0 r0Var = dVar.k().h;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void u(qv80 qv80Var) {
        skd0.b(PlusLogTag.JS, "handleShowServiceInfo() outMessage=" + qv80Var);
        ((s4d0) this.t.b).showWebServiceInfo(qv80Var.b);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void v(zv80 zv80Var) {
        skd0.b(PlusLogTag.JS, "handleTreasuryStateRequest() outMessage=" + zv80Var);
        com.yandex.plus.home.feature.webviews.internal.treasury.c cVar = (com.yandex.plus.home.feature.webviews.internal.treasury.c) this.t.a0.getValue();
        if (cVar != null) {
            tje.N((tse) this.s.get(), null, null, new PlusHomeWebPresenter$PlusHomeWebMessagesHandler$handleTreasuryStateRequest$1$1(cVar, zv80Var, this, null), 3);
        } else {
            z(zv80Var, "TREASURY_ABSENT");
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void w(iw80 iw80Var) {
        skd0.b(PlusLogTag.JS, "handleUserBoughtSubscriptionMessage() outMessage=" + iw80Var);
        this.t.A.d(PlusPaymentStat$Source.HOME, PlusPaymentStat$PurchaseType.WEB, PlusPaymentStat$ButtonType.WEB, iw80Var.b, EmptyList.a);
        super.w(iw80Var);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void x(ow80 ow80Var) {
        skd0.b(PlusLogTag.JS, "handleUserTappedSubscription() outMessage=" + ow80Var);
        d dVar = this.t;
        dVar.k().f();
        ((lz40) dVar.n.b).g(a3d0.c);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void y(lt80 lt80Var) {
        ((s4d0) this.t.b).performVibrate(lrb1.b(lt80Var.b));
    }
}
