package com.yandex.messaging.core.net.entities.directives;

import defpackage.oyr;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public class ServerDirective extends Directive {
    public final String b;

    public ServerDirective(String str, String str2) {
        super(str);
        this.b = str2;
    }

    @Override // com.yandex.messaging.core.net.entities.directives.Directive
    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("(payload=");
        return oyr.t(sb, this.b, Extension.C_BRAKE);
    }
}
