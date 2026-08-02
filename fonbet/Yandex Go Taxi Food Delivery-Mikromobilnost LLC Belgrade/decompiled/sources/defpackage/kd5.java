package defpackage;

import android.webkit.WebBackForwardList;
import com.yandex.plus.webview.api.WebViewContainer;
import java.util.Map;
import kotlin.a;

/* loaded from: classes2.dex */
public abstract class kd5 implements mn41 {
    public final boolean a;
    public final WebViewContainer b;
    public final i3y c = a.a(new l95(10, this));

    public kd5(boolean z, WebViewContainer webViewContainer) {
        this.a = z;
        this.b = webViewContainer;
    }

    public static void h(d35 d35Var) {
        d35Var.b.getWebView().setAlpha(0.0f);
    }

    @Override // defpackage.mn41
    public final boolean a() {
        return g().a();
    }

    @Override // defpackage.mn41
    public final void b(String str) {
        g().b(str);
    }

    @Override // defpackage.mn41
    public final WebBackForwardList c() {
        return g().c();
    }

    @Override // defpackage.mn41
    public final boolean canGoBack() {
        return g().canGoBack();
    }

    @Override // defpackage.mn41
    public final void clearHistory() {
        g().clearHistory();
    }

    @Override // defpackage.mn41
    public final String d() {
        return g().d();
    }

    public abstract com.yandex.plus.webview.internal.a e();

    public abstract mn41 f();

    public final mn41 g() {
        return (mn41) this.c.getValue();
    }

    @Override // defpackage.mn41
    public final String getUserAgentString() {
        return g().getUserAgentString();
    }

    @Override // defpackage.mn41
    public final void goBack() {
        g().goBack();
    }

    public final void i(sls slsVar, boolean z) {
        WebViewContainer webViewContainer = this.b;
        if (z) {
            webViewContainer.getWebView().animate().withEndAction(new h60(12, slsVar)).alpha(1.0f).start();
        } else {
            webViewContainer.getWebView().setAlpha(1.0f);
        }
    }

    @Override // defpackage.mn41
    public final void loadUrl(String str, Map map) {
        g().loadUrl(str, map);
    }

    @Override // defpackage.mn41
    public final void onPause() {
        g().onPause();
    }

    @Override // defpackage.mn41
    public final void onResume() {
        g().onResume();
    }

    @Override // defpackage.mn41
    public final void reload() {
        g().reload();
    }

    @Override // defpackage.mn41
    public final void setAudioMuted(boolean z) {
        g().setAudioMuted(z);
    }

    @Override // defpackage.mn41
    public final void stopLoading() {
        g().stopLoading();
    }
}
