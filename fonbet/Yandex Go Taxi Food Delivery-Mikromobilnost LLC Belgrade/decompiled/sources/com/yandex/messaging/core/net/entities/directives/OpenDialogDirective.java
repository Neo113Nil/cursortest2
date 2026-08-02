package com.yandex.messaging.core.net.entities.directives;

import com.squareup.moshi.Json;
import defpackage.cex;
import defpackage.oyr;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public class OpenDialogDirective extends Directive {

    @cex
    @Json(name = "dialog_id")
    public String dialogId;

    public OpenDialogDirective() {
        super("open_dialog");
    }

    @Override // com.yandex.messaging.core.net.entities.directives.Directive
    public final String a() {
        return oyr.t(new StringBuilder("open_dialog(dialogId="), this.dialogId, Extension.C_BRAKE);
    }
}
