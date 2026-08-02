package com.yandex.plus.home.feature.webviews.internal.smart;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.OfferTypeDto;
import defpackage.asd0;
import defpackage.b3d0;
import defpackage.bgc;
import defpackage.bt80;
import defpackage.lz40;
import defpackage.pt80;
import defpackage.tzs0;
import defpackage.vld0;
import defpackage.yld0;
import defpackage.zqc;

/* loaded from: classes2.dex */
public final class c implements zqc {
    public final /* synthetic */ PlusSmartWebView a;

    public c(PlusSmartWebView plusSmartWebView) {
        this.a = plusSmartWebView;
    }

    @Override // defpackage.zqc
    public final void a(OfferTypeDto offerTypeDto) {
        yld0 yld0Var;
        yld0Var = this.a.presenter;
        yld0Var.y.b(yld0Var.z, offerTypeDto);
    }

    @Override // defpackage.zqc
    public final void b() {
        yld0 yld0Var;
        yld0Var = this.a.presenter;
        yld0Var.g.t(yld0Var.J.g);
        ((asd0) yld0Var.b).showContent();
        yld0Var.y.a(yld0Var.z);
    }

    @Override // defpackage.zqc
    public final void c(bt80 bt80Var) {
        yld0 yld0Var;
        tzs0 webViewController;
        PlusSmartWebView plusSmartWebView = this.a;
        yld0Var = plusSmartWebView.presenter;
        webViewController = plusSmartWebView.getWebViewController();
        yld0Var.J.f(bt80Var, new PlusSmartWebView$commonWebViewContractEventListener$1$onNeedLogout$1(1, webViewController, tzs0.class, "sendMessage", "sendMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0));
    }

    @Override // defpackage.zqc
    public final void d(pt80 pt80Var) {
        yld0 yld0Var;
        yld0Var = this.a.presenter;
        yld0Var.J.d(pt80Var, new bgc(12), new vld0(3));
    }

    @Override // defpackage.zqc
    public final void e(String str) {
        yld0 yld0Var;
        yld0Var = this.a.presenter;
        ((lz40) yld0Var.n.a).g(new b3d0(str));
    }

    @Override // defpackage.zqc
    public final void f() {
        yld0 yld0Var;
        yld0Var = this.a.presenter;
        yld0Var.m();
    }

    @Override // defpackage.zqc
    public final void g(String str, String str2, boolean z) {
        yld0 yld0Var;
        yld0Var = this.a.presenter;
        yld0Var.k(str, str2);
    }

    @Override // defpackage.zqc
    public final void h(OfferTypeDto offerTypeDto) {
        yld0 yld0Var;
        yld0Var = this.a.presenter;
        yld0Var.y.c(yld0Var.z, offerTypeDto);
    }

    @Override // defpackage.zqc
    public final void i() {
        this.a.dismiss();
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
