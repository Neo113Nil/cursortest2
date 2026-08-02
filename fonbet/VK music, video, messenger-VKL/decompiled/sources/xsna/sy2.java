package xsna;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* compiled from: ApiHelperForQ.java */
/* loaded from: classes12.dex */
public final class sy2 {
    @Deprecated
    public static int a(@NonNull WebSettings webSettings) {
        int forceDark;
        forceDark = webSettings.getForceDark();
        return forceDark;
    }

    @Nullable
    public static WebViewRenderProcess b(@NonNull WebView webView) {
        WebViewRenderProcess webViewRenderProcess;
        webViewRenderProcess = webView.getWebViewRenderProcess();
        return webViewRenderProcess;
    }

    @Nullable
    public static WebViewRenderProcessClient c(@NonNull WebView webView) {
        WebViewRenderProcessClient webViewRenderProcessClient;
        webViewRenderProcessClient = webView.getWebViewRenderProcessClient();
        return webViewRenderProcessClient;
    }

    @Deprecated
    public static void d(@NonNull WebSettings webSettings, int i) {
        webSettings.setForceDark(i);
    }

    public static void e(@NonNull WebView webView, @NonNull Executor executor, @Nullable ijx0 ijx0Var) {
        webView.setWebViewRenderProcessClient(executor, null);
    }

    public static void f(@NonNull WebView webView, @Nullable ijx0 ijx0Var) {
        webView.setWebViewRenderProcessClient(null);
    }

    public static boolean g(@NonNull WebViewRenderProcess webViewRenderProcess) {
        boolean terminate;
        terminate = webViewRenderProcess.terminate();
        return terminate;
    }
}
