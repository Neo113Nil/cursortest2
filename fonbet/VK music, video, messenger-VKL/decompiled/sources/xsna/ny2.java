package xsna;

import android.content.pm.PackageInfo;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: ApiHelperForO.java */
/* loaded from: classes12.dex */
public final class ny2 {
    @NonNull
    public static PackageInfo a() {
        return WebView.getCurrentWebViewPackage();
    }

    public static boolean b(@NonNull WebSettings webSettings) {
        return webSettings.getSafeBrowsingEnabled();
    }

    @Nullable
    public static WebChromeClient c(@NonNull WebView webView) {
        return webView.getWebChromeClient();
    }

    @Nullable
    public static WebViewClient d(@NonNull WebView webView) {
        return webView.getWebViewClient();
    }

    public static void e(@NonNull WebSettings webSettings, boolean z) {
        webSettings.setSafeBrowsingEnabled(z);
    }
}
