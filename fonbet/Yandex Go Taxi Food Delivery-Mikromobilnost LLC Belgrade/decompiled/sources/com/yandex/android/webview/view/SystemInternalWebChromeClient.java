package com.yandex.android.webview.view;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import defpackage.cjs;
import defpackage.fn51;
import defpackage.gn51;
import defpackage.gya0;
import defpackage.lax;
import defpackage.nn41;
import defpackage.nsw;
import defpackage.osw;
import defpackage.ryq;

/* loaded from: classes11.dex */
class SystemInternalWebChromeClient extends WebChromeClient {
    private ryq mFileChooserController;
    private cjs mFullScreenVideoController;
    private lax mJsConsoleListener;
    private fn51 mOnCloseWindowDelegate;
    private gn51 mOnCreateWindowDelegate;
    private nsw mOnReceiveFaviconListener;
    private osw mOnStateChangedListener;
    private gya0 mPermissionController;
    private final nn41 mWebViewController;

    public SystemInternalWebChromeClient(nn41 nn41Var) {
    }

    private void notifyOnProgressChanged(int i) {
    }

    private void notifyTitleChanged(String str) {
    }

    private void notifyUrlChanged(String str, int i) {
    }

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
        defaultVideoPoster.getClass();
        return defaultVideoPoster;
    }

    @Override // android.webkit.WebChromeClient
    public View getVideoLoadingProgressView() {
        return super.getVideoLoadingProgressView();
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        return super.onCreateWindow(webView, z, z2, message);
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        super.onGeolocationPermissionsShowPrompt(str, callback);
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        super.onHideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        super.onPermissionRequest(permissionRequest);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        notifyOnProgressChanged(i);
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        super.onReceivedIcon(webView, bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        if (!TextUtils.isEmpty(str)) {
            notifyTitleChanged(str);
        }
        String url = webView.getUrl();
        if (TextUtils.isEmpty(url)) {
            return;
        }
        notifyUrlChanged(url, 3);
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        if (this.mFileChooserController == null) {
            return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        throw null;
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback) {
        ryq ryqVar = this.mFileChooserController;
        if (ryqVar == null) {
            return;
        }
        ryqVar.getClass();
    }

    public void setFileChooserController(ryq ryqVar) {
        this.mFileChooserController = ryqVar;
    }

    public void setFullScreenVideoController(cjs cjsVar) {
    }

    public void setJsConsoleListener(lax laxVar) {
    }

    public void setOnCloseWindowDelegate(fn51 fn51Var) {
    }

    public void setOnCreateWindowDelegate(gn51 gn51Var) {
    }

    public void setOnReceiveFaviconListener(nsw nswVar) {
    }

    public void setOnStateChangedListener(osw oswVar) {
    }

    public void setPermissionController(gya0 gya0Var) {
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, i, customViewCallback);
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
        ryq ryqVar = this.mFileChooserController;
        if (ryqVar == null) {
            return;
        }
        ryqVar.getClass();
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        ryq ryqVar = this.mFileChooserController;
        if (ryqVar == null) {
            return;
        }
        ryqVar.getClass();
    }
}
