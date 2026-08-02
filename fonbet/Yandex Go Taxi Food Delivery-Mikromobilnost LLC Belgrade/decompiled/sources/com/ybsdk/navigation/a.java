package com.ybsdk.navigation;

import com.ybsdk.api.YBSdkVisualParams;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.feature.webview.api.WebViewAppearanceOption;
import com.ybsdk.feature.webview.api.WebViewControl;
import com.ybsdk.feature.webview.api.WebViewScreenParams;
import defpackage.j3h;
import defpackage.l3h;
import defpackage.np41;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class a {
    public static final FragmentScreen a(np41 np41Var, String str) {
        return ((com.ybsdk.feature.webview.internal.a) np41Var).e(new WebViewScreenParams(str, false, null, null, new OnWebViewCloseCallback(), null, null, null, false, 494, null));
    }

    public static final List b(j3h j3hVar, np41 np41Var, String str, YBSdkVisualParams yBSdkVisualParams) {
        List c = ((l3h) j3hVar).c(str);
        return c == null ? Collections.singletonList(((com.ybsdk.feature.webview.internal.a) np41Var).e(new WebViewScreenParams(str, false, null, yBSdkVisualParams.getShowAsSlidableView() ? new WebViewAppearanceOption.NoToolbar(null, false, true, 2, null) : new WebViewAppearanceOption.ShowToolbar(new WebViewControl(WebViewControl.Type.ARROW, null, 2, null), false, "", null, 10, null), null, null, null, null, false, 502, null))) : c;
    }
}
