package com.yandex.messenger.websdk.internal.webview;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.FragmentActivity;
import com.yandex.messenger.websdk.api.ChatRequest;
import com.yandex.messenger.websdk.api.WebErrorException;
import com.yandex.messenger.websdk.api.WebMessengerNavigationInterceptor;
import com.yandex.messenger.websdk.internal.web.HttpErrorException;
import com.yandex.messenger.websdk.internal.web.MessageType;
import defpackage.beb;
import defpackage.c7t;
import defpackage.c9v;
import defpackage.cvu0;
import defpackage.e48;
import defpackage.eeb;
import defpackage.ew2;
import defpackage.g8e;
import defpackage.gw00;
import defpackage.h790;
import defpackage.hc3;
import defpackage.hdu;
import defpackage.heb;
import defpackage.hjw0;
import defpackage.ieb;
import defpackage.im3;
import defpackage.jl40;
import defpackage.jm3;
import defpackage.ly3;
import defpackage.nax;
import defpackage.p370;
import defpackage.q4g;
import defpackage.r8t;
import defpackage.rax;
import defpackage.tj41;
import defpackage.udq0;
import defpackage.uw51;
import defpackage.vkb1;
import defpackage.vx21;
import defpackage.xdb;
import defpackage.yfa;
import defpackage.ymj;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\u0004\u0018\u00010\u00152\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0016\u0010!\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"¨\u0006$"}, d2 = {"Lcom/yandex/messenger/websdk/internal/webview/ChatWebViewClient;", "Landroid/webkit/WebViewClient;", "Lieb;", "controller", "<init>", "(Lieb;)V", "Landroid/webkit/WebView;", "view", "", "url", "Landroid/graphics/Bitmap;", "favicon", "Lzy11;", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceError;", "error", "onReceivedError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "Landroid/webkit/WebResourceResponse;", "errorResponse", "onReceivedHttpError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V", "shouldInterceptRequest", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Lieb;", "authInProgress", "Z", "successLoading", "websdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChatWebViewClient extends WebViewClient {
    private boolean authInProgress;
    private final ieb controller;
    private boolean successLoading = true;

    public ChatWebViewClient(ieb iebVar) {
        this.controller = iebVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        heb hebVar = (heb) this.controller;
        hebVar.getClass();
        String fragment = Uri.parse(url).getFragment();
        int i = 0;
        hebVar.E = fragment == null ? ChatWebViewController$IntentPage.UNDEFINED : fragment.equals("/") ? ChatWebViewController$IntentPage.CHAT_LIST : cvu0.x(fragment, "/@/", false) ? ChatWebViewController$IntentPage.PROFILE : (cvu0.x(fragment, "/chats/", false) || cvu0.x(fragment, "/user/", false)) ? ChatWebViewController$IntentPage.CHAT : ChatWebViewController$IntentPage.UNDEFINED;
        hebVar.k();
        if (view.getProgress() == 100) {
            ((heb) this.controller).g.b("wm_messenger_completely_loaded");
            p370 p370Var = ((heb) this.controller).r;
            p370Var.getClass();
            jl40.m();
            h790 h790Var = (h790) p370Var.w;
            if (h790Var != null) {
                h790Var.c = Long.valueOf(SystemClock.elapsedRealtime());
            }
        }
        heb hebVar2 = (heb) this.controller;
        if (hebVar2.B || this.authInProgress || !this.successLoading) {
            return;
        }
        hebVar2.g.b("wm_messenger_loaded");
        p370 p370Var2 = ((heb) this.controller).r;
        p370Var2.getClass();
        jl40.m();
        h790 h790Var2 = (h790) p370Var2.w;
        if (h790Var2 != null) {
            h790Var2.b = Long.valueOf(SystemClock.elapsedRealtime());
        }
        this.authInProgress = true;
        heb hebVar3 = (heb) this.controller;
        hebVar3.u = false;
        jm3 jm3Var = hebVar3.d;
        yfa yfaVar = new yfa(this);
        jm3Var.c.b("wm_auth_process");
        jl40.m();
        if (jm3Var.d == null) {
            NullPointerException nullPointerException = new NullPointerException("Auth token not initialized");
            ChatWebViewClient chatWebViewClient = (ChatWebViewClient) yfaVar.a;
            ew2 ew2Var = ((heb) chatWebViewClient.controller).g;
            String message = nullPointerException.getMessage();
            if (message == null) {
                message = "";
            }
            ew2Var.c("wm_auth_error", gw00.e(new Pair(Constants.KEY_MESSAGE, message)));
            chatWebViewClient.authInProgress = false;
            chatWebViewClient.successLoading = false;
            ((heb) chatWebViewClient.controller).d.getClass();
            heb hebVar4 = (heb) chatWebViewClient.controller;
            hebVar4.getClass();
            hebVar4.j(new beb(nullPointerException));
            hebVar4.Q.c();
            return;
        }
        ChatWebViewClient chatWebViewClient2 = (ChatWebViewClient) yfaVar.a;
        ((heb) chatWebViewClient2.controller).g.b("wm_auth_successful");
        final heb hebVar5 = (heb) chatWebViewClient2.controller;
        ew2 ew2Var2 = hebVar5.g;
        rax raxVar = hebVar5.O;
        nax e = hebVar5.e();
        c9v c9vVar = hebVar5.C;
        if (c9vVar == null) {
            c9vVar = null;
        }
        raxVar.a(new c7t(e, c9vVar, ew2Var2));
        raxVar.a(new r8t((hjw0) hebVar5.J.getValue(), ew2Var2));
        String F = udq0.F();
        tj41 tj41Var = new tj41() { // from class: aeb
            @Override // defpackage.tj41
            public final void a(fqv fqvVar) {
                pw50 pw50Var;
                JSONObject f;
                JSONObject f2;
                JSONObject f3;
                String g;
                heb hebVar6 = heb.this;
                ew2 ew2Var3 = hebVar6.g;
                rax raxVar2 = hebVar6.O;
                JSONObject jSONObject = fqvVar.c;
                if (jSONObject != null && (f = hbb1.f(Constants.KEY_DATA, jSONObject)) != null && (f2 = hbb1.f("payload", f)) != null && (f3 = hbb1.f("hosts", f2)) != null && (g = hbb1.g("filesHost", f3)) != null) {
                    hebVar6.L = g;
                }
                do41 do41Var = new do41("*");
                hebVar6.l(hebVar6.j.a(do41Var));
                hebVar6.x = do41Var;
                raxVar2.a(new geb(hebVar6, 0));
                raxVar2.a(new geb(hebVar6, 1));
                fr31 fr31Var = hebVar6.w;
                if (fr31Var != null) {
                    ydb ydbVar = new ydb(hebVar6, 2);
                    fr31Var.b.add(ydbVar);
                    ydbVar.invoke(Boolean.valueOf(fr31Var.c));
                    pw50Var = new pw50(2, fr31Var, ydbVar);
                } else {
                    pw50Var = null;
                }
                hebVar6.z.setValue(hebVar6, heb.R[3], pw50Var);
                ew2Var3.b("wm_web_ready_for_chat");
                p370 p370Var3 = hebVar6.r;
                p370Var3.getClass();
                jl40.m();
                h790 h790Var3 = (h790) p370Var3.w;
                if (h790Var3 != null) {
                    h790Var3.e = Long.valueOf(SystemClock.elapsedRealtime());
                }
                hebVar6.u = true;
                hebVar6.h();
                qsx qsxVar = hebVar6.l;
                nax e2 = hebVar6.e();
                c9v c9vVar2 = hebVar6.C;
                fh41 fh41Var = new fh41(e2, c9vVar2 != null ? c9vVar2 : null, raxVar2, ew2Var3);
                qsxVar.getClass();
                jl40.m();
                for (ChatRequest chatRequest : qsxVar.a.keySet()) {
                    LinkedHashMap linkedHashMap = fh41Var.a;
                    if (((String) linkedHashMap.get(chatRequest)) != null) {
                        jl40.x("The Web side should be subscribed only once per chat");
                    } else {
                        eh41 eh41Var = new eh41(fh41Var, chatRequest);
                        LinkedHashMap linkedHashMap2 = fh41Var.g;
                        String str = eh41Var.a;
                        linkedHashMap2.put(str, eh41Var);
                        fh41Var.f.b("wm_web_observe " + str + " for " + chatRequest);
                        linkedHashMap.put(chatRequest, str);
                    }
                }
                qsxVar.b.add(fh41Var);
                fh41Var.b = qsxVar;
                hebVar6.N.setValue(hebVar6, heb.R[4], new im3(2, fh41Var, qsxVar));
            }
        };
        jl40.m();
        raxVar.g.put(F, tj41Var);
        c9v c9vVar2 = hebVar5.C;
        c9v c9vVar3 = c9vVar2 != null ? c9vVar2 : null;
        hdu hduVar = hebVar5.e().a;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        String g = ((e48) hduVar.a).g();
        if (g != null) {
            jSONObject2.put("authToken", g);
        }
        jSONObject.put("widgetTransport", jSONObject2);
        JSONObject n = hdu.n(hduVar, MessageType.Registration, jSONObject, F);
        String a = nax.a(new String[]{"'sent ping'", "sentPing"});
        String a2 = nax.a(new String[]{"'received incoming ping'"});
        String a3 = nax.a(new String[]{"'received pong'"});
        String a4 = nax.a(new String[]{"'received my ping'"});
        String a5 = nax.a(new String[]{"'received unknown ping'", "JSON.stringify(event)", "event.data"});
        String a6 = nax.a(new String[]{"'received unknown pong'", "JSON.stringify(event)", "event.data"});
        String a7 = nax.a(new String[]{"'received undefined message'", "JSON.stringify(event)", "event.data"});
        String a8 = nax.a(new String[]{"'Channel ready:'", "androidMessengerChannel"});
        String a9 = nax.a(new String[]{"'Message received:'", "e"});
        StringBuilder v = ly3.v("\n            var androidMessengerChannel;\n            let timeoutId = -1;\n            let debug = ", ";\n            let sentPing = '@@@@ping_", F, "';\n            let receivedPong = '@@@@pong_", false);
        g8e.D(v, F, "';\n            let webSentPing = '@@@@ping';\n            let webReceivedPong = '@@@@pong';\n            window.opener = window;\n            if (document.readyState == \"complete\") {\n                onLoad();\n            } else {\n                window.addEventListener(\"load\", function() {\n                    onLoad();\n                });\n            }\n            function onLoad() {\n                window.addEventListener('message', handleMessage);\n                ping();\n            }\n            function ping() {\n                window.postMessage(sentPing, '*');\n                ", a, "\n                timeoutId = setTimeout(ping, ");
        uw51.v(10L, ");\n            }\n            function handleMessage(event) {\n                if (event.data === webSentPing) {\n                    ", a2, v);
        g8e.D(v, "\n                    window.postMessage(webReceivedPong, '*');\n                    openPort();\n                    return;\n                }\n                if (event.data === receivedPong) {\n                    ", a3, "\n                    openPort();\n                    return;\n                }\n                if (!debug) return\n                if (event.data === sentPing) {\n                    ", a4);
        g8e.D(v, "\n                    return;\n                }\n                if (event.data.startsWith('@@@@ping')) {\n                    ", a5, "\n                    return;\n                }\n                if (event.data.startsWith('@@@@pong')) {\n                    ", a6);
        g8e.D(v, "\n                    return;\n                }\n                ", a7, "\n            }\n            function openPort() {\n                clearTimeout(timeoutId);\n                window.removeEventListener('message', handleMessage);\n                openPortInternal();\n            }\n            function openPortInternal() {\n                androidMessengerChannel = new MessageChannel();\n                ", a8);
        v.append("\n\n                androidMessengerChannel.port1.onmessage = function(e) {\n                    ");
        v.append(a9);
        v.append("\n                    androidListener.receiveMessage(JSON.stringify(e.data));\n                };\n                androidMessengerChannel.port1.start();\n                window.postMessage(");
        v.append(n);
        v.append(", '*', [androidMessengerChannel.port2]);\n            }\n        ");
        c9v.h(c9vVar3, v.toString());
        ((heb) chatWebViewClient2.controller).B = true;
        p370 p370Var3 = ((heb) chatWebViewClient2.controller).r;
        p370Var3.getClass();
        jl40.m();
        h790 h790Var3 = (h790) p370Var3.w;
        if (h790Var3 != null) {
            h790Var3.d = Long.valueOf(SystemClock.elapsedRealtime());
        }
        chatWebViewClient2.authInProgress = false;
        ((heb) chatWebViewClient2.controller).Q.b();
        ieb iebVar = chatWebViewClient2.controller;
        jm3 jm3Var2 = ((heb) chatWebViewClient2.controller).d;
        xdb xdbVar = new xdb(chatWebViewClient2);
        jm3Var2.getClass();
        jl40.m();
        jm3Var2.c.b("wm_auth_subscribe_on_next_token_changes");
        jl40.m();
        jm3Var2.g.add(xdbVar);
        heb hebVar6 = (heb) iebVar;
        hebVar6.s.setValue(hebVar6, heb.R[1], new im3(i, jm3Var2, xdbVar));
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        this.successLoading = true;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        super.onReceivedError(view, request, error);
        if (vkb1.d(request.getUrl(), ((heb) this.controller).L)) {
            return;
        }
        this.successLoading = false;
        heb hebVar = (heb) this.controller;
        hebVar.g.c("wm_messenger_load_error", gw00.e(new Pair("isMainPageLoaded", Boolean.valueOf(hebVar.B))));
        ieb iebVar = this.controller;
        WebErrorException webErrorException = new WebErrorException(request.getUrl() + " -> " + error.getErrorCode() + " " + ((Object) error.getDescription()));
        heb hebVar2 = (heb) iebVar;
        if (hebVar2.B) {
            return;
        }
        hebVar2.j(hebVar2.k.a() ? new beb(webErrorException) : new eeb(webErrorException));
        hebVar2.Q.c();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        super.onReceivedHttpError(view, request, errorResponse);
        if (vkb1.d(request.getUrl(), ((heb) this.controller).L)) {
            return;
        }
        this.successLoading = false;
        heb hebVar = (heb) this.controller;
        ew2 ew2Var = hebVar.g;
        Pair pair = new Pair("isMainPageLoaded", Boolean.valueOf(hebVar.B));
        Object url = request.getUrl();
        if (url == null) {
            url = "";
        }
        ew2Var.c("wm_messenger_http_error", b.i(pair, new Pair("url", url)));
        heb hebVar2 = (heb) this.controller;
        if (hebVar2.B) {
            return;
        }
        HttpErrorException httpErrorException = new HttpErrorException(request.getUrl() + " -> " + errorResponse.getStatusCode() + " " + errorResponse.getReasonPhrase());
        hebVar2.getClass();
        hebVar2.j(new beb(httpErrorException));
        hebVar2.Q.c();
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Uri url;
        q4g q4gVar;
        if (request == null || (url = request.getUrl()) == null || !vkb1.d(url, ((heb) this.controller).L)) {
            return super.shouldInterceptRequest(view, request);
        }
        hc3 hc3Var = ((heb) this.controller).v;
        if (hc3Var != null && (q4gVar = hc3Var.e) != null) {
            vx21.b(new ymj(8, q4gVar, url));
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse("text/plain", "utf-8", vx21.b);
        webResourceResponse.setStatusCodeAndReasonPhrase(404, "handled by sdk");
        return webResourceResponse;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Uri url;
        FragmentActivity fragmentActivity;
        if (request == null || (url = request.getUrl()) == null) {
            return super.shouldOverrideUrlLoading(view, request);
        }
        WebMessengerNavigationInterceptor webMessengerNavigationInterceptor = ((heb) this.controller).o;
        Intent intent = new Intent("android.intent.action.VIEW", url);
        intent.addFlags(SelfTester_JCP.IMITA);
        intent.addCategory("android.intent.category.BROWSABLE");
        try {
            hc3 hc3Var = ((heb) this.controller).v;
            if (hc3Var == null || (fragmentActivity = hc3Var.c) == null) {
                return true;
            }
            fragmentActivity.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            ((heb) this.controller).n.a(true, "web", e);
            return true;
        }
    }
}
