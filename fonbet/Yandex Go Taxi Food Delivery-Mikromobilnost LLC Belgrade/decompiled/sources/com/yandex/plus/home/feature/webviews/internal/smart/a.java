package com.yandex.plus.home.feature.webviews.internal.smart;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import defpackage.asd0;
import defpackage.b3d0;
import defpackage.bgc;
import defpackage.bt80;
import defpackage.bv80;
import defpackage.cs80;
import defpackage.du80;
import defpackage.eu80;
import defpackage.imd0;
import defpackage.is80;
import defpackage.jse;
import defpackage.lrb1;
import defpackage.lt80;
import defpackage.lz40;
import defpackage.nw70;
import defpackage.p4z;
import defpackage.ps80;
import defpackage.pt80;
import defpackage.pzt0;
import defpackage.qv80;
import defpackage.skd0;
import defpackage.st80;
import defpackage.szg;
import defpackage.tje;
import defpackage.tse;
import defpackage.vld0;
import defpackage.vu80;
import defpackage.wk41;
import defpackage.yld0;
import defpackage.yt80;
import defpackage.yu80;
import defpackage.zv80;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;

/* loaded from: classes2.dex */
public final class a extends com.yandex.plus.home.feature.webviews.internal.bridge.a {
    public final /* synthetic */ yld0 t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(yld0 yld0Var) {
        super(r7, r8, r9, r10, r11, r12, r7, yld0Var.u, yld0Var.t, yld0Var.v, null, yld0Var.y, yld0Var.z, null, yld0Var.q, yld0Var.r, yld0Var.B, new nw70(4, yld0Var.p), r1);
        this.t = yld0Var;
        jse jseVar = yld0Var.h;
        jse jseVar2 = yld0Var.j;
        jse jseVar3 = yld0Var.i;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.a aVar = yld0Var.k;
        p4z p4zVar = yld0Var.l;
        com.yandex.plus.home.feature.webviews.internal.settings.domain.b bVar = yld0Var.m;
        imd0 imd0Var = yld0Var.o;
        PlusSmartWebPresenter$PlusSmartWebMessagesHandler$1 plusSmartWebPresenter$PlusSmartWebMessagesHandler$1 = new PlusSmartWebPresenter$PlusSmartWebMessagesHandler$1(yld0Var, yld0.class, "mainScope", "getMainScope()Lkotlinx/coroutines/CoroutineScope;", 0);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void B(String str) {
        ((asd0) this.t.b).sendMessage(str);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void a(cs80 cs80Var) {
        skd0.b(PlusLogTag.JS, "handleCallbackEvent() outMessage=" + cs80Var);
        ((lz40) this.t.n.a).g(new b3d0(cs80Var.b));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void b(is80 is80Var) {
        skd0.b(PlusLogTag.JS, "handleCloseCurrentWebViewMessage() outMessage=" + is80Var);
        ((asd0) this.t.b).dismiss();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void d(ps80 ps80Var) {
        super.d(ps80Var);
        ((asd0) this.t.b).showError(ps80Var.b);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void g(pt80 pt80Var) {
        skd0.b(PlusLogTag.JS, "handleNeedAuthorizationMessage() outMessage=" + pt80Var);
        this.t.J.d(pt80Var, new bgc(12), new vld0(3));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void h(bt80 bt80Var) {
        skd0.b(PlusLogTag.JS, "handleNeedLogoutMessage() outMessage=" + bt80Var);
        this.t.J.f(bt80Var, new PlusSmartWebPresenter$PlusSmartWebMessagesHandler$handleNeedLogoutMessage$1(1, this, a.class, "sendMessage", "sendMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void i(st80 st80Var) {
        skd0.b(PlusLogTag.JS, "handleOpenNativeSharingMessage() outMessage=" + st80Var);
        ((com.yandex.plus.home.feature.webviews.internal.container.a) this.t.q).t(st80Var.b, st80Var.c, st80Var.d);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void j(eu80 eu80Var) {
        skd0.b(PlusLogTag.JS, "handleOpenStoriesListMessage() outMessage=" + eu80Var);
        yld0 yld0Var = this.t;
        com.yandex.plus.home.feature.webviews.internal.container.b bVar = yld0Var.q;
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
                yld0Var.t.c(du80Var.a);
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
        yld0 yld0Var = this.t;
        if (!z) {
            com.yandex.plus.home.feature.webviews.internal.container.b.b(yld0Var.q, (szg) C, true, yt80Var.d, null, null, null, 56);
        }
        Throwable a = Result.a(C);
        if (a != null) {
            skd0.c(plusLogTag, "handleOpenStoriesMessage() outMessage=" + yt80Var, a);
            yld0Var.t.c(yt80Var.b);
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void o(yu80 yu80Var) {
        skd0.b(PlusLogTag.JS, "handleReadyForMessagingMessage() outMessage=" + yu80Var);
        this.t.H.c();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void p(vu80 vu80Var) {
        yld0 yld0Var = this.t;
        yld0Var.g.t(yld0Var.J.g);
        ((asd0) yld0Var.b).showContent();
        yld0Var.y.a(yld0Var.z);
        pzt0 pzt0Var = yld0Var.G;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        yld0Var.G = null;
        skd0.b(PlusLogTag.JS, "handleReadyMessage() outMessage=" + vu80Var);
        yld0Var.H.e();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void q(bv80 bv80Var) {
        skd0.b(PlusLogTag.JS, "handleSendBroadcastEvent() outMessage=" + bv80Var);
        tje.N((tse) this.s.get(), null, null, new PlusSmartWebPresenter$PlusSmartWebMessagesHandler$handleSendBroadcastEvent$1(this.t, bv80Var, null), 3);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void u(qv80 qv80Var) {
        skd0.b(PlusLogTag.JS, "handleShowServiceInfo() outMessage=" + qv80Var);
        ((asd0) this.t.b).showWebServiceInfo(qv80Var.b);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void v(zv80 zv80Var) {
        skd0.b(PlusLogTag.JS, "handleTreasuryStateRequest() outMessage=" + zv80Var);
        com.yandex.plus.home.feature.webviews.internal.treasury.c cVar = (com.yandex.plus.home.feature.webviews.internal.treasury.c) this.t.I.getValue();
        if (cVar != null) {
            tje.N((tse) this.s.get(), null, null, new PlusSmartWebPresenter$PlusSmartWebMessagesHandler$handleTreasuryStateRequest$1$1(cVar, zv80Var, this, null), 3);
        } else {
            z(zv80Var, "TREASURY_ABSENT");
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.a
    public final void y(lt80 lt80Var) {
        ((asd0) this.t.b).performVibrate(lrb1.b(lt80Var.b));
    }
}
