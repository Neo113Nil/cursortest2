package com.yandex.messaging.core.net.entities.directives;

import defpackage.x4e;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public class SendBotRequestDirective extends Directive {
    public Object b;

    public SendBotRequestDirective() {
        super("send_bot_request");
    }

    @Override // com.yandex.messaging.core.net.entities.directives.Directive
    public final String a() {
        return x4e.h(new StringBuilder("send_bot_request(payload="), this.b, Extension.C_BRAKE);
    }
}
