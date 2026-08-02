package xsna;

import android.webkit.JavascriptInterface;
import xsna.a6y;

/* compiled from: JsCommonBridge.kt */
/* loaded from: classes6.dex */
public class c3y implements a6y {
    public qdx0 b;

    @Override // xsna.a6y
    public final b6y c() {
        return this.b;
    }

    @Override // xsna.a6y
    @JavascriptInterface
    public boolean onWebAppCheckHost(String str) {
        return a6y.a.onWebAppCheckHost(this, str);
    }

    @Override // xsna.a6y
    @JavascriptInterface
    public void onWebAppProxyAddAwaitRequest(String str) {
        a6y.a.onWebAppProxyAddAwaitRequest(this, str);
    }

    @Override // xsna.a6y
    @JavascriptInterface
    public void onWebAppProxyDeviceInfo(String str) {
        a6y.a.onWebAppProxyDeviceInfo(this, str);
    }

    @Override // xsna.a6y
    @JavascriptInterface
    public void onWebAppProxyInterceptAsyncRequest(String str, String str2, String str3) {
        a6y.a.onWebAppProxyInterceptAsyncRequest(this, str, str2, str3);
    }
}
