package xsna;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* compiled from: WebViewProviderFactory.java */
/* loaded from: classes12.dex */
public interface hjx0 {
    @NonNull
    WebViewProviderBoundaryInterface createWebView(@NonNull WebView webView);

    @NonNull
    StaticsBoundaryInterface getStatics();

    @NonNull
    WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter();

    @NonNull
    String[] i();
}
