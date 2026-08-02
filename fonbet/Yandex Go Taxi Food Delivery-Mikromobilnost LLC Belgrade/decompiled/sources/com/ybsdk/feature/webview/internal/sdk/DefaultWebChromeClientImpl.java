package com.ybsdk.feature.webview.internal.sdk;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;
import com.ybsdk.feature.webview.internal.presentation.WebViewFragment;
import com.ybsdk.feature.webview.internal.utils.a;
import defpackage.aj31;
import defpackage.boh;
import defpackage.gv41;
import defpackage.i5z0;
import defpackage.oyr;
import defpackage.pi51;
import defpackage.qi51;
import defpackage.qnh;
import defpackage.ri51;
import defpackage.rje;
import defpackage.si51;
import defpackage.slf;
import defpackage.zch;
import defpackage.zgf;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\t\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\t\u0010\rJ\u0013\u0010\t\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\t\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J9\u0010\u001c\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0014\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b \u0010!J3\u0010'\u001a\u00020\u00132\b\u0010\"\u001a\u0004\u0018\u00010\u00162\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u00132\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J#\u0010,\u001a\u00020\u001f2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010+\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.¨\u0006/"}, d2 = {"Lcom/ybsdk/feature/webview/internal/sdk/DefaultWebChromeClientImpl;", "Landroid/webkit/WebChromeClient;", "Lsi51;", "client", "<init>", "(Lsi51;)V", "T", "Landroid/webkit/ValueCallback;", "Lri51;", "toInternal", "(Landroid/webkit/ValueCallback;)Lri51;", "Landroid/webkit/WebChromeClient$FileChooserParams;", "Lpi51;", "(Landroid/webkit/WebChromeClient$FileChooserParams;)Lpi51;", "Landroid/webkit/GeolocationPermissions$Callback;", "Lqi51;", "(Landroid/webkit/GeolocationPermissions$Callback;)Lqi51;", "Landroid/webkit/ConsoleMessage;", "consoleMessage", "", "onConsoleMessage", "(Landroid/webkit/ConsoleMessage;)Z", "Landroid/webkit/WebView;", "webView", "", "Landroid/net/Uri;", "filePathCallback", "fileChooserParams", "onShowFileChooser", "(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z", "window", "Lzy11;", "onCloseWindow", "(Landroid/webkit/WebView;)V", "view", "isDialog", "isUserGesture", "Landroid/os/Message;", "resultMsg", "onCreateWindow", "(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z", "", "origin", "callback", "onGeolocationPermissionsShowPrompt", "(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V", "Lsi51;", "feature-webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DefaultWebChromeClientImpl extends WebChromeClient {
    private final si51 client;

    public DefaultWebChromeClientImpl(si51 si51Var) {
        this.client = si51Var;
    }

    private final qi51 toInternal(GeolocationPermissions.Callback callback) {
        return new zgf(21, callback);
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView window) {
        gv41 viewModel;
        viewModel = ((WebViewFragment) ((aj31) this.client).b).getViewModel();
        viewModel.i0();
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        i5z0.a.a(oyr.p("Received WebChromeClient message: '", consoleMessage != null ? consoleMessage.message() : null, "'"), new Object[0]);
        return super.onConsoleMessage(consoleMessage);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (r5 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
        String str;
        Bundle data;
        si51 si51Var = this.client;
        String str2 = null;
        boh bohVar = view != null ? new boh(view) : null;
        aj31 aj31Var = (aj31) si51Var;
        aj31Var.getClass();
        if (isUserGesture) {
            if (bohVar != null) {
                WebView webView = bohVar.a;
                if (webView.getHitTestResult().getType() == 8) {
                    Handler handler = webView.getHandler();
                    Message obtainMessage = handler != null ? handler.obtainMessage() : null;
                    webView.requestFocusNodeHref(obtainMessage);
                    if (obtainMessage == null || (data = obtainMessage.getData()) == null || (str = data.getString("url")) == null || str.length() <= 0) {
                        str = null;
                    }
                }
                str = null;
                if (str != null) {
                    str2 = str;
                    if (str2 != null) {
                        FragmentActivity requireActivity = ((WebViewFragment) aj31Var.b).requireActivity();
                        Uri parse = Uri.parse(str2);
                        try {
                            new slf().a().a(requireActivity, parse);
                            i5z0.a.a("CustomTabsIntent launched with uri " + parse, new Object[0]);
                            return true;
                        } catch (Exception unused) {
                            rje.k(requireActivity, new Intent("android.intent.action.VIEW", parse));
                            return true;
                        }
                    }
                }
            }
            if (bohVar != null) {
                str2 = bohVar.a.getHitTestResult().getExtra();
            }
            if (str2 != null) {
            }
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback) {
        a aVar;
        si51 si51Var = this.client;
        qi51 internal = callback != null ? toInternal(callback) : null;
        WebViewFragment webViewFragment = (WebViewFragment) ((aj31) si51Var).b;
        if (origin == null || internal == null) {
            return;
        }
        aVar = webViewFragment.geolocationPermissionManager;
        aVar.a(origin, internal, webViewFragment.requireContext());
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        boolean onShowFileChooser;
        onShowFileChooser = ((WebViewFragment) ((aj31) this.client).b).onShowFileChooser(filePathCallback != null ? toInternal(filePathCallback) : null, fileChooserParams != null ? toInternal(fileChooserParams) : null);
        return onShowFileChooser;
    }

    private final pi51 toInternal(WebChromeClient.FileChooserParams fileChooserParams) {
        return new zch(fileChooserParams);
    }

    private final <T> ri51 toInternal(ValueCallback<T> valueCallback) {
        return new qnh(valueCallback);
    }
}
