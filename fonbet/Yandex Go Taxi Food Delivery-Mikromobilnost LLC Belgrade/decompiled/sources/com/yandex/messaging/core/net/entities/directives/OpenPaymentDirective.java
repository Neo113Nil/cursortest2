package com.yandex.messaging.core.net.entities.directives;

import com.squareup.moshi.Json;
import defpackage.cex;
import defpackage.oyr;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public class OpenPaymentDirective extends Directive {

    @cex
    @Json(name = "transaction_id")
    public String transactionId;

    public OpenPaymentDirective() {
        super("open_payment");
    }

    @Override // com.yandex.messaging.core.net.entities.directives.Directive
    public final String a() {
        return oyr.t(new StringBuilder("open_payment(transactionId="), this.transactionId, Extension.C_BRAKE);
    }
}
