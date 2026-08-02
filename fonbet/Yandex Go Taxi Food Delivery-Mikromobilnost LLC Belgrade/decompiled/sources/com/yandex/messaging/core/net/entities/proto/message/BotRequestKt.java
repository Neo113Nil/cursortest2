package com.yandex.messaging.core.net.entities.proto.message;

import com.yandex.messaging.core.net.entities.proto.message.BotRequest;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"messaging-core-net_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BotRequestKt {
    public static final String a(BotRequest.Error error) {
        return error.getInvalidDirectivePayload() != null ? oyr.p("InvalidDirectivePayload(name=", error.getInvalidDirectivePayload().getName(), Extension.C_BRAKE) : error.getUnsupportedDirective() != null ? oyr.p("UnsupportedDirective(name=", error.getUnsupportedDirective().getName(), Extension.C_BRAKE) : error.getClientError() != null ? oyr.p("ClientError(message=", error.getClientError().getMessage(), Extension.C_BRAKE) : "UnknownError";
    }
}
