package com.yandex.plus.home.feature.webviews.internal.stories;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.OfferTypeDto;
import defpackage.aou0;
import defpackage.b3d0;
import defpackage.bt80;
import defpackage.lz40;
import defpackage.pt80;
import defpackage.zqc;

/* loaded from: classes2.dex */
public final class f implements zqc {
    public final /* synthetic */ WebStoriesView a;

    public f(WebStoriesView webStoriesView) {
        this.a = webStoriesView;
    }

    @Override // defpackage.zqc
    public final void a(OfferTypeDto offerTypeDto) {
        e eVar;
        eVar = this.a.presenter;
        eVar.a0.getClass();
    }

    @Override // defpackage.zqc
    public final void b() {
        e eVar;
        eVar = this.a.presenter;
        eVar.o();
    }

    @Override // defpackage.zqc
    public final void c(bt80 bt80Var) {
        e eVar;
        aou0 webViewController;
        WebStoriesView webStoriesView = this.a;
        eVar = webStoriesView.presenter;
        webViewController = webStoriesView.getWebViewController();
        eVar.V.f(bt80Var, new WebStoriesView$commonWebViewContractEventListener$1$onNeedLogout$1(1, webViewController, aou0.class, "sendMessage", "sendMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0));
    }

    @Override // defpackage.zqc
    public final void d(pt80 pt80Var) {
        e eVar;
        eVar = this.a.presenter;
        eVar.n(pt80Var);
    }

    @Override // defpackage.zqc
    public final void e(String str) {
        e eVar;
        eVar = this.a.presenter;
        ((lz40) eVar.v.a).g(new b3d0(str));
    }

    @Override // defpackage.zqc
    public final void f() {
        e eVar;
        eVar = this.a.presenter;
        eVar.m("loading timeout", eVar.V.g);
        eVar.o.d(eVar.N.b, eVar.g.c.getStoriesUrl());
    }

    @Override // defpackage.zqc
    public final void g(String str, String str2, boolean z) {
        e eVar;
        eVar = this.a.presenter;
        eVar.m(str, str2);
    }

    @Override // defpackage.zqc
    public final void h(OfferTypeDto offerTypeDto) {
        e eVar;
        eVar = this.a.presenter;
        eVar.a0.getClass();
    }

    @Override // defpackage.zqc
    public final void i() {
        this.a.dismiss(true);
    }

    @Override // defpackage.zqc
    public final void j(String str) {
        this.a.showWebServiceInfo(str);
    }

    @Override // defpackage.zqc
    public final void k(int i) {
        this.a.performVibrate(i);
    }

    @Override // defpackage.zqc
    public final void l(String str) {
        this.a.showError(str);
    }
}
