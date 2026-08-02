package com.yandex.plus.home.feature.webviews.internal.webview;

import android.net.Uri;
import android.webkit.JavascriptInterface;
import com.yandex.plus.home.feature.webviews.internal.container.b;
import com.yandex.plus.home.feature.webviews.internal.d;
import com.yandex.plus.home.feature.webviews.internalapi.WebViewType;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.webview.api.contract.message.WebViewMessagesHandler;
import defpackage.amv;
import defpackage.bt80;
import defpackage.bv80;
import defpackage.cjw0;
import defpackage.cs80;
import defpackage.dc20;
import defpackage.di41;
import defpackage.ev80;
import defpackage.fs80;
import defpackage.fw80;
import defpackage.gov;
import defpackage.hjd0;
import defpackage.i3y;
import defpackage.i45;
import defpackage.imd0;
import defpackage.is80;
import defpackage.iw80;
import defpackage.jse;
import defpackage.ju80;
import defpackage.lt80;
import defpackage.lw80;
import defpackage.mu80;
import defpackage.nw70;
import defpackage.ny61;
import defpackage.p4z;
import defpackage.pgz;
import defpackage.ps80;
import defpackage.pt80;
import defpackage.pz40;
import defpackage.qv80;
import defpackage.rs41;
import defpackage.sls;
import defpackage.so41;
import defpackage.ss41;
import defpackage.ss80;
import defpackage.ts41;
import defpackage.tv80;
import defpackage.ty4;
import defpackage.uio;
import defpackage.vio;
import defpackage.vs80;
import defpackage.vt80;
import defpackage.vu80;
import defpackage.vzg;
import defpackage.wio;
import defpackage.wv80;
import defpackage.y821;
import defpackage.yqc;
import defpackage.zqc;
import defpackage.zv80;
import java.util.Arrays;
import kotlin.Result;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public abstract class a extends i45 implements yqc, di41, so41, ss41, rs41 {
    public final /* synthetic */ ts41 e;
    public final nw70 f;
    public final b g;
    public final dc20 h;
    public final p4z i;
    public final com.yandex.plus.home.feature.webviews.internal.settings.domain.b j;
    public final imd0 k;
    public final wio l;
    public final vio m;
    public final uio n;
    public final y821 o;
    public final zqc p;
    public final sls q;
    public final hjd0 r;
    public final d s;
    public final WebViewType t;
    public final pgz u;
    public final jse v;
    public final jse w;
    public final i3y x;

    public a(WebViewMessagesHandler webViewMessagesHandler, com.yandex.plus.webview.api.contract.message.a aVar, cjw0 cjw0Var, nw70 nw70Var, b bVar, dc20 dc20Var, p4z p4zVar, com.yandex.plus.home.feature.webviews.internal.settings.domain.b bVar2, imd0 imd0Var, wio wioVar, vio vioVar, uio uioVar, y821 y821Var, zqc zqcVar, sls slsVar, hjd0 hjd0Var, d dVar, WebViewType webViewType, pgz pgzVar, jse jseVar, jse jseVar2) {
        super(webViewMessagesHandler, aVar, jseVar);
        this.e = new ts41();
        this.f = nw70Var;
        this.g = bVar;
        this.h = dc20Var;
        this.i = p4zVar;
        this.j = bVar2;
        this.k = imd0Var;
        this.l = wioVar;
        this.m = vioVar;
        this.n = uioVar;
        this.o = y821Var;
        this.p = zqcVar;
        this.q = slsVar;
        this.r = hjd0Var;
        this.s = dVar;
        this.t = webViewType;
        this.u = pgzVar;
        this.v = jseVar;
        this.w = jseVar2;
        this.x = kotlin.a.a(new ty4(cjw0Var, 0));
    }

    public static final amv v(a aVar, fs80 fs80Var, Boolean bool, boolean z, boolean z2, String str) {
        aVar.getClass();
        return new amv(fs80Var.a, fs80Var.b, bool, z, z2, str);
    }

    @Override // defpackage.rs41
    public final void b() {
        String x = x();
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.u;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, x, "onReady()");
        }
        this.p.b();
    }

    @Override // defpackage.so41
    public final void f(String str, int i, String str2, String str3, boolean z) {
        if (z) {
            this.p.g(String.format("connection error, error code = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), str, false);
        }
        this.l.c(str, i, str2, str3, z);
    }

    @Override // defpackage.in41
    public final void g() {
        String x = x();
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.u;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, x, "onLoadStartCommand");
        }
        pz40 b = this.e.b();
        Boolean bool = Boolean.FALSE;
        r0 r0Var = (r0) b;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    @Override // defpackage.di41
    public final void k(String str) {
        String x = x();
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.u;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, x, "onPageLoadingFinished()");
        }
    }

    @Override // defpackage.so41
    public final void l(String str, int i, String str2, String str3, boolean z) {
        if (z) {
            this.p.g("ssl error", str, true);
        }
        this.l.e(str, i, str2, str3, z);
    }

    @Override // defpackage.rs41
    public final void n() {
        String x = x();
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.u;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, x, "onReadyTimeout()");
        }
        this.p.f();
    }

    @Override // defpackage.i45, defpackage.yqc
    @JavascriptInterface
    public void onMessage(String str) {
        String x = x();
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.u;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, x, "onMessage: ".concat(str));
        }
        super.onMessage(str);
    }

    @Override // defpackage.ss41
    public final pz40 p() {
        return this.e.b();
    }

    @Override // defpackage.so41
    public final void r(String str, int i, String str2, String str3, boolean z) {
        if (z) {
            this.p.g(String.format("http error, status code = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), str, false);
        }
        this.l.b(str, i, str2, str3, z);
    }

    @Override // defpackage.i45
    public final void u(WebViewMessagesHandler webViewMessagesHandler) {
        webViewMessagesHandler.b(mu80.class, new BaseCommonWebViewContract$registerMessageHandlers$1(1, this, a.class, "handleOptionStatusRequest", "handleOptionStatusRequest(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$OptionStatusRequest;)V", 0));
        webViewMessagesHandler.b(fs80.class, new BaseCommonWebViewContract$registerMessageHandlers$2(1, this, a.class, "handleChangeOptionStatusRequest", "handleChangeOptionStatusRequest(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$ChangeOptionStatusRequest;)V", 0));
        webViewMessagesHandler.b(iw80.class, new BaseCommonWebViewContract$registerMessageHandlers$3(1, this, a.class, "handleUserBoughtSubscription", "handleUserBoughtSubscription(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$UserBoughtSubscription;)V", 0));
        webViewMessagesHandler.b(fw80.class, new BaseCommonWebViewContract$registerMessageHandlers$4(1, this, a.class, "handleUpdateTargetsState", "handleUpdateTargetsState(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$UpdateTargetsState;)V", 0));
        webViewMessagesHandler.b(ps80.class, new BaseCommonWebViewContract$registerMessageHandlers$5(1, this, a.class, "handleCriticalError", "handleCriticalError(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$CriticalError;)V", 0));
        webViewMessagesHandler.b(lw80.class, new BaseCommonWebViewContract$registerMessageHandlers$6(1, this, a.class, "handleUserCardRequest", "handleUserCardRequest(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$UserCardRequest;)V", 0));
        webViewMessagesHandler.b(wv80.class, new BaseCommonWebViewContract$registerMessageHandlers$7(1, this, a.class, "handleSuccessScreenShown", "handleSuccessScreenShown(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$SuccessScreenShown;)V", 0));
        webViewMessagesHandler.b(tv80.class, new BaseCommonWebViewContract$registerMessageHandlers$8(1, this, a.class, "handleSuccessScreenButtonTapped", "handleSuccessScreenButtonTapped(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$SuccessScreenButtonTapped;)V", 0));
        webViewMessagesHandler.b(vt80.class, new BaseCommonWebViewContract$registerMessageHandlers$9(1, this, a.class, "handleOpenSmart", "handleOpenSmart(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$OpenSmart;)V", 0));
        webViewMessagesHandler.b(ev80.class, new BaseCommonWebViewContract$registerMessageHandlers$10(1, this, a.class, "handleSendMetricsEvent", "handleSendMetricsEvent(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$SendMetricsEvent;)V", 0));
        webViewMessagesHandler.b(ju80.class, new BaseCommonWebViewContract$registerMessageHandlers$11(1, this, a.class, "handleOpenUrl", "handleOpenUrl(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$OpenUrl;)V", 0));
        webViewMessagesHandler.b(is80.class, new BaseCommonWebViewContract$registerMessageHandlers$12(1, this, a.class, "handleCloseCurrentWebView", "handleCloseCurrentWebView(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$CloseCurrentWebView;)V", 0));
        webViewMessagesHandler.b(vu80.class, new BaseCommonWebViewContract$registerMessageHandlers$13(1, this, a.class, "handleReady", "handleReady(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$Ready;)V", 0));
        webViewMessagesHandler.b(pt80.class, new BaseCommonWebViewContract$registerMessageHandlers$14(1, this, a.class, "handleNeedAuthorization", "handleNeedAuthorization(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$NeedAuthorization;)V", 0));
        webViewMessagesHandler.b(bt80.class, new BaseCommonWebViewContract$registerMessageHandlers$15(1, this, a.class, "handleLogoutRequest", "handleLogoutRequest(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$LogoutRequest;)V", 0));
        webViewMessagesHandler.b(bv80.class, new BaseCommonWebViewContract$registerMessageHandlers$16(1, this, a.class, "handleSendBroadcastEvent", "handleSendBroadcastEvent(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$SendBroadcastEvent;)V", 0));
        webViewMessagesHandler.b(qv80.class, new BaseCommonWebViewContract$registerMessageHandlers$17(1, this, a.class, "handleShowServiceInfo", "handleShowServiceInfo(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$ShowServiceInfo;)V", 0));
        webViewMessagesHandler.b(zv80.class, new BaseCommonWebViewContract$registerMessageHandlers$18(1, this, a.class, "handleTreasuryStateRequest", "handleTreasuryStateRequest(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$TreasuryStateRequest;)V", 0));
        webViewMessagesHandler.b(cs80.class, new BaseCommonWebViewContract$registerMessageHandlers$19(1, this, a.class, "handleCallbackEvent", "handleCallbackEvent(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$CallbackEvent;)V", 0));
        webViewMessagesHandler.b(lt80.class, new BaseCommonWebViewContract$registerMessageHandlers$20(1, this, a.class, "handleVibrateRequest", "handleVibrateRequest(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$NativeVibrateRequest;)V", 0));
        webViewMessagesHandler.b(ss80.class, new BaseCommonWebViewContract$registerMessageHandlers$21(1, this, a.class, "handleDisableSwipeClose", "handleDisableSwipeClose(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$DisableSwipeClose;)V", 0));
        webViewMessagesHandler.b(vs80.class, new BaseCommonWebViewContract$registerMessageHandlers$22(1, this, a.class, "handleEnableSwipeClose", "handleEnableSwipeClose(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$EnableSwipeClose;)V", 0));
        w(webViewMessagesHandler);
    }

    public abstract void w(WebViewMessagesHandler webViewMessagesHandler);

    public abstract String x();

    public void y(ju80 ju80Var) {
        Uri uri = ju80Var.b;
        String x = x();
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.u;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, x, "handleOpenUrlMessage() outMessage=" + ju80Var);
        }
        if (((com.yandex.plus.home.feature.webviews.internal.container.a) this.g).w(uri)) {
            return;
        }
        Object G = this.f.G(ju80Var);
        if (!(G instanceof Result.Failure)) {
            b.b(this.g, (vzg) G, true, null, null, null, null, 60);
        }
        Throwable a = Result.a(G);
        if (a != null) {
            String x2 = x();
            LogPriority logPriority2 = LogPriority.ERROR;
            if (pgzVar.e(logPriority2)) {
                pgzVar.b(logPriority2, x2, "handleOpenUrlMessage() error", a);
            }
            this.m.c(uri.toString());
        }
    }

    public final void z(gov govVar) {
        String x = x();
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.u;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, x, "sendMessage() message=" + govVar);
        }
        com.yandex.plus.webview.api.contract.message.a aVar = this.c;
        if (aVar != null) {
            aVar.b(govVar);
        } else {
            ny61.r("Sending messages is not supported by this contract");
        }
    }
}
