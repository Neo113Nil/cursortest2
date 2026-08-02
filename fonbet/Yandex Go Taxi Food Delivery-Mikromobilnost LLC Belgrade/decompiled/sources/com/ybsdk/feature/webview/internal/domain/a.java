package com.ybsdk.feature.webview.internal.domain;

import android.net.Uri;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.WebviewEvents$TechWebviewUnauthErrorHandleResultResult;
import com.ybsdk.di.modules.features.x;
import com.ybsdk.feature.webview.api.WebViewHeader;
import com.ybsdk.feature.webview.api.WebViewScreenParams;
import com.ybsdk.rconfig.configs.WebCookieAuthorizationScheme;
import com.ybsdk.rconfig.configs.YbWebCookieDomainsPrepareConfig;
import com.ybsdk.rconfig.configs.YbWebViewAuthHeaderDeletionConfigSchema;
import defpackage.ev41;
import defpackage.evu0;
import defpackage.if8;
import defpackage.iz51;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.nz51;
import defpackage.oq41;
import defpackage.s421;
import defpackage.sd90;
import defpackage.um41;
import defpackage.w511;
import defpackage.wa41;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final AppAnalyticsReporter a;
    public final oq41 b;
    public final x c;
    public final um41 d;
    public final b e;
    public volatile String f;

    public a(AppAnalyticsReporter appAnalyticsReporter, oq41 oq41Var, x xVar, um41 um41Var, b bVar) {
        this.a = appAnalyticsReporter;
        this.b = oq41Var;
        this.c = xVar;
        this.d = um41Var;
        this.e = bVar;
    }

    public static boolean g(String str) {
        return evu0.y(str, "setSession", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
    
        if (r11 == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, WebViewScreenParams.Auth auth, boolean z, ContinuationImpl continuationImpl) {
        WebAuthorizationInteractor$authorize$1 webAuthorizationInteractor$authorize$1;
        int i;
        Uri parse;
        Object d;
        Throwable a;
        if (continuationImpl instanceof WebAuthorizationInteractor$authorize$1) {
            webAuthorizationInteractor$authorize$1 = (WebAuthorizationInteractor$authorize$1) continuationImpl;
            int i2 = webAuthorizationInteractor$authorize$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webAuthorizationInteractor$authorize$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webAuthorizationInteractor$authorize$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webAuthorizationInteractor$authorize$1.label;
                AppAnalyticsReporter appAnalyticsReporter = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    parse = Uri.parse(str);
                    if (e(parse)) {
                        parse = sd90.k(parse, "authLevel", auth.getAuthLevel());
                    }
                    um41 um41Var = this.d;
                    if (!z && ((YbWebCookieDomainsPrepareConfig) ((if8) um41Var).a.d(iz51.a).getData()).isEnabled()) {
                        return h(auth, parse);
                    }
                    if (((YbWebCookieDomainsPrepareConfig) ((if8) um41Var).a.d(iz51.a).getData()).isPassportApiUnauthHandleEnabled()) {
                        appAnalyticsReporter.v0.a.a("tech.webview.unauth_error_handle.initiated", null);
                        String host = parse.getHost();
                        webAuthorizationInteractor$authorize$1.L$0 = auth;
                        webAuthorizationInteractor$authorize$1.L$1 = parse;
                        webAuthorizationInteractor$authorize$1.label = 1;
                        d = this.c.d(host, webAuthorizationInteractor$authorize$1);
                    } else {
                        webAuthorizationInteractor$authorize$1.label = 3;
                        Object i3 = i(parse, auth, webAuthorizationInteractor$authorize$1);
                        if (i3 != obj2) {
                            return i3;
                        }
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    if (i == 3) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                parse = (Uri) webAuthorizationInteractor$authorize$1.L$1;
                auth = (WebViewScreenParams.Auth) webAuthorizationInteractor$authorize$1.L$0;
                kotlin.b.b(obj);
                d = ((Result) obj).getValue();
                a = Result.a(d);
                if (a != null) {
                    appAnalyticsReporter.v0.e(WebviewEvents$TechWebviewUnauthErrorHandleResultResult.OK, null);
                    return h(auth, parse);
                }
                appAnalyticsReporter.v0.e(WebviewEvents$TechWebviewUnauthErrorHandleResultResult.ERROR, a.getMessage());
                webAuthorizationInteractor$authorize$1.L$0 = null;
                webAuthorizationInteractor$authorize$1.L$1 = null;
                webAuthorizationInteractor$authorize$1.label = 2;
                Object i4 = i(parse, auth, webAuthorizationInteractor$authorize$1);
                return i4 == obj2 ? obj2 : i4;
            }
        }
        webAuthorizationInteractor$authorize$1 = new WebAuthorizationInteractor$authorize$1(this, continuationImpl);
        Object obj3 = webAuthorizationInteractor$authorize$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webAuthorizationInteractor$authorize$1.label;
        AppAnalyticsReporter appAnalyticsReporter2 = this.a;
        if (i != 0) {
        }
        a = Result.a(d);
        if (a != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Uri uri, ContinuationImpl continuationImpl) {
        WebAuthorizationInteractor$createPassportRedirect$1 webAuthorizationInteractor$createPassportRedirect$1;
        int i;
        Object a;
        if (continuationImpl instanceof WebAuthorizationInteractor$createPassportRedirect$1) {
            webAuthorizationInteractor$createPassportRedirect$1 = (WebAuthorizationInteractor$createPassportRedirect$1) continuationImpl;
            int i2 = webAuthorizationInteractor$createPassportRedirect$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webAuthorizationInteractor$createPassportRedirect$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webAuthorizationInteractor$createPassportRedirect$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webAuthorizationInteractor$createPassportRedirect$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String uri2 = uri.toString();
                    x xVar = this.c;
                    webAuthorizationInteractor$createPassportRedirect$1.label = 1;
                    a = xVar.a(uri2, webAuthorizationInteractor$createPassportRedirect$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    return a;
                }
                try {
                    String str = (String) a;
                    this.f = str;
                    return new ev41(str);
                } catch (Throwable th) {
                    return new Result.Failure(th);
                }
            }
        }
        webAuthorizationInteractor$createPassportRedirect$1 = new WebAuthorizationInteractor$createPassportRedirect$1(this, continuationImpl);
        Object obj2 = webAuthorizationInteractor$createPassportRedirect$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webAuthorizationInteractor$createPassportRedirect$1.label;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
    }

    public final ev41 c(String str, boolean z) {
        com.ybsdk.rconfig.b bVar = ((if8) this.d).a;
        String cookieYbAuthProxyUrl = ((WebCookieAuthorizationScheme) bVar.d(bVar.i.o).getData()).getCookieYbAuthProxyUrl();
        MapBuilder mapBuilder = new MapBuilder();
        if (!z) {
            j(mapBuilder, WebViewHeader.HEADER_AUTHORIZATION);
        }
        j(mapBuilder, WebViewHeader.X_YABANK_SESSION_UUID);
        mapBuilder.put("x-retpath".toLowerCase(Locale.ROOT), str);
        j(mapBuilder, WebViewHeader.HEADER_ACCEPT_LANGUAGE);
        return new ev41(cookieYbAuthProxyUrl, mapBuilder.j());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Uri uri, ContinuationImpl continuationImpl) {
        WebAuthorizationInteractor$createYbAuthUrlDataWithPassportRedirectResult$1 webAuthorizationInteractor$createYbAuthUrlDataWithPassportRedirectResult$1;
        int i;
        Object b;
        if (continuationImpl instanceof WebAuthorizationInteractor$createYbAuthUrlDataWithPassportRedirectResult$1) {
            webAuthorizationInteractor$createYbAuthUrlDataWithPassportRedirectResult$1 = (WebAuthorizationInteractor$createYbAuthUrlDataWithPassportRedirectResult$1) continuationImpl;
            int i2 = webAuthorizationInteractor$createYbAuthUrlDataWithPassportRedirectResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webAuthorizationInteractor$createYbAuthUrlDataWithPassportRedirectResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webAuthorizationInteractor$createYbAuthUrlDataWithPassportRedirectResult$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webAuthorizationInteractor$createYbAuthUrlDataWithPassportRedirectResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    webAuthorizationInteractor$createYbAuthUrlDataWithPassportRedirectResult$1.L$0 = uri;
                    webAuthorizationInteractor$createYbAuthUrlDataWithPassportRedirectResult$1.label = 1;
                    b = b(uri, webAuthorizationInteractor$createYbAuthUrlDataWithPassportRedirectResult$1);
                    if (b == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uri = (Uri) webAuthorizationInteractor$createYbAuthUrlDataWithPassportRedirectResult$1.L$0;
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                }
                if (!(b instanceof Result.Failure)) {
                    return b;
                }
                try {
                    this.e.g();
                    return c(((ev41) b).a, e(uri));
                } catch (Throwable th) {
                    return new Result.Failure(th);
                }
            }
        }
        webAuthorizationInteractor$createYbAuthUrlDataWithPassportRedirectResult$1 = new WebAuthorizationInteractor$createYbAuthUrlDataWithPassportRedirectResult$1(this, continuationImpl);
        Object obj3 = webAuthorizationInteractor$createYbAuthUrlDataWithPassportRedirectResult$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webAuthorizationInteractor$createYbAuthUrlDataWithPassportRedirectResult$1.label;
        if (i != 0) {
        }
        if (!(b instanceof Result.Failure)) {
        }
    }

    public final boolean e(Uri uri) {
        List<String> authQueryEnabledDomains = ((YbWebViewAuthHeaderDeletionConfigSchema) ((if8) this.d).a.d(nz51.a).getData()).getAuthQueryEnabledDomains();
        if (authQueryEnabledDomains == null) {
            authQueryEnabledDomains = EmptyList.a;
        }
        return kotlin.collections.a.G(authQueryEnabledDomains, uri.getHost());
    }

    public final boolean f(String str) {
        Uri parse;
        String host = Uri.parse(str).getHost();
        String str2 = this.f;
        return jl40.l(host, (str2 == null || (parse = Uri.parse(str2)) == null) ? null : parse.getHost());
    }

    public final ev41 h(WebViewScreenParams.Auth auth, Uri uri) {
        int i = wa41.a[auth.ordinal()];
        if (i == 1 || i == 2) {
            this.e.g();
            return c(uri.toString(), e(uri));
        }
        if (i == 3 || i == 4) {
            return new ev41(uri.toString());
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Uri uri, WebViewScreenParams.Auth auth, ContinuationImpl continuationImpl) {
        WebAuthorizationInteractor$resolveYbAuthWithPassportRedirect$1 webAuthorizationInteractor$resolveYbAuthWithPassportRedirect$1;
        int i;
        if (continuationImpl instanceof WebAuthorizationInteractor$resolveYbAuthWithPassportRedirect$1) {
            webAuthorizationInteractor$resolveYbAuthWithPassportRedirect$1 = (WebAuthorizationInteractor$resolveYbAuthWithPassportRedirect$1) continuationImpl;
            int i2 = webAuthorizationInteractor$resolveYbAuthWithPassportRedirect$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webAuthorizationInteractor$resolveYbAuthWithPassportRedirect$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webAuthorizationInteractor$resolveYbAuthWithPassportRedirect$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webAuthorizationInteractor$resolveYbAuthWithPassportRedirect$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                int i3 = wa41.a[auth.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    webAuthorizationInteractor$resolveYbAuthWithPassportRedirect$1.label = 1;
                    Object d = d(uri, webAuthorizationInteractor$resolveYbAuthWithPassportRedirect$1);
                    if (d != obj2) {
                        return d;
                    }
                } else {
                    if (i3 == 3) {
                        return new ev41(uri.toString());
                    }
                    if (i3 != 4) {
                        w511.b();
                        return null;
                    }
                    webAuthorizationInteractor$resolveYbAuthWithPassportRedirect$1.label = 2;
                    Object b = b(uri, webAuthorizationInteractor$resolveYbAuthWithPassportRedirect$1);
                    if (b != obj2) {
                        return b;
                    }
                }
                return obj2;
            }
        }
        webAuthorizationInteractor$resolveYbAuthWithPassportRedirect$1 = new WebAuthorizationInteractor$resolveYbAuthWithPassportRedirect$1(this, continuationImpl);
        Object obj3 = webAuthorizationInteractor$resolveYbAuthWithPassportRedirect$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webAuthorizationInteractor$resolveYbAuthWithPassportRedirect$1.label;
        if (i == 0) {
        }
    }

    public final void j(MapBuilder mapBuilder, WebViewHeader webViewHeader) {
        String q = ((s421) this.b).q(webViewHeader);
        if (q == null || evu0.J(q)) {
            return;
        }
        mapBuilder.put(webViewHeader.getHeaderName().toLowerCase(Locale.ROOT), q);
    }
}
