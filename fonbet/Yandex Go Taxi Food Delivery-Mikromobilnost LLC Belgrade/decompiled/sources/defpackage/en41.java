package defpackage;

import java.util.Map;
import ru.yandex.taxi.web.WebContentView;
import ru.yandex.taxi.web.view.WebViewContainerImpl;

/* loaded from: classes6.dex */
public final class en41 implements gn41 {
    public final /* synthetic */ WebViewContainerImpl a;

    public en41(WebViewContainerImpl webViewContainerImpl) {
        this.a = webViewContainerImpl;
    }

    @Override // defpackage.gn41
    public final void G2(String str, String str2) {
        WebContentView webContentView;
        webContentView = this.a.webView;
        webContentView.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // defpackage.gn41
    public final void H4() {
        this.a.applyContentTheme(null);
    }

    @Override // defpackage.gn41
    public final void clearHistory() {
        WebContentView webContentView;
        webContentView = this.a.webView;
        webContentView.clearHistory();
    }

    @Override // defpackage.gn41
    public final void loadUrl(String str) {
        WebContentView webContentView;
        webContentView = this.a.webView;
        webContentView.loadUrl(str);
    }

    @Override // defpackage.gn41
    public final void nb(cu41 cu41Var) {
        this.a.setViewState(cu41Var);
    }

    @Override // defpackage.gn41
    public final void refresh() {
        WebContentView webContentView;
        webContentView = this.a.webView;
        webContentView.reload();
    }

    @Override // defpackage.gn41
    public final void refreshBackButton() {
        this.a.refreshBackButton();
    }

    @Override // defpackage.gn41
    public final void loadUrl(String str, Map map) {
        WebContentView webContentView;
        webContentView = this.a.webView;
        webContentView.loadUrl(str, map);
    }
}
