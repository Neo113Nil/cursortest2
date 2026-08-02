package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.WindowManager;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.newtab.NewTabPolicy;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.bi5;
import defpackage.dye;
import defpackage.e660;
import defpackage.f660;
import defpackage.i660;
import defpackage.jl40;
import defpackage.slf;
import defpackage.tlf;
import defpackage.vm41;
import defpackage.w511;
import defpackage.wmf;
import defpackage.xmf;
import defpackage.z22;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

@Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J0\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J0\u0010\u0010\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016¨\u0006\u0011"}, d2 = {"com/yandex/fintechsdk/features/bdui/internal/presentation/customview/webview/CustomWebView$setupWebChromeClient$1", "Landroid/webkit/WebChromeClient;", "onCreateWindow", "", "view", "Landroid/webkit/WebView;", "isDialog", "isUserGesture", "resultMsg", "Landroid/os/Message;", "onJsAlert", "url", "", Constants.KEY_MESSAGE, TarifficatorScenarioActivity.RESULT_KEY, "Landroid/webkit/JsResult;", "onJsConfirm", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CustomWebView$setupWebChromeClient$1 extends WebChromeClient {
    final /* synthetic */ CustomWebView this$0;

    public CustomWebView$setupWebChromeClient$1(CustomWebView customWebView) {
        this.this$0 = customWebView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreateWindow$lambda$0(CustomWebView customWebView, String str) {
        vm41 vm41Var;
        String urlForLogging;
        f660 f660Var;
        Object failure;
        Object failure2;
        vm41Var = customWebView.config;
        z22 z22Var = vm41Var.a;
        urlForLogging = customWebView.urlForLogging(str);
        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new bi5(urlForLogging));
        f660Var = customWebView.newTabHandler;
        f660Var.getClass();
        try {
            failure = Uri.parse(str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Uri uri = (Uri) failure;
        if (uri != null) {
            String scheme = uri.getScheme();
            String lowerCase = scheme != null ? scheme.toLowerCase(Locale.ROOT) : null;
            if (jl40.l(lowerCase, "http") || jl40.l(lowerCase, com.adjust.sdk.Constants.SCHEME)) {
                int i = e660.a[f660Var.b.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        Context context = f660Var.a;
                        try {
                            slf slfVar = new slf();
                            slfVar.a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                            tlf a = slfVar.a();
                            if (!(context instanceof Activity)) {
                                a.a.addFlags(SelfTester_JCP.IMITA);
                            }
                            a.a(context, Uri.parse(str));
                            failure2 = Boolean.TRUE;
                        } catch (Throwable th2) {
                            failure2 = new Result.Failure(th2);
                        }
                        Object obj = Boolean.FALSE;
                        if (failure2 instanceof Result.Failure) {
                            failure2 = obj;
                        }
                        if (!((Boolean) failure2).booleanValue()) {
                            f660Var.a(str);
                        }
                    } else {
                        if (i != 3) {
                            w511.b();
                            return null;
                        }
                        f660Var.a(str);
                    }
                }
            }
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onJsAlert$lambda$1(JsResult jsResult, DialogInterface dialogInterface) {
        if (jsResult != null) {
            jsResult.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onJsAlert$lambda$2(JsResult jsResult, DialogInterface dialogInterface, int i) {
        if (jsResult != null) {
            jsResult.confirm();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onJsConfirm$lambda$3(JsResult jsResult, DialogInterface dialogInterface, int i) {
        if (jsResult != null) {
            jsResult.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onJsConfirm$lambda$4(JsResult jsResult, DialogInterface dialogInterface) {
        if (jsResult != null) {
            jsResult.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onJsConfirm$lambda$5(JsResult jsResult, DialogInterface dialogInterface, int i) {
        if (jsResult != null) {
            jsResult.confirm();
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
        NewTabPolicy newTabPolicy;
        final i660 i660Var;
        newTabPolicy = this.this$0.newTabPolicy;
        if (newTabPolicy != NewTabPolicy.Disabled) {
            Object obj = resultMsg != null ? resultMsg.obj : null;
            WebView.WebViewTransport webViewTransport = obj instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj : null;
            if (webViewTransport != null) {
                CustomWebView customWebView = this.this$0;
                final dye dyeVar = new dye(13, customWebView);
                i660Var = customWebView.newWindowInterceptorWebViewFactory;
                Context context = this.this$0.getContext();
                i660Var.getClass();
                final WebView webView = new WebView(context);
                WebSettings settings = webView.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setDomStorageEnabled(true);
                settings.setSupportMultipleWindows(false);
                settings.setJavaScriptCanOpenWindowsAutomatically(false);
                webView.setWebViewClient(new WebViewClient() { // from class: com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.newtab.NewWindowInterceptorWebViewFactory$create$1$2
                    @Override // android.webkit.WebViewClient
                    public void onPageStarted(WebView view2, String url, Bitmap favicon) {
                        i660.a(i660.this, webView, url, dyeVar);
                    }

                    @Override // android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView view2, WebResourceRequest request) {
                        Uri url;
                        i660.a(i660.this, webView, (request == null || (url = request.getUrl()) == null) ? null : url.toString(), dyeVar);
                        return true;
                    }

                    @Override // android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView view2, String url) {
                        i660.a(i660.this, webView, url, dyeVar);
                        return true;
                    }
                });
                webViewTransport.setWebView(webView);
                resultMsg.sendToTarget();
                return true;
            }
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
        try {
            int i = 0;
            new AlertDialog.Builder(this.this$0.getContext()).setMessage(message).setOnCancelListener(new wmf(result, i)).setPositiveButton(R.string.ok, new xmf(result, i)).create().show();
            return true;
        } catch (WindowManager.BadTokenException unused) {
            if (result == null) {
                return true;
            }
            result.cancel();
            return true;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView view, String url, String message, JsResult result) {
        int i = 1;
        try {
            new AlertDialog.Builder(this.this$0.getContext()).setMessage(message).setNegativeButton(R.string.cancel, new xmf(result, i)).setOnCancelListener(new wmf(result, i)).setPositiveButton(R.string.ok, new xmf(result, 2)).create().show();
        } catch (WindowManager.BadTokenException unused) {
            if (result != null) {
                result.cancel();
            }
        }
        return true;
    }
}
