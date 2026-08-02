package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import androidx.fragment.app.Fragment;
import com.yandex.messenger.websdk.api.ChatRequest;
import com.yandex.messenger.websdk.api.MessengerEnvironment;
import com.yandex.messenger.websdk.api.MessengerParams;
import com.yandex.messenger.websdk.api.WebChromeClientConfig;
import com.yandex.messenger.websdk.api.WebMessengerNavigationInterceptor;
import com.yandex.messenger.websdk.internal.web.MessageType;
import com.yandex.messenger.websdk.internal.webview.ChatWebChromeClient;
import com.yandex.messenger.websdk.internal.webview.ChatWebViewClient;
import com.yandex.messenger.websdk.internal.webview.ChatWebViewController$IntentPage;
import com.yandex.messenger.websdk.internal.webview.MessengerWebView;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.b;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import okhttp3.OkHttpClient;
import org.json.JSONObject;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes15.dex */
public final class heb implements ieb {
    public static final /* synthetic */ kgx[] R = {new MutablePropertyReference1Impl("webViewOwner", 0, "getWebViewOwner()Lcom/yandex/messenger/websdk/internal/webview/WebViewWrapper;", heb.class), oyr.B(qoi0.a, heb.class, "tokenChangeSubscription", "getTokenChangeSubscription()Lcom/yandex/messenger/websdk/api/Cancelable;", 0), new MutablePropertyReference1Impl("counterProvider", 0, "getCounterProvider()Ljava/io/Closeable;", heb.class), new MutablePropertyReference1Impl("visibilitySubscription", 0, "getVisibilitySubscription()Ljava/io/Closeable;", heb.class), new MutablePropertyReference1Impl("lastMessageProviderConnection", 0, "getLastMessageProviderConnection()Lcom/yandex/messenger/websdk/api/Cancelable;", heb.class)};
    public final a441 A;
    public boolean B;
    public c9v C;
    public ChatWebViewController$IntentPage D;
    public ChatWebViewController$IntentPage E;
    public boolean F;
    public boolean G;
    public boolean H;
    public final i3y I;
    public final i3y J;
    public tkb1 K;
    public String L;
    public boolean M;
    public final lp3 N;
    public final rax O;
    public final hlx0 P;
    public final bw41 Q;
    public final qh41 a;
    public final Context b;
    public final drw c;
    public final jm3 d;
    public final vh60 e;
    public final Looper f;
    public final ew2 g;
    public final MessengerParams h;
    public final WebChromeClientConfig i;
    public final bo41 j;
    public final sw50 k;
    public final qsx l;
    public final gc3 m;
    public final krw n;
    public final WebMessengerNavigationInterceptor o;
    public final ti3 p;
    public final pp3 q;
    public final p370 r;
    public final h0w s;
    public wcb1 t;
    public boolean u;
    public hc3 v;
    public final fr31 w;
    public do41 x;
    public final pp3 y;
    public final pp3 z;

    public heb(qh41 qh41Var, Context context, drw drwVar, jm3 jm3Var, vh60 vh60Var, Looper looper, ew2 ew2Var, MessengerParams messengerParams, WebChromeClientConfig webChromeClientConfig, bo41 bo41Var, sw50 sw50Var, qsx qsxVar, aw41 aw41Var, gc3 gc3Var, krw krwVar, WebMessengerNavigationInterceptor webMessengerNavigationInterceptor, ti3 ti3Var) {
        sr41 sr41Var;
        View asView;
        this.a = qh41Var;
        this.b = context;
        this.c = drwVar;
        this.d = jm3Var;
        this.e = vh60Var;
        this.f = looper;
        this.g = ew2Var;
        this.h = messengerParams;
        this.i = webChromeClientConfig;
        this.j = bo41Var;
        this.k = sw50Var;
        this.l = qsxVar;
        this.m = gc3Var;
        this.n = krwVar;
        this.o = webMessengerNavigationInterceptor;
        this.p = ti3Var;
        pp3 pp3Var = new pp3();
        this.q = pp3Var;
        this.r = new p370(13, ew2Var);
        this.s = new h0w(new qha(12));
        this.y = new pp3();
        this.z = new pp3();
        int i = 1;
        this.A = new a441(i, drwVar, new zdb(this, i));
        this.I = a.a(new zdb(this, 2));
        this.J = a.a(new zdb(this, 3));
        this.K = deb.c;
        this.L = "files.messenger.yandex.ru";
        this.N = new lp3();
        this.O = new rax(drwVar.a, messengerParams.c, ew2Var, jm3Var, new c29(20, this));
        zdb zdbVar = new zdb(this, 4);
        qh41 qh41Var2 = aw41Var.a;
        this.Q = new bw41((sw50) qh41Var2.D.getValue(), qh41Var2.r, zdbVar);
        try {
            sr41Var = new sr41();
            MessengerWebView messengerWebView = new MessengerWebView(context);
            messengerWebView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
            messengerWebView.setFocusable(true);
            sr41Var.a = messengerWebView;
            asView = sr41Var.asView();
        } catch (Throwable th) {
            j(new feb(th));
        }
        if (asView == null) {
            throw new IllegalStateException("WebView not created");
        }
        g(sr41Var);
        this.w = new fr31(asView);
        pp3Var.setValue(this, R[0], sr41Var);
        rv41 f = f();
        this.P = f != null ? new hlx0(f, this.O, this.o) : null;
    }

    public final void a(String str) {
        String str2;
        do41 do41Var = this.x;
        if (do41Var == null || (str2 = do41Var.a) == null || !(str2.equals("*") || str2.equals(str))) {
            do41 do41Var2 = new do41(str);
            l(this.j.a(do41Var2));
            this.x = do41Var2;
        }
    }

    public final void b(Fragment fragment, fc3 fc3Var, ChatWebViewController$IntentPage chatWebViewController$IntentPage) {
        rv41 f = f();
        int i = 1;
        if (f != null) {
            f.f1(new com.yandex.messenger.websdk.internal.webview.a(i), "Web view was not detached");
        }
        qh41 qh41Var = this.m.a;
        this.v = new hc3(fragment, fc3Var, qh41Var.l, qh41Var.r, (OkHttpClient) qh41Var.j.getValue());
        fc3Var.a(this, this.K);
        p370 p370Var = this.r;
        p370Var.getClass();
        jl40.m();
        h790 h790Var = (h790) p370Var.w;
        if (h790Var != null) {
            h790Var.g = Long.valueOf(SystemClock.elapsedRealtime());
        }
        rv41 f2 = f();
        if (f2 == null || !f2.x1()) {
            return;
        }
        f2.i1(fragment);
        fr31 fr31Var = this.w;
        if (fr31Var != null) {
            fr31Var.f = true;
            fr31Var.a();
        }
        if (fr31Var != null) {
            fr31Var.d = fragment.isResumed();
            fr31Var.a();
        }
        if (this.M) {
            return;
        }
        this.M = true;
        i("attach", chatWebViewController$IntentPage);
    }

    public final void c() {
        hc3 hc3Var = this.v;
        if (jl40.f && hc3Var != null) {
            ny61.f("Should detach before destroying");
            return;
        }
        if (f() == null) {
            return;
        }
        rv41 f = f();
        int i = 0;
        if (f != null) {
            f.f1(new com.yandex.messenger.websdk.internal.webview.a(i), "WebView should be detached before being destroyed");
        }
        kgx[] kgxVarArr = R;
        this.q.setValue(this, kgxVarArr[0], null);
        rax raxVar = this.O;
        raxVar.getClass();
        jl40.m();
        raxVar.g.clear();
        raxVar.i.clear();
        raxVar.h.clear();
        vh60 vh60Var = this.e;
        vh60Var.i.post(new th60(vh60Var));
        jm3 jm3Var = this.d;
        jm3Var.getClass();
        jl40.m();
        jm3Var.f.post(new jg(24, jm3Var));
        l(null);
        this.N.setValue(this, kgxVarArr[4], null);
        this.z.setValue(this, kgxVarArr[3], null);
        this.Q.b();
        this.s.setValue(this, kgxVarArr[1], null);
        this.D = null;
        this.E = null;
        this.F = false;
        this.G = false;
        this.H = false;
    }

    public final void d() {
        rv41 f = f();
        if (f != null) {
            f.U1();
        }
        fr31 fr31Var = this.w;
        if (fr31Var != null) {
            fr31Var.f = false;
            fr31Var.a();
        }
        hc3 hc3Var = this.v;
        if (hc3Var != null) {
            fc3 fc3Var = hc3Var.b;
        }
        this.v = null;
    }

    public final nax e() {
        return (nax) this.I.getValue();
    }

    public final rv41 f() {
        kgx kgxVar = R[0];
        return (rv41) ((AtomicReference) this.q.c).get();
    }

    public final void g(rv41 rv41Var) {
        String str;
        if (rv41Var instanceof ok51) {
            ok51.a();
            throw null;
        }
        if (!(rv41Var instanceof sr41)) {
            vg10.d("Unsupported WebView type: ".concat(rv41Var.getClass().getName()));
            return;
        }
        MessengerWebView messengerWebView = ((sr41) rv41Var).a;
        if (messengerWebView == null) {
            return;
        }
        messengerWebView.removeJavascriptInterface("androidListener");
        messengerWebView.addJavascriptInterface(this.O, "androidListener");
        this.C = new c9v(messengerWebView, this.d, this.h);
        messengerWebView.getSettings().setDatabaseEnabled(true);
        messengerWebView.getSettings().setDomStorageEnabled(true);
        messengerWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        messengerWebView.getSettings().setJavaScriptEnabled(true);
        WebSettings settings = messengerWebView.getSettings();
        Context context = messengerWebView.getContext();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        if (packageInfo == null || (str = packageInfo.versionName) == null) {
            str = "unknown";
        }
        settings.setUserAgentString(WebSettings.getDefaultUserAgent(context) + " " + g8e.p(context.getPackageName(), "/", str) + " AndroidMssngrWebSdk/252.0");
        messengerWebView.setWebViewClient(new ChatWebViewClient(this));
        messengerWebView.setWebChromeClient(new ChatWebChromeClient(this));
    }

    public final void h() {
        wcb1 wcb1Var;
        hlx0 hlx0Var;
        String str;
        String str2;
        this.O.a(this.p);
        if (!this.u || (wcb1Var = this.t) == null || (hlx0Var = this.P) == null) {
            return;
        }
        boolean z = wcb1Var instanceof v5s0;
        ew2 ew2Var = this.g;
        if (z) {
            v5s0 v5s0Var = (v5s0) wcb1Var;
            ChatRequest chatRequest = v5s0Var.a;
            nax e = e();
            String str3 = v5s0Var.b;
            String str4 = v5s0Var.c;
            hdu hduVar = e.a;
            JSONObject a = chatRequest.a();
            if (str4 != null) {
                a.put("pasteText", str4);
                a.put("pasteForce", true);
            }
            if (str3 != null) {
                a.put("context", new JSONObject(str3));
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.KEY_DATA, a);
            jSONObject.put("type", "iframeOpen");
            String b = nax.b(hdu.n(hduVar, MessageType.Request, jSONObject, null));
            c9v c9vVar = this.C;
            if (c9vVar == null) {
                c9vVar = null;
            }
            c9v.h(c9vVar, b);
            ew2Var.b("wm_web_chat_open");
            p370 p370Var = this.r;
            p370Var.getClass();
            jl40.m();
            p370Var.c = new g790(0);
            v5s0Var.c = null;
            f8b f8bVar = chatRequest instanceof f8b ? (f8b) chatRequest : null;
            if (f8bVar != null && (str2 = f8bVar.a) != null) {
                a(str2);
            }
        } else {
            if (!(wcb1Var instanceof w5s0)) {
                w511.b();
                return;
            }
            hdu hduVar2 = e().a;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("chatList", true);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(Constants.KEY_DATA, jSONObject2);
            jSONObject3.put("type", "iframeOpen");
            String b2 = nax.b(hdu.n(hduVar2, MessageType.Request, jSONObject3, null));
            c9v c9vVar2 = this.C;
            if (c9vVar2 == null) {
                c9vVar2 = null;
            }
            c9v.h(c9vVar2, b2);
            ew2Var.b("wm_web_chatlist_open");
        }
        zdb zdbVar = new zdb(this, 5);
        ((rax) hlx0Var.c).a((t4b) hlx0Var.y);
        hlx0Var.w = null;
        String str5 = (String) hlx0Var.x;
        if (str5 == null) {
            return;
        }
        if (wcb1Var instanceof w5s0) {
            str = "/";
        } else {
            if (!z) {
                w511.b();
                return;
            }
            ChatRequest chatRequest2 = ((v5s0) wcb1Var).a;
            if (chatRequest2 instanceof j8b) {
                str = g8e.o("/user/", ((j8b) chatRequest2).a);
            } else if (chatRequest2 instanceof f8b) {
                str = g8e.o("/chats/", ((f8b) chatRequest2).a);
            } else {
                if (!(chatRequest2 instanceof i8b)) {
                    w511.b();
                    return;
                }
                str = null;
            }
        }
        if (str == null) {
            return;
        }
        ((rv41) hlx0Var.b).clearHistory();
        if (str5.equals(str)) {
            return;
        }
        hlx0Var.w = zdbVar;
        j(deb.b);
    }

    public final void i(String str, ChatWebViewController$IntentPage chatWebViewController$IntentPage) {
        rv41 f = f();
        if (f != null) {
            a441 a441Var = this.A;
            MessengerParams messengerParams = (MessengerParams) ((zdb) a441Var.c).invoke();
            MessengerEnvironment messengerEnvironment = messengerParams.e;
            w040 w040Var = new w040(a441Var, messengerParams);
            w040Var.l(new fi41("debug", true), null);
            w040Var.l(new fi41("workspaceId", true), messengerParams.c);
            w040Var.l(new fi41("lang", true), null);
            int i = 0;
            w040Var.l(new fi41("parentOrigin", false), "https://" + messengerEnvironment.b());
            w040Var.l(new fi41("build", false), "chamb");
            w040Var.l(new fi41(ru.cprocsp.NGate.tools.Constants.INTENT_PARAM_AUTH_TYPE, false), "own");
            w040Var.l(new fi41("protocolVersion", false), "2");
            w040Var.l(new fi41("widgetId", false), ((drw) a441Var.b).a);
            w040Var.l(new fi41(ConfigConstants.CONFIG, false), messengerEnvironment.a);
            w040Var.l(new fi41("serviceId", false), String.valueOf(messengerParams.b));
            a441.x(messengerParams, w040Var);
            LinkedHashMap d = w040Var.d();
            ArrayList arrayList = new ArrayList(d.size());
            for (Map.Entry entry : d.entrySet()) {
                arrayList.add(((String) entry.getKey()) + "=" + ((String) entry.getValue()));
            }
            w040Var.l(new fi41("flags", false), kotlin.collections.a.X(arrayList, ";", null, null, null, 62));
            LinkedHashMap linkedHashMap = (LinkedHashMap) w040Var.d;
            Set keySet = linkedHashMap.keySet();
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) w040Var.b;
            keySet.removeAll(linkedHashMap2.keySet());
            LinkedHashMap linkedHashMap3 = (LinkedHashMap) w040Var.c;
            LinkedHashSet<String> U = kotlin.collections.a.U(linkedHashMap3.keySet(), linkedHashMap2.keySet());
            for (String str2 : U) {
                jl40.x("Cannot override param " + str2 + "='" + linkedHashMap3.get(str2) + "' with value '" + linkedHashMap2.get(str2) + "'");
            }
            linkedHashMap2.keySet().removeAll(U);
            Uri.Builder scheme = new Uri.Builder().scheme(com.adjust.sdk.Constants.SCHEME);
            a441 a441Var2 = (a441) w040Var.h;
            MessengerParams messengerParams2 = (MessengerParams) w040Var.a;
            a441Var2.getClass();
            messengerParams2.getClass();
            Uri.Builder appendPath = scheme.authority(messengerParams2.e.b()).appendPath("chat");
            LinkedHashMap n = b.n(b.n(linkedHashMap, linkedHashMap2), linkedHashMap3);
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            for (Map.Entry entry2 : n.entrySet()) {
                if (entry2.getValue() != null) {
                    linkedHashMap4.put(entry2.getKey(), entry2.getValue());
                }
            }
            for (Map.Entry entry3 : linkedHashMap4.entrySet()) {
                appendPath.appendQueryParameter((String) entry3.getKey(), (String) entry3.getValue());
            }
            if (f.loadUrl(appendPath.build().toString(), gw00.e(new Pair("origin", g8e.o("mssngrandroid://", this.b.getPackageName()))))) {
                if (chatWebViewController$IntentPage != null && chatWebViewController$IntentPage != ChatWebViewController$IntentPage.UNDEFINED) {
                    this.D = chatWebViewController$IntentPage;
                }
                ChatWebViewController$IntentPage chatWebViewController$IntentPage2 = this.D;
                if (chatWebViewController$IntentPage2 == null) {
                    chatWebViewController$IntentPage2 = ChatWebViewController$IntentPage.UNDEFINED;
                }
                this.g.c("wm_load_messenger_page", b.i(new Pair("intent_page", chatWebViewController$IntentPage2.name()), new Pair("case_of_loading", str)));
                this.B = false;
                rax raxVar = this.O;
                if (raxVar != null) {
                    jl40.m();
                    raxVar.g.clear();
                    raxVar.i.clear();
                    raxVar.h.clear();
                }
                l(null);
                this.N.setValue(this, R[4], null);
                p370 p370Var = this.r;
                p370Var.getClass();
                jl40.m();
                p370Var.w = new h790(0);
                j(deb.b);
                if (raxVar != null) {
                    raxVar.a(new t4b(new ydb(this, i)));
                }
                if (raxVar != null) {
                    raxVar.a(new t4b(new ydb(this, 1), (byte) 0));
                }
                if (raxVar != null) {
                    raxVar.a(new t4b(new zdb(this, i)));
                }
            }
        }
    }

    public final void j(tkb1 tkb1Var) {
        fc3 fc3Var;
        if (jl40.l(this.K, tkb1Var)) {
            return;
        }
        this.K = tkb1Var;
        hc3 hc3Var = this.v;
        if (hc3Var == null || (fc3Var = hc3Var.b) == null) {
            return;
        }
        fc3Var.a(this, tkb1Var);
    }

    public final void k() {
        if (this.H) {
            ChatWebViewController$IntentPage chatWebViewController$IntentPage = this.E;
            ChatWebViewController$IntentPage chatWebViewController$IntentPage2 = ChatWebViewController$IntentPage.CHAT_LIST;
            ew2 ew2Var = this.g;
            if (chatWebViewController$IntentPage == chatWebViewController$IntentPage2 && this.G) {
                ew2Var.b("wm_chat_list_loaded_and_interactive");
                if (this.F) {
                    this.F = false;
                    return;
                }
                return;
            }
            if (chatWebViewController$IntentPage == ChatWebViewController$IntentPage.CHAT && this.F) {
                ew2Var.b("wm_chat_loaded_and_interactive");
            }
        }
    }

    public final void l(zn41 zn41Var) {
        this.y.setValue(this, R[2], zn41Var);
    }
}
