package com.yandex.passport.data.network.token;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.network.BackendError;
import com.yandex.passport.data.exceptions.TokenResponseException;
import defpackage.w511;

/* loaded from: classes8.dex */
public final class e0 implements com.yandex.passport.data.network.core.e {
    @Override // com.yandex.passport.data.network.core.e
    public final Object a(Object obj, com.yandex.passport.common.network.j jVar) {
        if (jVar instanceof com.yandex.passport.common.network.i) {
            com.yandex.passport.common.account.b bVar = MasterToken.Companion;
            String b = ((d0) ((com.yandex.passport.common.network.i) jVar).a).b();
            bVar.getClass();
            return com.yandex.passport.common.account.b.a(b);
        }
        if (!(jVar instanceof com.yandex.passport.common.network.g)) {
            w511.b();
            return null;
        }
        com.yandex.passport.common.network.g0 g0Var = (com.yandex.passport.common.network.g0) ((com.yandex.passport.common.network.g) jVar).a;
        if (g0Var.c() != BackendError.INVALID_GRANT) {
            com.yandex.passport.internal.ui.c.z(g0Var.c());
            throw null;
        }
        String backendError = g0Var.c().toString();
        String b2 = g0Var.b();
        if (b2 == null) {
            b2 = "";
        }
        throw new TokenResponseException(backendError, b2);
    }
}
