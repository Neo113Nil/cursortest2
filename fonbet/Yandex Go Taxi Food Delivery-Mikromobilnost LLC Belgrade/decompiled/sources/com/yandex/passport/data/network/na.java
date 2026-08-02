package com.yandex.passport.data.network;

import com.yandex.passport.common.core.JwtToken;
import defpackage.w511;

/* loaded from: classes15.dex */
public final class na implements com.yandex.passport.data.network.core.e {
    @Override // com.yandex.passport.data.network.core.e
    public final Object a(Object obj, com.yandex.passport.common.network.j jVar) {
        if (jVar instanceof com.yandex.passport.common.network.i) {
            return new JwtToken(((ma) ((com.yandex.passport.common.network.i) jVar).a).a);
        }
        if (jVar instanceof com.yandex.passport.common.network.g) {
            com.yandex.passport.data.exceptions.a.a(((com.yandex.passport.common.network.j0) ((com.yandex.passport.common.network.g) jVar).a).a);
            throw null;
        }
        w511.b();
        return null;
    }
}
