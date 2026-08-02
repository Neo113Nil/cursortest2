package com.yandex.messaging.core.net.entities.directives;

import com.squareup.moshi.Json;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.cex;
import defpackage.oyr;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public class OpenUriDirective extends Directive {

    @cex
    @Json(name = LaunchBrowserActivity.KEY_URI)
    public String uri;

    public OpenUriDirective() {
        super("open_uri");
    }

    @Override // com.yandex.messaging.core.net.entities.directives.Directive
    public final String a() {
        return oyr.t(new StringBuilder("open_uri(uri="), this.uri, Extension.C_BRAKE);
    }
}
