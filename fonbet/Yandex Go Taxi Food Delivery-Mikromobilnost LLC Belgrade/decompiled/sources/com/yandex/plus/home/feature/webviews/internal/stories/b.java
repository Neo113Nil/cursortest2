package com.yandex.plus.home.feature.webviews.internal.stories;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$ButtonType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$PurchaseType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$Source;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.OutMessage$OpenUrl$UrlType;
import defpackage.a3d0;
import defpackage.b3d0;
import defpackage.bt80;
import defpackage.bv80;
import defpackage.cs80;
import defpackage.dc20;
import defpackage.et80;
import defpackage.hov;
import defpackage.hv80;
import defpackage.ijd0;
import defpackage.imd0;
import defpackage.is80;
import defpackage.iw80;
import defpackage.jse;
import defpackage.ju80;
import defpackage.kv80;
import defpackage.lrb1;
import defpackage.ls80;
import defpackage.lt80;
import defpackage.lz40;
import defpackage.nv80;
import defpackage.nw70;
import defpackage.ow80;
import defpackage.p4z;
import defpackage.ps80;
import defpackage.pt80;
import defpackage.pu80;
import defpackage.pzt0;
import defpackage.qv80;
import defpackage.skd0;
import defpackage.sls;
import defpackage.su80;
import defpackage.tje;
import defpackage.tse;
import defpackage.vio;
import defpackage.vu80;
import defpackage.wio;
import defpackage.xk41;
import defpackage.y821;
import defpackage.ys80;
import defpackage.yu80;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class b extends com.yandex.plus.home.feature.webviews.internal.bridge.a {
    public final /* synthetic */ e t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(e eVar) {
        super(r7, r8, r9, r10, r11, r12, r7, r8, r9, r10, r11, eVar.a0, eVar.x, r14, eVar.L, r4, r5, r6, r1);
        this.t = eVar;
        jse jseVar = eVar.h;
        jse jseVar2 = eVar.j;
        jse jseVar3 = eVar.i;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.a aVar = eVar.k;
        p4z p4zVar = eVar.l;
        com.yandex.plus.home.feature.webviews.internal.settings.domain.b bVar = eVar.m;
        imd0 imd0Var = eVar.n;
        wio wioVar = eVar.o;
        vio vioVar = eVar.p;
        dc20 dc20Var = eVar.q;
        sls slsVar = eVar.r;
        WebStoriesPresenter$PlusStoriesWebMessagesHandler$1 webStoriesPresenter$PlusStoriesWebMessagesHandler$1 = new WebStoriesPresenter$PlusStoriesWebMessagesHandler$1(eVar, e.class, "mainScope", "getMainScope()Lkotlinx/coroutines/CoroutineScope;", 0);
        ijd0 ijd0Var = eVar.A;
        y821 y821Var = eVar.G;
        hov hovVar = eVar.J;
        nw70 nw70Var = new nw70(4, eVar.K);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void B(String str) {
        ((xk41) this.t.b).sendMessage(str);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void a(cs80 cs80Var) {
        skd0.b(PlusLogTag.JS, "handleCallbackEvent() outMessage=" + cs80Var);
        ((lz40) this.t.v.a).g(new b3d0(cs80Var.b));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void b(is80 is80Var) {
        skd0.b(PlusLogTag.JS, "handleCloseCurrentWebViewMessage() outMessage=" + is80Var);
        ((xk41) this.t.b).dismiss(true);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void c(ls80 ls80Var) {
        skd0.b(PlusLogTag.JS, "handleCloseStoriesMessage() outMessage=" + ls80Var);
        ((xk41) this.t.b).dismiss(true);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void d(ps80 ps80Var) {
        super.d(ps80Var);
        ((xk41) this.t.b).showError(ps80Var.b);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void e(ys80 ys80Var) {
        skd0.b(PlusLogTag.JS, "handleGetProductsRequest() outMessage=" + ys80Var);
        this.t.k().b("GetProductsRequest");
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void f(et80 et80Var) {
        skd0.b(PlusLogTag.JS, "handleMiniStoryIsReadyEvent() outMessage=" + et80Var);
        r0 r0Var = this.t.S;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void g(pt80 pt80Var) {
        skd0.b(PlusLogTag.JS, "handleNeedAuthorizationMessage() outMessage=" + pt80Var);
        this.t.n(pt80Var);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void h(bt80 bt80Var) {
        skd0.b(PlusLogTag.JS, "handleNeedLogoutMessage() outMessage=" + bt80Var);
        this.t.V.f(bt80Var, new WebStoriesPresenter$PlusStoriesWebMessagesHandler$handleNeedLogoutMessage$1(1, this, b.class, "sendMessage", "sendMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void l(ju80 ju80Var) {
        super.l(ju80Var);
        if (ju80Var.c == OutMessage$OpenUrl$UrlType.DEEPLINK) {
            skd0.b(PlusLogTag.JS, "onDismiss()");
            ((xk41) this.t.b).dismiss(true);
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
        this.t.Q.c();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void p(vu80 vu80Var) {
        skd0.b(PlusLogTag.JS, "handleReadyMessage() outMessage=" + vu80Var);
        e eVar = this.t;
        eVar.o();
        pzt0 pzt0Var = eVar.P;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        eVar.P = null;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void q(bv80 bv80Var) {
        skd0.b(PlusLogTag.JS, "handleSendBroadcastEvent() outMessage=" + bv80Var);
        tje.N((tse) this.s.get(), null, null, new WebStoriesPresenter$PlusStoriesWebMessagesHandler$handleSendBroadcastEvent$1(this.t, bv80Var, null), 3);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void r(hv80 hv80Var) {
        skd0.b(PlusLogTag.JS, "handleShowNextStoryEvent() outMessage=" + hv80Var);
        ((xk41) this.t.b).navigateStory(StoryNavigation.SHOW_NEXT_STORY);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void s(kv80 kv80Var) {
        skd0.b(PlusLogTag.JS, "handleShowPrevStoryEvent() outMessage=" + kv80Var);
        ((xk41) this.t.b).navigateStory(StoryNavigation.SHOW_PREV_STORY);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void t(nv80 nv80Var) {
        skd0.b(PlusLogTag.JS, "handleShowPurchaseButton() outMessage=" + nv80Var);
        String str = nv80Var.a;
        e eVar = this.t;
        eVar.g.c.k(str);
        r0 r0Var = eVar.k().h;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void u(qv80 qv80Var) {
        skd0.b(PlusLogTag.JS, "handleShowServiceInfo() outMessage=" + qv80Var);
        ((xk41) this.t.b).showWebServiceInfo(qv80Var.b);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void w(iw80 iw80Var) {
        skd0.b(PlusLogTag.JS, "handleUserBoughtSubscriptionMessage() outMessage=" + iw80Var);
        this.t.w.d(PlusPaymentStat$Source.STORY, PlusPaymentStat$PurchaseType.WEB, PlusPaymentStat$ButtonType.WEB, iw80Var.b, EmptyList.a);
        super.w(iw80Var);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void x(ow80 ow80Var) {
        skd0.b(PlusLogTag.JS, "handleUserTappedSubscription() outMessage=" + ow80Var);
        e eVar = this.t;
        eVar.k().f();
        ((lz40) eVar.v.a).g(a3d0.c);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void y(lt80 lt80Var) {
        ((xk41) this.t.b).performVibrate(lrb1.b(lt80Var.b));
    }
}
