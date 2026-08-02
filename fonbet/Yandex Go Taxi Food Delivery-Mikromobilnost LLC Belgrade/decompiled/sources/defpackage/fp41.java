package defpackage;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.yandex.go.platform.js_api.b;
import com.yandex.go.platform.js_api.i;

/* loaded from: classes13.dex */
public final /* synthetic */ class fp41 implements ValueCallback {
    public final /* synthetic */ b a;
    public final /* synthetic */ WebView b;
    public final /* synthetic */ lb20 c;
    public final /* synthetic */ String d;

    public /* synthetic */ fp41(lb20 lb20Var, WebView webView, b bVar, String str) {
        this.a = bVar;
        this.b = webView;
        this.c = lb20Var;
        this.d = str;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        boolean l = jl40.l((String) obj, "null");
        lb20 lb20Var = this.c;
        String str = this.d;
        if (!l) {
            llb1.e(lb20Var, "InjectScript. no need to inject script for ".concat(str));
            return;
        }
        this.b.evaluateJavascript("\nwindow.goPlatformPromises = {}\nfunction handlePromiseResult(promiseId, data, error) {\n    var pair = window.goPlatformPromises[promiseId]\n    if (pair) {\n        if (error) { \n            pair.reject(error) \n        } else { \n            pair.resolve(data) \n        }\n    }\n    delete window.goPlatformPromises[promiseId]\n}\n\nfunction createPromiseId(functionName) {\n    return functionName + (\"000000\").replace(/[018]/g, c =>\n        (crypto.getRandomValues(new Uint8Array(1))[0]).toString(16));\n}\n\nfunction generateError(errorMessage) {\n    return new Error(errorMessage);\n}\n" + i.b("param1", "param2") + this.a.a(), new ymf(str, 2, lb20Var));
        llb1.e(lb20Var, "InjectScript. inject started for: ".concat(str));
    }
}
