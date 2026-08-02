package com.yandex.plus.pay.ui.webview.family.ui;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.b;
import com.yandex.plus.webview.api.contract.message.WebViewMessagesHandler;
import defpackage.b64;
import defpackage.bcp;
import defpackage.ccp;
import defpackage.dcp;
import defpackage.ecp;
import defpackage.eu90;
import defpackage.fcp;
import defpackage.i45;
import defpackage.iap;
import defpackage.ind0;
import defpackage.jse;
import defpackage.mn41;
import defpackage.obp;
import defpackage.pgz;
import defpackage.pz40;
import defpackage.qtd;
import defpackage.rs41;
import defpackage.sng0;
import defpackage.so41;
import defpackage.ss41;
import defpackage.ts41;
import defpackage.unr0;
import defpackage.vng;
import defpackage.wap;
import defpackage.xvz;
import java.util.HashMap;
import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData;

/* loaded from: classes2.dex */
public final class a extends i45 implements iap, ss41, rs41, so41 {
    public final /* synthetic */ ts41 e;
    public final pgz f;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.a g;
    public final qtd h;
    public final boolean i;

    public a(pgz pgzVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.a aVar, qtd qtdVar, WebViewMessagesHandler webViewMessagesHandler, jse jseVar, boolean z) {
        super(webViewMessagesHandler, null, jseVar);
        this.e = new ts41();
        this.f = pgzVar;
        this.g = aVar;
        this.h = qtdVar;
        this.i = z;
    }

    @Override // defpackage.so41
    public final void f(String str, int i, String str2, String str3, boolean z) {
        v(str, str2, str3, "unexpected", z, i);
        this.h.f(str, i, str2, str3, z);
        if (z) {
            this.g.a("other");
        }
    }

    @Override // defpackage.di41
    public final void k(String str) {
        b viewModel;
        viewModel = this.g.a.getViewModel();
        wap wapVar = viewModel.z;
        if (wapVar != null) {
            ind0 a = viewModel.b.a.a();
            obp obpVar = viewModel.x;
            String uuid = a.a.toString();
            String str2 = wapVar.a;
            String str3 = wapVar.c;
            eu90 eu90Var = obpVar.b;
            LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", uuid, "url", str2);
            t.put("skipButtonText", str3);
            t.put("_meta", eu90.c(new HashMap()));
            eu90Var.f("FamilyInvite.Screen.WebView.Loaded", t);
        }
    }

    @Override // defpackage.so41
    public final void l(String str, int i, String str2, String str3, boolean z) {
        v(str, str2, str3, "ssl", z, i);
        this.h.l(str, i, str2, str3, z);
        if (z) {
            this.g.a("ssl");
        }
    }

    @Override // defpackage.zl41
    public final int m(Context context) {
        return vng.p(sng0.pay_sdk_primaryBlockColor, context);
    }

    @Override // defpackage.rs41
    public final void n() {
        b viewModel;
        viewModel = this.g.a.getViewModel();
        wap wapVar = viewModel.z;
        if (wapVar != null) {
            viewModel.y.a(15000L, wapVar.a, UgcLiveVideoData.UgcLiveStatus.READY);
        }
        viewModel.W();
    }

    @Override // defpackage.i45, defpackage.yqc
    @JavascriptInterface
    public void onMessage(String str) {
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.f;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "FamilyContractImpl", "onMessage: ".concat(str));
        }
        super.onMessage(str);
    }

    @Override // defpackage.ss41
    public final pz40 p() {
        return this.e.b();
    }

    @Override // defpackage.so41
    public final void r(String str, int i, String str2, String str3, boolean z) {
        v(str, str2, str3, "http", z, i);
        this.h.r(str, i, str2, str3, z);
        if (z) {
            this.g.a("http");
        }
    }

    @Override // defpackage.di41
    public final void s(String str) {
        mn41 t;
        if (!this.i || (t = t()) == null) {
            return;
        }
        t.b("document.addEventListener(\"DOMContentLoaded\", function() {\n    document.body.style.setProperty(\"background\", \"transparent\", \"important\");\n});");
    }

    @Override // defpackage.i45
    public final void u(WebViewMessagesHandler webViewMessagesHandler) {
        webViewMessagesHandler.b(ccp.class, new FamilyContractImpl$registerMessageHandlers$1(1, this, a.class, "handleReadyMessage", "handleReadyMessage(Lcom/yandex/plus/pay/ui/webview/family/domain/FamilyWebMessage$Ready;)V", 0));
        webViewMessagesHandler.b(dcp.class, new FamilyContractImpl$registerMessageHandlers$2(1, this, a.class, "handleReadyForMessagingMessage", "handleReadyForMessagingMessage(Lcom/yandex/plus/pay/ui/webview/family/domain/FamilyWebMessage$ReadyForMessaging;)V", 0));
        webViewMessagesHandler.b(ecp.class, new FamilyContractImpl$registerMessageHandlers$3(1, this, a.class, "handleSendMetricsMessage", "handleSendMetricsMessage(Lcom/yandex/plus/pay/ui/webview/family/domain/FamilyWebMessage$SendMetrics;)V", 0));
        webViewMessagesHandler.b(bcp.class, new FamilyContractImpl$registerMessageHandlers$4(1, this, a.class, "handleOpenNativeSharingMessage", "handleOpenNativeSharingMessage(Lcom/yandex/plus/pay/ui/webview/family/domain/FamilyWebMessage$OpenNativeSharing;)V", 0));
        webViewMessagesHandler.b(fcp.class, new FamilyContractImpl$registerMessageHandlers$5(1, this, a.class, "handleUnknownMessage", "handleUnknownMessage(Lcom/yandex/plus/pay/ui/webview/family/domain/FamilyWebMessage$Unknown;)V", 0));
    }

    public final void v(String str, String str2, String str3, String str4, boolean z, int i) {
        LogPriority logPriority = LogPriority.ERROR;
        pgz pgzVar = this.f;
        if (pgzVar.e(logPriority)) {
            String l = unr0.l(OpenList.CHAR_QUOTE, "URL \"", str);
            if (!z) {
                l = b64.l("resource \"", str2, "\" for ", l);
            }
            StringBuilder v = b64.v("WebView couldn't load ", l, " because of ", str4, " error: errorCode=");
            v.append(i);
            v.append(", description=");
            v.append(str3);
            v.append('!');
            pgzVar.a(logPriority, "FamilyContractImpl", v.toString());
        }
    }
}
