package ru.ok.android.sdk;

import android.content.Context;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: OkWebViewClient.kt */
/* loaded from: classes9.dex */
public class OkWebViewClient extends WebViewClient {
    private final Context mContext;
    private boolean showPage = true;

    public OkWebViewClient(Context context) {
        this.mContext = context;
    }

    private final String getString(int i) {
        return this.mContext.getString(i);
    }

    public final String getErrorMessage(int i) {
        return i != -11 ? i != -8 ? i != -6 ? i != -2 ? getString(R.string.error_unknown) : getString(R.string.error_host_lookup) : getString(R.string.error_connect) : getString(R.string.error_timeout) : getString(R.string.error_failed_ssl_handshake);
    }

    public final boolean getShowPage() {
        return this.showPage;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        webView.setVisibility(this.showPage ? 0 : 4);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.showPage = false;
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.showPage = false;
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    public final void setShowPage(boolean z) {
        this.showPage = z;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.showPage = true;
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public final String getErrorMessage(SslError sslError) {
        int primaryError = sslError.getPrimaryError();
        if (primaryError == 0) {
            return getString(R.string.error_ssl_not_yet_valid);
        }
        if (primaryError == 1) {
            return getString(R.string.error_ssl_expired);
        }
        if (primaryError == 2) {
            return getString(R.string.error_ssl_id_mismatch);
        }
        if (primaryError == 3) {
            return getString(R.string.error_ssl_untrusted);
        }
        if (primaryError != 4) {
            return getString(R.string.error_unknown);
        }
        return getString(R.string.error_ssl_date_invalid);
    }
}
