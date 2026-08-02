package com.yandex.passport.internal.ui.webview.webcases;

import android.net.Uri;
import android.os.Bundle;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.SocialConfiguration;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.jl40;
import defpackage.ny61;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes2.dex */
public final class j extends l {
    public final Environment a;
    public final com.yandex.passport.internal.network.client.c b;
    public final SocialConfiguration c;
    public final MasterToken d;

    public j(o oVar) {
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
        com.yandex.passport.common.account.b bVar = MasterToken.Companion;
        String string = bundle.getString("master-token");
        bVar.getClass();
        this.d = com.yandex.passport.common.account.b.a(string);
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final Uri d() {
        return this.b.b(this.a).d();
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final String f() {
        com.yandex.passport.internal.network.client.e b = this.b.b(this.a);
        String providerCodeOld = this.c.getProviderCodeOld();
        return Uri.parse(b.e()).buildUpon().appendEncodedPath("broker2/start").appendQueryParameter("bind", "1").appendQueryParameter("yandex_token", this.d.getValue()).appendQueryParameter("consumer", ((com.yandex.passport.internal.common.e) b.f).a()).appendQueryParameter("provider", providerCodeOld).appendQueryParameter("retpath", d().toString()).appendQueryParameter("place", "query").appendQueryParameter("display", "touch").appendQueryParameter("passthrough_errors", "UserDeniedError").toString();
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final void i(WebViewActivity webViewActivity, Uri uri) {
        if (l.a(uri, d())) {
            webViewActivity.setResult(jl40.l(uri.getQueryParameter(ACSPConstants.STATUS), WriteBlocks.OK) ? -1 : 0);
            webViewActivity.finish();
        }
    }
}
