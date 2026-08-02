package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import com.yandex.go.captcha.i;
import com.yandex.go.payments.mbank.navigation.b;
import defpackage.bvu0;
import defpackage.cne0;
import defpackage.hl2;
import defpackage.jxi;
import defpackage.tje;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.deeplinks.f;
import ru.yandex.taxi.web.view.clients.TaxiWebViewClient;

/* loaded from: classes12.dex */
public final /* synthetic */ class ff0 implements em41 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ff0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.em41
    public final TaxiWebViewClient a(final boolean z, final boolean z2, final f fVar, final List list) {
        switch (this.a) {
            case 0:
                final b bVar = (b) this.b;
                return new TaxiWebViewClient(z, z2, fVar, list) { // from class: com.yandex.go.payments.mbank.navigation.AddMBankAccountBaseRouter$onLaunch$1$1$1
                    @Override // ru.yandex.taxi.web.view.clients.TaxiWebViewClient, ru.yandex.taxi.web.CommonWebViewClient, android.webkit.WebViewClient
                    public void onPageFinished(WebView view, String url) {
                        super.onPageFinished(view, url);
                        bVar.getClass();
                        view.evaluateJavascript("window.addEventListener('message', function(e) {\n  const result = JSON.stringify(e.data);\n  window.mBankAccount.postMessage(result);\n});", null);
                    }
                };
            case 1:
                final ru.yandex.taxi.masstransit.geopayment.linkcard.b bVar2 = (ru.yandex.taxi.masstransit.geopayment.linkcard.b) this.b;
                return new TaxiWebViewClient(z, z2, fVar, list) { // from class: ru.yandex.taxi.masstransit.geopayment.linkcard.MtLinkCardWebViewRouter$onLaunch$1$1$1
                    private String lastDeliveredCardLinkUrl;

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private final boolean consumeIfCardLink(String url) {
                        Uri parse;
                        String authority;
                        String queryParameter;
                        bVar2.getClass();
                        if (url != null) {
                            try {
                                parse = Uri.parse(url);
                                authority = parse.getAuthority();
                            } catch (Exception unused) {
                            }
                            if (authority != null && authority.equalsIgnoreCase("masstransit-checkout")) {
                                queryParameter = parse.getQueryParameter("card_link_status");
                                if (queryParameter != null || url == null) {
                                    return false;
                                }
                                if (!url.equals(this.lastDeliveredCardLinkUrl)) {
                                    return true;
                                }
                                this.lastDeliveredCardLinkUrl = url;
                                bVar2.F.invoke(queryParameter);
                                return true;
                            }
                        }
                        queryParameter = null;
                        if (queryParameter != null) {
                            return false;
                        }
                        if (!url.equals(this.lastDeliveredCardLinkUrl)) {
                        }
                    }

                    private final boolean stopIfCardLink(WebView view, String url) {
                        if (!consumeIfCardLink(url)) {
                            return false;
                        }
                        view.stopLoading();
                        return true;
                    }

                    @Override // android.webkit.WebViewClient
                    public void doUpdateVisitedHistory(WebView view, String url, boolean isReload) {
                        stopIfCardLink(view, url);
                        super.doUpdateVisitedHistory(view, url, isReload);
                    }

                    @Override // ru.yandex.taxi.web.view.clients.TaxiWebViewClient, ru.yandex.taxi.web.CommonWebViewClient, android.webkit.WebViewClient
                    public void onPageStarted(WebView view, String url, Bitmap favicon) {
                        if (stopIfCardLink(view, url)) {
                            return;
                        }
                        super.onPageStarted(view, url, favicon);
                    }

                    @Override // ru.yandex.taxi.web.CommonWebViewClient, ru.yandex.taxi.fragment.common.BaseWebViewClient
                    public boolean shouldOverrideUrlLoading(String url) {
                        if (consumeIfCardLink(url)) {
                            return true;
                        }
                        return super.shouldOverrideUrlLoading(url);
                    }

                    @Override // android.webkit.WebViewClient
                    @jxi
                    public boolean shouldOverrideUrlLoading(WebView view, String url) {
                        if (consumeIfCardLink(url)) {
                            return true;
                        }
                        return super.shouldOverrideUrlLoading(view, url);
                    }
                };
            default:
                final i iVar = (i) this.b;
                return new TaxiWebViewClient(z, z2, fVar, list) { // from class: com.yandex.go.captcha.WebCaptchaActivityListener$webViewClientFactory$1$1
                    @Override // ru.yandex.taxi.web.view.clients.TaxiWebViewClient, ru.yandex.taxi.web.CommonWebViewClient
                    public void onError(int errorCode, String description, String fallingUrl) {
                        super.onError(errorCode, description, fallingUrl);
                        hl2 hl2Var = iVar.d.b;
                        hl2Var.getClass();
                        hl2Var.a("Antirobot.Captcha.WebView.FailureScreen.DidShow", new Pair("error", description));
                    }

                    @Override // ru.yandex.taxi.web.CommonWebViewClient, ru.yandex.taxi.fragment.common.BaseWebViewClient
                    public boolean shouldOverrideUrlLoading(String url) {
                        Long m;
                        i iVar2 = iVar;
                        iVar2.getClass();
                        Uri parse = Uri.parse(url);
                        Set<String> queryParameterNames = parse.getQueryParameterNames();
                        if (queryParameterNames == null) {
                            return false;
                        }
                        boolean contains = queryParameterNames.contains("spravka");
                        boolean contains2 = queryParameterNames.contains("expires");
                        if (!contains || !contains2) {
                            return false;
                        }
                        String queryParameter = parse.getQueryParameter("spravka");
                        if (queryParameter == null) {
                            queryParameter = "";
                        }
                        String queryParameter2 = parse.getQueryParameter("expires");
                        long longValue = (queryParameter2 == null || (m = bvu0.m(10, queryParameter2)) == null) ? 0L : m.longValue();
                        ((j) iVar2.d.a).n("Antirobot.Captcha.Success");
                        cne0 cne0Var = iVar2.c.b;
                        cne0Var.r("captcha_token", queryParameter);
                        cne0Var.q(longValue, "captcha_expires");
                        iVar2.b.b(true);
                        tje.N(iVar2.f, null, null, new WebCaptchaActivityListener$handleCaptchaWebRequest$1(iVar2, null), 3);
                        return true;
                    }
                };
        }
    }
}
