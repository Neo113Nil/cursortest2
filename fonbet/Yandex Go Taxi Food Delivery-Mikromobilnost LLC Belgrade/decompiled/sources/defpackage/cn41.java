package defpackage;

import android.webkit.WebView;
import ru.yandex.taxi.logistics.sdk.webview.impl.ui.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class cn41 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ cn41(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                aVar.b.reload();
                break;
            case 1:
                WebView webView = aVar.b;
                if (!webView.canGoBack()) {
                    aVar.a.c.f();
                    break;
                } else {
                    webView.goBack();
                    break;
                }
            case 2:
                aVar.a.c.f();
                break;
            case 3:
                aVar.a.c.g(new cn41(aVar, 0));
                break;
            default:
                aVar.a.c.f();
                break;
        }
        return zy11Var;
    }
}
