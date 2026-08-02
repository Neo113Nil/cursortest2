package defpackage;

import android.webkit.WebView;
import java.util.List;
import ru.yandex.taxi.deeplinks.f;
import ru.yandex.taxi.web.view.clients.TaxiWebViewClient;

/* loaded from: classes12.dex */
public final /* synthetic */ class m88 implements em41 {
    @Override // defpackage.em41
    public final TaxiWebViewClient a(final boolean z, final boolean z2, final f fVar, final List list) {
        return new TaxiWebViewClient(z, z2, fVar, list) { // from class: com.yandex.go.payments.cards.pci_dss.verification.Card3dsPollingBaseRouter$onLaunch$1$1$1
            @Override // ru.yandex.taxi.web.view.clients.TaxiWebViewClient, ru.yandex.taxi.web.CommonWebViewClient, android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
            }
        };
    }
}
