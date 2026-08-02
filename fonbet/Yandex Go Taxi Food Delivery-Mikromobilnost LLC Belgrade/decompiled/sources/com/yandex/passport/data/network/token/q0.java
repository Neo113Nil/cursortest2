package com.yandex.passport.data.network.token;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.data.exceptions.FailedResponseException;
import defpackage.w511;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes15.dex */
public final class q0 implements com.yandex.passport.data.network.core.e {
    @Override // com.yandex.passport.data.network.core.e
    public final Object a(Object obj, com.yandex.passport.common.network.j jVar) {
        if (jVar instanceof com.yandex.passport.common.network.i) {
            com.yandex.passport.common.account.b bVar = MasterToken.Companion;
            String str = ((p0) ((com.yandex.passport.common.network.i) jVar).a).b;
            bVar.getClass();
            return com.yandex.passport.common.account.b.a(str);
        }
        if (!(jVar instanceof com.yandex.passport.common.network.g)) {
            w511.b();
            return null;
        }
        com.yandex.passport.common.network.d0 d0Var = (com.yandex.passport.common.network.d0) ((com.yandex.passport.common.network.g) jVar).a;
        throw new FailedResponseException(d0Var.b + HexString.CHAR_SPACE + d0Var.c);
    }
}
