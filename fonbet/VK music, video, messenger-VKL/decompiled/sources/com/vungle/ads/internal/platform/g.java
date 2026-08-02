package com.vungle.ads.internal.platform;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.vungle.ads.internal.model.f0;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import kotlin.Result;
import xsna.o7j;

/* loaded from: classes7.dex */
public abstract class g {
    public static void a(Context context, o7j o7jVar) {
        Object failure;
        try {
            failure = WebSettings.getDefaultUserAgent(context);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (!(failure instanceof Result.Failure)) {
            o7jVar.accept((String) failure);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            boolean z = u.a;
            t.a("WebViewUtil", "Failed to get user agent", a);
            o7jVar.accept(null);
        }
    }

    public static void a(WebView webView, f0 f0Var) {
        Boolean b;
        Boolean a;
        WebSettings settings = webView.getSettings();
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSaveFormData(true);
        settings.setUseWideViewPort(false);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs((f0Var == null || (a = f0Var.a()) == null) ? false : a.booleanValue());
        settings.setAllowUniversalAccessFromFileURLs((f0Var == null || (b = f0Var.b()) == null) ? false : b.booleanValue());
        webView.setVisibility(4);
        settings.setMediaPlaybackRequiresUserGesture(false);
    }
}
