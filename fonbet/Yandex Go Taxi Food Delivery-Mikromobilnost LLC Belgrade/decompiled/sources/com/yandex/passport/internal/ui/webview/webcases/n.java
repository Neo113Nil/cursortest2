package com.yandex.passport.internal.ui.webview.webcases;

import android.os.Bundle;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.tls;
import defpackage.w511;

/* loaded from: classes2.dex */
public final class n {
    public final com.yandex.passport.internal.network.client.c a;

    public n(com.yandex.passport.internal.network.client.c cVar) {
        this.a = cVar;
    }

    public final l a(WebViewActivity webViewActivity, Environment environment, WebCaseType webCaseType, Bundle bundle) {
        tls tlsVar;
        switch (m.a[webCaseType.ordinal()]) {
            case 1:
                tlsVar = WebCaseFactory$resolveWebCaseCreator$1.b;
                break;
            case 2:
                tlsVar = WebCaseFactory$resolveWebCaseCreator$2.b;
                break;
            case 3:
                tlsVar = WebCaseFactory$resolveWebCaseCreator$3.b;
                break;
            case 4:
                tlsVar = WebCaseFactory$resolveWebCaseCreator$4.b;
                break;
            case 5:
                tlsVar = WebCaseFactory$resolveWebCaseCreator$5.b;
                break;
            case 6:
                tlsVar = WebCaseFactory$resolveWebCaseCreator$6.b;
                break;
            case 7:
                tlsVar = WebCaseFactory$resolveWebCaseCreator$7.b;
                break;
            case 8:
                tlsVar = WebCaseFactory$resolveWebCaseCreator$8.b;
                break;
            case 9:
                tlsVar = WebCaseFactory$resolveWebCaseCreator$9.b;
                break;
            case 10:
                tlsVar = WebCaseFactory$resolveWebCaseCreator$10.b;
                break;
            case 11:
                tlsVar = WebCaseFactory$resolveWebCaseCreator$11.b;
                break;
            case 12:
                tlsVar = WebCaseFactory$resolveWebCaseCreator$12.b;
                break;
            default:
                w511.b();
                return null;
        }
        return (l) tlsVar.invoke(new o(webViewActivity, this.a, environment, bundle));
    }
}
