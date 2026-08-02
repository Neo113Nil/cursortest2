package com.yandex.passport.data.network;

import com.yandex.passport.common.network.BackendError;
import com.yandex.passport.data.models.PhoneConfirmationResult;
import defpackage.w511;
import defpackage.yhl;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes15.dex */
public final class cc implements com.yandex.passport.data.network.core.e {
    @Override // com.yandex.passport.data.network.core.e
    public final Object a(Object obj, com.yandex.passport.common.network.j jVar) {
        if (jVar instanceof com.yandex.passport.common.network.i) {
            bc bcVar = (bc) ((com.yandex.passport.common.network.i) jVar).a;
            return new PhoneConfirmationResult.CodePhoneConfirmationResult(TimeUnit.SECONDS.toMillis(bcVar.b), bcVar.c, bcVar.d);
        }
        if (!(jVar instanceof com.yandex.passport.common.network.g)) {
            w511.b();
            return null;
        }
        com.yandex.passport.common.network.x xVar = (com.yandex.passport.common.network.x) ((com.yandex.passport.common.network.g) jVar).a;
        if (BackendError.PHONE_NUMBER_ALREADY_CONFIRMED_ERROR == ((BackendError) kotlin.collections.a.P(xVar.a))) {
            return new PhoneConfirmationResult.ConfirmedPhoneConfirmationResult();
        }
        List list = xVar.a;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            com.yandex.passport.internal.ui.c.z((BackendError) it.next());
            throw null;
        }
        yhl.d(list, "Internal error: Can't throw exception for error list ");
        return null;
    }
}
