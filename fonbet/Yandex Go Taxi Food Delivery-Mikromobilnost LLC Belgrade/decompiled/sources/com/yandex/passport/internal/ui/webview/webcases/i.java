package com.yandex.passport.internal.ui.webview.webcases;

import android.net.Uri;
import android.os.Bundle;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.SocialConfiguration;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.ny61;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes2.dex */
public final class i extends l {
    public final Environment a;
    public final com.yandex.passport.internal.network.client.c b;
    public final SocialConfiguration c;
    public final String d;

    public i(o oVar) {
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
        this.d = bundle.getString("native-application", null);
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final Uri d() {
        return this.b.b(this.a).d();
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final String f() {
        com.yandex.passport.internal.network.client.e b = this.b.b(this.a);
        Uri.Builder appendQueryParameter = Uri.parse(b.a()).buildUpon().appendEncodedPath("auth/social/start").appendQueryParameter("consumer", ((com.yandex.passport.internal.common.e) b.f).a()).appendQueryParameter("provider", this.c.getProviderCodeOld()).appendQueryParameter("retpath", d().toString()).appendQueryParameter("place", "query").appendQueryParameter("display", "touch").appendQueryParameter("passthrough_errors", "UserDeniedError");
        String str = this.d;
        if (str != null) {
            appendQueryParameter.appendQueryParameter(ClidProvider.APPLICATION, str);
        }
        return appendQueryParameter.toString();
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final void i(WebViewActivity webViewActivity, Uri uri) {
        if (l.a(uri, d())) {
            l.b(webViewActivity, this.a, uri);
        }
    }
}
