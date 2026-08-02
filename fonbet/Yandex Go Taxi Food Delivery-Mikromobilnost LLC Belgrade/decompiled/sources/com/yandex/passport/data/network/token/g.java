package com.yandex.passport.data.network.token;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.network.BackendError;
import com.yandex.passport.data.exceptions.TokenResponseException;
import defpackage.w511;

/* loaded from: classes8.dex */
public final class g implements com.yandex.passport.data.network.core.e {
    @Override // com.yandex.passport.data.network.core.e
    public final Object a(Object obj, com.yandex.passport.common.network.j jVar) {
        if (jVar instanceof com.yandex.passport.common.network.i) {
            com.yandex.passport.common.account.b bVar = MasterToken.Companion;
            String a = ((f) ((com.yandex.passport.common.network.i) jVar).a).a();
            bVar.getClass();
            return com.yandex.passport.common.account.b.a(a);
        }
        if (!(jVar instanceof com.yandex.passport.common.network.g)) {
            w511.b();
            return null;
        }
        com.yandex.passport.common.network.g0 g0Var = (com.yandex.passport.common.network.g0) ((com.yandex.passport.common.network.g) jVar).a;
        if (g0Var.c() != BackendError.BAD_VERIFICATION_CODE) {
            com.yandex.passport.internal.ui.c.z(g0Var.c());
            throw null;
        }
        String g0Var2 = g0Var.toString();
        String b = g0Var.b();
        if (b == null) {
            b = "";
        }
        throw new TokenResponseException(g0Var2, b);
    }
}
