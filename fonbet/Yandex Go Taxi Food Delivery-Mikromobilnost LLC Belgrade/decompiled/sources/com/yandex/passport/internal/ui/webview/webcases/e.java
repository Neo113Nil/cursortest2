package com.yandex.passport.internal.ui.webview.webcases;

import android.net.Uri;
import android.os.Bundle;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.SocialConfiguration;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.jl40;
import defpackage.ny61;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes2.dex */
public final class e extends l {
    public final Environment a;
    public final com.yandex.passport.internal.network.client.c b;
    public final SocialConfiguration c;
    public final String d;
    public final String e;
    public final MasterToken f;

    public e(o oVar) {
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
        String string2 = bundle.getString("application-id");
        if (string2 == null) {
            ny61.r("application-id is missing");
            throw null;
        }
        this.e = string2;
        com.yandex.passport.common.account.b bVar = MasterToken.Companion;
        String string3 = bundle.getString("master-token");
        bVar.getClass();
        this.f = com.yandex.passport.common.account.b.a(string3);
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final Uri d() {
        return this.b.b(this.a).d();
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final String f() {
        com.yandex.passport.internal.network.client.e b = this.b.b(this.a);
        Uri d = d();
        String providerCodeOld = this.c.getProviderCodeOld();
        return Uri.parse(b.e()).buildUpon().appendEncodedPath("broker2/bind_by_token").appendQueryParameter("consumer", ((com.yandex.passport.internal.common.e) b.f).a()).appendQueryParameter(ClidProvider.APPLICATION, this.e).appendQueryParameter("retpath", d.toString()).appendQueryParameter("provider", providerCodeOld).appendQueryParameter("provider_token", this.d).appendQueryParameter(AuthSdkActivity.RESPONSE_TYPE_TOKEN, this.f.getValue()).appendQueryParameter("place", "query").appendQueryParameter("display", "touch").appendQueryParameter("passthrough_errors", "UserDeniedError").toString();
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final void i(WebViewActivity webViewActivity, Uri uri) {
        if (l.a(uri, d())) {
            webViewActivity.setResult(jl40.l(uri.getQueryParameter(ACSPConstants.STATUS), WriteBlocks.OK) ? -1 : 0);
            webViewActivity.finish();
        }
    }
}
