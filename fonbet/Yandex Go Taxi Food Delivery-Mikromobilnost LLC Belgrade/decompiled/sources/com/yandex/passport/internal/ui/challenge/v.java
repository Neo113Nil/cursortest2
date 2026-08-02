package com.yandex.passport.internal.ui.challenge;

import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.jl40;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes2.dex */
public final class v extends com.yandex.passport.internal.ui.common.web.a {
    public final String c;
    public final String d;
    public final boolean e = true;

    public v(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    @Override // com.yandex.passport.internal.ui.common.web.a
    public final Boolean a(String str) {
        return Boolean.valueOf(jl40.l(com.yandex.passport.common.url.b.i(str, ACSPConstants.STATUS), WriteBlocks.OK) || com.yandex.passport.common.url.b.i(str, ACSPConstants.STATUS) == null);
    }

    public final String e() {
        return this.c;
    }
}
