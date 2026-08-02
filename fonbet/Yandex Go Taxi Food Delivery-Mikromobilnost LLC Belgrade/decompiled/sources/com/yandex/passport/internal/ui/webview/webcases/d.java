package com.yandex.passport.internal.ui.webview.webcases;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.SocialConfiguration;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.ny61;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes2.dex */
public final class d extends l {
    public final Environment a;
    public final com.yandex.passport.internal.network.client.c b;
    public final SocialConfiguration c;
    public final String d;
    public final String e;

    public d(o oVar) {
        Environment environment = oVar.c;
        com.yandex.passport.internal.network.client.c cVar = oVar.b;
        Bundle bundle = oVar.d;
        this.a = environment;
        this.b = cVar;
        SocialConfiguration socialConfiguration = (SocialConfiguration) bundle.getParcelable("social-provider");
        if (socialConfiguration == null) {
            ny61.r("social-provider is missing");
            throw null;
        }
        this.c = socialConfiguration;
        String string = bundle.getString("social-token");
        if (string == null) {
            ny61.r("social-token is missing");
            throw null;
        }
        this.d = string;
        String string2 = bundle.getString("application-client-id");
        if (string2 != null) {
            this.e = string2;
        } else {
            ny61.r("application-client-id is missing");
            throw null;
        }
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final byte[] c() {
        try {
            return this.b.b(this.a).c(this.d);
        } catch (Exception e) {
            ny61.j(e);
            return null;
        }
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final Uri d() {
        return this.b.b(this.a).d();
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final String f() {
        com.yandex.passport.internal.network.client.e b = this.b.b(this.a);
        String providerCodeOld = this.c.getProviderCodeOld();
        Uri.Builder appendQueryParameter = Uri.parse(b.a()).buildUpon().appendEncodedPath("auth/social/native_start").appendQueryParameter("consumer", ((com.yandex.passport.internal.common.e) b.f).a()).appendQueryParameter("provider", providerCodeOld).appendQueryParameter(ClidProvider.APPLICATION, this.e).appendQueryParameter("retpath", d().toString()).appendQueryParameter("place", "query").appendQueryParameter("display", "touch");
        String d = b.e.d();
        if (d != null) {
            appendQueryParameter.appendQueryParameter(MetaDataField.DEVICE_ID_FIELD, d);
        }
        return appendQueryParameter.toString();
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final void i(WebViewActivity webViewActivity, Uri uri) {
        if (l.a(uri, d())) {
            String queryParameter = uri.getQueryParameter("x_token");
            if (queryParameter == null || queryParameter.length() == 0) {
                webViewActivity.setResult(0);
            } else {
                Intent intent = new Intent();
                intent.putExtra("master-token", queryParameter);
                webViewActivity.setResult(-1, intent);
            }
            webViewActivity.finish();
        }
    }
}
