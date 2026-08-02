package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.yandex.fintechsdk.core.ui.impl.api.view.webview.ScrollableWebView;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.model.AllowNewTabType;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.newtab.NewTabPolicy;
import defpackage.boj0;
import defpackage.bu90;
import defpackage.d0e;
import defpackage.dn90;
import defpackage.ei5;
import defpackage.evu0;
import defpackage.f660;
import defpackage.g660;
import defpackage.hi5;
import defpackage.hn90;
import defpackage.i660;
import defpackage.ii5;
import defpackage.ilk;
import defpackage.ji5;
import defpackage.jl40;
import defpackage.jo41;
import defpackage.klk;
import defpackage.lm41;
import defpackage.mee0;
import defpackage.no41;
import defpackage.ny61;
import defpackage.oo41;
import defpackage.po41;
import defpackage.qk3;
import defpackage.qo41;
import defpackage.ro41;
import defpackage.tl60;
import defpackage.vm41;
import defpackage.w511;
import defpackage.xk3;
import defpackage.yg5;
import defpackage.z22;
import defpackage.zh5;
import java.net.URI;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010\u0012J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b$\u0010\"J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b%\u0010\"J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010,\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000eH\u0002¢\u0006\u0004\b.\u0010\u0012J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b/\u0010\"J\u000f\u00100\u001a\u00020\u000eH\u0014¢\u0006\u0004\b0\u0010\u0012J\u001f\u00101\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/webview/CustomWebView;", "Lcom/yandex/fintechsdk/core/ui/impl/api/view/webview/ScrollableWebView;", "Landroid/content/Context;", "context", "Lzh5;", "bduiVariableController", "Lvm41;", ConfigConstants.CONFIG, "Ljo41;", "params", "<init>", "(Landroid/content/Context;Lzh5;Lvm41;Ljo41;)V", "Lyg5;", "expressionResolver", "Lzy11;", "bindColors", "(Lyg5;)V", "setupJavascriptInterfaces", "()V", "Lklk;", "actionHandler", "", "url", "notifyPageLoadStarted", "(Lklk;Ljava/lang/String;)V", "urlForLogging", "(Ljava/lang/String;)Ljava/lang/String;", "", "authRequired", "Lro41;", "error", "reportWebViewError", "(ZLro41;Ljava/lang/String;)V", "setupPostMessageHandlers", "(Lklk;)V", "configureWebViewSettings", "loadInitialUrl", "setupWebViewClient", "setUrl", "(Ljava/lang/String;)V", "Landroid/webkit/WebView;", "webView", "Lbu90;", "postMessageJavascriptInterface", "initPostMessageScript", "(Landroid/webkit/WebView;Lbu90;)V", "setupWebChromeClient", "runErrorAction", "onDetachedFromWindow", "bind", "(Lklk;Lyg5;)V", "Lzh5;", "Lvm41;", "Ljo41;", "Ld0e;", "configurablePostMessageInterface", "Ld0e;", "Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/webview/newtab/NewTabPolicy;", "newTabPolicy", "Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/webview/newtab/NewTabPolicy;", "Lf660;", "newTabHandler", "Lf660;", "Li660;", "newWindowInterceptorWebViewFactory", "Li660;", "webViewClosedReported", "Z", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CustomWebView extends ScrollableWebView {
    private final zh5 bduiVariableController;
    private final vm41 config;
    private d0e configurablePostMessageInterface;
    private final f660 newTabHandler;
    private final NewTabPolicy newTabPolicy;
    private final i660 newWindowInterceptorWebViewFactory;
    private final jo41 params;
    private boolean webViewClosedReported;

    public CustomWebView(Context context, zh5 zh5Var, vm41 vm41Var, jo41 jo41Var) {
        super(context);
        NewTabPolicy newTabPolicy;
        this.bduiVariableController = zh5Var;
        this.config = vm41Var;
        this.params = jo41Var;
        AllowNewTabType allowNewTabType = jo41Var != null ? jo41Var.b : null;
        int i = allowNewTabType == null ? -1 : g660.a[allowNewTabType.ordinal()];
        if (i != -1) {
            if (i == 1) {
                newTabPolicy = NewTabPolicy.ExternalBrowser;
            } else if (i == 2) {
                newTabPolicy = NewTabPolicy.CustomTabs;
            } else if (i != 3) {
                w511.b();
                throw null;
            }
            this.newTabPolicy = newTabPolicy;
            this.newTabHandler = new f660(context, newTabPolicy);
            this.newWindowInterceptorWebViewFactory = new i660();
        }
        newTabPolicy = NewTabPolicy.Disabled;
        this.newTabPolicy = newTabPolicy;
        this.newTabHandler = new f660(context, newTabPolicy);
        this.newWindowInterceptorWebViewFactory = new i660();
    }

    private final void bindColors(yg5 expressionResolver) {
        jo41 jo41Var = this.params;
        if (jo41Var == null) {
            return;
        }
        lm41 lm41Var = jo41Var.d;
        String str = lm41Var != null ? lm41Var.a : null;
        if (str != null) {
            Integer resolveColor = expressionResolver != null ? expressionResolver.resolveColor(str) : null;
            if (resolveColor != null) {
                setBackgroundColor(resolveColor.intValue());
            } else {
                reportWebViewError(this.params.c, new po41("backgroundColorExpression not resolved: ".concat(str)), urlForLogging(this.params.a));
            }
        }
    }

    private final void configureWebViewSettings() {
        setFocusable(true);
        setFocusableInTouchMode(true);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setCacheMode(2);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setSupportMultipleWindows(true);
        settings.setDomStorageEnabled(true);
        settings.setUserAgentString((String) this.config.g.invoke(settings.getUserAgentString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initPostMessageScript(WebView webView, bu90 postMessageJavascriptInterface) {
        postMessageJavascriptInterface.getClass();
        webView.loadUrl("javascript:(function() {window.parent.addEventListener ('message', function(event) { YandexPayAndroid.receiveMessage(JSON.stringify(event.data));});})()");
    }

    private final void loadInitialUrl(klk actionHandler) {
        String str;
        jo41 jo41Var = this.params;
        if (jo41Var == null || (str = jo41Var.a) == null) {
            return;
        }
        if (jo41Var.c) {
            vm41 vm41Var = this.config;
            dn90 dn90Var = vm41Var.e;
            qo41 qo41Var = qo41.a;
            if (dn90Var == null) {
                reportWebViewError(true, qo41Var, str);
                runErrorAction(actionHandler);
                return;
            }
            xk3 xk3Var = (xk3) vm41Var.b.c.a.getValue();
            if (!(xk3Var instanceof qk3)) {
                reportWebViewError(true, qo41Var, str);
                runErrorAction(actionHandler);
                return;
            }
            Context context = getContext();
            vm41 vm41Var2 = this.config;
            String b = ((hn90) dn90Var).b(context, str, ((qk3) xk3Var).a.b, vm41Var2.f.getKey(), vm41Var2.c == DefaultEnvironment.TESTING);
            if (b == null) {
                reportWebViewError(true, new no41(new Exception("Failed to get URL with auth")), str);
                runErrorAction(actionHandler);
                return;
            }
            str = b;
        }
        setUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyPageLoadStarted(klk actionHandler, String url) {
        ilk ilkVar;
        this.config.getClass();
        jo41 jo41Var = this.params;
        if (jo41Var != null && (ilkVar = jo41Var.i) != null) {
            actionHandler.handleAction(ilkVar);
        }
        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) this.config.a).a(new ei5(urlForLogging(url)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportWebViewError(boolean authRequired, ro41 error, String url) {
        Exception exc;
        com.yandex.fintechsdk.core.analytics.impl.internal.a aVar = (com.yandex.fintechsdk.core.analytics.impl.internal.a) this.config.a;
        aVar.a(new ii5(authRequired, error, urlForLogging(url)));
        if (error instanceof qo41) {
            exc = new Exception("No auth provider");
        } else if (error instanceof no41) {
            exc = ((no41) error).a;
        } else if (error instanceof oo41) {
            exc = ((oo41) error).a;
        } else {
            if (!(error instanceof po41)) {
                w511.b();
                return;
            }
            exc = new Exception("Error: ".concat(((po41) error).a));
        }
        aVar.c("bdui_webview", exc);
    }

    private final void runErrorAction(klk actionHandler) {
        ilk ilkVar;
        jo41 jo41Var = this.params;
        if (jo41Var == null || (ilkVar = jo41Var.g) == null) {
            return;
        }
        actionHandler.handleAction(ilkVar);
    }

    private final void setUrl(String url) {
        this.config.getClass();
        Iterator<E> it = EmptyList.a.iterator();
        if (!it.hasNext()) {
            loadUrl(url);
        } else if (it.next() != null) {
            ny61.u();
        } else {
            CookieManager.getInstance();
            throw null;
        }
    }

    private final void setupJavascriptInterfaces() {
        this.config.getClass();
    }

    private final void setupPostMessageHandlers(klk actionHandler) {
        jo41 jo41Var = this.params;
        List<mee0> list = jo41Var != null ? jo41Var.j : null;
        if (list != null) {
            vm41 vm41Var = this.config;
            d0e d0eVar = new d0e(new boj0(actionHandler, vm41Var.a, this.bduiVariableController, vm41Var.d));
            LinkedHashMap linkedHashMap = (LinkedHashMap) d0eVar.a.y;
            linkedHashMap.clear();
            for (mee0 mee0Var : list) {
                linkedHashMap.put(mee0Var.a, mee0Var);
            }
            addJavascriptInterface(d0eVar, "YandexPayAndroid");
            this.configurablePostMessageInterface = d0eVar;
        }
    }

    private final void setupWebChromeClient() {
        setWebChromeClient(new CustomWebView$setupWebChromeClient$1(this));
    }

    private final void setupWebViewClient(klk actionHandler) {
        setWebViewClient(new CustomWebView$setupWebViewClient$1(new tl60(getContext()), this, actionHandler));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String urlForLogging(String url) {
        jo41 jo41Var = this.params;
        String str = "";
        if (jo41Var != null ? jl40.l(jo41Var.e, Boolean.TRUE) : false) {
            return url == null ? "" : url;
        }
        if (url == null || evu0.J(url)) {
            return "";
        }
        try {
            URI create = URI.create(url);
            String scheme = create.getScheme();
            if (scheme == null) {
                scheme = "";
            }
            String host = create.getHost();
            if (host != null) {
                str = host;
            }
            String rawPath = create.getRawPath();
            if (rawPath.length() == 0) {
                rawPath = "/";
            }
            return scheme + "://" + str + rawPath;
        } catch (Exception unused) {
            return url;
        }
    }

    public final void bind(klk actionHandler, yg5 expressionResolver) {
        this.webViewClosedReported = false;
        z22 z22Var = this.config.a;
        jo41 jo41Var = this.params;
        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new ji5(urlForLogging(jo41Var != null ? jo41Var.a : null)));
        setupJavascriptInterfaces();
        setupPostMessageHandlers(actionHandler);
        configureWebViewSettings();
        setupWebViewClient(actionHandler);
        setupWebChromeClient();
        bindColors(expressionResolver);
        loadInitialUrl(actionHandler);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.webViewClosedReported) {
            return;
        }
        this.webViewClosedReported = true;
        z22 z22Var = this.config.a;
        jo41 jo41Var = this.params;
        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new hi5(urlForLogging(jo41Var != null ? jo41Var.a : null)));
    }
}
