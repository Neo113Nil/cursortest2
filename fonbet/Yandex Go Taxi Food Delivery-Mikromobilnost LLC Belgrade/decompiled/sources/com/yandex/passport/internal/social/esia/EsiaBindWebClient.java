package com.yandex.passport.internal.social.esia;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.cvu0;
import defpackage.jl40;
import defpackage.sls;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/yandex/passport/internal/social/esia/EsiaBindWebClient;", "Landroid/webkit/WebViewClient;", "", "isEsiaBindingAppToApp", "", "returnUrl", "Lkotlin/Function1;", "Landroid/net/Uri;", "Lzy11;", "onEsiaRedirect", "onResult", "Lkotlin/Function0;", "onReceiveEsiaLink", "onReceiveBrokerRedirect", "<init>", "(ZLjava/lang/String;Ltls;Ltls;Lsls;Lsls;)V", "Landroid/webkit/WebView;", "view", "url", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "Z", "Ljava/lang/String;", "Ltls;", "Lsls;", "hasReportedEsiaLink", "hasReportedBrokerRedirect", "Companion", "com/yandex/passport/internal/social/esia/j0", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EsiaBindWebClient extends WebViewClient {
    public static final int $stable = 8;

    @Deprecated
    public static final String AAS_PATH = "/aas/oauth2/ac";

    @Deprecated
    public static final String BROKER_REDIRECT_PATH = "/broker/redirect";
    private static final j0 Companion = new j0();

    @Deprecated
    public static final String DEEPLINK_PATH = "/aas/delegate";

    @Deprecated
    public static final String FINISH_PATH_PREFIX = "/closewebview";

    @Deprecated
    public static final String REDIRECT_PARAM_NAME = "redirect_uri";
    private boolean hasReportedBrokerRedirect;
    private boolean hasReportedEsiaLink;
    private final boolean isEsiaBindingAppToApp;
    private final tls onEsiaRedirect;
    private final sls onReceiveBrokerRedirect;
    private final sls onReceiveEsiaLink;
    private final tls onResult;
    private final String returnUrl;

    public EsiaBindWebClient(boolean z, String str, tls tlsVar, tls tlsVar2, sls slsVar, sls slsVar2) {
        this.isEsiaBindingAppToApp = z;
        this.returnUrl = str;
        this.onEsiaRedirect = tlsVar;
        this.onResult = tlsVar2;
        this.onReceiveEsiaLink = slsVar;
        this.onReceiveBrokerRedirect = slsVar2;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        String path;
        String path2;
        String path3;
        String path4;
        Uri parse = url != null ? Uri.parse(url) : null;
        if (parse != null && (path4 = parse.getPath()) != null && cvu0.x(path4, FINISH_PATH_PREFIX, false)) {
            this.onResult.invoke(parse);
            return true;
        }
        if (!this.hasReportedEsiaLink && ((parse != null && (path3 = parse.getPath()) != null && path3.equals(AAS_PATH)) || (parse != null && (path2 = parse.getPath()) != null && path2.equals(DEEPLINK_PATH)))) {
            this.hasReportedEsiaLink = true;
            this.onReceiveEsiaLink.invoke();
        }
        if (!this.hasReportedBrokerRedirect && parse != null && (path = parse.getPath()) != null && path.equals(BROKER_REDIRECT_PATH)) {
            this.hasReportedBrokerRedirect = true;
            this.onReceiveBrokerRedirect.invoke();
        }
        if (this.isEsiaBindingAppToApp && parse != null) {
            String path5 = parse.getPath();
            if (path5 != null && path5.equals(AAS_PATH)) {
                Uri.Builder clearQuery = parse.buildUpon().path(DEEPLINK_PATH).clearQuery();
                for (String str : parse.getQueryParameterNames()) {
                    if (!jl40.l(str, REDIRECT_PARAM_NAME)) {
                        clearQuery.appendQueryParameter(str, parse.getQueryParameter(str));
                    }
                }
                parse = clearQuery.appendQueryParameter(REDIRECT_PARAM_NAME, this.returnUrl).build();
            }
            String path6 = parse.getPath();
            if (path6 != null && path6.equals(DEEPLINK_PATH)) {
                this.onEsiaRedirect.invoke(parse);
                return true;
            }
        }
        return super.shouldOverrideUrlLoading(view, url);
    }
}
