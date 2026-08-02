package com.ybsdk.feature.webview.api;

import com.ybsdk.feature.webview.api.WebViewScreenParams;
import defpackage.jl40;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class b {
    public static WebViewScreenParams.Auth a(String str) {
        Object obj;
        Iterator<E> it = WebViewScreenParams.Auth.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((WebViewScreenParams.Auth) obj).getAuthLevel(), str)) {
                break;
            }
        }
        return (WebViewScreenParams.Auth) obj;
    }
}
