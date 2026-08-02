package com.ybsdk.screens.initial.deeplink;

import android.net.Uri;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.webview.api.WebViewAppearanceOption;
import com.ybsdk.feature.webview.api.WebViewControl;
import com.ybsdk.feature.webview.api.WebViewScreenParams;
import com.ybsdk.feature.webview.api.WebViewStatusBar;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import defpackage.bzk0;
import defpackage.e6b1;
import defpackage.evu0;
import defpackage.l970;
import defpackage.ln41;
import defpackage.ql41;
import defpackage.vop0;
import defpackage.vu30;
import defpackage.w511;

/* loaded from: classes9.dex */
public final class e {
    public final com.ybsdk.rconfig.b a;
    public final vop0 b;

    public e(com.ybsdk.rconfig.b bVar, vop0 vop0Var) {
        this.a = bVar;
        this.b = vop0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
    
        if (r11.equals("arrow") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0144, code lost:
    
        if (r11.equals("none") == false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DeeplinkAction.WebView a(Uri uri, boolean z) {
        Uri b;
        boolean i;
        WebViewScreenParams.Auth a;
        WebViewAppearanceOption noToolbar;
        WebViewAppearanceOption.NoToolbar noToolbar2;
        WebViewAppearanceOption webViewAppearanceOption;
        Boolean bool;
        boolean i2;
        b = e6b1.b(uri, this.a, z, SdkUri$QueryParam.URL);
        if (b == null) {
            return null;
        }
        String uri2 = l970.b(this.b, uri, b).toString();
        i = bzk0.i(uri, SdkUri$QueryParam.OPEN_KEYBOARD, false);
        SdkUri$QueryParam sdkUri$QueryParam = SdkUri$QueryParam.AUTH;
        String o = bzk0.o(uri, sdkUri$QueryParam);
        if (o == null) {
            a = WebViewScreenParams.Auth.NONE;
        } else {
            WebViewScreenParams.Auth.Companion.getClass();
            a = com.ybsdk.feature.webview.api.b.a(o);
            if (a == null) {
                a = WebViewScreenParams.Auth.NONE;
                l970.d(sdkUri$QueryParam.getParamValue(), o);
            }
        }
        boolean i3 = bzk0.i(uri, SdkUri$QueryParam.SHOW_NAVBAR, true);
        SdkUri$QueryParam sdkUri$QueryParam2 = SdkUri$QueryParam.HEADER_COLOR;
        WebViewAppearanceOption.Companion.getClass();
        ColorModel d = bzk0.d(uri, sdkUri$QueryParam2, ql41.a());
        SdkUri$QueryParam sdkUri$QueryParam3 = SdkUri$QueryParam.CONTROL_COLOR;
        WebViewControl.Companion.getClass();
        ColorModel d2 = bzk0.d(uri, sdkUri$QueryParam3, ln41.a());
        SdkUri$QueryParam sdkUri$QueryParam4 = SdkUri$QueryParam.CONTROL;
        String o2 = bzk0.o(uri, sdkUri$QueryParam4);
        String o3 = bzk0.o(uri, SdkUri$QueryParam.TITLE);
        if (i3) {
            if (o2 != null) {
                int hashCode = o2.hashCode();
                if (hashCode != 3387192) {
                    if (hashCode != 93090825) {
                        if (hashCode == 94935104 && o2.equals("cross")) {
                            noToolbar = new WebViewAppearanceOption.ShowToolbar(new WebViewControl(WebViewControl.Type.CROSS, d2), false, o3, d, 2, null);
                        }
                    }
                    noToolbar = new WebViewAppearanceOption.ShowToolbar(null, false, o3, d, 2, null);
                    l970.d(sdkUri$QueryParam4.getParamValue(), o2);
                } else {
                    if (o2.equals("none")) {
                        noToolbar = new WebViewAppearanceOption.ShowToolbar(null, false, o3, d, 2, null);
                    }
                    noToolbar = new WebViewAppearanceOption.ShowToolbar(null, false, o3, d, 2, null);
                    l970.d(sdkUri$QueryParam4.getParamValue(), o2);
                }
            }
            noToolbar = new WebViewAppearanceOption.ShowToolbar(new WebViewControl(WebViewControl.Type.ARROW, d2), false, o3, d, 2, null);
        } else {
            if (i3) {
                w511.b();
                return null;
            }
            if (o2 != null) {
                int hashCode2 = o2.hashCode();
                if (hashCode2 != 3387192) {
                    if (hashCode2 != 93090825) {
                        if (hashCode2 == 94935104 && o2.equals("cross")) {
                            noToolbar2 = new WebViewAppearanceOption.NoToolbar(new WebViewControl(WebViewControl.Type.CROSS, d2), false, false, 6, null);
                            noToolbar = noToolbar2;
                        }
                    } else if (o2.equals("arrow")) {
                        noToolbar2 = new WebViewAppearanceOption.NoToolbar(new WebViewControl(WebViewControl.Type.ARROW, d2), false, false, 6, null);
                        noToolbar = noToolbar2;
                    }
                }
                noToolbar2 = new WebViewAppearanceOption.NoToolbar(null, false, false, 4, null);
                l970.d(sdkUri$QueryParam4.getParamValue(), o2);
                noToolbar = noToolbar2;
            }
            noToolbar = new WebViewAppearanceOption.NoToolbar(null, false, false, 4, null);
        }
        WebViewStatusBar webViewStatusBar = new WebViewStatusBar(bzk0.d(uri, sdkUri$QueryParam2, ql41.a()), bzk0.e(uri, SdkUri$QueryParam.STATUSBAR_STYLE, new vu30(19)));
        SdkUri$QueryParam sdkUri$QueryParam5 = SdkUri$QueryParam.FIT_WINDOW_TOP;
        String queryParameter = uri.getQueryParameter(sdkUri$QueryParam5.getParamValue());
        if (queryParameter == null || evu0.J(queryParameter)) {
            webViewAppearanceOption = noToolbar;
            bool = null;
        } else {
            i2 = bzk0.i(uri, sdkUri$QueryParam5, false);
            webViewAppearanceOption = noToolbar;
            bool = Boolean.valueOf(!i2);
        }
        return new DeeplinkAction.WebView(uri2, i, a, webViewAppearanceOption, webViewStatusBar, bool);
    }
}
