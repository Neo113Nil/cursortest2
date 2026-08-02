package com.yandex.passport.internal.ui.webview.webcases;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.SocialConfiguration;
import com.yandex.passport.internal.entities.Cookie;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.ny61;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes2.dex */
public final class c extends l {
    public final Environment a;
    public final com.yandex.passport.internal.network.client.c b;
    public final SocialConfiguration c;

    public c(o oVar) {
        Environment environment = oVar.c;
        com.yandex.passport.internal.network.client.c cVar = oVar.b;
        Bundle bundle = oVar.d;
        this.a = environment;
        this.b = cVar;
        SocialConfiguration socialConfiguration = (SocialConfiguration) bundle.getParcelable("social-provider");
        if (socialConfiguration != null) {
            this.c = socialConfiguration;
        } else {
            ny61.r("social-provider is missing");
            throw null;
        }
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final Uri d() {
        return this.b.b(this.a).d();
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final String f() {
        com.yandex.passport.internal.network.client.e b = this.b.b(this.a);
        SocialConfiguration socialConfiguration = this.c;
        return b.b(socialConfiguration.getProviderCodeOld(), d().toString(), socialConfiguration.getScope(), socialConfiguration.getExtraQueryParams());
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final void i(WebViewActivity webViewActivity, Uri uri) {
        if (l.a(uri, d())) {
            if (TextUtils.equals(uri.getQueryParameter(ACSPConstants.STATUS), WriteBlocks.OK)) {
                Cookie cookie = new Cookie(com.yandex.passport.internal.util.p.y(this.a), null, null, uri.toString(), null, 22, null);
                Intent intent = new Intent();
                intent.putExtra(WebViewActivity.KEY_WEBVIEW_RESULT, cookie);
                webViewActivity.setResult(-1, intent);
            } else {
                webViewActivity.setResult(0);
            }
            webViewActivity.finish();
        }
    }
}
