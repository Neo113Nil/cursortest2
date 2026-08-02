package com.yandex.passport.internal.ui.webview.webcases;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.R;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.evu0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* loaded from: classes2.dex */
public final class g extends l {
    public final Environment a;
    public final com.yandex.passport.internal.network.client.c b;
    public final Bundle c;

    public g(o oVar) {
        Environment environment = oVar.c;
        com.yandex.passport.internal.network.client.c cVar = oVar.b;
        Bundle bundle = oVar.d;
        oVar.a.getPackageName();
        this.a = environment;
        this.b = cVar;
        this.c = bundle;
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final Uri d() {
        return this.b.b(this.a).d();
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final String f() {
        com.yandex.passport.internal.network.client.e b = this.b.b(this.a);
        String string = this.c.getString("key-login");
        Uri d = d();
        Uri.Builder appendEncodedPath = Uri.parse(b.a()).buildUpon().appendEncodedPath("restoration");
        com.yandex.passport.internal.common.e eVar = (com.yandex.passport.internal.common.e) b.f;
        Uri.Builder appendQueryParameter = appendEncodedPath.appendQueryParameter("gps_package_name", eVar.a()).appendQueryParameter(CommonUrlParts.APP_ID, eVar.a()).appendQueryParameter("retpath", d.toString());
        if (string != null && !evu0.J(string)) {
            appendQueryParameter.appendQueryParameter(LegacyAccountType.STRING_LOGIN, string);
        }
        return appendQueryParameter.toString();
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final String g(Resources resources) {
        return resources.getString(R.string.passport_restore_password_title);
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final void i(WebViewActivity webViewActivity, Uri uri) {
        if (l.a(uri, d())) {
            l.b(webViewActivity, this.a, uri);
        }
    }
}
