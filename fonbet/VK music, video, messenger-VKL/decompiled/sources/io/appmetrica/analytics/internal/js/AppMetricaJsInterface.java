package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C5208u1;

/* loaded from: classes8.dex */
public class AppMetricaJsInterface {
    private final C5208u1 a;

    public AppMetricaJsInterface(@NonNull C5208u1 c5208u1) {
        this.a = c5208u1;
    }

    @JavascriptInterface
    public void reportEvent(String str, String str2) {
        this.a.d(str, str2);
    }
}
