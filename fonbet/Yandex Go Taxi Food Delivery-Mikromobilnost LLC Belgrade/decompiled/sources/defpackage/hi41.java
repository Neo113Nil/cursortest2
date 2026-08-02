package defpackage;

import android.webkit.JavascriptInterface;

/* loaded from: classes2.dex */
public interface hi41 extends in41, x3x, zl41, ss41 {
    @Override // defpackage.x3x
    default String a() {
        return "__webviewPaymentWidget";
    }

    @JavascriptInterface
    String getToken();

    @JavascriptInterface
    void onEvent(String str);
}
