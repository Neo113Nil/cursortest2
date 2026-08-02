package com.yandex.go.platform.web_view_client;

import android.net.Uri;
import android.util.Log;
import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.yandex.go.platform.di.d;
import com.yandex.go.platform.web_view_client.upload_image.b;
import defpackage.dst;
import defpackage.est;
import defpackage.jl40;
import defpackage.mt71;
import defpackage.ss2;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt41;
import defpackage.vfc0;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0002\b\nB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ5\u0010#\u001a\u00020\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00172\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001c2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)¨\u0006*"}, d2 = {"Lcom/yandex/go/platform/web_view_client/GoWebChromeClient;", "Landroid/webkit/WebChromeClient;", "Lss2;", "appCredentials", "Ltse;", "mainScope", "Lcom/yandex/go/platform/web_view_client/upload_image/b;", "fileChooserDelegate", "Ldst;", "uploadImagePermissionsListener", "Lest;", "windowCloseListener", "<init>", "(Lss2;Ltse;Lcom/yandex/go/platform/web_view_client/upload_image/b;Ldst;Lest;)V", "", "origin", "Landroid/webkit/GeolocationPermissions$Callback;", "callback", "Lzy11;", "onGeolocationPermissionsShowPrompt", "(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V", "onGeolocationPermissionsHidePrompt", "()V", "Landroid/webkit/WebView;", "window", "onCloseWindow", "(Landroid/webkit/WebView;)V", "webView", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "filePathCallback", "Landroid/webkit/WebChromeClient$FileChooserParams;", "fileChooserParams", "", "onShowFileChooser", "(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z", "Lss2;", "Ltse;", "Lcom/yandex/go/platform/web_view_client/upload_image/b;", "Ldst;", "Lest;", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GoWebChromeClient extends WebChromeClient {
    private final ss2 appCredentials;
    private final b fileChooserDelegate;
    private final tse mainScope;
    private final dst uploadImagePermissionsListener;
    private final est windowCloseListener;

    public GoWebChromeClient(ss2 ss2Var, tse tseVar, b bVar, dst dstVar, est estVar) {
        this.appCredentials = ss2Var;
        this.mainScope = tseVar;
        this.fileChooserDelegate = bVar;
        this.uploadImagePermissionsListener = dstVar;
        this.windowCloseListener = estVar;
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView window) {
        Object obj;
        super.onCloseWindow(window);
        if (window != null) {
            a aVar = (a) ((d) ((vfc0) this.windowCloseListener).b).k.e;
            Iterator it = kotlin.collections.a.q0(aVar.g).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((tt41) obj).a == window) {
                        break;
                    }
                }
            }
            tt41 tt41Var = (tt41) obj;
            if (tt41Var == null) {
                Log.wtf("WebViewStack", "handleBackPressedAtView: target webView not found on stack!");
                return;
            }
            WebView webView = tt41Var.a;
            if (webView.canGoBack()) {
                webView.goBack();
            } else if (tt41Var != aVar.m) {
                aVar.d(webView);
                aVar.k(tt41Var);
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback) {
        boolean l = jl40.l(this.appCredentials.c, mt71.l(origin));
        callback.invoke(origin, l, l);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        tje.N(this.mainScope, null, null, new GoWebChromeClient$onShowFileChooser$1(this, fileChooserParams, filePathCallback, null), 3);
        return true;
    }
}
