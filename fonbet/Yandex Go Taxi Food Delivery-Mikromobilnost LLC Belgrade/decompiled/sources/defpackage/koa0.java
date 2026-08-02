package defpackage;

import android.webkit.WebView;
import ru.yandex.taxi.plus.sdk.payments.PaymentsWidgetModalView;

/* loaded from: classes6.dex */
public final class koa0 extends mx60 {
    public final /* synthetic */ PaymentsWidgetModalView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public koa0(PaymentsWidgetModalView paymentsWidgetModalView) {
        super(true);
        this.d = paymentsWidgetModalView;
    }

    @Override // defpackage.mx60
    public final void d() {
        WebView webView;
        WebView webView2;
        PaymentsWidgetModalView paymentsWidgetModalView = this.d;
        webView = paymentsWidgetModalView.webView;
        if (!webView.canGoBack()) {
            paymentsWidgetModalView.dismiss();
        } else {
            webView2 = paymentsWidgetModalView.webView;
            webView2.goBack();
        }
    }
}
