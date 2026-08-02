package com.yandex.plus.home.feature.webviews.internal.home;

import com.yandex.plus.core.config.Environment;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.OfferTypeDto;
import defpackage.b3d0;
import defpackage.bt80;
import defpackage.lz40;
import defpackage.nsu;
import defpackage.pt80;
import defpackage.s4d0;
import defpackage.tpu;
import defpackage.zqc;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class e implements zqc {
    public final /* synthetic */ PlusHomeWebView a;

    public e(PlusHomeWebView plusHomeWebView) {
        this.a = plusHomeWebView;
    }

    @Override // defpackage.zqc
    public final void a(OfferTypeDto offerTypeDto) {
        d dVar;
        dVar = this.a.presenter;
        dVar.z.b(dVar.C, offerTypeDto);
    }

    @Override // defpackage.zqc
    public final void b() {
        d dVar;
        dVar = this.a.presenter;
        ((s4d0) dVar.b).hideLoading();
        ((nsu) dVar.c0.getValue()).j = true;
        dVar.V = true;
        dVar.W.e();
        r0 r0Var = dVar.k().g;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    @Override // defpackage.zqc
    public final void c(bt80 bt80Var) {
        d dVar;
        tpu webViewController;
        PlusHomeWebView plusHomeWebView = this.a;
        dVar = plusHomeWebView.presenter;
        webViewController = plusHomeWebView.getWebViewController();
        dVar.Z.f(bt80Var, new PlusHomeWebView$commonWebViewContractEventListener$1$onNeedLogout$1(1, webViewController, tpu.class, "sendMessage", "sendMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0));
    }

    @Override // defpackage.zqc
    public final void d(pt80 pt80Var) {
        d dVar;
        dVar = this.a.presenter;
        dVar.m(pt80Var);
    }

    @Override // defpackage.zqc
    public final void e(String str) {
        d dVar;
        dVar = this.a.presenter;
        ((lz40) dVar.n.b).g(new b3d0(str));
    }

    @Override // defpackage.zqc
    public final void f() {
        d dVar;
        dVar = this.a.presenter;
        dVar.n();
    }

    @Override // defpackage.zqc
    public final void g(String str, String str2, boolean z) {
        d dVar;
        dVar = this.a.presenter;
        if (dVar.y == Environment.TESTING && z) {
            ((s4d0) dVar.b).showSslCertificateError();
        }
        dVar.o(str, str2);
    }

    @Override // defpackage.zqc
    public final void h(OfferTypeDto offerTypeDto) {
        d dVar;
        dVar = this.a.presenter;
        dVar.z.c(dVar.C, offerTypeDto);
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
