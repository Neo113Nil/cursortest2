package com.yandex.passport.data.network;

import com.yandex.passport.common.network.BackendError;
import defpackage.w511;
import defpackage.yhl;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public final class je implements com.yandex.passport.data.network.core.e {
    @Override // com.yandex.passport.data.network.core.e
    public final Object a(Object obj, com.yandex.passport.common.network.j jVar) {
        if (jVar instanceof com.yandex.passport.common.network.i) {
            ie ieVar = (ie) ((com.yandex.passport.common.network.i) jVar).a;
            return new com.yandex.passport.data.models.l(ieVar.b.a, ieVar.c, ieVar.d);
        }
        if (!(jVar instanceof com.yandex.passport.common.network.g)) {
            w511.b();
            return null;
        }
        List list = ((com.yandex.passport.common.network.x) ((com.yandex.passport.common.network.g) jVar).a).a;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            yhl.d(list, "Internal error: Can't throw exception for error list ");
            return null;
        }
        BackendError backendError = (BackendError) it.next();
        com.yandex.passport.common.network.b bVar = BackendError.Companion;
        com.yandex.passport.internal.ui.c.z(backendError);
        throw null;
    }
}
