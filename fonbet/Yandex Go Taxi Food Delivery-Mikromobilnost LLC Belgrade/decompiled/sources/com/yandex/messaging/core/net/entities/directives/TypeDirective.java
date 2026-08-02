package com.yandex.messaging.core.net.entities.directives;

import com.squareup.moshi.Json;
import defpackage.cex;
import defpackage.oyr;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public class TypeDirective extends Directive {

    @cex
    @Json(name = "text")
    public String text;

    public TypeDirective() {
        super("type");
    }

    @Override // com.yandex.messaging.core.net.entities.directives.Directive
    public final String a() {
        return oyr.t(new StringBuilder("type(text="), this.text, Extension.C_BRAKE);
    }
}
