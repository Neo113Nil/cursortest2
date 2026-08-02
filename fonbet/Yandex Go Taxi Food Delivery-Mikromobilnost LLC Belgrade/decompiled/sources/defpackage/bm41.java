package defpackage;

import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* loaded from: classes5.dex */
public interface bm41 {
    void b(boolean z);

    default void e(String str) {
    }

    void f();

    default void g(cn41 cn41Var) {
    }

    default void i(PermissionRequest permissionRequest) {
    }

    void j(String str, boolean z);

    default void l(boolean z) {
        b(z);
    }

    default void m(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
    }

    void onFinish();

    void onStart();
}
