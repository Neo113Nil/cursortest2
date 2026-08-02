package xsna;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Group;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import xsna.y390;

/* compiled from: WebViewBottomSheet.kt */
/* loaded from: classes2.dex */
public final class jix0 extends WebViewClient {
    public final /* synthetic */ hix0 a;

    public jix0(hix0 hix0Var) {
        this.a = hix0Var;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
        hix0.Yn(this.a);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        hix0 hix0Var = this.a;
        Toolbar toolbar = hix0Var.f1;
        if (toolbar != null) {
            toolbar.setTitle(hix0Var.requireArguments().getString(NativeAdContent.ViewTag.AD_TITLE));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        hix0 hix0Var = this.a;
        hix0.Yn(hix0Var);
        Group group = hix0Var.h1;
        if (group != null) {
            group.setVisibility(8);
        }
        Toolbar toolbar = hix0Var.f1;
        if (toolbar != null) {
            toolbar.setTitle(hix0Var.getString(R.string.vk_loading));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webResourceRequest.isForMainFrame()) {
            hix0 hix0Var = this.a;
            Toolbar toolbar = hix0Var.f1;
            if (toolbar != null) {
                toolbar.setTitle(hix0Var.getString(R.string.vk_error));
            }
            Group group = hix0Var.h1;
            if (group != null) {
                group.setVisibility(0);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String url;
        String str = null;
        if (sslError != null && (url = sslError.getUrl()) != null && !drm0.N(url)) {
            str = url;
        }
        if (str != null) {
            dsw<UserId, v390> dswVar = y390.a;
            if (y390.a.a().d(str)) {
                String concat = "WebViewBottomSheet: skip SSL for ".concat(str);
                if (qex0.c) {
                    xgx0.a.getClass();
                    xgx0.a(concat);
                }
                if (sslErrorHandler != null) {
                    sslErrorHandler.proceed();
                    return;
                }
                return;
            }
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        hix0 hix0Var = this.a;
        f98 f98Var = hix0Var.i1;
        boolean d = f98Var != null ? f98Var.d(str) : false;
        if (d) {
            hix0Var.hide();
        }
        return d;
    }
}
