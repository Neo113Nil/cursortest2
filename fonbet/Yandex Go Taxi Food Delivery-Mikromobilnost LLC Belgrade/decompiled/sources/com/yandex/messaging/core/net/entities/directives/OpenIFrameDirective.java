package com.yandex.messaging.core.net.entities.directives;

import com.squareup.moshi.Json;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.cex;
import defpackage.oyr;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public class OpenIFrameDirective extends Directive {

    @cex
    @Json(name = "title")
    public String title;

    @cex
    @Json(name = LaunchBrowserActivity.KEY_URI)
    public String uri;

    public OpenIFrameDirective() {
        super("open_iframe");
    }

    @Override // com.yandex.messaging.core.net.entities.directives.Directive
    public final String a() {
        StringBuilder sb = new StringBuilder("open_iframe(uri=");
        sb.append(this.uri);
        sb.append(", title=");
        return oyr.t(sb, this.title, Extension.C_BRAKE);
    }
}
