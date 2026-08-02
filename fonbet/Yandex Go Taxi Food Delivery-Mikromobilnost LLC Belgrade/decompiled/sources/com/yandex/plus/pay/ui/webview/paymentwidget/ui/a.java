package com.yandex.plus.pay.ui.webview.paymentwidget.ui;

import android.content.Context;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.webview.api.contract.message.WebViewMessagesHandler;
import defpackage.ajo;
import defpackage.at41;
import defpackage.b64;
import defpackage.bt41;
import defpackage.bvf0;
import defpackage.cvu0;
import defpackage.di41;
import defpackage.gcj;
import defpackage.hi41;
import defpackage.i45;
import defpackage.ii41;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jse;
import defpackage.li41;
import defpackage.mi41;
import defpackage.ni41;
import defpackage.o400;
import defpackage.oi41;
import defpackage.pgz;
import defpackage.pi41;
import defpackage.pz40;
import defpackage.qhw0;
import defpackage.qi41;
import defpackage.qtd;
import defpackage.ri41;
import defpackage.rs41;
import defpackage.si41;
import defpackage.sjh;
import defpackage.sls;
import defpackage.sng0;
import defpackage.so41;
import defpackage.srd0;
import defpackage.ss41;
import defpackage.ti41;
import defpackage.tje;
import defpackage.trd0;
import defpackage.ts41;
import defpackage.ui41;
import defpackage.unr0;
import defpackage.urd0;
import defpackage.uyj;
import defpackage.vng;
import defpackage.w511;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import ru.CryptoPro.JCP.VMInspector.OpenList;

/* loaded from: classes2.dex */
public final class a extends i45 implements hi41, ss41, rs41, at41, bt41, di41, so41 {
    public static final List r = Collections.singletonList("/android_asset/");
    public final /* synthetic */ ts41 e;
    public final sls f;
    public final long g;
    public final long h;
    public final pgz i;
    public final ii41 j;
    public final ajo k;
    public final qtd l;
    public final gcj m;
    public final List n;
    public String o;
    public final qhw0 p;
    public final ike q;

    public a(sls slsVar, long j, long j2, pgz pgzVar, ii41 ii41Var, ajo ajoVar, qtd qtdVar, gcj gcjVar, List list, WebViewMessagesHandler webViewMessagesHandler, jse jseVar) {
        super(webViewMessagesHandler, null, jseVar);
        this.e = new ts41();
        this.f = slsVar;
        this.g = j;
        this.h = j2;
        this.i = pgzVar;
        this.j = ii41Var;
        this.k = ajoVar;
        this.l = qtdVar;
        this.m = gcjVar;
        this.n = list;
        qhw0 a = jl40.a();
        this.p = a;
        sjh sjhVar = uyj.a;
        this.q = bvf0.a(o400.a.plus(a));
    }

    @Override // defpackage.bt41
    public final void d(srd0 srd0Var) {
        this.m.d(srd0Var);
        this.j.e("Domain " + srd0Var.a.getHost() + " is not allowed");
    }

    @Override // defpackage.i45, defpackage.in41
    public final void e() {
        bvf0.j(this.q, null);
    }

    @Override // defpackage.so41
    public final void f(String str, int i, String str2, String str3, boolean z) {
        v(str, str2, str3, "other", z, i);
        this.l.f(str, i, str2, str3, z);
        if (z) {
            this.j.e("other");
        }
    }

    @Override // defpackage.hi41
    @JavascriptInterface
    public String getToken() {
        return (String) this.f.invoke();
    }

    @Override // defpackage.di41
    public final void k(String str) {
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.i;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "WebPaymentWidgetContractImpl", "WebView loaded url successfully");
        }
        this.j.a();
    }

    @Override // defpackage.so41
    public final void l(String str, int i, String str2, String str3, boolean z) {
        v(str, str2, str3, "ssl", z, i);
        this.l.l(str, i, str2, str3, z);
        if (z) {
            this.j.e("ssl");
        }
    }

    @Override // defpackage.zl41
    public final int m(Context context) {
        return vng.p(sng0.pay_sdk_primaryBlockColor, context);
    }

    @Override // defpackage.rs41
    public final void n() {
        LogPriority logPriority = LogPriority.ERROR;
        pgz pgzVar = this.i;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "WebPaymentWidgetContractImpl", "Message timeout!");
        }
        this.j.l("Message timeout!");
    }

    @Override // defpackage.at41
    public final boolean o(urd0 urd0Var) {
        Object failure;
        if (urd0Var instanceof srd0) {
            srd0 srd0Var = (srd0) urd0Var;
            int i = li41.a[srd0Var.c.ordinal()];
            if (i == 1) {
                Uri uri = srd0Var.a;
                if (cvu0.t(uri.getScheme(), "file", true)) {
                    String path = uri.getPath();
                    if (path != null) {
                        List list = r;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (cvu0.x(path, (String) it.next(), false)) {
                                }
                            }
                        }
                    }
                    return false;
                }
                try {
                    failure = uri.getHost();
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                String str = (String) failure;
                if (str == null) {
                    return false;
                }
                List list2 = this.n;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    return false;
                }
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (jl40.l((String) it2.next(), str)) {
                        return true;
                    }
                }
                return false;
            }
            if (i != 2 && i != 3) {
                w511.b();
                return false;
            }
        } else if (!(urd0Var instanceof trd0)) {
            w511.b();
            return false;
        }
        return true;
    }

    @Override // defpackage.hi41
    @JavascriptInterface
    public void onEvent(String str) {
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.i;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "WebPaymentWidgetContractImpl", "onEvent: ".concat(str));
        }
        onMessage(str);
    }

    @Override // defpackage.ss41
    public final pz40 p() {
        return this.e.b();
    }

    @Override // defpackage.bt41
    public final void q(srd0 srd0Var) {
        this.m.getClass();
    }

    @Override // defpackage.so41
    public final void r(String str, int i, String str2, String str3, boolean z) {
        v(str, str2, str3, "http", z, i);
        this.l.r(str, i, str2, str3, z);
        if (z) {
            this.j.e("http");
        }
    }

    @Override // defpackage.di41
    public final void s(String str) {
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.i;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "WebPaymentWidgetContractImpl", "WebView started url loading: ".concat(str));
        }
        this.o = str;
        tje.N(this.q, null, null, new WebPaymentWidgetContractImpl$onPageLoadingStarted$2(this, str, null), 3);
    }

    @Override // defpackage.i45
    public final void u(WebViewMessagesHandler webViewMessagesHandler) {
        webViewMessagesHandler.b(ri41.class, new WebPaymentWidgetContractImpl$registerMessageHandlers$1(1, this, a.class, "handleStartedMessage", "handleStartedMessage(Lcom/yandex/plus/pay/ui/webview/paymentwidget/domain/WebPaymentWidgetMessage$Started;)V", 0));
        webViewMessagesHandler.b(oi41.class, new WebPaymentWidgetContractImpl$registerMessageHandlers$2(1, this, a.class, "handleLoadedMessage", "handleLoadedMessage(Lcom/yandex/plus/pay/ui/webview/paymentwidget/domain/WebPaymentWidgetMessage$Loaded;)V", 0));
        webViewMessagesHandler.b(si41.class, new WebPaymentWidgetContractImpl$registerMessageHandlers$3(1, this, a.class, "handleSuccessMessage", "handleSuccessMessage(Lcom/yandex/plus/pay/ui/webview/paymentwidget/domain/WebPaymentWidgetMessage$Success;)V", 0));
        webViewMessagesHandler.b(ui41.class, new WebPaymentWidgetContractImpl$registerMessageHandlers$4(1, this, a.class, "handleYbOpenCardSuccessMessage", "handleYbOpenCardSuccessMessage(Lcom/yandex/plus/pay/ui/webview/paymentwidget/domain/WebPaymentWidgetMessage$YbOpenCardSuccess;)V", 0));
        webViewMessagesHandler.b(mi41.class, new WebPaymentWidgetContractImpl$registerMessageHandlers$5(1, this, a.class, "handleCloseMessage", "handleCloseMessage(Lcom/yandex/plus/pay/ui/webview/paymentwidget/domain/WebPaymentWidgetMessage$Close;)V", 0));
        webViewMessagesHandler.b(ni41.class, new WebPaymentWidgetContractImpl$registerMessageHandlers$6(1, this, a.class, "handleErrorMessage", "handleErrorMessage(Lcom/yandex/plus/pay/ui/webview/paymentwidget/domain/WebPaymentWidgetMessage$Error;)V", 0));
        webViewMessagesHandler.b(pi41.class, new WebPaymentWidgetContractImpl$registerMessageHandlers$7(1, this, a.class, "handleNeedAuthMessage", "handleNeedAuthMessage(Lcom/yandex/plus/pay/ui/webview/paymentwidget/domain/WebPaymentWidgetMessage$NeedAuth;)V", 0));
        webViewMessagesHandler.b(qi41.class, new WebPaymentWidgetContractImpl$registerMessageHandlers$8(1, this, a.class, "handleOpenUriMessage", "handleOpenUriMessage(Lcom/yandex/plus/pay/ui/webview/paymentwidget/domain/WebPaymentWidgetMessage$OpenUri;)V", 0));
        webViewMessagesHandler.b(ti41.class, new WebPaymentWidgetContractImpl$registerMessageHandlers$9(1, this, a.class, "handleUnknownMessage", "handleUnknownMessage(Lcom/yandex/plus/pay/ui/webview/paymentwidget/domain/WebPaymentWidgetMessage$Unknown;)V", 0));
    }

    public final void v(String str, String str2, String str3, String str4, boolean z, int i) {
        LogPriority logPriority = LogPriority.ERROR;
        pgz pgzVar = this.i;
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
            pgzVar.a(logPriority, "WebPaymentWidgetContractImpl", v.toString());
        }
    }
}
