package com.yandex.passport.data.network.token;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.network.BackendError;
import com.yandex.passport.data.exceptions.TokenResponseException;
import defpackage.w511;
import defpackage.yhl;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class s implements com.yandex.passport.data.network.core.e {
    @Override // com.yandex.passport.data.network.core.e
    public final Object a(Object obj, com.yandex.passport.common.network.j jVar) {
        if (jVar instanceof com.yandex.passport.common.network.i) {
            com.yandex.passport.common.account.b bVar = MasterToken.Companion;
            String b = ((r) ((com.yandex.passport.common.network.i) jVar).a).b();
            bVar.getClass();
            return com.yandex.passport.common.account.b.a(b);
        }
        if (!(jVar instanceof com.yandex.passport.common.network.g)) {
            w511.b();
            return null;
        }
        com.yandex.passport.common.network.a0 a0Var = (com.yandex.passport.common.network.a0) ((com.yandex.passport.common.network.g) jVar).a;
        List<BackendError> b2 = a0Var.getB();
        if (!(b2 instanceof Collection) || !b2.isEmpty()) {
            for (BackendError backendError : b2) {
                if (backendError == BackendError.INVALID_GRANT || backendError == BackendError.SESSIONID_INVALID) {
                    String obj2 = a0Var.getB().toString();
                    String c = a0Var.getC();
                    if (c == null) {
                        c = "";
                    }
                    throw new TokenResponseException(obj2, c);
                }
            }
        }
        BackendError a = a0Var.getA();
        if (a != null) {
            com.yandex.passport.internal.ui.c.z(a);
            throw null;
        }
        List b3 = a0Var.getB();
        Iterator it = b3.iterator();
        if (!it.hasNext()) {
            yhl.d(b3, "Internal error: Can't throw exception for error list ");
            return null;
        }
        BackendError backendError2 = (BackendError) it.next();
        com.yandex.passport.common.network.b bVar2 = BackendError.Companion;
        com.yandex.passport.internal.ui.c.z(backendError2);
        throw null;
    }
}
