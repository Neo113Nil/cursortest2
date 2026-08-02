package com.yandex.messaging.core.net.entities.directives;

import com.squareup.moshi.Json;
import defpackage.cex;
import defpackage.oyr;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes15.dex */
public class SetElementsStateDirective extends Directive {

    @cex
    @Json(name = "ids")
    public List<String> ids;

    @cex
    @Json(name = ClidProvider.STATE)
    public String state;

    @Json(name = "timeout_seconds")
    public int timeoutSeconds;

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public SetElementsStateDirective() {
        super("set_elements_state");
    }

    @Override // com.yandex.messaging.core.net.entities.directives.Directive
    public final String a() {
        StringBuilder sb = new StringBuilder("set_elements_state(ids=");
        sb.append(this.ids);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", timeoutSeconds=");
        return oyr.m(this.timeoutSeconds, Extension.C_BRAKE, sb);
    }
}
