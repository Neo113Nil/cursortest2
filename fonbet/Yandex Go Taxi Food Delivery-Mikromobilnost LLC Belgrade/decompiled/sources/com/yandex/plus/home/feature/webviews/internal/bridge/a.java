package com.yandex.plus.home.feature.webviews.internal.bridge;

import android.net.Uri;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import defpackage.bt80;
import defpackage.bv80;
import defpackage.cs80;
import defpackage.dab1;
import defpackage.dc20;
import defpackage.et80;
import defpackage.eu80;
import defpackage.gov;
import defpackage.hjd0;
import defpackage.hov;
import defpackage.hsd0;
import defpackage.hv80;
import defpackage.ijd0;
import defpackage.imd0;
import defpackage.is80;
import defpackage.iw80;
import defpackage.jse;
import defpackage.ju80;
import defpackage.kv80;
import defpackage.ls80;
import defpackage.lt80;
import defpackage.nv80;
import defpackage.nw70;
import defpackage.ow80;
import defpackage.p3d0;
import defpackage.p4z;
import defpackage.ps80;
import defpackage.pt80;
import defpackage.pu80;
import defpackage.pw80;
import defpackage.qv80;
import defpackage.skd0;
import defpackage.sls;
import defpackage.st80;
import defpackage.su80;
import defpackage.tje;
import defpackage.tse;
import defpackage.vio;
import defpackage.vu80;
import defpackage.vzg;
import defpackage.wio;
import defpackage.y821;
import defpackage.ys80;
import defpackage.yt80;
import defpackage.yu80;
import defpackage.zv80;
import kotlin.Result;
import kotlin.jvm.internal.PropertyReference0Impl;

/* loaded from: classes2.dex */
public abstract class a implements p3d0 {
    public final jse a;
    public final jse b;
    public final jse c;
    public final com.yandex.plus.home.feature.webviews.internalapi.bridge.a d;
    public final p4z e;
    public final com.yandex.plus.home.feature.webviews.internal.settings.domain.b f;
    public final imd0 g;
    public final wio h;
    public final vio i;
    public final dc20 j;
    public final sls k;
    public final hsd0 l;
    public final String m;
    public final hjd0 n;
    public final com.yandex.plus.home.feature.webviews.internal.container.b o;
    public final y821 p;
    public final hov q;
    public final nw70 r;
    public final PropertyReference0Impl s;

    public a(jse jseVar, jse jseVar2, jse jseVar3, com.yandex.plus.home.feature.webviews.internalapi.bridge.a aVar, p4z p4zVar, com.yandex.plus.home.feature.webviews.internal.settings.domain.b bVar, imd0 imd0Var, wio wioVar, vio vioVar, dc20 dc20Var, sls slsVar, hsd0 hsd0Var, String str, ijd0 ijd0Var, com.yandex.plus.home.feature.webviews.internal.container.b bVar2, y821 y821Var, hov hovVar, nw70 nw70Var, PropertyReference0Impl propertyReference0Impl) {
        this.a = jseVar;
        this.b = jseVar2;
        this.c = jseVar3;
        this.d = aVar;
        this.e = p4zVar;
        this.f = bVar;
        this.g = imd0Var;
        this.h = wioVar;
        this.i = vioVar;
        this.j = dc20Var;
        this.k = slsVar;
        this.l = hsd0Var;
        this.m = str;
        this.n = ijd0Var;
        this.o = bVar2;
        this.p = y821Var;
        this.q = hovVar;
        this.r = nw70Var;
        this.s = propertyReference0Impl;
    }

    public final void A(gov govVar) {
        skd0.b(PlusLogTag.JS, "sendMessage() inMessage=" + govVar);
        tje.N((tse) this.s.get(), this.a, null, new BasePlusWebMessagesHandler$sendMessage$1(this, govVar, null), 2);
    }

    public abstract void B(String str);

    public abstract void a(cs80 cs80Var);

    public abstract void b(is80 is80Var);

    public void c(ls80 ls80Var) {
        skd0.b(PlusLogTag.JS, "handleCloseStoriesMessage() outMessage=" + ls80Var);
        z(ls80Var, "NOT_IMPLEMENTED");
    }

    public void d(ps80 ps80Var) {
        PlusLogTag plusLogTag = PlusLogTag.JS;
        StringBuilder sb = new StringBuilder("handleCriticalErrorMessage() Close with critical error: ");
        String str = ps80Var.b;
        sb.append(str);
        skd0.c(plusLogTag, sb.toString(), null);
        this.i.a(str);
    }

    public void e(ys80 ys80Var) {
        skd0.b(PlusLogTag.JS, "handleGetProductsRequest() outMessage=" + ys80Var);
        z(ys80Var, "NOT_IMPLEMENTED");
    }

    public void f(et80 et80Var) {
        skd0.b(PlusLogTag.JS, "handleMiniStoryIsReadyEvent() outMessage=" + et80Var);
        z(et80Var, "NOT_IMPLEMENTED");
    }

    public abstract void g(pt80 pt80Var);

    public abstract void h(bt80 bt80Var);

    public void i(st80 st80Var) {
        skd0.b(PlusLogTag.JS, "handleOpenNativeSharingMessage() outMessage=" + st80Var);
        z(st80Var, "NOT_IMPLEMENTED");
    }

    public void j(eu80 eu80Var) {
        skd0.b(PlusLogTag.JS, "handleOpenStoriesListMessage() outMessage=" + eu80Var);
        z(eu80Var, "NOT_IMPLEMENTED");
    }

    public void k(yt80 yt80Var) {
        skd0.b(PlusLogTag.JS, "handleOpenStoriesMessage() outMessage=" + yt80Var);
        z(yt80Var, "NOT_IMPLEMENTED");
    }

    public void l(ju80 ju80Var) {
        PlusLogTag plusLogTag = PlusLogTag.JS;
        skd0.b(plusLogTag, "handleOpenUrlMessage() openUrlMessage=" + ju80Var);
        Uri uri = ju80Var.b;
        if (((com.yandex.plus.home.feature.webviews.internal.container.a) this.o).w(uri)) {
            return;
        }
        Object G = this.r.G(ju80Var);
        if (!(G instanceof Result.Failure)) {
            com.yandex.plus.home.feature.webviews.internal.container.b.b(this.o, (vzg) G, true, null, null, null, null, 60);
        }
        Throwable a = Result.a(G);
        if (a != null) {
            skd0.c(plusLogTag, "handleOpenUrlMessage() outMessage=" + ju80Var, a);
            this.i.c(uri.toString());
        }
    }

    public void m(pu80 pu80Var) {
        skd0.b(PlusLogTag.JS, "handlePurchaseButtonShown() outMessage=" + pu80Var);
        z(pu80Var, "NOT_IMPLEMENTED");
    }

    public void n(su80 su80Var) {
        skd0.b(PlusLogTag.JS, "handlePurchaseProductRequest() outMessage=" + su80Var);
        z(su80Var, "NOT_IMPLEMENTED");
    }

    public abstract void o(yu80 yu80Var);

    @Override // defpackage.p3d0
    public final void onMessage(String str) {
        skd0.b(PlusLogTag.JS, "onMessage() jsonMessage=".concat(str));
        tje.N((tse) this.s.get(), this.a, null, new BasePlusWebMessagesHandler$onMessage$1(this, str, null), 2);
    }

    public abstract void p(vu80 vu80Var);

    public abstract void q(bv80 bv80Var);

    public void r(hv80 hv80Var) {
        skd0.b(PlusLogTag.JS, "handleShowNextStoryEvent() outMessage=" + hv80Var);
        z(hv80Var, "NOT_IMPLEMENTED");
    }

    public void s(kv80 kv80Var) {
        skd0.b(PlusLogTag.JS, "handleShowPrevStoryEvent() outMessage=" + kv80Var);
        z(kv80Var, "NOT_IMPLEMENTED");
    }

    public void t(nv80 nv80Var) {
        skd0.b(PlusLogTag.JS, "handleShowPurchaseButton() outMessage=" + nv80Var);
        z(nv80Var, "NOT_IMPLEMENTED");
    }

    public abstract void u(qv80 qv80Var);

    public void v(zv80 zv80Var) {
        skd0.b(PlusLogTag.JS, "handleTreasuryStateRequest() outMessage=" + zv80Var);
        z(zv80Var, "NOT_IMPLEMENTED");
    }

    public void w(iw80 iw80Var) {
        skd0.b(PlusLogTag.JS, "handleUserBoughtSubscriptionMessage() outMessage=" + iw80Var);
        hjd0 hjd0Var = this.n;
        if (hjd0Var != null) {
            ((ijd0) hjd0Var).a(dab1.N);
        }
        tje.N((tse) this.s.get(), null, null, new BasePlusWebMessagesHandler$handleUserBoughtSubscriptionMessage$1(this, null), 3);
    }

    public void x(ow80 ow80Var) {
        skd0.b(PlusLogTag.JS, "handleUserTappedSubscription() outMessage=" + ow80Var);
        z(ow80Var, "NOT_IMPLEMENTED");
    }

    public abstract void y(lt80 lt80Var);

    public final void z(pw80 pw80Var, String str) {
        skd0.h(PlusLogTag.JS, "onMessageUnhandled() outMessage=" + pw80Var + ", cause=" + str, null);
        this.i.b(pw80Var.toString(), str);
    }
}
