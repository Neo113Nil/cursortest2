package com.yandex.messaging.core.net.entities.directives;

import com.squareup.moshi.Json;
import defpackage.cex;
import defpackage.oyr;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public class CallPhoneDirective extends Directive {

    @cex
    @Json(name = "phone")
    public String phone;

    public CallPhoneDirective() {
        super("call_phone");
    }

    @Override // com.yandex.messaging.core.net.entities.directives.Directive
    public final String a() {
        return oyr.t(new StringBuilder("call_phone(phone="), this.phone, Extension.C_BRAKE);
    }
}
