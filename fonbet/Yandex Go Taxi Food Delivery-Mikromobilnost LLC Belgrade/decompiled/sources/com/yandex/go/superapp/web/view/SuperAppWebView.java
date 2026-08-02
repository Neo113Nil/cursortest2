package com.yandex.go.superapp.web.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.OverScroller;
import com.yandex.go.superapp.api.loading_tracker.ServiceLoadingEvent;
import defpackage.bv41;
import defpackage.cvu0;
import defpackage.d6j0;
import defpackage.evu0;
import defpackage.f8o;
import defpackage.fr41;
import defpackage.gl;
import defpackage.gp41;
import defpackage.hen;
import defpackage.hhs0;
import defpackage.hhw0;
import defpackage.hst;
import defpackage.ien;
import defpackage.j5z;
import defpackage.jl40;
import defpackage.jst;
import defpackage.jx6;
import defpackage.nwy0;
import defpackage.q7w0;
import defpackage.qje;
import defpackage.rme;
import defpackage.s7w0;
import defpackage.scc;
import defpackage.tls;
import defpackage.vjp0;
import defpackage.w511;
import defpackage.w6j0;
import defpackage.xd2;
import defpackage.xng0;
import defpackage.yfa;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlin.text.Regex;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.taxi.deeplinks.f;
import ru.yandex.taxi.eatskit.Controller$State;
import ru.yandex.taxi.eatskit.dto.ErrorSource;
import ru.yandex.taxi.eatskit.dto.ErrorType;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.themes.dto.WebViewThemeChangeMode;
import ru.yandex.taxi.web.CommonWebViewClient;
import ru.yandex.taxi.web.TaxiWebView;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B/\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b!\u0010\"J\u001b\u0010&\u001a\u00020\u00132\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#¢\u0006\u0004\b&\u0010'J#\u0010*\u001a\u00020\u00132\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0013\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00132\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J\u0019\u00100\u001a\u00020\u00132\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b0\u0010/J/\u00105\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u00162\u0006\u00103\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u001cH\u0014¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u00132\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u00132\u0006\u0010;\u001a\u00020\u001cH\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u00132\u0006\u0010;\u001a\u00020\u001cH\u0016¢\u0006\u0004\b>\u0010=J\u0017\u0010?\u001a\u00020\u00132\u0006\u0010;\u001a\u00020\u001cH\u0016¢\u0006\u0004\b?\u0010=J\u0017\u0010@\u001a\u00020\u00132\u0006\u0010;\u001a\u00020\u001cH\u0016¢\u0006\u0004\b@\u0010=J\u000f\u0010A\u001a\u00020\u0013H\u0016¢\u0006\u0004\bA\u0010 J'\u0010E\u001a\u00020\u00132\u0006\u0010B\u001a\u00020$2\u000e\u0010D\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010CH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u001cH\u0016¢\u0006\u0004\bG\u0010\"J\u000f\u0010H\u001a\u00020\u0013H\u0016¢\u0006\u0004\bH\u0010 J\u000f\u0010I\u001a\u00020\u0013H\u0016¢\u0006\u0004\bI\u0010 J\u001f\u0010M\u001a\u00020\u00132\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020$H\u0017¢\u0006\u0004\bM\u0010NJ+\u0010R\u001a\u00020\u00132\u0006\u0010O\u001a\u00020$2\u0012\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0PH\u0016¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\u0013H\u0016¢\u0006\u0004\bT\u0010 J\u000f\u0010U\u001a\u00020\u0013H\u0016¢\u0006\u0004\bU\u0010 J#\u0010W\u001a\u00020\u00132\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0PH\u0016¢\u0006\u0004\bW\u0010XR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010YR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010ZR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010[R\u0016\u0010\\\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u001c\u0010^\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R$\u0010)\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0013\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010`R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010aR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR \u0010f\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010k\u001a\u00020h8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR(\u0010q\u001a\u0004\u0018\u00010$2\b\u0010l\u001a\u0004\u0018\u00010$8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bm\u0010n\"\u0004\bo\u0010p¨\u0006r"}, d2 = {"Lcom/yandex/go/superapp/web/view/SuperAppWebView;", "Lru/yandex/taxi/web/TaxiWebView;", "Lq7w0;", "Lnwy0;", "Lvjp0;", "Landroid/content/Context;", "context", "Lhhw0;", "clientProvider", "Lbv41;", "webViewUtils", "Lj5z;", "localeHelper", "Lru/yandex/taxi/themes/dto/WebViewThemeChangeMode;", "themeChangeMode", "<init>", "(Landroid/content/Context;Lhhw0;Lbv41;Lj5z;Lru/yandex/taxi/themes/dto/WebViewThemeChangeMode;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "Lzy11;", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", RemoteBioParameters.Y, "smoothScrollTo", "(I)V", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "computeScroll", "()V", "canScrollUp", "()Z", "", "", "deeplinkSchemes", "setSupportedDeeplinkSchemes", "(Ljava/util/List;)V", "Lkotlin/Function1;", "intentHandleListener", "setIntentHandleListener", "(Ltls;)V", "Ls7w0;", "loadingListener", "setLoadingListener", "(Ls7w0;)V", "prepareForReuse", "scrollX", "scrollY", "clampedX", "clampedY", "onOverScrolled", "(IIZZ)V", "Lhen;", "client", "setClient", "(Lhen;)V", "flag", "setJavaScriptEnabled", "(Z)V", "setDomStorageEnabled", "setDatabaseEnabled", "setMediaPlaybackRequiresUserGesture", "destroy", "script", "Landroid/webkit/ValueCallback;", "resultCallback", "evaluateJavascript", "(Ljava/lang/String;Landroid/webkit/ValueCallback;)V", "canGoBack", "goBack", "clearHistory", "", "obj", "name", "addJavascriptInterface", "(Ljava/lang/Object;Ljava/lang/String;)V", "url", "", "additionalHttpHeaders", "loadUrl", "(Ljava/lang/String;Ljava/util/Map;)V", "openKeyboard", "gainFocus", "headers", "setCommonHeaders", "(Ljava/util/Map;)V", "Lhhw0;", "Lj5z;", "Lru/yandex/taxi/themes/dto/WebViewThemeChangeMode;", "lastScrollY", CA20Status.STATUS_USER_I, "supportedDeeplinkSchemes", "Ljava/util/List;", "Ltls;", "Ls7w0;", "Landroid/widget/OverScroller;", "scroller", "Landroid/widget/OverScroller;", "", "commonHeaders", "Ljava/util/Map;", "Landroid/webkit/WebView;", "getView", "()Landroid/webkit/WebView;", "view", "value", "getUserAgentString", "()Ljava/lang/String;", "setUserAgentString", "(Ljava/lang/String;)V", "userAgentString", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SuperAppWebView extends TaxiWebView implements q7w0, nwy0, vjp0 {
    private final hhw0 clientProvider;
    private final Map<String, String> commonHeaders;
    private tls intentHandleListener;
    private int lastScrollY;
    private s7w0 loadingListener;
    private final j5z localeHelper;
    private final OverScroller scroller;
    private List<String> supportedDeeplinkSchemes;
    private final WebViewThemeChangeMode themeChangeMode;

    public SuperAppWebView(Context context, hhw0 hhw0Var, bv41 bv41Var, j5z j5zVar, WebViewThemeChangeMode webViewThemeChangeMode) {
        super(context, null, 2, null);
        this.clientProvider = hhw0Var;
        this.localeHelper = j5zVar;
        this.themeChangeMode = webViewThemeChangeMode;
        EmptyList emptyList = EmptyList.a;
        this.supportedDeeplinkSchemes = emptyList;
        this.scroller = new OverScroller(getContext());
        this.commonHeaders = new LinkedHashMap();
        bv41Var.getClass();
        getSettings().setJavaScriptEnabled(true);
        bv41Var.a(this, emptyList);
        applyTheme(qje.s(xng0.themeDarkMode, context) ? ThemeType.DARK : ThemeType.LIGHT);
    }

    @Override // android.webkit.WebView, defpackage.ien
    public void addJavascriptInterface(Object obj, String name) {
        super.addJavascriptInterface(obj, name);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        if (this.themeChangeMode == WebViewThemeChangeMode.PREFERS_COLOR_SCHEME) {
            gp41.g(getSettings(), themeType);
        }
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // android.webkit.WebView, defpackage.ien
    public boolean canGoBack() {
        return super.canGoBack();
    }

    @Override // defpackage.q7w0, defpackage.vjp0
    public boolean canScrollUp() {
        return this.lastScrollY > 0;
    }

    @Override // android.webkit.WebView, defpackage.ien
    public void clearHistory() {
        super.clearHistory();
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
        if (!this.scroller.computeScrollOffset()) {
            super.computeScroll();
            return;
        }
        scrollTo(this.scroller.getCurrX(), this.scroller.getCurrY());
        postInvalidateOnAnimation();
        this.lastScrollY = this.scroller.getCurrY();
    }

    @Override // android.webkit.WebView, defpackage.ien
    public void destroy() {
        super.destroy();
    }

    @Override // android.webkit.WebView, defpackage.ien
    public void evaluateJavascript(String script, ValueCallback<String> resultCallback) {
        super.evaluateJavascript(script, resultCallback);
    }

    @Override // defpackage.ien
    public void gainFocus() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (hasFocus() && inputMethodManager.isActive(this)) {
            return;
        }
        clearFocus();
        requestFocus();
    }

    @Override // defpackage.ien
    public String getUserAgentString() {
        return getSettings().getUserAgentString();
    }

    @Override // defpackage.q7w0
    public WebView getView() {
        return this;
    }

    @Override // android.webkit.WebView, defpackage.ien
    public void goBack() {
        super.goBack();
    }

    @Override // android.webkit.WebView, defpackage.ien
    public void loadUrl(String url, Map<String, String> additionalHttpHeaders) {
        HashMap hashMap = new HashMap(this.commonHeaders);
        hashMap.put("Accept-Language", this.localeHelper.d());
        hashMap.putAll(additionalHttpHeaders);
        s7w0 s7w0Var = this.loadingListener;
        if (s7w0Var != null) {
            ((fr41) s7w0Var).a.a(ServiceLoadingEvent.OPEN_URL);
        }
        super.loadUrl(url, hashMap);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (ev.getActionMasked() == 0 && !this.scroller.isFinished()) {
            this.scroller.abortAnimation();
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) {
        super.onOverScrolled(scrollX, scrollY, clampedX, clampedY);
        this.lastScrollY = scrollY;
    }

    @Override // defpackage.ien
    public void openKeyboard() {
        gainFocus();
        post(new xd2(this, 1));
    }

    @Override // defpackage.q7w0
    public void prepareForReuse(s7w0 loadingListener) {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        setLoadingListener(loadingListener);
    }

    @Override // defpackage.ien
    public void setClient(final hen client) {
        hhw0 hhw0Var = this.clientProvider;
        final List<String> list = this.supportedDeeplinkSchemes;
        tls tlsVar = this.intentHandleListener;
        final jx6 jx6Var = tlsVar != null ? new jx6(2, tlsVar) : null;
        final s7w0 s7w0Var = this.loadingListener;
        hhs0 hhs0Var = (hhs0) hhw0Var;
        hhs0Var.getClass();
        final f fVar = (f) hhs0Var.b;
        final EmptyList emptyList = EmptyList.a;
        CommonWebViewClient commonWebViewClient = new CommonWebViewClient(fVar, emptyList) { // from class: com.yandex.go.superapp.web.view.SuperappWebViewClientProvider$Companion$create$1$provideWebViewClient$1
            @Override // ru.yandex.taxi.web.CommonWebViewClient
            public String errorPrefix() {
                return "SuperappWebViewClient";
            }

            @Override // ru.yandex.taxi.fragment.common.BaseWebViewClient
            public Activity getActivity() {
                return null;
            }

            @Override // ru.yandex.taxi.web.CommonWebViewClient
            public Map<String, String> headers() {
                return b.f();
            }

            @Override // ru.yandex.taxi.web.CommonWebViewClient
            public void onError(int errorCode, String description, String failingUrl) {
                super.onError(errorCode, description, failingUrl);
                rme rmeVar = (rme) ((yfa) client).a;
                rmeVar.j.b = failingUrl;
                String path = failingUrl != null ? Uri.parse(failingUrl).getPath() : null;
                if (description == null) {
                    description = "";
                }
                rmeVar.p(new f8o(new d6j0(path, description, Integer.valueOf(errorCode), ErrorType.API_ERROR, 4)), ErrorSource.WEB_VIEW_CLIENT);
            }

            @Override // ru.yandex.taxi.web.CommonWebViewClient, android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                hen henVar = client;
                ien ienVar = this;
                rme rmeVar = (rme) ((yfa) henVar).a;
                gl glVar = rmeVar.j;
                boolean z = false;
                if (url == null) {
                    glVar.getClass();
                } else {
                    Regex regex = (Regex) glVar.w;
                    if (regex != null && regex.h(url)) {
                        z = true;
                    }
                }
                if (z && !jl40.l(url, (String) glVar.b)) {
                    ienVar.gainFocus();
                    ienVar.clearHistory();
                    rme rmeVar2 = (rme) glVar.x;
                    rmeVar2.u(Controller$State.ACTIVE);
                    if (!glVar.a) {
                        rmeVar2.l();
                        glVar.a = true;
                        glVar.c = rmeVar2.f;
                    }
                }
                rmeVar.o();
            }

            @Override // ru.yandex.taxi.web.CommonWebViewClient, android.webkit.WebViewClient
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                Regex regex;
                super.onPageStarted(view, url, favicon);
                hen henVar = client;
                ien ienVar = this;
                gl glVar = ((rme) ((yfa) henVar).a).j;
                glVar.b = null;
                if ((url == null || (regex = (Regex) glVar.w) == null || !regex.h(url)) && glVar.a) {
                    ienVar.clearHistory();
                    glVar.a = false;
                }
            }

            @Override // ru.yandex.taxi.web.CommonWebViewClient
            public void openUrlByIntent(String url) {
                Consumer<String> consumer = jx6Var;
                if (consumer != null) {
                    consumer.accept(url);
                }
            }

            @Override // ru.yandex.taxi.fragment.common.BaseWebViewClient, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
                Uri url;
                List<String> g;
                List W;
                yfa yfaVar = (yfa) client;
                rme rmeVar = (rme) yfaVar.a;
                WebResourceResponse webResourceResponse = null;
                if (rmeVar.g().j && (url = request.getUrl()) != null) {
                    if (rmeVar.g().l.length() == 0) {
                        W = evu0.W(rmeVar.g().l, new String[]{";"}, (r2 & 4) != 0 ? 0 : 2);
                        g = kotlin.collections.a.J0(W);
                    } else {
                        g = scc.g(".js", ".png", ".ico", ".css");
                    }
                    ArrayList arrayList = new ArrayList();
                    for (String str : g) {
                        String path = url.getPath();
                        Boolean valueOf = path != null ? Boolean.valueOf(cvu0.s(path.toLowerCase(Locale.ROOT), str, false)) : null;
                        if (valueOf != null) {
                            arrayList.add(valueOf);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    if (!it.hasNext()) {
                        w511.x("Empty collection can't be reduced.");
                        return null;
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = Boolean.valueOf(((Boolean) next).booleanValue() || ((Boolean) it.next()).booleanValue());
                    }
                    if (!((Boolean) next).booleanValue() && yfaVar.p(url.toString())) {
                        webResourceResponse = new WebResourceResponse("text/html", "utf-8", 201, "No content", b.f(), new ByteArrayInputStream("".getBytes(Charset.defaultCharset())));
                    }
                }
                return webResourceResponse == null ? super.shouldInterceptRequest(view, request) : webResourceResponse;
            }

            @Override // ru.yandex.taxi.web.CommonWebViewClient, ru.yandex.taxi.fragment.common.BaseWebViewClient
            public boolean shouldOverrideUrlLoading(String url) {
                boolean z;
                s7w0 s7w0Var2 = s7w0Var;
                if (s7w0Var2 != null) {
                    ((fr41) s7w0Var2).a.a(ServiceLoadingEvent.REDIRECT);
                }
                yfa yfaVar = (yfa) client;
                gl glVar = ((rme) yfaVar.a).j;
                if (url == null) {
                    glVar.getClass();
                } else {
                    Regex regex = (Regex) glVar.w;
                    if (regex != null && regex.h(url)) {
                        z = true;
                        if (!z && glVar.a) {
                            ((rme) glVar.x).u((Controller$State) glVar.c);
                        }
                        return (url == null && yfaVar.p(url)) || super.shouldOverrideUrlLoading(url);
                    }
                }
                z = false;
                if (!z) {
                    ((rme) glVar.x).u((Controller$State) glVar.c);
                }
                if (url == null) {
                }
            }

            @Override // ru.yandex.taxi.web.CommonWebViewClient
            public void showSslError(SslErrorHandler handler, SslError error) {
                hst hstVar = jst.e;
                String.format("SslError: %s", Arrays.copyOf(new Object[]{error}, 1));
                hstVar.getClass();
                handler.cancel();
            }

            @Override // ru.yandex.taxi.fragment.common.BaseWebViewClient
            public List<String> supportedDeeplinkSchemes() {
                return list;
            }
        };
        Iterator it = ((List) hhs0Var.c).iterator();
        while (it.hasNext()) {
            commonWebViewClient.addWebRequestHandler((w6j0) it.next());
        }
        setWebViewClient(commonWebViewClient);
    }

    @Override // defpackage.q7w0
    public void setCommonHeaders(Map<String, String> headers) {
        this.commonHeaders.clear();
        this.commonHeaders.putAll(headers);
    }

    @Override // defpackage.ien
    public void setDatabaseEnabled(boolean flag) {
        getSettings().setDatabaseEnabled(flag);
    }

    @Override // defpackage.ien
    public void setDomStorageEnabled(boolean flag) {
        getSettings().setDomStorageEnabled(flag);
    }

    public final void setIntentHandleListener(tls intentHandleListener) {
        this.intentHandleListener = intentHandleListener;
    }

    @Override // defpackage.ien
    public void setJavaScriptEnabled(boolean flag) {
        getSettings().setJavaScriptEnabled(flag);
    }

    public final void setLoadingListener(s7w0 loadingListener) {
        this.loadingListener = loadingListener;
    }

    @Override // defpackage.ien
    public void setMediaPlaybackRequiresUserGesture(boolean flag) {
        getSettings().setMediaPlaybackRequiresUserGesture(flag);
    }

    public final void setSupportedDeeplinkSchemes(List<String> deeplinkSchemes) {
        this.supportedDeeplinkSchemes = deeplinkSchemes;
    }

    @Override // defpackage.ien
    public void setUserAgentString(String str) {
        getSettings().setUserAgentString(str);
    }

    public void smoothScrollTo(int y) {
        if (canScrollVertically(y - getScrollY())) {
            this.scroller.startScroll(0, getScrollY(), 0, y - getScrollY());
            postInvalidateOnAnimation();
        }
    }
}
