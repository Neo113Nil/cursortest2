package com.yandex.messaging.miniapps.view;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.yandex.bricks.Brick;
import com.yandex.messaging.miniapps.js.ChannelMessageType;
import com.yandex.messaging.miniapps.js.MiniAppJsInterface;
import com.yandex.messaging.miniapps.js.listeners.c;
import com.yandex.messaging.miniapps.js.listeners.d;
import com.yandex.messaging.miniapps.js.listeners.e;
import com.yandex.messaging.miniapps.view.a;
import defpackage.ai91;
import defpackage.b64;
import defpackage.e9h0;
import defpackage.ewy0;
import defpackage.g8e;
import defpackage.hci0;
import defpackage.hi91;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.lh20;
import defpackage.nh20;
import defpackage.oh20;
import defpackage.pzt0;
import defpackage.s8g;
import defpackage.sc20;
import defpackage.sh20;
import defpackage.sls;
import defpackage.th20;
import defpackage.tje;
import defpackage.uh20;
import defpackage.vh20;
import defpackage.wh20;
import defpackage.x22;
import defpackage.ydz;
import defpackage.z83;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class a extends Brick {
    public final com.yandex.messaging.internal.net.a A;
    public final oh20 B;
    public final View C;
    public final WebView D;
    public final View E;
    public final View F;
    public final int G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public MiniAppBrick$SizeSource L;
    public pzt0 M;
    public final i3y N;
    public final i3y O;
    public final i3y P;
    public final i3y Q;
    public final i3y R;
    public final i3y S;
    public final MiniAppJsInterface a;
    public final sh20 b;
    public final nh20 c;
    public final s8g w;
    public final wh20 x;
    public final lh20 y;
    public final x22 z;

    public a(Activity activity, MiniAppJsInterface miniAppJsInterface, sh20 sh20Var, nh20 nh20Var, s8g s8gVar, wh20 wh20Var, lh20 lh20Var, x22 x22Var, com.yandex.messaging.internal.net.a aVar, oh20 oh20Var) {
        this.a = miniAppJsInterface;
        this.b = sh20Var;
        this.c = nh20Var;
        this.w = s8gVar;
        this.x = wh20Var;
        this.y = lh20Var;
        this.z = x22Var;
        this.A = aVar;
        this.B = oh20Var;
        View inflate = inflate(activity, lh20Var.c);
        this.C = inflate;
        this.D = (WebView) inflate.findViewById(e9h0.miniapp_webview);
        View findViewById = inflate.findViewById(e9h0.miniapp_progress_container);
        this.E = findViewById;
        this.F = inflate.findViewById(e9h0.miniapp_offset_view);
        this.G = findViewById.getPaddingBottom();
        final int i = 1;
        this.J = true;
        this.L = MiniAppBrick$SizeSource.HEIGHT;
        final int i2 = 0;
        this.N = kotlin.a.a(new sls(this) { // from class: kh20
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                a aVar2 = this.b;
                switch (i3) {
                    case 0:
                        s8g s8gVar2 = aVar2.w;
                        WebView webView = aVar2.D;
                        s8gVar2.getClass();
                        webView.getClass();
                        z8g z8gVar = s8gVar2.a;
                        p8g p8gVar = s8gVar2.b;
                        h8g h8gVar = s8gVar2.c;
                        pzf pzfVar = s8gVar2.d;
                        t8g t8gVar = new t8g();
                        xvf0 b = i5m.b(new aos(n3w.a(webView), 12));
                        t8gVar.a = b;
                        t8gVar.b = i5m.b(new zo0(h8gVar.h, p8gVar.G2, (n3w) pzfVar.l, b, (xvf0) pzfVar.d, z8gVar.y, 11));
                        t8gVar.c = i5m.b(new zo0(h8gVar.h, p8gVar.G2, (n3w) pzfVar.l, t8gVar.a, (xvf0) pzfVar.d, z8gVar.y, 29));
                        t8gVar.d = i5m.b(new pmn0(h8gVar.h, (n3w) pzfVar.l, t8gVar.a, (xvf0) pzfVar.d, z8gVar.y, 11));
                        t8gVar.e = i5m.b(new p8k0((n3w) pzfVar.l, t8gVar.a, (xvf0) pzfVar.d, z8gVar.y, 23));
                        return t8gVar;
                    case 1:
                        return (c) ((t8g) aVar2.N.getValue()).c.get();
                    case 2:
                        return (d) ((t8g) aVar2.N.getValue()).d.get();
                    case 3:
                        return (e) ((t8g) aVar2.N.getValue()).e.get();
                    case 4:
                        return (com.yandex.messaging.miniapps.js.listeners.a) ((t8g) aVar2.N.getValue()).b.get();
                    default:
                        return (th20) ((t8g) aVar2.N.getValue()).a.get();
                }
            }
        });
        this.O = kotlin.a.a(new sls(this) { // from class: kh20
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                a aVar2 = this.b;
                switch (i3) {
                    case 0:
                        s8g s8gVar2 = aVar2.w;
                        WebView webView = aVar2.D;
                        s8gVar2.getClass();
                        webView.getClass();
                        z8g z8gVar = s8gVar2.a;
                        p8g p8gVar = s8gVar2.b;
                        h8g h8gVar = s8gVar2.c;
                        pzf pzfVar = s8gVar2.d;
                        t8g t8gVar = new t8g();
                        xvf0 b = i5m.b(new aos(n3w.a(webView), 12));
                        t8gVar.a = b;
                        t8gVar.b = i5m.b(new zo0(h8gVar.h, p8gVar.G2, (n3w) pzfVar.l, b, (xvf0) pzfVar.d, z8gVar.y, 11));
                        t8gVar.c = i5m.b(new zo0(h8gVar.h, p8gVar.G2, (n3w) pzfVar.l, t8gVar.a, (xvf0) pzfVar.d, z8gVar.y, 29));
                        t8gVar.d = i5m.b(new pmn0(h8gVar.h, (n3w) pzfVar.l, t8gVar.a, (xvf0) pzfVar.d, z8gVar.y, 11));
                        t8gVar.e = i5m.b(new p8k0((n3w) pzfVar.l, t8gVar.a, (xvf0) pzfVar.d, z8gVar.y, 23));
                        return t8gVar;
                    case 1:
                        return (c) ((t8g) aVar2.N.getValue()).c.get();
                    case 2:
                        return (d) ((t8g) aVar2.N.getValue()).d.get();
                    case 3:
                        return (e) ((t8g) aVar2.N.getValue()).e.get();
                    case 4:
                        return (com.yandex.messaging.miniapps.js.listeners.a) ((t8g) aVar2.N.getValue()).b.get();
                    default:
                        return (th20) ((t8g) aVar2.N.getValue()).a.get();
                }
            }
        });
        final int i3 = 2;
        this.P = kotlin.a.a(new sls(this) { // from class: kh20
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i3;
                a aVar2 = this.b;
                switch (i32) {
                    case 0:
                        s8g s8gVar2 = aVar2.w;
                        WebView webView = aVar2.D;
                        s8gVar2.getClass();
                        webView.getClass();
                        z8g z8gVar = s8gVar2.a;
                        p8g p8gVar = s8gVar2.b;
                        h8g h8gVar = s8gVar2.c;
                        pzf pzfVar = s8gVar2.d;
                        t8g t8gVar = new t8g();
                        xvf0 b = i5m.b(new aos(n3w.a(webView), 12));
                        t8gVar.a = b;
                        t8gVar.b = i5m.b(new zo0(h8gVar.h, p8gVar.G2, (n3w) pzfVar.l, b, (xvf0) pzfVar.d, z8gVar.y, 11));
                        t8gVar.c = i5m.b(new zo0(h8gVar.h, p8gVar.G2, (n3w) pzfVar.l, t8gVar.a, (xvf0) pzfVar.d, z8gVar.y, 29));
                        t8gVar.d = i5m.b(new pmn0(h8gVar.h, (n3w) pzfVar.l, t8gVar.a, (xvf0) pzfVar.d, z8gVar.y, 11));
                        t8gVar.e = i5m.b(new p8k0((n3w) pzfVar.l, t8gVar.a, (xvf0) pzfVar.d, z8gVar.y, 23));
                        return t8gVar;
                    case 1:
                        return (c) ((t8g) aVar2.N.getValue()).c.get();
                    case 2:
                        return (d) ((t8g) aVar2.N.getValue()).d.get();
                    case 3:
                        return (e) ((t8g) aVar2.N.getValue()).e.get();
                    case 4:
                        return (com.yandex.messaging.miniapps.js.listeners.a) ((t8g) aVar2.N.getValue()).b.get();
                    default:
                        return (th20) ((t8g) aVar2.N.getValue()).a.get();
                }
            }
        });
        final int i4 = 3;
        this.Q = kotlin.a.a(new sls(this) { // from class: kh20
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i4;
                a aVar2 = this.b;
                switch (i32) {
                    case 0:
                        s8g s8gVar2 = aVar2.w;
                        WebView webView = aVar2.D;
                        s8gVar2.getClass();
                        webView.getClass();
                        z8g z8gVar = s8gVar2.a;
                        p8g p8gVar = s8gVar2.b;
                        h8g h8gVar = s8gVar2.c;
                        pzf pzfVar = s8gVar2.d;
                        t8g t8gVar = new t8g();
                        xvf0 b = i5m.b(new aos(n3w.a(webView), 12));
                        t8gVar.a = b;
                        t8gVar.b = i5m.b(new zo0(h8gVar.h, p8gVar.G2, (n3w) pzfVar.l, b, (xvf0) pzfVar.d, z8gVar.y, 11));
                        t8gVar.c = i5m.b(new zo0(h8gVar.h, p8gVar.G2, (n3w) pzfVar.l, t8gVar.a, (xvf0) pzfVar.d, z8gVar.y, 29));
                        t8gVar.d = i5m.b(new pmn0(h8gVar.h, (n3w) pzfVar.l, t8gVar.a, (xvf0) pzfVar.d, z8gVar.y, 11));
                        t8gVar.e = i5m.b(new p8k0((n3w) pzfVar.l, t8gVar.a, (xvf0) pzfVar.d, z8gVar.y, 23));
                        return t8gVar;
                    case 1:
                        return (c) ((t8g) aVar2.N.getValue()).c.get();
                    case 2:
                        return (d) ((t8g) aVar2.N.getValue()).d.get();
                    case 3:
                        return (e) ((t8g) aVar2.N.getValue()).e.get();
                    case 4:
                        return (com.yandex.messaging.miniapps.js.listeners.a) ((t8g) aVar2.N.getValue()).b.get();
                    default:
                        return (th20) ((t8g) aVar2.N.getValue()).a.get();
                }
            }
        });
        final int i5 = 4;
        this.R = kotlin.a.a(new sls(this) { // from class: kh20
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i5;
                a aVar2 = this.b;
                switch (i32) {
                    case 0:
                        s8g s8gVar2 = aVar2.w;
                        WebView webView = aVar2.D;
                        s8gVar2.getClass();
                        webView.getClass();
                        z8g z8gVar = s8gVar2.a;
                        p8g p8gVar = s8gVar2.b;
                        h8g h8gVar = s8gVar2.c;
                        pzf pzfVar = s8gVar2.d;
                        t8g t8gVar = new t8g();
                        xvf0 b = i5m.b(new aos(n3w.a(webView), 12));
                        t8gVar.a = b;
                        t8gVar.b = i5m.b(new zo0(h8gVar.h, p8gVar.G2, (n3w) pzfVar.l, b, (xvf0) pzfVar.d, z8gVar.y, 11));
                        t8gVar.c = i5m.b(new zo0(h8gVar.h, p8gVar.G2, (n3w) pzfVar.l, t8gVar.a, (xvf0) pzfVar.d, z8gVar.y, 29));
                        t8gVar.d = i5m.b(new pmn0(h8gVar.h, (n3w) pzfVar.l, t8gVar.a, (xvf0) pzfVar.d, z8gVar.y, 11));
                        t8gVar.e = i5m.b(new p8k0((n3w) pzfVar.l, t8gVar.a, (xvf0) pzfVar.d, z8gVar.y, 23));
                        return t8gVar;
                    case 1:
                        return (c) ((t8g) aVar2.N.getValue()).c.get();
                    case 2:
                        return (d) ((t8g) aVar2.N.getValue()).d.get();
                    case 3:
                        return (e) ((t8g) aVar2.N.getValue()).e.get();
                    case 4:
                        return (com.yandex.messaging.miniapps.js.listeners.a) ((t8g) aVar2.N.getValue()).b.get();
                    default:
                        return (th20) ((t8g) aVar2.N.getValue()).a.get();
                }
            }
        });
        final int i6 = 5;
        this.S = kotlin.a.a(new sls(this) { // from class: kh20
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i6;
                a aVar2 = this.b;
                switch (i32) {
                    case 0:
                        s8g s8gVar2 = aVar2.w;
                        WebView webView = aVar2.D;
                        s8gVar2.getClass();
                        webView.getClass();
                        z8g z8gVar = s8gVar2.a;
                        p8g p8gVar = s8gVar2.b;
                        h8g h8gVar = s8gVar2.c;
                        pzf pzfVar = s8gVar2.d;
                        t8g t8gVar = new t8g();
                        xvf0 b = i5m.b(new aos(n3w.a(webView), 12));
                        t8gVar.a = b;
                        t8gVar.b = i5m.b(new zo0(h8gVar.h, p8gVar.G2, (n3w) pzfVar.l, b, (xvf0) pzfVar.d, z8gVar.y, 11));
                        t8gVar.c = i5m.b(new zo0(h8gVar.h, p8gVar.G2, (n3w) pzfVar.l, t8gVar.a, (xvf0) pzfVar.d, z8gVar.y, 29));
                        t8gVar.d = i5m.b(new pmn0(h8gVar.h, (n3w) pzfVar.l, t8gVar.a, (xvf0) pzfVar.d, z8gVar.y, 11));
                        t8gVar.e = i5m.b(new p8k0((n3w) pzfVar.l, t8gVar.a, (xvf0) pzfVar.d, z8gVar.y, 23));
                        return t8gVar;
                    case 1:
                        return (c) ((t8g) aVar2.N.getValue()).c.get();
                    case 2:
                        return (d) ((t8g) aVar2.N.getValue()).d.get();
                    case 3:
                        return (e) ((t8g) aVar2.N.getValue()).e.get();
                    case 4:
                        return (com.yandex.messaging.miniapps.js.listeners.a) ((t8g) aVar2.N.getValue()).b.get();
                    default:
                        return (th20) ((t8g) aVar2.N.getValue()).a.get();
                }
            }
        });
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        return this.C;
    }

    @Override // com.yandex.bricks.Brick
    public final void onBrickAttach(Bundle bundle) {
        String str;
        super.onBrickAttach(bundle);
        sc20 sc20Var = new sc20(1, this);
        View view = this.E;
        ai91.b(sc20Var, view);
        ai91.f(view, false);
        WebView webView = this.D;
        webView.setVisibility(4);
        z83.i();
        webView.getSettings().setDatabaseEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setUseWideViewPort(true);
        WebSettings settings = webView.getSettings();
        PackageInfo packageInfo = webView.getContext().getPackageManager().getPackageInfo(webView.getContext().getPackageName(), 0);
        if (packageInfo == null || (str = packageInfo.versionName) == null) {
            str = "unknown";
        }
        settings.setUserAgentString(WebSettings.getDefaultUserAgent(webView.getContext()) + " " + g8e.p(webView.getContext().getPackageName(), "/", str) + " Android MiniApp 190");
        webView.removeJavascriptInterface("miniappJsInterface");
        webView.addJavascriptInterface(this.a, "miniappJsInterface");
        webView.setWebViewClient(new WebViewClient() { // from class: com.yandex.messaging.miniapps.view.MiniAppBrick$MiniAppWebViewClient
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view2, String url) {
                super.onPageFinished(view2, url);
                a aVar = a.this;
                if (aVar.I || !aVar.J) {
                    return;
                }
                aVar.z.c("csat_page_finished", "url", url);
                a.this.I = true;
                String uuid = UUID.randomUUID().toString();
                a.this.a.b();
                a aVar2 = a.this;
                aVar2.a.a((c) aVar2.O.getValue());
                a aVar3 = a.this;
                aVar3.a.a((com.yandex.messaging.miniapps.js.listeners.a) aVar3.R.getValue());
                a aVar4 = a.this;
                aVar4.L = MiniAppBrick$SizeSource.HEIGHT;
                MiniAppJsInterface miniAppJsInterface = aVar4.a;
                d dVar = (d) aVar4.P.getValue();
                dVar.j = new MiniAppBrick$MiniAppWebViewClient$onPageFinished$1$1(1, a.this, a.class, "onHeightReceived", "onHeightReceived(I)V", 0);
                miniAppJsInterface.a(dVar);
                a aVar5 = a.this;
                MiniAppJsInterface miniAppJsInterface2 = aVar5.a;
                e eVar = (e) aVar5.Q.getValue();
                eVar.i = new MiniAppBrick$MiniAppWebViewClient$onPageFinished$2$1(1, a.this, a.class, "onSizeReceived", "onSizeReceived(Lcom/yandex/messaging/miniapps/size/SizeHolder;)V", 0);
                miniAppJsInterface2.a(eVar);
                a.this.a.a(new hci0(uuid, new MiniAppBrick$MiniAppWebViewClient$onPageFinished$3(1, a.this, a.class, "miniAppReady", "miniAppReady(Lcom/yandex/messaging/miniapps/size/SizeHolder;)V", 0)));
                th20 th20Var = (th20) a.this.S.getValue();
                sh20 sh20Var = a.this.b;
                String str2 = sh20Var.b;
                uh20 uh20Var = sh20Var.a;
                uh20Var.getClass();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("lang", uh20Var.a.b);
                vh20 vh20Var = uh20Var.b;
                vh20Var.getClass();
                JSONObject jSONObject2 = new JSONObject();
                for (ewy0 ewy0Var : vh20.b) {
                    jSONObject2.put(ewy0Var.a, ewy0Var.b.invoke(vh20Var.a));
                }
                jSONObject.put("themeVariables", jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("miniappTransport", jSONObject);
                JSONObject a = uh20Var.a(ChannelMessageType.Registration, uuid, null);
                a.put(Constants.KEY_DATA, jSONObject3);
                String b = sh20.b(new String[]{"'ping sent'", "'@@@@ping_" + uuid + "'"});
                String b2 = sh20.b(new String[]{"'received incoming ping'"});
                String b3 = sh20.b(new String[]{"'received pong'"});
                String b4 = sh20.b(new String[]{"'undefined message'", "JSON.stringify(event)", "event.data"});
                StringBuilder v = b64.v("\n            var miniappChannel = new MessageChannel();\n            if (document.readyState == \"complete\") {\n                onLoad();\n            } else {\n                window.addEventListener(\"load\", function() {\n                    onLoad();\n                });\n            }\n            function onLoad() {\n                window.addEventListener('message', handleMessage);\n                ping();\n            }\n            function ping() {\n                ", b, "\n                window.postMessage('@@@@ping_", uuid, "', '*');\n                timeoutId = setTimeout(ping, 10);\n            }\n            function handleMessage(event) {\n                if (event.data === '@@@@ping_");
                g8e.D(v, str2, "') {\n                    ", b2, "\n                    window.postMessage('@@@@pong_");
                g8e.D(v, str2, "', '*');\n                    openPort();\n                } else if (event.data === '@@@@pong_", uuid, "') {\n                    ");
                g8e.D(v, b3, "\n                    openPort();\n                } else {\n                    ", b4, "\n                }\n            }\n            function openPort() {\n                clearTimeout(timeoutId);\n                window.removeEventListener('message', handleMessage);\n                openPortInternal();\n            }\n            function openPortInternal() {\n                miniappChannel.port1.onmessage = function(e) {\n                    miniappJsInterface.receiveMessage(JSON.stringify(e.data));\n                };\n                miniappChannel.port1.start();\n                window.postMessage(");
                v.append(a);
                v.append(", '*', [miniappChannel.port2]);\n            }\n        ");
                th20Var.a(v.toString());
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView view2, WebResourceRequest request, WebResourceError error) {
                Uri url;
                if (request != null && (url = request.getUrl()) != null) {
                    a aVar = a.this;
                    if (jl40.l(url.toString(), aVar.x.c)) {
                        aVar.J = false;
                        tje.N(aVar.B, null, null, new MiniAppBrick$MiniAppWebViewClient$onReceivedError$1$1(aVar, url, null), 3);
                    }
                }
                super.onReceivedError(view2, request, error);
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view2, WebResourceRequest request) {
                return false;
            }
        });
        webView.setWebChromeClient(new WebChromeClient() { // from class: com.yandex.messaging.miniapps.view.MiniAppBrick$MiniAppChromeClient
            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                if (consoleMessage != null && ydz.a.a()) {
                    consoleMessage.lineNumber();
                    consoleMessage.message();
                    ydz.a();
                }
                return super.onConsoleMessage(consoleMessage);
            }
        });
        this.H = true;
        String str2 = this.x.c;
        if (str2 != null) {
            this.z.c("csat_load_url", "url", str2);
            webView.loadUrl(str2);
        }
        if (!this.y.d) {
            pzt0 pzt0Var = this.M;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            this.M = tje.N(getBrickScope(), null, null, new MiniAppBrick$onBrickAttach$1(this, null), 3);
        }
        hi91.g(new MiniAppBrick$onBrickAttach$2(this, null), this.F);
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        wh20 wh20Var = this.x;
        wh20Var.b = null;
        wh20Var.c = null;
        this.a.b();
        WebView webView = this.D;
        webView.clearCache(true);
        webView.clearHistory();
        this.H = false;
        pzt0 pzt0Var = this.M;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.M = null;
    }

    public final void q(String str) {
        this.J = true;
        wh20 wh20Var = this.x;
        wh20Var.getClass();
        z83.i();
        wh20Var.c = str;
        if (this.H) {
            this.z.c("csat_load_url", "url", str);
            this.D.loadUrl(str);
        }
    }
}
