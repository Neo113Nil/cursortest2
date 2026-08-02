package defpackage;

import android.webkit.JavascriptInterface;
import com.yandex.plus.webview.api.contract.message.WebViewMessagesHandler;
import com.yandex.plus.webview.api.contract.message.a;

/* loaded from: classes2.dex */
public abstract class i45 extends jd5 implements x3x {
    public final WebViewMessagesHandler b;
    public final a c;
    public final ike d;

    public i45(WebViewMessagesHandler webViewMessagesHandler, a aVar, jse jseVar) {
        this.b = webViewMessagesHandler;
        this.c = aVar;
        this.d = qv10.e(jseVar);
    }

    @Override // defpackage.in41
    public void e() {
        com.yandex.plus.home.common.utils.a.b(this.d);
    }

    @Override // defpackage.jd5, defpackage.in41
    public final void i(com.yandex.plus.webview.internal.a aVar, swh swhVar) {
        super.i(aVar, swhVar);
        WebViewMessagesHandler webViewMessagesHandler = this.b;
        ike ikeVar = this.d;
        webViewMessagesHandler.d = ikeVar;
        u(webViewMessagesHandler);
        a aVar2 = this.c;
        if (aVar2 != null) {
            m6 m6Var = new m6(16, this);
            aVar2.c = ikeVar;
            aVar2.d = m6Var;
        }
    }

    @JavascriptInterface
    public void onMessage(String str) {
        this.b.onMessage(str);
    }

    public abstract void u(WebViewMessagesHandler webViewMessagesHandler);
}
