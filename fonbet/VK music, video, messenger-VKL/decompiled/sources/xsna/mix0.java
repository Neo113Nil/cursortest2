package xsna;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;
import xsna.vix0;

/* compiled from: WebViewCompat.java */
/* loaded from: classes12.dex */
public final class mix0 {
    public static final /* synthetic */ int a = 0;

    /* compiled from: WebViewCompat.java */
    public interface a {
        void onComplete(long j);
    }

    /* compiled from: WebViewCompat.java */
    public interface b {
        void onPostMessage(@NonNull WebView webView, @NonNull ygx0 ygx0Var, @NonNull Uri uri, boolean z, @NonNull txx txxVar);
    }

    static {
        Uri.parse("*");
        Uri.parse("");
    }

    public static void a(@NonNull WebView webView, @NonNull String str, @NonNull Set<String> set, @NonNull b bVar) {
        if (!oix0.j.c()) {
            throw oix0.a();
        }
        WebViewProviderBoundaryInterface createWebView = vix0.b.a.createWebView(webView);
        String[] strArr = (String[]) set.toArray(new String[0]);
        zgx0 zgx0Var = new zgx0();
        zgx0Var.b = bVar;
        createWebView.addWebMessageListener(str, strArr, BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(zgx0Var));
    }

    @NonNull
    public static WebViewClient b(@NonNull WebView webView) {
        oix0.f.getClass();
        return ny2.d(webView);
    }

    public static void c(@NonNull WebView webView, @NonNull String str) {
        if (!oix0.j.c()) {
            throw oix0.a();
        }
        vix0.b.a.createWebView(webView).removeWebMessageListener(str);
    }
}
