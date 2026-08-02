package defpackage;

import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.web.view.WebViewContainerImpl;

/* loaded from: classes13.dex */
public final class an41 {
    public final zm41 a;

    public an41(zm41 zm41Var) {
        this.a = zm41Var;
    }

    public static WebViewContainerImpl a(an41 an41Var, UiWebViewConfig uiWebViewConfig, Runnable runnable) {
        an41Var.getClass();
        WebViewContainerImpl c = id00.e(an41Var.a, uiWebViewConfig, bi41.D4, dp41.a, to41.a, ms41.a).c();
        c.setOnCloseRequested(runnable);
        return c;
    }
}
