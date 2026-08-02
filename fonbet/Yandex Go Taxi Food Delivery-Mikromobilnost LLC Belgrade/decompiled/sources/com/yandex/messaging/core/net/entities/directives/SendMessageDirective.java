package com.yandex.messaging.core.net.entities.directives;

import com.squareup.moshi.Json;
import defpackage.cex;
import defpackage.oyr;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public class SendMessageDirective extends Directive {

    @Json(name = "callback_data")
    public Object callbackData;

    @cex
    @Json(name = "text")
    public String text;

    public SendMessageDirective() {
        super("send_message");
    }

    @Override // com.yandex.messaging.core.net.entities.directives.Directive
    public final String a() {
        return oyr.t(new StringBuilder("send_message(text="), this.text, Extension.C_BRAKE);
    }
}
