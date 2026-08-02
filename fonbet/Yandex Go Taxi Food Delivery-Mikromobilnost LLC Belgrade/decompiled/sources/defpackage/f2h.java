package defpackage;

import com.adjust.sdk.Constants;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.webview.api.WebViewAppearanceOption;
import com.ybsdk.feature.webview.api.WebViewControl;
import com.ybsdk.feature.webview.api.WebViewScreenParams;
import com.ybsdk.feature.webview.api.a;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class f2h implements k3h {
    public final /* synthetic */ int a;
    public final /* synthetic */ np41 b;

    public /* synthetic */ f2h(np41 np41Var, int i) {
        this.a = i;
        this.b = np41Var;
    }

    @Override // defpackage.k3h
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        int i = this.a;
        x0h x0hVar = x0h.a;
        np41 np41Var = this.b;
        switch (i) {
            case 0:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.OpenUrlFullscreen)) {
                    return x0hVar;
                }
                String url = ((DeeplinkAction.OpenUrlFullscreen) baseDeeplinkAction).getUrl();
                WebViewScreenParams.Auth auth = a.a;
                WebViewControl.Type type = WebViewControl.Type.CROSS;
                WebViewControl.Companion.getClass();
                return new v0h(Collections.singletonList(((com.ybsdk.feature.webview.internal.a) np41Var).e(new WebViewScreenParams(url, false, null, new WebViewAppearanceOption.NoToolbar(new WebViewControl(type, ln41.a()), false, true, 2, null), null, null, null, null, false, 502, null))), null, 6);
            default:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.WebView)) {
                    return x0hVar;
                }
                DeeplinkAction.WebView webView = (DeeplinkAction.WebView) baseDeeplinkAction;
                return new v0h(Collections.singletonList(((com.ybsdk.feature.webview.internal.a) np41Var).e(new WebViewScreenParams(webView.getUrl(), webView.getOpenKeyboardOnLoad(), webView.getAuth(), webView.getAppearance(), null, webView.getStatusBar(), webView.getFitsSystemWindow(), null, false, Constants.MINIMAL_ERROR_STATUS_CODE, null))), null, 6);
        }
    }
}
