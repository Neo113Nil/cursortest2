package com.yandex.payment.sdk.ui.view.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.util.AttributeSet;
import android.webkit.ConsoleMessage;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import com.yandex.xplat.payment.sdk.WebViewTagForAnalytics;
import defpackage.qv90;
import defpackage.rwo;
import defpackage.sv90;
import defpackage.y22;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/payment/sdk/ui/view/webview/PaymentSdkWebView;", "Landroid/webkit/WebView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "origin", "sanitizeSensitiveUrl", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/yandex/payment/sdk/core/data/PaymentSdkEnvironment;", WebViewActivity.KEY_ENVIRONMENT, "Lrwo;", "eventReporter", "Lzy11;", "init", "(Lcom/yandex/payment/sdk/core/data/PaymentSdkEnvironment;Lrwo;)V", "(Lcom/yandex/payment/sdk/core/data/PaymentSdkEnvironment;)V", "Lcom/yandex/xplat/payment/sdk/WebViewTagForAnalytics;", "loggingTag", "Lcom/yandex/xplat/payment/sdk/WebViewTagForAnalytics;", "getLoggingTag", "()Lcom/yandex/xplat/payment/sdk/WebViewTagForAnalytics;", "Lrwo;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class PaymentSdkWebView extends WebView {
    private rwo eventReporter;
    private final WebViewTagForAnalytics loggingTag;

    public /* synthetic */ PaymentSdkWebView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String sanitizeSensitiveUrl(String origin) {
        String str;
        if (origin == null) {
            return "null";
        }
        try {
            URL url = new URL(origin);
            if (url.getPort() == -1) {
                str = "";
            } else {
                str = ":" + url.getPort();
            }
            return url.getProtocol() + "://" + url.getHost() + str + "/...";
        } catch (MalformedURLException unused) {
            return "malformed url is hidden";
        }
    }

    public WebViewTagForAnalytics getLoggingTag() {
        return this.loggingTag;
    }

    public void init(final PaymentSdkEnvironment environment) {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        setWebViewClient(new WebViewClient() { // from class: com.yandex.payment.sdk.ui.view.webview.PaymentSdkWebView$init$2
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                rwo rwoVar;
                String sanitizeSensitiveUrl;
                rwoVar = this.eventReporter;
                if (rwoVar != null) {
                    sv90 sv90Var = qv90.a;
                    sanitizeSensitiveUrl = this.sanitizeSensitiveUrl(url);
                    WebViewTagForAnalytics loggingTag = this.getLoggingTag();
                    sv90Var.getClass();
                    ((y22) rwoVar).a(sv90.D0(sanitizeSensitiveUrl, loggingTag));
                }
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                rwo rwoVar;
                String sanitizeSensitiveUrl;
                rwoVar = this.eventReporter;
                if (rwoVar != null) {
                    sv90 sv90Var = qv90.a;
                    sanitizeSensitiveUrl = this.sanitizeSensitiveUrl(url);
                    WebViewTagForAnalytics loggingTag = this.getLoggingTag();
                    sv90Var.getClass();
                    ((y22) rwoVar).a(sv90.E0(sanitizeSensitiveUrl, loggingTag));
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
            
                r3 = r2.eventReporter;
             */
            @Override // android.webkit.WebViewClient
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
                rwo rwoVar;
                String sanitizeSensitiveUrl;
                if (request == null || !request.isForMainFrame() || errorResponse == null || rwoVar == null) {
                    return;
                }
                sv90 sv90Var = qv90.a;
                sanitizeSensitiveUrl = this.sanitizeSensitiveUrl(request.getUrl().toString());
                String valueOf = String.valueOf(errorResponse.getStatusCode());
                WebViewTagForAnalytics loggingTag = this.getLoggingTag();
                sv90Var.getClass();
                ((y22) rwoVar).a(sv90.B0(sanitizeSensitiveUrl, valueOf, loggingTag));
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                if (PaymentSdkEnvironment.this.getIsDebug()) {
                    if (handler != null) {
                        handler.proceed();
                    }
                } else if (handler != null) {
                    handler.cancel();
                }
            }
        });
        setWebChromeClient(new WebChromeClient() { // from class: com.yandex.payment.sdk.ui.view.webview.PaymentSdkWebView$init$3
            /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
            
                r0 = r2.this$0.eventReporter;
             */
            @Override // android.webkit.WebChromeClient
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                rwo rwoVar;
                if (consoleMessage == null || consoleMessage.messageLevel().compareTo(ConsoleMessage.MessageLevel.ERROR) < 0 || rwoVar == null) {
                    return false;
                }
                sv90 sv90Var = qv90.a;
                String message = consoleMessage.message();
                WebViewTagForAnalytics loggingTag = PaymentSdkWebView.this.getLoggingTag();
                sv90Var.getClass();
                ((y22) rwoVar).a(sv90.C0(message, loggingTag));
                return false;
            }
        });
    }

    public PaymentSdkWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.loggingTag = WebViewTagForAnalytics.FORM_3DS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentSdkWebView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public void init(PaymentSdkEnvironment environment, rwo eventReporter) {
        this.eventReporter = eventReporter;
        init(environment);
    }
}
