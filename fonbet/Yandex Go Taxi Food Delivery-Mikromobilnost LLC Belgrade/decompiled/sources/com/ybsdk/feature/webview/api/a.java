package com.ybsdk.feature.webview.api;

import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.feature.webview.api.WebViewAppearanceOption;
import com.ybsdk.feature.webview.api.WebViewCloseCallback;
import com.ybsdk.feature.webview.api.WebViewControl;
import com.ybsdk.feature.webview.api.WebViewScreenParams;
import defpackage.np41;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

/* loaded from: classes3.dex */
public abstract class a {
    public static final WebViewScreenParams.Auth a = WebViewScreenParams.Auth.BNK_NO_VERIFY;

    /* JADX WARN: Multi-variable type inference failed */
    public static final FragmentScreen a(np41 np41Var, String str, WebViewCloseCallback webViewCloseCallback, WebViewScreenParams.Auth auth) {
        return ((com.ybsdk.feature.webview.internal.a) np41Var).e(new WebViewScreenParams(str, true, auth, new WebViewAppearanceOption.NoToolbar(new WebViewControl(WebViewControl.Type.CROSS, null, 2, 0 == true ? 1 : 0), false, true), webViewCloseCallback, null, Boolean.TRUE, null, false, NetworkRequestException.INVALID_RANGE, null));
    }

    public static /* synthetic */ FragmentScreen b(np41 np41Var, String str, WebViewCloseCallback webViewCloseCallback, WebViewScreenParams.Auth auth, int i) {
        if ((i & 2) != 0) {
            webViewCloseCallback = WebViewCloseCallback.EmptyCallback.INSTANCE;
        }
        if ((i & 4) != 0) {
            auth = a;
        }
        return a(np41Var, str, webViewCloseCallback, auth);
    }

    public static final FragmentScreen c(np41 np41Var, String str, String str2) {
        WebViewAppearanceOption noToolbar;
        if (str.equals(str2)) {
            noToolbar = new WebViewAppearanceOption.ShowToolbar(null, false, "", null, 11, null);
        } else {
            noToolbar = new WebViewAppearanceOption.NoToolbar(null, false, false, 7, null);
        }
        return ((com.ybsdk.feature.webview.internal.a) np41Var).e(new WebViewScreenParams(str, false, null, noToolbar, null, null, null, null, false, 502, null));
    }
}
