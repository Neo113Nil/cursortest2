package com.yandex.messaging.core.net.entities.directives;

import com.squareup.moshi.Json;
import defpackage.cex;
import defpackage.oyr;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public class OpenBotDirective extends Directive {

    @cex
    @Json(name = "bot_id")
    public String botId;

    public OpenBotDirective() {
        super("open_bot");
    }

    @Override // com.yandex.messaging.core.net.entities.directives.Directive
    public final String a() {
        return oyr.t(new StringBuilder("open_bot(botId="), this.botId, Extension.C_BRAKE);
    }
}
