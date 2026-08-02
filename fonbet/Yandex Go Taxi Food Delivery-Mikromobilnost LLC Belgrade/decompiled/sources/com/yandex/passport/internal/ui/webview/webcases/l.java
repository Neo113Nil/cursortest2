package com.yandex.passport.internal.ui.webview.webcases;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.webkit.CookieManager;
import com.yandex.passport.R;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.entities.Cookie;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.jl40;

/* loaded from: classes2.dex */
public abstract class l {
    public static boolean a(Uri uri, Uri uri2) {
        return jl40.l(uri2.getHost(), uri.getHost()) && jl40.l(uri2.getPath(), uri.getPath());
    }

    public static void b(WebViewActivity webViewActivity, Environment environment, Uri uri) {
        String str;
        String uri2 = uri.toString();
        CookieManager.getInstance().flush();
        String cookie = CookieManager.getInstance().getCookie(uri2);
        Cookie cookie2 = null;
        if (cookie != null) {
            String[] split = cookie.split(";");
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    str = null;
                    break;
                }
                String[] split2 = split[i].split("=", 2);
                if (split2.length == 2 && split2[0].trim().equalsIgnoreCase("Session_id")) {
                    str = split2[1];
                    break;
                }
                i++;
            }
            if (str != null) {
                com.yandex.passport.internal.entities.d dVar = Cookie.Companion;
                PassportEnvironmentImpl y = com.yandex.passport.internal.util.p.y(environment);
                dVar.getClass();
                cookie2 = new Cookie(PassportEnvironmentImpl.from(y), null, null, uri2, cookie);
            }
        }
        if (cookie2 != null) {
            Intent intent = new Intent();
            intent.putExtra(WebViewActivity.KEY_WEBVIEW_RESULT, cookie2);
            webViewActivity.setResult(-1, intent);
        } else {
            webViewActivity.setResult(0);
        }
        webViewActivity.finish();
    }

    public byte[] c() {
        throw new UnsupportedOperationException("Not implemented");
    }

    public abstract Uri d();

    public boolean e() {
        return true;
    }

    public abstract String f();

    public String g(Resources resources) {
        return resources.getString(R.string.passport_logging_in_proggress);
    }

    public boolean h(WebViewActivity webViewActivity, int i) {
        return false;
    }

    public abstract void i(WebViewActivity webViewActivity, Uri uri);

    public boolean j(WebViewActivity webViewActivity, Uri uri) {
        i(webViewActivity, uri);
        return a(uri, d());
    }
}
