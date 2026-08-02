package com.yandex.passport.data.network.core;

import com.yandex.passport.common.network.BackendError;
import com.yandex.passport.common.network.x;
import defpackage.w511;
import defpackage.yhl;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class j implements e {
    @Override // com.yandex.passport.data.network.core.e
    public final Object a(Object obj, com.yandex.passport.common.network.j jVar) {
        if (jVar instanceof com.yandex.passport.common.network.i) {
            return ((com.yandex.passport.common.network.i) jVar).a;
        }
        if (!(jVar instanceof com.yandex.passport.common.network.g)) {
            w511.b();
            return null;
        }
        List list = ((x) ((com.yandex.passport.common.network.g) jVar).a).a;
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
